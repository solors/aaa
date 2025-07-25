package com.yandex.mobile.ads.impl;

import androidx.annotation.AttrRes;
import androidx.annotation.StyleRes;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.pv */
/* loaded from: classes8.dex */
public final class C31155pv {
    @NotNull

    /* renamed from: a */
    private final String f84088a;

    /* renamed from: b */
    private final int f84089b;

    /* renamed from: c */
    private final int f84090c;

    public C31155pv(@AttrRes int i, @StyleRes int i2, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84088a = text;
        this.f84089b = i;
        this.f84090c = i2;
    }

    /* renamed from: a */
    public final int m30580a() {
        return this.f84089b;
    }

    /* renamed from: b */
    public final int m30579b() {
        return this.f84090c;
    }

    @NotNull
    /* renamed from: c */
    public final String m30578c() {
        return this.f84088a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31155pv)) {
            return false;
        }
        C31155pv c31155pv = (C31155pv) obj;
        if (Intrinsics.m17075f(this.f84088a, c31155pv.f84088a) && this.f84089b == c31155pv.f84089b && this.f84090c == c31155pv.f84090c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f84090c) + nt1.m31295a(this.f84089b, this.f84088a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f84088a;
        int i = this.f84089b;
        int i2 = this.f84090c;
        return "DebugPanelColoredText(text=" + str + ", color=" + i + ", style=" + i2 + ")";
    }

    public /* synthetic */ C31155pv(String str, int i) {
        this(i, C29880R.C29887style.DebugPanelText_Body2, str);
    }
}
