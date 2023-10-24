public class Stock {
    String symbol = "ORCL";
    String name = "Oracle Corporation";
    double previousClosingPrice = 34.5;
    double currentPrice = 34.35;

    Stock(){}
    Stock(String Symbol, String Name, double Previous, double Current)
    {
        symbol = Symbol;
        name = Name;
        previousClosingPrice = Previous;
        currentPrice = Current;
    }

    public void getChangePercent()
    {
        double percentage = ((currentPrice - previousClosingPrice)*100)/previousClosingPrice;

        System.out.println("Symbol: " + symbol);
        System.out.println("Name: " + name);
        System.out.println("Previous Closing Price: " + previousClosingPrice);
        System.out.println("Current Price: " + currentPrice);
        System.out.println("Price Change: " + percentage + "%");
    }
}
