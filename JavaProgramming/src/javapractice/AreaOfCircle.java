package javapractice;

import java.util.Scanner;

public class AreaOfCircle {
	
/*	final static double pi=3.13;

	public static void main(String[] args) {
	
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the r number");
    int r=sc.nextInt();
    System.out.println(pi*r*r);*/
	
	final static double pi=3.13;

	public static void main(String[] args) {
	
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter the r number");
    double r=sc1.nextDouble();
    
    double area=r*r*pi;
    System.out.println(area);
    sc1.close();
	}}



