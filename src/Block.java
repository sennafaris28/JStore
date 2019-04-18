import java.util.Scanner;

public class Block {
    public static String hashCode = "ABC";
    public static String previousHash = "empty";
    public static String data = "null";
    public static int counter = 123;
    public String newHash;

    public Block() {
        setHashCode();
    }

    public void setHashCode() {
        if (previousHash == "empty") {
            previousHash = "0";
        } else {
            previousHash = hashCode + (counter - 1);
        }

        newHash = hashCode + counter;
        counter = counter + 1;
        System.out.println("Hash Code = " + newHash);
        setData();
        System.out.println("Previous Hash = " + getPreviousHash());
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public String getData() {
        return data;
    }

    public void setData() {
        Scanner data = new Scanner(System.in);
        this.data = data.nextLine();
        System.out.println("Data = " + this.data);
    }

    public static void main(String args[]) {

        Block block1 = new Block();

        Block block2 = new Block();

        Block block3 = new Block();

        Block block4 = new Block();

        Block block5 = new Block();
    }

}
