package com.mobilefuse.sdk.telemetry;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum WARN uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:391)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:320)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: LogLevel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class LogLevel {
    private static final /* synthetic */ LogLevel[] $VALUES;
    public static final LogLevel DEBUG;
    public static final LogLevel ERROR;
    public static final LogLevel WARN;
    @Nullable
    private final LogLevel parent;

    static {
        LogLevel logLevel = new LogLevel("ERROR", 0, null);
        ERROR = logLevel;
        LogLevel logLevel2 = new LogLevel("WARN", 1, logLevel);
        WARN = logLevel2;
        LogLevel logLevel3 = new LogLevel("DEBUG", 2, logLevel2);
        DEBUG = logLevel3;
        $VALUES = new LogLevel[]{logLevel, logLevel2, logLevel3};
    }

    private LogLevel(String str, int i, LogLevel logLevel) {
        this.parent = logLevel;
    }

    public static LogLevel valueOf(String str) {
        return (LogLevel) Enum.valueOf(LogLevel.class, str);
    }

    public static LogLevel[] values() {
        return (LogLevel[]) $VALUES.clone();
    }

    @Nullable
    public final LogLevel getParent() {
        return this.parent;
    }
}
