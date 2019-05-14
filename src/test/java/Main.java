import java.io.*;

/**
 * @author :liupf
 * @description :TODO
 * @date :2019/05/08 22:54
 **/
public class Main {
    ///Users/liupfde/Desktop/IO.txt
    public static void main(String[] args) throws IOException {
        String fileInPath = "/Users/liupfde/Desktop/IOI.txt";
        String fileOutPath = "/Users/liupfde/Desktop/IOO.txt";

        File fileIn = new File(fileInPath);
        File fileOut = new File(fileOutPath);

       // copyFile(fileIn, fileOut);

        String s = "这次还不乱码01";

        InputStream inputStream = new FileInputStream(fileIn);
        OutputStream outputStream = new FileOutputStream(fileOut);

        Reader reader = new FileReader(fileIn);
        Writer writer = new FileWriter(fileOut);
        byte[] bytes = new byte[1024];
        int i;
        while ((i = inputStream.read(bytes)) != -1) {
            String str = new String(bytes, 0, i);
            System.out.println(str);
        }
    }

    public static void copyFile(File fileIn, File fileOut) {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        Reader reader = null;
        try {
             reader = new FileReader(fileIn);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Writer writer = null;
        try {
            writer = new FileWriter(fileOut);
        } catch (IOException e) {
            e.printStackTrace();
        }
        OutputStream outputStream = null;
        OutputStreamWriter outputStreamWriter = null;


        try {
            //创建输入流
            inputStream = new FileInputStream(fileIn);
            //创建转换输入流
            inputStreamReader = new InputStreamReader(inputStream);

            //创建输出流
            outputStream = new FileOutputStream(fileOut);
            //创建转换输出流
            outputStreamWriter = new OutputStreamWriter(outputStream);

            int result = 0;
//            while ((result = inputStream.read()) != -1) {
//                outputStream.write(result);
//            }
            outputStreamWriter.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                outputStreamWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
