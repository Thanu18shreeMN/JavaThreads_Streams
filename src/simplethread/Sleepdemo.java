package simplethread;

import java.util.Scanner;

class UserDetails extends Thread {
    public void run() {
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = scanner.nextLine();

        try {
            Thread.sleep(5000);
            System.out.println("user name is: " + userName);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class Count extends Thread{
	public void run() {
		int i =1;
		while (Thread.currentThread().isAlive()) {
            System.out.println("Count: " + i);
            i++;

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
	}
}
}
public class Sleepdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user=new UserDetails();
		user.start();
		try {
			user.join();
		} catch (InterruptedException e) {
           System.out.println(e);
        }
		Count count=new Count();
		count.start();
		

	}

}
