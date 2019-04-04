
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // int i = 0;
        // Scanner input = new Scanner(System.in);
        // System.out.println("Masukkan urutan anda");
        // String block


        Block block1 = new Block("ABC123", "0", "Data Satu");
        block1.printData();

        Block block2 = new Block("ABC124", "ABC123", "Data Dua");
        block2.printData();

        Block block3 = new Block("ABC125", "ABC124", "Data Tiga");
        block3.printData();

        Block block4 = new Block("ABC126", "ABC125", "Data Empat");
        block4.printData();

        Block block5 = new Block("ABC127", "ABC126", "Data Lima");
        block5.printData();
    }

}
