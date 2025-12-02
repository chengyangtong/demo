import java.util.ArrayList;
@Service
public class GoodsServiceImpl implements GoodsService {
    private static ArrayList<Goods> goodsList = new ArrayList<Goods>();
    @0verride
    public Boolean saveGoods(Goods goods) {
        goodsList.add(goods);
        return true;
    }
    @0verride 
    public ArrayList<Goods> getGoods() {
        return goodsList;
    }
}