package ss3_method.exrcise;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDiscriminant(){
        double delta = b*b - 4*a*c;
        return delta;
    }
    public double getRoot1(){
        return (-b+(Math.sqrt(b*b - 4*a*c)))/2*a;
    }
    public double getRoot2(){
        return (-b-(Math.sqrt(b*b-4*a*c)))/2*a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phương trình : ax2 + bx + x = 0 ! ");
        System.out.println("nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        if (quadraticEquation.getDiscriminant()>0){
            System.out.println("Root 1: " + quadraticEquation.getRoot1());
            System.out.println("Root 2: " + quadraticEquation.getRoot2());
        }else if (quadraticEquation.getDiscriminant()==0){
            System.out.println("Root 1 = Root 2: " + quadraticEquation.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm ! ");
        }
    }
}
