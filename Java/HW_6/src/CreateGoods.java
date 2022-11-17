public class CreateGoods {
    Goods goods;

    public CreateGoods() {
        goods = new Goods();
        goods.name = CONST.EMPTY;
        goods.price = CONST.NUL_NUM;
        goods.count = CONST.NUL_NUM;
        goods.description = new StringBuilder(CONST.EMPTY);
    }

    public CreateGoods setName(String name) {
        goods.name = name;
        return this;
    }

    public CreateGoods setPrice(int price) {
        goods.price = price;
        return this;
    }

    public CreateGoods setCount(int count) {
        goods.count = count;
        return this;
    }

    public CreateGoods setDescription(String description) {
        goods.description.setLength(0);
        goods.description.append(description);
        return this;
    }

    public Goods Create(){
        return goods;
    }
}
