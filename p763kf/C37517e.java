package p763kf;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.Metadata;

/* compiled from: AndroidLog.kt */
@Metadata
/* renamed from: kf.e */
/* loaded from: classes10.dex */
public final class C37517e {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final int m17653b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            return 4;
        }
        return 3;
    }
}
