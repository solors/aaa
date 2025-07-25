package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppGroupCreationContent.kt */
@Metadata
/* loaded from: classes4.dex */
public final class AppGroupCreationContent implements ShareModel {
    @Nullable
    private final AppGroupPrivacy appGroupPrivacy;
    @Nullable
    private final String description;
    @Nullable
    private final String name;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new Parcelable.Creator<AppGroupCreationContent>() { // from class: com.facebook.share.model.AppGroupCreationContent$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @Nullable
        public AppGroupCreationContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public AppGroupCreationContent[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    };

    /* compiled from: AppGroupCreationContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum AppGroupPrivacy {
        Open,
        Closed;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AppGroupPrivacy[] valuesCustom() {
            AppGroupPrivacy[] valuesCustom = values();
            return (AppGroupPrivacy[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    /* compiled from: AppGroupCreationContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Builder implements ShareModelBuilder<AppGroupCreationContent, Builder> {
        @Nullable
        private AppGroupPrivacy appGroupPrivacy;
        @Nullable
        private String description;
        @Nullable
        private String name;

        @Nullable
        public final AppGroupPrivacy getAppGroupPrivacy$facebook_common_release() {
            return this.appGroupPrivacy;
        }

        @Nullable
        public final String getDescription$facebook_common_release() {
            return this.description;
        }

        @Nullable
        public final String getName$facebook_common_release() {
            return this.name;
        }

        @NotNull
        public final Builder setAppGroupPrivacy(@Nullable AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
            return this;
        }

        public final void setAppGroupPrivacy$facebook_common_release(@Nullable AppGroupPrivacy appGroupPrivacy) {
            this.appGroupPrivacy = appGroupPrivacy;
        }

        @NotNull
        public final Builder setDescription(@Nullable String str) {
            this.description = str;
            return this;
        }

        public final void setDescription$facebook_common_release(@Nullable String str) {
            this.description = str;
        }

        @NotNull
        public final Builder setName(@Nullable String str) {
            this.name = str;
            return this;
        }

        public final void setName$facebook_common_release(@Nullable String str) {
            this.name = str;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public AppGroupCreationContent build() {
            return new AppGroupCreationContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable AppGroupCreationContent appGroupCreationContent) {
            return appGroupCreationContent == null ? this : setName(appGroupCreationContent.getName()).setDescription(appGroupCreationContent.getDescription()).setAppGroupPrivacy(appGroupCreationContent.getAppGroupPrivacy());
        }
    }

    /* compiled from: AppGroupCreationContent.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AppGroupCreationContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final AppGroupPrivacy getAppGroupPrivacy() {
        return this.appGroupPrivacy;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.description);
        out.writeSerializable(this.appGroupPrivacy);
    }

    private AppGroupCreationContent(Builder builder) {
        this.name = builder.getName$facebook_common_release();
        this.description = builder.getDescription$facebook_common_release();
        this.appGroupPrivacy = builder.getAppGroupPrivacy$facebook_common_release();
    }

    public AppGroupCreationContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.name = parcel.readString();
        this.description = parcel.readString();
        this.appGroupPrivacy = (AppGroupPrivacy) parcel.readSerializable();
    }
}
