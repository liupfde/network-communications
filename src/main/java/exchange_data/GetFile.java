package exchange_data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class GetFile {
    static int size = 1024*20;
    static int num = 0;
    public GetFile(FileInputStream fis) throws IOException {
        File file = new File("file"+num+".txt");
        FileOutputStream fos = new FileOutputStream(file);
        byte buff[] = new byte[size];
        while (fis.read(buff) != -1){
            fos.write(buff);
        }
        num++;
        fos.close();;
    }
}
