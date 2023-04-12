package Private.Buffers;

import java.io.*;

import static Private.Buffers.AppUtils.APP_ASSET_LOCATION;

public class Buffer {
    public static void main(String[] args) {
        try(InputStreamReader reader = new InputStreamReader(System.in);
                BufferedReader bufferedReader = new BufferedReader(reader);
            FileWriter writer = new FileWriter(APP_ASSET_LOCATION+"\\ReadMe.txt");
        ){
            String input =bufferedReader.readLine();
            writer.write(input);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}



