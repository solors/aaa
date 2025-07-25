package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComputableLiveData.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class ComputableLiveData<T> {
    @NotNull
    private final LiveData<T> _liveData;
    @NotNull
    private final AtomicBoolean computing;
    @NotNull
    private final Executor executor;
    @NotNull
    private final AtomicBoolean invalid;
    @NotNull
    public final Runnable invalidationRunnable;
    @NotNull
    private final LiveData<T> liveData;
    @NotNull
    public final Runnable refreshRunnable;

    public ComputableLiveData() {
        this(null, 1, null);
    }

    /* renamed from: a */
    public static /* synthetic */ void m104707a(ComputableLiveData computableLiveData) {
        refreshRunnable$lambda$0(computableLiveData);
    }

    /* renamed from: b */
    public static /* synthetic */ void m104706b(ComputableLiveData computableLiveData) {
        invalidationRunnable$lambda$1(computableLiveData);
    }

    public static final void invalidationRunnable$lambda$1(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean hasActiveObservers = this$0.getLiveData().hasActiveObservers();
        if (this$0.invalid.compareAndSet(false, true) && hasActiveObservers) {
            this$0.executor.execute(this$0.refreshRunnable);
        }
    }

    public static final void refreshRunnable$lambda$0(ComputableLiveData this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        do {
            boolean z = false;
            if (this$0.computing.compareAndSet(false, true)) {
                T t = null;
                boolean z2 = false;
                while (this$0.invalid.compareAndSet(true, false)) {
                    try {
                        t = (T) this$0.compute();
                        z2 = true;
                    } catch (Throwable th) {
                        this$0.computing.set(false);
                        throw th;
                    }
                }
                if (z2) {
                    this$0.getLiveData().postValue(t);
                }
                this$0.computing.set(false);
                z = z2;
            }
            if (!z) {
                return;
            }
        } while (this$0.invalid.get());
    }

    @WorkerThread
    protected abstract T compute();

    @NotNull
    public final AtomicBoolean getComputing$lifecycle_livedata_release() {
        return this.computing;
    }

    @NotNull
    public final Executor getExecutor$lifecycle_livedata_release() {
        return this.executor;
    }

    @NotNull
    public final AtomicBoolean getInvalid$lifecycle_livedata_release() {
        return this.invalid;
    }

    @NotNull
    public LiveData<T> getLiveData() {
        return this.liveData;
    }

    public void invalidate() {
        ArchTaskExecutor.getInstance().executeOnMainThread(this.invalidationRunnable);
    }

    public ComputableLiveData(@NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.executor = executor;
        LiveData<T> liveData = new LiveData<T>(this) { // from class: androidx.lifecycle.ComputableLiveData$_liveData$1
            final /* synthetic */ ComputableLiveData<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                this.this$0.getExecutor$lifecycle_livedata_release().execute(this.this$0.refreshRunnable);
            }
        };
        this._liveData = liveData;
        this.liveData = liveData;
        this.invalid = new AtomicBoolean(true);
        this.computing = new AtomicBoolean(false);
        this.refreshRunnable = new Runnable() { // from class: androidx.lifecycle.b
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.m104707a(ComputableLiveData.this);
            }
        };
        this.invalidationRunnable = new Runnable() { // from class: androidx.lifecycle.c
            @Override // java.lang.Runnable
            public final void run() {
                ComputableLiveData.m104706b(ComputableLiveData.this);
            }
        };
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ComputableLiveData(java.util.concurrent.Executor r1, int r2, kotlin.jvm.internal.DefaultConstructorMarker r3) {
        /*
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto Ld
            java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
            java.lang.String r2 = "getIOThreadExecutor()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        Ld:
            r0.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.ComputableLiveData.<init>(java.util.concurrent.Executor, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationRunnable$lifecycle_livedata_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRefreshRunnable$lifecycle_livedata_release$annotations() {
    }
}
