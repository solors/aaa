package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareVideoContent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareVideoContent extends ShareContent<ShareVideoContent, Builder> {
    @Nullable
    private final String contentDescription;
    @Nullable
    private final String contentTitle;
    @Nullable
    private final SharePhoto previewPhoto;
    @Nullable
    private final ShareVideo video;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareVideoContent> CREATOR = new Parcelable.Creator<ShareVideoContent>() { // from class: com.facebook.share.model.ShareVideoContent$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareVideoContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareVideoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareVideoContent[] newArray(int i) {
            return new ShareVideoContent[i];
        }
    };

    /* compiled from: ShareVideoContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareContent.Builder<ShareVideoContent, Builder> {
        @Nullable
        private String contentDescription;
        @Nullable
        private String contentTitle;
        @Nullable
        private SharePhoto previewPhoto;
        @Nullable
        private ShareVideo video;

        @Nullable
        public final String getContentDescription$facebook_common_release() {
            return this.contentDescription;
        }

        @Nullable
        public final String getContentTitle$facebook_common_release() {
            return this.contentTitle;
        }

        @Nullable
        public final SharePhoto getPreviewPhoto$facebook_common_release() {
            return this.previewPhoto;
        }

        @Nullable
        public final ShareVideo getVideo$facebook_common_release() {
            return this.video;
        }

        @NotNull
        public final Builder setContentDescription(@Nullable String str) {
            this.contentDescription = str;
            return this;
        }

        public final void setContentDescription$facebook_common_release(@Nullable String str) {
            this.contentDescription = str;
        }

        @NotNull
        public final Builder setContentTitle(@Nullable String str) {
            this.contentTitle = str;
            return this;
        }

        public final void setContentTitle$facebook_common_release(@Nullable String str) {
            this.contentTitle = str;
        }

        @NotNull
        public final Builder setPreviewPhoto(@Nullable SharePhoto sharePhoto) {
            SharePhoto build;
            if (sharePhoto == null) {
                build = null;
            } else {
                build = new SharePhoto.Builder().readFrom(sharePhoto).build();
            }
            this.previewPhoto = build;
            return this;
        }

        public final void setPreviewPhoto$facebook_common_release(@Nullable SharePhoto sharePhoto) {
            this.previewPhoto = sharePhoto;
        }

        @NotNull
        public final Builder setVideo(@Nullable ShareVideo shareVideo) {
            if (shareVideo == null) {
                return this;
            }
            this.video = new ShareVideo.Builder().readFrom(shareVideo).build();
            return this;
        }

        public final void setVideo$facebook_common_release(@Nullable ShareVideo shareVideo) {
            this.video = shareVideo;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareVideoContent build() {
            return new ShareVideoContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareVideoContent shareVideoContent) {
            return shareVideoContent == null ? this : ((Builder) super.readFrom((Builder) shareVideoContent)).setContentDescription(shareVideoContent.getContentDescription()).setContentTitle(shareVideoContent.getContentTitle()).setPreviewPhoto(shareVideoContent.getPreviewPhoto()).setVideo(shareVideoContent.getVideo());
        }
    }

    /* compiled from: ShareVideoContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShareVideoContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getContentDescription() {
        return this.contentDescription;
    }

    @Nullable
    public final String getContentTitle() {
        return this.contentTitle;
    }

    @Nullable
    public final SharePhoto getPreviewPhoto() {
        return this.previewPhoto;
    }

    @Nullable
    public final ShareVideo getVideo() {
        return this.video;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.contentDescription);
        out.writeString(this.contentTitle);
        out.writeParcelable(this.previewPhoto, 0);
        out.writeParcelable(this.video, 0);
    }

    private ShareVideoContent(Builder builder) {
        super(builder);
        this.contentDescription = builder.getContentDescription$facebook_common_release();
        this.contentTitle = builder.getContentTitle$facebook_common_release();
        this.previewPhoto = builder.getPreviewPhoto$facebook_common_release();
        this.video = builder.getVideo$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareVideoContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contentDescription = parcel.readString();
        this.contentTitle = parcel.readString();
        SharePhoto.Builder readFrom$facebook_common_release = new SharePhoto.Builder().readFrom$facebook_common_release(parcel);
        this.previewPhoto = (readFrom$facebook_common_release.getImageUrl$facebook_common_release() == null && readFrom$facebook_common_release.getBitmap$facebook_common_release() == null) ? null : readFrom$facebook_common_release.build();
        this.video = new ShareVideo.Builder().readFrom$facebook_common_release(parcel).build();
    }
}
