public class Tax {

    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    int filingStatus;
    double taxableIncome;
    
    int[][] brackets = {{8350, 33950, 82250, 171550, 372950},  // Single filer
                        {16700, 67900, 137050, 20885, 372950}, // Married jointly// -or qualifying widow(er)
                        {8350, 33950, 68525, 104425, 186475},  // Married separately
                        {11950, 45500, 117450, 190200, 372950} // Head of household
                        };
    double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
    
    Tax()
    {
        this.filingStatus = SINGLE_FILER;
        this.taxableIncome = 400000;
    }
    Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome)
    {
        if(filingStatus == 0){this.filingStatus = SINGLE_FILER;}
        else if(filingStatus == 1){this.filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;}
        else if(filingStatus == 2){this.filingStatus = MARRIED_SEPARATELY;}
        else {this.filingStatus = HEAD_OF_HOUSEHOLD;}

        this.taxableIncome = taxableIncome;
        this.brackets = brackets;
        this.rates = rates;
    }

    public void setStatus(int status)
    {   
        if(status == 0){this.filingStatus = SINGLE_FILER;}
        else if(status == 1){this.filingStatus = MARRIED_JOINTLY_OR_QUALIFYING_WIDOW;}
        else if(status == 2){this.filingStatus = MARRIED_SEPARATELY;}
        else {this.filingStatus = HEAD_OF_HOUSEHOLD;}
    }
    public void setTaxableIncome(double income)
    {
        this.taxableIncome = income;
    }
    public void setBrackets(int[][] brackets)
    {
        this.brackets = brackets;
    }
    public void setRates(double[] rates)
    {
        this.rates = rates;
    }
    public String getStatus()
    {
        String s = "";
        if(filingStatus == 0){s = "Single filer";}
        else if(filingStatus == 1){s = "Married jointly or qualifying widow(er)";}
        else if(filingStatus == 2){s = "Married separately";}
        else {s = "Head of household";}

        return s;
    }
    public double getTaxableIncome()
    {
        return this.taxableIncome;
    }
    public int[][] getBrackets()
    {
        return this.brackets;
    }
    public double[] getRate()
    {
        return this.rates;
    }
    public double getTax()
    {
        int status = this.filingStatus;
        double income = this.taxableIncome;
        
        double tax = brackets[status][0] * rates[0] +
                    (brackets[status][1] - brackets[status][0]) * rates[1] +
                    (brackets[status][2] - brackets[status][1]) * rates[2] +
                    (brackets[status][3] - brackets[status][2]) * rates[3] +
                    (brackets[status][4] - brackets[status][3]) * rates[4] +
                    (income - brackets[status][4]) * rates[5];
        return tax;
    }
}
