import Interfaces.ReprodutorMusical;

import java.util.ArrayList;
import java.util.List;

public class TocadorDeMusica implements ReprodutorMusical {


    @Override
    public void tocarMusica() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("selecionando musica");
    }
}
