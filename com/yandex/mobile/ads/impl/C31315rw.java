package com.yandex.mobile.ads.impl;

import androidx.annotation.AttrRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StyleRes;
import com.yandex.mobile.ads.C29880R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.rw */
/* loaded from: classes8.dex */
public final class C31315rw {
    @NotNull

    /* renamed from: a */
    private final String f84922a;

    /* renamed from: b */
    private final int f84923b;
    @Nullable

    /* renamed from: c */
    private final Integer f84924c;

    /* renamed from: d */
    private final int f84925d;

    public C31315rw(@NotNull String text, @AttrRes int i, @DrawableRes @Nullable Integer num, @StyleRes int i2) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f84922a = text;
        this.f84923b = i;
        this.f84924c = num;
        this.f84925d = i2;
    }

    /* renamed from: a */
    public final int m29918a() {
        return this.f84923b;
    }

    @Nullable
    /* renamed from: b */
    public final Integer m29917b() {
        return this.f84924c;
    }

    /* renamed from: c */
    public final int m29916c() {
        return this.f84925d;
    }

    @NotNull
    /* renamed from: d */
    public final String m29915d() {
        return this.f84922a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31315rw)) {
            return false;
        }
        C31315rw c31315rw = (C31315rw) obj;
        if (Intrinsics.m17075f(this.f84922a, c31315rw.f84922a) && this.f84923b == c31315rw.f84923b && Intrinsics.m17075f(this.f84924c, c31315rw.f84924c) && this.f84925d == c31315rw.f84925d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m31295a = nt1.m31295a(this.f84923b, this.f84922a.hashCode() * 31, 31);
        Integer num = this.f84924c;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Integer.hashCode(this.f84925d) + ((m31295a + hashCode) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f84922a;
        int i = this.f84923b;
        Integer num = this.f84924c;
        int i2 = this.f84925d;
        return "DebugPanelTextWithIcon(text=" + str + ", color=" + i + ", icon=" + num + ", style=" + i2 + ")";
    }

    public /* synthetic */ C31315rw(String str, int i, Integer num, int i2, int i3) {
        this(str, (i3 & 2) != 0 ? C29880R.attr.debug_panel_label_primary : i, (i3 & 4) != 0 ? null : num, (i3 & 8) != 0 ? C29880R.C29887style.DebugPanelText_Body1 : i2);
    }
}
