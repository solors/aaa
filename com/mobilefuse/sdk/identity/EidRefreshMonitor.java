package com.mobilefuse.sdk.identity;

import com.mobilefuse.sdk.internal.IntervalTaskRunner;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: EidRefreshMonitor.kt */
@Metadata
/* loaded from: classes7.dex */
public final class EidRefreshMonitor {
    @Nullable
    private Functions<Unit> onTimeout;
    private IntervalTaskRunner taskRunner;

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTaskRunnerComplete() {
        stop();
        Functions<Unit> functions = this.onTimeout;
        if (functions != null) {
            functions.invoke();
        }
    }

    public static /* synthetic */ boolean start$default(EidRefreshMonitor eidRefreshMonitor, long j, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return eidRefreshMonitor.start(j, z);
    }

    @Nullable
    public final Functions<Unit> getOnTimeout() {
        return this.onTimeout;
    }

    public final void setOnTimeout(@Nullable Functions<Unit> functions) {
        this.onTimeout = functions;
    }

    public final boolean start(long j, boolean z) {
        stop();
        if (j <= 0) {
            return false;
        }
        if (z && j <= System.currentTimeMillis()) {
            return false;
        }
        final EidRefreshMonitor$start$1 eidRefreshMonitor$start$1 = new EidRefreshMonitor$start$1(this);
        IntervalTaskRunner intervalTaskRunner = new IntervalTaskRunner(j - System.currentTimeMillis(), false, new IntervalTaskRunner.Listener() { // from class: com.mobilefuse.sdk.identity.EidRefreshMonitor$sam$com_mobilefuse_sdk_internal_IntervalTaskRunner_Listener$0
            @Override // com.mobilefuse.sdk.internal.IntervalTaskRunner.Listener
            public final /* synthetic */ void onTaskRun() {
                Intrinsics.checkNotNullExpressionValue(Functions.this.invoke(), "invoke(...)");
            }
        });
        intervalTaskRunner.setRunInBackground(false);
        intervalTaskRunner.start();
        Unit unit = Unit.f99208a;
        this.taskRunner = intervalTaskRunner;
        return true;
    }

    public final void stop() {
        IntervalTaskRunner intervalTaskRunner = this.taskRunner;
        if (intervalTaskRunner != null) {
            intervalTaskRunner.reset();
        }
        this.taskRunner = null;
    }
}
