import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mesafe, yas, normalTutar, yasIndirim, indirimliTutar, indirimOrani, yasOrani, gidisDonus, gidisDonusT;
        int tip;
        System.out.println("Mesafeyi km türünden giriniz :");
        mesafe = input.nextDouble();
        System.out.println("Yaşınızı giriniz :");
        yas = input.nextDouble();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş )");
        tip = input.nextInt();
        indirimOrani = 1;

        if (yas>0 && yas < 12) {
            indirimOrani = 0.50;
        }
        else if (12 < yas && yas < 24)
       {
            indirimOrani = 0.10;
        }
        if (yas > 24 && yas < 65) {
            indirimOrani=1;

        } else if (yas >= 65) {
            indirimOrani = 0.30;
        }
        else
        {
            System.out.println("Geçerli km giriniz.");
        }

        normalTutar = mesafe * 0.10;
        yasIndirim = normalTutar * indirimOrani;
        indirimliTutar = normalTutar - yasIndirim;
        switch(tip)
        {
            case 1:
                System.out.println("Toplam tutarınız: " + indirimliTutar);
                break;
            case 2:
                gidisDonus = indirimliTutar * 0.20;
                gidisDonusT = (indirimliTutar - gidisDonus) * 2;
                System.out.println("Toplam tutarınız: " + gidisDonusT);
                break;
            default:
                System.out.println("Geçerli bir gidiş dönüş seçimi yapınız.");
        }

    }
}
