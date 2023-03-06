import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar programına hoş geldiniz.");

        String islemler = "İşlemler\n"
                        + "1.Yazılımcı işlemleri\n"
                        + "2.Çalışan işlemleri\n"
                        + "Çıkmak için q'ya basınız.";
        System.out.println("**********************************");
        System.out.println(islemler);
        System.out.println("**********************************");

        while (true){
            System.out.println("İşlemi seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("Sistemden çıkılıyor.");
                break;
            }
            else if (islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Erdem" , "Acar" , 554834 ,"Java");
                String yazilimci_islem = "1. Format at\n"
                                       + "2. Bilgileri göster\n"
                                       + "Çıkış için q'ya basınız";
                System.out.println(yazilimci_islem);

                while (true){
                    System.out.println("İşlemi seçiniz : ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor.");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("İşletim sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formaAT(isletim_sistemi);
                    }
                    else if (y_islem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yazılımcı işlemi.");
                    }

                }

            }
            else if (islem.equals("2")){
                Yonetici yonetici = new Yonetici("Erdem" , "Acar" , 322655 , 120);

                String yonetici_islem = "1. Zam yap\n"
                                      + "2. Bilgileri göster\n"
                                      + "Çıkış için q'ya basınız.";
                System.out.println(yonetici_islem);

                while (true){
                    System.out.println("İşlemi seçiniz");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yönetici sisteminden çıkılıyor");
                        break;
                    }
                    else if (y_islem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();

                        yonetici.zamYap(zamMiktari);
                    }
                    else if (y_islem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi.");
                    }
                }

            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }

    }
}
//erdemacar6
