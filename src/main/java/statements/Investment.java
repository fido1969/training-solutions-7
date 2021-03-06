package statements;

public class Investment {
    private double cost;
    private int fund;
    private int interestRate;
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(int days) {
        return ((double)fund*interestRate)/100/365*days;
    }

    public double close(int days) {
        double pay = active ? (fund + getYield(days)) * 0.997 : 0;
        active = false;
        return pay;
    }
}
