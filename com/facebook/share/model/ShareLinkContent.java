package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareContent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareLinkContent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareLinkContent extends ShareContent<ShareLinkContent, Builder> {
    @Nullable
    private final String quote;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareLinkContent> CREATOR = new Parcelable.Creator<ShareLinkContent>() { // from class: com.facebook.share.model.ShareLinkContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareLinkContent createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new ShareLinkContent(source);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareLinkContent[] newArray(int i) {
            return new ShareLinkContent[i];
        }
    };

    /* compiled from: ShareLinkContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareContent.Builder<ShareLinkContent, Builder> {
        @Nullable
        private String quote;

        @Nullable
        public final String getQuote$facebook_common_release() {
            return this.quote;
        }

        @NotNull
        public final Builder setQuote(@Nullable String str) {
            this.quote = str;
            return this;
        }

        public final void setQuote$facebook_common_release(@Nullable String str) {
            this.quote = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareLinkContent build() {
            return new ShareLinkContent(this, null);
        }

        @Override // com.facebook.share.model.ShareContent.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareLinkContent shareLinkContent) {
            return shareLinkContent == null ? this : ((Builder) super.readFrom((Builder) shareLinkContent)).setQuote(shareLinkContent.getQuote());
        }
    }

    /* compiled from: ShareLinkContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ ShareLinkContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getQuote() {
        return this.quote;
    }

    @Override // com.facebook.share.model.ShareContent, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        super.writeToParcel(out, i);
        out.writeString(this.quote);
    }

    private ShareLinkContent(Builder builder) {
        super(builder);
        this.quote = builder.getQuote$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareLinkContent(@NotNull Parcel source) {
        super(source);
        Intrinsics.checkNotNullParameter(source, "source");
        this.quote = source.readString();
    }
}
