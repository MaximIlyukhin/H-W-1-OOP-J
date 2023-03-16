public class Eggs extends FoodProducts {
    protected int numberOfPieces;

    public Eggs(String name, double price, int quantity, String unit, int expirationDate, int numberOfPieces) {
        super(name, price, quantity, unit, expirationDate);
        this.numberOfPieces = numberOfPieces;
    }

    @Override
    public String toString() {
        return "Название - " + name +
                ", цена = " + price +
                ", количество = " + quantity +
                ", единица измерения = " + unit +
                ", срок годности = " + expirationDate +
                ", количество в упаковке = " + numberOfPieces;
    }
}
