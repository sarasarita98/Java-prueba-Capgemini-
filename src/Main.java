import prueba.delegacion.*;
import prueba.herencia.*;

public class Main {

    public static void main(String[] args) {


        //PUERTA TEMPORIZADA HERENCIA
        ClienteTemporizadorH puertaTemporizadaH = new PuertaTemporizadaH();
        TemporizadorH temporizadorH = new TemporizadorH(puertaTemporizadaH);
        //PUERTA TEMPORIZADA HERENCIA
        ClienteTemporizadorH persianaTemporizada = new PersianaTemporizadaH();
        TemporizadorH temporizadorH2 = new TemporizadorH(persianaTemporizada);
        ///PUERTA TEMPORIZADA HERENCIA
        ClienteTemporizadorH aspersorTemporizadoH = new AspersorTemporizadoH();
        TemporizadorH temporizadorH1 = new TemporizadorH(aspersorTemporizadoH);

        puertaTemporizadaH.iniciar(temporizadorH);
        puertaTemporizadaH.timeout();

        aspersorTemporizadoH.iniciar(temporizadorH1);
        aspersorTemporizadoH.timeout();

        persianaTemporizada.iniciar(temporizadorH2);
        persianaTemporizada.timeout();


        //PUERTA TEMPORIZADA DELEGACION
        PuertaTemporizadaD puertaTemporizadaD = new PuertaTemporizadaD();
        ClienteTemporizadorD clientePuerta = new AdaptadorPuertaTemporizador(puertaTemporizadaD);
        TemporizadorD temporizadorD = new TemporizadorD();
        //PUERTA TEMPORIZADA DELEGACION
        AspersorTemporizadoD aspersorTemporizadoD = new AspersorTemporizadoD();
        ClienteTemporizadorD clienteApersor = new AdaptadorPuertaTemporizador(aspersorTemporizadoD);
        TemporizadorD temporizadorD1 = new TemporizadorD();
        ///PUERTA TEMPORIZADA DELEGACION
        PersianaTemporizadaD persianaTemporizadaD = new PersianaTemporizadaD();
        ClienteTemporizadorD clientePersiana = new AdaptadorPuertaTemporizador(persianaTemporizadaD);
        TemporizadorD temporizadorD2 = new TemporizadorD();

        clientePuerta.iniciar(temporizadorD);
        clienteApersor.iniciar(temporizadorD1);
        clientePersiana.iniciar(temporizadorD2);

    }
}
