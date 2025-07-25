package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.AbstractC30511hx;
import com.yandex.mobile.ads.impl.C30342fx;
import com.yandex.mobile.ads.impl.C30423gx;
import java.util.ArrayDeque;

/* loaded from: classes8.dex */
public abstract class zt1<I extends C30423gx, O extends AbstractC30511hx, E extends C30342fx> implements InterfaceC30196dx<I, O, E> {

    /* renamed from: a */
    private final Thread f89101a;

    /* renamed from: b */
    private final Object f89102b = new Object();

    /* renamed from: c */
    private final ArrayDeque<I> f89103c = new ArrayDeque<>();

    /* renamed from: d */
    private final ArrayDeque<O> f89104d = new ArrayDeque<>();

    /* renamed from: e */
    private final I[] f89105e;

    /* renamed from: f */
    private final O[] f89106f;

    /* renamed from: g */
    private int f89107g;

    /* renamed from: h */
    private int f89108h;
    @Nullable

    /* renamed from: i */
    private I f89109i;
    @Nullable

    /* renamed from: j */
    private qy1 f89110j;

    /* renamed from: k */
    private boolean f89111k;

    /* renamed from: l */
    private boolean f89112l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.zt1$a */
    /* loaded from: classes8.dex */
    public final class C32016a extends Thread {

        /* renamed from: b */
        final /* synthetic */ zt1 f89113b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32016a(eu1 eu1Var) {
            super("ExoPlayer:SimpleDecoder");
            this.f89113b = eu1Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            zt1 zt1Var = this.f89113b;
            zt1Var.getClass();
            do {
                try {
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            } while (zt1Var.m25994e());
        }
    }

