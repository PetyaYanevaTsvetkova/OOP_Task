package oopTask;

public class Order {
    private int year;
    private double amount;
    private boolean isEOrder;
    private long maxNumOfPages;
    private double numberOfPages;
    private double numberOFPagesLeft;
    private String employSignature;


    public Order(int year, double amount, boolean isEOrder, long maxNumOfPages, double numberOfPages, String employSignature) {
        setYear(year);
        setAmount(amount);
        setEOrder(isEOrder);
        setMaxNumOfPages(maxNumOfPages);
        setNumberOfPages(numberOfPages);
        setNumberOFPagesLeft();
        setEmploySignature(employSignature);
    }

    public void changeEmploySignature(String newEmploySignature) {
        this.employSignature = newEmploySignature;
    }

    public void usedPages(double pages) {
        if (pages > this.numberOFPagesLeft) {
            throw new IllegalArgumentException("The entered pages can't be more than the number of pages left");
        }
        this.numberOFPagesLeft -= pages;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Order.class.getSimpleName());
        sb.append(System.lineSeparator());
        sb.append("year=" + getYear() +
                ", amount=" + getAmount() +
                ", isEOrder=" + isEOrder +
                ", maxNumOfPages=" + maxNumOfPages +
                ", numberOfPages=" + numberOfPages +
                ", numberOFPagesLeft=" + numberOFPagesLeft +
                ", employSignature='" + employSignature);

        return sb.toString();
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        if (year < 2022) {
            System.out.println("enter valid year");
        }
        this.year = year;
    }

    public double getAmount() {
        return amount;
    }

    private void setAmount(double amount) {
        if (amount < 0) {
            throw new ArithmeticException("The amount can't be under zero");
        }
        this.amount = amount;
    }

    public boolean isEOrder() {
        return isEOrder;
    }

    public void setEOrder(boolean EOrder) {
        this.isEOrder = EOrder;
    }

    public long getMaxNumOfPages() {
        return maxNumOfPages;
    }

    private void setMaxNumOfPages(long maxNumOfPages) {
        if (maxNumOfPages <= 0) {
            throw new IllegalArgumentException("Max number of pages can't be under or equals to zero.");
        }
        this.maxNumOfPages = maxNumOfPages;
    }

    public double getNumberOfPages() {
        return numberOfPages;
    }

    private void setNumberOfPages(double numberOfPages) {
        if (numberOfPages < 0) {
            throw new IllegalArgumentException("Number of pages can't be under zero.");
        }
        this.numberOfPages = numberOfPages;
    }

    public double getNumberOFPagesLeft() {
        return numberOFPagesLeft;
    }

    private void setNumberOFPagesLeft() {
        this.numberOFPagesLeft = this.maxNumOfPages - this.numberOfPages;
    }

    public String getEmploySignature() {
        return employSignature;
    }

    private void setEmploySignature(String employSignature) {

        if(employSignature.isEmpty()) {
            throw new IllegalArgumentException("The name of the employee can't be blank.");
        }
        this.employSignature = employSignature;
    }
}
