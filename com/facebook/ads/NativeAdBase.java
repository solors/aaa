package com.facebook.ads;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdRatingApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;
import org.json.JSONObject;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public abstract class NativeAdBase implements InterfaceC10846Ad {
    final NativeAdBaseApi mNativeAdBaseApi;

    @Keep
    /* loaded from: classes3.dex */
    public static class Image {
        private final NativeAdImageApi mNativeAdImageApi;

        @Benchmark
        Image(NativeAdImageApi nativeAdImageApi) {
            this.mNativeAdImageApi = nativeAdImageApi;
        }

        @Nullable
        @Benchmark
        public static Image fromJSONObject(JSONObject jSONObject) {
            NativeAdImageApi createNativeAdImageApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdImageApi(jSONObject);
            if (createNativeAdImageApi == null) {
                return null;
            }
            return new Image(createNativeAdImageApi);
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public int getHeight() {
            return this.mNativeAdImageApi.getHeight();
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public String getUrl() {
            return this.mNativeAdImageApi.getUrl();
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public int getWidth() {
            return this.mNativeAdImageApi.getWidth();
        }
    }

    @Keep
    /* loaded from: classes3.dex */
    public enum MediaCacheFlag {
        NONE,
        ALL
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface NativeAdLoadConfigBuilder extends InterfaceC10846Ad.LoadConfigBuilder {
        public static final int UNKNOWN_IMAGE_SIZE = -1;

        @Override // com.facebook.ads.InterfaceC10846Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        NativeLoadAdConfig build();

        NativeAdLoadConfigBuilder withAdListener(NativeAdListener nativeAdListener);

        @Override // com.facebook.ads.InterfaceC10846Ad.LoadConfigBuilder
        NativeAdLoadConfigBuilder withBid(String str);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        NativeAdLoadConfigBuilder withMediaCacheFlag(MediaCacheFlag mediaCacheFlag);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        NativeAdLoadConfigBuilder withPreloadedIconView(int i, int i2);
    }

    @Keep
    /* loaded from: classes3.dex */
    public enum NativeComponentTag {
        AD_ICON,
        AD_TITLE,
        AD_COVER_IMAGE,
        AD_SUBTITLE,
        AD_BODY,
        AD_CALL_TO_ACTION,
        AD_SOCIAL_CONTEXT,
        AD_CHOICES_ICON,
        AD_OPTIONS_VIEW,
        AD_MEDIA;

        public static void tagView(View view, NativeComponentTag nativeComponentTag) {
            DynamicLoaderFactory.makeLoader(view.getContext()).createNativeComponentTagApi().tagView(view, nativeComponentTag);
        }
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface NativeLoadAdConfig extends InterfaceC10846Ad.LoadAdConfig {
    }

    @Keep
    /* loaded from: classes3.dex */
    public static class Rating {
        private final NativeAdRatingApi mNativeAdRatingApi;

        @Benchmark
        Rating(NativeAdRatingApi nativeAdRatingApi) {
            this.mNativeAdRatingApi = nativeAdRatingApi;
        }

        @Nullable
        @Benchmark
        public static Rating fromJSONObject(JSONObject jSONObject) {
            NativeAdRatingApi createNativeAdRatingApi = DynamicLoaderFactory.makeLoaderUnsafe().createNativeAdRatingApi(jSONObject);
            if (createNativeAdRatingApi == null) {
                return null;
            }
            return new Rating(createNativeAdRatingApi);
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public double getScale() {
            return this.mNativeAdRatingApi.getScale();
        }

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        public double getValue() {
            return this.mNativeAdRatingApi.getValue();
        }
    }

    @Benchmark
    public NativeAdBase(Context context, String str) {
        this.mNativeAdBaseApi = DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(context, str);
    }

    @Benchmark
    public static NativeAdBase fromBidPayload(Context context, String str, String str2) throws Exception {
        return DynamicLoaderFactory.makeLoader(context).createNativeAdBaseFromBidPayload(context, str, str2);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public NativeAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mNativeAdBaseApi.buildLoadAdConfig(this);
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public void destroy() {
        this.mNativeAdBaseApi.destroy();
    }

    @Benchmark
    public void downloadMedia() {
        this.mNativeAdBaseApi.downloadMedia();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdBodyText() {
        return this.mNativeAdBaseApi.getAdBodyText();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdCallToAction() {
        return this.mNativeAdBaseApi.getAdCallToAction();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Image getAdChoicesIcon() {
        if (this.mNativeAdBaseApi.getAdChoicesIcon() == null) {
            return null;
        }
        return new Image(this.mNativeAdBaseApi.getAdChoicesIcon());
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdChoicesImageUrl() {
        return this.mNativeAdBaseApi.getAdChoicesImageUrl();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdChoicesLinkUrl() {
        return this.mNativeAdBaseApi.getAdChoicesLinkUrl();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdChoicesText() {
        return this.mNativeAdBaseApi.getAdChoicesText();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Image getAdCoverImage() {
        if (this.mNativeAdBaseApi.getAdCoverImage() == null) {
            return null;
        }
        return new Image(this.mNativeAdBaseApi.getAdCoverImage());
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdHeadline() {
        return this.mNativeAdBaseApi.getAdHeadline();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Image getAdIcon() {
        if (this.mNativeAdBaseApi.getAdIcon() == null) {
            return null;
        }
        return new Image(this.mNativeAdBaseApi.getAdIcon());
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdLinkDescription() {
        return this.mNativeAdBaseApi.getAdLinkDescription();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdSocialContext() {
        return this.mNativeAdBaseApi.getAdSocialContext();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public Rating getAdStarRating() {
        if (this.mNativeAdBaseApi.getAdStarRating() == null) {
            return null;
        }
        return new Rating(this.mNativeAdBaseApi.getAdStarRating());
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdTranslation() {
        return this.mNativeAdBaseApi.getAdTranslation();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdUntrimmedBodyText() {
        return this.mNativeAdBaseApi.getAdUntrimmedBodyText();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public NativeAdViewAttributes getAdViewAttributes() {
        return new NativeAdViewAttributes();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getAdvertiserName() {
        return this.mNativeAdBaseApi.getAdvertiserName();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public float getAspectRatio() {
        return this.mNativeAdBaseApi.getAspectRatio();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getId() {
        return this.mNativeAdBaseApi.getId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public NativeAdBaseApi getInternalNativeAd() {
        return this.mNativeAdBaseApi;
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public String getPlacementId() {
        return this.mNativeAdBaseApi.getPlacementId();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public Drawable getPreloadedIconViewDrawable() {
        return this.mNativeAdBaseApi.getPreloadedIconViewDrawable();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getPromotedTranslation() {
        return this.mNativeAdBaseApi.getPromotedTranslation();
    }

    @Nullable
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public String getSponsoredTranslation() {
        return this.mNativeAdBaseApi.getSponsoredTranslation();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean hasCallToAction() {
        return this.mNativeAdBaseApi.hasCallToAction();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public boolean isAdInvalidated() {
        return this.mNativeAdBaseApi.isAdInvalidated();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        return this.mNativeAdBaseApi.isAdLoaded();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public boolean isNativeConfigEnabled() {
        return false;
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public void loadAd() {
        this.mNativeAdBaseApi.loadAd();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public void onCtaBroadcast() {
        this.mNativeAdBaseApi.onCtaBroadcast();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mNativeAdBaseApi.setExtraHints(extraHints);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.mNativeAdBaseApi.setOnTouchListener(onTouchListener);
    }

    @Benchmark
    public void unregisterView() {
        this.mNativeAdBaseApi.unregisterView();
    }

    @Benchmark
    public void loadAd(NativeLoadAdConfig nativeLoadAdConfig) {
        this.mNativeAdBaseApi.loadAd(nativeLoadAdConfig);
    }

    @Benchmark
    public NativeAdBase(NativeAdBaseApi nativeAdBaseApi) {
        this.mNativeAdBaseApi = nativeAdBaseApi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Benchmark
    public NativeAdBase(Context context, NativeAdBase nativeAdBase) {
        this.mNativeAdBaseApi = DynamicLoaderFactory.makeLoader(context).createNativeAdBaseApi(nativeAdBase.mNativeAdBaseApi);
    }
}
