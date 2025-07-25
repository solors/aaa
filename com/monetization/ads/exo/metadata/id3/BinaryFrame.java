package com.monetization.ads.exo.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.C31014o3;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new C25533a();

    /* renamed from: c */
    public final byte[] f66264c;

    /* renamed from: com.monetization.ads.exo.metadata.id3.BinaryFrame$a */
    /* loaded from: classes7.dex */
    final class C25533a implements Parcelable.Creator<BinaryFrame> {
        C25533a() {
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame createFromParcel(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BinaryFrame[] newArray(int i) {
            return new BinaryFrame[i];
        }
    }

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.f66264c = bArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || BinaryFrame.class != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        if (this.f66283b.equals(binaryFrame.f66283b) && Arrays.equals(this.f66264c, binaryFrame.f66264c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f66264c) + C31014o3.m31189a(this.f66283b, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66283b);
        parcel.writeByteArray(this.f66264c);
    }

    BinaryFrame(Parcel parcel) {
        super((String) y32.m27077a(parcel.readString()));
        this.f66264c = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
