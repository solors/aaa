package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.av */
/* loaded from: classes8.dex */
public final class C29965av {
    @NotNull

    /* renamed from: a */
    private final String f76915a;
    @NotNull

    /* renamed from: b */
    private final String f76916b;
    @NotNull

    /* renamed from: c */
    private final String f76917c;
    @NotNull

    /* renamed from: d */
    private final C30194dv f76918d;

    public C29965av(@NotNull String name, @NotNull String format, @NotNull String adUnitId, @NotNull C30194dv mediation) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(mediation, "mediation");
        this.f76915a = name;
        this.f76916b = format;
        this.f76917c = adUnitId;
        this.f76918d = mediation;
    }

    @NotNull
    /* renamed from: a */
    public final String m35761a() {
        return this.f76917c;
    }

    @NotNull
    /* renamed from: b */
    public final String m35760b() {
        return this.f76916b;
    }

    @NotNull
    /* renamed from: c */
    public final C30194dv m35759c() {
        return this.f76918d;
    }

    @NotNull
    /* renamed from: d */
    public final String m35758d() {
        return this.f76915a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29965av)) {
            return false;
        }
        C29965av c29965av = (C29965av) obj;
        if (Intrinsics.m17075f(this.f76915a, c29965av.f76915a) && Intrinsics.m17075f(this.f76916b, c29965av.f76916b) && Intrinsics.m17075f(this.f76917c, c29965av.f76917c) && Intrinsics.m17075f(this.f76918d, c29965av.f76918d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f76918d.hashCode() + C31014o3.m31189a(this.f76917c, C31014o3.m31189a(this.f76916b, this.f76915a.hashCode() * 31, 31), 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f76915a;
        String str2 = this.f76916b;
        String str3 = this.f76917c;
        C30194dv c30194dv = this.f76918d;
        return "DebugPanelAdUnitFullData(name=" + str + ", format=" + str2 + ", adUnitId=" + str3 + ", mediation=" + c30194dv + ")";
    }
}
