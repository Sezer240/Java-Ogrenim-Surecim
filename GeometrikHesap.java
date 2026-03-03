import java.util.Scanner; 

public class GeometrikHesap{
    
    static double calculateDiameter(double r){
        double diameter= 2*r;
        return diameter;
    }
    static double calculateArea(double r){
        double area = Math.PI*r*r;
        return area;
    }
    static double calculatePerimeter(double r){
        double perimeter = 2*Math.PI*r;
        return perimeter; 
    }
    static double calculateVolume(double r){
        double volume = (4.0/3)*Math.PI*Math.pow(r,3);
        return volume;
    }
    static double calculateSurfaceArea(double r){
        double surfacearea=4*Math.PI*Math.pow(r,2);
        return surfacearea;
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Dairenin yaricapini(r) giriniz: ");
        double r=input.nextDouble();

        System.out.printf("Dairenin capi: %.2f\n", calculateDiameter(r));
        System.out.printf("Dairenin alani: %.2f\n",calculateArea(r));
        System.out.printf("Dairenin cevresi: %.2f\n",calculatePerimeter(r));
        System.out.printf("Kurenin hacmi: %.2f\n",calculateVolume(r));
        System.out.printf("Kure yuzey alani: %.2f\n",calculateSurfaceArea(r));

        input.close();
    }
}
