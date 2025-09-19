import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("");
        try {
            Process p = pb.start();
            p.waitFor(2, TimeUnit.SECONDS);
            p.destroy();
        } catch (IOException e) {
            System.out.println("Error");
        } catch (InterruptedException e) {
            System.out.println("Problema con la interrupcion");
        }
    }
}