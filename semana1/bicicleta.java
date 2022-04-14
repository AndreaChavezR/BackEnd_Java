package semana1;

public class bicicleta {
    //Caracteristicas (variables)
    public int pins, rodada;
    public double velocidad;
    public String color;

    //set consulta y get guarda

    public double getVelocidad(){  return velocidad;  }//metodo
    public int getPins(){  return pins;  }
    public int getRodada(){  return rodada;  }
    public String getColor(){  return color;  }


    public boolean setPins(int pins){
        if(pins > 0){
            this.pins = pins;
            return true;
        }else
            return false;
    }

    public boolean setRodada(int rodada) {
        if (rodada > 0) {
            this.rodada = rodada;
            return true;
        } else
            return false;
    }

    public boolean setVelocidad(double velocidad){
        if(velocidad >= 0){
            this.velocidad = velocidad;
            return true;
        }else
            return false;
    }

    public boolean setColor(String color){
        if(!color.isEmpty()){
            this.color = color;
            return true;
        }else
            return false;
    }
    //clase pura o pojo

    //manera de control

    public String printState(){
        return "pins: "+pins+"\n"+
                "rodada: "+rodada+"\n"+
                "velocidad: "+velocidad+"\n"+
                "color: "+color;
    }


}
