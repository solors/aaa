package com.monetization.ads.exo.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.v90;
import com.yandex.mobile.ads.impl.y32;
import java.util.Arrays;

/* loaded from: classes7.dex */
public final class EventMessage implements Metadata.Entry {

    /* renamed from: b */
    public final String f66235b;

    /* renamed from: c */
    public final String f66236c;

    /* renamed from: d */
    public final long f66237d;

    /* renamed from: e */
    public final long f66238e;

    /* renamed from: f */
    public final byte[] f66239f;

    /* renamed from: g */
    private int f66240g;

    /* renamed from: h */
    private static final v90 f66233h = new v90.C31640a().m28426e("application/id3").m28454a();

    /* renamed from: i */
    private static final v90 f66234i = new v90.C31640a().m28426e("application/x-scte35").m28454a();
    public static final Parcelable.Creator<EventMessage> CREATOR = new C25527a();

    /* renamed from: com.monetization.ads.exo.metadata.emsg.EventMessage$a */
    /* loaded from: classes7.dex */
    final class C25527a implements Parcelable.Creator<EventMessage> {
        C25527a() {
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final EventMessage[] newArray(int i) {
            return new EventMessage[i];
        }
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.f66235b = str;
        this.f66236c = str2;
        this.f66237d = j;
        this.f66238e = j2;
        this.f66239f = bArr;
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    @Nullable
    /* renamed from: a */
    public final v90 mo44378a() {
        String str = this.f66235b;
        str.getClass();
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
                return f66234i;
            case 1:
            case 2:
                return f66233h;
            default:
                return null;
        }
    }

    @Override // com.monetization.ads.exo.metadata.Metadata.Entry
    @Nullable
    /* renamed from: b */
    public final byte[] mo44377b() {
        if (mo44378a() != null) {
            return this.f66239f;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.f66237d == eventMessage.f66237d && this.f66238e == eventMessage.f66238e && y32.m27076a(this.f66235b, eventMessage.f66235b) && y32.m27076a(this.f66236c, eventMessage.f66236c) && Arrays.equals(this.f66239f, eventMessage.f66239f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        if (this.f66240g == 0) {
            String str = this.f66235b;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
            String str2 = this.f66236c;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.f66237d;
            long j2 = this.f66238e;
            this.f66240g = Arrays.hashCode(this.f66239f) + ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.f66240g;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.f66235b + ", id=" + this.f66238e + ", durationMs=" + this.f66237d + ", value=" + this.f66236c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f66235b);
        parcel.writeString(this.f66236c);
        parcel.writeLong(this.f66237d);
        parcel.writeLong(this.f66238e);
        parcel.writeByteArray(this.f66239f);
    }

    EventMessage(Parcel parcel) {
        this.f66235b = (String) y32.m27077a(parcel.readString());
        this.f66236c = (String) y32.m27077a(parcel.readString());
        this.f66237d = parcel.readLong();
        this.f66238e = parcel.readLong();
        this.f66239f = (byte[]) y32.m27077a(parcel.createByteArray());
    }
}
