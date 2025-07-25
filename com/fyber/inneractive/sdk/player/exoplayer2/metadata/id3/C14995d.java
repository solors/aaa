package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d */
/* loaded from: classes4.dex */
public final class C14995d extends AbstractC15006o {
    public static final Parcelable.Creator<C14995d> CREATOR = new C14994c();

    /* renamed from: b */
    public final byte[] f29419b;

    public C14995d(String str, byte[] bArr) {
        super(str);
        this.f29419b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14995d.class != obj.getClass()) {
            return false;
        }
        C14995d c14995d = (C14995d) obj;
        if (this.f29443a.equals(c14995d.f29443a) && Arrays.equals(this.f29419b, c14995d.f29419b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f29419b) + ((this.f29443a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29443a);
        parcel.writeByteArray(this.f29419b);
    }

    public C14995d(Parcel parcel) {
        super(parcel.readString());
        this.f29419b = parcel.createByteArray();
    }
}
