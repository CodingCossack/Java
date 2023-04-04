// Suppose you are a university student and you need to pay 1536 dollars as a tuition fee.
// The college is offering a 10% discount on the early payment. How much money do you have to pay if you make an early payment?

class Main {
    public static void main(String[] args) {

        double fee = 1536;
        double discountPercent = 10;

        // compute discount amount
        double discount = (fee / 100 * discountPercent);

        double finalFee = fee - discount;
        System.out.println(finalFee);

    }
}