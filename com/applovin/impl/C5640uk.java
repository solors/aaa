package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.uk */
/* loaded from: classes2.dex */
public final class C5640uk extends AbstractC5518sk {
    public static final Parcelable.Creator<C5640uk> CREATOR = new C5641a();

    /* renamed from: a */
    public final long f11313a;

    /* renamed from: b */
    public final boolean f11314b;

    /* renamed from: c */
    public final boolean f11315c;

    /* renamed from: d */
    public final boolean f11316d;

    /* renamed from: f */
    public final boolean f11317f;

    /* renamed from: g */
    public final long f11318g;

    /* renamed from: h */
    public final long f11319h;

    /* renamed from: i */
    public final List f11320i;

    /* renamed from: j */
    public final boolean f11321j;

    /* renamed from: k */
    public final long f11322k;

    /* renamed from: l */
    public final int f11323l;

    /* renamed from: m */
    public final int f11324m;

    /* renamed from: n */
    public final int f11325n;

    /* renamed from: com.applovin.impl.uk$a */
    /* loaded from: classes2.dex */
    class C5641a implements Parcelable.Creator {
        C5641a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5640uk[] newArray(int i) {
            return new C5640uk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5640uk createFromParcel(Parcel parcel) {
            return new C5640uk(parcel, null);
        }
    }

    private C5640uk(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List list, boolean z5, long j4, int i, int i2, int i3) {
        this.f11313a = j;
        this.f11314b = z;
        this.f11315c = z2;
        this.f11316d = z3;
        this.f11317f = z4;
        this.f11318g = j2;
        this.f11319h = j3;
        this.f11320i = Collections.unmodifiableList(list);
        this.f11321j = z5;
        this.f11322k = j4;
        this.f11323l = i;
        this.f11324m = i2;
        this.f11325n = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5640uk m94074a(C4066ah c4066ah, long j, C4537ho c4537ho) {
        boolean z;
        List list;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        int i;
        int i2;
        int i3;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        boolean z10;
        long j5;
        boolean z11;
        long j6;
        long m100760y = c4066ah.m100760y();
        if ((c4066ah.m100762w() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        List emptyList = Collections.emptyList();
        if (!z) {
            int m100762w = c4066ah.m100762w();
            if ((m100762w & 128) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((m100762w & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((m100762w & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((m100762w & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z7 && !z9) {
                j4 = C4277do.m99728a(c4066ah, j);
            } else {
                j4 = -9223372036854775807L;
            }
            if (!z7) {
                int m100762w2 = c4066ah.m100762w();
                ArrayList arrayList = new ArrayList(m100762w2);
                for (int i4 = 0; i4 < m100762w2; i4++) {
                    int m100762w3 = c4066ah.m100762w();
                    if (!z9) {
                        j6 = C4277do.m99728a(c4066ah, j);
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    arrayList.add(new C5642b(m100762w3, j6, c4537ho.m98645b(j6), null));
                }
                emptyList = arrayList;
            }
            if (z8) {
                long m100762w4 = c4066ah.m100762w();
                if ((128 & m100762w4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((m100762w4 & 1) << 32) | c4066ah.m100760y()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
                j5 = -9223372036854775807L;
            }
            i = c4066ah.m100799C();
            z5 = z7;
            i2 = c4066ah.m100762w();
            i3 = c4066ah.m100762w();
            list = emptyList;
            long j7 = j4;
            z4 = z10;
            j3 = j5;
            z3 = z9;
            z2 = z6;
            j2 = j7;
        } else {
            list = emptyList;
            z2 = false;
            z3 = false;
            j2 = -9223372036854775807L;
            z4 = false;
            j3 = -9223372036854775807L;
            i = 0;
            i2 = 0;
            i3 = 0;
            z5 = false;
        }
        return new C5640uk(m100760y, z, z2, z5, z3, j2, c4537ho.m98645b(j2), list, z4, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f11313a);
        parcel.writeByte(this.f11314b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11315c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11316d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f11317f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11318g);
        parcel.writeLong(this.f11319h);
        int size = this.f11320i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C5642b) this.f11320i.get(i2)).m94070b(parcel);
        }
        parcel.writeByte(this.f11321j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f11322k);
        parcel.writeInt(this.f11323l);
        parcel.writeInt(this.f11324m);
        parcel.writeInt(this.f11325n);
    }

    /* renamed from: com.applovin.impl.uk$b */
    /* loaded from: classes2.dex */
    public static final class C5642b {

        /* renamed from: a */
        public final int f11326a;

        /* renamed from: b */
        public final long f11327b;

        /* renamed from: c */
        public final long f11328c;

        private C5642b(int i, long j, long j2) {
            this.f11326a = i;
            this.f11327b = j;
            this.f11328c = j2;
        }

        /* renamed from: a */
        public static C5642b m94071a(Parcel parcel) {
            return new C5642b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        /* renamed from: b */
        public void m94070b(Parcel parcel) {
            parcel.writeInt(this.f11326a);
            parcel.writeLong(this.f11327b);
            parcel.writeLong(this.f11328c);
        }

        /* synthetic */ C5642b(int i, long j, long j2, C5641a c5641a) {
            this(i, j, j2);
        }
    }

    private C5640uk(Parcel parcel) {
        this.f11313a = parcel.readLong();
        this.f11314b = parcel.readByte() == 1;
        this.f11315c = parcel.readByte() == 1;
        this.f11316d = parcel.readByte() == 1;
        this.f11317f = parcel.readByte() == 1;
        this.f11318g = parcel.readLong();
        this.f11319h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C5642b.m94071a(parcel));
        }
        this.f11320i = Collections.unmodifiableList(arrayList);
        this.f11321j = parcel.readByte() == 1;
        this.f11322k = parcel.readLong();
        this.f11323l = parcel.readInt();
        this.f11324m = parcel.readInt();
        this.f11325n = parcel.readInt();
    }

    /* synthetic */ C5640uk(Parcel parcel, C5641a c5641a) {
        this(parcel);
    }
}
