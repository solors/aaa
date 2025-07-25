package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f */
/* loaded from: classes4.dex */
public final class C14997f extends AbstractC15006o {
    public static final Parcelable.Creator<C14997f> CREATOR = new C14996e();

    /* renamed from: b */
    public final String f29420b;

    /* renamed from: c */
    public final int f29421c;

    /* renamed from: d */
    public final int f29422d;

    /* renamed from: e */
    public final long f29423e;

    /* renamed from: f */
    public final long f29424f;

    /* renamed from: g */
    public final AbstractC15006o[] f29425g;

    public C14997f(String str, int i, int i2, long j, long j2, AbstractC15006o[] abstractC15006oArr) {
        super("CHAP");
        this.f29420b = str;
        this.f29421c = i;
        this.f29422d = i2;
        this.f29423e = j;
        this.f29424f = j2;
        this.f29425g = abstractC15006oArr;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC15006o, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C14997f.class != obj.getClass()) {
            return false;
        }
        C14997f c14997f = (C14997f) obj;
        if (this.f29421c == c14997f.f29421c && this.f29422d == c14997f.f29422d && this.f29423e == c14997f.f29423e && this.f29424f == c14997f.f29424f && AbstractC15133z.m77159a(this.f29420b, c14997f.f29420b) && Arrays.equals(this.f29425g, c14997f.f29425g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((this.f29421c + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f29422d) * 31) + ((int) this.f29423e)) * 31) + ((int) this.f29424f)) * 31;
        String str = this.f29420b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f29420b);
        parcel.writeInt(this.f29421c);
        parcel.writeInt(this.f29422d);
        parcel.writeLong(this.f29423e);
        parcel.writeLong(this.f29424f);
        parcel.writeInt(this.f29425g.length);
        for (AbstractC15006o abstractC15006o : this.f29425g) {
            parcel.writeParcelable(abstractC15006o, 0);
        }
    }

    public C14997f(Parcel parcel) {
        super("CHAP");
        this.f29420b = parcel.readString();
        this.f29421c = parcel.readInt();
        this.f29422d = parcel.readInt();
        this.f29423e = parcel.readLong();
        this.f29424f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f29425g = new AbstractC15006o[readInt];
        for (int i = 0; i < readInt; i++) {
            this.f29425g[i] = (AbstractC15006o) parcel.readParcelable(AbstractC15006o.class.getClassLoader());
        }
    }
}
