package com.smaato.sdk.core.log;

import android.util.Log;
import androidx.annotation.NonNull;
import com.smaato.sdk.core.log.LoggerImpl;
import com.smaato.sdk.core.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.log.c */
/* loaded from: classes7.dex */
public final class LoggerFactory {

    /* renamed from: a */
    public static final LogLevel f71647a = LogLevel.WARNING;

    /* renamed from: b */
    private static volatile Logger f71648b;

    private LoggerFactory() {
    }

    @NonNull
    /* renamed from: a */
    public static Logger m39494a() {
        if (f71648b == null) {
            synchronized (LoggerFactory.class) {
                if (f71648b == null) {
                    Log.e(LoggerFactory.class.getName(), "Logger was not initialized! Going to initialize with a default console log level");
                    m39493b(f71647a);
                }
            }
        }
        return f71648b;
    }

    /* renamed from: b */
    public static void m39493b(@NonNull LogLevel logLevel) {
        Objects.requireNonNull(logLevel);
        if (f71648b == null) {
            synchronized (LoggerFactory.class) {
                if (f71648b == null) {
                    LoggerImpl loggerImpl = new LoggerImpl(LoggerImpl.EnumC27168a.RELEASE);
                    loggerImpl.m39492a(new ConsoleLogWriter(logLevel));
                    f71648b = loggerImpl;
                }
            }
        }
    }
}
