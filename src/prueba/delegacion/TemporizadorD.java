package prueba.delegacion;

import java.util.Timer;
import java.util.TimerTask;

public class TemporizadorD {

    private Timer timer;
    private long initialTime;
    private long finalTime;

    public TemporizadorD() {
        timer = new Timer();
        this.initialTime = 0;
        this.finalTime = (int) (Math.random() * 20 + 1);
    }

    public void registrar(AdaptadorPuertaTemporizador adaptador) {
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println(adaptador.getName() + " D desbloqueada ->Tiempo: "
                        + initialTime + " seg");
                initialTime++;
                if (initialTime == finalTime) {
                    timer.cancel();
                    System.out.println(adaptador.getName() + " D BLOQUEADO. Tiempo total desbloqueado: " +finalTime);
                    adaptador.timeout();
                }
            }
        };
        timer.schedule(task, finalTime, 1);
    }
}
