import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
	
	public ReverseString(File fileName) {
		try {
			Scanner sc = new Scanner(fileName);
			str = "";
			while(sc.hasNext()) {
				str += sc.nextLine();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
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
	
	//place pointer on the start and end
	//switch the values until pointer 1 meets with pointer 2
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
		ReverseString rs = new ReverseString("ABCDSADASDWQE$");
		
		System.out.println(rs.reverseString2("welcome to coding strings"));
		
//		File alice = new File("..\\Projects\\test\\txt-files\\alicewonder.txt");
//		ReverseString rs4 = new ReverseString(alice);
//		System.out.println((rs4.reverseString2(rs4.getStr()).length()));
	}

}
