import java.util.Scanner;

public class DaireAC {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        double yaricap,cevre,alan,dilimalani,dilim,pi=3.14;
        System.out.print("Selam\nYaricapini girdigin dairenin alanini ve cevresini hesaplarim\n");
        System.out.println("Dairenin yaricapini giriniz");
        yaricap=girdi.nextDouble();
        cevre=2*pi*yaricap;
        alan=pi*yaricap*yaricap;
        System.out.print("dairenin alani= ");
        System.out.println(alan);
        System.out.print("dairenin cevresi= ");
        System.out.println(cevre);

        System.out.println("isterseniz dairenin icinden bir pasta diliminin alaninida hesaplarim");
        System.out.println("hesaplanmasini istediginiz dilimin merkez acisi nedir");
        dilim=girdi.nextDouble();
        dilimalani=alan*dilim/360;

        //dilimalani=alan*((360*dilim)/100);
        System.out.println("daire diliminin alan= " + dilimalani);

    }

}
