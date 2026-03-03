import java.util.Scanner;

public class Obs{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.println("----OGRENCI BILGI SISTEMI----");

        System.out.print("Ad/Soyad: ");
        String nick=input.nextLine();
        System.out.print("Ogrenci numaraniz: ");
        int number=input.nextInt();

        System.out.print("Not ortalaminiz(GPA): ");
        double gpa=input.nextDouble();

        System.out.println("----Ogrenci Karti----");
        System.out.printf("İsim-Soyisim: %s%nOgrenci no: %d%nGPA: %.2f%n", nick, number, gpa);

        input.close();
    }
}
