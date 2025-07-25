package com.monetization.ads.mediation.nativeads;

import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class MediatedNativeAdImage {

    /* renamed from: a */
    private final int f66533a;

    /* renamed from: b */
    private final int f66534b;
    @NotNull

    /* renamed from: c */
    private final String f66535c;
    @Nullable

    /* renamed from: d */
    private final Drawable f66536d;

    @Metadata
    /* loaded from: classes7.dex */
    public static final class Builder {
        @NotNull

        /* renamed from: a */
        private final String f66537a;

        /* renamed from: b */
        private int f66538b;

        /* renamed from: c */
        private int f66539c;
        @Nullable

        /* renamed from: d */
        private Drawable f66540d;

        public Builder(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f66537a = url;
        }

        @NotNull
        public final MediatedNativeAdImage build() {
            return new MediatedNativeAdImage(this.f66538b, this.f66539c, this.f66537a, this.f66540d, null);
        }

        @NotNull
        public final String getUrl() {
            return this.f66537a;
        }

        @NotNull
        public final Builder setDrawable(@Nullable Drawable drawable) {
            this.f66540d = drawable;
            return this;
        }

        @NotNull
        public final Builder setHeight(int i) {
            this.f66539c = i;
            return this;
        }

        @NotNull
        public final Builder setWidth(int i) {
            this.f66538b = i;
            return this;
        }
    }

    public /* synthetic */ MediatedNativeAdImage(int i, int i2, String str, Drawable drawable, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str, drawable);
    }

    @Nullable
    public final Drawable getDrawable() {
        return this.f66536d;
    }

    public final int getHeight() {
        return this.f66534b;
    }

    @NotNull
    public final String getUrl() {
        return this.f66535c;
    }

    public final int getWidth() {
        return this.f66533a;
    }

    private MediatedNativeAdImage(int i, int i2, String str, Drawable drawable) {
        this.f66533a = i;
        this.f66534b = i2;
        this.f66535c = str;
        this.f66536d = drawable;
    }
}
