import java.io.*;
import java.util.Scanner;
public class fileH {
    
    public static void main(String[] args) {

    

        // File a = new File ("abc.txt");
        // if(a.exists()){
        //     a.delete();
        //     System.out.println("file deleted successfully");

        // }
        // else{
        //     System.out.println("file not deleted");
        // }



    //    try{
    //     File a = new File("abc.txt");
    //     Scanner b = new Scanner(a);
    //     while(b.hasNextLine()){
    //         String data = b.nextLine();
    //         System.out.println(data);
    //     }
    //    }
    //    catch(Exception e){

    //    }

        try{
            FileWriter a = new FileWriter("abc.txt");
        a.write("wrtieen using java");
        a.close();
        System.out.println("write");
        }
        catch(Exception e){
            System.out.println("file can not be written");
        }
        


        // File a = new File("C:\\Users\\SES-20\\Desktop\\assisgnments java\\30.5\\ab.txt");
        // if(a.exists()){
        //         System.out.println("file name is "+a.getName());
        //         System.out.println("path is "+a.getAbsolutePath());
        //         System.out.println("file size is "+a.length());
        //         System.out.println("file is readable  "+a.canRead());
        //         System.out.println("file is writable "+a.canWrite());



        // }
        // else{
        //     System.out.println("file not found");
        // }









    //     File a = new File("C:\\Users\\SES-20\\Desktop\\assisgnments java\\abc.txt");


    //    try{ 
    //     if(a.createNewFile()) {
    //         System.out.println("file created successfully");
    //     }
    //     else{
    //         System.out.println("file alredy exist");
    //     }

    
    // }
    //    catch(Exception x){
    //     System.out.println("file not created");
    // }

    }
}
