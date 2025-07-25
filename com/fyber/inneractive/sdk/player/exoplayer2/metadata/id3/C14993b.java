package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b */
/* loaded from: classes4.dex */
public final class C14993b extends AbstractC15006o {
    public static final Parcelable.Creator<C14993b> CREATOR = new C14992a();

    /* renamed from: b */
    public final String f29415b;

    /* renamed from: c */
    public final String f29416c;

    /* renamed from: d */
    public final int f29417d;

    /* renamed from: e */
    public final byte[] f29418e;

    public C14993b(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f29415b = str;
        this.f29416c = str2;
        this.f29417d = i;
        this.f29418e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14993b.class != obj.getClass()) {
            return false;
        }
        C14993b c14993b = (C14993b) obj;
        if (this.f29417d == c14993b.f29417d && AbstractC15133z.m77159a(this.f29415b, c14993b.f29415b) && AbstractC15133z.m77159a(this.f29416c, c14993b.f29416c) && Arrays.equals(this.f29418e, c14993b.f29418e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (this.f29417d + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29415b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.f29416c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return Arrays.hashCode(this.f29418e) + ((i4 + i3) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29415b);
        parcel.writeString(this.f29416c);
        parcel.writeInt(this.f29417d);
        parcel.writeByteArray(this.f29418e);
    }

    public C14993b(Parcel parcel) {
        super("APIC");
        this.f29415b = parcel.readString();
        this.f29416c = parcel.readString();
        this.f29417d = parcel.readInt();
        this.f29418e = parcel.createByteArray();
    }
}
