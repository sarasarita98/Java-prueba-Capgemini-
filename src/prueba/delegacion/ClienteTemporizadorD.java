package prueba.delegacion;


public interface ClienteTemporizadorD {

    void timeout();

    void iniciar(TemporizadorD temporizador);

    String getName();
}
