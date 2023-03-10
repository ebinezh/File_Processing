import java.lang.*;
import java.util.*;
import java.io.File;

class FileProcessEx8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the file name with extension :");
        String name = scan.nextLine();
        File file = new File(name);
        String path = file.getAbsolutePath();
        System.out.println("File exists : " + file.exists());
        System.out.println("Readable : " + file.canRead());
        System.out.println("Writable : " + file.canWrite());
        System.out.println("Length of file : " + file.length() + " bytes");
        System.out.println("File Type : " + getExtension(path));
    }

    public static String getExtension(String path) {
        int dot = path.lastIndexOf(".");
        return path.substring(dot + 1);
    }
}