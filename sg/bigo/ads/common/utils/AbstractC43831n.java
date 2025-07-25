package sg.bigo.ads.common.utils;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.SystemClock;

/* renamed from: sg.bigo.ads.common.utils.n */
/* loaded from: classes10.dex */
public abstract class AbstractC43831n {

    /* renamed from: a */
    private long f114663a;

    /* renamed from: d */
    final long f114665d;

    /* renamed from: e */
    long f114666e;

    /* renamed from: f */
    long f114667f;

    /* renamed from: g */
    long f114668g;

    /* renamed from: h */
    boolean f114669h = false;

    /* renamed from: i */
    public boolean f114670i = false;
    @SuppressLint({"HandlerLeak"})

    /* renamed from: b */
    private final Handler f114664b = new Handler() { // from class: sg.bigo.ads.common.utils.n.1
        /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[Catch: all -> 0x005d, LOOP:0: B:18:0x003b->B:20:0x003f, LOOP_END, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0009, B:9:0x000e, B:11:0x001c, B:22:0x0059, B:12:0x0024, B:14:0x002c, B:16:0x0032, B:20:0x003f, B:21:0x0045, B:17:0x0039, B:24:0x005b), top: B:29:0x0003 }] */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void handleMessage(android.os.Message r13) {
            /*
                r12 = this;
                sg.bigo.ads.common.utils.n r13 = sg.bigo.ads.common.utils.AbstractC43831n.this
                monitor-enter(r13)
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.AbstractC43831n.this     // Catch: java.lang.Throwable -> L5d
                boolean r1 = r0.f114669h     // Catch: java.lang.Throwable -> L5d
                if (r1 != 0) goto L5b
                boolean r1 = r0.f114670i     // Catch: java.lang.Throwable -> L5d
                if (r1 == 0) goto Le
                goto L5b
            Le:
                long r0 = r0.f114666e     // Catch: java.lang.Throwable -> L5d
                long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5d
                long r0 = r0 - r2
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r5 = 1
                if (r4 > 0) goto L24
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.AbstractC43831n.this     // Catch: java.lang.Throwable -> L5d
                r0.f114670i = r5     // Catch: java.lang.Throwable -> L5d
                r0.mo4864a()     // Catch: java.lang.Throwable -> L5d
                goto L59
            L24:
                sg.bigo.ads.common.utils.n r4 = sg.bigo.ads.common.utils.AbstractC43831n.this     // Catch: java.lang.Throwable -> L5d
                long r6 = r4.f114667f     // Catch: java.lang.Throwable -> L5d
                int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r8 <= 0) goto L39
                long r8 = r4.f114668g     // Catch: java.lang.Throwable -> L5d
                int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r10 <= 0) goto L39
                long r10 = r4.f114665d     // Catch: java.lang.Throwable -> L5d
                long r8 = r8 - r6
                long r10 = r10 - r8
                r4.f114668g = r2     // Catch: java.lang.Throwable -> L5d
                goto L3b
            L39:
                long r10 = r4.f114665d     // Catch: java.lang.Throwable -> L5d
            L3b:
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 >= 0) goto L45
                sg.bigo.ads.common.utils.n r4 = sg.bigo.ads.common.utils.AbstractC43831n.this     // Catch: java.lang.Throwable -> L5d
                long r6 = r4.f114665d     // Catch: java.lang.Throwable -> L5d
                long r10 = r10 + r6
                goto L3b
            L45:
                sg.bigo.ads.common.utils.n r2 = sg.bigo.ads.common.utils.AbstractC43831n.this     // Catch: java.lang.Throwable -> L5d
                r2.mo4863a(r0)     // Catch: java.lang.Throwable -> L5d
                sg.bigo.ads.common.utils.n r0 = sg.bigo.ads.common.utils.AbstractC43831n.this     // Catch: java.lang.Throwable -> L5d
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L5d
                r0.f114667f = r1     // Catch: java.lang.Throwable -> L5d
                android.os.Message r0 = r12.obtainMessage(r5)     // Catch: java.lang.Throwable -> L5d
                r12.sendMessageDelayed(r0, r10)     // Catch: java.lang.Throwable -> L5d
            L59:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
                return
            L5b:
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
                return
            L5d:
                r0 = move-exception
                monitor-exit(r13)     // Catch: java.lang.Throwable -> L5d
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.AbstractC43831n.HandlerC438321.handleMessage(android.os.Message):void");
        }
    };

    public AbstractC43831n(long j, long j2) {
        this.f114665d = j2;
        this.f114663a = j;
    }

    /* renamed from: a */
    public abstract void mo4864a();

    /* renamed from: a */
    public abstract void mo4863a(long j);

    /* renamed from: b */
    public final synchronized void m4862b() {
        this.f114669h = true;
        this.f114664b.removeMessages(1);
    }

    /* renamed from: c */
    public final synchronized AbstractC43831n m4861c() {
        this.f114669h = false;
        if (this.f114663a <= 0) {
            if (!this.f114670i) {
                this.f114670i = true;
                mo4864a();
            }
            return this;
        }
        this.f114666e = SystemClock.elapsedRealtime() + this.f114663a;
        Handler handler = this.f114664b;
        handler.sendMessage(handler.obtainMessage(1));
        return this;
    }

    /* renamed from: d */
    public final void m4860d() {
        if (!this.f114670i && !this.f114669h) {
            m4862b();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f114668g = elapsedRealtime;
            this.f114663a = this.f114666e - elapsedRealtime;
        }
    }

    /* renamed from: e */
    public final boolean m4859e() {
        if (!this.f114670i && this.f114669h) {
            return true;
        }
        return false;
    }
}
