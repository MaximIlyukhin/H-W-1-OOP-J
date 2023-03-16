public class ToiletPaper extends HygieneItems{
    protected int NumberOfLayers;

    public ToiletPaper(String name, double price, int quantity, String unit, int numberOfPieces, int numberOfLayers) {
        super(name, price, quantity, unit, numberOfPieces);
        NumberOfLayers = numberOfLayers;
    }

    @Override
    public String toString() {
        return "Название - " + name + 
        ", цена = " + price + 
        ", количество = " + quantity + 
        ", единица измерения = " + unit +
        ", количество штук в упаковке = " + numberOfPieces + 
        ", количество слоёв = " + NumberOfLayers;
    }
}