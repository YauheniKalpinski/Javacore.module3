import java.time.LocalDate;

public abstract class Flower {
    private double price;
    private LocalDate dateOfReceipt;
    private int expirationDate;
    private String colour;

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public LocalDate getDateOfReceipt() { return dateOfReceipt; }
    public void setDateOfReceipt(LocalDate dateOfReceipt) { this.dateOfReceipt = dateOfReceipt; }

    public int getExpirationDate() { return expirationDate; }
    public void setExpirationDate(int expirationDate) { this.expirationDate = expirationDate; }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public Flower(double price, LocalDate dateOfReceipt, int expirationDate, String colour) {
        this.price = price;
        this.dateOfReceipt = dateOfReceipt;
        this.expirationDate = expirationDate;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
