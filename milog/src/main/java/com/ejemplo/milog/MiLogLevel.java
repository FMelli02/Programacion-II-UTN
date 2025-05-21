package com.ejemplo.milog;

import org.apache.logging.log4j.Level;

public final class MiLogLevel {
    public static final int MI_LOG_LEVEL_INT = Level.INFO.intLevel() + 1;
    public static final Level MI_LOG_LEVEL = Level.forName("MI_LOG", MI_LOG_LEVEL_INT);

    private MiLogLevel() {

    }
}
