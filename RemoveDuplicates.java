package week1.day3;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";		
        String temp = "" + text.charAt(0);
	
        for (int i = 1; i < text.length(); i++) {
            if (!temp.contains(String.valueOf(text.charAt(i))))
                temp = temp + text.charAt(i);
        }
        System.out.println(temp);
	}

}
