package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.s */
/* loaded from: classes4.dex */
public final class C15010s extends AbstractC15006o {
    public static final Parcelable.Creator<C15010s> CREATOR = new C15009r();

    /* renamed from: b */
    public final String f29446b;

    /* renamed from: c */
    public final String f29447c;

    public C15010s(String str, String str2, String str3) {
        super(str);
        this.f29446b = str2;
        this.f29447c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15010s.class != obj.getClass()) {
            return false;
        }
        C15010s c15010s = (C15010s) obj;
        if (this.f29443a.equals(c15010s.f29443a) && AbstractC15133z.m77159a(this.f29446b, c15010s.f29446b) && AbstractC15133z.m77159a(this.f29447c, c15010s.f29447c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f29443a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.f29446b;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.f29447c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29443a);
        parcel.writeString(this.f29446b);
        parcel.writeString(this.f29447c);
    }

    public C15010s(Parcel parcel) {
        super(parcel.readString());
        this.f29446b = parcel.readString();
        this.f29447c = parcel.readString();
    }
}
