package com.smaato.sdk.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.smaato.sdk.nativead.AutoValue_NativeAdAssets;
import java.util.Collections;
import java.util.List;

@AutoValue.CopyAnnotations
@AutoValue
/* loaded from: classes7.dex */
public abstract class NativeAdAssets {

    @AutoValue.Builder
    /* loaded from: classes7.dex */
    public static abstract class Builder {
        public abstract NativeAdAssets build();

        public abstract Builder cta(String str);

        public abstract Builder icon(Image image);

        public abstract Builder images(List<Image> list);

        public abstract Builder mraidJs(String str);

        public abstract Builder rating(Double d);

        public abstract Builder sponsored(String str);

        public abstract Builder text(String str);

        public abstract Builder title(String str);

        public abstract Builder vastTag(String str);
    }

    @AutoValue.CopyAnnotations
    @AutoValue
    /* loaded from: classes7.dex */
    public static abstract class Image {
        @NonNull
        public static Image create(Uri uri, int i, int i2) {
            return new AutoValue_NativeAdAssets_Image(null, uri, i, i2);
        }

        @Nullable
        public abstract Drawable drawable();

        public abstract int height();

        @NonNull
        public abstract Uri uri();

        public abstract int width();

        public Image withDrawable(Drawable drawable) {
            return new AutoValue_NativeAdAssets_Image(drawable, uri(), width(), height());
        }
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_NativeAdAssets.C27457b().images(Collections.emptyList());
    }

    public Builder buildUpon() {
        return new AutoValue_NativeAdAssets.C27457b().title(title()).mraidJs(mraidJs()).vastTag(vastTag()).text(text()).sponsored(sponsored()).cta(cta()).icon(icon()).images(images()).rating(rating());
    }

    @Nullable
    public abstract String cta();

    @Nullable
    public abstract Image icon();

    @NonNull
    public abstract List<Image> images();

    @Nullable
    public abstract String mraidJs();

    @Nullable
    public abstract Double rating();

    @Nullable
    public abstract String sponsored();

    @Nullable
    public abstract String text();

    @Nullable
    public abstract String title();

    @Nullable
    public abstract String vastTag();
}
