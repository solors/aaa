package com.facebook.share.model;

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

/* compiled from: CameraEffectArguments.kt */
@Metadata
/* loaded from: classes4.dex */
public final class CameraEffectArguments implements ShareModel {
    @Nullable
    private final Bundle params;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<CameraEffectArguments> CREATOR = new Parcelable.Creator<CameraEffectArguments>() { // from class: com.facebook.share.model.CameraEffectArguments$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CameraEffectArguments createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CameraEffectArguments(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public CameraEffectArguments[] newArray(int i) {
            return new CameraEffectArguments[i];
        }
    };

    /* compiled from: CameraEffectArguments.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder implements ShareModelBuilder<CameraEffectArguments, Builder> {
        @NotNull
        private final Bundle params = new Bundle();

        @NotNull
        public final Bundle getParams$facebook_common_release() {
            return this.params;
        }

        @NotNull
        public final Builder putArgument(@NotNull String key, @NotNull String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.params.putString(key, value);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public CameraEffectArguments build() {
            return new CameraEffectArguments(this, null);
        }

        @NotNull
        public final Builder putArgument(@NotNull String key, @NotNull String[] arrayValue) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(arrayValue, "arrayValue");
            this.params.putStringArray(key, arrayValue);
            return this;
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable CameraEffectArguments cameraEffectArguments) {
            if (cameraEffectArguments != null) {
                this.params.putAll(cameraEffectArguments.params);
            }
            return this;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((CameraEffectArguments) parcel.readParcelable(CameraEffectArguments.class.getClassLoader()));
        }
    }

    /* compiled from: CameraEffectArguments.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CameraEffectArguments(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Object get(@Nullable String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.get(str);
    }

    @Nullable
    public final String getString(@Nullable String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    @Nullable
    public final String[] getStringArray(@Nullable String str) {
        Bundle bundle = this.params;
        if (bundle == null) {
            return null;
        }
        return bundle.getStringArray(str);
    }

    @NotNull
    public final Set<String> keySet() {
        Set<String> keySet;
        Set<String> m17123f;
        Bundle bundle = this.params;
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
        out.writeBundle(this.params);
    }

    private CameraEffectArguments(Builder builder) {
        this.params = builder.getParams$facebook_common_release();
    }

    public CameraEffectArguments(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.params = parcel.readBundle(CameraEffectArguments.class.getClassLoader());
    }
}
