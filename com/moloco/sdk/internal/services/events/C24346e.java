package com.moloco.sdk.internal.services.events;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.events.e */
/* loaded from: classes7.dex */
public final class C24346e {

    /* renamed from: a */
    public final boolean f63041a;

    /* renamed from: b */
    public final boolean f63042b;
    @NotNull

    /* renamed from: c */
    public final String f63043c;
    @NotNull

    /* renamed from: d */
    public final String f63044d;

    public C24346e(boolean z, boolean z2, @NotNull String appForegroundUrl, @NotNull String appBackgroundUrl) {
        Intrinsics.checkNotNullParameter(appForegroundUrl, "appForegroundUrl");
        Intrinsics.checkNotNullParameter(appBackgroundUrl, "appBackgroundUrl");
        this.f63041a = z;
        this.f63042b = z2;
        this.f63043c = appForegroundUrl;
        this.f63044d = appBackgroundUrl;
    }

    @NotNull
    /* renamed from: a */
    public final String m46557a() {
        return this.f63044d;
    }

    @NotNull
    /* renamed from: b */
    public final String m46556b() {
        return this.f63043c;
    }

    /* renamed from: c */
    public final boolean m46555c() {
        return this.f63041a;
    }

    /* renamed from: d */
    public final boolean m46554d() {
        return this.f63042b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24346e)) {
            return false;
        }
        C24346e c24346e = (C24346e) obj;
        if (this.f63041a == c24346e.f63041a && this.f63042b == c24346e.f63042b && Intrinsics.m17075f(this.f63043c, c24346e.f63043c) && Intrinsics.m17075f(this.f63044d, c24346e.f63044d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public int hashCode() {
        boolean z = this.f63041a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        boolean z2 = this.f63042b;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return ((((i2 + i) * 31) + this.f63043c.hashCode()) * 31) + this.f63044d.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserEventConfig(eventReportingEnabled=" + this.f63041a + ", userTrackingEnabled=" + this.f63042b + ", appForegroundUrl=" + this.f63043c + ", appBackgroundUrl=" + this.f63044d + ')';
    }
}
