public class Main {
    public static void main(String[] args) {

        long[] sales = {1, 2, 3, 4, 5, 6};
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Max:" +salesManager.max());
    }
}
