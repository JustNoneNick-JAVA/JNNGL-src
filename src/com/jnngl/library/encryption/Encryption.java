package com.jnngl.library.encryption;

import com.jnngl.library.enums.EncryptionEnum;

public class Encryption {
	
	public static String Encrypt(EncryptionEnum e) {
		String result = "";
		if(e == EncryptionEnum.Window) {
			result = "Window:create";
		}
		if(e == EncryptionEnum.Clear) {
			result = "Draw:clear:BLACK";
		}
		if(e == EncryptionEnum.Remove) {
			result = "Window:destroy";
		}
		if(e == EncryptionEnum.AOT) {
			result = "Window:A.O.T:true";
		}
		if(e == EncryptionEnum.Resizable) {
			result = "Window:resizable:false";
		}
		return result;
	}
	
}
