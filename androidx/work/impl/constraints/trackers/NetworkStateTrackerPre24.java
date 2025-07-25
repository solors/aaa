package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: NetworkStateTracker.kt */
@Metadata
/* loaded from: classes2.dex */
public final class NetworkStateTrackerPre24 extends BroadcastReceiverConstraintTracker<NetworkState> {
    @NotNull
    private final ConnectivityManager connectivityManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStateTrackerPre24(@NotNull Context context, @NotNull TaskExecutor taskExecutor) {
        super(context, taskExecutor);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Object systemService = getAppContext().getSystemService("connectivity");
        Intrinsics.m17073h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.connectivityManager = (ConnectivityManager) systemService;
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    @NotNull
    public IntentFilter getIntentFilter() {
        return new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
    }

    @Override // androidx.work.impl.constraints.trackers.BroadcastReceiverConstraintTracker
    public void onBroadcastReceive(@NotNull Intent intent) {
        String str;
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.m17075f(intent.getAction(), "android.net.conn.CONNECTIVITY_CHANGE")) {
            Logger logger = Logger.get();
            str = NetworkStateTrackerKt.TAG;
            logger.debug(str, "Network broadcast received");
            setState(NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager));
        }
    }

    @Override // androidx.work.impl.constraints.trackers.ConstraintTracker
    @NotNull
    public NetworkState getInitialState() {
        return NetworkStateTrackerKt.getActiveNetworkState(this.connectivityManager);
    }

    public static /* synthetic */ void getIntentFilter$annotations() {
    }
}
