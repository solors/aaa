package com.moloco.sdk.internal.services.bidtoken;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.f */
/* loaded from: classes7.dex */
public final class C24261f {
    @NotNull

    /* renamed from: a */
    public final String f62833a;
    @NotNull

    /* renamed from: b */
    public final String f62834b;
    @NotNull

    /* renamed from: c */
    public final String f62835c;
    @NotNull

    /* renamed from: d */
    public final String f62836d;
    @NotNull

    /* renamed from: e */
    public final String f62837e;

    public C24261f(@NotNull String language, @NotNull String osVersion, @NotNull String make, @NotNull String model, @NotNull String hardwareVersion) {
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(make, "make");
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(hardwareVersion, "hardwareVersion");
        this.f62833a = language;
        this.f62834b = osVersion;
        this.f62835c = make;
        this.f62836d = model;
        this.f62837e = hardwareVersion;
    }

    @NotNull
    /* renamed from: a */
    public final String m46699a() {
        return this.f62834b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24261f)) {
            return false;
        }
        C24261f c24261f = (C24261f) obj;
        if (Intrinsics.m17075f(this.f62833a, c24261f.f62833a) && Intrinsics.m17075f(this.f62834b, c24261f.f62834b) && Intrinsics.m17075f(this.f62835c, c24261f.f62835c) && Intrinsics.m17075f(this.f62836d, c24261f.f62836d) && Intrinsics.m17075f(this.f62837e, c24261f.f62837e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.f62833a.hashCode() * 31) + this.f62834b.hashCode()) * 31) + this.f62835c.hashCode()) * 31) + this.f62836d.hashCode()) * 31) + this.f62837e.hashCode();
    }

    @NotNull
    public String toString() {
        return "BidTokenDeviceRequestInfo(language=" + this.f62833a + ", osVersion=" + this.f62834b + ", make=" + this.f62835c + ", model=" + this.f62836d + ", hardwareVersion=" + this.f62837e + ')';
    }
}
