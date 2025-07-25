package com.monetization.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new C25543a();

    /* renamed from: b */
    public final String f66298b;

    /* renamed from: c */
    public final byte[] f66299c;

    /* renamed from: d */
    public final int f66300d;

    /* renamed from: e */
    public final int f66301e;

    /* renamed from: com.monetization.ads.exo.metadata.mp4.MdtaMetadataEntry$a */
    /* loaded from: classes7.dex */
    final class C25543a implements Parcelable.Creator<MdtaMetadataEntry> {
        C25543a() {
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return new MdtaMetadataEntry(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final MdtaMetadataEntry[] newArray(int i) {
            return new MdtaMetadataEntry[i];
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
        if (obj == null || MdtaMetadataEntry.class != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        if (this.f66298b.equals(mdtaMetadataEntry.f66298b) && Arrays.equals(this.f66299c, mdtaMetadataEntry.f66299c) && this.f66300d == mdtaMetadataEntry.f66300d && this.f66301e == mdtaMetadataEntry.f66301e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.f66299c) + C31014o3.m31189a(this.f66298b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31)) * 31) + this.f66300d) * 31) + this.f66301e;
    }

    public final String toString() {
        return "mdta: key=" + this.f66298b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66298b);
        parcel.writeByteArray(this.f66299c);
        parcel.writeInt(this.f66300d);
        parcel.writeInt(this.f66301e);
    }

    public MdtaMetadataEntry(int i, int i2, String str, byte[] bArr) {
        this.f66298b = str;
        this.f66299c = bArr;
        this.f66300d = i;
        this.f66301e = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.f66298b = (String) y32.m27077a(parcel.readString());
        this.f66299c = (byte[]) y32.m27077a(parcel.createByteArray());
        this.f66300d = parcel.readInt();
        this.f66301e = parcel.readInt();
    }
}
