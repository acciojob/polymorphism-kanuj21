package com.driver;



public class Main {
    static class Product{
        public int product(int x, int y){
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return y * x;
        }

    }
    

    public static void main(String [] args){
        Product p = new Product();
        
        System.out.println(p.product(5, 4));
        
        System.out.println(p.product(5, 4, 6));

//        double x = , y = 4.4679;


        System.out.println(p.product(5.045, 2.4565465));

        
    } 
}