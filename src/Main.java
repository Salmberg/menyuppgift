import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Välkommen! Välj ett nummer:");
        welcome();

    }
    static void welcome() {
        System.out.println("*============*");
        System.out.println("1. Addera två tal.");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng.");
        System.out.println("4. Summera alla tal i en sträng.");
        System.out.println("e. Avsluta");
        System.out.println("*============*");

        Scanner sc = new Scanner(System.in);
        String chosenNumber = sc.nextLine();

        if (chosenNumber.equals("1")) {
            summanAvTvaNummer();
        } else if (chosenNumber.equals("2")) {
            raknaBokstaver();
        } else if (chosenNumber.equals("3")) {
            spegel();
        } else if (chosenNumber.equals("4")) {
            summanAvAllaNummer();
        }
        fortsattaMedSpelet();
    }

    static void fortsattaMedSpelet(){
        System.out.println("Vill du fortsätta? svara ja eller nej ");
        Scanner sc = new Scanner(System.in);
        String jaElnej = sc.nextLine();
        if (jaElnej.equals("ja")) {
            welcome();
        } else if (jaElnej.equals("nej")) {
            achtung();
        }

    }

    private static void achtung() {
        System.out.println("Achtung");
    }

    static void summanAvTvaNummer(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in första siffran:");
        double nummer1 = sc.nextDouble();
        System.out.println("Skriv in den andra siffran:");
        double nummer2 = sc.nextDouble();
        double answer = nummer1 + nummer2;
        System.out.println("Summan är " + answer);
    }



    static void raknaBokstaver(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv meningen som du vill räkna bokstäver i:");
        String string = sc.nextLine();
        System.out.println("Ange bokstaven som du vill leta efter:");
        char c = sc.nextLine().charAt(0);
        int totalChars = 0;
        char temp;
        for (int i = 0; i < string.length(); i++) {
            temp = string.charAt(i);
            if (temp == c) {
                totalChars++;
            }
        }
        System.out.println("Bokstaven " + c + " finns " + totalChars + " gånger i din mening.  ");
    }





    static void spegel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Skriv meningen som du vill göra en 360 eller reversa");
        String string = sc.nextLine();
        for (int i = string.length() - 1; i >= 0; i--) {
            System.out.print(string.charAt(i));

        }
    }

    static void summanAvAllaNummer() {
        int number, digit, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Skriv in de tal du vill lägga ihop: ");
        number = sc.nextInt();
        while(number > 0)
        {
//finds the last digit of the given number
            digit = number % 10;
//adds last digit to the variable sum
            sum = sum + digit;
//removes the last digit from the number
            number = number / 10;
        }
//prints the result
        System.out.println("Summan är: "+sum);
    }

    }






