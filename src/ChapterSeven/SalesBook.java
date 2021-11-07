package ChapterSeven;

public class SalesBook {
    private String productName;
    private double[] prices;

    public SalesBook(String productName, double[] prices) {
        this.productName = productName;
        this.prices = prices;
    }

    public String getProduct() {
        return productName;
    }

    public void setProduct(String product) {
        this.productName = product;
    }

    public void processSales() {
       // outputSales();
        System.out.println(getMinimum());
        System.out.println(getMaximum());
        System.out.println(getAverage());
    }

//    private void outputSales() {
//        System.out.println("price are: ");
//        for(int customer = 0; customer<= prices.length; customer++)

    private double getAverage() {
        int sum = 0;
        for (double price : prices) {
            sum += price;
        }
        return sum/ prices.length;
    }

    public double getMinimum() {
        double lowestSales = prices[0];
        for (double price : prices) {
            if (price < lowestSales) ;
            lowestSales = price;
        }
        return lowestSales;
    }

    public double getMaximum() {
        double highestSales = prices[0];
        for (double price : prices) {
            if (price < highestSales) ;
            highestSales = price;
        }
        return highestSales;
    }














}

