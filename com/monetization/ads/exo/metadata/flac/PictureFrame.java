package com.monetization.ads.exo.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new C25528a();

    /* renamed from: b */
    public final int f66241b;

    /* renamed from: c */
    public final String f66242c;

    /* renamed from: d */
    public final String f66243d;

    /* renamed from: e */
    public final int f66244e;

    /* renamed from: f */
    public final int f66245f;

    /* renamed from: g */
    public final int f66246g;

    /* renamed from: h */
    public final int f66247h;

    /* renamed from: i */
    public final byte[] f66248i;

    /* renamed from: com.monetization.ads.exo.metadata.flac.PictureFrame$a */
    /* loaded from: classes7.dex */
    final class C25528a implements Parcelable.Creator<PictureFrame> {
        C25528a() {
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame createFromParcel(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PictureFrame[] newArray(int i) {
            return new PictureFrame[i];
        }
    }

    public PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.f66241b = i;
        this.f66242c = str;
        this.f66243d = str2;
        this.f66244e = i2;
        this.f66245f = i3;
        this.f66246g = i4;
        this.f66247h = i5;
        this.f66248i = bArr;
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo44375a(mt0.C30881a c30881a) {
        c30881a.m31827a(this.f66241b, this.f66248i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PictureFrame.class != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        if (this.f66241b == pictureFrame.f66241b && this.f66242c.equals(pictureFrame.f66242c) && this.f66243d.equals(pictureFrame.f66243d) && this.f66244e == pictureFrame.f66244e && this.f66245f == pictureFrame.f66245f && this.f66246g == pictureFrame.f66246g && this.f66247h == pictureFrame.f66247h && Arrays.equals(this.f66248i, pictureFrame.f66248i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int m31189a = C31014o3.m31189a(this.f66242c, (this.f66241b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31);
        return Arrays.hashCode(this.f66248i) + ((((((((C31014o3.m31189a(this.f66243d, m31189a, 31) + this.f66244e) * 31) + this.f66245f) * 31) + this.f66246g) * 31) + this.f66247h) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f66242c + ", description=" + this.f66243d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f66241b);
        parcel.writeString(this.f66242c);
        parcel.writeString(this.f66243d);
        parcel.writeInt(this.f66244e);
        parcel.writeInt(this.f66245f);
        parcel.writeInt(this.f66246g);
        parcel.writeInt(this.f66247h);
        parcel.writeByteArray(this.f66248i);
    }

    PictureFrame(Parcel parcel) {
        this.f66241b = parcel.readInt();
        this.f66242c = (String) y32.m27077a(parcel.readString());
        this.f66243d = (String) y32.m27077a(parcel.readString());
        this.f66244e = parcel.readInt();
        this.f66245f = parcel.readInt();
        this.f66246g = parcel.readInt();
        this.f66247h = parcel.readInt();
        this.f66248i = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
