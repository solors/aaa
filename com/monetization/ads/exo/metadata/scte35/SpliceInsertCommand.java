package com.monetization.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.cc1;
import com.yandex.mobile.ads.impl.n02;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C25553a();

    /* renamed from: b */
    public final long f66316b;

    /* renamed from: c */
    public final boolean f66317c;

    /* renamed from: d */
    public final boolean f66318d;

    /* renamed from: e */
    public final boolean f66319e;

    /* renamed from: f */
    public final boolean f66320f;

    /* renamed from: g */
    public final long f66321g;

    /* renamed from: h */
    public final long f66322h;

    /* renamed from: i */
    public final List<C25554b> f66323i;

    /* renamed from: j */
    public final boolean f66324j;

    /* renamed from: k */
    public final long f66325k;

    /* renamed from: l */
    public final int f66326l;

    /* renamed from: m */
    public final int f66327m;

    /* renamed from: n */
    public final int f66328n;

    /* renamed from: com.monetization.ads.exo.metadata.scte35.SpliceInsertCommand$a */
    /* loaded from: classes7.dex */
    final class C25553a implements Parcelable.Creator<SpliceInsertCommand> {
        C25553a() {
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceInsertCommand[] newArray(int i) {
            return new SpliceInsertCommand[i];
        }
    }

    /* renamed from: com.monetization.ads.exo.metadata.scte35.SpliceInsertCommand$b */
    /* loaded from: classes7.dex */
    public static final class C25554b {

        /* renamed from: a */
        public final int f66329a;

        /* renamed from: b */
        public final long f66330b;

        /* renamed from: c */
        public final long f66331c;

        /* renamed from: a */
        public static C25554b m44368a(Parcel parcel) {
            return new C25554b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private C25554b(int i, long j, long j2) {
            this.f66329a = i;
            this.f66330b = j;
            this.f66331c = j2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static SpliceInsertCommand m44369a(cc1 cc1Var, long j, n02 n02Var) {
        boolean z;
        List list;
        int i;
        boolean z2;
        boolean z3;
        long j2;
        boolean z4;
        long j3;
        boolean z5;
        int i2;
        int i3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j4;
        boolean z10;
        long j5;
        boolean z11;
        long j6;
        cc1 cc1Var2 = cc1Var;
        long m35268v = cc1Var.m35268v();
        if ((cc1Var.m35270t() & 128) != 0) {
            z = true;
        } else {
            z = false;
        }
        List emptyList = Collections.emptyList();
        if (!z) {
            int m35270t = cc1Var.m35270t();
            if ((m35270t & 128) != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((m35270t & 64) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((m35270t & 32) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if ((m35270t & 16) != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z7 && !z9) {
                j4 = TimeSignalCommand.m44362a(j, cc1Var2);
            } else {
                j4 = -9223372036854775807L;
            }
            if (!z7) {
                int m35270t2 = cc1Var.m35270t();
                ArrayList arrayList = new ArrayList(m35270t2);
                int i4 = 0;
                while (i4 < m35270t2) {
                    int m35270t3 = cc1Var.m35270t();
                    if (!z9) {
                        j6 = TimeSignalCommand.m44362a(j, cc1Var2);
                    } else {
                        j6 = -9223372036854775807L;
                    }
                    arrayList.add(new C25554b(m35270t3, j6, n02Var.m31718b(j6)));
                    i4++;
                    cc1Var2 = cc1Var;
                }
                emptyList = arrayList;
            }
            if (z8) {
                long m35270t4 = cc1Var.m35270t();
                if ((128 & m35270t4) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                j5 = ((((m35270t4 & 1) << 32) | cc1Var.m35268v()) * 1000) / 90;
                z10 = z11;
            } else {
                z10 = false;
                j5 = -9223372036854775807L;
            }
            i = cc1Var.m35264z();
            i2 = cc1Var.m35270t();
            i3 = cc1Var.m35270t();
            list = emptyList;
            z5 = z7;
            long j7 = j4;
            z4 = z10;
            j3 = j5;
            z3 = z9;
            z2 = z6;
            j2 = j7;
        } else {
            list = emptyList;
            i = 0;
            z2 = false;
            z3 = false;
            j2 = -9223372036854775807L;
            z4 = false;
            j3 = -9223372036854775807L;
            z5 = false;
            i2 = 0;
            i3 = 0;
        }
        return new SpliceInsertCommand(m35268v, z, z2, z5, z3, j2, n02Var.m31718b(j2), list, z4, j3, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f66316b);
        parcel.writeByte(this.f66317c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f66318d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f66319e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f66320f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f66321g);
        parcel.writeLong(this.f66322h);
        int size = this.f66323i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C25554b c25554b = this.f66323i.get(i2);
            parcel.writeInt(c25554b.f66329a);
            parcel.writeLong(c25554b.f66330b);
            parcel.writeLong(c25554b.f66331c);
        }
        parcel.writeByte(this.f66324j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f66325k);
        parcel.writeInt(this.f66326l);
        parcel.writeInt(this.f66327m);
        parcel.writeInt(this.f66328n);
    }

    private SpliceInsertCommand(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<C25554b> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f66316b = j;
        this.f66317c = z;
        this.f66318d = z2;
        this.f66319e = z3;
        this.f66320f = z4;
        this.f66321g = j2;
        this.f66322h = j3;
        this.f66323i = Collections.unmodifiableList(list);
        this.f66324j = z5;
        this.f66325k = j4;
        this.f66326l = i;
        this.f66327m = i2;
        this.f66328n = i3;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.f66316b = parcel.readLong();
        this.f66317c = parcel.readByte() == 1;
        this.f66318d = parcel.readByte() == 1;
        this.f66319e = parcel.readByte() == 1;
        this.f66320f = parcel.readByte() == 1;
        this.f66321g = parcel.readLong();
        this.f66322h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C25554b.m44368a(parcel));
        }
        this.f66323i = Collections.unmodifiableList(arrayList);
        this.f66324j = parcel.readByte() == 1;
        this.f66325k = parcel.readLong();
        this.f66326l = parcel.readInt();
        this.f66327m = parcel.readInt();
        this.f66328n = parcel.readInt();
    }
}
