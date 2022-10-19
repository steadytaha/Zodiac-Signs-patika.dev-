import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int month, day;
        boolean isError = false;
        String zodiacSign = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz (Ocak = 1): ");
        month = input.nextInt();

        System.out.print("Doğduğunuz günü giriniz: ");
        day = input.nextInt();

        switch (month){
            case 1:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiacSign = "Oğlak burcusunuz!";
                    } else {
                        zodiacSign = "Kova burcusunuz!";
                    }
            }   else {
                    isError = true;
                }
                break;
            case 2:
                if (day >= 1 && day <= 28) {
                    if (day < 20) {
                        zodiacSign = "Kova burcusunuz!";
                    } else {
                        zodiacSign = "Balık burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 3:
                if (day >= 1 && day <= 31) {
                    if (day < 21) {
                        zodiacSign = "Balık burcusunuz!";
                    } else {
                        zodiacSign = "Koç burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 4:
                if (day >= 1 && day <= 30) {
                    if (day < 21) {
                        zodiacSign = "Koç burcusunuz!";
                    } else {
                        zodiacSign = "Boğa burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 5:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiacSign = "Boğa burcusunuz!";
                    } else {
                        zodiacSign = "İkizler burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 6:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        zodiacSign = "İkizler burcusunuz!";
                    } else {
                        zodiacSign = "Yengeç burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 7:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiacSign = "Yengeç burcusunuz!";
                    } else {
                        zodiacSign = "Aslan burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 8:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        zodiacSign = "Aslan burcusunuz!";
                    } else {
                        zodiacSign = "Başak burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 9:
                if (day >= 1 && day <= 31) {
                    if (day < 23) {
                        zodiacSign = "Başak burcusunuz!";
                    } else {
                        zodiacSign = "Terazi burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 10:
                if (day >= 1 && day <= 30) {
                    if (day < 23) {
                        zodiacSign = "Terazi burcusunuz!";
                    } else {
                        zodiacSign = "Akrep burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 11:
                if (day >= 1 && day <= 31) {
                    if (day < 22) {
                        zodiacSign = "Akrep burcusunuz!";
                    } else {
                        zodiacSign = "Yay burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            case 12:
                if (day >= 1 && day <= 30) {
                    if (day < 22) {
                        zodiacSign = "Yay burcusunuz!";
                    } else {
                        zodiacSign = "Oğlak burcusunuz!";
                    }
                }   else {
                    isError = true;
                }
                break;
            default:
                isError = true;
        }

        if (isError){
            System.out.println("Lütfen bilgilerinizi kontrol ediniz!");
        } else {
            System.out.println(zodiacSign);
        }
    }
}