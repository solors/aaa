package com.smaato.sdk.video.vast.model;

import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.video.vast.exceptions.VastElementMissingException;

/* loaded from: classes7.dex */
public class MediaFile implements Sized {
    public static final String API_FRAMEWORK = "apiFramework";
    public static final String BITRATE = "bitrate";
    public static final String CODEC = "codec";
    public static final String DELIVERY = "delivery";
    public static final String FILE_SIZE = "fileSize";
    public static final String HEIGHT = "height";

    /* renamed from: ID */
    public static final String f72482ID = "id";
    public static final String MAINTAIN_ASPECT_RATIO = "maintainAspectRatio";
    public static final String MAX_BITRATE = "maxBitrate";
    public static final String MEDIA_TYPE = "mediaType";
    public static final String MIN_BITRATE = "minBitrate";
    public static final String NAME = "MediaFile";
    public static final String SCALABLE = "scalable";
    public static final String TYPE = "type";
    public static final String URL = "url";
    public static final String URL_DOWNLOAD_FAILED = "download_failed";
    public static final String WIDTH = "width";
    @Nullable
    public final String apiFramework;
    @Nullable
    public final Integer bitrate;
    @Nullable
    public final String codec;
    @Nullable
    public final Delivery delivery;
    @Nullable
    public final Integer fileSize;
    @Nullable
    public final Float height;
    @Nullable

    /* renamed from: id */
    public final String f72483id;
    @Nullable
    public final Boolean maintainAspectRatio;
    @Nullable
    public final Integer maxBitrate;
    @Nullable
    public final String mediaType;
    @Nullable
    public final Integer minBitrate;
    @Nullable
    public final Boolean scalable;
    @Nullable
    public final String type;
    @NonNull
    public final String url;
    @Nullable
    public final Float width;

    /* loaded from: classes7.dex */
    public static class Builder {
        @Nullable
        private String apiFramework;
        @Nullable
        private Integer bitrate;
        @Nullable
        private String codec;
        @Nullable
        private Delivery delivery;
        @Nullable
        private Integer fileSize;
        @Nullable
        private Float height;
        @Nullable

        /* renamed from: id */
        private String f72484id;
        @Nullable
        private Boolean maintainAspectRatio;
        @Nullable
        private Integer maxBitrate;
        @Nullable
        private String mediaType;
        @Nullable
        private Integer minBitrate;
        @Nullable
        private Boolean scalable;
        @Nullable
        private String type;
        @Nullable
        private String url;
        @Nullable
        private Float width;

        public Builder() {
        }

        @NonNull
        public MediaFile build() throws VastElementMissingException {
            if (!URLUtil.isValidUrl(this.url) && !MediaFile.URL_DOWNLOAD_FAILED.equals(this.url)) {
                throw new VastElementMissingException("Cannot build MediaFile: uri is missing");
            }
            String str = this.url;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            String str3 = this.type;
            Float f = this.width;
            Float f2 = this.height;
            String str4 = this.f72484id;
            String str5 = this.codec;
            Integer num = this.bitrate;
            Integer num2 = this.minBitrate;
            Integer num3 = this.maxBitrate;
            Boolean bool = this.scalable;
            Boolean bool2 = this.maintainAspectRatio;
            String str6 = this.apiFramework;
            Integer num4 = this.fileSize;
            String str7 = this.mediaType;
            Delivery delivery = this.delivery;
            if (delivery == null) {
                delivery = Delivery.PROGRESSIVE;
            }
            return new MediaFile(str2, str3, f, f2, str4, str5, num, num2, num3, bool, bool2, str6, num4, str7, delivery);
        }

        @NonNull
        public Builder setApiFramework(@Nullable String str) {
            this.apiFramework = str;
            return this;
        }

        @NonNull
        public Builder setBitrate(@Nullable Integer num) {
            this.bitrate = num;
            return this;
        }

        @NonNull
        public Builder setCodec(@Nullable String str) {
            this.codec = str;
            return this;
        }

        @NonNull
        public Builder setDelivery(@Nullable Delivery delivery) {
            this.delivery = delivery;
            return this;
        }

        @NonNull
        public Builder setFileSize(@Nullable Integer num) {
            this.fileSize = num;
            return this;
        }

        @NonNull
        public Builder setHeight(@Nullable Float f) {
            this.height = f;
            return this;
        }

        @NonNull
        public Builder setId(@Nullable String str) {
            this.f72484id = str;
            return this;
        }

        @NonNull
        public Builder setMaintainAspectRatio(@Nullable Boolean bool) {
            this.maintainAspectRatio = bool;
            return this;
        }

        @NonNull
        public Builder setMaxBitrate(@Nullable Integer num) {
            this.maxBitrate = num;
            return this;
        }

        @NonNull
        public Builder setMediaType(@Nullable String str) {
            this.mediaType = str;
            return this;
        }

        @NonNull
        public Builder setMinBitrate(@Nullable Integer num) {
            this.minBitrate = num;
            return this;
        }

        @NonNull
        public Builder setScalable(@Nullable Boolean bool) {
            this.scalable = bool;
            return this;
        }

        @NonNull
        public Builder setType(@Nullable String str) {
            this.type = str;
            return this;
        }

        @NonNull
        public Builder setUrl(@Nullable String str) {
            this.url = str;
            return this;
        }

        @NonNull
        public Builder setWidth(@Nullable Float f) {
            this.width = f;
            return this;
        }

        public Builder(@NonNull MediaFile mediaFile) {
            this.url = mediaFile.url;
            this.f72484id = mediaFile.f72483id;
            this.type = mediaFile.type;
            this.width = mediaFile.width;
            this.height = mediaFile.height;
            this.codec = mediaFile.codec;
            this.bitrate = mediaFile.bitrate;
            this.minBitrate = mediaFile.minBitrate;
            this.maxBitrate = mediaFile.maxBitrate;
            this.scalable = mediaFile.scalable;
            this.maintainAspectRatio = mediaFile.maintainAspectRatio;
            this.apiFramework = mediaFile.apiFramework;
            this.fileSize = mediaFile.fileSize;
            this.mediaType = mediaFile.mediaType;
            this.delivery = mediaFile.delivery;
        }
    }

    MediaFile(@NonNull String str, @Nullable String str2, @Nullable Float f, @Nullable Float f2, @Nullable String str3, @Nullable String str4, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable String str5, @Nullable Integer num4, @Nullable String str6, @Nullable Delivery delivery) {
        this.type = str2;
        this.width = f;
        this.height = f2;
        this.f72483id = str3;
        this.codec = str4;
        this.url = str;
        this.bitrate = num;
        this.minBitrate = num2;
        this.maxBitrate = num3;
        this.scalable = bool;
        this.maintainAspectRatio = bool2;
        this.apiFramework = str5;
        this.fileSize = num4;
        this.mediaType = str6;
        this.delivery = delivery;
    }

    @Override // com.smaato.sdk.video.vast.model.Sized
    @Nullable
    public Float getHeight() {
        return this.height;
    }

    @Override // com.smaato.sdk.video.vast.model.Sized
    @Nullable
    public Float getWidth() {
        return this.width;
    }

    public boolean isVpaid() {
        return "vpaid".equalsIgnoreCase(this.apiFramework);
    }

    @NonNull
    public Builder newBuilder() {
        return new Builder(this);
    }
}
