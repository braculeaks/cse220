public class FruitNode 
{
    // fruit[0] = String  : name  of the fruit
    // fruit[1] = Integer : price of the fruit
    Object[] fruit = new Object[2];
    FruitNode next;

    public FruitNode(String name, Integer price) {
        fruit[0] = name;
        fruit[1] = price;
    }
}
