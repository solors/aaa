package com.yandex.div.internal.widget.slider;

import android.graphics.Typeface;
import androidx.annotation.ColorInt;
import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.yandex.div.internal.widget.slider.b */
/* loaded from: classes8.dex */
public final class SliderTextStyle {

    /* renamed from: a */
    private final float f76279a;
    @NotNull

    /* renamed from: b */
    private final Typeface f76280b;

    /* renamed from: c */
    private final float f76281c;

    /* renamed from: d */
    private final float f76282d;

    /* renamed from: e */
    private final int f76283e;

    public SliderTextStyle(@InterfaceC0152Px float f, @NotNull Typeface fontWeight, @InterfaceC0152Px float f2, @InterfaceC0152Px float f3, @ColorInt int i) {
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        this.f76279a = f;
        this.f76280b = fontWeight;
        this.f76281c = f2;
        this.f76282d = f3;
        this.f76283e = i;
    }

    /* renamed from: a */
    public final float m36208a() {
        return this.f76279a;
    }

    @NotNull
    /* renamed from: b */
    public final Typeface m36207b() {
        return this.f76280b;
    }

    /* renamed from: c */
    public final float m36206c() {
        return this.f76281c;
    }

    /* renamed from: d */
    public final float m36205d() {
        return this.f76282d;
    }

    /* renamed from: e */
    public final int m36204e() {
        return this.f76283e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SliderTextStyle)) {
            return false;
        }
        SliderTextStyle sliderTextStyle = (SliderTextStyle) obj;
        if (Float.compare(this.f76279a, sliderTextStyle.f76279a) == 0 && Intrinsics.m17075f(this.f76280b, sliderTextStyle.f76280b) && Float.compare(this.f76281c, sliderTextStyle.f76281c) == 0 && Float.compare(this.f76282d, sliderTextStyle.f76282d) == 0 && this.f76283e == sliderTextStyle.f76283e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.f76279a) * 31) + this.f76280b.hashCode()) * 31) + Float.hashCode(this.f76281c)) * 31) + Float.hashCode(this.f76282d)) * 31) + Integer.hashCode(this.f76283e);
    }

    @NotNull
    public String toString() {
        return "SliderTextStyle(fontSize=" + this.f76279a + ", fontWeight=" + this.f76280b + ", offsetX=" + this.f76281c + ", offsetY=" + this.f76282d + ", textColor=" + this.f76283e + ')';
    }
}
