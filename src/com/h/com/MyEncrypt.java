package com.h.com;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyEncrypt {
	
	public static final String KEY_MD5 = "MD5";
	/**
	 * MD5加密
	 * 
	 * @throws NoSuchAlgorithmException
	 */
	public static byte[] encryptMD5(byte[] data) throws NoSuchAlgorithmException {
		if (data == null) {
			return null;
		}
		MessageDigest md5 = MessageDigest.getInstance(KEY_MD5);
		md5.update(data);
		return md5.digest();
	}

	public static void main(String[] args) throws Exception {
		String data = "a0123245235sfdgjoeiwrtn";
		System.out.println(new BigInteger(encryptMD5(data.getBytes())).toString());
	}
}