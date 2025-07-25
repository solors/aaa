package com.facebook.share.model;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMedia;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SharePhoto.kt */
@Metadata
/* loaded from: classes4.dex */
public final class SharePhoto extends ShareMedia<SharePhoto, Builder> {
    @Nullable
    private final Bitmap bitmap;
    @Nullable
    private final String caption;
    @Nullable
    private final Uri imageUrl;
    @NotNull
    private final ShareMedia.Type mediaType;
    private final boolean userGenerated;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<SharePhoto> CREATOR = new Parcelable.Creator<SharePhoto>() { // from class: com.facebook.share.model.SharePhoto$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SharePhoto createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new SharePhoto(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public SharePhoto[] newArray(int i) {
            return new SharePhoto[i];
        }
    };

    /* compiled from: SharePhoto.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareMedia.Builder<SharePhoto, Builder> {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @Nullable
        private Bitmap bitmap;
        @Nullable
        private String caption;
        @Nullable
        private Uri imageUrl;
        private boolean userGenerated;

        /* compiled from: SharePhoto.kt */
        @Metadata
        /* loaded from: classes4.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final List<SharePhoto> readPhotoListFrom$facebook_common_release(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList arrayList = new ArrayList();
                for (Object obj : ShareMedia.Builder.Companion.readListFrom$facebook_common_release(parcel)) {
                    if (obj instanceof SharePhoto) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            }

            public final void writePhotoListTo$facebook_common_release(@NotNull Parcel out, int i, @NotNull List<SharePhoto> photos) {
                Intrinsics.checkNotNullParameter(out, "out");
                Intrinsics.checkNotNullParameter(photos, "photos");
                Object[] array = photos.toArray(new SharePhoto[0]);
                if (array != null) {
                    out.writeParcelableArray((SharePhoto[]) array, i);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }

        @Nullable
        public final Bitmap getBitmap$facebook_common_release() {
            return this.bitmap;
        }

        @Nullable
        public final String getCaption$facebook_common_release() {
            return this.caption;
        }

        @Nullable
        public final Uri getImageUrl$facebook_common_release() {
            return this.imageUrl;
        }

        public final boolean getUserGenerated$facebook_common_release() {
            return this.userGenerated;
        }

        @NotNull
        public final Builder readFrom$facebook_common_release(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader()));
        }

        @NotNull
        public final Builder setBitmap(@Nullable Bitmap bitmap) {
            this.bitmap = bitmap;
            return this;
        }

        @NotNull
        public final Builder setCaption(@Nullable String str) {
            this.caption = str;
            return this;
        }

        @NotNull
        public final Builder setImageUrl(@Nullable Uri uri) {
            this.imageUrl = uri;
            return this;
        }

        @NotNull
        public final Builder setUserGenerated(boolean z) {
            this.userGenerated = z;
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public SharePhoto build() {
            return new SharePhoto(this, null);
        }

        @Override // com.facebook.share.model.ShareMedia.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable SharePhoto sharePhoto) {
            return sharePhoto == null ? this : ((Builder) super.readFrom((Builder) sharePhoto)).setBitmap(sharePhoto.getBitmap()).setImageUrl(sharePhoto.getImageUrl()).setUserGenerated(sharePhoto.getUserGenerated()).setCaption(sharePhoto.getCaption());
        }
    }

    /* compiled from: SharePhoto.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ SharePhoto(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Nullable
    public final String getCaption() {
        return this.caption;
    }

    @Nullable
    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.facebook.share.model.ShareMedia
    @NotNull
    public ShareMedia.Type getMediaType() {
        return this.mediaType;
    }

    public final boolean getUserGenerated() {
        return this.userGenerated;
    }

    @Override // com.facebook.share.model.ShareMedia, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.bitmap, 0);
        out.writeParcelable(this.imageUrl, 0);
        out.writeByte(this.userGenerated ? (byte) 1 : (byte) 0);
        out.writeString(this.caption);
    }

    private SharePhoto(Builder builder) {
        super(builder);
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = builder.getBitmap$facebook_common_release();
        this.imageUrl = builder.getImageUrl$facebook_common_release();
        this.userGenerated = builder.getUserGenerated$facebook_common_release();
        this.caption = builder.getCaption$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharePhoto(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.mediaType = ShareMedia.Type.PHOTO;
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
        this.imageUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.userGenerated = parcel.readByte() != 0;
        this.caption = parcel.readString();
    }
}
