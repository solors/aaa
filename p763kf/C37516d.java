package p763kf;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidLog.kt */
@Metadata
/* renamed from: kf.d */
/* loaded from: classes10.dex */
public final class C37516d extends Handler {
    @NotNull

    /* renamed from: a */
    public static final C37516d f99184a = new C37516d();

    private C37516d() {
    }

    @Override // java.util.logging.Handler
    public void publish(@NotNull LogRecord record) {
        int m17653b;
        Intrinsics.checkNotNullParameter(record, "record");
        AndroidLog androidLog = AndroidLog.f99181a;
        String loggerName = record.getLoggerName();
        Intrinsics.checkNotNullExpressionValue(loggerName, "record.loggerName");
        m17653b = C37517e.m17653b(record);
        String message = record.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "record.message");
        androidLog.m17658a(loggerName, m17653b, message, record.getThrown());
    }

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }
}
