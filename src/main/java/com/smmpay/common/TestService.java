package com.smmpay.common;


import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.smmpay.common.author.Authory;
import com.smmpay.common.request.RequestDataProxy;
import com.smmpay.inter.AuthorService;
import com.smmpay.inter.ChBuyPoolService;
import com.smmpay.inter.dto.ChBuyPoolDTO;
import com.smmpay.inter.smmpay.UserAccountService;


/**
 * Hello world!
 *
 */
public class TestService 
{
    public static void main( String[] args )
    {
   	    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"client-application.xml"});    
       /*ChBuyPoolService service = (ChBuyPoolService)context.getBean("chBuyPoolService");
	   // String desKey = "{\"data\":[{\"billCode\":\"3130005135467579\",\"resultCode\":\"100004\",\"resultContent\":\"已审核\",\"id\":\"1\",\"date\":\"3130005135467579\"}]}";
		ChBuyPoolDTO buy = service.getChBuyPoolByPrimary(1);
		System.out.println(buy.getCreatedby());*/
		
		 /*AuthorService authorService = (AuthorService) context.getBean("authorService");
		 String jsonStr = "{\"data\":[{\"userId\":\"58\",\"userName\":\"zengshihua@smm.cn\"}]}" ; 
		 if(Authory.token == null)
		  RequestDataProxy.getAccessToken(authorService); 
		 Map<String,String>  mapParam = RequestDataProxy.getRequestParam(jsonStr,"58zengshihua@smm.cn");
		 
		 UserAccountService u=(UserAccountService) context.getBean("userAccountService");
		 
		 u.getUserAccount(mapParam);*/
	
   }
    
}
