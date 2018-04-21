// Uses Two classes to copy input file into an output file
import java.io.*;

class CopyFile {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("file.txt");
            out = new FileOutputStream("newfile.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }
}