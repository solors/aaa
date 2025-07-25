package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.applovin.impl.do */
/* loaded from: classes2.dex */
public final class C4277do extends AbstractC5518sk {
    public static final Parcelable.Creator<C4277do> CREATOR = new C4278a();

    /* renamed from: a */
    public final long f5685a;

    /* renamed from: b */
    public final long f5686b;

    /* renamed from: com.applovin.impl.do$a */
    /* loaded from: classes2.dex */
    class C4278a implements Parcelable.Creator {
        C4278a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4277do[] newArray(int i) {
            return new C4277do[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4277do createFromParcel(Parcel parcel) {
            return new C4277do(parcel.readLong(), parcel.readLong(), null);
        }
    }

    private C4277do(long j, long j2) {
        this.f5685a = j;
        this.f5686b = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4277do m99727a(C4066ah c4066ah, long j, C4537ho c4537ho) {
        long m99728a = m99728a(c4066ah, j);
        return new C4277do(m99728a, c4537ho.m98645b(m99728a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f5685a);
        parcel.writeLong(this.f5686b);
    }

    /* synthetic */ C4277do(long j, long j2, C4278a c4278a) {
        this(j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m99728a(C4066ah c4066ah, long j) {
        long m100762w = c4066ah.m100762w();
        if ((128 & m100762w) != 0) {
            return 8589934591L & ((((m100762w & 1) << 32) | c4066ah.m100760y()) + j);
        }
        return -9223372036854775807L;
    }
}
