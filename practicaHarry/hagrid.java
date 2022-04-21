package practicaHarry;

public class hagrid {
    //caracteristicas principales
    public String nombre, genero, tipo_sangre,
            varita, casa, especie, escuela, ocupacion;

    public double estatura;

    //Getters

    public double getEstatura(){  return  estatura;  }
    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getTipo_sangre(){  return tipo_sangre;  }
    public String getEspecie(){  return especie;  }
    public String getVarita(){  return varita;  }
    public String getCasa(){  return casa;  }
    public String getEscuela(){  return escuela;  }
    public String getOcupacion(){  return ocupacion;  }

    //Setters

    public boolean setEstatura(double estatura){
        if(estatura > 0){
            this.estatura = estatura;
            return true;
        }else
            return false;
    }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
            return false;
    }

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setsangre(String tipo_sangre){
        if(!tipo_sangre.isEmpty()){
            this.tipo_sangre = tipo_sangre;
            return true;
        }else
            return false;
    }

    public boolean setEspecie(String especie){
        if(!especie.isEmpty()){
            this.especie = especie;
            return true;
        }else
            return false;
    }

    public boolean setVarita(String varita){
        if(!varita.isEmpty()){
            this.varita = varita;
            return true;
        }else
            return false;

    }
    public boolean setCasa(String casa){
        if(!casa.isEmpty()){
            this.casa = casa;
            return true;
        }else
            return false;

    }

    public boolean setEscuela(String escuela){
        if(!escuela.isEmpty()){
            this.escuela = escuela;
            return true;
        }else
            return false;

    }

    public boolean setOcupacion(String ocupacion){
        if(!ocupacion.isEmpty()){
            this.ocupacion = ocupacion;
            return true;
        }else
            return false;

    }
    //forma de control
    public String printState(){
        return "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Tipo de Sangre: "+tipo_sangre+"\n"+
                "Especie: "+especie+"\n"+
                "Estatura: "+estatura+"\n"+
                "Varita: "+varita+"\n"+
                "Escuela: "+escuela+"\n"+
                "Casa: "+casa+"\n"+
                "Ocupación: "+ocupacion;
    }

}
