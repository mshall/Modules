package com.common.utils;
//package vis.common.utils;
//
//import com.mega.common.encryption.blowfish.BinConverter;
//import com.mega.common.encryption.blowfish.BlowfishHelper;
//
//
//public class EncryptionUtil {
//
//	public static String encrypt(String value, String encryptionKey){
//		BlowfishHelper encryptor = new BlowfishHelper(encryptionKey);
//		String result = BinConverter.bytesToBinHex(encryptor.encrypt(value));
//		return result;
//
//	}
//
//	public static String decrypt(String value, String encryptionKey){
//		BlowfishHelper encryptor = new BlowfishHelper(encryptionKey);
//		byte pswdenc[] = new byte[value.length() / 2];
//		BinConverter.binHexToBytes(value, pswdenc, 0, 0, value.length() / 2);
//		String result = new String(encryptor.decrypt(pswdenc));
//		return result;
//	}
//	
//	public static void main(String[] args) {
//		System.err.println(encrypt("username","DXL_Encryption_Key"));
//	}
//}
//
//
//
