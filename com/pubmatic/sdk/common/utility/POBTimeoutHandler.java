package com.pubmatic.sdk.common.utility;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import java.util.ArrayList;

@MainThread
/* loaded from: classes7.dex */
public class POBTimeoutHandler {
    @NonNull

    /* renamed from: a */
    private final POBTimeoutHandlerListener f70316a;
    @NonNull

    /* renamed from: b */
    private final Handler f70317b = new Handler(Looper.getMainLooper());
    @NonNull

    /* renamed from: c */
    private final ArrayList<Runnable> f70318c = new ArrayList<>(1);
    @Nullable

    /* renamed from: d */
    private Runnable f70319d;

    /* loaded from: classes7.dex */
    public interface POBTimeoutHandlerListener {
        @MainThread
        void onTimeout();
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBTimeoutHandler$a */
    /* loaded from: classes7.dex */
    class RunnableC26733a implements Runnable {
        RunnableC26733a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTimeoutHandler.this.f70316a.onTimeout();
        }
    }

    /* renamed from: com.pubmatic.sdk.common.utility.POBTimeoutHandler$b */
    /* loaded from: classes7.dex */
    class RunnableC26734b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f70321a;

        RunnableC26734b(long j) {
            this.f70321a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBTimeoutHandler.this.f70316a.onTimeout();
            if (POBTimeoutHandler.this.f70318c.contains(this)) {
                POBTimeoutHandler.this.m40528a(this.f70321a, this);
            }
        }
    }

    @MainThread
    public POBTimeoutHandler(@NonNull POBTimeoutHandlerListener pOBTimeoutHandlerListener) {
        m40529a();
        this.f70316a = pOBTimeoutHandlerListener;
    }

    @MainThread
    public void cancel() {
        m40529a();
        Runnable runnable = this.f70319d;
        if (runnable != null) {
            this.f70318c.remove(runnable);
            this.f70317b.removeCallbacks(this.f70319d);
        }
        this.f70319d = null;
    }

    @MainThread
    public boolean start(long j) {
        m40529a();
        cancel();
        RunnableC26733a runnableC26733a = new RunnableC26733a();
        this.f70319d = runnableC26733a;
        return m40528a(j, runnableC26733a);
    }

    @MainThread
    public boolean startAtFixedRate(long j, long j2) {
        m40529a();
        cancel();
        RunnableC26734b runnableC26734b = new RunnableC26734b(j2);
        this.f70319d = runnableC26734b;
        return m40528a(j, runnableC26734b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m40528a(long j, @NonNull Runnable runnable) {
        if (j < 0) {
            POBLog.error("POBTimeoutHandler", "Can not start timeout task as provided delay is invalid.", new Object[0]);
            return false;
        }
        this.f70318c.add(runnable);
        return this.f70317b.postDelayed(runnable, j);
    }

    /* renamed from: a */
    private void m40529a() {
        if (POBUtils.isMainThread()) {
            return;
        }
        POBLog.warn("POBTimeoutHandler", "The API should be called on main thread.", new Object[0]);
    }
}
