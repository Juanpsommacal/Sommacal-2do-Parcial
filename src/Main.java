import Classes.Person;
import Classes.SSM;
import Exceptions.NoKitException;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Aca dejo 7 personas Hardcodeadas dentro de un array para probar el funcionamiento del programa
        ArrayList<Person> testArray = new ArrayList<>();
        Person personTest1 = new Person("Juan", "Sommacal", 26, "Colinas", 41106469, "Vendedor");
        Person personTest2 = new Person("Carlos", "Lopez", 40, "Bosque", 22105769, "Ingeniero");
        Person personTest3 = new Person("Josefina", "Perez", 19, "Puerto", 45157967, "Estudiante");
        Person personTest4 = new Person("Roberto", "Rodriguez", 30, "Mogotes", 35106524, "Peluquero");
        //Este tiene el mismo DNI que el primero, asi probamos que no lo acepte
        Person personTest5 = new Person("Florencia", "Otero", 28, "Bosque", 41106469, "Diseñadora");
        Person personTest6 = new Person("Julian", "Weich", 50, "Nordelta", 21546412, "Television");
        //Este ultimo no entra porque no hay mas Kits
        Person personTest7 = new Person("Tomas", "Dominguez", 64, "Puerto", 14578945, "Jubilado");

        testArray.add(personTest1);
        testArray.add(personTest2);
        testArray.add(personTest3);
        testArray.add(personTest4);
        testArray.add(personTest5);
        testArray.add(personTest6);
        testArray.add(personTest7);

        //Aca creamos el centro de Salud. Va a tener 5 Kits
        SSM sistemaSalud = new SSM(5);

        for(Person actualPerson : testArray) {
            try {
                sistemaSalud.registerPerson(actualPerson);
            } catch (NoKitException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("\n");
        sistemaSalud.showQueue();
        System.out.println("\n");

        /* Aca muestro todos los pacientes para que se vea que tienen su Kit asignado con un numero random. Menos la
        persona n5 que no se registro por que repetia el numero de DNI
        Si ingresamos 0 cuando nos pregunta si hay mas Kits, van a quedar 2 personas con kit NULL */
        for(Person actualPerson : testArray) {
            System.out.println(actualPerson);
        }
    }
}