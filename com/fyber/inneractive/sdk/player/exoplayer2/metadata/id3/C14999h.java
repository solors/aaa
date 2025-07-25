package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h */
/* loaded from: classes4.dex */
public final class C14999h extends AbstractC15006o {
    public static final Parcelable.Creator<C14999h> CREATOR = new C14998g();

    /* renamed from: b */
    public final String f29426b;

    /* renamed from: c */
    public final boolean f29427c;

    /* renamed from: d */
    public final boolean f29428d;

    /* renamed from: e */
    public final String[] f29429e;

    /* renamed from: f */
    public final AbstractC15006o[] f29430f;

    public C14999h(String str, boolean z, boolean z2, String[] strArr, AbstractC15006o[] abstractC15006oArr) {
        super("CTOC");
        this.f29426b = str;
        this.f29427c = z;
        this.f29428d = z2;
        this.f29429e = strArr;
        this.f29430f = abstractC15006oArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14999h.class != obj.getClass()) {
            return false;
        }
        C14999h c14999h = (C14999h) obj;
        if (this.f29427c == c14999h.f29427c && this.f29428d == c14999h.f29428d && AbstractC15133z.m77159a(this.f29426b, c14999h.f29426b) && Arrays.equals(this.f29429e, c14999h.f29429e) && Arrays.equals(this.f29430f, c14999h.f29430f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = ((((this.f29427c ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.f29428d ? 1 : 0)) * 31;
        String str = this.f29426b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29426b);
        parcel.writeByte(this.f29427c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f29428d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f29429e);
        parcel.writeInt(this.f29430f.length);
        int i2 = 0;
        while (true) {
            AbstractC15006o[] abstractC15006oArr = this.f29430f;
            if (i2 < abstractC15006oArr.length) {
                parcel.writeParcelable(abstractC15006oArr[i2], 0);
                i2++;
            } else {
                return;
            }
        }
    }

    public C14999h(Parcel parcel) {
        super("CTOC");
        this.f29426b = parcel.readString();
        this.f29427c = parcel.readByte() != 0;
        this.f29428d = parcel.readByte() != 0;
        this.f29429e = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f29430f = new AbstractC15006o[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f29430f[i] = (AbstractC15006o) parcel.readParcelable(AbstractC15006o.class.getClassLoader());
        }
    }
}
