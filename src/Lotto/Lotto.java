package Lotto;

import Enaira.Gradient;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
    Scanner sc = new Scanner(System.in);
    Gradient gradient;


    int[] lottoZahlenUser = new int[6];

    public void lotto(){
        neueZiehung();
        frageZahlenVonUser();
        int richtige = 0;
        for(int i : gradient.getArraylist()){
            if(istIn(i, lottoZahlenUser)){
                richtige++;
            }
        }
        System.out.println(gradient);
        System.out.println(Arrays.toString(lottoZahlenUser));
        System.out.println("Du hast " + richtige + " richtige!");

    }

    public void lottoDauer(){
        frageZahlenVonUser();
        neueZiehung();
        int richtige = 0;
        int versuche = 0;
        while(true){
            for(int i : gradient.getArraylist()){
                if(istIn(i, lottoZahlenUser)){
                    richtige++;
                }
            }
            if(richtige==6){
                break;
            }
            else{
                richtige = 0;
                versuche++;
                neueZiehung();
            }

        }
        System.out.println(gradient);
        System.out.println(Arrays.toString(lottoZahlenUser));
        System.out.println(versuche + " Ziehungen für " + richtige + " Richtige");

    }

    public void neueZiehung(){
        gradient = new Gradient(1,49,6);
        //System.out.println(gradient);
    }
    public void frageZahlenVonUser(){
        lottoZahlenUser = new int[6];
        int i = 0;
        for (int j = 0; j < 6;) {
            System.out.println("Bitte Zahl eingeben.");
            i = sc.nextInt();
            if(!istIn(i,lottoZahlenUser)&& 0 < i && i < 50){
                lottoZahlenUser[j] = i;
                j++;
            }else{
                System.out.println("Bitte eine Andere Zahl nehmen");
            }
           // System.out.println(Arrays.toString(lottoZahlenUser));
        }
    }
    public boolean istIn(int i, int[] intarray){
        for(int j : intarray){
            if(i==j){
                return true;
            }
        }
        return false;
    }
}
