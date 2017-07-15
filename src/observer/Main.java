package observer;

import java.util.UUID;
import java.util.stream.IntStream;

/**
 * Created by Justyna on 12.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        BigLotto lotto=new BigLotto();

        LottoPlayer oskarLotto = new LottoPlayer("oskar");
        LottoPlayer justynaLotto = new LottoPlayer("justyna");
        LottoPlayer tomaszLotto = new LottoPlayer("tomasz");


        IntStream.range(1,5)
                .mapToObj(s->new LottoPlayer(UUID.randomUUID().toString()))
                .forEach(s->lotto.addObserver(s));

        lotto.addObserver(oskarLotto);
        lotto.addObserver(justynaLotto);
        lotto.addObserver(tomaszLotto);

        lotto.doLotto();
        System.out.println("ups,slaba wygrana!");

        lotto.doLotto();

    }
}
