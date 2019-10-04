import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ejer3 {
	public static void main(String args[]) throws IOException {
		try {
			Process process = new ProcessBuilder(args).start();
			InputStream is = process.getInputStream();
			// cambiamos el Encoding del InputStream que por defecto el cp1252 y lo
			// cambiamos
			// a UTF-8 como nos dice el apartado b
			InputStreamReader isr = new InputStreamReader(is, "UTF-8");
			// con este metodo puedo ver que se cambio el encoding por defecto
			BufferedReader br = new BufferedReader(isr);
			String line;
			System.out.println("Salida del proceso " + Arrays.toString(args) + ":");
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			// cerramos el descriptor de fichero--apartado C
			// tener en cuenta que siempre que se hace un BufferedReader se debe cerrar
			// miBuffer.close()
			br.close();
		} catch (Exception e) {
			System.err.printf("Se ha producido un error de tipo:", e);
		}
	}
}

/*
 * a) al poner cmd.exe Salida del proceso [cmd.exe]: Microsoft Windows [Versi¢n
 * 10.0.18362.356] (c) 2019 Microsoft Corporation. Todos los derechos
 * reservados. es la informacion que aparece en la terminal cuando arranca y se
 * obtiene con el getInputStream, El stream obtiene un tubo sobre la salida del
 * proceso.
 * 
 * B)cambiamos el Encoding del InputStream que por defecto el cp1252 y lo
 * cambiamos a UTF-8 como nos dice el apartado b
 * 
 * c)
 * 
 */
