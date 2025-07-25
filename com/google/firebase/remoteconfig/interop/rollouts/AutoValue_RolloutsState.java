package com.google.firebase.remoteconfig.interop.rollouts;

import androidx.annotation.NonNull;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class AutoValue_RolloutsState extends RolloutsState {

    /* renamed from: a */
    private final Set<RolloutAssignment> f43619a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_RolloutsState(Set<RolloutAssignment> set) {
        if (set != null) {
            this.f43619a = set;
            return;
        }
        throw new NullPointerException("Null rolloutAssignments");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RolloutsState) {
            return this.f43619a.equals(((RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.remoteconfig.interop.rollouts.RolloutsState
    @NonNull
    public Set<RolloutAssignment> getRolloutAssignments() {
        return this.f43619a;
    }

    public int hashCode() {
        return this.f43619a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f43619a + "}";
    }
}
