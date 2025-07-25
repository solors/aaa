package sg.bigo.ads.core.p953a.p956c;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.p926n.ThreadFactoryC43725c;

/* renamed from: sg.bigo.ads.core.a.c.b */
/* loaded from: classes10.dex */
public final class C44104b {

    /* renamed from: a */
    public static Handler f115757a;

    /* renamed from: b */
    private static final ExecutorService f115758b = Executors.newFixedThreadPool(1, new ThreadFactoryC43725c("Callback-Worker"));

    /* renamed from: sg.bigo.ads.core.a.c.b$a */
    /* loaded from: classes10.dex */
    static class C44106a extends AbstractRunnableC44107b {

        /* renamed from: c */
        private Future f115760c;

        C44106a(Runnable runnable) {
            super(runnable);
        }

        @Override // sg.bigo.ads.core.p953a.p956c.C44104b.AbstractRunnableC44107b
        /* renamed from: a */
        protected final void mo3949a() {
            Runnable runnable = this.f115761a;
            if (runnable != null) {
                this.f115760c = C44104b.m3953a(runnable);
            }
        }
    }

    /* renamed from: sg.bigo.ads.core.a.c.b$b */
    /* loaded from: classes10.dex */
    public static abstract class AbstractRunnableC44107b implements Runnable {

        /* renamed from: a */
        final Runnable f115761a;

        /* renamed from: b */
        final AtomicBoolean f115762b = new AtomicBoolean(false);

        AbstractRunnableC44107b(Runnable runnable) {
            this.f115761a = runnable;
        }

        /* renamed from: a */
        protected abstract void mo3949a();

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f115762b.get()) {
                return;
            }
            mo3949a();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("BGAd-Callback-Handler");
        handlerThread.start();
        f115757a = new Handler(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static Future<?> m3953a(final Runnable runnable) {
        return f115758b.submit(new Runnable() { // from class: sg.bigo.ads.core.a.c.b.1
            @Override // java.lang.Runnable
            public final void run() {
                StringBuilder sb2;
                try {
                    runnable.run();
                } catch (Exception e) {
                    e = e;
                    sb2 = new StringBuilder("callback thread get exception:");
                    sb2.append(e.getLocalizedMessage());
                    C44103a.m3954a(sb2.toString());
                } catch (Throwable th) {
                    e = th;
                    sb2 = new StringBuilder("callback thread get throwable:");
                    sb2.append(e.getLocalizedMessage());
                    C44103a.m3954a(sb2.toString());
                }
            }
        });
    }

    /* renamed from: a */
    public static AbstractRunnableC44107b m3952a(Runnable runnable, long j) {
        C44106a c44106a = new C44106a(runnable);
        f115757a.postDelayed(c44106a, j);
        return c44106a;
    }

    /* renamed from: a */
    public static void m3951a(AbstractRunnableC44107b abstractRunnableC44107b) {
        if (abstractRunnableC44107b != null) {
            abstractRunnableC44107b.f115762b.set(true);
            if (abstractRunnableC44107b instanceof C44106a) {
                C44106a c44106a = (C44106a) abstractRunnableC44107b;
                if (c44106a.f115760c != null) {
                    Future future = c44106a.f115760c;
                    if ((future == null || future.isCancelled() || future.isDone()) ? false : true) {
                        future.cancel(true);
                    }
                }
            }
            f115757a.removeCallbacks(abstractRunnableC44107b);
        }
    }
}
