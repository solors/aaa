package com.fyber.inneractive.sdk.player.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.util.Arrays;
import java.util.UUID;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.drm.c */
/* loaded from: classes4.dex */
public final class C14829c implements Parcelable {
    public static final Parcelable.Creator<C14829c> CREATOR = new C14828b();

    /* renamed from: a */
    public int f28268a;

    /* renamed from: b */
    public final UUID f28269b;

    /* renamed from: c */
    public final String f28270c;

    /* renamed from: d */
    public final byte[] f28271d;

    /* renamed from: e */
    public final boolean f28272e;

    public C14829c(UUID uuid, String str, byte[] bArr) {
        uuid.getClass();
        this.f28269b = uuid;
        this.f28270c = str;
        bArr.getClass();
        this.f28271d = bArr;
        this.f28272e = false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14829c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C14829c c14829c = (C14829c) obj;
        if (!this.f28270c.equals(c14829c.f28270c) || !AbstractC15133z.m77159a(this.f28269b, c14829c.f28269b) || !Arrays.equals(this.f28271d, c14829c.f28271d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f28268a == 0) {
            int hashCode = this.f28270c.hashCode();
            this.f28268a = Arrays.hashCode(this.f28271d) + ((hashCode + (this.f28269b.hashCode() * 31)) * 31);
        }
        return this.f28268a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f28269b.getMostSignificantBits());
        parcel.writeLong(this.f28269b.getLeastSignificantBits());
        parcel.writeString(this.f28270c);
        parcel.writeByteArray(this.f28271d);
        parcel.writeByte(this.f28272e ? (byte) 1 : (byte) 0);
    }

    public C14829c(Parcel parcel) {
        this.f28269b = new UUID(parcel.readLong(), parcel.readLong());
        this.f28270c = parcel.readString();
        this.f28271d = parcel.createByteArray();
        this.f28272e = parcel.readByte() != 0;
    }
}
