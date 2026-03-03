import java.util.Scanner;

public class NotSistemi{

    static double calculateAverage(double v, double f, double odev){
        return (v*0.3) + (f*0.4) + (odev*0.3);
    }
    static boolean isPassingGrade(double average){
        return average>=50;
    }
    static String getLetterGrade(double average){
        if(average>=90){
            return "A";
        }else if (average>=80){
            return "B";
        }else if(average>=70){
            return "C";
        }else if(average>=60){
            return "D";
        }else
            return "F";
    }
    static boolean isHonorList(double average, double v, double f, double odev){
        return (average>=85&&v>=70&&f>=70&&odev>=70);
    }
    static boolean hasRetakeRight(double average){
        return (average>=40&& average<50);
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Vize puanin kac?   ");
        double v=input.nextDouble();

        System.out.print("Final puanin kac?  ");
        double f=input.nextDouble();

        System.out.print("Odev puanin kac?   ");
        double odev=input.nextDouble();

        double ortalama=calculateAverage(v, f, odev);

        System.out.println("===OGRENCI NOT RAPORU===");
        System.out.println("Ortalama: " + ortalama);
        System.out.println("Harf notu: " + getLetterGrade(ortalama));
        System.out.println("Durum: " + (isPassingGrade(ortalama) ? "Tebrikler gectiniz" : "Maalesef kaldiniz"));
        System.out.println("Onur Listesi: " + (isHonorList(ortalama, v, f, odev)? "EVET" : "HAYIR"));
        System.out.println("Bütünleme: " + (hasRetakeRight(ortalama)? "VAR" : "YOK"));

        input.close();
    }
}
