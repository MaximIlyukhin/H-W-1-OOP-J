public class Lemonade extends Drinks {
    public Lemonade(String name, double price, int quantity, String unit, double valume) {
        super(name, price, quantity, unit, valume);
    }

    @Override
    public String toString() {
        return "Название - " + name +
                ", цена = " + price +
                ", количество = " + quantity +
                ", единица измерения = " + unit +
                ", объём =" + valume;
    }
}