    public zt1(I[] iArr, O[] oArr) {
        this.f89105e = iArr;
        this.f89107g = iArr.length;
        for (int i = 0; i < this.f89107g; i++) {
            this.f89105e[i] = mo25996c();
        }
        this.f89106f = oArr;
        this.f89108h = oArr.length;
        for (int i2 = 0; i2 < this.f89108h; i2++) {
            this.f89106f[i2] = mo25995d();
        }
        C32016a c32016a = new C32016a((eu1) this);
        this.f89101a = c32016a;
        c32016a.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m25994e() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f89102b
            monitor-enter(r0)
        L3:
            boolean r1 = r8.f89112l     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L1a
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.gx> r1 = r8.f89103c     // Catch: java.lang.Throwable -> La8
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto L14
            int r1 = r8.f89108h     // Catch: java.lang.Throwable -> La8
            if (r1 <= 0) goto L14
            goto L1a
        L14:
            java.lang.Object r1 = r8.f89102b     // Catch: java.lang.Throwable -> La8
            r1.wait()     // Catch: java.lang.Throwable -> La8
            goto L3
        L1a:
            boolean r1 = r8.f89112l     // Catch: java.lang.Throwable -> La8
            r2 = 0
            if (r1 == 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            return r2
        L21:
            java.util.ArrayDeque<I extends com.yandex.mobile.ads.impl.gx> r1 = r8.f89103c     // Catch: java.lang.Throwable -> La8
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> La8
            com.yandex.mobile.ads.impl.gx r1 = (com.yandex.mobile.ads.impl.C30423gx) r1     // Catch: java.lang.Throwable -> La8
            O extends com.yandex.mobile.ads.impl.hx[] r3 = r8.f89106f     // Catch: java.lang.Throwable -> La8
            int r4 = r8.f89108h     // Catch: java.lang.Throwable -> La8
            r5 = 1
            int r4 = r4 - r5
            r8.f89108h = r4     // Catch: java.lang.Throwable -> La8
            r3 = r3[r4]     // Catch: java.lang.Throwable -> La8
            boolean r4 = r8.f89111k     // Catch: java.lang.Throwable -> La8
            r8.f89111k = r2     // Catch: java.lang.Throwable -> La8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            r0 = 4
            boolean r6 = r1.m34138c(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L45
            r3.m34140b(r0)
            goto L7c
        L45:
            boolean r0 = r1.m34138c(r7)
            if (r0 == 0) goto L4e
            r3.m34140b(r7)
        L4e:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            boolean r6 = r1.m34138c(r0)
            if (r6 == 0) goto L59
            r3.m34140b(r0)
        L59:
            com.yandex.mobile.ads.impl.qy1 r0 = r8.mo26001a(r1, r3, r4)     // Catch: java.lang.OutOfMemoryError -> L5e java.lang.RuntimeException -> L67
            goto L70
        L5e:
            r0 = move-exception
            com.yandex.mobile.ads.impl.qy1 r4 = new com.yandex.mobile.ads.impl.qy1
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
            goto L6f
        L67:
            r0 = move-exception
            com.yandex.mobile.ads.impl.qy1 r4 = new com.yandex.mobile.ads.impl.qy1
            java.lang.String r6 = "Unexpected decode error"
            r4.<init>(r6, r0)
        L6f:
            r0 = r4
        L70:
            if (r0 == 0) goto L7c
            java.lang.Object r4 = r8.f89102b
            monitor-enter(r4)
            r8.f89110j = r0     // Catch: java.lang.Throwable -> L79
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L79
            return r2
        L79:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L79
            throw r0
        L7c:
            java.lang.Object r2 = r8.f89102b
            monitor-enter(r2)
            boolean r0 = r8.f89111k     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L87
            r3.mo27665h()     // Catch: java.lang.Throwable -> La5
            goto L96
        L87:
            boolean r0 = r3.m34138c(r7)     // Catch: java.lang.Throwable -> La5
            if (r0 == 0) goto L91
            r3.mo27665h()     // Catch: java.lang.Throwable -> La5
            goto L96
        L91:
            java.util.ArrayDeque<O extends com.yandex.mobile.ads.impl.hx> r0 = r8.f89104d     // Catch: java.lang.Throwable -> La5
            r0.addLast(r3)     // Catch: java.lang.Throwable -> La5
        L96:
            r1.mo28933b()     // Catch: java.lang.Throwable -> La5
            I extends com.yandex.mobile.ads.impl.gx[] r0 = r8.f89105e     // Catch: java.lang.Throwable -> La5
            int r3 = r8.f89107g     // Catch: java.lang.Throwable -> La5
            int r4 = r3 + 1
            r8.f89107g = r4     // Catch: java.lang.Throwable -> La5
            r0[r3] = r1     // Catch: java.lang.Throwable -> La5
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            return r5
        La5:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La5
            throw r0
        La8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La8
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.zt1.m25994e():boolean");
    }

    @Nullable
    /* renamed from: a */
    protected abstract qy1 mo26001a(C30423gx c30423gx, AbstractC30511hx abstractC30511hx, boolean z);

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: b */
    public final Object mo25997b() throws C30342fx {
        I i;
        synchronized (this.f89102b) {
            qy1 qy1Var = this.f89110j;
            if (qy1Var == null) {
                if (this.f89109i == null) {
                    int i2 = this.f89107g;
                    if (i2 == 0) {
                        i = null;
                    } else {
                        I[] iArr = this.f89105e;
                        int i3 = i2 - 1;
                        this.f89107g = i3;
                        i = iArr[i3];
                    }
                    this.f89109i = i;
                } else {
                    throw new IllegalStateException();
                }
            } else {
                throw qy1Var;
            }
        }
        return i;
    }

    /* renamed from: c */
    protected abstract sy1 mo25996c();

    /* renamed from: d */
    protected abstract O mo25995d();

    /* renamed from: f */
    public final void m25993f() {
        int i = this.f89107g;
        I[] iArr = this.f89105e;
        if (i == iArr.length) {
            for (I i2 : iArr) {
                i2.m33761e(1024);
            }
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    public final void flush() {
        synchronized (this.f89102b) {
            this.f89111k = true;
            I i = this.f89109i;
            if (i != null) {
                i.mo28933b();
                I[] iArr = this.f89105e;
                int i2 = this.f89107g;
                this.f89107g = i2 + 1;
                iArr[i2] = i;
                this.f89109i = null;
            }
            while (!this.f89103c.isEmpty()) {
                I removeFirst = this.f89103c.removeFirst();
                removeFirst.mo28933b();
                I[] iArr2 = this.f89105e;
                int i3 = this.f89107g;
                this.f89107g = i3 + 1;
                iArr2[i3] = removeFirst;
            }
            while (!this.f89104d.isEmpty()) {
                this.f89104d.removeFirst().mo27665h();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @CallSuper
    public final void release() {
        synchronized (this.f89102b) {
            this.f89112l = true;
            this.f89102b.notify();
        }
        try {
            this.f89101a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    @Nullable
    /* renamed from: a */
    public final Object mo26002a() throws C30342fx {
        synchronized (this.f89102b) {
            qy1 qy1Var = this.f89110j;
            if (qy1Var == null) {
                if (this.f89104d.isEmpty()) {
                    return null;
                }
                return this.f89104d.removeFirst();
            }
            throw qy1Var;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30196dx
    /* renamed from: a */
    public final void mo25999a(sy1 sy1Var) throws C30342fx {
        synchronized (this.f89102b) {
            qy1 qy1Var = this.f89110j;
            if (qy1Var == null) {
                if (sy1Var == this.f89109i) {
                    this.f89103c.addLast(sy1Var);
                    if (!this.f89103c.isEmpty() && this.f89108h > 0) {
                        this.f89102b.notify();
                    }
                    this.f89109i = null;
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw qy1Var;
            }
        }
    }

    @CallSuper
    /* renamed from: a */
    public final void m26000a(O o) {
        synchronized (this.f89102b) {
            o.mo28933b();
            O[] oArr = this.f89106f;
            int i = this.f89108h;
            this.f89108h = i + 1;
            oArr[i] = o;
            if (!this.f89103c.isEmpty() && this.f89108h > 0) {
                this.f89102b.notify();
            }
        }
    }
}
