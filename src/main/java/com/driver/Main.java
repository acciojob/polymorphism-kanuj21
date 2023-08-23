package com.driver;


public class Main {

    public static class Product {
        int res;
        double resDouble;

        public int product(int x, int y){
            this.res = x * y;
            return res;
        }

        public int product(int x, int y, int z){
            this.res = x * y * z;
            return res;
        }

        public double product(double x, double y){
            this.resDouble = x * y;
            return resDouble;
        }
    }

    public static void main(String [] args){

        Product p = new Product();

//        Product p = new Product();
//
        System.out.println(p.product(5, 4));

        System.out.println(p.product(5, 4, 6));
//
////        double x = , y = 4.4679;
//
//
        System.out.println(p.product(5.045, 2.4565465));


    } 
}