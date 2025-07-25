package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.NonNull;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* loaded from: classes4.dex */
final class AutoValue_CrashlyticsReport_Session_Event_RolloutsState extends CrashlyticsReport.Session.Event.RolloutsState {

    /* renamed from: a */
    private final List<CrashlyticsReport.Session.Event.RolloutAssignment> f42867a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Builder extends CrashlyticsReport.Session.Event.RolloutsState.Builder {

        /* renamed from: a */
        private List<CrashlyticsReport.Session.Event.RolloutAssignment> f42868a;

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState build() {
            String str = "";
            if (this.f42868a == null) {
                str = " rolloutAssignments";
            }
            if (str.isEmpty()) {
                return new AutoValue_CrashlyticsReport_Session_Event_RolloutsState(this.f42868a);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState.Builder
        public CrashlyticsReport.Session.Event.RolloutsState.Builder setRolloutAssignments(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
            if (list != null) {
                this.f42868a = list;
                return this;
            }
            throw new NullPointerException("Null rolloutAssignments");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CrashlyticsReport.Session.Event.RolloutsState) {
            return this.f42867a.equals(((CrashlyticsReport.Session.Event.RolloutsState) obj).getRolloutAssignments());
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.model.CrashlyticsReport.Session.Event.RolloutsState
    @NonNull
    @Encodable.Field(name = "assignments")
    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getRolloutAssignments() {
        return this.f42867a;
    }

    public int hashCode() {
        return this.f42867a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f42867a + "}";
    }

    private AutoValue_CrashlyticsReport_Session_Event_RolloutsState(List<CrashlyticsReport.Session.Event.RolloutAssignment> list) {
        this.f42867a = list;
    }
}
