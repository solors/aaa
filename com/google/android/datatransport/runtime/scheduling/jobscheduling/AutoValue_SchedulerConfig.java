package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* loaded from: classes4.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* renamed from: a */
    private final Clock f31175a;

    /* renamed from: b */
    private final Map<Priority, SchedulerConfig.ConfigValue> f31176b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_SchedulerConfig(Clock clock, Map<Priority, SchedulerConfig.ConfigValue> map) {
        if (clock != null) {
            this.f31175a = clock;
            if (map != null) {
                this.f31176b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: c */
    Clock mo76269c() {
        return this.f31175a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    /* renamed from: d */
    Map<Priority, SchedulerConfig.ConfigValue> mo76268d() {
        return this.f31176b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        if (this.f31175a.equals(schedulerConfig.mo76269c()) && this.f31176b.equals(schedulerConfig.mo76268d())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f31175a.hashCode() ^ 1000003) * 1000003) ^ this.f31176b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f31175a + ", values=" + this.f31176b + "}";
    }
}
