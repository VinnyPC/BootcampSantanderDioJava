import Interfaces.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico {


    @Override
    public void ligarTelefone() {
        System.out.println("Ligando");
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
