package com.monetization.ads.exo.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.mt0;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new C25531a();

    /* renamed from: b */
    public final byte[] f66257b;
    @Nullable

    /* renamed from: c */
    public final String f66258c;
    @Nullable

    /* renamed from: d */
    public final String f66259d;

    /* renamed from: com.monetization.ads.exo.metadata.icy.IcyInfo$a */
    /* loaded from: classes7.dex */
    final class C25531a implements Parcelable.Creator<IcyInfo> {
        C25531a() {
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo createFromParcel(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final IcyInfo[] newArray(int i) {
            return new IcyInfo[i];
        }
    }

    public IcyInfo(byte[] bArr, @Nullable String str, @Nullable String str2) {
        this.f66257b = bArr;
        this.f66258c = str;
        this.f66259d = str2;
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo44375a(mt0.C30881a c30881a) {
        String str = this.f66258c;
        if (str != null) {
            c30881a.m31792i(str);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && IcyInfo.class == obj.getClass()) {
            return Arrays.equals(this.f66257b, ((IcyInfo) obj).f66257b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66257b);
    }

    public final String toString() {
        String str = this.f66258c;
        String str2 = this.f66259d;
        int length = this.f66257b.length;
        return "ICY: title=\"" + str + "\", url=\"" + str2 + "\", rawMetadata.length=\"" + length + "\"";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.f66257b);
        parcel.writeString(this.f66258c);
        parcel.writeString(this.f66259d);
    }

    IcyInfo(Parcel parcel) {
        this.f66257b = (byte[]) C30937nf.m31570a(parcel.createByteArray());
        this.f66258c = parcel.readString();
        this.f66259d = parcel.readString();
    }
}
