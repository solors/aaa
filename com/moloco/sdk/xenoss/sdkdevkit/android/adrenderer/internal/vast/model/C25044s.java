package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.s */
/* loaded from: classes7.dex */
public final class C25044s {
    @NotNull

    /* renamed from: a */
    public final String f64956a;
    @Nullable

    /* renamed from: b */
    public final String f64957b;

    /* renamed from: c */
    public final boolean f64958c;
    @NotNull

    /* renamed from: d */
    public final String f64959d;
    @Nullable

    /* renamed from: e */
    public final Integer f64960e;
    @Nullable

    /* renamed from: f */
    public final Integer f64961f;
    @Nullable

    /* renamed from: g */
    public final String f64962g;
    @Nullable

    /* renamed from: h */
    public final Integer f64963h;
    @Nullable

    /* renamed from: i */
    public final Integer f64964i;
    @Nullable

    /* renamed from: j */
    public final Integer f64965j;
    @Nullable

    /* renamed from: k */
    public final Boolean f64966k;
    @Nullable

    /* renamed from: l */
    public final String f64967l;

    public C25044s(@NotNull String mediaFileUrl, @Nullable String str, boolean z, @NotNull String type, @Nullable Integer num, @Nullable Integer num2, @Nullable String str2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Boolean bool, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(mediaFileUrl, "mediaFileUrl");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f64956a = mediaFileUrl;
        this.f64957b = str;
        this.f64958c = z;
        this.f64959d = type;
        this.f64960e = num;
        this.f64961f = num2;
        this.f64962g = str2;
        this.f64963h = num3;
        this.f64964i = num4;
        this.f64965j = num5;
        this.f64966k = bool;
        this.f64967l = str3;
    }

    @Nullable
    /* renamed from: a */
    public final String m45229a() {
        return this.f64967l;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m45228b() {
        return this.f64963h;
    }

    @Nullable
    /* renamed from: c */
    public final Integer m45227c() {
        return this.f64961f;
    }

    @Nullable
    /* renamed from: d */
    public final Integer m45226d() {
        return this.f64965j;
    }

    @NotNull
    /* renamed from: e */
    public final String m45225e() {
        return this.f64956a;
    }

    @Nullable
    /* renamed from: f */
    public final Integer m45224f() {
        return this.f64964i;
    }

    @NotNull
    /* renamed from: g */
    public final String m45223g() {
        return this.f64959d;
    }

    @Nullable
    /* renamed from: h */
    public final Integer m45222h() {
        return this.f64960e;
    }

    /* renamed from: i */
    public final boolean m45221i() {
        return this.f64958c;
    }
}
