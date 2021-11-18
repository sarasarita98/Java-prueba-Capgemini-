package prueba.delegacion;

import prueba.Puerta;

public class PuertaTemporizadaD extends Puerta {

    private String name = "PUERTA";

    private AdaptadorPuertaTemporizador adaptador = new AdaptadorPuertaTemporizador(this);


    public void timeout() {
        setBloqueado(false);
        bloquear();
    }

    public void iniciar(TemporizadorD temporizador) {
        temporizador.registrar(adaptador);
        setBloqueado(true);
        desbloquear();
    }
    public String getName() {
        return name + " " + super.getId();
    }
}
