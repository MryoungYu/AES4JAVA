import java.util.Scanner;

public class AESMain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("����������");
		String content = in.nextLine();
		System.out.println("��������Կ");
		String key = in.nextLine();
		
		byte[] encryptResult = MyAESUtils.encrypt(content, key);
		System.out.println("���ܺ�����Ϊ�� " + encryptResult);
		
		byte[] decryptResult = MyAESUtils.decrypt(encryptResult, key);
		System.out.println("���ܺ�ԭ��Ϊ�� " + new String(decryptResult));

	}
}
