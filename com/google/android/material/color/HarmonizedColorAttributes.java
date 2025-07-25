package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.C16310R;

/* loaded from: classes5.dex */
public final class HarmonizedColorAttributes {

    /* renamed from: c */
    private static final int[] f37241c = {C16310R.attr.colorError, C16310R.attr.colorOnError, C16310R.attr.colorErrorContainer, C16310R.attr.colorOnErrorContainer};

    /* renamed from: a */
    private final int[] f37242a;
    @StyleRes

    /* renamed from: b */
    private final int f37243b;

    private HarmonizedColorAttributes(@AttrRes @NonNull int[] iArr, @StyleRes int i) {
        if (i != 0 && iArr.length == 0) {
            throw new IllegalArgumentException("Theme overlay should be used with the accompanying int[] attributes.");
        }
        this.f37242a = iArr;
        this.f37243b = i;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr) {
        return new HarmonizedColorAttributes(iArr, 0);
    }

    @NonNull
    public static HarmonizedColorAttributes createMaterialDefaults() {
        return create(f37241c, C16310R.C16317style.ThemeOverlay_Material3_HarmonizedColors);
    }

    @NonNull
    public int[] getAttributes() {
        return this.f37242a;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f37243b;
    }

    @NonNull
    public static HarmonizedColorAttributes create(@AttrRes @NonNull int[] iArr, @StyleRes int i) {
        return new HarmonizedColorAttributes(iArr, i);
    }
}
