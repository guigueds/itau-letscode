package br.com.letscode.turmaitau;

import java.util.Arrays;
import java.util.Collections;

public class MaiorString {
    public static void main(String[] args) {

        String[] entrada = {"acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"};

        findSubstringCount(entrada);
    }

    static void findSubstringCount(String[] str)
    {
        Integer[] results = new Integer[str.length];
        String[] resultsTexto = new String[str.length];
        String texto = "";

        for(int j=0; j < str.length; j++){

            resultsTexto[j] = "";
            int n = str[j].length();

            int result = 0;
            for (int i = 0; i < n - 1; i++) {
                if (str[j].charAt(i) + 1 == str[j].charAt(i+1)) {
                    result++;
                    resultsTexto[j] = resultsTexto[j]+ str[j].charAt(i) + str[j].charAt(i+1);
                    results[j] = result;
                }
                if (results[j]==null) {
                    results[j]=0;
                }
            }
        }

        int maxValue = 0;
        int position = 0;
        for(int i=1;i < results.length;i++){
            if(results[i] > maxValue){
                maxValue = results[i];
                position = i;
            }
        }

        System.out.println(resultsTexto[position]);

    }


}

