package com.driver;

public class Product {
    public static int product() {
        return product(0, 0);
    }

    public static int product(int x, int y) {
        return x * y;
    }

    public static int product(int x, int y, int z) {
        return x * y * z;
    }


    public static double product(double x, double y) {
        return y * x;
    }

}
