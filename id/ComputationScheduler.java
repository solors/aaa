package id;

import ad.Scheduler;
import androidx.compose.animation.core.C0379a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: id.a */
/* loaded from: classes9.dex */
public final class ComputationScheduler extends Scheduler {

    /* renamed from: d */
    static final C33623a f92036d;

    /* renamed from: e */
    static final RxThreadFactory f92037e;

    /* renamed from: f */
    static final int f92038f = m23026a(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* renamed from: g */
    static final C33624b f92039g;

    /* renamed from: b */
    final ThreadFactory f92040b;

    /* renamed from: c */
    final AtomicReference<C33623a> f92041c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: id.a$a */
    /* loaded from: classes9.dex */
    public static final class C33623a {

        /* renamed from: a */
        final int f92042a;

        /* renamed from: b */
        final C33624b[] f92043b;

        C33623a(int i, ThreadFactory threadFactory) {
            this.f92042a = i;
            this.f92043b = new C33624b[i];
            for (int i2 = 0; i2 < i; i2++) {
                this.f92043b[i2] = new C33624b(threadFactory);
            }
        }

        /* renamed from: a */
        public void m23024a() {
            for (C33624b c33624b : this.f92043b) {
                c33624b.dispose();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ComputationScheduler.java */
    /* renamed from: id.a$b */
    /* loaded from: classes9.dex */
    public static final class C33624b extends NewThreadWorker {
        C33624b(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        C33624b c33624b = new C33624b(new RxThreadFactory("RxComputationShutdown"));
        f92039g = c33624b;
        c33624b.dispose();
        RxThreadFactory rxThreadFactory = new RxThreadFactory("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f92037e = rxThreadFactory;
        C33623a c33623a = new C33623a(0, rxThreadFactory);
        f92036d = c33623a;
        c33623a.m23024a();
    }

    public ComputationScheduler() {
        this(f92037e);
    }

    /* renamed from: a */
    static int m23026a(int i, int i2) {
        if (i2 > 0 && i2 <= i) {
            return i2;
        }
        return i;
    }

    /* renamed from: b */
    public void m23025b() {
        C33623a c33623a = new C33623a(f92038f, this.f92040b);
        if (!C0379a.m105461a(this.f92041c, f92036d, c33623a)) {
            c33623a.m23024a();
        }
    }

    public ComputationScheduler(ThreadFactory threadFactory) {
        this.f92040b = threadFactory;
        this.f92041c = new AtomicReference<>(f92036d);
        m23025b();
    }
}
