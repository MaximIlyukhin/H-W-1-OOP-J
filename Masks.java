public class Masks extends HygieneItems {
    public Masks(String name, double price, int quantity, String unit, int numberOfPieces) {
        super(name, price, quantity, unit, numberOfPieces);
    }

    @Override
    public String toString() {
        return "Название - " + name +
                ", цена = " + price +
                ", количество = " + quantity +
                ", единица измерения = " + unit +
                ", количество штук в упаковке =" + numberOfPieces + "]";
    }
}
