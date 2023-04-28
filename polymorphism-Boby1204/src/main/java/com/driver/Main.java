package com.driver;

public class Main {
    public static class Product{

        public int product(int x, int y){
            return x*y;
        }
        public int product(int x , int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }
    public static void main(String[] args) {
        Product p = new Product() ;
       int p1 = p.product(2 , 3);
       int p2 = p.product(2,3,4);
       int p3 = p.product(2,6);
       System.out.println(p1+" "+p2+" "+p3);
    }
}