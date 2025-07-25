package p1019w2;

import android.util.Log;
import com.helpshift.log.HSLogger;
import java.lang.Thread;
import p809o2.Helpshift;

/* renamed from: w2.a */
/* loaded from: classes5.dex */
public class HSUncaughtExceptionHandler {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HSUncaughtExceptionHandler.java */
    /* renamed from: w2.a$a */
    /* loaded from: classes5.dex */
    public class C44573a implements Thread.UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ Thread.UncaughtExceptionHandler f116986a;

        C44573a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f116986a = uncaughtExceptionHandler;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th) {
            if (HSUncaughtExceptionHandler.m2374b(th)) {
                HSLogger.m65438e("UncghtExptnHndlr", "UNCAUGHT EXCEPTION ", th);
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f116986a;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }

    /* renamed from: a */
    public static void m2375a() {
        Thread.setDefaultUncaughtExceptionHandler(new C44573a(Thread.getDefaultUncaughtExceptionHandler()));
    }

    /* renamed from: b */
    static boolean m2374b(Throwable th) {
        if (th == null) {
            return false;
        }
        try {
            return Log.getStackTraceString(th).contains(Helpshift.class.getPackage().getName());
        } catch (Exception e) {
            HSLogger.m65438e("UncghtExptnHndlr", "Error determining crash from Helpshift", e);
            return false;
        }
    }
}
