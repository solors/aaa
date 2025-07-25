package p656eb;

import androidx.annotation.NonNull;
import sa.C39638b;
import sa.Log;

/* renamed from: eb.f */
/* loaded from: classes8.dex */
public interface ParsingErrorLogger {

    /* renamed from: a */
    public static final ParsingErrorLogger f89835a = new ParsingErrorLogger() { // from class: eb.d
        @Override // p656eb.ParsingErrorLogger
        /* renamed from: b */
        public final void mo2528b(Exception exc) {
            ParsingErrorLogger.m25393f(exc);
        }
    };

    /* renamed from: b */
    public static final ParsingErrorLogger f89836b = new ParsingErrorLogger() { // from class: eb.e
        @Override // p656eb.ParsingErrorLogger
        /* renamed from: b */
        public final void mo2528b(Exception exc) {
            ParsingErrorLogger.m25394e(exc);
        }
    };

    /* renamed from: a */
    static /* synthetic */ void m25397a(Exception exc) {
        if (Log.m11978e()) {
            Log.m11980c("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m25396c(Exception exc) {
        if (C39638b.m11995q()) {
            C39638b.m12000l(exc.getMessage(), exc);
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m25394e(Exception exc) {
        m25396c(exc);
    }

    /* renamed from: f */
    static /* synthetic */ void m25393f(Exception exc) {
        m25397a(exc);
    }

    /* renamed from: b */
    void mo2528b(@NonNull Exception exc);

    /* renamed from: d */
    default void m25395d(@NonNull Exception exc, @NonNull String str) {
        mo2528b(exc);
    }
}
