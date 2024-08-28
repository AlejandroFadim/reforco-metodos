import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {
    Integer avaliandoSorte(Integer numeroEscolhidos){

        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
        Integer qtdTentativas = 0;

        while (numeroSorteado != numeroEscolhidos){
            qtdTentativas++;
            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);


        }

        return qtdTentativas;

    }
}
