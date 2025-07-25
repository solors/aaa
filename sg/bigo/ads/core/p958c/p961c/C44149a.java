package sg.bigo.ads.core.p958c.p961c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.p926n.ThreadFactoryC43725c;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.core.c.c.a */
/* loaded from: classes10.dex */
public final class C44149a {

    /* renamed from: a */
    public static Handler f115864a;

    /* renamed from: b */
    private static ExecutorService f115865b = Executors.newFixedThreadPool(1, new ThreadFactoryC43725c("Stat-Worker"));

    /* renamed from: sg.bigo.ads.core.c.c.a$a */
    /* loaded from: classes10.dex */
    static class C44151a extends AbstractRunnableC44152b {

        /* renamed from: c */
        private Future f115867c;

        C44151a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.p958c.p961c.C44149a.AbstractRunnableC44152b
        /* renamed from: a */
        protected final void mo3812a() {
            Runnable runnable = this.f115868a;
            if (runnable != null) {
                this.f115867c = C44149a.m3816a(runnable);
            }
        }
    }

    /* renamed from: sg.bigo.ads.core.c.c.a$b */
    /* loaded from: classes10.dex */
    public static abstract class AbstractRunnableC44152b implements Runnable {

        /* renamed from: a */
        final Runnable f115868a;

        /* renamed from: b */
        final AtomicBoolean f115869b = new AtomicBoolean(false);

        AbstractRunnableC44152b(Runnable runnable) {
            this.f115868a = runnable;
        }

        /* renamed from: a */
        protected abstract void mo3812a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f115869b.get()) {
                return;
            }
            mo3812a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Stat-Handler");
        handlerThread.start();
        f115864a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static Future m3816a(final Runnable runnable) {
        return f115865b.submit(new Runnable() { // from class: sg.bigo.ads.core.c.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e) {
                    e = e;
                    sb2 = new StringBuilder("stat thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    C43782a.m5009a(0, "Stats", sb2.toString());
                } catch (Throwable th) {
                    e = th;
                    sb2 = new StringBuilder("stat thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    C43782a.m5009a(0, "Stats", sb2.toString());
                }
            }
        });
    }

    /* renamed from: a */
    public static AbstractRunnableC44152b m3815a(Runnable runnable, long j) {
        C44151a c44151a = new C44151a(runnable);
        f115864a.postDelayed(c44151a, j);
        return c44151a;
    }

    /* renamed from: a */
    public static void m3814a(AbstractRunnableC44152b abstractRunnableC44152b) {
        if (abstractRunnableC44152b != null) {
            abstractRunnableC44152b.f115869b.set(true);
            if (abstractRunnableC44152b instanceof C44151a) {
                C44151a c44151a = (C44151a) abstractRunnableC44152b;
                if (c44151a.f115867c != null) {
                    Future future = c44151a.f115867c;
                    if ((future == null || future.isCancelled() || future.isDone()) ? false : true) {
                        future.cancel(true);
                    }
                }
            }
            f115864a.removeCallbacks(abstractRunnableC44152b);
        }
    }
}
