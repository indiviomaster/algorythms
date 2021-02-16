package ru.indivio.algorithms;

public class RecPow {
    public static void main(String[] args) {
        System.out.println(pow(10.0,2));
        System.out.println(pow(2.0,-2));
        System.out.println(pow(2.0,0));
        System.out.println(pow(2.0,-1));
        System.out.println(pow(2.0,1));
    }
    public static double pow(double number, int power){
        if(power == 0){
            return 1;
        }
        if(power == 1){
            return number;
        }
        if(power == -1){
            return 1/number;
        }
        if (power < 0) {
            return powNum(1/number,1/number,-power);
        }
        return powNum(number, number, power);
    }

    private static double powNum(double acc, double n, int p) {
        if (p == 1) {
            return acc;
        }

        return powNum(acc*n, n, p-1);
    }
}

