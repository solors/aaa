package io.bidmachine.rendering.model;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.UiUtils;

/* loaded from: classes9.dex */
public class AppearanceParams {

    /* renamed from: a */
    private final Integer f97861a;

    /* renamed from: b */
    private final Boolean f97862b;

    /* renamed from: c */
    private final Boolean f97863c;

    /* renamed from: d */
    private final Float f97864d;

    /* renamed from: e */
    private final FontStyleType f97865e;

    /* renamed from: f */
    private final Float f97866f;

    /* renamed from: g */
    private final Integer f97867g;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private Integer f97868a;

        /* renamed from: b */
        private Boolean f97869b;

        /* renamed from: c */
        private Boolean f97870c;

        /* renamed from: d */
        private Float f97871d;

        /* renamed from: e */
        private FontStyleType f97872e;

        /* renamed from: f */
        private Float f97873f;

        /* renamed from: g */
        private Integer f97874g;

        public AppearanceParams build() {
            return new AppearanceParams(this.f97868a, this.f97869b, this.f97870c, this.f97871d, this.f97872e, this.f97873f, this.f97874g);
        }

        public Builder setBackgroundColor(@Nullable Integer num) {
            this.f97868a = num;
            return this;
        }

        public Builder setClickable(@Nullable Boolean bool) {
            this.f97870c = bool;
            return this;
        }

        public Builder setFontStyleType(@Nullable FontStyleType fontStyleType) {
            this.f97872e = fontStyleType;
            return this;
        }

        public Builder setOpacity(@Nullable Float f) {
            this.f97871d = f;
            return this;
        }

        public Builder setStrokeColor(@Nullable Integer num) {
            this.f97874g = num;
            return this;
        }

        public Builder setStrokeWidth(@Nullable Float f) {
            this.f97873f = f;
            return this;
        }

        public Builder setVisible(@Nullable Boolean bool) {
            this.f97869b = bool;
            return this;
        }
    }

    public AppearanceParams(@Nullable Integer num, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Float f, @Nullable FontStyleType fontStyleType, @Nullable Float f2, @Nullable Integer num2) {
        this.f97861a = num;
        this.f97862b = bool;
        this.f97863c = bool2;
        this.f97864d = f;
        this.f97865e = fontStyleType;
        this.f97866f = f2;
        this.f97867g = num2;
    }

    @Nullable
    public Integer getBackgroundColor() {
        return this.f97861a;
    }

    @Nullable
    public Boolean getClickable() {
        return this.f97863c;
    }

    @Nullable
    public FontStyleType getFontStyleType() {
        return this.f97865e;
    }

    @Nullable
    public Float getOpacity() {
        return this.f97864d;
    }

    @Nullable
    public Integer getStrokeColor() {
        return this.f97867g;
    }

    @Nullable
    public Float getStrokeWidth() {
        return this.f97866f;
    }

    @Nullable
    public Integer getStrokeWidthPx(@NonNull Context context) {
        Float f = this.f97866f;
        if (f != null) {
            return Integer.valueOf(UiUtils.dpToPx(context, f.floatValue()));
        }
        return null;
    }

    @Nullable
    public Boolean getVisible() {
        return this.f97862b;
    }
}
