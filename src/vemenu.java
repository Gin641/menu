import javafx.scene.transform.Scale;

import java.util.Scanner;

public class vemenu {
    public static void main(String[] args) {
        int choise = -1;
        Scanner sc = new Scanner(System.in);
        while (choise != 0) {
            System.out.println("menu");
            System.out.println("1.tam giac nguoc");
            System.out.println("2.hinh chu nhat");
            System.out.println("3.HCN");
            System.out.println("0.exit");
            System.out.println("nhập số bạn chọn: ");
            choise = sc.nextInt();
            switch (choise) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("no choise!");
            }
        }
    }
}
