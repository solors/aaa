package com.yandex.mobile.ads.impl;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ad */
/* loaded from: classes8.dex */
public final class C29929ad extends Handler {
    @NotNull

    /* renamed from: a */
    public static final C29929ad f76763a = new C29929ad();

    private C29929ad() {
    }

    @Override // java.util.logging.Handler
    public final void publish(@NotNull LogRecord record) {
        int i;
        Intrinsics.checkNotNullParameter(record, "record");
        int i2 = C31970zc.f88820c;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "getLoggerName(...)");
        int intValue = record.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i = 5;
        } else if (record.getLevel().intValue() == level.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        C31970zc.m26281a(loggerName, i, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
