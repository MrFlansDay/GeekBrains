public class Goods {
    public int count;
    public String name;
    public double price;
    public StringBuilder description;

    public void print() {
        System.out.printf("%s %d %f %s", name, count, price, description.toString());
    }
}
