package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j */
/* loaded from: classes4.dex */
public final class C15001j extends AbstractC15006o {
    public static final Parcelable.Creator<C15001j> CREATOR = new C15000i();

    /* renamed from: b */
    public final String f29431b;

    /* renamed from: c */
    public final String f29432c;

    /* renamed from: d */
    public final String f29433d;

    public C15001j(String str, String str2, String str3) {
        super("COMM");
        this.f29431b = str;
        this.f29432c = str2;
        this.f29433d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15001j.class != obj.getClass()) {
            return false;
        }
        C15001j c15001j = (C15001j) obj;
        if (AbstractC15133z.m77159a(this.f29432c, c15001j.f29432c) && AbstractC15133z.m77159a(this.f29431b, c15001j.f29431b) && AbstractC15133z.m77159a(this.f29433d, c15001j.f29433d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.f29431b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str2 = this.f29432c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.f29433d;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i5 + i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29443a);
        parcel.writeString(this.f29431b);
        parcel.writeString(this.f29433d);
    }

    public C15001j(Parcel parcel) {
        super("COMM");
        this.f29431b = parcel.readString();
        this.f29432c = parcel.readString();
        this.f29433d = parcel.readString();
    }
}
