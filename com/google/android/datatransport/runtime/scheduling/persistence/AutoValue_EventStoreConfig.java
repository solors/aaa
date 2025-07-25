package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig;

/* loaded from: classes4.dex */
final class AutoValue_EventStoreConfig extends EventStoreConfig {

    /* renamed from: b */
    private final long f31244b;

    /* renamed from: c */
    private final int f31245c;

    /* renamed from: d */
    private final int f31246d;

    /* renamed from: e */
    private final long f31247e;

    /* renamed from: f */
    private final int f31248f;

    /* loaded from: classes4.dex */
    static final class Builder extends EventStoreConfig.Builder {

        /* renamed from: a */
        private Long f31249a;

        /* renamed from: b */
        private Integer f31250b;

        /* renamed from: c */
        private Integer f31251c;

        /* renamed from: d */
        private Long f31252d;

        /* renamed from: e */
        private Integer f31253e;

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        /* renamed from: a */
        EventStoreConfig mo76233a() {
            String str = "";
            if (this.f31249a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.f31250b == null) {
                str = str + " loadBatchSize";
            }
            if (this.f31251c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.f31252d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.f31253e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new AutoValue_EventStoreConfig(this.f31249a.longValue(), this.f31250b.intValue(), this.f31251c.intValue(), this.f31252d.longValue(), this.f31253e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        /* renamed from: b */
        EventStoreConfig.Builder mo76232b(int i) {
            this.f31251c = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        /* renamed from: c */
        EventStoreConfig.Builder mo76231c(long j) {
            this.f31252d = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        /* renamed from: d */
        EventStoreConfig.Builder mo76230d(int i) {
            this.f31250b = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        /* renamed from: e */
        EventStoreConfig.Builder mo76229e(int i) {
            this.f31253e = Integer.valueOf(i);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.Builder
        /* renamed from: f */
        EventStoreConfig.Builder mo76228f(long j) {
            this.f31249a = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: b */
    int mo76238b() {
        return this.f31246d;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: c */
    long mo76237c() {
        return this.f31247e;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: d */
    int mo76236d() {
        return this.f31245c;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: e */
    int mo76235e() {
        return this.f31248f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventStoreConfig)) {
            return false;
        }
        EventStoreConfig eventStoreConfig = (EventStoreConfig) obj;
        if (this.f31244b == eventStoreConfig.mo76234f() && this.f31245c == eventStoreConfig.mo76236d() && this.f31246d == eventStoreConfig.mo76238b() && this.f31247e == eventStoreConfig.mo76237c() && this.f31248f == eventStoreConfig.mo76235e()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig
    /* renamed from: f */
    long mo76234f() {
        return this.f31244b;
    }

    public int hashCode() {
        long j = this.f31244b;
        long j2 = this.f31247e;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f31245c) * 1000003) ^ this.f31246d) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f31248f;
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.f31244b + ", loadBatchSize=" + this.f31245c + ", criticalSectionEnterTimeoutMs=" + this.f31246d + ", eventCleanUpAge=" + this.f31247e + ", maxBlobByteSizePerRow=" + this.f31248f + "}";
    }

    private AutoValue_EventStoreConfig(long j, int i, int i2, long j2, int i3) {
        this.f31244b = j;
        this.f31245c = i;
        this.f31246d = i2;
        this.f31247e = j2;
        this.f31248f = i3;
    }
}
