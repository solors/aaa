package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r */
/* loaded from: classes7.dex */
public final class C24770r {
    @Nullable

    /* renamed from: a */
    public final String f63961a;
    @Nullable

    /* renamed from: b */
    public final String f63962b;
    @Nullable

    /* renamed from: c */
    public final String f63963c;
    @Nullable

    /* renamed from: d */
    public final String f63964d;
    @Nullable

    /* renamed from: e */
    public final String f63965e;
    @Nullable

    /* renamed from: f */
    public final String f63966f;
    @Nullable

    /* renamed from: g */
    public final String f63967g;

    public C24770r(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        this.f63961a = str;
        this.f63962b = str2;
        this.f63963c = str3;
        this.f63964d = str4;
        this.f63965e = str5;
        this.f63966f = str6;
        this.f63967g = str7;
    }

    /* renamed from: a */
    public static /* synthetic */ C24770r m45732a(C24770r c24770r, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c24770r.f63961a;
        }
        if ((i & 2) != 0) {
            str2 = c24770r.f63962b;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = c24770r.f63963c;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = c24770r.f63964d;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = c24770r.f63965e;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = c24770r.f63966f;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = c24770r.f63967g;
        }
        return c24770r.m45731b(str, str8, str9, str10, str11, str12, str7);
    }

    @NotNull
    /* renamed from: b */
    public final C24770r m45731b(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        return new C24770r(str, str2, str3, str4, str5, str6, str7);
    }

    @Nullable
    /* renamed from: c */
    public final String m45730c() {
        return this.f63961a;
    }

    @Nullable
    /* renamed from: d */
    public final String m45729d() {
        return this.f63962b;
    }

    @Nullable
    /* renamed from: e */
    public final String m45728e() {
        return this.f63963c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24770r)) {
            return false;
        }
        C24770r c24770r = (C24770r) obj;
        if (Intrinsics.m17075f(this.f63961a, c24770r.f63961a) && Intrinsics.m17075f(this.f63962b, c24770r.f63962b) && Intrinsics.m17075f(this.f63963c, c24770r.f63963c) && Intrinsics.m17075f(this.f63964d, c24770r.f63964d) && Intrinsics.m17075f(this.f63965e, c24770r.f63965e) && Intrinsics.m17075f(this.f63966f, c24770r.f63966f) && Intrinsics.m17075f(this.f63967g, c24770r.f63967g)) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: f */
    public final String m45727f() {
        return this.f63965e;
    }

    @Nullable
    /* renamed from: g */
    public final String m45726g() {
        return this.f63964d;
    }

    @Nullable
    /* renamed from: h */
    public final String m45725h() {
        return this.f63966f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        String str = this.f63961a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f63962b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f63963c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f63964d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.f63965e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        String str6 = this.f63966f;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str7 = this.f63967g;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return i7 + i;
    }

    @Nullable
    /* renamed from: i */
    public final String m45724i() {
        return this.f63967g;
    }

    @NotNull
    public String toString() {
        return "DEC(appIconUri=" + this.f63961a + ", appName=" + this.f63962b + ", ctaText=" + this.f63963c + ", ctaUrl=" + this.f63964d + ", ctaTrackingUrl=" + this.f63965e + ", impressionTrackingUrl=" + this.f63966f + ", skipToDECTrackingUrl=" + this.f63967g + ')';
    }
}
