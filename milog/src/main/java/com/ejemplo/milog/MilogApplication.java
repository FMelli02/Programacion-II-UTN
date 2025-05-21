package com.ejemplo.milog;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.ThreadContext;

public class MilogApplication {
    private static final Logger logger = LogManager.getLogger(MilogApplication.class);

    public static void main(String[] args) {
        // Contexto de usuario para ThreadContext
        ThreadContext.put("usuario", "JuanPerez");

        // Mensajes de logging estándar
        logger.info("La aplicación se ha iniciado correctamente.");
        logger.warn("Este es un mensaje de advertencia.");
        logger.error("Este es un mensaje de error.");

        // Logging personalizado
        logger.log(MiLogLevel.MI_LOG_LEVEL, "Este es un mensaje en MI_LOG.");

        // Logging por HTTP (simulado)
        HttpLogger.send("Mensaje enviado por HTTP");

        // Finaliza
        logger.info("Finalizando ejecución.");
        ThreadContext.clearAll();
    }
}
