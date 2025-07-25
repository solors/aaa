package androidx.activity;

import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FullyDrawnReporter.kt */
@Metadata
/* loaded from: classes.dex */
public final class FullyDrawnReporter {
    @NotNull
    private final Executor executor;
    @NotNull
    private final Object lock;
    @GuardedBy("lock")
    @NotNull
    private final List<Functions<Unit>> onReportCallbacks;
    @NotNull
    private final Functions<Unit> reportFullyDrawn;
    @GuardedBy("lock")
    private boolean reportPosted;
    @NotNull
    private final Runnable reportRunnable;
    @GuardedBy("lock")
    private boolean reportedFullyDrawn;
    @GuardedBy("lock")
    private int reporterCount;

    public FullyDrawnReporter(@NotNull Executor executor, @NotNull Functions<Unit> reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.executor = executor;
        this.reportFullyDrawn = reportFullyDrawn;
        this.lock = new Object();
        this.onReportCallbacks = new ArrayList();
        this.reportRunnable = new Runnable() { // from class: androidx.activity.j
            @Override // java.lang.Runnable
            public final void run() {
                FullyDrawnReporter.m105520a(FullyDrawnReporter.this);
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ void m105520a(FullyDrawnReporter fullyDrawnReporter) {
        reportRunnable$lambda$2(fullyDrawnReporter);
    }

    private final void postWhenReportersAreDone() {
        if (!this.reportPosted && this.reporterCount == 0) {
            this.reportPosted = true;
            this.executor.execute(this.reportRunnable);
        }
    }

    public static final void reportRunnable$lambda$2(FullyDrawnReporter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.lock) {
            this$0.reportPosted = false;
            if (this$0.reporterCount == 0 && !this$0.reportedFullyDrawn) {
                this$0.reportFullyDrawn.invoke();
                this$0.fullyDrawnReported();
            }
            Unit unit = Unit.f99208a;
        }
    }

    public final void addOnReportDrawnListener(@NotNull Functions<Unit> callback) {
        boolean z;
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            if (this.reportedFullyDrawn) {
                z = true;
            } else {
                this.onReportCallbacks.add(callback);
                z = false;
            }
        }
        if (z) {
            callback.invoke();
        }
    }

    public final void addReporter() {
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn) {
                this.reporterCount++;
            }
            Unit unit = Unit.f99208a;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void fullyDrawnReported() {
        synchronized (this.lock) {
            this.reportedFullyDrawn = true;
            Iterator<T> it = this.onReportCallbacks.iterator();
            while (it.hasNext()) {
                ((Functions) it.next()).invoke();
            }
            this.onReportCallbacks.clear();
            Unit unit = Unit.f99208a;
        }
    }

    public final boolean isFullyDrawnReported() {
        boolean z;
        synchronized (this.lock) {
            z = this.reportedFullyDrawn;
        }
        return z;
    }

    public final void removeOnReportDrawnListener(@NotNull Functions<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        synchronized (this.lock) {
            this.onReportCallbacks.remove(callback);
            Unit unit = Unit.f99208a;
        }
    }

    public final void removeReporter() {
        int i;
        synchronized (this.lock) {
            if (!this.reportedFullyDrawn && (i = this.reporterCount) > 0) {
                this.reporterCount = i - 1;
                postWhenReportersAreDone();
            }
            Unit unit = Unit.f99208a;
        }
    }
}
