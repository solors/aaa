package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import java.util.Set;

/* loaded from: classes4.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends SchedulerConfig.ConfigValue {

    /* renamed from: a */
    private final long f31177a;

    /* renamed from: b */
    private final long f31178b;

    /* renamed from: c */
    private final Set<SchedulerConfig.Flag> f31179c;

    /* loaded from: classes4.dex */
    static final class Builder extends SchedulerConfig.ConfigValue.Builder {

        /* renamed from: a */
        private Long f31180a;

        /* renamed from: b */
        private Long f31181b;

        /* renamed from: c */
        private Set<SchedulerConfig.Flag> f31182c;

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue build() {
            String str = "";
            if (this.f31180a == null) {
                str = " delta";
            }
            if (this.f31181b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.f31182c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new AutoValue_SchedulerConfig_ConfigValue(this.f31180a.longValue(), this.f31181b.longValue(), this.f31182c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setDelta(long j) {
            this.f31180a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setFlags(Set<SchedulerConfig.Flag> set) {
            if (set != null) {
                this.f31182c = set;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j) {
            this.f31181b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: a */
    long mo76265a() {
        return this.f31177a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: b */
    Set<SchedulerConfig.Flag> mo76264b() {
        return this.f31179c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    /* renamed from: c */
    long mo76263c() {
        return this.f31178b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig.ConfigValue)) {
            return false;
        }
        SchedulerConfig.ConfigValue configValue = (SchedulerConfig.ConfigValue) obj;
        if (this.f31177a == configValue.mo76265a() && this.f31178b == configValue.mo76263c() && this.f31179c.equals(configValue.mo76264b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f31177a;
        long j2 = this.f31178b;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f31179c.hashCode();
    }

    public String toString() {
        return "ConfigValue{delta=" + this.f31177a + ", maxAllowedDelay=" + this.f31178b + ", flags=" + this.f31179c + "}";
    }

    private AutoValue_SchedulerConfig_ConfigValue(long j, long j2, Set<SchedulerConfig.Flag> set) {
        this.f31177a = j;
        this.f31178b = j2;
        this.f31179c = set;
    }
}
