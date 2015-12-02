package tool;

import java.security.MessageDigest;


public class MD5Util {
	/***
	 * 登录号加密
	 * @param str
	 * @return
	 */
	public static String encode(String str){
		MessageDigest md5 = null;
        try {
			md5 = MessageDigest.getInstance("MD5");
			byte[] byteArray = str.getBytes("UTF-8");
	        byte[] md5Bytes = md5.digest(byteArray);
	        StringBuffer hexValue = new StringBuffer();
	        for (int i = 0; i < md5Bytes.length; i++) {
	            int val = ((int) md5Bytes[i]) & 0xff;
	            if (val < 16) {
	                hexValue.append("0");
	            }
	            hexValue.append(Integer.toHexString(val));
	        }
	        return hexValue.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
	}
	
	public static void main(String[] args) throws Exception {
		String ss = "1";
		String se = encode(ss);
		System.out.println("����ǰ��" + ss);
		System.out.println("���ܺ�" + se);
	}
}
