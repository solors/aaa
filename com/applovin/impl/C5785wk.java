package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.applovin.impl.wk */
/* loaded from: classes2.dex */
public final class C5785wk extends AbstractC5518sk {
    public static final Parcelable.Creator<C5785wk> CREATOR = new C5786a();

    /* renamed from: a */
    public final List f11753a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.impl.wk$a */
    /* loaded from: classes2.dex */
    public class C5786a implements Parcelable.Creator {
        C5786a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5785wk[] newArray(int i) {
            return new C5785wk[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C5785wk createFromParcel(Parcel parcel) {
            return new C5785wk(parcel, null);
        }
    }

    /* renamed from: com.applovin.impl.wk$b */
    /* loaded from: classes2.dex */
    public static final class C5787b {

        /* renamed from: a */
        public final int f11754a;

        /* renamed from: b */
        public final long f11755b;

        private C5787b(int i, long j) {
            this.f11754a = i;
            this.f11755b = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static C5787b m93493b(Parcel parcel) {
            return new C5787b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m93492c(Parcel parcel) {
            parcel.writeInt(this.f11754a);
            parcel.writeLong(this.f11755b);
        }

        /* synthetic */ C5787b(int i, long j, C5786a c5786a) {
            this(i, j);
        }
    }

    /* renamed from: com.applovin.impl.wk$c */
    /* loaded from: classes2.dex */
    public static final class C5788c {

        /* renamed from: a */
        public final long f11756a;

        /* renamed from: b */
        public final boolean f11757b;

        /* renamed from: c */
        public final boolean f11758c;

        /* renamed from: d */
        public final boolean f11759d;

        /* renamed from: e */
        public final long f11760e;

        /* renamed from: f */
        public final List f11761f;

        /* renamed from: g */
        public final boolean f11762g;

        /* renamed from: h */
        public final long f11763h;

        /* renamed from: i */
        public final int f11764i;

        /* renamed from: j */
        public final int f11765j;

        /* renamed from: k */
        public final int f11766k;

        private C5788c(long j, boolean z, boolean z2, boolean z3, List list, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f11756a = j;
            this.f11757b = z;
            this.f11758c = z2;
            this.f11759d = z3;
            this.f11761f = Collections.unmodifiableList(list);
            this.f11760e = j2;
            this.f11762g = z4;
            this.f11763h = j3;
            this.f11764i = i;
            this.f11765j = i2;
            this.f11766k = i3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static C5788c m93487b(C4066ah c4066ah) {
            ArrayList arrayList;
            boolean z;
            long j;
            boolean z2;
            long j2;
            int i;
            int i2;
            int i3;
            boolean z3;
            boolean z4;
            long j3;
            long m100760y = c4066ah.m100760y();
            boolean z5 = (c4066ah.m100762w() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z5) {
                arrayList = arrayList2;
                z = false;
                j = -9223372036854775807L;
                z2 = false;
                j2 = -9223372036854775807L;
                i = 0;
                i2 = 0;
                i3 = 0;
                z3 = false;
            } else {
                int m100762w = c4066ah.m100762w();
                boolean z6 = (m100762w & 128) != 0;
                boolean z7 = (m100762w & 64) != 0;
                boolean z8 = (m100762w & 32) != 0;
                long m100760y2 = z7 ? c4066ah.m100760y() : -9223372036854775807L;
                if (!z7) {
                    int m100762w2 = c4066ah.m100762w();
                    ArrayList arrayList3 = new ArrayList(m100762w2);
                    for (int i4 = 0; i4 < m100762w2; i4++) {
                        arrayList3.add(new C5787b(c4066ah.m100762w(), c4066ah.m100760y(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z8) {
                    long m100762w3 = c4066ah.m100762w();
                    boolean z9 = (128 & m100762w3) != 0;
                    j3 = ((((m100762w3 & 1) << 32) | c4066ah.m100760y()) * 1000) / 90;
                    z4 = z9;
                } else {
                    z4 = false;
                    j3 = -9223372036854775807L;
                }
                int m100799C = c4066ah.m100799C();
                int m100762w4 = c4066ah.m100762w();
                z3 = z7;
                i3 = c4066ah.m100762w();
                j2 = j3;
                arrayList = arrayList2;
                long j4 = m100760y2;
                i = m100799C;
                i2 = m100762w4;
                j = j4;
                boolean z10 = z6;
                z2 = z4;
                z = z10;
            }
            return new C5788c(m100760y, z5, z, z3, arrayList, j, z2, j2, i, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m93486c(Parcel parcel) {
            parcel.writeLong(this.f11756a);
            parcel.writeByte(this.f11757b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11758c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f11759d ? (byte) 1 : (byte) 0);
            int size = this.f11761f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                ((C5787b) this.f11761f.get(i)).m93492c(parcel);
            }
            parcel.writeLong(this.f11760e);
            parcel.writeByte(this.f11762g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f11763h);
            parcel.writeInt(this.f11764i);
            parcel.writeInt(this.f11765j);
            parcel.writeInt(this.f11766k);
        }

        private C5788c(Parcel parcel) {
            this.f11756a = parcel.readLong();
            this.f11757b = parcel.readByte() == 1;
            this.f11758c = parcel.readByte() == 1;
            this.f11759d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C5787b.m93493b(parcel));
            }
            this.f11761f = Collections.unmodifiableList(arrayList);
            this.f11760e = parcel.readLong();
            this.f11762g = parcel.readByte() == 1;
            this.f11763h = parcel.readLong();
            this.f11764i = parcel.readInt();
            this.f11765j = parcel.readInt();
            this.f11766k = parcel.readInt();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static C5788c m93488b(Parcel parcel) {
            return new C5788c(parcel);
        }
    }

    private C5785wk(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C5788c.m93488b(parcel));
        }
        this.f11753a = Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C5785wk m93498a(C4066ah c4066ah) {
        int m100762w = c4066ah.m100762w();
        ArrayList arrayList = new ArrayList(m100762w);
        for (int i = 0; i < m100762w; i++) {
            arrayList.add(C5788c.m93487b(c4066ah));
        }
        return new C5785wk(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f11753a.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            ((C5788c) this.f11753a.get(i2)).m93486c(parcel);
        }
    }

    /* synthetic */ C5785wk(Parcel parcel, C5786a c5786a) {
        this(parcel);
    }

    private C5785wk(List list) {
        this.f11753a = Collections.unmodifiableList(list);
    }
}
