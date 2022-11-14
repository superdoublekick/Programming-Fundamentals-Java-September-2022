import java.util.Scanner;

public class ExtractFiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();

        String[] pathPart = path.split("\\\\");
        String fullFileName = pathPart[pathPart.length - 1];
        String fileName =fullFileName.split("\\.")[0];
        String extension =fullFileName.split("\\.")[1];

        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s%n", extension);
    }
}
