package DAY12;

import java.io.*;

public class BufferCode {
    public static void main(String[] args) {
        String InpFile="Input.txt";
        try(BufferedWriter w=new BufferedWriter(new FileWriter(InpFile))) {
            w.write("Sample input Text File...\n");
            w.write("It Displayed...");
        }
        catch (Exception e){
            System.out.println("Error in Writing...");
        }
        try (BufferedReader r=new BufferedReader(new FileReader(InpFile))){String line;
            while ((line = r.readLine()) != null) {
                System.out.println(line);
            }

        } catch (Exception e) {
            System.out.println("Error in Reading...");
        }
    }
}
