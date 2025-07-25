package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.applovin.impl.yh */
/* loaded from: classes2.dex */
public final class C5917yh extends AbstractC5518sk {
    public static final Parcelable.Creator<C5917yh> CREATOR = new C5918a();

    /* renamed from: a */
    public final long f12344a;

    /* renamed from: b */
    public final long f12345b;

    /* renamed from: c */
    public final byte[] f12346c;

    /* renamed from: com.applovin.impl.yh$a */
    /* loaded from: classes2.dex */
    class C5918a implements Parcelable.Creator {
        C5918a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5917yh[] newArray(int i) {
            return new C5917yh[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5917yh createFromParcel(Parcel parcel) {
            return new C5917yh(parcel, null);
        }
    }

    private C5917yh(long j, byte[] bArr, long j2) {
        this.f12344a = j2;
        this.f12345b = j;
        this.f12346c = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5917yh m92742a(C4066ah c4066ah, int i, long j) {
        long m100760y = c4066ah.m100760y();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        c4066ah.m100790a(bArr, 0, i2);
        return new C5917yh(m100760y, bArr, j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f12344a);
        parcel.writeLong(this.f12345b);
        parcel.writeByteArray(this.f12346c);
    }

    private C5917yh(Parcel parcel) {
        this.f12344a = parcel.readLong();
        this.f12345b = parcel.readLong();
        this.f12346c = (byte[]) AbstractC5863xp.m93017a((Object) parcel.createByteArray());
    }

    /* synthetic */ C5917yh(Parcel parcel, C5918a c5918a) {
        this(parcel);
    }
}
