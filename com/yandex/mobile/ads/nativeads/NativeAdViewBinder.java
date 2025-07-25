package com.yandex.mobile.ads.nativeads;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.C21114v8;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class NativeAdViewBinder {
    @NotNull

    /* renamed from: a */
    private final View f89227a;
    @NotNull

    /* renamed from: b */
    private final Map<String, View> f89228b;

    public /* synthetic */ NativeAdViewBinder(View view, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, map);
    }

    @Nullable
    public final TextView getAgeView() {
        View view = this.f89228b.get("age");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final TextView getBodyView() {
        View view = this.f89228b.get("body");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final TextView getCallToActionView() {
        View view = this.f89228b.get("call_to_action");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final TextView getDomainView() {
        View view = this.f89228b.get(C21114v8.C21123i.f54109D);
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final ImageView getFaviconView() {
        View view = this.f89228b.get("favicon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public final ImageView getFeedbackView() {
        View view = this.f89228b.get("feedback");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public final ImageView getIconView() {
        View view = this.f89228b.get("icon");
        if (view instanceof ImageView) {
            return (ImageView) view;
        }
        return null;
    }

    @Nullable
    public final MediaView getMediaView() {
        View view = this.f89228b.get("media");
        if (view instanceof MediaView) {
            return (MediaView) view;
        }
        return null;
    }

    @NotNull
    public final View getNativeAdView() {
        return this.f89227a;
    }

    @Nullable
    public final TextView getPriceView() {
        View view = this.f89228b.get("price");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final View getRatingView() {
        return this.f89228b.get("rating");
    }

    @Nullable
    public final TextView getReviewCountView() {
        View view = this.f89228b.get("review_count");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final TextView getSponsoredView() {
        View view = this.f89228b.get("sponsored");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final TextView getTitleView() {
        View view = this.f89228b.get("title");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    @Nullable
    public final TextView getWarningView() {
        View view = this.f89228b.get("warning");
        if (view instanceof TextView) {
            return (TextView) view;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private NativeAdViewBinder(View view, Map<String, ? extends View> map) {
        this.f89227a = view;
        this.f89228b = map;
    }

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final View f89229a;
        @NotNull

        /* renamed from: b */
        private final LinkedHashMap f89230b;

        public Builder(@NotNull View nativeAdView) {
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            this.f89229a = nativeAdView;
            this.f89230b = new LinkedHashMap();
        }

        @NotNull
        public final NativeAdViewBinder build() {
            return new NativeAdViewBinder(this.f89229a, this.f89230b, null);
        }

        @NotNull
        public final Builder setAgeView(@Nullable TextView textView) {
            this.f89230b.put("age", textView);
            return this;
        }

        @NotNull
        public final Builder setBodyView(@Nullable TextView textView) {
            this.f89230b.put("body", textView);
            return this;
        }

        @NotNull
        public final Builder setCallToActionView(@Nullable TextView textView) {
            this.f89230b.put("call_to_action", textView);
            return this;
        }

        @NotNull
        public final Builder setDomainView(@Nullable TextView textView) {
            this.f89230b.put(C21114v8.C21123i.f54109D, textView);
            return this;
        }

        @NotNull
        public final Builder setFaviconView(@Nullable ImageView imageView) {
            this.f89230b.put("favicon", imageView);
            return this;
        }

        @NotNull
        public final Builder setFeedbackView(@Nullable ImageView imageView) {
            this.f89230b.put("feedback", imageView);
            return this;
        }

        @NotNull
        public final Builder setIconView(@Nullable ImageView imageView) {
            this.f89230b.put("icon", imageView);
            return this;
        }

        @NotNull
        public final Builder setMediaView(@Nullable MediaView mediaView) {
            this.f89230b.put("media", mediaView);
            return this;
        }

        @NotNull
        public final Builder setPriceView(@Nullable TextView textView) {
            this.f89230b.put("price", textView);
            return this;
        }

        @NotNull
        public final <T extends View & Rating> Builder setRatingView(@Nullable T t) {
            this.f89230b.put("rating", t);
            return this;
        }

        @NotNull
        public final Builder setReviewCountView(@Nullable TextView textView) {
            this.f89230b.put("review_count", textView);
            return this;
        }

        @NotNull
        public final Builder setSponsoredView(@Nullable TextView textView) {
            this.f89230b.put("sponsored", textView);
            return this;
        }

        @NotNull
        public final Builder setTitleView(@Nullable TextView textView) {
            this.f89230b.put("title", textView);
            return this;
        }

        @NotNull
        public final Builder setWarningView(@Nullable TextView textView) {
            this.f89230b.put("warning", textView);
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull NativeAdView nativeAdView) {
            this((View) nativeAdView);
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
        }
    }
}
