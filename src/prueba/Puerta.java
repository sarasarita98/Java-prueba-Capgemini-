package prueba;

public class Puerta {

    static int UNIQUE_ID = 0;
    int uid ;

    private boolean bloqueado;

    public Puerta() {
        uid = ++UNIQUE_ID;
        bloqueado = true;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public int getId() {
        return uid;
    }

    public void bloquear() {
        if (bloqueado) {
            System.out.println(uid + " ya esta bloqueada");
        } else {
            bloqueado = true;
        }
    }

    public void desbloquear() {
        if (bloqueado) {
            bloqueado = false;
        } else {
            System.out.println(uid + " ya esta desbloqueda");
        }
    }
}
