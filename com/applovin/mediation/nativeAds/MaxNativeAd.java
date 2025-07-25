package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* loaded from: classes2.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    /* loaded from: classes2.dex */
    public static class Builder {

        /* renamed from: a */
        private MaxAdFormat f12743a;

        /* renamed from: b */
        private String f12744b;

        /* renamed from: c */
        private String f12745c;

        /* renamed from: d */
        private String f12746d;

        /* renamed from: e */
        private String f12747e;

        /* renamed from: f */
        private MaxNativeAdImage f12748f;

        /* renamed from: g */
        private View f12749g;

        /* renamed from: h */
        private View f12750h;

        /* renamed from: i */
        private View f12751i;

        /* renamed from: j */
        private MaxNativeAdImage f12752j;

        /* renamed from: k */
        private float f12753k;

        /* renamed from: l */
        private Double f12754l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f12743a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f12745c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f12746d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f12747e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f12748f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f12749g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f12752j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f) {
            this.f12753k = f;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f12751i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f12750h = view;
            return this;
        }

        public Builder setStarRating(Double d) {
            this.f12754l = d;
            return this;
        }

        public Builder setTitle(String str) {
            this.f12744b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f12743a;
        this.title = builder.f12744b;
        this.advertiser = builder.f12745c;
        this.body = builder.f12746d;
        this.callToAction = builder.f12747e;
        this.icon = builder.f12748f;
        this.iconView = builder.f12749g;
        this.optionsView = builder.f12750h;
        this.mediaView = builder.f12751i;
        this.mainImage = builder.f12752j;
        this.mediaContentAspectRatio = builder.f12753k;
        Double d = builder.f12754l;
        this.starRating = (d == null || d.doubleValue() < 3.0d) ? null : null;
    }

    @Nullable
    public final String getAdvertiser() {
        return this.advertiser;
    }

    @Nullable
    public final String getBody() {
        return this.body;
    }

    @Nullable
    public final String getCallToAction() {
        return this.callToAction;
    }

    @NonNull
    public final MaxAdFormat getFormat() {
        return this.format;
    }

    @Nullable
    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    @Nullable
    public final View getIconView() {
        return this.iconView;
    }

    @Nullable
    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    @Nullable
    public final View getMediaView() {
        return this.mediaView;
    }

    @Nullable
    public final View getOptionsView() {
        return this.optionsView;
    }

    @Nullable
    public final Double getStarRating() {
        return this.starRating;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    @UiThread
    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    /* loaded from: classes2.dex */
    public static class MaxNativeAdImage {

        /* renamed from: a */
        private Drawable f12755a;

        /* renamed from: b */
        private Uri f12756b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f12755a = drawable;
        }

        @Nullable
        public Drawable getDrawable() {
            return this.f12755a;
        }

        @Nullable
        public Uri getUri() {
            return this.f12756b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f12756b = uri;
        }
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }
}
