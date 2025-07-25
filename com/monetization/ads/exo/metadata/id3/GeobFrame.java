package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new C25537a();

    /* renamed from: c */
    public final String f66279c;

    /* renamed from: d */
    public final String f66280d;

    /* renamed from: e */
    public final String f66281e;

    /* renamed from: f */
    public final byte[] f66282f;

    /* renamed from: com.monetization.ads.exo.metadata.id3.GeobFrame$a */
    /* loaded from: classes7.dex */
    final class C25537a implements Parcelable.Creator<GeobFrame> {
        C25537a() {
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final GeobFrame[] newArray(int i) {
            return new GeobFrame[i];
        }
    }

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f66279c = str;
        this.f66280d = str2;
        this.f66281e = str3;
        this.f66282f = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (y32.m27076a(this.f66279c, geobFrame.f66279c) && y32.m27076a(this.f66280d, geobFrame.f66280d) && y32.m27076a(this.f66281e, geobFrame.f66281e) && Arrays.equals(this.f66282f, geobFrame.f66282f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f66279c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f66280d;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f66281e;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.f66282f) + ((i5 + i3) * 31);
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": mimeType=" + this.f66279c + ", filename=" + this.f66280d + ", description=" + this.f66281e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66279c);
        parcel.writeString(this.f66280d);
        parcel.writeString(this.f66281e);
        parcel.writeByteArray(this.f66282f);
    }

    GeobFrame(Parcel parcel) {
        super("GEOB");
        this.f66279c = (String) y32.m27077a(parcel.readString());
        this.f66280d = (String) y32.m27077a(parcel.readString());
        this.f66281e = (String) y32.m27077a(parcel.readString());
        this.f66282f = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
