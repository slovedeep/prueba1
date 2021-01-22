package Tarot;

import java.util.Scanner;

public class Tarot {
    public static void main(String[] args) {
        int birthDay=0, birthMonth=0, birthYear=0, sum=0, febDays, tarot=0;
        Scanner readValues = new Scanner(System.in);
        do {
            System.out.println("Introdueix l'any de naixement (del 1 al 2002): ");
            birthYear = readValues.nextInt();
        } while (birthYear<=0 || birthYear>2002);

        System.out.println("Hola Que tal??");

        do {
            System.out.println("Introdueix el mes de naixement (del 1 al 12): ");
            birthMonth = readValues.nextInt();
        } while (birthMonth<=0 || birthMonth>12);
        switch (birthMonth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                do {
                    System.out.println("Introdueix el dia de naixement (del 1 al 31): ");
                    birthDay = readValues.nextInt();
                } while (birthDay<=0 || birthDay>31);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                do{
                    System.out.println("Introdueix el dia de naixement (del 1 al 30): ");
                    birthDay = readValues.nextInt();
                } while (birthDay<=0 || birthDay>30);
                break;
            case 2:
                if ((birthYear%4==0 && birthYear%10!=4) || birthYear%400==0){
                    febDays=29;
                }
                else{
                    febDays=28;
                }
                do {
                    System.out.println("Introdueix el dia de naixement (del 1 al 28 o 29): ");
                    birthDay = readValues.nextInt();
                } while (birthDay<=0 || birthDay>febDays);
                break;
        }
        sum=birthDay+birthMonth+birthYear;
        while (sum>9){
            tarot=0;
            while (sum>0){
                tarot+=sum%10;
                sum/=10;
            }
            sum=tarot;
        }
        System.out.println(tarot);
    }
}
