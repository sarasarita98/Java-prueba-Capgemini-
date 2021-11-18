package prueba.delegacion;


public class AdaptadorPuertaTemporizador implements ClienteTemporizadorD {

    PuertaTemporizadaD puertaTemporizada;
    AspersorTemporizadoD aspersorTemporizado;
    PersianaTemporizadaD persianaTemporizada;


    public AdaptadorPuertaTemporizador (PuertaTemporizadaD puertaTemporizada){
        this.puertaTemporizada = puertaTemporizada;
    }

    public AdaptadorPuertaTemporizador (AspersorTemporizadoD aspersorTemporizado){
        this.aspersorTemporizado = aspersorTemporizado;
    }

    public AdaptadorPuertaTemporizador (PersianaTemporizadaD persianaTemporizada){
        this.persianaTemporizada = persianaTemporizada;
    }

    @Override
    public void timeout() {

        if(puertaTemporizada != null){
            puertaTemporizada.timeout();
        }

        if(aspersorTemporizado != null){
            aspersorTemporizado.timeout();
        }

        if(persianaTemporizada != null){
            persianaTemporizada.timeout();
        }
    }

    @Override
    public void iniciar(TemporizadorD temporizador) {

        if(puertaTemporizada != null){
            puertaTemporizada.iniciar(temporizador);
        }

        if(aspersorTemporizado != null){
            aspersorTemporizado.iniciar(temporizador);
        }

        if(persianaTemporizada != null){
            persianaTemporizada.iniciar(temporizador);
        }
    }

    @Override
    public String getName(){
        if(puertaTemporizada != null){
            return puertaTemporizada.getName();
        }

        if(aspersorTemporizado != null){
            return aspersorTemporizado.getName();
        }

        if(persianaTemporizada != null){
            return persianaTemporizada.getName();
        }
        return "";
    }

}
