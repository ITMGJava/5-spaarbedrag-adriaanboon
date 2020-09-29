import java.util.Scanner;

public class Spaarbedrag {

    public static void main(String[] args) {

    //keyboard variabele bevat invoer van het toetsenbord.

    var keyboard = new Scanner(System.in);

    System.out.println("Voer een getal in, dan wordt de rente over de tien komende jaren uitgerekend!");

    //vang het ingevoerde getal af.
    int invoerGetal=keyboard.nextInt();
    double rente = 0.055;
    double Samengestelderente = invoerGetal;

    //Reken de rente over de komende 10 jaar van ingevoerd getal uit met een loop.
    for (int teller = 1; teller <= 10; teller++) {
        Samengestelderente = Samengestelderente * (1+rente);
        double roundoff=Math.round(Samengestelderente*100.0)/100.0;

        System.out.print("Jaar "+teller+ ": ");
        System.out.println(roundoff);

    }
    keyboard.close();
}
}
