package packageA;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Worker worker = new Worker();
        worker.inputworker(input);
        worker.outputWorker();
    }
}
