package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareMessengerActionButton;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMessengerURLActionButton.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ShareMessengerURLActionButton extends ShareMessengerActionButton {
    @Nullable
    private final Uri fallbackUrl;
    private final boolean isMessengerExtensionURL;
    private final boolean shouldHideWebviewShareButton;
    @Nullable
    private final Uri url;
    @Nullable
    private final WebviewHeightRatio webviewHeightRatio;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<ShareMessengerURLActionButton> CREATOR = new Parcelable.Creator<ShareMessengerURLActionButton>() { // from class: com.facebook.share.model.ShareMessengerURLActionButton$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareMessengerURLActionButton createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ShareMessengerURLActionButton(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ShareMessengerURLActionButton[] newArray(int i) {
            return new ShareMessengerURLActionButton[i];
        }
    };

    /* compiled from: ShareMessengerURLActionButton.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder extends ShareMessengerActionButton.Builder<ShareMessengerURLActionButton, Builder> {
        @Nullable
        private Uri fallbackUrl;
        private boolean isMessengerExtensionURL;
        private boolean shouldHideWebviewShareButton;
        @Nullable
        private Uri url;
        @Nullable
        private WebviewHeightRatio webviewHeightRatio;

        @Nullable
        public final Uri getFallbackUrl$facebook_common_release() {
            return this.fallbackUrl;
        }

        public final boolean getShouldHideWebviewShareButton$facebook_common_release() {
            return this.shouldHideWebviewShareButton;
        }

        @Nullable
        public final Uri getUrl$facebook_common_release() {
            return this.url;
        }

        @Nullable
        public final WebviewHeightRatio getWebviewHeightRatio$facebook_common_release() {
            return this.webviewHeightRatio;
        }

        public final boolean isMessengerExtensionURL$facebook_common_release() {
            return this.isMessengerExtensionURL;
        }

        @NotNull
        public final Builder setFallbackUrl(@Nullable Uri uri) {
            this.fallbackUrl = uri;
            return this;
        }

        public final void setFallbackUrl$facebook_common_release(@Nullable Uri uri) {
            this.fallbackUrl = uri;
        }

        @NotNull
        public final Builder setIsMessengerExtensionURL(boolean z) {
            this.isMessengerExtensionURL = z;
            return this;
        }

        public final void setMessengerExtensionURL$facebook_common_release(boolean z) {
            this.isMessengerExtensionURL = z;
        }

        @NotNull
        public final Builder setShouldHideWebviewShareButton(boolean z) {
            this.shouldHideWebviewShareButton = z;
            return this;
        }

        public final void setShouldHideWebviewShareButton$facebook_common_release(boolean z) {
            this.shouldHideWebviewShareButton = z;
        }

        @NotNull
        public final Builder setUrl(@Nullable Uri uri) {
            this.url = uri;
            return this;
        }

        public final void setUrl$facebook_common_release(@Nullable Uri uri) {
            this.url = uri;
        }

        @NotNull
        public final Builder setWebviewHeightRatio(@Nullable WebviewHeightRatio webviewHeightRatio) {
            this.webviewHeightRatio = webviewHeightRatio;
            return this;
        }

        public final void setWebviewHeightRatio$facebook_common_release(@Nullable WebviewHeightRatio webviewHeightRatio) {
            this.webviewHeightRatio = webviewHeightRatio;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ShareMessengerURLActionButton build() {
            return new ShareMessengerURLActionButton(this, null);
        }

        @Override // com.facebook.share.model.ShareMessengerActionButton.Builder, com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ShareMessengerURLActionButton shareMessengerURLActionButton) {
            return shareMessengerURLActionButton == null ? this : setUrl(shareMessengerURLActionButton.getUrl()).setIsMessengerExtensionURL(shareMessengerURLActionButton.isMessengerExtensionURL()).setFallbackUrl(shareMessengerURLActionButton.getFallbackUrl()).setWebviewHeightRatio(shareMessengerURLActionButton.getWebviewHeightRatio()).setShouldHideWebviewShareButton(shareMessengerURLActionButton.getShouldHideWebviewShareButton());
        }
    }

    /* compiled from: ShareMessengerURLActionButton.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ShareMessengerURLActionButton.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum WebviewHeightRatio {
        WebviewHeightRatioFull,
        WebviewHeightRatioTall,
        WebviewHeightRatioCompact;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static WebviewHeightRatio[] valuesCustom() {
            WebviewHeightRatio[] valuesCustom = values();
            return (WebviewHeightRatio[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public /* synthetic */ ShareMessengerURLActionButton(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Nullable
    public final Uri getFallbackUrl() {
        return this.fallbackUrl;
    }

    public final boolean getIsMessengerExtensionURL() {
        return this.isMessengerExtensionURL;
    }

    public final boolean getShouldHideWebviewShareButton() {
        return this.shouldHideWebviewShareButton;
    }

    @Nullable
    public final Uri getUrl() {
        return this.url;
    }

    @Nullable
    public final WebviewHeightRatio getWebviewHeightRatio() {
        return this.webviewHeightRatio;
    }

    public final boolean isMessengerExtensionURL() {
        return this.isMessengerExtensionURL;
    }

    @Override // com.facebook.share.model.ShareMessengerActionButton, android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        super.writeToParcel(dest, i);
        dest.writeParcelable(this.url, 0);
        dest.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
        dest.writeParcelable(this.fallbackUrl, 0);
        dest.writeSerializable(this.webviewHeightRatio);
        dest.writeByte(this.isMessengerExtensionURL ? (byte) 1 : (byte) 0);
    }

    private ShareMessengerURLActionButton(Builder builder) {
        super(builder);
        this.url = builder.getUrl$facebook_common_release();
        this.isMessengerExtensionURL = builder.isMessengerExtensionURL$facebook_common_release();
        this.fallbackUrl = builder.getFallbackUrl$facebook_common_release();
        this.webviewHeightRatio = builder.getWebviewHeightRatio$facebook_common_release();
        this.shouldHideWebviewShareButton = builder.getShouldHideWebviewShareButton$facebook_common_release();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareMessengerURLActionButton(@NotNull Parcel parcel) {
        super(parcel);
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.url = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.isMessengerExtensionURL = parcel.readByte() != 0;
        this.fallbackUrl = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.webviewHeightRatio = (WebviewHeightRatio) parcel.readSerializable();
        this.shouldHideWebviewShareButton = parcel.readByte() != 0;
    }
}
