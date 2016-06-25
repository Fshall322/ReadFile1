/**
 * Created by Frank Hall on 6/25/2016.
 */
import java.nio.file.*;
import java.io.*;

public class Readfile
{
    public static void main(String[] args)
    {
        Path inFile = Paths.get("D:\\Java\\CurrentWork\\testFile.txt");
        InputStream input = null;// if it is a stream we need to initialize it too

        try
        {
            input = Files.newInputStream(inFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String s = null;// initializing
            s = reader.readLine();
            System.out.println(s);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
