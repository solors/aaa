package com.google.android.material.color;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;
import com.google.android.material.color.DynamicColors;

/* loaded from: classes5.dex */
public class DynamicColorsOptions {

    /* renamed from: d */
    private static final DynamicColors.Precondition f37233d = new DynamicColors.Precondition() { // from class: com.google.android.material.color.DynamicColorsOptions.1
        @Override // com.google.android.material.color.DynamicColors.Precondition
        public boolean shouldApplyDynamicColors(@NonNull Activity activity, int i) {
            return true;
        }
    };

    /* renamed from: e */
    private static final DynamicColors.OnAppliedCallback f37234e = new DynamicColors.OnAppliedCallback() { // from class: com.google.android.material.color.DynamicColorsOptions.2
        @Override // com.google.android.material.color.DynamicColors.OnAppliedCallback
        public void onApplied(@NonNull Activity activity) {
        }
    };
    @StyleRes

    /* renamed from: a */
    private final int f37235a;
    @NonNull

    /* renamed from: b */
    private final DynamicColors.Precondition f37236b;
    @NonNull

    /* renamed from: c */
    private final DynamicColors.OnAppliedCallback f37237c;

    /* loaded from: classes5.dex */
    public static class Builder {
        @StyleRes

        /* renamed from: a */
        private int f37238a;
        @NonNull

        /* renamed from: b */
        private DynamicColors.Precondition f37239b = DynamicColorsOptions.f37233d;
        @NonNull

        /* renamed from: c */
        private DynamicColors.OnAppliedCallback f37240c = DynamicColorsOptions.f37234e;

        @NonNull
        public DynamicColorsOptions build() {
            return new DynamicColorsOptions(this);
        }

        @NonNull
        public Builder setOnAppliedCallback(@NonNull DynamicColors.OnAppliedCallback onAppliedCallback) {
            this.f37240c = onAppliedCallback;
            return this;
        }

        @NonNull
        public Builder setPrecondition(@NonNull DynamicColors.Precondition precondition) {
            this.f37239b = precondition;
            return this;
        }

        @NonNull
        public Builder setThemeOverlay(@StyleRes int i) {
            this.f37238a = i;
            return this;
        }
    }

    @NonNull
    public DynamicColors.OnAppliedCallback getOnAppliedCallback() {
        return this.f37237c;
    }

    @NonNull
    public DynamicColors.Precondition getPrecondition() {
        return this.f37236b;
    }

    @StyleRes
    public int getThemeOverlay() {
        return this.f37235a;
    }

    private DynamicColorsOptions(Builder builder) {
        this.f37235a = builder.f37238a;
        this.f37236b = builder.f37239b;
        this.f37237c = builder.f37240c;
    }
}
