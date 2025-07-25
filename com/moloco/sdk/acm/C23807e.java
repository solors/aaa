package com.moloco.sdk.acm;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.moloco.sdk.acm.e */
/* loaded from: classes7.dex */
public final class C23807e {
    @NotNull

    /* renamed from: a */
    private final String f61791a;
    @NotNull

    /* renamed from: b */
    private final String f61792b;
    @NotNull

    /* renamed from: c */
    private final Context f61793c;

    /* renamed from: d */
    private final long f61794d;
    @NotNull

    /* renamed from: e */
    private final Map<String, String> f61795e;

    public C23807e(@NotNull String appId, @NotNull String postAnalyticsUrl, @NotNull Context context, long j, @NotNull Map<String, String> clientOptions) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(postAnalyticsUrl, "postAnalyticsUrl");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clientOptions, "clientOptions");
        this.f61791a = appId;
        this.f61792b = postAnalyticsUrl;
        this.f61793c = context;
        this.f61794d = j;
        this.f61795e = clientOptions;
    }

    @NotNull
    /* renamed from: a */
    public final Map<String, String> m47688a() {
        return this.f61795e;
    }

    @NotNull
    /* renamed from: b */
    public final Context m47687b() {
        return this.f61793c;
    }

    @NotNull
    /* renamed from: c */
    public final String m47686c() {
        return this.f61792b;
    }

    /* renamed from: d */
    public final long m47685d() {
        return this.f61794d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23807e)) {
            return false;
        }
        C23807e c23807e = (C23807e) obj;
        if (Intrinsics.m17075f(this.f61791a, c23807e.f61791a) && Intrinsics.m17075f(this.f61792b, c23807e.f61792b) && Intrinsics.m17075f(this.f61793c, c23807e.f61793c) && this.f61794d == c23807e.f61794d && Intrinsics.m17075f(this.f61795e, c23807e.f61795e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f61791a.hashCode() * 31) + this.f61792b.hashCode()) * 31) + this.f61793c.hashCode()) * 31) + Long.hashCode(this.f61794d)) * 31) + this.f61795e.hashCode();
    }

    @NotNull
    public String toString() {
        return "InitConfig(appId=" + this.f61791a + ", postAnalyticsUrl=" + this.f61792b + ", context=" + this.f61793c + ", requestPeriodSeconds=" + this.f61794d + ", clientOptions=" + this.f61795e + ')';
    }
}
