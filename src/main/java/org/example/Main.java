package org.example;

import java.util.*;

public class Main {
    /**
     * Para este primer ejercicio veremos los ciclos for y algunas maneras mas de recorrer arreglos
     */
    public static void EJERCICIO1(){
        System.out.println("########## for ##########");
        int arregloPeroNoConBuenasPracticas[];
        int[] arreglo = {1,2,3,4,5};;
        int []arreglo2;

        for (int i = 0; i < arreglo.length ; i++ ){
            System.out.println(arreglo[i]*10);
        }
    }

    /**
     * Ahora recorramos el arreglo con un ciclo for each.
     */
    public static void EJERCICIO2(){
        int[] arreglo = {1,2,3,4,5};
        System.out.println("########## for-each ##########");
        for(int item : arreglo){
            System.out.println(item*10);
        }
    }

    /**
     * Arreglos vs Cadenas, por que usarlas?
     */
    public static void EJERCICIO3(){
        System.out.println("########## cadenas ##########");

        char[] cadena = {'h', 'o', 'l','a'};
        for(char c : cadena){
            System.out.print(c);
        }
        System.out.println("");
    }

    /**
     * Wrapper (en castellano empaquetador), es un termino ingles que generalmente se refiere a un tipo de embalaje, tal como una hoja plana de papel, celofan o plastico para envolver un objeto
     */
    public static void EJERCICIO4(){
        System.out.println("########## Wrappers ##########");
        int a = 25;
        System.out.println(a);
        Integer b = 10; //forma normalizada: Integer b = new Integer(a);
        System.out.println(b);
        Integer c = 18;
        System.out.println(c);
    }

    /**
     * Un ArrayList nos servira como colección (al igual que un arreglo) que soporta objetos
     */
    public static void EJERCICIO5(){
        int a = 25;
        int b = 10;
        int c = 28;
        System.out.println("########## ArrayList ##########");
        ArrayList<Integer> miArrayList = new ArrayList<>();
        miArrayList.add(c);
        miArrayList.add(b);
        miArrayList.add(a);

        miArrayList.stream().forEach((item)->{
            System.out.println(item);
        });

        System.out.println("***");
        miArrayList.add(1, -53);
        miArrayList.stream().forEach((item)->{
            System.out.println(item);
        });

        System.out.println("***");
        System.out.println(miArrayList.indexOf(-53));

        System.out.println("***");
        miArrayList.add(1,8);
        miArrayList.stream().forEach(item ->{
            System.out.println(item);
        });
    }

    /**
     * Una tabla hash, matriz asociativa, hashing, mapa hash, tabla de dispersión o tabla fragmentada es una estructura de datos que implementa el tipo de dato abstracto llamado diccionario
     */
    public static void EJERCICIO6(){
        System.out.println("########## HashTable ##########");
        Hashtable<String,Integer> agenda = new Hashtable<String, Integer>();
        agenda.put("pepe", 34456576);
        agenda.put("Ramiro", 134432);
        agenda.put("Maricela", 987645);
        System.out.println("**Agenda**");
        System.out.println(agenda.size());
        for(Integer onj : agenda.values()){
            System.out.println(onj);
        }
        for(Object obj : agenda.keySet()){
            System.out.println(obj);
        }
        System.out.println("########## HashTable ##########");
        Enumeration<String> llaves = agenda.keys();
        String llave;
        Integer valor;
        while(llaves.hasMoreElements()){
            llave = llaves.nextElement();
            valor = agenda.get(llave);
            System.out.println("LLave=" + llave + " Valor = " + valor);

        }
    }

    /**
     * Realizar un DIccionario para 5 palabras e imprimir las definiciones
     */
    public static void EJERCICIO7(){
        Hashtable<String, String> diccionario = new Hashtable<>();
        String defOne = "Mamifero domestico de la familia de los canidos, de tamano, forma y pelaje muy diversos, segun las razas, que tiene olfato muy fino y es inteligente y muy leal a su dueno";
        diccionario.put("Perro", defOne);
        String defTwo = "Mamifero de la familia de los felidos, digitigrado, domestico, de unos 50 cm de largo desde la cabeza hasta el arranque de la cola, que por si sola mide unos 20 cm, de cabeza redonda, lengua muy aspera, patas cortas y generalmente pelaje suave y espeso, de color blanco, gris, pardo, rojizo o negro, empleado en algunos lugares para cazar ratones.";
        diccionario.put("Gato", defTwo);
        String defThree = "Mamifero carnivoro plantigrado, de gran tamano, de pelaje pardo, largo y espeso, cabeza grande, ojos pequenos, extremidades fuertes y gruesas, con garras, y cola muy corta, que vive en los montes boscosos.";
        diccionario.put("Oso",defThree);
        String defFour = "etaceo, el mayor de todos los animales conocidos, que llega a crecer hasta mas de 30 m de longitud. Su color es, en general, oscuro por encima y blanquecino por debajo. Vive en todos los mares, preferentemente en los polares.";
        diccionario.put("Ballena", defFour);
        String defFive = "Ser organico que vive, siente y se mueve por propio impulso.";
        diccionario.put("Animal", defFive);

        Enumeration <String> llaves = diccionario.keys();
        String llave;
        String valor;
        while(llaves.hasMoreElements()){
            llave = llaves.nextElement();
            valor = diccionario.get(llave);
            System.out.println("LLave=" + llave + " Valor = " + valor);

        }
    }

    /**
     * Realizar un Agenda para 5 personas usando Hashtable par a nombre de persona y su cumpleaños
     */
    public static void EJERCICIO8(){
        Hashtable<String, String> agenda = new Hashtable<>();
        String[] nombres = {"Aram is", "Mundo", "Jesus", "Rodolfo", "Kevin"};

        Random random = new Random();
        for (String nombre : nombres) {
            Calendar fecha = Calendar.getInstance();
            int year = 1990 + random.nextInt(2005 - 1990 + 1);
            int mes = random.nextInt(12);
            int dia = 1 + random.nextInt
                    (fecha.getActualMaximum
                            (Calendar.DAY_OF_MONTH));

            fecha.set(year, mes, dia);
            String fecha2 = fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR);

            agenda.put(nombre, fecha2);
        }

        Enumeration<String> llaves = agenda.keys();
        String llave;
        String valor;
        while (llaves.hasMoreElements()) {
            llave = llaves.nextElement();
            valor = agenda.get(llave);
            System.out.println("LLave = " + llave + " Valor = " + valor);
        }
    }
    /**
     * Este es el main, desde aqui se llamaran a los distintos ejercicios realizados en esta tercera practica
     */
    public static void main(String[] args) {
        EJERCICIO1();
        EJERCICIO2();
        EJERCICIO3();
        EJERCICIO4();
        EJERCICIO5();
        EJERCICIO6();
        EJERCICIO7();
        EJERCICIO8();
    }
}