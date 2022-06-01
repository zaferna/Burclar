import java.util.Scanner;

public class burclar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ay, gun;
        System.out.print("Ay Giriniz :");
        ay = in.nextInt();
        System.out.print("Gun Giriniz :");
        gun = in.nextInt();
        if (ay == 1) {
            if (gun >= 22 && gun <= 31) {
                System.out.print("Kova Burcu");
            } else if (gun >= 1 && gun <= 21) {
                System.out.print("Oglak Burcu");
            } else {
                System.out.print("Hatali Gun");
            }
        }
        if (ay == 2) {
            if (gun >= 20 && gun <= 28) {
                System.out.print("Balik Burcu");
            } else if (gun >= 1 && gun <= 19) {
                System.out.print("Kova Burcu");
            } else {
                System.out.print("Hatali Gun");
            }
        }


        if(ay ==3)

    {
        if (gun >= 21 && gun <= 31) {
            System.out.print("Boga Burcu");
        } else if (gun >= 1 && gun <= 20) {
            System.out.print("Balik Burcu");
        } else {
            System.out.print("Hatali Gun");
        }
    }
}
}
