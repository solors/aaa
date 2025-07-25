package com.facebook.share.model;

import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ShareMessengerActionButton.kt */
@Metadata
/* loaded from: classes4.dex */
public abstract class ShareMessengerActionButton implements ShareModel {
    @Nullable
    private final String title;

    /* compiled from: ShareMessengerActionButton.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static abstract class Builder<M extends ShareMessengerActionButton, B extends Builder<M, B>> implements ShareModelBuilder<M, B> {
        @Nullable
        private String title;

        @Nullable
        public final String getTitle$facebook_common_release() {
            return this.title;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.share.model.ShareModelBuilder
        public /* bridge */ /* synthetic */ ShareModelBuilder readFrom(ShareModel shareModel) {
            return readFrom((Builder<M, B>) ((ShareMessengerActionButton) shareModel));
        }

        @NotNull
        public final B setTitle(@Nullable String str) {
            this.title = str;
            return this;
        }

        public final void setTitle$facebook_common_release(@Nullable String str) {
            this.title = str;
        }

        @NotNull
        public B readFrom(@Nullable M m) {
            return m == null ? this : setTitle(m.getTitle());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ShareMessengerActionButton(@NotNull Builder<?, ?> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.title = builder.getTitle$facebook_common_release();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
    }

    public ShareMessengerActionButton(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.title = parcel.readString();
    }
}
