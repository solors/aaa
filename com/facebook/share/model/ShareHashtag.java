package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareHashtag.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareHashtag implements ShareModel {
    @Nullable
    private final String hashtag;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new Parcelable.Creator<ShareHashtag>() { // from class: com.facebook.share.model.ShareHashtag$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareHashtag createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareHashtag(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareHashtag[] newArray(int i) {
            return new ShareHashtag[i];
        }
    };

    /* compiled from: ShareHashtag.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder implements ShareModelBuilder<ShareHashtag, Builder> {
        @Nullable
        private String hashtag;

        @Nullable
        public final String getHashtag() {
            return this.hashtag;
        }

        @NotNull
        public final Builder readFrom$facebook_common_release(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((ShareHashtag) parcel.readParcelable(ShareHashtag.class.getClassLoader()));
        }

        @NotNull
        public final Builder setHashtag(@Nullable String str) {
            this.hashtag = str;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareHashtag build() {
            return new ShareHashtag(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareHashtag shareHashtag) {
            return shareHashtag == null ? this : setHashtag(shareHashtag.getHashtag());
        }
    }

    /* compiled from: ShareHashtag.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShareHashtag(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getHashtag() {
        return this.hashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.hashtag);
    }

    private ShareHashtag(Builder builder) {
        this.hashtag = builder.getHashtag();
    }

    public ShareHashtag(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.hashtag = parcel.readString();
    }
}
