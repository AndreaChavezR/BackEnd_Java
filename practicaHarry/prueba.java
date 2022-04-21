package practicaHarry;

public class prueba {

    public static void main(String[] args){
        personajes();

    }
    public static void personajes(){

        //Harry Potter
        harry potter = new harry();
        potter.setNombre("Harry Potter");
        potter.setEdad(41);
        potter.setGenero("Masculino");
        potter.setVarita("Pluma de Fenix");
        potter.setEscuela("Hogwarts");
        potter.setCasa("Gryffindor");
        potter.setBoggart("Dementor");
        potter.setPatronus("Ciervo");

        String p1 = "\nCaracteristicas Principales de Harry Potter \n";
        p1 += "\nNombre: "+potter.getNombre();
        p1 += "\nEdad Actual: "+potter.getEdad()+" años";
        p1 += "\nGenero: "+potter.getGenero();
        p1 += "\nVarita: "+potter.getVarita();
        p1 += "\nEscuela: "+potter.getEscuela();
        p1 += "\nCasa: "+potter.getCasa();
        p1 += "\nBoggart: "+potter.getBoggart();
        p1 += "\nPatronus: "+potter.getPatronus();

        System.out.println(p1);

        //Hermione
        hermione granger = new hermione();
        granger.setNombre("Hermione Jean Grange");
        granger.setEdad(41);
        granger.setGenero("Femenino");
        granger.setVarita("Madera de vid con nucleo de nervio de dragon");
        granger.setEscuela("Hogwarts");
        granger.setCasa("Gryffindor");
        granger.setBoggart("Fracaso en general");
        granger.setPatronus("Nutria");
        granger.setTipo_Sangre("muggles");
        granger.setHabilidad_magica("Habil en cualquier materia excepto en Adivinacion");
        
        String p2 = "\nCaracteristicas Principales de Hermione Granger \n";
        p2 += "\nNombre: "+granger.getNombre();
        p2 += "\nEdad Actual: "+granger.getEdad()+" años";
        p2 += "\nGenero: "+granger.getGenero();
        p2 += "\nVarita: "+granger.getVarita();
        p2 += "\nEscuela: "+granger.getEscuela();
        p2 += "\nCasa: "+granger.getCasa();
        p2 += "\nBoggart: "+granger.getBoggart();
        p2 += "\nPatronus: "+granger.getPatronus();

        System.out.println(p2);

        //Ron
        ron we = new ron();
        we.setNombre("Ronald Weasley");
        we.setGenero("Masculino");
        we.setEscuela("Hogwarts");
        we.setCasa("Gryffindor");
        we.setVarita("Fresno, pelo de cola de unicornio");
        we.setBoggart("Acromántula (arañas)");
        we.setPatronus("Jack Russell Terrier");

        String p3 = "\nCaracteristicas Principales de Ronald Weasley \n";
        p3 += "\nNombre: "+we.getNombre();
        p3 += "\nGenero: "+we.getGenero();
        p3 += "\nVarita: "+we.getVarita();
        p3 += "\nEscuela: "+we.getEscuela();
        p3 += "\nCasa: "+we.getCasa();
        p3 += "\nBoggart: "+we.getBoggart();
        p3 += "\nPatronus: "+we.getPatronus();

        System.out.println(p3);

        //Hagrid

        hagrid ha = new hagrid();
        ha.setNombre("Rubeus Hagrid");
        ha.setGenero("Masculino");
        ha.setEstatura(2.60);
        ha.setEspecie("Semi-gigante");
        ha.setsangre("Mixta");
        ha.setEscuela("Hogwarts");
        ha.setCasa("Gryffindor");
        ha.setVarita("Roble");
        ha.setOcupacion("Guardabosques de Hogwarts");


        String p4 = "\nCaracteristicas Principales de Rubeus Hagrid\n";
        p4 += "\nNombre: "+ha.getNombre();
        p4 += "\nGenero: "+ha.getGenero();
        p4 += "\nEstatura: "+ha.getEstatura()+" metros";
        p4 += "\nVarita: "+ha.getVarita();
        p4 += "\nEscuela: "+ha.getEscuela();
        p4 += "\nCasa: "+ha.getCasa();
        p4 += "\nOcupacion; "+ha.getOcupacion();

        System.out.println(p4);

        //Snape

        snape s = new snape();
        s.setNombre("Severus Snape");
        s.setGenero("Masculino");
        s.setVarita("Madera");
        s.setCasa("Slytherin");
        s.setOcupacion("Profesor en Defensa contra las artes oscuras");
        s.setBoggart("Lord Voldemort");
        s.setPatronus("Cierva");

        String p5 = "\nCaracteristicas Principales de Severus Snape\n";
        p5 += "\nNombre; "+s.getNombre();
        p5 += "\nGenero; "+s.getGenero();
        p5 += "\nVarita; "+s.getVarita();
        p5 += "\nCasa; "+s.getCasa();
        p5 += "\nOcupacion; "+s.getOcupacion();
        p5 += "\nBoggart; "+s.getBoggart();
        p5 += "\nPatronus; "+s.getPatronus();

        System.out.println(p5);
    }
}
