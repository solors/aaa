package com.google.firebase.crashlytics.internal.metadata;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class RolloutAssignmentList {

    /* renamed from: a */
    private final List<RolloutAssignment> f42476a = new ArrayList();

    /* renamed from: b */
    private final int f42477b;

    public RolloutAssignmentList(int i) {
        this.f42477b = i;
    }

    public List<CrashlyticsReport.Session.Event.RolloutAssignment> getReportRolloutsState() {
        List<RolloutAssignment> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rolloutAssignmentList.size(); i++) {
            arrayList.add(rolloutAssignmentList.get(i).toReportProto());
        }
        return arrayList;
    }

    public synchronized List<RolloutAssignment> getRolloutAssignmentList() {
        return Collections.unmodifiableList(new ArrayList(this.f42476a));
    }

    @CanIgnoreReturnValue
    public synchronized boolean updateRolloutAssignmentList(List<RolloutAssignment> list) {
        this.f42476a.clear();
        if (list.size() > this.f42477b) {
            Logger logger = Logger.getLogger();
            logger.m67208w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f42477b);
            return this.f42476a.addAll(list.subList(0, this.f42477b));
        }
        return this.f42476a.addAll(list);
    }
}
