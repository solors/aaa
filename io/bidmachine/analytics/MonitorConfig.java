package io.bidmachine.analytics;

import kotlin.Metadata;

@Metadata
/* loaded from: classes9.dex */
public final class MonitorConfig {

    /* renamed from: a */
    private final String f96265a;

    /* renamed from: b */
    private final String f96266b;

    /* renamed from: c */
    private final int f96267c;

    /* renamed from: d */
    private final long f96268d;

    /* renamed from: e */
    private final boolean f96269e;

    public MonitorConfig(String str, String str2, int i, long j, boolean z) {
        this.f96265a = str;
        this.f96266b = str2;
        this.f96267c = i;
        this.f96268d = j;
        this.f96269e = z;
    }

    public final int getBatchSize() {
        return this.f96267c;
    }

    public final long getInterval() {
        return this.f96268d;
    }

    public final String getName() {
        return this.f96265a;
    }

    public final String getUrl() {
        return this.f96266b;
    }

    public final boolean isReportEnabled() {
        return this.f96269e;
    }
}
