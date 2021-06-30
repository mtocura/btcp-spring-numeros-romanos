package br.com.mod6.numromano.grupo6.utils;

import java.util.ArrayList;
import java.util.List;

public class NumeroRomanoConverter {
    public static String converteRomano(String numero) {
        int num = Integer.parseInt(numero);

       StringBuilder res = new StringBuilder();
       res.append("");

       String[][] numRomano = {{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
       {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
       {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
       {"", "M", "MM", "MMM", "", "", "", "", "", "", ""}};

        int contador = 0;
        while((num / 10 != 0) || (num % 10 != 0)) {
            int digito = num % 10;

            res.insert(0, numRomano[contador][digito]);
            System.out.println(numRomano[contador][digito]);
            System.out.println("String: " + res.toString());
            contador++;
            num = num / 10;
        }

        return res.toString();
    }
}
