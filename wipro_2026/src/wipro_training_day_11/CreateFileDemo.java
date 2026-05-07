package wipro_training_day_11;
import java.io.*;
public class CreateFileDemo {
		public static void main(String[] args)
			{
		 
				try {
					
					File file = new File("narendra.txt");
					if(file.createNewFile())
					{
						System.out.println("File Created Successfully");
				    }
					else
					{
						System.out.println("File Already Exists");
		            }
					}
				catch(IOException e)
		            {
		            	System.out.println(e);
		            }
			}
			}