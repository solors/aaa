package com.bytedance.adsdk.p183IL;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.adsdk.IL.Ta */
/* loaded from: classes3.dex */
public class C6682Ta<T> {

    /* renamed from: bg */
    public static Executor f14176bg = Executors.newCachedThreadPool();

    /* renamed from: IL */
    private final Set<InterfaceC6685VB<T>> f14177IL;

    /* renamed from: bX */
    private final Set<InterfaceC6685VB<Throwable>> f14178bX;
    private final Handler eqN;

    /* renamed from: zx */
    private volatile C6681PX<T> f14179zx;

    /* renamed from: com.bytedance.adsdk.IL.Ta$bg */
    /* loaded from: classes3.dex */
    private class C6684bg extends FutureTask<C6681PX<T>> {
        C6684bg(Callable<C6681PX<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (!isCancelled()) {
                try {
                    C6682Ta.this.m91152bg((C6681PX) get());
                } catch (InterruptedException | ExecutionException e) {
                    C6682Ta.this.m91152bg(new C6681PX(e));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C6682Ta(Callable<C6681PX<T>> callable) {
        this(callable, false);
    }

    /* renamed from: IL */
    public synchronized C6682Ta<T> m91155IL(InterfaceC6685VB<T> interfaceC6685VB) {
        this.f14177IL.remove(interfaceC6685VB);
        return this;
    }

    /* renamed from: bX */
    public synchronized C6682Ta<T> m91154bX(InterfaceC6685VB<Throwable> interfaceC6685VB) {
        C6681PX<T> c6681px = this.f14179zx;
        if (c6681px != null && c6681px.m91157IL() != null) {
            interfaceC6685VB.mo90654bg(c6681px.m91157IL());
        }
        this.f14178bX.add(interfaceC6685VB);
        return this;
    }

    public synchronized C6682Ta<T> eqN(InterfaceC6685VB<Throwable> interfaceC6685VB) {
        this.f14178bX.remove(interfaceC6685VB);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C6682Ta(Callable<C6681PX<T>> callable, boolean z) {
        this.f14177IL = new LinkedHashSet(1);
        this.f14178bX = new LinkedHashSet(1);
        this.eqN = new Handler(Looper.getMainLooper());
        this.f14179zx = null;
        if (z) {
            try {
                m91152bg((C6681PX) callable.call());
                return;
            } catch (Throwable th) {
                m91152bg((C6681PX) new C6681PX<>(th));
                return;
            }
        }
        f14176bg.execute(new C6684bg(callable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public void m91152bg(C6681PX<T> c6681px) {
        if (this.f14179zx == null) {
            this.f14179zx = c6681px;
            m91153bg();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: bg */
    public synchronized C6682Ta<T> m91147bg(InterfaceC6685VB<T> interfaceC6685VB) {
        C6681PX<T> c6681px = this.f14179zx;
        if (c6681px != null && c6681px.m91156bg() != null) {
            interfaceC6685VB.mo90654bg(c6681px.m91156bg());
        }
        this.f14177IL.add(interfaceC6685VB);
        return this;
    }

    /* renamed from: bg */
    private void m91153bg() {
        this.eqN.post(new Runnable() { // from class: com.bytedance.adsdk.IL.Ta.1
            @Override // java.lang.Runnable
            public void run() {
                C6681PX c6681px = C6682Ta.this.f14179zx;
                if (c6681px == null) {
                    return;
                }
                if (c6681px.m91156bg() != null) {
                    C6682Ta.this.m91146bg((C6682Ta) c6681px.m91156bg());
                } else {
                    C6682Ta.this.m91145bg(c6681px.m91157IL());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public synchronized void m91146bg(T t) {
        for (InterfaceC6685VB interfaceC6685VB : new ArrayList(this.f14177IL)) {
            interfaceC6685VB.mo90654bg(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public synchronized void m91145bg(Throwable th) {
        ArrayList<InterfaceC6685VB> arrayList = new ArrayList(this.f14178bX);
        if (arrayList.isEmpty()) {
            return;
        }
        for (InterfaceC6685VB interfaceC6685VB : arrayList) {
            interfaceC6685VB.mo90654bg(th);
        }
    }
}
