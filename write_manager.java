mport java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class write_manager{

	public ObjectOutputStream objectOutputStream;

	public write_manager(String filePath)
	{
		try
		{
			File file = new File(filePath);
			if (!file.exists()) 
			{
	            file.createNewFile();
	        }
			this.objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
		} catch(Exception e){
			System.out.println("Error occured." + e.toString());
			System.exit(0);
		}
	}

	public void writeObject(Employee object) throws IOException
	{
		objectOutputStream.writeObject(object);
	}

}