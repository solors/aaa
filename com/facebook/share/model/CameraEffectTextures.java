package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C37572z0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CameraEffectTextures.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CameraEffectTextures implements ShareModel {
    @Nullable
    private final Bundle textures;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<CameraEffectTextures> CREATOR = new Parcelable.Creator<CameraEffectTextures>() { // from class: com.facebook.share.model.CameraEffectTextures$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CameraEffectTextures createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraEffectTextures(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CameraEffectTextures[] newArray(int i) {
            return new CameraEffectTextures[i];
        }
    };

    /* compiled from: CameraEffectTextures.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder implements ShareModelBuilder<CameraEffectTextures, Builder> {
        @NotNull
        private final Bundle textures = new Bundle();

        private final Builder putParcelableTexture(String str, Parcelable parcelable) {
            boolean z;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && parcelable != null) {
                this.textures.putParcelable(str, parcelable);
            }
            return this;
        }

        @NotNull
        public final Bundle getTextures$facebook_common_release() {
            return this.textures;
        }

        @NotNull
        public final Builder putTexture(@NotNull String key, @Nullable Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putParcelableTexture(key, bitmap);
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public CameraEffectTextures build() {
            return new CameraEffectTextures(this, null);
        }

        @NotNull
        public final Builder putTexture(@NotNull String key, @Nullable Uri uri) {
            Intrinsics.checkNotNullParameter(key, "key");
            return putParcelableTexture(key, uri);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable CameraEffectTextures cameraEffectTextures) {
            if (cameraEffectTextures != null) {
                this.textures.putAll(cameraEffectTextures.textures);
            }
            return this;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((CameraEffectTextures) parcel.readParcelable(CameraEffectTextures.class.getClassLoader()));
        }
    }

    /* compiled from: CameraEffectTextures.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CameraEffectTextures(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Object get(@Nullable String str) {
        Bundle bundle = this.textures;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    @Nullable
    public final Bitmap getTextureBitmap(@Nullable String str) {
        Object obj;
        Bundle bundle = this.textures;
        if (bundle == null) {
            obj = null;
        } else {
            obj = bundle.get(str);
        }
        if (!(obj instanceof Bitmap)) {
            return null;
        }
        return (Bitmap) obj;
    }

    @Nullable
    public final Uri getTextureUri(@Nullable String str) {
        Object obj;
        Bundle bundle = this.textures;
        if (bundle == null) {
            obj = null;
        } else {
            obj = bundle.get(str);
        }
        if (!(obj instanceof Uri)) {
            return null;
        }
        return (Uri) obj;
    }

    @NotNull
    public final Set<String> keySet() {
        Set<String> keySet;
        Set<String> m17123f;
        Bundle bundle = this.textures;
        if (bundle == null) {
            keySet = null;
        } else {
            keySet = bundle.keySet();
        }
        if (keySet == null) {
            m17123f = C37572z0.m17123f();
            return m17123f;
        }
        return keySet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeBundle(this.textures);
    }

    private CameraEffectTextures(Builder builder) {
        this.textures = builder.getTextures$facebook_common_release();
    }

    public CameraEffectTextures(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.textures = parcel.readBundle(CameraEffectTextures.class.getClassLoader());
    }
}
