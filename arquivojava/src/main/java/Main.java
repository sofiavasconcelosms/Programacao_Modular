import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main{
  public static void main(String[] args){
    String path = "src/main/java/arquivo1.txt";
    try {
      OutputStream os = new FileOutputStream(path);
      Writer wr = new OutputStreamWriter(os);
      BufferedWriter br = new BufferedWriter(wr);
      br.write("Escrevendo nosso primeiro arquivo em java!");
       br.newLine();
      br.write("ola mundo");
      br.newLine();
      br.close();
    } catch (Exception e) {
      System.out.println("Algo de errado não está certo!");
    }
  }
}