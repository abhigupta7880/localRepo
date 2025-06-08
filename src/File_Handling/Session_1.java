package File_Handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Session_1 {

    public static void main(String[] args) {
        try{

            File notebook = new File("Notes.txt");
            if(notebook.createNewFile()){
                System.out.println("File Name is "+notebook.getName());
            }else{
                System.out.println("File Already exists.");
            }
            FileWriter writefile= new FileWriter("Notes.txt");
            writefile.write("Java is a good language, It's easy to learn it.");
            writefile.close();
        }catch (IOException e){
            System.out.println("An Error occured");
            e.printStackTrace();
        }

    }
}
