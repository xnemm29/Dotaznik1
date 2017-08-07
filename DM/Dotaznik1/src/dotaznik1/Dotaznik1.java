/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dotaznik1;

/**
 *
 * @author Student
 */
public class Dotaznik1 {

    /**
     * @param args the command line arguments
     */
    //funkce na zadávání údajů o osobách
    public static byte[] zadejUdaje(byte[] aPole) {
        Scanner sc = new Scanner(System.in);
        int poradi = 0;  //pomocná prom. - pořadí záznamu v poli

        while (true) {   //zadává se tak dlouho, dokud uživatel neřekne 'n'
            System.out.println("Nový záznam:");

            System.out.println("Pohlaví (m/ž)?");  //poslední bit: pohlaví
            String pom = sc.nextLine();
            if (pom.equals('m')) {
                //nula zůstane nulou
            } else {
                aPole[poradi] += 1;
            }
            Integer.toBinaryString(aPole[poradi] >> 1);

            System.out.println("Příjem (a/n)?");  //předposlední bit: příjem
            pom = sc.nextLine();
            if (pom.equals('n')) {
                //nula zůstane nulou
            } else {
                aPole[poradi] += 1;
            }
            Integer.toBinaryString(aPole[poradi] >> 1);

            System.out.println("Měsíc narození (mm)?");  //třetí až šestý bit: měsíc narození
            pom = sc.nextLine();
            if (0 < Integer.parseInt(pom) && Integer.parseInt(pom) < 13) {
                aPole[poradi] += Integer.parseInt(pom);
            } else {
                //nula značí chybné zadání
            }
            Integer.toBinaryString(aPole[poradi] >> 4);

            System.out.println("Stav (s-svobodný; jinak ženatý/vdaná)?");  //druhý bit: stav
            pom = sc.nextLine();
            if (pom.equals('s')) {
                //nula zůstane nulou
            } else {
                aPole[poradi] += 1;
            }
            Integer.toBinaryString(aPole[poradi] >> 2); //posunutí na pův. pořadí v bytu

            System.out.println("Přeješ si pokračovat v zadávání (a/n)?");
            pom = sc.nextLine();
            if (pom.equals('n')) {
                return aPole;
            } else {
                poradi += 1;
            }
        }
    }

    public static void main(String[] args) {

        //Vytvoreni promennych a pole 1000 osob MIRKA (pole bytu, po 8 bitu)
        byte[] aPole = new byte[1000];
        /*předpoklad David: počítám s tím, že pole bude naplněno nulami */

        //Naplneni - od zadu: pohlavi,prijem,mesiac narodenia a stav - DAVID
        aPole = zadejUdaje(aPole);

        //vypis -MIRKA    
    }

    public static void identifikace() {

    }

    public static void vypis(byte[] aPole) {

        System.out.println("pohlavi: ");
        System.out.println("prijem: ");
        System.out.println("mesic narozeni: ");
        System.out.println("stav: ");

    }
}
