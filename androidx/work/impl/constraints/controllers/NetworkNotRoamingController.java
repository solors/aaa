package androidx.work.impl.constraints.controllers;

import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.impl.constraints.NetworkState;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContraintControllers.kt */
@Metadata
/* loaded from: classes2.dex */
public final class NetworkNotRoamingController extends ConstraintController<NetworkState> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private static final String TAG;

    /* compiled from: ContraintControllers.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String tagWithPrefix = Logger.tagWithPrefix("NetworkNotRoamingCtrlr");
        Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "tagWithPrefix(\"NetworkNotRoamingCtrlr\")");
        TAG = tagWithPrefix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkNotRoamingController(@NotNull ConstraintTracker<NetworkState> tracker) {
        super(tracker);
        Intrinsics.checkNotNullParameter(tracker, "tracker");
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean hasConstraint(@NotNull WorkSpec workSpec) {
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        if (workSpec.constraints.getRequiredNetworkType() == NetworkType.NOT_ROAMING) {
            return true;
        }
        return false;
    }

    @Override // androidx.work.impl.constraints.controllers.ConstraintController
    public boolean isConstrained(@NotNull NetworkState value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return (value.isConnected() && value.isNotRoaming()) ? false : true;
    }
}
