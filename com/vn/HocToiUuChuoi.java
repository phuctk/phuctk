package phuck.com.vn;

public class HocToiUuChuoi {

	public static void main(String[] args) {
		String s="   Nguyen       Văn    Teo Văn   ";
		System.out.println("Chuoi truoc lenh trim: " + s);
		System.out.println("Chieu dai chuoi = " + s.length());
		//s="Nguyen Van Teo";
		s=s.trim();
		System.out.println("Chuoi sau lenh trim: " + s);
		String []arr=s.split(" ");
		String sToiUu="";
		for(String tu : arr)
		{
			if(tu.trim().length()!=0)
				sToiUu +=tu +" ";
		}
		sToiUu=sToiUu.trim();
		
		System.out.println(sToiUu);
		
		String s2="   Hoang Nguyen       Van    Teo   ";
		System.out.println("Chuoi truoc lenh trim: " + s2);
		s2 = s2.trim();
		System.out.println("Chuoi sau lenh trim: " + s2);
		System.out.println("Chieu dai chuoi = " + s2.length());
		String []arr1 = s2.split(" ");
		String Sok = "";
		for (String chu : arr1) {
			if ( chu.trim().length() !=0 )
				Sok +=chu + " ";
		}
		Sok = Sok.trim();
		System.out.println(Sok + "\n");
		System.out.println(sToiUu.indexOf("Văn"));
		System.out.println(sToiUu.lastIndexOf("Văn"));
		String phone = "012-3456789";
		String[] output = phone.split("8");
		System.out.println(output[0]);
		System.out.println(output[1]);
		String s3 = " ABC DNF NHK JKLLLM LLDKSK ";
		String []arr3 = s3.split(" ");
		for (String tu : arr3) {
			System.out.println(tu);
		}
		String s6 = "   Đường đến ngày vinh quang   ";
		String s7 = s6.trim();
		System.out.println("s7 = " + s7);
		System.out.println("s7 bỏ ký tự trắng: ");
		for (int i = 0; i<s7.length();i++) {
			if (s7.charAt(i) != ' ') System.out.print(s7.charAt(i));
		}
		System.out.println("s7 bỏ ký tự trắng & n");
		String s8 = "";
		for (int i = 0; i<s7.length();i++) {
			if (s7.charAt(i) != ' ' && s7.charAt(i) != 'n' ) {
				System.out.print(s7.charAt(i));
				s8.concat(s7.charAt(i) + " ");
				s7.replace(s7.charAt(i), 'v');
			}
		}
		System.out.println("");
		System.out.println("s8 = " + s8);
		System.out.println("s7 = " + s7);
		System.out.println("Co ta noi \"Hello!\" voi toi.");
		String s9 = "   Đường đến ngày vinh quang Nguyen       Văn    Teo Văn Đường đến ngày vinh quang    ";
		System.out.println("s9 = " + s9);
		for (int i = 0; i<s9.length();i++) {
			if (s9.charAt(i) == 'ế' ) {
				s9 = s9.replace(s9.charAt(i), 'v');
			}
		}
		System.out.println("s9 = " + s9);
		System.out.println(s9.concat(s));
		//System.out.println(s9.substring(12));
		//System.out.println(s9.replace(' ', 'z'));
		String s10 = "";
		for (int i = 0;i<999;i++) s10 += "a";
		System.out.println(" s10= " + s10);
		System.out.println( "Hashcode s10 = " + s10.hashCode());
		System.out.println(" s10 = " + s10.compareTo(s7)); 
		for (int i = 0; i<s9.length();i++) {
			if (s10.charAt(i) == 'a' ) {
				s10 = s10.replace(s10.charAt(i), 'v');
			}
		}
		System.out.println(" s10= " + s10);
		
	}
	
}
