package id;

import com.ironsource.C21114v8;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: id.f */
/* loaded from: classes9.dex */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {

    /* renamed from: b */
    final String f92066b;

    /* renamed from: c */
    final int f92067c;

    /* renamed from: d */
    final boolean f92068d;

    /* compiled from: RxThreadFactory.java */
    /* renamed from: id.f$a */
    /* loaded from: classes9.dex */
    static final class C33627a extends Thread {
        C33627a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread;
        String str = this.f92066b + '-' + incrementAndGet();
        if (this.f92068d) {
            thread = new C33627a(runnable, str);
        } else {
            thread = new Thread(runnable, str);
        }
        thread.setPriority(this.f92067c);
        thread.setDaemon(true);
        return thread;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f92066b + C21114v8.C21123i.f54139e;
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.f92066b = str;
        this.f92067c = i;
        this.f92068d = z;
    }
}
