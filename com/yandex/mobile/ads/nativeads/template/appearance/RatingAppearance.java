package com.yandex.mobile.ads.nativeads.template.appearance;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.w61;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class RatingAppearance implements Parcelable, w61 {
    @NotNull
    public static final Parcelable.Creator<RatingAppearance> CREATOR = new C32046a();

    /* renamed from: b */
    private final int f89309b;

    /* renamed from: c */
    private final int f89310c;

    @Metadata
    /* loaded from: classes8.dex */
    public static final class Builder {

        /* renamed from: a */
        private int f89311a;

        /* renamed from: b */
        private int f89312b;

        @NotNull
        public final RatingAppearance build() {
            return new RatingAppearance(this.f89311a, this.f89312b, null);
        }

        @NotNull
        public final Builder setBackgroundStarColor(int i) {
            this.f89311a = i;
            return this;
        }

        @NotNull
        public final Builder setProgressStarColor(int i) {
            this.f89312b = i;
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance$a */
    /* loaded from: classes8.dex */
    public static final class C32046a implements Parcelable.Creator<RatingAppearance> {
        @Override // android.os.Parcelable.Creator
        public final RatingAppearance createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RatingAppearance(parcel.readInt(), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        public final RatingAppearance[] newArray(int i) {
            return new RatingAppearance[i];
        }
    }

    public /* synthetic */ RatingAppearance(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.m17075f(RatingAppearance.class, cls)) {
            return false;
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type com.yandex.mobile.ads.nativeads.template.appearance.RatingAppearance");
        RatingAppearance ratingAppearance = (RatingAppearance) obj;
        if (getBackgroundStarColor() == ratingAppearance.getBackgroundStarColor() && getProgressStarColor() == ratingAppearance.getProgressStarColor()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.w61
    public int getBackgroundStarColor() {
        return this.f89309b;
    }

    @Override // com.yandex.mobile.ads.impl.w61
    public int getProgressStarColor() {
        return this.f89310c;
    }

    public int hashCode() {
        return getProgressStarColor() + (getBackgroundStarColor() * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.f89309b);
        out.writeInt(this.f89310c);
    }

    private RatingAppearance(int i, int i2) {
        this.f89309b = i;
        this.f89310c = i2;
    }
}
