package com.company;/*** Created by jroberts3136 on 4/19/18.*/public class B {public static void main(String[] args) {for (int b = 0; b <= 10; b++){System.out.println(b(b));}}public static double b(double b){if (b==0){return 3;} else if (b==1){return 5;} else if (b==2){return 8;} else{return b(b-1) + b(b-2) + b(b-3);}}}