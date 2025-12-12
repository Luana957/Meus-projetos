package sistema_iptu;

public class Chacara extends Imovel{
  
    private Boolean possuiPossuiPocoArtesiano;


    
    public Chacara(Municipio municipio, Double areaM2, Integer vagas, Boolean possuiPossuiPocoArtesiano) {
         super(municipio, areaM2, vagas);
        this.possuiPossuiPocoArtesiano = possuiPossuiPocoArtesiano;
    }

   
    public Boolean getPossuiPossuiPocoArtesiano() {
        return this.possuiPossuiPocoArtesiano;
    }

    public void setPossuiPossuiPocoArtesiano(Boolean possuiPossuiPocoArtesiano) {
        this.possuiPossuiPocoArtesiano = possuiPossuiPocoArtesiano;
    }
}