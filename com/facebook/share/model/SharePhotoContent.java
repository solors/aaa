package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharePhotoContent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SharePhotoContent extends ShareContent<SharePhotoContent, Builder> {
    @NotNull
    private final List<SharePhoto> photos;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<SharePhotoContent> CREATOR = new Parcelable.Creator<SharePhotoContent>() { // from class: com.facebook.share.model.SharePhotoContent$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SharePhotoContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SharePhotoContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public SharePhotoContent[] newArray(int i) {
            return new SharePhotoContent[i];
        }
    };

    /* compiled from: SharePhotoContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareContent.Builder<SharePhotoContent, Builder> {
        @NotNull
        private final List<SharePhoto> photos = new ArrayList();

        @NotNull
        public final Builder addPhoto(@Nullable SharePhoto sharePhoto) {
            if (sharePhoto != null) {
                this.photos.add(new SharePhoto.Builder().readFrom(sharePhoto).build());
            }
            return this;
        }

        @NotNull
        public final Builder addPhotos(@Nullable List<SharePhoto> list) {
            if (list != null) {
                for (SharePhoto sharePhoto : list) {
                    addPhoto(sharePhoto);
                }
            }
            return this;
        }

        @NotNull
        public final List<SharePhoto> getPhotos$facebook_common_release() {
            return this.photos;
        }

        @NotNull
        public final Builder setPhotos(@Nullable List<SharePhoto> list) {
            this.photos.clear();
            addPhotos(list);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public SharePhotoContent build() {
            return new SharePhotoContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable SharePhotoContent sharePhotoContent) {
            return sharePhotoContent == null ? this : ((Builder) super.readFrom((Builder) sharePhotoContent)).addPhotos(sharePhotoContent.getPhotos());
        }
    }

    /* compiled from: SharePhotoContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SharePhotoContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<SharePhoto> getPhotos() {
        return this.photos;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        SharePhoto.Builder.Companion.writePhotoListTo$facebook_common_release(out, i, this.photos);
    }

    private SharePhotoContent(Builder builder) {
        super(builder);
        List<SharePhoto> m17553Z0;
        m17553Z0 = _Collections.m17553Z0(builder.getPhotos$facebook_common_release());
        this.photos = m17553Z0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhotoContent(@NotNull Parcel parcel) {
        super(parcel);
        List<SharePhoto> m17553Z0;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        m17553Z0 = _Collections.m17553Z0(SharePhoto.Builder.Companion.readPhotoListFrom$facebook_common_release(parcel));
        this.photos = m17553Z0;
    }
}
