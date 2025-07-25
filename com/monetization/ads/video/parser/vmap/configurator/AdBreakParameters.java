package com.monetization.ads.video.parser.vmap.configurator;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class AdBreakParameters implements Parcelable {
    @NotNull
    public static final Parcelable.Creator<AdBreakParameters> CREATOR = new C25620a();
    @Nullable

    /* renamed from: b */
    private final String f66584b;
    @Nullable

    /* renamed from: c */
    private final String f66585c;
    @Nullable

    /* renamed from: d */
    private final String f66586d;

    /* renamed from: com.monetization.ads.video.parser.vmap.configurator.AdBreakParameters$a */
    /* loaded from: classes7.dex */
    public static final class C25620a implements Parcelable.Creator<AdBreakParameters> {
        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AdBreakParameters(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AdBreakParameters[] newArray(int i) {
            return new AdBreakParameters[i];
        }
    }

    public AdBreakParameters(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f66584b = str;
        this.f66585c = str2;
        this.f66586d = str3;
    }

    @Nullable
    /* renamed from: c */
    public final String m44260c() {
        return this.f66585c;
    }

    @Nullable
    /* renamed from: d */
    public final String m44259d() {
        return this.f66584b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Nullable
    /* renamed from: e */
    public final String m44258e() {
        return this.f66586d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.f66584b);
        out.writeString(this.f66585c);
        out.writeString(this.f66586d);
    }
}
