package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.l */
/* loaded from: classes4.dex */
public final class C15003l extends AbstractC15006o {
    public static final Parcelable.Creator<C15003l> CREATOR = new C15002k();

    /* renamed from: b */
    public final String f29434b;

    /* renamed from: c */
    public final String f29435c;

    /* renamed from: d */
    public final String f29436d;

    /* renamed from: e */
    public final byte[] f29437e;

    public C15003l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f29434b = str;
        this.f29435c = str2;
        this.f29436d = str3;
        this.f29437e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15003l.class != obj.getClass()) {
            return false;
        }
        C15003l c15003l = (C15003l) obj;
        if (AbstractC15133z.m77159a(this.f29434b, c15003l.f29434b) && AbstractC15133z.m77159a(this.f29435c, c15003l.f29435c) && AbstractC15133z.m77159a(this.f29436d, c15003l.f29436d) && Arrays.equals(this.f29437e, c15003l.f29437e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f29434b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f29435c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f29436d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return Arrays.hashCode(this.f29437e) + ((i5 + i3) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29434b);
        parcel.writeString(this.f29435c);
        parcel.writeString(this.f29436d);
        parcel.writeByteArray(this.f29437e);
    }

    public C15003l(Parcel parcel) {
        super("GEOB");
        this.f29434b = parcel.readString();
        this.f29435c = parcel.readString();
        this.f29436d = parcel.readString();
        this.f29437e = parcel.createByteArray();
    }
}
