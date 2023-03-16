public class Nipples extends ProductsForChildren {
    public Nipples(String name, double price, int quantity, String unit, int minAge, boolean hypoallergenic) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
    }

    @Override
    public String toString() {
        return "Название - " + name +
                ", цена = " + price +
                ", количество = " + quantity +
                ", единица измерения = " + unit +
                ", минимальный возраст = " + minAge +
                ", гипоаллергенность = " + Hypoallergenic;
    }
}
