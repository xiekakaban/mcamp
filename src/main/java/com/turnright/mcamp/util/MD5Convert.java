package com.turnright.mcamp.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Convert {
	private static String StringToMd5(String plainText) throws NoSuchAlgorithmException{
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		md5.update(plainText.getBytes());
		byte[] b = md5.digest();
		StringBuffer buf = new StringBuffer("");
		int i = 0;
        for (int offset=0;offset < b.length; offset++) {
          i = b[offset];
          if (i < 0){
            i += 256;
          }
          if (i < 16){
            buf.append("0");
          }
          buf.append(Integer.toHexString(i));
        }
        return buf.toString();
	}
	/** 创建 32位加密的MD5值*/
	public static String StringToMd5_32(String plainText) throws NoSuchAlgorithmException{
		return StringToMd5(plainText);
	}
	/** 创建 16位加密的MD5值*/
	public static String StringToMd5_16(String plainText) throws NoSuchAlgorithmException{
		return StringToMd5(plainText).substring(8, 24);
	}
}
