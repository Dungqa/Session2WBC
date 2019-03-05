import java.util.Scanner;

public class luyentapmang {
    public static void main(String[] args) {
        String[] students = {"Dũng", "Tú", "Nam", "Tráng", "Hà", "Trang"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
        String input_name = sc.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist)
            System.out.println( input_name + " *éo có trong danh sách lớp");
    }
}
