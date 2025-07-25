package sg.bigo.ads.common.p914g.p915a;

import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import sg.bigo.ads.common.p926n.ExecutorC43735e;

/* renamed from: sg.bigo.ads.common.g.a.c */
/* loaded from: classes10.dex */
public final class C43670c {

    /* renamed from: a */
    final LinkedList<Runnable> f114303a = new LinkedList<>();

    /* renamed from: b */
    final Object f114304b = new Object();

    /* renamed from: c */
    final ExecutorC43735e f114305c;

    /* renamed from: sg.bigo.ads.common.g.a.c$a */
    /* loaded from: classes10.dex */
    static class RunnableC43672a implements Runnable {

        /* renamed from: a */
        final CountDownLatch f114309a = new CountDownLatch(1);

        /* renamed from: b */
        Runnable f114310b = new Runnable() { // from class: sg.bigo.ads.common.g.a.c.a.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    RunnableC43672a.this.f114309a.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        };

        /* renamed from: c */
        private final Runnable f114311c;

        public RunnableC43672a(Runnable runnable) {
            this.f114311c = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f114311c.run();
            this.f114309a.countDown();
        }
    }

    public C43670c() {
        ExecutorC43735e executorC43735e = new ExecutorC43735e("Waitable", 1, 1);
        this.f114305c = executorC43735e;
        executorC43735e.f114462a.allowCoreThreadTimeOut(true);
    }
}
