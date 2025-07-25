package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.vh */
/* loaded from: classes2.dex */
public final class C5700vh extends AbstractC5837xa {
    public static final Parcelable.Creator<C5700vh> CREATOR = new C5701a();

    /* renamed from: b */
    public final String f11491b;

    /* renamed from: c */
    public final byte[] f11492c;

    /* renamed from: com.applovin.impl.vh$a */
    /* loaded from: classes2.dex */
    class C5701a implements Parcelable.Creator {
        C5701a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5700vh[] newArray(int i) {
            return new C5700vh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5700vh createFromParcel(Parcel parcel) {
            return new C5700vh(parcel);
        }
    }

    C5700vh(Parcel parcel) {
        super("PRIV");
        this.f11491b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f11492c = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5700vh.class != obj.getClass()) {
            return false;
        }
        C5700vh c5700vh = (C5700vh) obj;
        if (AbstractC5863xp.m93016a((Object) this.f11491b, (Object) c5700vh.f11491b) && Arrays.equals(this.f11492c, c5700vh.f11492c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        String str = this.f11491b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return ((i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f11492c);
    }

    @Override // com.applovin.impl.AbstractC5837xa
    public String toString() {
        return this.f11957a + ": owner=" + this.f11491b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11491b);
        parcel.writeByteArray(this.f11492c);
    }

    public C5700vh(String str, byte[] bArr) {
        super("PRIV");
        this.f11491b = str;
        this.f11492c = bArr;
    }
}
