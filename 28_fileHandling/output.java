import java.io.*;

public class output {
    static void Output(){
        OutputStream os = System.out;

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)){
            osw.write("hello !!\n");
            osw.write("🎈🎈🎈🎈\n");
            osw.write( (char) 97 + "\n");
            osw.write( 97 + "\n");
            osw.write("97" + "\n");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("note.txt" , true)){
            fw.write("\n how are you radhe");
        }catch (IOException e){
            System.out.println();
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))){
            bw.write("tum kese ho hariom");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        Output();
    }
}
