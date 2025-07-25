package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@AutoValue
/* loaded from: classes4.dex */
public abstract class SchedulerConfig {

    /* loaded from: classes4.dex */
    public static class Builder {

        /* renamed from: a */
        private Clock f31186a;

        /* renamed from: b */
        private Map<Priority, ConfigValue> f31187b = new HashMap();

        public Builder addConfig(Priority priority, ConfigValue configValue) {
            this.f31187b.put(priority, configValue);
            return this;
        }

        public SchedulerConfig build() {
            if (this.f31186a != null) {
                if (this.f31187b.keySet().size() >= Priority.values().length) {
                    Map<Priority, ConfigValue> map = this.f31187b;
                    this.f31187b = new HashMap();
                    return SchedulerConfig.m76270b(this.f31186a, map);
                }
                throw new IllegalStateException("Not all priorities have been configured");
            }
            throw new NullPointerException("missing required property: clock");
        }

        public Builder setClock(Clock clock) {
            this.f31186a = clock;
            return this;
        }
    }

    @AutoValue
    /* loaded from: classes4.dex */
    public static abstract class ConfigValue {

        @AutoValue.Builder
        /* loaded from: classes4.dex */
        public static abstract class Builder {
            public abstract ConfigValue build();

            public abstract Builder setDelta(long j);

            public abstract Builder setFlags(Set<Flag> set);

            public abstract Builder setMaxAllowedDelay(long j);
        }

        public static Builder builder() {
            return new AutoValue_SchedulerConfig_ConfigValue.Builder().setFlags(Collections.emptySet());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract long mo76265a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract Set<Flag> mo76264b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract long mo76263c();
    }

    /* loaded from: classes4.dex */
    public enum Flag {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    /* renamed from: a */
    private long m76271a(int i, long j) {
        long j2;
        int i2 = i - 1;
        if (j > 1) {
            j2 = j;
        } else {
            j2 = 2;
        }
        return (long) (Math.pow(3.0d, i2) * j * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2)));
    }

    /* renamed from: b */
    static SchedulerConfig m76270b(Clock clock, Map<Priority, ConfigValue> map) {
        return new AutoValue_SchedulerConfig(clock, map);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: e */
    private static <T> Set<T> m76267e(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    @RequiresApi(api = 21)
    /* renamed from: f */
    private void m76266f(JobInfo.Builder builder, Set<Flag> set) {
        if (set.contains(Flag.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(Flag.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(Flag.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public static SchedulerConfig getDefault(Clock clock) {
        return builder().addConfig(Priority.DEFAULT, ConfigValue.builder().setDelta(30000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.HIGHEST, ConfigValue.builder().setDelta(1000L).setMaxAllowedDelay(86400000L).build()).addConfig(Priority.VERY_LOW, ConfigValue.builder().setDelta(86400000L).setMaxAllowedDelay(86400000L).setFlags(m76267e(Flag.DEVICE_IDLE)).build()).setClock(clock).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract Clock mo76269c();

    @RequiresApi(api = 21)
    public JobInfo.Builder configureJob(JobInfo.Builder builder, Priority priority, long j, int i) {
        builder.setMinimumLatency(getScheduleDelay(priority, j, i));
        m76266f(builder, mo76268d().get(priority).mo76264b());
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract Map<Priority, ConfigValue> mo76268d();

    public Set<Flag> getFlags(Priority priority) {
        return mo76268d().get(priority).mo76264b();
    }

    public long getScheduleDelay(Priority priority, long j, int i) {
        long time = j - mo76269c().getTime();
        ConfigValue configValue = mo76268d().get(priority);
        return Math.min(Math.max(m76271a(i, configValue.mo76265a()), time), configValue.mo76263c());
    }
}
