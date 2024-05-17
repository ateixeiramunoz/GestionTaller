package fileReader;

import logging.LoggerConfig;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LectorDeArchivos implements Runnable {
    private static final Logger logger = LoggerConfig.getLogger(LectorDeArchivos.class.getSimpleName());
    private final String rutaDirectorio;

    /**
     * Constructor que inicializa la ruta del directorio a procesar.
     * @param rutaDirectorio Ruta del directorio a procesar.
     */
    public LectorDeArchivos(String rutaDirectorio) {
        this.rutaDirectorio = rutaDirectorio;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            try {
                procesarDirectorio(rutaDirectorio);
                // Esperar un tiempo antes de volver a comprobar el directorio
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Hilo de LectorDeArchivos interrumpido", e);
                Thread.currentThread().interrupt(); // Restablecer el estado de interrupción
                break; // Salir del bucle si el hilo es interrumpido
            }
        }
    }

    private void procesarDirectorio(String rutaDirectorio) {
        boolean archivosEncontrados = false;
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(rutaDirectorio))) {
            for (Path entrada : stream) {
                if (Files.isRegularFile(entrada)) {
                    archivosEncontrados = true;
                    leerArchivo(entrada.toString());
                }
            }
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al listar archivos en el directorio: " + rutaDirectorio, e);
        }
        if (!archivosEncontrados) {
            logger.info("No se encontraron archivos en el directorio: " + rutaDirectorio);
        }
    }

    private void leerArchivo(String rutaArchivo) {
        logger.info("Leyendo archivo: " + rutaArchivo);
        try {
            String contenido = new String(Files.readAllBytes(Paths.get(rutaArchivo)));
            logger.info("Contenido del archivo:\n" + contenido);

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al leer el archivo: " + rutaArchivo, e);
        }
    }

    /**
     * Método estático para iniciar el hilo LectorDeArchivos.
     * @param rutaDirectorio Ruta del directorio a procesar.
     * @return El hilo LectorDeArchivos creado.
     */
    public static Thread iniciarHiloLectorDeArchivos(String rutaDirectorio) {
        LectorDeArchivos lectorDeArchivos = new LectorDeArchivos(rutaDirectorio);
        Thread hiloLectorDeArchivos = new Thread(lectorDeArchivos);
        hiloLectorDeArchivos.start();
        return hiloLectorDeArchivos;
    }
}