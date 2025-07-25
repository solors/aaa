package io.bidmachine.rendering.model;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.rendering.utils.RelativePercent;
import io.bidmachine.rendering.utils.UiUtils;

/* loaded from: classes9.dex */
public class ElementLayoutParams {

    /* renamed from: a */
    private final float f97877a;

    /* renamed from: b */
    private final float f97878b;

    /* renamed from: c */
    private final float f97879c;

    /* renamed from: d */
    private final float f97880d;

    /* renamed from: e */
    private final SideBindParams f97881e;

    /* renamed from: f */
    private final SideBindParams f97882f;

    /* renamed from: g */
    private final SideBindParams f97883g;

    /* renamed from: h */
    private final SideBindParams f97884h;

    /* renamed from: i */
    private final float f97885i;

    /* renamed from: j */
    private final float f97886j;

    /* renamed from: k */
    private final float f97887k;

    /* renamed from: l */
    private final float f97888l;

    /* renamed from: m */
    private final float f97889m;

    /* renamed from: n */
    private final float f97890n;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private float f97891a;

        /* renamed from: b */
        private float f97892b;

        /* renamed from: c */
        private float f97893c;

        /* renamed from: d */
        private float f97894d;

        /* renamed from: e */
        private SideBindParams f97895e;

        /* renamed from: f */
        private SideBindParams f97896f;

        /* renamed from: g */
        private SideBindParams f97897g;

        /* renamed from: h */
        private SideBindParams f97898h;

        /* renamed from: i */
        private float f97899i;

        /* renamed from: j */
        private float f97900j;

        /* renamed from: k */
        private float f97901k;

        /* renamed from: l */
        private float f97902l;

        /* renamed from: m */
        private float f97903m;

        /* renamed from: n */
        private float f97904n;

        public ElementLayoutParams build() {
            return new ElementLayoutParams(this.f97891a, this.f97892b, this.f97893c, this.f97894d, this.f97895e, this.f97896f, this.f97897g, this.f97898h, this.f97899i, this.f97900j, this.f97901k, this.f97902l, this.f97903m, this.f97904n);
        }

        public Builder setBottomSideBindParams(@Nullable SideBindParams sideBindParams) {
            this.f97898h = sideBindParams;
            return this;
        }

        public Builder setHeight(float f) {
            this.f97892b = f;
            return this;
        }

        public Builder setHeightPercent(@RelativePercent float f) {
            this.f97894d = f;
            return this;
        }

        public Builder setLeftSideBindParams(@Nullable SideBindParams sideBindParams) {
            this.f97895e = sideBindParams;
            return this;
        }

        public Builder setMarginBottom(float f) {
            this.f97902l = f;
            return this;
        }

        public Builder setMarginLeft(float f) {
            this.f97899i = f;
            return this;
        }

        public Builder setMarginRight(float f) {
            this.f97901k = f;
            return this;
        }

        public Builder setMarginTop(float f) {
            this.f97900j = f;
            return this;
        }

        public Builder setRightSideBindParams(@Nullable SideBindParams sideBindParams) {
            this.f97897g = sideBindParams;
            return this;
        }

        public Builder setTopSideBindParams(@Nullable SideBindParams sideBindParams) {
            this.f97896f = sideBindParams;
            return this;
        }

        public Builder setTranslationX(float f) {
            this.f97903m = f;
            return this;
        }

        public Builder setTranslationY(float f) {
            this.f97904n = f;
            return this;
        }

        public Builder setWidth(float f) {
            this.f97891a = f;
            return this;
        }

        public Builder setWidthPercent(@RelativePercent float f) {
            this.f97893c = f;
            return this;
        }
    }

    public ElementLayoutParams(float f, float f2, @RelativePercent float f3, @RelativePercent float f4, @Nullable SideBindParams sideBindParams, @Nullable SideBindParams sideBindParams2, @Nullable SideBindParams sideBindParams3, @Nullable SideBindParams sideBindParams4, float f5, float f6, float f7, float f8, float f9, float f10) {
        this.f97877a = f;
        this.f97878b = f2;
        this.f97879c = f3;
        this.f97880d = f4;
        this.f97881e = sideBindParams;
        this.f97882f = sideBindParams2;
        this.f97883g = sideBindParams3;
        this.f97884h = sideBindParams4;
        this.f97885i = f5;
        this.f97886j = f6;
        this.f97887k = f7;
        this.f97888l = f8;
        this.f97889m = f9;
        this.f97890n = f10;
    }

    @Nullable
    public SideBindParams getBottomSideBindParams() {
        return this.f97884h;
    }

    public float getHeight() {
        return this.f97878b;
    }

    @RelativePercent
    public float getHeightPercent() {
        return this.f97880d;
    }

    public int getHeightPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getHeight());
    }

    @Nullable
    public SideBindParams getLeftSideBindParams() {
        return this.f97881e;
    }

    public float getMarginBottom() {
        return this.f97888l;
    }

    public int getMarginBottomPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getMarginBottom());
    }

    public float getMarginLeft() {
        return this.f97885i;
    }

    public int getMarginLeftPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getMarginLeft());
    }

    public float getMarginRight() {
        return this.f97887k;
    }

    public int getMarginRightPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getMarginRight());
    }

    public float getMarginTop() {
        return this.f97886j;
    }

    public int getMarginTopPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getMarginTop());
    }

    @Nullable
    public SideBindParams getRightSideBindParams() {
        return this.f97883g;
    }

    @Nullable
    public SideBindParams getTopSideBindParams() {
        return this.f97882f;
    }

    public float getTranslationX() {
        return this.f97889m;
    }

    public int getTranslationXPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getTranslationX());
    }

    public float getTranslationY() {
        return this.f97890n;
    }

    public int getTranslationYPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getTranslationY());
    }

    public float getWidth() {
        return this.f97877a;
    }

    @RelativePercent
    public float getWidthPercent() {
        return this.f97879c;
    }

    public int getWidthPx(@NonNull Context context) {
        return UiUtils.dpToPx(context, getWidth());
    }
}
