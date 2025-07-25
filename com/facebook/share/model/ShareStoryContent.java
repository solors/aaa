package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareStoryContent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareStoryContent extends ShareContent<ShareStoryContent, Builder> {
    @Nullable
    private final String attributionLink;
    @Nullable
    private final ShareMedia<?, ?> backgroundAsset;
    @Nullable
    private final List<String> backgroundColorList;
    @Nullable
    private final SharePhoto stickerAsset;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareStoryContent> CREATOR = new Parcelable.Creator<ShareStoryContent>() { // from class: com.facebook.share.model.ShareStoryContent$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareStoryContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareStoryContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareStoryContent[] newArray(int i) {
            return new ShareStoryContent[i];
        }
    };

    /* compiled from: ShareStoryContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareContent.Builder<ShareStoryContent, Builder> {
        @Nullable
        private String attributionLink;
        @Nullable
        private ShareMedia<?, ?> backgroundAsset;
        @Nullable
        private List<String> backgroundColorList;
        @Nullable
        private SharePhoto stickerAsset;

        @Nullable
        public final String getAttributionLink$facebook_common_release() {
            return this.attributionLink;
        }

        @Nullable
        public final ShareMedia<?, ?> getBackgroundAsset$facebook_common_release() {
            return this.backgroundAsset;
        }

        @Nullable
        public final List<String> getBackgroundColorList$facebook_common_release() {
            return this.backgroundColorList;
        }

        @Nullable
        public final SharePhoto getStickerAsset$facebook_common_release() {
            return this.stickerAsset;
        }

        @NotNull
        public final Builder setAttributionLink(@Nullable String str) {
            this.attributionLink = str;
            return this;
        }

        public final void setAttributionLink$facebook_common_release(@Nullable String str) {
            this.attributionLink = str;
        }

        @NotNull
        public final Builder setBackgroundAsset(@Nullable ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
            return this;
        }

        public final void setBackgroundAsset$facebook_common_release(@Nullable ShareMedia<?, ?> shareMedia) {
            this.backgroundAsset = shareMedia;
        }

        @NotNull
        public final Builder setBackgroundColorList(@Nullable List<String> list) {
            List<String> m17553Z0;
            if (list != null) {
                m17553Z0 = _Collections.m17553Z0(list);
            } else {
                m17553Z0 = null;
            }
            this.backgroundColorList = m17553Z0;
            return this;
        }

        public final void setBackgroundColorList$facebook_common_release(@Nullable List<String> list) {
            this.backgroundColorList = list;
        }

        @NotNull
        public final Builder setStickerAsset(@Nullable SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
            return this;
        }

        public final void setStickerAsset$facebook_common_release(@Nullable SharePhoto sharePhoto) {
            this.stickerAsset = sharePhoto;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareStoryContent build() {
            return new ShareStoryContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareStoryContent shareStoryContent) {
            return shareStoryContent == null ? this : ((Builder) super.readFrom((Builder) shareStoryContent)).setBackgroundAsset(shareStoryContent.getBackgroundAsset()).setStickerAsset(shareStoryContent.getStickerAsset()).setBackgroundColorList(shareStoryContent.getBackgroundColorList()).setAttributionLink(shareStoryContent.getAttributionLink());
        }
    }

    /* compiled from: ShareStoryContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShareStoryContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        List<String> m17553Z0;
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (!arrayList.isEmpty()) {
            m17553Z0 = _Collections.m17553Z0(arrayList);
            return m17553Z0;
        }
        return null;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getAttributionLink() {
        return this.attributionLink;
    }

    @Nullable
    public final ShareMedia<?, ?> getBackgroundAsset() {
        return this.backgroundAsset;
    }

    @Nullable
    public final List<String> getBackgroundColorList() {
        List<String> m17553Z0;
        List<String> list = this.backgroundColorList;
        if (list != null) {
            m17553Z0 = _Collections.m17553Z0(list);
            return m17553Z0;
        }
        return null;
    }

    @Nullable
    public final SharePhoto getStickerAsset() {
        return this.stickerAsset;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeParcelable(this.backgroundAsset, 0);
        out.writeParcelable(this.stickerAsset, 0);
        out.writeStringList(getBackgroundColorList());
        out.writeString(this.attributionLink);
    }

    private ShareStoryContent(Builder builder) {
        super(builder);
        this.backgroundAsset = builder.getBackgroundAsset$facebook_common_release();
        this.stickerAsset = builder.getStickerAsset$facebook_common_release();
        this.backgroundColorList = builder.getBackgroundColorList$facebook_common_release();
        this.attributionLink = builder.getAttributionLink$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareStoryContent(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.backgroundAsset = (ShareMedia) parcel.readParcelable(ShareMedia.class.getClassLoader());
        this.stickerAsset = (SharePhoto) parcel.readParcelable(SharePhoto.class.getClassLoader());
        this.backgroundColorList = readUnmodifiableStringList(parcel);
        this.attributionLink = parcel.readString();
    }
}
