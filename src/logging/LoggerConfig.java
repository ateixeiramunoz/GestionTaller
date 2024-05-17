package logging;

import appconfig.AppConfig;

import java.io.IOException;
import java.util.logging.*;

/**
 * LoggerConfig es una clase de utilidad que proporciona configuración centralizada
 * para loggers en toda la aplicación. Utiliza el patrón Singleton para asegurar que
 * la configuración del logger se realice solo una vez, y el patrón Factory para
 * proporcionar instancias de loggers configurados.
 */
public class LoggerConfig {

    // Logger para la propia clase LoggerConfig
    private static final Logger logger = Logger.getLogger(LoggerConfig.class.getSimpleName());
    // Bandera para asegurar que la configuración se realice solo una vez
    private static boolean isConfigured = false;

    /**
     * Proporciona una instancia de Logger configurada para la clase especificada.
     * Este método sigue el patrón Factory.
     *
     * @param className el nombre de la clase para la cual se requiere el Logger
     * @return una instancia de Logger configurada
     */
    public static Logger getLogger(String className) {
        if (!isConfigured) {
            configureLogger();
        }
        return Logger.getLogger(className);
    }

    /**
     * Configura el Logger raíz con manejadores personalizados para archivo y consola.
     * Este método sigue el patrón Singleton para asegurar que la configuración se
     * realice solo una vez.
     */
    public static void configureLogger() {
        if (isConfigured) {
            return;
        }
        try {
            // Obtener el logger raíz y remover los manejadores predeterminados
            Logger rootLogger = Logger.getLogger("");
            Handler[] handlers = rootLogger.getHandlers();
            for (Handler handler : handlers) {
                rootLogger.removeHandler(handler);
            }

            // Configurar el manejador de archivos
            FileHandler fileHandler = new FileHandler(AppConfig.LOG_FILE_NAME, AppConfig.LOG_FILE_APPEND);
            fileHandler.setFormatter(new LogFormatter()); // Usar LogFormatter personalizado
            fileHandler.setLevel(Level.ALL);

            // Configurar el manejador de consola
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new LogFormatter()); // Usar LogFormatter personalizado
            consoleHandler.setLevel(Level.ALL);

            // Agregar los manejadores personalizados al logger raíz
            rootLogger.addHandler(fileHandler);
            rootLogger.addHandler(consoleHandler);
            rootLogger.setLevel(AppConfig.LOG_LEVEL);

            // Marcar la configuración como realizada
            isConfigured = true;

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Fallo al configurar el logger", e);
        }
    }
}
