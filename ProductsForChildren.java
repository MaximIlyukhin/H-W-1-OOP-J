public class ProductsForChildren extends Products {
    protected int minAge;
    protected boolean Hypoallergenic;

    public ProductsForChildren(String name, double price, int quantity, String unit, int minAge,
            boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        Hypoallergenic = hypoallergenic;
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
