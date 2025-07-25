package p1067z3;

import androidx.annotation.NonNull;
import java.lang.Thread;

/* renamed from: z3.a */
/* loaded from: classes6.dex */
public class AnalyzeCrashHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: c */
    private static volatile AnalyzeCrashHandler f118681c;

    /* renamed from: a */
    private final Thread.UncaughtExceptionHandler f118682a = Thread.getDefaultUncaughtExceptionHandler();

    /* renamed from: b */
    private IInnerEventOpportunity f118683b;

    private AnalyzeCrashHandler() {
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /* renamed from: a */
    public static AnalyzeCrashHandler m864a() {
        if (f118681c == null) {
            synchronized (AnalyzeCrashHandler.class) {
                if (f118681c == null) {
                    f118681c = new AnalyzeCrashHandler();
                }
            }
        }
        return f118681c;
    }

    /* renamed from: b */
    public void m863b(IInnerEventOpportunity iInnerEventOpportunity) {
        this.f118683b = iInnerEventOpportunity;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        try {
            try {
                IInnerEventOpportunity iInnerEventOpportunity = this.f118683b;
                if (iInnerEventOpportunity != null) {
                    iInnerEventOpportunity.mo838b();
                }
                uncaughtExceptionHandler = this.f118682a;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                uncaughtExceptionHandler = this.f118682a;
                if (uncaughtExceptionHandler == null) {
                    return;
                }
            }
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.f118682a;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
