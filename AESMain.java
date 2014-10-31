import java.util.Scanner;

public class AESMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入明文");
		String content = in.nextLine();
		System.out.println("请输入密钥");
		String key = in.nextLine();
		
		byte[] encryptResult = MyAESUtils.encrypt(content, key);
		System.out.println("加密后密文为： " + encryptResult);
		
		byte[] decryptResult = MyAESUtils.decrypt(encryptResult, key);
		System.out.println("解密后原文为： " + new String(decryptResult));

	}
}
