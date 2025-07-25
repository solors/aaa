package p977t2;

/* renamed from: t2.b */
/* loaded from: classes5.dex */
public class HSThreadingService {

    /* renamed from: a */
    private final HSThreader f116469a;

    /* renamed from: b */
    private final HSThreader f116470b;

    /* renamed from: c */
    private final HSThreader f116471c;

    /* renamed from: d */
    private final Object f116472d = new Object();

    /* compiled from: HSThreadingService.java */
    /* renamed from: t2.b$b */
    /* loaded from: classes5.dex */
    class RunnableC44351b implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Runnable f116474b;

        RunnableC44351b(Runnable runnable) {
            this.f116474b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            HSThreadingService.this.f116471c.submit(this.f116474b);
        }
    }

    public HSThreadingService(HSThreader hSThreader, HSThreader hSThreader2, HSThreader hSThreader3) {
        this.f116469a = hSThreader;
        this.f116470b = hSThreader2;
        this.f116471c = hSThreader3;
    }

    /* renamed from: b */
    public void m3281b() {
        m3277f(new RunnableC44350a());
    }

    /* renamed from: c */
    public HSThreader m3280c() {
        return this.f116469a;
    }

    /* renamed from: d */
    public void m3279d(Runnable runnable) {
        this.f116470b.submit(new RunnableC44351b(runnable));
    }

    /* renamed from: e */
    public void m3278e(Runnable runnable) {
        this.f116470b.submit(runnable);
    }

    /* renamed from: f */
    public void m3277f(Runnable runnable) {
        NotifyingRunnable notifyingRunnable = new NotifyingRunnable(runnable);
        synchronized (this.f116472d) {
            m3278e(notifyingRunnable);
            notifyingRunnable.m3276a();
        }
    }

    /* compiled from: HSThreadingService.java */
    /* renamed from: t2.b$a */
    /* loaded from: classes5.dex */
    class RunnableC44350a implements Runnable {
        RunnableC44350a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }
}
