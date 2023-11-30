package KEK;

import java.util.Scanner;

public class YeniSınıf {
    public static void main(String[] args) {

                Scanner scanner=new Scanner(System.in);


        String worlds;
 //ÖDEV 1- SADECE SCANNER OLARAK KELİME YANSITILACAK.
        System.out.println("ÖDEV 1- HELLOOOOO , WORLDDDDD");

 //ÖDEV 2- TÜM KELİMELER BÜYÜK HARF OLUCAK.
        String dize="ödev 2- emre aybar";
        dize=dize.toUpperCase();
        System.out.println(dize);

//  ÖDEV 3- TÜM KELİMELER KÜÇÜK OLACAK .
        String dize1="ödev 3- EMRE  AYBAR";
        dize1=dize1.toLowerCase();
        System.out.println(dize1);


 //ÖDEV-4
        //Burada bir cümle yazın ve başlangıç ve bitişini giriniz ,
        // daha sonra arasındaki cümleyi alacktır.

                System.out.print("Bir dize girin: ");
                String input = scanner.nextLine();

                System.out.print("Başlangıç indeksi: ");
                int start = scanner.nextInt();
                    System.out.print("Bitiş indeksi: ");
                        int end = scanner.nextInt();
                            String str =input.substring(start,end);
                                System.out.println(str);







            }
        }




