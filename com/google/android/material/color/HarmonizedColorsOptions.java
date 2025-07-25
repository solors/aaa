package com.google.android.material.color;

import androidx.annotation.AttrRes;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.C16310R;

/* loaded from: classes5.dex */
public class HarmonizedColorsOptions {
    @NonNull
    @ColorRes

    /* renamed from: a */
    private final int[] f37245a;
    @Nullable

    /* renamed from: b */
    private final HarmonizedColorAttributes f37246b;
    @AttrRes

    /* renamed from: c */
    private final int f37247c;

    /* loaded from: classes5.dex */
    public static class Builder {
        @Nullable

        /* renamed from: b */
        private HarmonizedColorAttributes f37249b;
        @NonNull
        @ColorRes

        /* renamed from: a */
        private int[] f37248a = new int[0];
        @AttrRes

        /* renamed from: c */
        private int f37250c = C16310R.attr.colorPrimary;

        @NonNull
        public HarmonizedColorsOptions build() {
            return new HarmonizedColorsOptions(this);
        }

        @NonNull
        public Builder setColorAttributeToHarmonizeWith(@AttrRes int i) {
            this.f37250c = i;
            return this;
        }

        @NonNull
        public Builder setColorAttributes(@Nullable HarmonizedColorAttributes harmonizedColorAttributes) {
            this.f37249b = harmonizedColorAttributes;
            return this;
        }

        @NonNull
        public Builder setColorResourceIds(@NonNull @ColorRes int[] iArr) {
            this.f37248a = iArr;
            return this;
        }
    }

    @NonNull
    public static HarmonizedColorsOptions createMaterialDefaults() {
        return new Builder().setColorAttributes(HarmonizedColorAttributes.createMaterialDefaults()).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @StyleRes
    /* renamed from: a */
    public int m71656a(@StyleRes int i) {
        HarmonizedColorAttributes harmonizedColorAttributes = this.f37246b;
        if (harmonizedColorAttributes != null && harmonizedColorAttributes.getThemeOverlay() != 0) {
            return this.f37246b.getThemeOverlay();
        }
        return i;
    }

    @AttrRes
    public int getColorAttributeToHarmonizeWith() {
        return this.f37247c;
    }

    @Nullable
    public HarmonizedColorAttributes getColorAttributes() {
        return this.f37246b;
    }

    @NonNull
    @ColorRes
    public int[] getColorResourceIds() {
        return this.f37245a;
    }

    private HarmonizedColorsOptions(Builder builder) {
        this.f37245a = builder.f37248a;
        this.f37246b = builder.f37249b;
        this.f37247c = builder.f37250c;
    }
}
