package prueba.herencia;

import java.awt.font.TextHitInfo;
import java.util.Timer;
import java.util.TimerTask;

public class TemporizadorH extends Thread {

    private Timer timer;
    private ClienteTemporizadorH clienteTemporizador;
    private long initialTime;
    private long finalTime;

    public TemporizadorH(ClienteTemporizadorH clienteTemporizador) {
        this.timer = new Timer();
        this.clienteTemporizador = clienteTemporizador;
        this.initialTime = 0;
        this.finalTime = (int) (Math.random() * 20 + 1);
    }

    public void registrar() {
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println(clienteTemporizador.getName() + " H desbloqueada ->Tiempo: "
                        + initialTime + " seg");
                initialTime++;
                if (initialTime == finalTime) {
                    timer.cancel();
                    System.out.println(clienteTemporizador.getName() + " H BLOQUEADO. Tiempo total desbloqueado: " + finalTime);
                    clienteTemporizador.timeout();
                }
            }
        };
        timer.schedule(task, finalTime, 1);
    }


}
