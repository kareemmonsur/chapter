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
        outputSales();
        System.out.println(getMinimum());
        System.out.println(getMaximum());
        System.out.println(getAverage());
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

