package com.driver;

class Product{
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

public class Main {

    
    /**
     *
     * @param args
     */
    public void main(String [] args){
        Product p = new Product();
        
        System.out.println(p.product(5, 4));
        
        System.out.println(p.product(5, 4, 6));
        
        System.out.println(p.product(5.045, 4.4679));
        
        
    } 
}