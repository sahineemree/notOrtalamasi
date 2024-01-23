import java.util.*;
public class NotOrtalamasi {
    public static void main(String[] args) {

        //Değişkenleri oluştur.

        int mat , fizik , kimya , biyoloji , tarih;

        // Scanner sınıfını tanımlayın.

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin : ");
        mat = input.nextInt();

        System.out.print("Fizik notunuzu girin : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Biyoloji notunuzu girin : ");
        biyoloji = input.nextInt();

        System.out.print("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

double sonuc = mat + fizik + kimya + biyoloji + tarih ;

double Ortalama = sonuc / 5;

if(Ortalama>=50){
    System.out.println("Geçtiniz.");
}
else{
    System.out.println("Kaldınız.");
}

 System.out.println("ORTALAMANIZ : "  + Ortalama);

    }
}