package practicaHarry;

public class snape {
    //caracteristicas principales

    public String nombre, genero, ocupacion,
            casa, boggart, varita, patronus;

    //getters
    public String getNombre(){  return nombre;  }
    public String getGenero(){  return genero;  }
    public String getCasa(){  return casa;  }
    public String getOcupacion(){  return ocupacion;  }
    public String getVarita(){  return varita;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    //Setters

    public boolean setNombre(String nombre){
        if(!nombre.isEmpty()){
            this.nombre = nombre;
            return true;
        }else
                return false;
    }

    public boolean setGenero(String genero){
        if(!nombre.isEmpty()){
            this.genero = genero;
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

    public boolean setOcupacion(String ocupacion){
        if(!ocupacion.isEmpty()){
            this.ocupacion = ocupacion;
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

    //forma de control
    public String printState(){
        return "Nombre: "+nombre+"\n"+
                "Genero: "+genero+"\n"+
                "Varita: "+varita+"\n"+
                "Casa: "+casa+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus+"\n"+
                "Ocupación: "+ocupacion;

    }

}
