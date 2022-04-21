package practicaHarry;

public class ron {
    //Caracteristicas principales
    public String nombre, casa, genero,
            boggart, patronus, varita, escuela, habilidad_magica;

    //setters y getters
    public String getNombre(){  return nombre;  }
    public String getCasa(){  return casa;  }
    public String getGenero(){  return genero;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
    public String getVarita(){  return varita;  }
    public String getEscuela(){  return escuela;  }
    public String getHabilidad_magica(){  return habilidad_magica;  }

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
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

    public boolean setGenero(String genero){
        if(!genero.isEmpty()){
            this.genero = genero;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
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

    public boolean setEscuela(String escuela){
        if(!escuela.isEmpty()){
            this.escuela = escuela;
            return true;
        }else
            return false;
    }

    public boolean setHabilidad(String habilidad_magica){
        if(!habilidad_magica.isEmpty()){
            this.habilidad_magica = habilidad_magica;
            return true;
        }else
            return false;
    }

    //manera de control

    public String printState(){
        return "Nombre: "+nombre+"\n"+
                "Casa: "+casa+"\n"+
                "Genero: "+genero+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus+"\n"+
                "Varita: "+varita+"\n"+
                "Escuela: "+escuela+"\n"+
                "Habilidad Magica: "+habilidad_magica;
    }
}
