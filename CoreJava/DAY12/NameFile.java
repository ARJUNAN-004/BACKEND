package DAY12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class NameFile {
    public static void main(String[] args) {
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter("C:\\Users\\arjun\\Desktop\\TEXT FILES\\Name.txt"));
            String name="JoyBoy is the Name...";
            bw.write(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (bw!=null){
                    bw.close();
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
