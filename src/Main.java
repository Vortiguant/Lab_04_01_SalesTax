class main
{
    void main() // Public static void main (String[] Args)
    {
        double purchasePrice = 23.50;
        double total = 0;
        double salesTax = 0;
        final double RATE = 0.05;

        salesTax = RATE * purchasePrice;
        total = salesTax + purchasePrice;

        IO.println("The total is " + total + " and the tax is " + salesTax);

    }
}