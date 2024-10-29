package Classes;

import Exceptions.NoKitException;

import java.util.*;

public class SSM {
    private Integer kitStock;
    private HashMap<Integer, Integer> personQueue;
    private HashMap<Integer, Test> testResults;
    private Integer queueNumber;


    //Aca recibimos solo la cantidad de Kits que tenemos en el Centro de Salud.
    public SSM(Integer kitStock) {
        this.kitStock = kitStock;
        personQueue = new HashMap<>();
        testResults = new HashMap<>();
        queueNumber = 1;
    }

    public Integer generateKitNumber(){
        return new Random().nextInt(1000) + 1;
    }

    public void registerPerson(Person person) throws NoKitException {

    try{
        if(kitStock == 0){
            throw new NoKitException();
        }
        if(!personQueue.containsKey(person.getDni())){
            //Si no se encuentra el DNI en el mapa, y hay suficientes Kits, insertamos y ponemos el numero de fila actual (que en la primer vuelta es 1)
            personQueue.put(person.getDni(), queueNumber);
            person.setKitNumber(generateKitNumber());
            System.out.println("Se registro al paciente " + person.getName() + " DNI: " + person.getDni() + " en la posicion numero " + queueNumber);
            //Subimos 1 al contador de la fila y restamos 1 al contador de kits
            queueNumber++;
            kitStock--;
        }else{
            System.out.println("El DNI " + person.getDni() + " ya esta registrado en la fila");
        }
    }catch(NoKitException e){
        System.out.println(e.getMessage());
        System.out.println("Hay mas kits disponibles?? Ingrese la cantidad si los hay. Sino ingrese 0");
        Scanner scanner = new Scanner(System.in);
        try{
            kitStock = scanner.nextInt();
        }catch (InputMismatchException error){
            System.out.println("Eso no es un numero...");
        }
        finally {//Despues de terminar el metodo, volvemos a correrlo por si ingresaron mas kits
            if(kitStock > 0){
                registerPerson(person);
            }
        }
    }

    }

    public void showQueue(){
        System.out.println("----- Pacientes en la fila:");
        for(Map.Entry<Integer, Integer> entry : personQueue.entrySet()){
            System.out.println("DNI: " + entry.getKey() + ", Numero en la fila: " + entry.getValue());
        }
    }


    public void testPerson(){
        for (Map.Entry<Integer, Integer> entry : personQueue.entrySet()) {
            /*Hasta aca llegue. No se si habia que usar otra coleccion o si tenia que guardar dentro del map de otra forma
            Mi problema aca es que no puedo acceder a la persona a la cjual pertenece el DNI. Entonces no puedo sacar
            el numero de Kit*/
        }

    }

    public Integer getKitStock() {
        return kitStock;
    }

    public void setKitStock(Integer kitStock) {
        this.kitStock = kitStock;
    }

    public HashMap<Integer, Integer> getPersonQueue() {
        return personQueue;
    }

    public void setPersonQueue(HashMap<Integer, Integer> personQueue) {
        this.personQueue = personQueue;
    }

    public Integer getQueueNumber() {
        return queueNumber;
    }

    public void setQueueNumber(Integer queueNumber) {
        this.queueNumber = queueNumber;
    }

    public HashMap<Integer, Test> getTestResults() {
        return testResults;
    }

    public void setTestResults(HashMap<Integer, Test> testResults) {
        this.testResults = testResults;
    }


}
