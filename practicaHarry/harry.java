package practicaHarry;

public class harry {
    //Caracteristicas principales
    public int edad;
    public String nombre, casa, genero,
            boggart, patronus, varita, escuela;

    // getters
    public int getEdad(){  return edad;  }
    public String getNombre(){  return nombre;  }
    public String getCasa(){  return casa;  }
    public String getGenero(){  return genero;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }
    public String getVarita(){  return varita;  }
    public String getEscuela(){  return escuela;  }


    //setters

    public boolean setEdad(int edad){
        if(edad > 0){
            this.edad = edad;
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

    //manera de control

    public String printState(){
        return "Edad: "+edad+"\n"+
                "Nombre: "+nombre+"\n"+
                "Casa: "+casa+"\n"+
                "Genero: "+genero+"\n"+
                "Boggart: "+boggart+"\n"+
                "Patronus: "+patronus+"\n"+
                "Varita: "+varita+"\n"+
                "Escuela: "+escuela;
    }

}

