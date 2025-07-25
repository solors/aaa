package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareContent.Builder;
import com.facebook.share.model.ShareHashtag;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareContent.kt */
@Metadata
/* loaded from: classes4.dex */
public abstract class ShareContent<M extends ShareContent<M, B>, B extends Builder<M, B>> implements ShareModel {
    @Nullable
    private final Uri contentUrl;
    @Nullable
    private final String pageId;
    @Nullable
    private final List<String> peopleIds;
    @Nullable
    private final String placeId;
    @Nullable
    private final String ref;
    @Nullable
    private final ShareHashtag shareHashtag;

    /* compiled from: ShareContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static abstract class Builder<M extends ShareContent<M, B>, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        @Nullable
        private Uri contentUrl;
        @Nullable
        private ShareHashtag hashtag;
        @Nullable
        private String pageId;
        @Nullable
        private List<String> peopleIds;
        @Nullable
        private String placeId;
        @Nullable
        private String ref;

        @Nullable
        public final Uri getContentUrl$facebook_common_release() {
            return this.contentUrl;
        }

        @Nullable
        public final ShareHashtag getHashtag$facebook_common_release() {
            return this.hashtag;
        }

        @Nullable
        public final String getPageId$facebook_common_release() {
            return this.pageId;
        }

        @Nullable
        public final List<String> getPeopleIds$facebook_common_release() {
            return this.peopleIds;
        }

        @Nullable
        public final String getPlaceId$facebook_common_release() {
            return this.placeId;
        }

        @Nullable
        public final String getRef$facebook_common_release() {
            return this.ref;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.share.model.ShareModelBuilder
        public /* bridge */ /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return readFrom((Builder<M, B>) ((ShareContent) shareModel));
        }

        @NotNull
        public final B setContentUrl(@Nullable Uri uri) {
            this.contentUrl = uri;
            return this;
        }

        public final void setContentUrl$facebook_common_release(@Nullable Uri uri) {
            this.contentUrl = uri;
        }

        public final void setHashtag$facebook_common_release(@Nullable ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
        }

        @NotNull
        public final B setPageId(@Nullable String str) {
            this.pageId = str;
            return this;
        }

        public final void setPageId$facebook_common_release(@Nullable String str) {
            this.pageId = str;
        }

        @NotNull
        public final B setPeopleIds(@Nullable List<String> list) {
            List<String> unmodifiableList;
            if (list == null) {
                unmodifiableList = null;
            } else {
                unmodifiableList = Collections.unmodifiableList(list);
            }
            this.peopleIds = unmodifiableList;
            return this;
        }

        public final void setPeopleIds$facebook_common_release(@Nullable List<String> list) {
            this.peopleIds = list;
        }

        @NotNull
        public final B setPlaceId(@Nullable String str) {
            this.placeId = str;
            return this;
        }

        public final void setPlaceId$facebook_common_release(@Nullable String str) {
            this.placeId = str;
        }

        @NotNull
        public final B setRef(@Nullable String str) {
            this.ref = str;
            return this;
        }

        public final void setRef$facebook_common_release(@Nullable String str) {
            this.ref = str;
        }

        @NotNull
        public final B setShareHashtag(@Nullable ShareHashtag shareHashtag) {
            this.hashtag = shareHashtag;
            return this;
        }

        @NotNull
        public B readFrom(@Nullable M m) {
            return m == null ? this : (B) setContentUrl(m.getContentUrl()).setPeopleIds(m.getPeopleIds()).setPlaceId(m.getPlaceId()).setPageId(m.getPageId()).setRef(m.getRef()).setShareHashtag(m.getShareHashtag());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareContent(@NotNull Builder<M, B> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.contentUrl = builder.getContentUrl$facebook_common_release();
        this.peopleIds = builder.getPeopleIds$facebook_common_release();
        this.placeId = builder.getPlaceId$facebook_common_release();
        this.pageId = builder.getPageId$facebook_common_release();
        this.ref = builder.getRef$facebook_common_release();
        this.shareHashtag = builder.getHashtag$facebook_common_release();
    }

    private final List<String> readUnmodifiableStringList(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Uri getContentUrl() {
        return this.contentUrl;
    }

    @Nullable
    public final String getPageId() {
        return this.pageId;
    }

    @Nullable
    public final List<String> getPeopleIds() {
        return this.peopleIds;
    }

    @Nullable
    public final String getPlaceId() {
        return this.placeId;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    @Nullable
    public final ShareHashtag getShareHashtag() {
        return this.shareHashtag;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeParcelable(this.contentUrl, 0);
        out.writeStringList(this.peopleIds);
        out.writeString(this.placeId);
        out.writeString(this.pageId);
        out.writeString(this.ref);
        out.writeParcelable(this.shareHashtag, 0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contentUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.peopleIds = readUnmodifiableStringList(parcel);
        this.placeId = parcel.readString();
        this.pageId = parcel.readString();
        this.ref = parcel.readString();
        this.shareHashtag = new ShareHashtag.Builder().readFrom$facebook_common_release(parcel).build();
    }
}
