package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes5.dex */
public final class ColorRoles {

    /* renamed from: a */
    private final int f37221a;

    /* renamed from: b */
    private final int f37222b;

    /* renamed from: c */
    private final int f37223c;

    /* renamed from: d */
    private final int f37224d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorRoles(@ColorInt int i, @ColorInt int i2, @ColorInt int i3, @ColorInt int i4) {
        this.f37221a = i;
        this.f37222b = i2;
        this.f37223c = i3;
        this.f37224d = i4;
    }

    @ColorInt
    public int getAccent() {
        return this.f37221a;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.f37223c;
    }

    @ColorInt
    public int getOnAccent() {
        return this.f37222b;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.f37224d;
    }
}
