import java.io.File;
import java.util.Scanner;
public class FileDemonsration {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter file or derectory name: ");
            analyzePath(input.nextLine());
        }
    }

    public static void analyzePath(String path) {
        File namefile = new File(path);
        if (namefile.exists()) {
            System.out.printf("%s%s\n%s\n%s\n%s\n",
                    namefile.getName(), "exists",
                    (namefile.isFile() ? "is a file" : "is not a file"),
                    (namefile.isDirectory() ? "is a directory" : "is not a directory"),
                    (namefile.isAbsolute() ? "is an absolute path" : "is not an absolute path"), "Last modified: " + namefile.lastModified(), "Length: " + namefile.length(), "Path: " + namefile.getPath(), "Absolute path: " + namefile.getAbsolutePath(), "Parent: " + namefile.getParent(),
                    (namefile.isFile() ? "Size: " + namefile.length() + " bytes" : ""),
                    (namefile.isFile() ? "Last modified: " + namefile.lastModified() : ""),
                    (namefile.isDirectory() ? "Contains: " + namefile.list().length + " files" : ""));
                    if(namefile.isDirectory()) {
                        System.out.println("Files in directory: ");
                        String[] directory = namefile.list();
                        System.out.println("Files in content: \n");
                        for (String directoryName : directory) {
                            System.out.println(directoryName);
                        }
                        
                    } else {
                        System.out.printf("%s %s", path, "does not exist");
                    }
            
        }
        
    }
}
