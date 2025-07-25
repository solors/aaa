package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.c */
/* loaded from: classes4.dex */
public final class C15137c implements Parcelable {
    public static final Parcelable.Creator<C15137c> CREATOR = new C15136b();

    /* renamed from: a */
    public final int f29878a;

    /* renamed from: b */
    public final int f29879b;

    /* renamed from: c */
    public final int f29880c;

    /* renamed from: d */
    public final byte[] f29881d;

    /* renamed from: e */
    public int f29882e;

    public C15137c(int i, int i2, int i3, byte[] bArr) {
        this.f29878a = i;
        this.f29879b = i2;
        this.f29880c = i3;
        this.f29881d = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15137c.class == obj.getClass()) {
            C15137c c15137c = (C15137c) obj;
            if (this.f29878a == c15137c.f29878a && this.f29879b == c15137c.f29879b && this.f29880c == c15137c.f29880c && Arrays.equals(this.f29881d, c15137c.f29881d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f29882e == 0) {
            this.f29882e = Arrays.hashCode(this.f29881d) + ((((((this.f29878a + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29879b) * 31) + this.f29880c) * 31);
        }
        return this.f29882e;
    }

    public final String toString() {
        boolean z;
        StringBuilder sb2 = new StringBuilder("ColorInfo(");
        sb2.append(this.f29878a);
        sb2.append(", ");
        sb2.append(this.f29879b);
        sb2.append(", ");
        sb2.append(this.f29880c);
        sb2.append(", ");
        if (this.f29881d != null) {
            z = true;
        } else {
            z = false;
        }
        sb2.append(z);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeInt(this.f29878a);
        parcel.writeInt(this.f29879b);
        parcel.writeInt(this.f29880c);
        if (this.f29881d != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.f29881d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public C15137c(Parcel parcel) {
        this.f29878a = parcel.readInt();
        this.f29879b = parcel.readInt();
        this.f29880c = parcel.readInt();
        this.f29881d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }
}
