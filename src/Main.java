import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoş geldiniz...");

        String islemler = "işlemler...\n"
                + "1.Yazılımcı işlemleri\n"
                + "2.Yönetici işlemleri\n"
                + "Çıkış için q'ya basın";
        System.out.println("--------------------------------------");
        System.out.println(islemler);
        System.out.println("--------------------------------------");

        while(true){
            System.out.println("İşlemi seçiniz: ");
            String islem = scn.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Berat", "Tansu", 10, "Python, Java");
                String yazilimci_islem = "1. Format at\n"
                        + "2. Bilgileri Göster\n"
                        + "Çıkış için q'ya basın";
                System.out.println(yazilimci_islem);

                while (true){
                    System.out.println("İşlemi Seçiniz: ");
                    String y_islem = scn.nextLine();

                    if (y_islem.equals("q")){
                        System.out.println("Yazılımcı İşlemlerinden çıkılıyor...");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("İşletim Sistemi: ");
                        String isletim_Sistemi = scn.nextLine();
                        yazilimci.formatAt(isletim_Sistemi);
                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    }else {
                        System.out.println("Geçersiz yazılımcı işlemi!");
                    }
                }

            } else if (islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Beratti","tansiu", 100, 10);
                String yonetici_islem = "Yönetici İşlemleri;\n"
                                        + "1. Zam Yap\n"
                                        + "2. Bilgileri Göster\n"
                                        + "Çıkış için q'ya basın";
                System.out.println(yonetici_islem);

                while (true){
                    System.out.println("İşlemi Seçiniz...");
                    String yo_islem = scn.nextLine();

                    if (yo_islem.equals("q")){
                        System.out.println("Yönetici İşlemlerinden Çıkılıyor...");
                        break;
                    } else if (yo_islem.equals("1")) {
                        System.out.print("Yöneticinin ne kadar zam yapmasını istiyorsunuz? ");
                        int zam_miktari = scn.nextInt();
                        scn.nextLine();
                        yonetici.zamYap(zam_miktari);
                    } else if (yo_islem.equals("2")) {
                        yonetici.bilgileriGoster();
                    }else {
                        System.out.println("Geçersiz Yönetici İşlemi!");
                    }
                }
            }else {
                System.out.println("Geçersiz işlem!");
            }
        }

    }
}
