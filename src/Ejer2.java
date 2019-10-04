

import java.io.IOException;

public class Ejer2 {
	public static void main(String[] args) {
		if (args.length <= 0) {
			System.err.println("Se necesita un programa a ejecutar");
			System.exit(-1);
		}
		Runtime runtime = Runtime.getRuntime();
		try {
			Process process = runtime.exec(args);
			process.destroy();
		} catch (IOException ex) {
			System.err.println("Excepción de E/S!!");
			System.exit(-1);
		}
	}
}

// a) Ejecuta el programa anterior en eclipse indicando como argumento el programa “notepad.exe”, ¿pasa algo?
// No hace nada. Porque el comando destroy() mata el proceso demasiado rápido.

// b) Ahora prueba a comentar la línea “process.destroy();” y vuelve a ejecutarlo.
// Ahora sí se ejecuta el notepad.