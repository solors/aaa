package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new C25540a();

    /* renamed from: c */
    public final String f66292c;

    /* renamed from: d */
    public final byte[] f66293d;

    /* renamed from: com.monetization.ads.exo.metadata.id3.PrivFrame$a */
    /* loaded from: classes7.dex */
    final class C25540a implements Parcelable.Creator<PrivFrame> {
        C25540a() {
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final PrivFrame[] newArray(int i) {
            return new PrivFrame[i];
        }
    }

    public PrivFrame(String str, byte[] bArr) {
        super("PRIV");
        this.f66292c = str;
        this.f66293d = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (y32.m27076a(this.f66292c, privFrame.f66292c) && Arrays.equals(this.f66293d, privFrame.f66293d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.f66292c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return Arrays.hashCode(this.f66293d) + ((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.monetization.ads.exo.metadata.id3.Id3Frame
    public final String toString() {
        return this.f66283b + ": owner=" + this.f66292c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66292c);
        parcel.writeByteArray(this.f66293d);
    }

    PrivFrame(Parcel parcel) {
        super("PRIV");
        this.f66292c = (String) y32.m27077a(parcel.readString());
        this.f66293d = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
