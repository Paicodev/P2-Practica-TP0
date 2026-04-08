public class App {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante1 = new Estudiante("Pablo", "Lopez", 23, "Programador Universitario en Sistemas", 9.1); 
        Estudiante estudiante2 = new Estudiante("Fernando", "Torres", 24, "Programador Universitario en Sistemas", 8.1); 
        Estudiante estudiante3 = new Estudiante("Esteban", "Mendez", 25, "Programador Universitario en Sistemas", 8.7);
        
        Estudiante listado[] = {estudiante1, estudiante2, estudiante3};

        for(int i=0; i<listado.length; i++){
            System.out.println("Nombre: " + listado[i].getNombre());
            System.out.println("Apellido: " + listado[i].getApellido());
            System.out.println("Edad: " + listado[i].getEdad());
            System.out.println("Carrera: " + listado[i].getCarrera());
            System.out.println("Promedio: " + listado[i].getPromedio());
            System.out.println("");
        }
    }
}
