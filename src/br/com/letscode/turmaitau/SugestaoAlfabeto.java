package br.com.letscode.turmaitau;

public class SugestaoAlfabeto {
    public static void main(String[] args) {
        String[] input = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};
        System.out.println(substring(input));
//teste commit git
        //teste commit Vlad
    }
    public static String substring(String[] input) {
        String longestSequence = "";
        String sequence = "";
        for (String s : input) {
            for (int i = 0; i < s.length(); i++) {
                sequence = extracted(s.charAt(i), s.substring(i+1));
                if (sequence.length() > longestSequence.length()) {
                    longestSequence = sequence;
                }
            }
        }
        return longestSequence;
    }

    private static String extracted(char c, String s) {
        if (s.isEmpty() || c > s.charAt(0)) {
            return c+"";
        }
        return c + extracted(s.charAt(0), s.substring(1));
    }
}
