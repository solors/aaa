package com.moloco.sdk.internal.configs;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.internal.configs.a */
/* loaded from: classes7.dex */
public final class C23949a {

    /* renamed from: a */
    public final boolean f62012a;
    @NotNull

    /* renamed from: b */
    public final String f62013b;

    /* renamed from: c */
    public final int f62014c;

    public C23949a(boolean z, @NotNull String reportingUrl, int i) {
        Intrinsics.checkNotNullParameter(reportingUrl, "reportingUrl");
        this.f62012a = z;
        this.f62013b = reportingUrl;
        this.f62014c = i;
    }

    /* renamed from: a */
    public final boolean m47292a() {
        return this.f62012a;
    }

    /* renamed from: b */
    public final int m47291b() {
        return this.f62014c;
    }

    @NotNull
    /* renamed from: c */
    public final String m47290c() {
        return this.f62013b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23949a)) {
            return false;
        }
        C23949a c23949a = (C23949a) obj;
        if (this.f62012a == c23949a.f62012a && Intrinsics.m17075f(this.f62013b, c23949a.f62013b) && this.f62014c == c23949a.f62014c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z = this.f62012a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return (((r0 * 31) + this.f62013b.hashCode()) * 31) + Integer.hashCode(this.f62014c);
    }

    @NotNull
    public String toString() {
        return "OperationalMetricsConfig(enabled=" + this.f62012a + ", reportingUrl=" + this.f62013b + ", pollingIntervalSeconds=" + this.f62014c + ')';
    }
}
