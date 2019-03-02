package designPattern.templatemethod.main;

import designPattern.templatemethod.AbstGameConnectionHelper;
import designPattern.templatemethod.DefaultGameConnectHelper;

public class Main {
	public static void main(String[] args) {
		AbstGameConnectionHelper helper = new DefaultGameConnectHelper();
		
 		helper.requestConnection("아이디 암호 등 접속 정보");
	}
}
