package prueba.herencia;

import prueba.Puerta;

public class AspersorTemporizadoH extends Puerta implements ClienteTemporizadorH {

    private String name = "ASPERSOR";

    @Override
    public void timeout() {
        setBloqueado(false);
        bloquear();
    }

    @Override
    public void iniciar(TemporizadorH temporizador) {
        temporizador.registrar();
        setBloqueado(true);
        desbloquear();
    }

    @Override
    public String getName() {
        return name + " " + super.getId();
    }

}
