package com.yandex.div.internal.widget.slider;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.annotation.InterfaceC0152Px;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p640db.TextDrawable;

@Metadata
/* renamed from: com.yandex.div.internal.widget.slider.a */
/* loaded from: classes8.dex */
public final class SliderDrawDelegate {

    /* renamed from: a */
    private int f76277a;

    /* renamed from: b */
    private int f76278b;

    /* renamed from: a */
    private final int m36216a(Drawable drawable) {
        return m36210g() + (drawable.getIntrinsicHeight() / 2);
    }

    /* renamed from: b */
    private final int m36215b(Drawable drawable) {
        return m36210g() - (drawable.getIntrinsicHeight() / 2);
    }

    /* renamed from: g */
    private final int m36210g() {
        return this.f76278b / 2;
    }

    /* renamed from: c */
    public final void m36214c(@NotNull Canvas canvas, @Nullable Drawable drawable) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable == null) {
            return;
        }
        drawable.setBounds(0, m36215b(drawable), this.f76277a, m36216a(drawable));
        drawable.draw(canvas);
    }

    /* renamed from: d */
    public final void m36213d(@NotNull Canvas canvas, @Nullable Drawable drawable, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
        drawable.setBounds(i - intrinsicWidth, m36215b(drawable), i + intrinsicWidth, m36216a(drawable));
        drawable.draw(canvas);
    }

    /* renamed from: e */
    public final void m36212e(@NotNull Canvas canvas, int i, @Nullable Drawable drawable, int i2, @Nullable TextDrawable textDrawable) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        m36213d(canvas, drawable, i);
        if (textDrawable != null) {
            textDrawable.m25666a(String.valueOf(i2));
            m36213d(canvas, textDrawable, i);
        }
    }

    /* renamed from: f */
    public final void m36211f(@NotNull Canvas canvas, @Nullable Drawable drawable, @InterfaceC0152Px int i, @InterfaceC0152Px int i2) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, m36215b(drawable), i2, m36216a(drawable));
        drawable.draw(canvas);
    }

    /* renamed from: h */
    public final void m36209h(int i, int i2) {
        this.f76277a = i;
        this.f76278b = i2;
    }
}
