package ch11.exam05;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class String01 {

	public static void main(String[] args) throws Exception {// JVM���� ���ܸ� ������
		byte[] arr1 = { 65, 66, 67 };
		String str1 = new String(arr1);
		// ����Ʈ ���� ��� ��Ʈ��ũ ��Ŷ� ���
		// ����Ʈ�� �޾Ƽ� ���ڷ� ������� ����ڿ��� ������

		System.out.println(str1);

		String str2 = "ABC";
		// -> byte�迭��
		byte[] arr2 = str2.getBytes();
		System.out.println(Arrays.toString(arr2));
		// Arrays.toString�� �迭�� �ִ� �׸��� �а� ���ڿ��� ���

//		try {
		String str3 = "������";
		byte[] arr31 = str3.getBytes("EUC-KR");
		// ����� �ѱ۸� ���� �ٸ����� ���� ���� ����
		// �ѱ� ���ڰ� 2����Ʈ
		// [-80, -95, -77, -86, -76, -39]
		// -80, -95 = ��, -77, -86 = ��, -76, -39 = ��
		System.out.println(Arrays.toString(arr31));
		byte[] arr32 = str3.getBytes("UTF-8");
		// ���� ���, ���ͳ� ǥ�� ���ڼ�, ��� ��� �� ����
		// �ѱ� ���ڰ� 3����Ʈ
		// [-22, -80, -128, -21, -126, -104, -21, -117, -92]
		// -22, -80, -128 = ��, -21, -126, -104 = ��, -21, -117, -92 = ��
		System.out.println(Arrays.toString(arr32));

		
		//�ٽ� �ѱ��� ����
		String str4 = new String(arr31, "EUC-KR");
		String str5 = new String(arr32, "UTF-8");
		
		System.out.println(str4);
		System.out.println(str5);
		
		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
