package simplethread;

import java.util.Scanner;

class User extends Thread{
	public void run() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Enter your email:");
        String email=scanner.nextLine();
        scanner.close();
       
        System.out.println("User info: Name: " + name + ", Email: " + email);
	}
}
class  Si extends Thread{
	private  double principal;
	private  double rate;
	private double time;
	public Si(double principal,double rate,double time) {
		this.principal=principal;
		this.rate=rate;
		this.time=time;
			}
	public void run() {
		double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    	}
}
public class NewThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principal = 1200;
        double rate = 3;
        double time = 4;
        
        Thread User= new User();
        Thread Si = new Si(principal, rate, time);
        
        User.start();
        Si.start();
	}

}
