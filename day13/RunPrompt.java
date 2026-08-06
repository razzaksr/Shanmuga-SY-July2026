package day13;

import java.io.IOException;

public class RunPrompt {
    public static void main(String[] args)throws IOException, 
            InterruptedException {
        // single ton object
        Runtime run = Runtime.getRuntime();
        System.out.println("Openning....");
        Thread.sleep(3000);
        Process pro = run.exec("mspaint");
    }
}
