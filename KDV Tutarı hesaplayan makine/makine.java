import java.util.Scanner;

public class makine {
    public static void main(String[] args) {
        double fiyat , kdvlifiyat , ustsinir;

        ustsinir = 1000;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Ürün Fiyatını Giriniz : ");
        fiyat = input.nextDouble();
        
        kdvlifiyat = fiyat <= ustsinir ? fiyat * 1.18 : fiyat * 1.08;

        System.out.print("Ürünün KDV'li Fiyatı : " + kdvlifiyat);

        
    }
    
}
