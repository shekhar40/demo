package com.bill.desco.configuration;

import javax.crypto.*;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Base64;

public class AES256 {

		public static String decrypt(String encryptText)
				 {
			String encText = "EAAAADE2ODA2NjQya2JNN2M1ISShgi+Oi5tbsPgOz5KsCHj0";
			final String password = "KJH#$@kds32@!kjhdkftt";
			final String iv = "16806642kbM7c5!$";
			byte[] salt = new byte[] { 34, (byte) 134, (byte) 145, 12, 7, 6, (byte) 243, 63, 43, 54, 75, 65, 53, 2, 34, 54,
					45, 67, 64, 64, 32, (byte) 213 };

					 SecretKeyFactory factory = null;
					 try {
						 factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
					 } catch (NoSuchAlgorithmException e) {
						 e.printStackTrace();
					 }
					 KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 1000, 256);
					 SecretKey tmp = null;
					 try {
						 tmp = factory.generateSecret(spec);
					 } catch (InvalidKeySpecException e) {
						 e.printStackTrace();
					 }

					 SecretKeySpec secret = new SecretKeySpec(tmp.getEncoded(), "AES");
			IvParameterSpec ivs;
			ivs = new IvParameterSpec(iv.getBytes(StandardCharsets.US_ASCII));

			// your code use PKCS7, but I use PKCS5 because it shows exception in my case
					 Cipher cipher = null;
					 try {
						 cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
					 } catch (NoSuchAlgorithmException e) {
						 e.printStackTrace();
					 } catch (NoSuchPaddingException e) {
						 e.printStackTrace();
					 }
					 try {
						 cipher.init(Cipher.DECRYPT_MODE, secret, ivs);
					 } catch (InvalidKeyException e) {
						 e.printStackTrace();
					 } catch (InvalidAlgorithmParameterException e) {
						 e.printStackTrace();
					 }

					 // base64 string from C# output
					 String plaintext = null;
					 try {
						 plaintext = new String(cipher.doFinal(Base64.getDecoder().decode(encryptText)), "UTF-8");
					 } catch (UnsupportedEncodingException e) {
						 e.printStackTrace();
					 } catch (IllegalBlockSizeException e) {
						 e.printStackTrace();
					 } catch (BadPaddingException e) {
						 e.printStackTrace();
					 }
					 return plaintext;
		}

}
