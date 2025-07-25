package androidx.work.impl.constraints.trackers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: BroadcastReceiverConstraintTracker.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public abstract class BroadcastReceiverConstraintTracker<T> extends ConstraintTracker<T> {
    @NotNull
    private final BroadcastReceiver broadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastReceiverConstraintTracker(@NotNull Context context, @NotNull TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        this.broadcastReceiver = new BroadcastReceiver(this) { // from class: androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker$broadcastReceiver$1
            final /* synthetic */ BroadcastReceiverConstraintTracker<T> this$0;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.this$0 = this;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(@NotNull Context context2, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(context2, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                this.this$0.onBroadcastReceive(intent);
            }
        };
    }

    @NotNull
    public abstract IntentFilter getIntentFilter();

    public abstract void onBroadcastReceive(@NotNull Intent intent);

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void startTracking() {
        String str;
        Logger logger = Logger.get();
        str = BroadcastReceiverConstraintTrackerKt.TAG;
        logger.debug(str, getClass().getSimpleName() + ": registering receiver");
        getAppContext().registerReceiver(this.broadcastReceiver, getIntentFilter());
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    public void stopTracking() {
        String str;
        Logger logger = Logger.get();
        str = BroadcastReceiverConstraintTrackerKt.TAG;
        logger.debug(str, getClass().getSimpleName() + ": unregistering receiver");
        getAppContext().unregisterReceiver(this.broadcastReceiver);
    }
}
