
public class HygieneItems extends Products {
    protected int numberOfPieces;

    public HygieneItems(String name, double price, int quantity, String unit, int numberOfPieces) {
        super(name, price, quantity, unit);
        this.numberOfPieces = numberOfPieces;
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