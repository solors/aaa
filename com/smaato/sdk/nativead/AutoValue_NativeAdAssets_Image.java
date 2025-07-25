package com.smaato.sdk.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.nativead.NativeAdAssets;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.nativead.b */
/* loaded from: classes7.dex */
public final class AutoValue_NativeAdAssets_Image extends NativeAdAssets.Image {

    /* renamed from: a */
    private final Drawable f72170a;

    /* renamed from: b */
    private final Uri f72171b;

    /* renamed from: c */
    private final int f72172c;

    /* renamed from: d */
    private final int f72173d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AutoValue_NativeAdAssets_Image(@Nullable Drawable drawable, Uri uri, int i, int i2) {
        this.f72170a = drawable;
        if (uri != null) {
            this.f72171b = uri;
            this.f72172c = i;
            this.f72173d = i2;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets.Image
    @Nullable
    public Drawable drawable() {
        return this.f72170a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeAdAssets.Image)) {
            return false;
        }
        NativeAdAssets.Image image = (NativeAdAssets.Image) obj;
        Drawable drawable = this.f72170a;
        if (drawable != null ? drawable.equals(image.drawable()) : image.drawable() == null) {
            if (this.f72171b.equals(image.uri()) && this.f72172c == image.width() && this.f72173d == image.height()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Drawable drawable = this.f72170a;
        if (drawable == null) {
            hashCode = 0;
        } else {
            hashCode = drawable.hashCode();
        }
        return ((((((hashCode ^ 1000003) * 1000003) ^ this.f72171b.hashCode()) * 1000003) ^ this.f72172c) * 1000003) ^ this.f72173d;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets.Image
    public int height() {
        return this.f72173d;
    }

    public String toString() {
        return "Image{drawable=" + this.f72170a + ", uri=" + this.f72171b + ", width=" + this.f72172c + ", height=" + this.f72173d + "}";
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets.Image
    @NonNull
    public Uri uri() {
        return this.f72171b;
    }

    @Override // com.smaato.sdk.nativead.NativeAdAssets.Image
    public int width() {
        return this.f72172c;
    }
}
