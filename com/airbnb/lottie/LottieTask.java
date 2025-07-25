package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import p690h0.C33453f;

/* renamed from: com.airbnb.lottie.m */
/* loaded from: classes2.dex */
public class LottieTask<T> {

    /* renamed from: e */
    public static Executor f2249e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<LottieListener<T>> f2250a;

    /* renamed from: b */
    private final Set<LottieListener<Throwable>> f2251b;

    /* renamed from: c */
    private final Handler f2252c;
    @Nullable

    /* renamed from: d */
    private volatile LottieResult<T> f2253d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LottieTask.java */
    /* renamed from: com.airbnb.lottie.m$a */
    /* loaded from: classes2.dex */
    public class RunnableC3512a implements Runnable {
        RunnableC3512a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (LottieTask.this.f2253d != null) {
                LottieResult lottieResult = LottieTask.this.f2253d;
                if (lottieResult.m103256b() != null) {
                    LottieTask.this.m103247i(lottieResult.m103256b());
                } else {
                    LottieTask.this.m103249g(lottieResult.m103257a());
                }
            }
        }
    }

    /* compiled from: LottieTask.java */
    /* renamed from: com.airbnb.lottie.m$b */
    /* loaded from: classes2.dex */
    private class C3513b extends FutureTask<LottieResult<T>> {
        C3513b(Callable<LottieResult<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (!isCancelled()) {
                try {
                    LottieTask.this.m103244l(get());
                } catch (InterruptedException | ExecutionException e) {
                    LottieTask.this.m103244l(new LottieResult(e));
                }
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable) {
        this(callable, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public synchronized void m103249g(Throwable th) {
        ArrayList<LottieListener> arrayList = new ArrayList(this.f2251b);
        if (arrayList.isEmpty()) {
            C33453f.m23900d("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (LottieListener lottieListener : arrayList) {
            lottieListener.onResult(th);
        }
    }

    /* renamed from: h */
    private void m103248h() {
        this.f2252c.post(new RunnableC3512a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m103247i(T t) {
        for (LottieListener lottieListener : new ArrayList(this.f2250a)) {
            lottieListener.onResult(t);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l */
    public void m103244l(@Nullable LottieResult<T> lottieResult) {
        if (this.f2253d == null) {
            this.f2253d = lottieResult;
            m103248h();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: e */
    public synchronized LottieTask<T> m103251e(LottieListener<Throwable> lottieListener) {
        if (this.f2253d != null && this.f2253d.m103257a() != null) {
            lottieListener.onResult(this.f2253d.m103257a());
        }
        this.f2251b.add(lottieListener);
        return this;
    }

    /* renamed from: f */
    public synchronized LottieTask<T> m103250f(LottieListener<T> lottieListener) {
        if (this.f2253d != null && this.f2253d.m103256b() != null) {
            lottieListener.onResult(this.f2253d.m103256b());
        }
        this.f2250a.add(lottieListener);
        return this;
    }

    /* renamed from: j */
    public synchronized LottieTask<T> m103246j(LottieListener<Throwable> lottieListener) {
        this.f2251b.remove(lottieListener);
        return this;
    }

    /* renamed from: k */
    public synchronized LottieTask<T> m103245k(LottieListener<T> lottieListener) {
        this.f2250a.remove(lottieListener);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieTask(Callable<LottieResult<T>> callable, boolean z) {
        this.f2250a = new LinkedHashSet(1);
        this.f2251b = new LinkedHashSet(1);
        this.f2252c = new Handler(Looper.getMainLooper());
        this.f2253d = null;
        if (z) {
            try {
                m103244l(callable.call());
                return;
            } catch (Throwable th) {
                m103244l(new LottieResult<>(th));
                return;
            }
        }
        f2249e.execute(new C3513b(callable));
    }
}
