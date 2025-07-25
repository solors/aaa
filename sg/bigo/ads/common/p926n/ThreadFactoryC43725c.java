package sg.bigo.ads.common.p926n;

import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: sg.bigo.ads.common.n.c */
/* loaded from: classes10.dex */
public final class ThreadFactoryC43725c implements ThreadFactory {

    /* renamed from: e */
    private static InterfaceC43723a f114430e;

    /* renamed from: a */
    private final String f114431a;

    /* renamed from: b */
    private final AtomicInteger f114432b;

    /* renamed from: c */
    private final ThreadFactory f114433c;

    /* renamed from: d */
    private final boolean f114434d;

    public ThreadFactoryC43725c(String str) {
        this(str, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f114433c.newThread(runnable);
        newThread.setName(this.f114431a + "-" + this.f114432b.getAndIncrement());
        if (this.f114434d) {
            newThread.setPriority(10);
        }
        newThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: sg.bigo.ads.common.n.c.1
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
                if (ThreadFactoryC43725c.f114430e != null) {
                    ThreadFactoryC43725c.f114430e.mo4189a(th);
                }
            }
        });
        return newThread;
    }

    public ThreadFactoryC43725c(String str, boolean z) {
        this.f114431a = "BGAd-".concat(String.valueOf(str));
        this.f114432b = new AtomicInteger(1);
        this.f114433c = Executors.defaultThreadFactory();
        this.f114434d = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static void m5110a(InterfaceC43723a interfaceC43723a) {
        f114430e = interfaceC43723a;
    }
}
