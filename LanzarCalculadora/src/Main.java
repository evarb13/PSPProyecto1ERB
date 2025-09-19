import java.io.*;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            ProcessBuilder pb = new ProcessBuilder("java", "-jar", "..\\Calculadora_jar\\Calculadora.jar");
            Process p = pb.start();
            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String linea;
            linea = br.readLine();
            System.out.println(linea);

            linea = br.readLine();
            System.out.println(linea);


            OutputStream os = p.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            bw.write(3 + "\n");
            bw.flush();
            linea= br.readLine();
            System.out.println(linea);

            bw.write(3 + "\n");
            bw.flush();
            linea= br.readLine();
            System.out.println(linea);

            bw.write('+' + "\n");
            bw.flush();
            linea= br.readLine();
            System.out.println(linea);

            linea = br.readLine();
            System.out.println(linea);
        } catch (IOException e) {
            System.out.println("Error "+(e.getMessage()));
        }
    }
}