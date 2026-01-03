import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputstream {
   static void Input() {
//       ----------------------------------------------------------------------------------------------------
       try (InputStreamReader isr = new InputStreamReader(System.in)) {
           System.out.print("enter some letters: ");
           int letters = isr.read();
           while (isr.ready()) {
               System.out.print((char) letters);
               letters = isr.read();
           }
           System.out.println(" ");
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
//----------------------------------------------------------------------------------------------------
       try (FileReader fr = new FileReader("note.txt")) {
           int letter = fr.read();
           while (fr.ready()) {
               System.out.print((char) letter);
               letter = fr.read();
           }
           System.out.println(" ");
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }

       //----------------------------------------------------------------------------------------------------

       // byte to char stream and then reading char stream
      try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
          System.out.print("enter something : ");
          System.out.print("you typed : " + br.readLine());
          System.out.println(" ");
      }
      catch (IOException e){
          System.out.println(e.getMessage());
      }

//----------------------------------------------------------------------------------------------------

      try(BufferedReader br = new BufferedReader(new FileReader("note.txt"))){
          System.out.print(br.readLine());
      }catch (IOException e){
          System.out.println(e.getMessage());
      }

      //----------------------------------------------------------------------------------------------------

   }
    public static void main(String[] args) {
        Input();
    }
}
