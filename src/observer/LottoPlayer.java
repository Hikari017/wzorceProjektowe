package observer;

/**
 * Created by LottoPlayer on 12.07.2017.
 */
public class LottoPlayer implements Observer{
private String name;
public LottoPlayer(String name){
    this.name=name;
}
    @Override
    public void update() {
        System.out.println(name+ "!"+ " Odbylo sie losowanie, zaraz bedzie w TV! leć");

    }
}
