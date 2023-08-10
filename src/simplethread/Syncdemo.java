package simplethread;
/*view the below code 

   class PrintNames
 { 

     String[] names=["Peter","Sam","Edgar","Mathew","Simond"]

    public void printArray() 
 { 
  for(String s:names) 
 { 
 System.out.println(s);
 } 
  }
 } 

The above class has to implement Runnable interface and passed to thread as Runnable instance 
the function printArray should be executed in a synchronized way */
class PrintNames implements Runnable {

    String[] names = {"Peter", "Sam", "Edgar", "Mathew", "Simon"};

    public synchronized void printArray() {
        for (String s : names) {
            System.out.println(s);
        }
    }

    @Override
    public void run() {
        printArray();
    }
}

public class  Syncdemo {
    public static void main(String[] args) {
        PrintNames printNames = new PrintNames();

        // Create a thread with the PrintNames instance as the Runnable
        Thread thread = new Thread(printNames);

        // Start the thread
        thread.start();

        // Wait for the thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

