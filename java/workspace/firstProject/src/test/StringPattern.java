package test;

public class StringPattern {

    public static void main(String[] args) {

        String s = "ABC****xyz";
        String ss = "****";
        boolean found = false;

        for (int i = 0; i <= s.length() - ss.length(); i++) {
            int j;
            for (j = 0; j < ss.length(); j++) {
                if (s.charAt(i + j) != ss.charAt(j)) {
                    break;
                }
            }
            if (j == ss.length()) {
                found = true;
                break;
            }
        }

        if (found) {
			System.out.println("Match Found");
		} else {
			System.out.println("Match not found");
		}
    }
}
