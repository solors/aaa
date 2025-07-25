package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.impl.C4061af;
import com.applovin.impl.C4310e9;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.applovin.impl.v7 */
/* loaded from: classes2.dex */
public final class C5680v7 implements C4061af.InterfaceC4063b {

    /* renamed from: a */
    public final String f11463a;

    /* renamed from: b */
    public final String f11464b;

    /* renamed from: c */
    public final long f11465c;

    /* renamed from: d */
    public final long f11466d;

    /* renamed from: f */
    public final byte[] f11467f;

    /* renamed from: g */
    private int f11468g;

    /* renamed from: h */
    private static final C4310e9 f11461h = new C4310e9.C4312b().m99606f("application/id3").m99632a();

    /* renamed from: i */
    private static final C4310e9 f11462i = new C4310e9.C4312b().m99606f("application/x-scte35").m99632a();
    public static final Parcelable.Creator<C5680v7> CREATOR = new C5681a();

    /* renamed from: com.applovin.impl.v7$a */
    /* loaded from: classes2.dex */
    class C5681a implements Parcelable.Creator {
        C5681a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5680v7[] newArray(int i) {
            return new C5680v7[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5680v7 createFromParcel(Parcel parcel) {
            return new C5680v7(parcel);
        }
    }

    C5680v7(Parcel parcel) {
        this.f11463a = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f11464b = (String) AbstractC5863xp.m93017a((Object) parcel.readString());
        this.f11465c = parcel.readLong();
        this.f11466d = parcel.readLong();
        this.f11467f = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
    }

    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: a */
    public byte[] mo93962a() {
        if (mo93961b() != null) {
            return this.f11467f;
        }
        return null;
    }

    @Override // com.applovin.impl.C4061af.InterfaceC4063b
    /* renamed from: b */
    public C4310e9 mo93961b() {
        String str = this.f11463a;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return f11462i;
            case 1:
            case 2:
                return f11461h;
            default:
                return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5680v7.class != obj.getClass()) {
            return false;
        }
        C5680v7 c5680v7 = (C5680v7) obj;
        if (this.f11465c == c5680v7.f11465c && this.f11466d == c5680v7.f11466d && AbstractC5863xp.m93016a((Object) this.f11463a, (Object) c5680v7.f11463a) && AbstractC5863xp.m93016a((Object) this.f11464b, (Object) c5680v7.f11464b) && Arrays.equals(this.f11467f, c5680v7.f11467f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        if (this.f11468g == 0) {
            String str = this.f11463a;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f11464b;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f11465c;
            long j2 = this.f11466d;
            this.f11468g = ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.f11467f);
        }
        return this.f11468g;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f11463a + ", id=" + this.f11466d + ", durationMs=" + this.f11465c + ", value=" + this.f11464b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11463a);
        parcel.writeString(this.f11464b);
        parcel.writeLong(this.f11465c);
        parcel.writeLong(this.f11466d);
        parcel.writeByteArray(this.f11467f);
    }

    public C5680v7(String str, String str2, long j, long j2, byte[] bArr) {
        this.f11463a = str;
        this.f11464b = str2;
        this.f11465c = j;
        this.f11466d = j2;
        this.f11467f = bArr;
    }
}
