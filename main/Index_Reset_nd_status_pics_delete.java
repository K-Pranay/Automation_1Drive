
import java.io.*;
import java.io.File.*;
import java.io.IOException;

import java.awt.datatransfer.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Index_Reset_nd_status_pics_delete
{
	public static void main(String[] args)
	{
		File folder = new File("C:\\Users\\Pranay\\OneDrive\\Desktop\\Git_Projects\\Automation_1Drive\\main\\statusPics");
		File[] listOfFiles = folder.listFiles();

		try
		{

			for (int i = 0; i < listOfFiles.length; i++)
			{

				if (listOfFiles[i].isFile())
				{

					String str_old = listOfFiles[i].getName();

					if (str_old.matches(".*.jpg"))
					{
						Files.deleteIfExists(Paths.get("C:\\Users\\Pranay\\OneDrive\\Desktop\\Git_Projects\\Automation_1Drive\\main\\statusPics\\"+ str_old));
						System.out.println("deleting "+str_old + " done");
					}
				}
			}
			String str = "Status,1";
			String path = "C:\\Users\\Pranay\\OneDrive\\Desktop\\Git_Projects\\Automation_1Drive\\main\\index.txt";
			Files.write(Paths.get(path), str.getBytes());
		}
		// catch(NoSuchFileException e)
		// {
		// System.out.println("No such file/directory exists");
		// }
		// catch(DirectoryNotEmptyException e)
		// {
		// System.out.println("Directory is not empty.");
		// }
		catch (IOException e)
		{
			System.out.println("Invalid permissions.");
		}

		System.out.println("Deletion successful.");

	}
}
