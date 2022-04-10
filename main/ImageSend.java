import java.io.*;
import java.io.File.*;
import java.awt.datatransfer.*;
import java.awt.*;
import java.awt.image.BufferedImage;
//import java.javax.imageio.ImageIO;
import javax.imageio.ImageIO;

import java.nio.file.Files;
import java.nio.file.Paths;

public class ImageSend
{
public static void main(String args[])
{


Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
    try {
        //Get data from clipboard and assign it to an image.
        //clipboard.getData() returns an object, so we need to cast it to a BufferdImage.
        BufferedImage image = (BufferedImage)clipboard.getData(DataFlavor.imageFlavor);
      	String content = new String(Files.readAllBytes(Paths.get("C:\\Users\\Pranay\\OneDrive\\Documents\\Automation_1Drive\\index.txt")));
      	String[] arrOfStr = content.split(",");
        arrOfStr[1] = arrOfStr[1].trim();
        // System.out.println(arrOfStr[0]);
        // System.out.println(arrOfStr[1]);
      	int i = Integer.parseInt(arrOfStr[1]);
      	i++;

      	String content1 = arrOfStr[0]+","+i;
      	String path = "C:\\Users\\Pranay\\OneDrive\\Documents\\Automation_1Drive\\index.txt";
      	Files.write( Paths.get(path), content1.getBytes());


        //file that we'll save to disk.
        String str = "C:\\Users\\Pranay\\OneDrive\\Documents\\Automation_1Drive\\statusPics\\"+arrOfStr[0]+arrOfStr[1]+".jpg";
        File file = new File(str);   // str as name and location of file  //image.jpg

        //class to write image to disk.  You specify the image to be saved, its type,
        // and then the file in which to write the image data.
        ImageIO.write(image, "png", file);
      	}
      	catch(Exception e)
      	{
      		System.out.println(e);
      	}

}
}


//java.awt.datatransfer.UnsupportedFlavorException: Image exception occure if there is no image in clip board.
