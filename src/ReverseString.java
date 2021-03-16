
public class ReverseString {
	
	private String str, reversedString;
	
	public ReverseString() {
		str = "";
		reversedString = "";
	}
	
	public ReverseString(String str) {
		this.str = str;
		reversedString = "";
	}
	
	public String getStr() {
		return str;
	}

	public String getReversedString() {
		return reversedString;
	}

	public String reverseString(String string) {
		String ans = ""; //O(1)
		int length = string.length(); //O(1)
		
		//O(n)
		//place first letter at beginning of ans each iteration
		while(length > 0) {     
			ans = string.charAt(0) + ans;
			string = string.substring(1);
			length--;
		}
		
		return reversedString = ans;
	}
	
	public String reverseString2(String string) {
		int length = string.length();
		char[] array = string.toCharArray(); //convert string to char array ['s','t','r',...]
		int pointer1 = 0; //use String.valueOf(char) to convert char -> String
		int pointer2 = length - 1;
		
		//O(n/2)
		while(pointer1 < pointer2) {
			char temp = array[pointer2];
			array[pointer2] = array[pointer1];
			array[pointer1] = temp;
			pointer1++;
			pointer2--;
		}
		return reversedString = String.valueOf(array);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString("Mike");
		ReverseString rs1 = new ReverseString("");
		ReverseString rs2 = new ReverseString("a");
		ReverseString rs3 = new ReverseString("ABCDSADASDWQE$");
//		System.out.println(rs);
//		System.out.println(rs1);
//		System.out.println(rs2);
//		System.out.println(rs3);
		System.out.println(rs.reverseString2("welcome to coding algorithms"));
	}

}
