package com.smmpay.common.request;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import com.alibaba.fastjson.JSONObject;
import com.smmpay.common.author.AccessToken;
import com.smmpay.common.author.Authory;
import com.smmpay.common.encrypt.Base64;
import com.smmpay.common.encrypt.CertificateCoder;
import com.smmpay.common.encrypt.DesCrypt;
import com.smmpay.common.encrypt.MD5;
import com.smmpay.inter.AuthorService;

public class RequestDataProxy {

	static Logger  log = Logger.getLogger(RequestDataProxy.class);
	public static boolean getAccessToken(AuthorService authorService){
		Properties pro = null;
		try{
			pro = PropertiesLoaderUtils.loadAllProperties("key.properties");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		String key = pro.getProperty("secretKey_pre");
		String id = pro.getProperty("secretId_pre");
		Authory.secretKey = key;
		Authory.secretId = id;
		String json = authorService.getToken(key, id);
		//System.out.println(\"json:\"+json);
		JSONObject jsonToken = JSONObject.parseObject(json);
		if(jsonToken.get("isValid") != null && jsonToken.getString("isValid").equals("1")){
			Authory.token = new AccessToken(jsonToken.getString("accessToken"),jsonToken.getString("uuid"),
					jsonToken.getLong("expireTime"),jsonToken.getInteger("isValid"));
			return true;
		}
		return false;
	}
	
	public static Map<String,String> getRequestParam(String requestJsonStr,String signStr){
		try{
			//签名串
			//String signStr = \"3130005135467579\"+\"100004\"+\"已审核\"+\"3130005135467579\";
			//获得证书路径
			String filePath = "smm_pay_client.keystore";
			//得到签名
			String sign = CertificateCoder.sign(signStr.getBytes("utf-8"), filePath, "www.smm.cn", "smm_123");
			//key加密
			log.info("jsonStr"+requestJsonStr);
			byte[] jsonStr = DesCrypt.encryptMode(requestJsonStr.getBytes("utf-8"));
			log.info("jsonStrEncry"+requestJsonStr.getBytes("utf-8"));
			//得到DKey
			byte[] dKey = CertificateCoder.encryptByPrivateKey(DesCrypt.desStr.getBytes("utf-8"), filePath, "www.smm.cn", "smm_123");
			//加密后的字串
			//String encryptStr = Base64.encode(encryptByte);
			//得到MD5
			String MD5Str = MD5.md5(Base64.getBase64(dKey) + Base64.getBase64(jsonStr));
			Map<String,String> map = new LinkedHashMap<String,String>();
			
			if(Authory.token != null){
				//String token = Authory.token.getUserId() + Authory.token.getVeryfyStatus() + Authory.token.getExpireTime();
				map.put("dKey", Base64.getBase64(dKey));//请求服务
				map.put("sign", sign);
				map.put("MD5Str", MD5Str);
				map.put("jsonStr", Base64.getBase64(jsonStr));
				map.put("token", Authory.secretKey+"&"+Authory.secretId+"&"+Authory.token.getUuid()+"&"+Authory.token.getExpireTime());
			    return map;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
	
	public static void main(String args[]) throws Exception{
		String json = "{\"data\": [{\"userName\": \"zhangsan\",\"password\": \"111111a\",\"mallUserName\": \"zhangsan123\","
            +"\"certificateNo\": \"222\","
            +"\"certificateUrl\": \"http://172.16.24.95:8080/SMMPayClient/pay/images/banner1.jpg\","
            +"\"companyName\": \"111\","
            +"\"companyAddr\": \"333\","
            +"\"contactName\": \"zhangsan456\","
            +"\"phone\": \"567989876\","
            +"\"mobilePhone\": \"16578898765\","
           +" \"postCode\": \"410426\","
            +"\"bankType\": \"xx分行\","
            +"\"provinceName\": \"安徽\","
           +" \"cityName\": \"合肥\","
            +"\"bankName\": \"xx支行\","
           +" \"bankAccountNo\": \"1234\","
            +"\"idCardUrl\": \"http://172.16.24.95:8080/SMMPayClient/pay/images/banner1.jpg\","
           +" \"registerCertificateUrl\": \"http://172.16.24.95:8080/SMMPayClient/pay/images/banner1.jpg\","
           +" \"date\": \"1447134296212\"}]}";
		String sign = "zhangsan111111azhangsan123222http://172.16.24.95:8080/SMMPayClient/pay/images/banner1.jpg111333zhangsan45656798987616578898765410426xx分行安徽合肥xx支行1234http://172.16.24.95:8080/SMMPayClient/pay/images/banner1.jpghttp://172.16.24.95:8080/SMMPayClient/pay/images/banner1.jpg1447134296212";
		byte[] jsonStr = DesCrypt.encryptMode(json.getBytes("utf-8"));
		
		String str = Base64.getBase64(jsonStr);
		
		byte[] destr = Base64.getFromBase64(str);
		byte[] ss = DesCrypt.decryptMode(destr);
		
		System.out.println(new String(ss));
	}
}
