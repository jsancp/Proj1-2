public class practice {
	public static void main(String[] args)  {
		String str1 = "hello there!";
		String str2, str3;
		str2 = str1.toUpperCase( );
		System.out.println(str1 + " " + str2);
		str2 = str1.replace("E", "3");
		System.out.println(str1 + " " + str2);
		str3 = str2.concat(str1);
		System.out.println(str3) ;
		System.out.println(str1.charAt(0) + " " + str2.charAt(0));
		System.out.println(str1.trim());
		System.out.println(str1);
		
	}
}
