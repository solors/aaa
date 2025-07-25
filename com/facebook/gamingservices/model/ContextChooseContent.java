package com.facebook.gamingservices.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ContextChooseContent.kt */
@Metadata
/* loaded from: classes3.dex */
public final class ContextChooseContent implements ShareModel {
    @NotNull
    public static final CREATOR CREATOR = new CREATOR(null);
    @Nullable
    private final List<String> filters;
    @Nullable
    private final Integer maxSize;
    @Nullable
    private final Integer minSize;

    /* compiled from: ContextChooseContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Builder implements ShareModelBuilder<ContextChooseContent, Builder> {
        @Nullable
        private List<String> filters;
        @Nullable
        private Integer maxSize;
        @Nullable
        private Integer minSize;

        @Nullable
        public final List<String> getFilters$facebook_gamingservices_release() {
            return this.filters;
        }

        @Nullable
        public final Integer getMaxSize$facebook_gamingservices_release() {
            return this.maxSize;
        }

        @Nullable
        public final Integer getMinSize$facebook_gamingservices_release() {
            return this.minSize;
        }

        @NotNull
        public final Builder setFilters(@Nullable List<String> list) {
            this.filters = list;
            return this;
        }

        public final void setFilters$facebook_gamingservices_release(@Nullable List<String> list) {
            this.filters = list;
        }

        @NotNull
        public final Builder setMaxSize(@Nullable Integer num) {
            this.maxSize = num;
            return this;
        }

        public final void setMaxSize$facebook_gamingservices_release(@Nullable Integer num) {
            this.maxSize = num;
        }

        @NotNull
        public final Builder setMinSize(@Nullable Integer num) {
            this.minSize = num;
            return this;
        }

        public final void setMinSize$facebook_gamingservices_release(@Nullable Integer num) {
            this.minSize = num;
        }

        @Override // com.facebook.share.ShareBuilder
        @NotNull
        public ContextChooseContent build() {
            return new ContextChooseContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        @NotNull
        public Builder readFrom(@Nullable ContextChooseContent contextChooseContent) {
            Builder minSize;
            return (contextChooseContent == null || (minSize = setFilters(contextChooseContent.getFilters()).setMaxSize(contextChooseContent.getMaxSize()).setMinSize(contextChooseContent.getMinSize())) == null) ? this : minSize;
        }

        @NotNull
        public final Builder readFrom(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return readFrom((ContextChooseContent) parcel.readParcelable(ContextChooseContent.class.getClassLoader()));
        }
    }

    /* compiled from: ContextChooseContent.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class CREATOR implements Parcelable.Creator<ContextChooseContent> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextChooseContent createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ContextChooseContent(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ContextChooseContent[] newArray(int i) {
            return new ContextChooseContent[i];
        }
    }

    public /* synthetic */ ContextChooseContent(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final List<String> getFilters() {
        List<String> list = this.filters;
        if (list == null) {
            return null;
        }
        return Collections.unmodifiableList(list);
    }

    @Nullable
    public final Integer getMaxSize() {
        return this.maxSize;
    }

    @Nullable
    public final Integer getMinSize() {
        return this.minSize;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        int intValue;
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeStringList(this.filters);
        Integer num = this.maxSize;
        int i2 = 0;
        if (num == null) {
            intValue = 0;
        } else {
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        Integer num2 = this.minSize;
        if (num2 != null) {
            i2 = num2.intValue();
        }
        out.writeInt(i2);
    }

    private ContextChooseContent(Builder builder) {
        this.filters = builder.getFilters$facebook_gamingservices_release();
        this.maxSize = builder.getMaxSize$facebook_gamingservices_release();
        this.minSize = builder.getMinSize$facebook_gamingservices_release();
    }

    public ContextChooseContent(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.filters = parcel.createStringArrayList();
        this.maxSize = Integer.valueOf(parcel.readInt());
        this.minSize = Integer.valueOf(parcel.readInt());
    }
}
