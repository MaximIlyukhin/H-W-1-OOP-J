public class Diapers extends ProductsForChildren {
    protected int size;
    protected float minWeight;
    protected float maxWeight;
    protected String type;

    public Diapers(String name, double price, int quantity, String unit, int minAge, boolean hypoallergenic, int size,
            float minWeight, float maxWeight, String type) {
        super(name, price, quantity, unit, minAge, hypoallergenic);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Название - " + name +
                ", цена = " + price +
                ", количество = " + quantity +
                ", единица измерения = " + unit +
                ", размер = " + size +
                ", минимальный вес = " + minWeight +
                ", максимальный вес = " + maxWeight +
                ", тип = " + type;
    }
}
