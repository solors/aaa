package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public interface NativeAdDataInterface {

    @Metadata
    /* loaded from: classes6.dex */
    public static class Image {
        @Nullable

        /* renamed from: a */
        private final Drawable f51288a;
        @Nullable

        /* renamed from: b */
        private final Uri f51289b;

        public Image(@Nullable Drawable drawable, @Nullable Uri uri) {
            this.f51288a = drawable;
            this.f51289b = uri;
        }

        @Nullable
        public final Drawable getDrawable() {
            return this.f51288a;
        }

        @Nullable
        public final Uri getUri() {
            return this.f51289b;
        }
    }

    @Nullable
    String getAdvertiser();

    @Nullable
    String getBody();

    @Nullable
    String getCallToAction();

    @Nullable
    Image getIcon();

    @Nullable
    String getTitle();
}
