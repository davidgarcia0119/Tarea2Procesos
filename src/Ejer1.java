import java.io.IOException;
import java.util.Arrays;

public class Ejer1 {
	public static void main(String[] args) throws IOException {
		
		
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		ProcessBuilder pb = new ProcessBuilder(args);
		ProcessBuilder pb2 = new ProcessBuilder(args);
		try {
			Process process = pb.start();
			int retorno = process.waitFor();
					
				pb2.start();
				
			System.out.println("La ejecución de " + Arrays.toString(args) + "devuelve " + retorno);
		} catch (IOException ex) {
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		} catch (InterruptedException ex) {
			System.err.println("El proceso hijo finalizó de forma incorrecta");
			System.exit(-1);
		}
	}
}




// a) me meti en run configurations , luego me meti en arguments pegue y ejecute pero esto es porque estoy en mac si tuviera windows me mostraria la calculadora ya que es un programa del path
// b) cuando repito la accion me muestra por consola un mensaje  que dice se necesita un programa a ejecutar
// c) sale la excepcion de E/S
// D) Lo que hice fue crear un segundo objeto pb2 con el mismo argumento que se inicia  inmediatamente despues del waitfor
