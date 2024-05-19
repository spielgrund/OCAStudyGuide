package Enaira;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Rauschen {
    Random rnd = new Random();
    final int RNDSIZE = 25;
public String multiString(int wdh, String string, double prozentsatz) {

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < wdh; i++) {
        //System.out.println(rauschenHinzufuegen2(string, prozentsatz));
        sb.append(rauschenHinzufuegen2(string, prozentsatz));
    }
    return sb.toString();
}

    public String rauschenHinzufuegen(String string,double prozentsatz){
        String[] stringarray = string.split("");

        int i = 0;
        double prozentvonstring = (double) stringarray.length / 100 * prozentsatz;
        Gradient gradient = new Gradient(0,stringarray.length-1,(int)prozentvonstring);

        for(int al : gradient.getArraylist()){
            char c = stringarray[al].charAt(0);
            stringarray[al] = String.valueOf((char)(c + rnd.nextInt(RNDSIZE)));
        }

        return Arrays.toString(stringarray);
    }

    public String rauschenHinzufuegen2(String string,double prozentsatz){
        StringBuilder sb = new StringBuilder(string);

        int i = 0;
        double prozentvonstring = (double) string.length() / 100 * prozentsatz;
        Gradient gradient = new Gradient(0,string.length()-1,(int)prozentvonstring);

        for(int al : gradient.getArraylist()){
            char c = sb.charAt(al);
            c = (char)(c + rnd.nextInt(RNDSIZE));
            sb.setCharAt(al, c);
        }

        return sb.toString();
    }

    public String rauschenEntfernen(String[] stringarr){


        int anzahlarrays = stringarr.length;
        int laengearrays = stringarr[0].length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < laengearrays; i++) {
                char[] temp = new char[anzahlarrays];
            for (int j = 0; j < anzahlarrays; j++) {
                temp[j] = stringarr[j].charAt(i);
            }

            String s = String.valueOf(maxChar(temp));

                sb.append(s);

        }
        return sb.toString();
    }

    public char doppelChar(char[] chararr){
        for (int i = 0; i < chararr.length; i++) {
            for (int j = 0; j < chararr.length; j++) {
                if(i != j && chararr[i] == chararr[j]){
                    return chararr[i];
                }
            }
        }
        return chararr[0];
    }

    public char maxChar(char[] chararr){
        int[] intarr = new int[200];
        for(char c : chararr){
            intarr[c]++;
        }

        return (char)maximum_index(intarr);
    }
    static int maximum_index(int[] a)
    {
        int maximum,index=0,i=1;
        maximum=a[0];
        while(i<a.length)
        {
            if(maximum<a[i])
            {
                maximum=a[i];
                index=i;
            }
            i++;
        }
        return index;
    }
}
