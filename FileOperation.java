import java.io.*;
public class FileOperation{
	public static void main(String args[]) {
		
	try{
		FileReader fr=new FileReader("output.txt");
		int i ;
		while((i=fr.read())!=-1){
			System.out.print((char)i);
			}
		fr.close();
		File file =new File("Hello.txt");
		file.createNewFile();	
		FileWriter writer=new FileWriter(file);
		writer.write("This is a java program");
		writer.close();
	}
	
	catch (FileNotFoundException e){
		System.out.println("Exception while writing the file"+e);
		}
		
	catch (IOException ioe){
		System.out.println("Exception while writing the file"+ioe);
		}
		
	
    }
}
