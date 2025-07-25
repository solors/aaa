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

/* compiled from: ContextSwitchContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ContextSwitchContent implements ShareModel {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @Nullable
    private final String contextID;

    /* compiled from: ContextSwitchContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Builder implements ShareModelBuilder<ContextSwitchContent, Builder> {
        @Nullable
        private String contextID;

        @Nullable
        public final String getContextID$facebook_gamingservices_release() {
            return this.contextID;
        }

        @NotNull
        public final Builder setContextID(@Nullable String str) {
            this.contextID = str;
            return this;
        }

        public final void setContextID$facebook_gamingservices_release(@Nullable String str) {
            this.contextID = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ContextSwitchContent build() {
            return new ContextSwitchContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ContextSwitchContent contextSwitchContent) {
            Builder contextID;
            return (contextSwitchContent == null || (contextID = setContextID(contextSwitchContent.getContextID())) == null) ? this : contextID;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((ContextSwitchContent) parcel.readParcelable(ContextSwitchContent.class.getClassLoader()));
        }
    }

    /* compiled from: ContextSwitchContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<ContextSwitchContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextSwitchContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContextSwitchContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextSwitchContent[] newArray(int i) {
            return new ContextSwitchContent[i];
        }
    }

    public /* synthetic */ ContextSwitchContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final String getContextID() {
        return this.contextID;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.contextID);
    }

    private ContextSwitchContent(Builder builder) {
        this.contextID = builder.getContextID$facebook_gamingservices_release();
    }

    public ContextSwitchContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.contextID = parcel.readString();
    }
}
