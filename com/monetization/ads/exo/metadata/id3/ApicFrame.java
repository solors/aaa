package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.mt0;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new C25532a();

    /* renamed from: c */
    public final String f66260c;
    @Nullable

    /* renamed from: d */
    public final String f66261d;

    /* renamed from: e */
    public final int f66262e;

    /* renamed from: f */
    public final byte[] f66263f;

    /* renamed from: com.monetization.ads.exo.metadata.id3.ApicFrame$a */
    /* loaded from: classes7.dex */
    final class C25532a implements Parcelable.Creator<ApicFrame> {
        C25532a() {
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    }

    public ApicFrame(String str, @Nullable String str2, int i, byte[] bArr) {
        super("APIC");
        this.f66260c = str;
        this.f66261d = str2;
        this.f66262e = i;
        this.f66263f = bArr;
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    /* renamed from: a */
    public final void mo44375a(mt0.C30881a c30881a) {
        c30881a.m31827a(this.f66262e, this.f66263f);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.f66262e == apicFrame.f66262e && y32.m27076a(this.f66260c, apicFrame.f66260c) && y32.m27076a(this.f66261d, apicFrame.f66261d) && Arrays.equals(this.f66263f, apicFrame.f66263f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f66262e + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f66260c;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f66261d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.f66263f) + ((i4 + i3) * 31);
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": mimeType=" + this.f66260c + ", description=" + this.f66261d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66260c);
        parcel.writeString(this.f66261d);
        parcel.writeInt(this.f66262e);
        parcel.writeByteArray(this.f66263f);
    }

    ApicFrame(Parcel parcel) {
        super("APIC");
        this.f66260c = (String) y32.m27077a(parcel.readString());
        this.f66261d = parcel.readString();
        this.f66262e = parcel.readInt();
        this.f66263f = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
