package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.u */
/* loaded from: classes4.dex */
public final class C15012u extends AbstractC15006o {
    public static final Parcelable.Creator<C15012u> CREATOR = new C15011t();

    /* renamed from: b */
    public final String f29448b;

    /* renamed from: c */
    public final String f29449c;

    public C15012u(String str, String str2, String str3) {
        super(str);
        this.f29448b = str2;
        this.f29449c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15012u.class != obj.getClass()) {
            return false;
        }
        C15012u c15012u = (C15012u) obj;
        if (this.f29443a.equals(c15012u.f29443a) && AbstractC15133z.m77159a(this.f29448b, c15012u.f29448b) && AbstractC15133z.m77159a(this.f29449c, c15012u.f29449c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f29443a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29448b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f29449c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29443a);
        parcel.writeString(this.f29448b);
        parcel.writeString(this.f29449c);
    }

    public C15012u(Parcel parcel) {
        super(parcel.readString());
        this.f29448b = parcel.readString();
        this.f29449c = parcel.readString();
    }
}
