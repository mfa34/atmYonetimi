import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName , password;
        int remainScore =3 ;
        int liquid=0 ;
        int selection;
        int price;
        Scanner input = new Scanner(System.in);
        while (remainScore>0){
            System.out.println("==========Merhabalar AYDIN Bank'a hosgeldiniz========== ");
            System.out.println("==========Lutfen Kullanici adinizi giriniz : ==========");
            userName = input.nextLine();
            System.out.println("==========Lutfen Parolanizi giriniz :==========");
            password = input.nextLine();


            if (userName.equals("mfa34") && (password.equals("mfa123"))){
                System.out.println("Sisteme Basarali Bir Sekilde Giris Gerceklestirdiniz.");
                do {
                    System.out.println("\n 1-PARA YATIRMA \n 2-PARA CEKME \n 3-BAKIYE SORGULAMA \n 4-CIKIS");
                    System.out.print("Lutfen yapmak istediginiz islemi seciniz:");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1 -> {
                            System.out.print("YATIRMAK ISTEDIGINIZ TUTARI GIRINIZ :");
                            price = input.nextInt();
                            liquid += price;
                            System.out.println("BAKIYENIZIN YENI TUTARI = " + liquid + "TL");
                        }
                        case 2 -> {
                            System.out.print("CEKMEK ISTEDIGINIZ TUTARI GIRINIZ:");
                            price = input.nextInt();
                            if (price > liquid) {
                                System.out.println("YETERLI BAKIYE BULUNMAMAKTADIR.");
                            } else {
                                liquid -= price;
                            }
                        }
                        case 3 -> System.out.println("BAKIYENIZ = " + liquid + "TL");
                    }

                }while (selection!=4);
                System.out.println("Tekrardan Gorusmek Uzere . Saglicakla Kalin :)");
                break;

            }else {
                remainScore --;
                System.out.println("Hatali Kullanici Adi veya  Sifre \n" +"Lutfen tekrar deneyiniz.");
                if (remainScore==0){
                    System.out.println("Hesabiniz 3 kez yanlis girisi sonucunda bloke olmustur.\n"+"Lutfen Bankamizla Iletisime Geciniz,");
                }
                System.out.println("Kalan Hatali Deneme Hakkiniz = " + remainScore);
            }
        }
    }
}
