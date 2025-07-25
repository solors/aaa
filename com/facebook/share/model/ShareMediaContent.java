package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.ShareVideo;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMediaContent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareMediaContent extends ShareContent<ShareMediaContent, Builder> {
    @NotNull
    private final List<ShareMedia<?, ?>> media;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareMediaContent> CREATOR = new Parcelable.Creator<ShareMediaContent>() { // from class: com.facebook.share.model.ShareMediaContent$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareMediaContent createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareMediaContent(source);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareMediaContent[] newArray(int i) {
            return new ShareMediaContent[i];
        }
    };

    /* compiled from: ShareMediaContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareContent.Builder<ShareMediaContent, Builder> {
        @NotNull
        private final List<ShareMedia<?, ?>> media = new ArrayList();

        @NotNull
        public final Builder addMedia(@Nullable List<? extends ShareMedia<?, ?>> list) {
            if (list != null) {
                for (ShareMedia<?, ?> shareMedia : list) {
                    addMedium(shareMedia);
                }
            }
            return this;
        }

        @NotNull
        public final Builder addMedium(@Nullable ShareMedia<?, ?> shareMedia) {
            ShareMedia<?, ?> build;
            if (shareMedia != null) {
                if (shareMedia instanceof SharePhoto) {
                    build = new SharePhoto.Builder().readFrom((SharePhoto) shareMedia).build();
                } else if (shareMedia instanceof ShareVideo) {
                    build = new ShareVideo.Builder().readFrom((ShareVideo) shareMedia).build();
                } else {
                    throw new IllegalArgumentException("medium must be either a SharePhoto or ShareVideo");
                }
                this.media.add(build);
            }
            return this;
        }

        @NotNull
        public final List<ShareMedia<?, ?>> getMedia$facebook_common_release() {
            return this.media;
        }

        @NotNull
        public final Builder setMedia(@Nullable List<? extends ShareMedia<?, ?>> list) {
            this.media.clear();
            addMedia(list);
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareMediaContent build() {
            return new ShareMediaContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareMediaContent shareMediaContent) {
            return shareMediaContent == null ? this : ((Builder) super.readFrom((Builder) shareMediaContent)).addMedia(shareMediaContent.getMedia());
        }
    }

    /* compiled from: ShareMediaContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShareMediaContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @NotNull
    public final List<ShareMedia<?, ?>> getMedia() {
        return this.media;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        Object[] array = this.media.toArray(new ShareMedia[0]);
        if (array != null) {
            out.writeParcelableArray((Parcelable[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    private ShareMediaContent(Builder builder) {
        super(builder);
        List<ShareMedia<?, ?>> m17553Z0;
        m17553Z0 = _Collections.m17553Z0(builder.getMedia$facebook_common_release());
        this.media = m17553Z0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ShareMediaContent(@NotNull Parcel source) {
        super(source);
        List list;
        Intrinsics.checkNotNullParameter(source, "source");
        Parcelable[] readParcelableArray = source.readParcelableArray(ShareMedia.class.getClassLoader());
        if (readParcelableArray == null) {
            list = null;
        } else {
            List arrayList = new ArrayList();
            for (Parcelable parcelable : readParcelableArray) {
                ShareMedia shareMedia = (ShareMedia) parcelable;
                if (shareMedia != null) {
                    arrayList.add(shareMedia);
                }
            }
            list = arrayList;
        }
        this.media = list == null ? C37563v.m17166m() : list;
    }
}
