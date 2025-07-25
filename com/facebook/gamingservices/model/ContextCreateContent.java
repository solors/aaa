package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContextCreateContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ContextCreateContent implements ShareModel {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @Nullable
    private final String suggestedPlayerID;

    /* compiled from: ContextCreateContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Builder implements ShareModelBuilder<ContextCreateContent, Builder> {
        @Nullable
        private String suggestedPlayerID;

        @Nullable
        public final String getSuggestedPlayerID$facebook_gamingservices_release() {
            return this.suggestedPlayerID;
        }

        @NotNull
        public final Builder setSuggestedPlayerID(@Nullable String str) {
            this.suggestedPlayerID = str;
            return this;
        }

        public final void setSuggestedPlayerID$facebook_gamingservices_release(@Nullable String str) {
            this.suggestedPlayerID = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ContextCreateContent build() {
            return new ContextCreateContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ContextCreateContent contextCreateContent) {
            Builder suggestedPlayerID;
            return (contextCreateContent == null || (suggestedPlayerID = setSuggestedPlayerID(contextCreateContent.getSuggestedPlayerID())) == null) ? this : suggestedPlayerID;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((ContextCreateContent) parcel.readParcelable(ContextCreateContent.class.getClassLoader()));
        }
    }

    /* compiled from: ContextCreateContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<ContextCreateContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextCreateContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContextCreateContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextCreateContent[] newArray(int i) {
            return new ContextCreateContent[i];
        }
    }

    public /* synthetic */ ContextCreateContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getSuggestedPlayerID() {
        return this.suggestedPlayerID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.suggestedPlayerID);
    }

    private ContextCreateContent(Builder builder) {
        this.suggestedPlayerID = builder.getSuggestedPlayerID$facebook_gamingservices_release();
    }

    public ContextCreateContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.suggestedPlayerID = parcel.readString();
    }
}
