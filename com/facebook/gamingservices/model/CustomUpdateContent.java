package com.facebook.gamingservices.model;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.gamingservices.GamingContext;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: CustomUpdateContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class CustomUpdateContent {
    @NotNull
    private final String contextTokenId;
    @Nullable
    private final CustomUpdateLocalizedText cta;
    @Nullable
    private final String data;
    @Nullable
    private final String image;
    @Nullable
    private final CustomUpdateMedia media;
    @NotNull
    private final CustomUpdateLocalizedText text;

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customUpdateLocalizedText, customUpdateLocalizedText2, str2, customUpdateMedia, str3);
    }

    @NotNull
    public final String getContextTokenId() {
        return this.contextTokenId;
    }

    @Nullable
    public final CustomUpdateLocalizedText getCta() {
        return this.cta;
    }

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final CustomUpdateMedia getMedia() {
        return this.media;
    }

    @NotNull
    public final CustomUpdateLocalizedText getText() {
        return this.text;
    }

    @NotNull
    public final JSONObject toGraphRequestContent() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context_token_id", this.contextTokenId);
        jSONObject.put("text", this.text.toJSONObject().toString());
        CustomUpdateLocalizedText customUpdateLocalizedText = this.cta;
        if (customUpdateLocalizedText != null) {
            jSONObject.put("cta", customUpdateLocalizedText.toJSONObject().toString());
        }
        String str = this.image;
        if (str != null) {
            jSONObject.put("image", str);
        }
        CustomUpdateMedia customUpdateMedia = this.media;
        if (customUpdateMedia != null) {
            jSONObject.put("media", customUpdateMedia.toJSONObject().toString());
        }
        String str2 = this.data;
        if (str2 != null) {
            jSONObject.put("data", str2);
        }
        return jSONObject;
    }

    private CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3) {
        this.contextTokenId = str;
        this.text = customUpdateLocalizedText;
        this.cta = customUpdateLocalizedText2;
        this.image = str2;
        this.media = customUpdateMedia;
        this.data = str3;
    }

    /* compiled from: CustomUpdateContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Builder {
        @Nullable
        private final String contextTokenId;
        @Nullable
        private CustomUpdateLocalizedText cta;
        @Nullable
        private String data;
        @Nullable
        private final Bitmap image;
        @Nullable
        private final CustomUpdateMedia media;
        @NotNull
        private final CustomUpdateLocalizedText text;

        private Builder(String str, CustomUpdateLocalizedText customUpdateLocalizedText, Bitmap bitmap, CustomUpdateMedia customUpdateMedia) {
            this.contextTokenId = str;
            this.text = customUpdateLocalizedText;
            this.image = bitmap;
            this.media = customUpdateMedia;
        }

        private final String bitmapToBase64String(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return Intrinsics.m17064q("data:image/png;base64,", Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
        }

        @NotNull
        public final CustomUpdateContent build() {
            boolean z;
            CustomUpdateMedia customUpdateMedia = this.media;
            if (customUpdateMedia != null) {
                boolean z2 = true;
                if (customUpdateMedia.getGif() != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (this.media.getVideo() == null) {
                    z2 = false;
                }
                if (!(z ^ z2)) {
                    throw new IllegalArgumentException("Invalid CustomUpdateMedia, please set either gif or video");
                }
            }
            String bitmapToBase64String = bitmapToBase64String(this.image);
            String str = this.contextTokenId;
            if (str != null) {
                return new CustomUpdateContent(str, this.text, this.cta, bitmapToBase64String, this.media, this.data, null);
            }
            throw new IllegalArgumentException("parameter contextToken must not be null");
        }

        @Nullable
        public final CustomUpdateLocalizedText getCta() {
            return this.cta;
        }

        @Nullable
        public final String getData() {
            return this.data;
        }

        @NotNull
        public final Builder setCta(@NotNull CustomUpdateLocalizedText cta) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            this.cta = cta;
            return this;
        }

        @NotNull
        public final Builder setData(@NotNull String data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
            return this;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull GamingContext contextToken, @NotNull CustomUpdateLocalizedText text, @NotNull Bitmap image) {
            this(contextToken.getContextID(), text, image, null);
            Intrinsics.checkNotNullParameter(contextToken, "contextToken");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(image, "image");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull GamingContext contextToken, @NotNull CustomUpdateLocalizedText text, @NotNull CustomUpdateMedia media) {
            this(contextToken.getContextID(), text, null, media);
            Intrinsics.checkNotNullParameter(contextToken, "contextToken");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(media, "media");
        }
    }

    /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customUpdateLocalizedText, (i & 4) != 0 ? null : customUpdateLocalizedText2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : customUpdateMedia, (i & 32) != 0 ? null : str3);
    }
}
