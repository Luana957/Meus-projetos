package sitema_radar;

public class Simulacao {
    public static void main(String[] args) {
        System.out.println("Simulação");

        Carro opala = new Carro("ACLR300","Comoodoro", 76,0); //Criando um novo carro
          //opala.ano = 76;
      //  opala.modelo ="Comodoro";
       // opala.placa = "ACLR300";
       // opala.velocidade = 0;

        Radar radar = new Radar(60,"Pistao sul");
          //radar.limiteVelocidade = 60;
       //   radar.localidade ="Pistão sul";

          radar.avaliarVelocidade(opala);

          opala.acelerar(); //10
          opala.acelerar();
          opala.acelerar();
          opala.acelerar();
          opala.acelerar();
          opala.acelerar();
          
          
          opala.acelerar();
         opala.setVelocidade(40);
         
          opala.acelerar();//80
 
          radar.avaliarVelocidade(opala);

          opala.frear();

          radar.avaliarVelocidade(opala);


    }
    
}
