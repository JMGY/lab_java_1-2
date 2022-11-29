import java.util.Scanner;

public class Hello {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.printf("Name: %s", name);
        in.close();
    }
}
