package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareVideo.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareVideo extends ShareMedia<ShareVideo, Builder> {
    @Nullable
    private final Uri localUrl;
    @NotNull
    private final ShareMedia.Type mediaType;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareVideo> CREATOR = new Parcelable.Creator<ShareVideo>() { // from class: com.facebook.share.model.ShareVideo$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareVideo createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareVideo(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareVideo[] newArray(int i) {
            return new ShareVideo[i];
        }
    };

    /* compiled from: ShareVideo.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareMedia.Builder<ShareVideo, Builder> {
        @Nullable
        private Uri localUrl;

        @Nullable
        public final Uri getLocalUrl$facebook_common_release() {
            return this.localUrl;
        }

        @NotNull
        public final Builder readFrom$facebook_common_release(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((ShareVideo) parcel.readParcelable(ShareVideo.class.getClassLoader()));
        }

        @NotNull
        public final Builder setLocalUrl(@Nullable Uri uri) {
            this.localUrl = uri;
            return this;
        }

        public final void setLocalUrl$facebook_common_release(@Nullable Uri uri) {
            this.localUrl = uri;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareVideo build() {
            return new ShareVideo(this, null);
        }

        @Override // com.facebook.share.model.ShareMedia.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareVideo shareVideo) {
            return shareVideo == null ? this : setLocalUrl(shareVideo.getLocalUrl());
        }
    }

    /* compiled from: ShareVideo.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShareVideo(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Uri getLocalUrl() {
        return this.localUrl;
    }

    @Override // com.facebook.share.model.ShareMedia
    @NotNull
    public ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.localUrl, 0);
    }

    private ShareVideo(Builder builder) {
        super(builder);
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = builder.getLocalUrl$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideo(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mediaType = ShareMedia.Type.VIDEO;
        this.localUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
