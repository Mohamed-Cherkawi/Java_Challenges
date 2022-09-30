
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

class Main {
    public static void main(String[] args) {
        dessinerTriangle();
    }

    public static void dessinerTriangle() {
        Scanner scanerObj = new Scanner(System.in); // Create an object from Scanner Class to read
        // Variables
        byte row ;
        String symbol , motif;

        while(true) {
            System.out.println("Entrez le symbole que vous voulez (1 Character): ");
            symbol = scanerObj.next();
            if( symbol.length() != 1 ){
                continue ;
            } else {
                System.out.println("Vous avez choisi le symbole : " + symbol + "\n");
                break ;
            }
        }


        while ( true ) {
            System.out.println("Choissisez un nombre de ligne entre 8 et 35 : ");
            row = scanerObj.nextByte();

            if( !( row >= 8 && row <= 35 ) ){
                continue ;
            }else {

                System.out.println("nombre de ligne  choisi : " + row);
                break ;
            }
        }

        while(true) {
            System.out.println("Entrez le motif que vous souhaitez decorer le sapin (entre 3 et 25 Charactere): ");
            motif = scanerObj.next();

            if( !(motif.length() >= 3 && motif.length() <= 25) ){
                continue ;
            } else {
                System.out.println("Vous avez choisi le motif suivant : " + motif );
                break ;
            }
        }
        // Closing Buffer reader
        scanerObj.close();

        //     // Height , Row
        //     ArrayList<Byte> triangleShapeSizes = new ArrayList<Byte>();
        //     triangleShapeSizes.add(height);
        //     triangleShapeSizes.add(row);
        //     for (byte i : triangleShapeSizes) {}
        // Displaying The triangle

        System.out.println("La forme de votre triangle est la suivante : \n");

        // loop to iterate for the given number of rows
        for (int i = 1; i <= row; i++) {

            // loop to print the number of spaces before the star
            for (int j = row; j >= i; j--) {
                System.out.print(" ");
            }

            // loop to print the number of stars in each row
            for (int j = 1; j <= i; j++) {
                if( j != 1 ){
                    for ( int counter = 0 ;counter < row ; counter+= 13 ) {
                        System.out.print(motif);
                    }
                }
                System.out.print(symbol);
            }

            // for new line after printing each row
            System.out.println();
        }

    }
}