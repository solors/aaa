package com.applovin.mediation.nativeAds;

import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;

/* loaded from: classes2.dex */
public class MaxNativeAdViewBinder {
    @IdRes
    protected final int advertiserTextViewId;
    @IdRes
    protected final int bodyTextViewId;
    @IdRes
    protected final int callToActionButtonId;
    @IdRes
    protected final int iconContentViewId;
    @IdRes
    protected final int iconImageViewId;
    @LayoutRes
    protected final int layoutResourceId;
    protected final View mainView;
    @IdRes
    protected final int mediaContentFrameLayoutId;
    @IdRes
    protected final int mediaContentViewGroupId;
    @IdRes
    protected final int optionsContentFrameLayoutId;
    @IdRes
    protected final int optionsContentViewGroupId;
    @IdRes
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    @IdRes
    protected final int titleTextViewId;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        private final View f12774a;

        /* renamed from: b */
        private final int f12775b;

        /* renamed from: c */
        private int f12776c;

        /* renamed from: d */
        private int f12777d;

        /* renamed from: e */
        private int f12778e;

        /* renamed from: f */
        private int f12779f;

        /* renamed from: g */
        private int f12780g;

        /* renamed from: h */
        private int f12781h;

        /* renamed from: i */
        private int f12782i;

        /* renamed from: j */
        private int f12783j;

        /* renamed from: k */
        private int f12784k;

        /* renamed from: l */
        private int f12785l;

        /* renamed from: m */
        private int f12786m;

        /* renamed from: n */
        private String f12787n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f12774a, this.f12775b, this.f12776c, this.f12777d, this.f12778e, this.f12779f, this.f12780g, this.f12783j, this.f12781h, this.f12782i, this.f12784k, this.f12785l, this.f12786m, this.f12787n);
        }

        public Builder setAdvertiserTextViewId(@IdRes int i) {
            this.f12777d = i;
            return this;
        }

        public Builder setBodyTextViewId(@IdRes int i) {
            this.f12778e = i;
            return this;
        }

        public Builder setCallToActionButtonId(@IdRes int i) {
            this.f12786m = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(@IdRes int i) {
            this.f12780g = i;
            return this;
        }

        public Builder setIconImageViewId(@IdRes int i) {
            this.f12779f = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(@IdRes int i) {
            this.f12785l = i;
            return this;
        }

        public Builder setMediaContentViewGroupId(@IdRes int i) {
            this.f12784k = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(@IdRes int i) {
            this.f12782i = i;
            return this;
        }

        public Builder setOptionsContentViewGroupId(@IdRes int i) {
            this.f12781h = i;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(@IdRes int i) {
            this.f12783j = i;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.f12787n = str;
            return this;
        }

        public Builder setTitleTextViewId(@IdRes int i) {
            this.f12776c = i;
            return this;
        }

        public Builder(@LayoutRes int i) {
            this(i, null);
        }

        private Builder(int i, View view) {
            this.f12776c = -1;
            this.f12777d = -1;
            this.f12778e = -1;
            this.f12779f = -1;
            this.f12780g = -1;
            this.f12781h = -1;
            this.f12782i = -1;
            this.f12783j = -1;
            this.f12784k = -1;
            this.f12785l = -1;
            this.f12786m = -1;
            this.f12775b = i;
            this.f12774a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.starRatingContentViewGroupId = i7;
        this.optionsContentViewGroupId = i8;
        this.optionsContentFrameLayoutId = i9;
        this.mediaContentViewGroupId = i10;
        this.mediaContentFrameLayoutId = i11;
        this.callToActionButtonId = i12;
        this.templateType = str;
    }
}
