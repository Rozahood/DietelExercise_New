package Private.Buffers;

import java.io.*;

public class Writer {
    public static void main(String[] args) throws IOException {
        try(OutputStreamWriter writer =
                new OutputStreamWriter(new FileOutputStream(AppUtils.APP_ASSET_LOCATION));
            BufferedWriter bufferedWriter =new BufferedWriter(writer)){
            String[] words = {"ROYAL", "PECULIAR", "MOYO", "MAYOWA", "TOYIN"};
            bufferedWriter.write(words[0]+ " " + words[3]);
            bufferedWriter.flush();
            bufferedWriter.write(words[1]);
            bufferedWriter.close();
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
        }
    }
