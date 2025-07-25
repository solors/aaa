package com.google.firebase.crashlytics.internal;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutAssignment;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsState;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CrashlyticsRemoteConfigListener.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CrashlyticsRemoteConfigListener implements RolloutsStateSubscriber {
    @NotNull

    /* renamed from: a */
    private final UserMetadata f42262a;

    public CrashlyticsRemoteConfigListener(@NotNull UserMetadata userMetadata) {
        Intrinsics.checkNotNullParameter(userMetadata, "userMetadata");
        this.f42262a = userMetadata;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber
    public void onRolloutsStateChanged(@NotNull RolloutsState rolloutsState) {
        int m17154x;
        Intrinsics.checkNotNullParameter(rolloutsState, "rolloutsState");
        UserMetadata userMetadata = this.f42262a;
        Set<RolloutAssignment> rolloutAssignments = rolloutsState.getRolloutAssignments();
        Intrinsics.checkNotNullExpressionValue(rolloutAssignments, "rolloutsState.rolloutAssignments");
        Set<RolloutAssignment> set = rolloutAssignments;
        m17154x = C37566w.m17154x(set, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (RolloutAssignment rolloutAssignment : set) {
            arrayList.add(com.google.firebase.crashlytics.internal.metadata.RolloutAssignment.create(rolloutAssignment.getRolloutId(), rolloutAssignment.getParameterKey(), rolloutAssignment.getParameterValue(), rolloutAssignment.getVariantId(), rolloutAssignment.getTemplateVersion()));
        }
        userMetadata.updateRolloutsState(arrayList);
        Logger.getLogger().m67216d("Updated Crashlytics Rollout State");
    }
}
