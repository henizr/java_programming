package homework_seminar_2;
import java.io.FileWriter;
import java.util.logging.*;
import java.util.Scanner;
import java.nio.file.Paths;
public class Task3 {

    public static void main(String[] args) {
        
        String absolutePath =  Paths.get(".").toAbsolutePath().normalize().toString() ;
        
        Scanner iscaner = new Scanner(System.in); 
            
        Logger logger = Logger.getLogger(Task3.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);

        try {  
            byte number = Byte.parseByte(iscaner.nextLine());
            FileWriter fwrite = new FileWriter(absolutePath + "result.txt");   
            fwrite.write(number);   
            fwrite.close();   
            System.out.println("Content is successfully wrote to the file.");  
        } catch (Exception e) {  
            System.out.println("Unexpected error occurred");  
            String s = String.valueOf(e.getClass());
            logger.log(Level.WARNING, s);
        }  


        iscaner.close();
    }
}
