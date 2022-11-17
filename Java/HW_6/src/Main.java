public class Main {
    public static void main(String[] args) {
        Goods goods = new CreateGoods().setName("SS").setPrice(12).setDescription("AAAA").Create();

        goods.print();
    }
}
