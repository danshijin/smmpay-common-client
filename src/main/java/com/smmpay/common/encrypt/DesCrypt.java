package com.smmpay.common.encrypt;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;


public class DesCrypt {

	//�?��义�?加密算法,可用
	private static final String Algorithm="DESede";
	public static String desStr = "tongbanjieyingchenku0001";
	public DesCrypt(){
		
	}
	/**
     *                                                   
     * @param keybyte  加密密钥，长度为24字节
     * @param src     字节数组(根据给定的字节数组构造一个密钥�? )
     * @return
     */
    public static byte[] encryptMode( byte[] src) {
        try {
            // 根据给定的字节数组和算法构�?�?��密钥
            SecretKey deskey = new SecretKeySpec(desStr.getBytes("utf-8"), Algorithm);
            // 加密
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.ENCRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }
 
    /**
     * 
     * @param keybyte 密钥
     * @param src       �?��解密的数�?
     * @return
     */
    public static byte[] decryptMode(byte[] src) {
        try {
            // 生成密钥
            SecretKey deskey = new SecretKeySpec(desStr.getBytes("utf-8"), Algorithm);
            // 解密
            Cipher c1 = Cipher.getInstance(Algorithm);
            c1.init(Cipher.DECRYPT_MODE, deskey);
            return c1.doFinal(src);
        } catch (java.security.NoSuchAlgorithmException e1) {
            e1.printStackTrace();
        } catch (javax.crypto.NoSuchPaddingException e2) {
            e2.printStackTrace();
        } catch (java.lang.Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }
 
    
    public static void main(String args[]) throws Exception{
//		byte[] by = DesCrypt.encryptMode("{\"data\":[{\"billCode\":\"3130005135467579\",\"resultCode\":\"100004\",\"resultContent\":\"已审核\"}]}".getBytes());
//		String base64 =Base64.getBase64(by);
//		System.out.println(base64);
//		//System.out.println(URLEncoder.encode(base64));
//		byte[] base642 =Base64.getFromBase64("acWo2KTV7qJxBlfPZpWB+6nUzOsRtL2++rN32YwS9hfQqLLeHd2FM/T9y211JmH5TFsMIgpuZTR2kMx5xAeJwDXryrIXBXZv4b8A2ewkcRXgzBOj7H8KynMMHZecucD/");
//		byte[] by2 = DesCrypt.decrypt(base642);
//		//System.out.println(new String(by2));
//		
//		//String str = "acWo2KTV7qJxBlfPZpWB+6nUzOsRtL2++rN32YwS9hfQqLLeHd2FM/T9y211JmH5TFsMIgpuZTR2kMx5xAeJwDXryrIXBXZv4b8A2ewkcRXgzBOj7H8KynMMHZecucD/";
//		System.out.println(MD5.md5("acWo2KTV7qJxBlfPZpWB+6nUzOsRtL2++rN32YwS9hfQqLLeHd2FM/T9y211JmH5TFsMIgpuZTR2kMx5xAeJwDXryrIXBXZv4b8A2ewkcRXgzBOj7H8KynMMHZecucD/"));
//		System.out.println(MD5.md5(base64));
    	String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCttD6JZe2D5ZQg+OWo6usSwboncR3dWRQlfseV+hFSTrVqHLJ/7Q1FXQYuQmRYxKUdJcmKt5sqseYsPK/Vz1yI6PMaNXfNyTrlgYGQcuILAHRlcOp9QWGIBiWCj2/aiqVPmj8CkrQXdGkSde0OyA2pTrzlpcf4SrGR+eNAAiSZNwIDAQAB";
    	String privateKey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAK20Poll7YPllCD45ajq6xLBuidxHd1ZFCV+x5X6EVJOtWocsn/tDUVdBi5CZFjEpR0lyYq3myqx5iw8r9XPXIjo8xo1d83JOuWBgZBy4gsAdGVw6n1BYYgGJYKPb9qKpU+aPwKStBd0aRJ17Q7IDalOvOWlx/hKsZH540ACJJk3AgMBAAECgYAG4h6cSTq5QE63Y8WOBQkdrCmZSIU7cT04Iyb7jXZEQbQ0qUB1i0o8VmxZRu49CkXUutuasJ3oejY5yInbOiVbgsNY5Bw6ocwDhlIe2msqCiw4ZliW9VvjJx7trWSdigOsYmAZ9szUymQ6cRvPTCDaua20hMk4sPENHLGk8PQwmQJBAOSKP37A/zcjGzmSv/hdh8wivftyCZxXYTnzMsXdAZtd6GmiK62pzbhgR4+c72mOO45K5wWxA5jOBTqbjrLdSGMCQQDCk0abyowg3WbiVjPjTSqmisV375lncf/cDyPjxAsMI/mq/sowLLssNg4YRA5rl+PK2hIYR08rwNiTop1v5OIdAkEArdqZaNRqkcgsCsUfMlH8XwdC3QgoVX2HYe0m/6wbb9SlW85ZSdf1vj/H0HFDE1p25c0HJ6Y8JT78bVQu3tRFHwJBAIQnQ23MxCAOQDK6GcPoRW+YEUbElYyNARqVreqk3FwCkzBwnSLbPsVocWpJzwGEyFKeimuzAzLUaETdzdCRxIECQQCmXbOspTb4Z6GwaEOeN4d8Y0cA35BJ9yRVkKgEIgAWs4Pb3jEMjbcfsPeeDksTDHhS9nxx74R6Yamdvfdv3/pl";
    	
    	String desKey = Base64.getBase64(RsaCrypt.encryptByPrivateKey(desStr.getBytes("utf-8"), privateKey));
    	System.out.println(desKey);
    	String destKey = new String(RsaCrypt.decryptByPublicKey(Base64.getFromBase64(desKey), publicKey));
    	System.out.println(destKey);
    	//�?des秘钥加密
    	byte[] by = DesCrypt.encryptMode("{\"data\":[{\"billCode\":\"3130005135467579\",\"resultCode\":\"100004\",\"resultContent\":\"已审核\"}]}".getBytes());
    	String by_new = Base64.getBase64(by);
  
    	System.out.println(by_new);
    	System.out.println(new String(DesCrypt.decryptMode(Base64.getFromBase64(by_new))));
	}
    
}
