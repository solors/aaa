package com.monetization.ads.base.tracker.interaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class FalseClick implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<FalseClick> CREATOR = new C25456a();
    @NotNull

    /* renamed from: b */
    private final String f66075b;

    /* renamed from: c */
    private final long f66076c;

    /* renamed from: com.monetization.ads.base.tracker.interaction.model.FalseClick$a */
    /* loaded from: classes7.dex */
    public static final class C25456a implements Parcelable.Creator<FalseClick> {
        @Override // android.os.Parcelable.Creator
        public final FalseClick createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FalseClick(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final FalseClick[] newArray(int i) {
            return new FalseClick[i];
        }
    }

    public FalseClick(@NotNull String url, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f66075b = url;
        this.f66076c = j;
    }

    /* renamed from: c */
    public final long m44529c() {
        return this.f66076c;
    }

    @NotNull
    /* renamed from: d */
    public final String m44528d() {
        return this.f66075b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FalseClick)) {
            return false;
        }
        FalseClick falseClick = (FalseClick) obj;
        if (Intrinsics.m17075f(this.f66075b, falseClick.f66075b) && this.f66076c == falseClick.f66076c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f66076c) + (this.f66075b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f66075b;
        long j = this.f66076c;
        return "FalseClick(url=" + str + ", interval=" + j + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66075b);
        out.writeLong(this.f66076c);
    }
}
