package com.smaato.sdk.core.mvvm.model;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.core.api.ImpressionCountingType;
import com.smaato.sdk.core.mvvm.model.AutoValue_AdResponse;
import com.smaato.sdk.core.mvvm.model.imagead.Extension;
import com.smaato.sdk.core.p568ad.AdType;
import java.util.List;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class AdResponse {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract AdResponse build();

        public abstract Builder setAdType(AdType adType);

        public abstract Builder setBundleId(String str);

        public abstract Builder setClickTrackingUrls(List<String> list);

        public abstract Builder setClickUrl(String str);

        public abstract Builder setCsmObject(Object obj);

        public abstract Builder setExtensions(List<Extension> list);

        public abstract Builder setHeight(Integer num);

        public abstract Builder setImageBitmap(Bitmap bitmap);

        public abstract Builder setImageUrl(String str);

        public abstract Builder setImpressionCountingType(ImpressionCountingType impressionCountingType);

        public abstract Builder setImpressionTrackingUrls(List<String> list);

        public abstract Builder setNativeObject(Object obj);

        public abstract Builder setRichMediaContent(String str);

        public abstract Builder setRichMediaRewardIntervalSeconds(Integer num);

        public abstract Builder setSci(String str);

        public abstract Builder setSessionId(String str);

        public abstract Builder setTtlMs(Long l);

        public abstract Builder setVastObject(Object obj);

        public abstract Builder setWidth(Integer num);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AdResponse.C27173b();
    }

    public Builder buildUpon() {
        return builder().setSessionId(getSessionId()).setSci(getSci()).setAdType(getAdType()).setWidth(getWidth()).setHeight(getHeight()).setImageUrl(getImageUrl()).setImageBitmap(getImageBitmap()).setRichMediaContent(getRichMediaContent()).setVastObject(getVastObject()).setNativeObject(getNativeObject()).setImpressionCountingType(getImpressionCountingType()).setBundleId(getBundleId()).setTtlMs(getTtlMs()).setImpressionTrackingUrls(getImpressionTrackingUrls()).setClickTrackingUrls(getClickTrackingUrls()).setClickUrl(getClickUrl()).setExtensions(getExtensions()).setCsmObject(getCsmObject()).setRichMediaRewardIntervalSeconds(getRichMediaRewardIntervalSeconds());
    }

    @NonNull
    public abstract AdType getAdType();

    @Nullable
    public abstract String getBundleId();

    @NonNull
    public abstract List<String> getClickTrackingUrls();

    @Nullable
    public abstract String getClickUrl();

    @Nullable
    public abstract Object getCsmObject();

    @Nullable
    public abstract List<Extension> getExtensions();

    @NonNull
    public abstract Integer getHeight();

    @Nullable
    public abstract Bitmap getImageBitmap();

    @Nullable
    public abstract String getImageUrl();

    @NonNull
    public abstract ImpressionCountingType getImpressionCountingType();

    @NonNull
    public abstract List<String> getImpressionTrackingUrls();

    @Nullable
    public abstract Object getNativeObject();

    @Nullable
    public abstract String getRichMediaContent();

    @Nullable
    public abstract Integer getRichMediaRewardIntervalSeconds();

    @Nullable
    public abstract String getSci();

    @NonNull
    public abstract String getSessionId();

    @Nullable
    public abstract Long getTtlMs();

    @Nullable
    public abstract Object getVastObject();

    @NonNull
    public abstract Integer getWidth();
}
