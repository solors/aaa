package com.monetization.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.cc1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes7.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C25556a();

    /* renamed from: b */
    public final List<C25558c> f66332b;

    /* renamed from: com.monetization.ads.exo.metadata.scte35.SpliceScheduleCommand$a */
    /* loaded from: classes7.dex */
    final class C25556a implements Parcelable.Creator<SpliceScheduleCommand> {
        C25556a() {
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceScheduleCommand[] newArray(int i) {
            return new SpliceScheduleCommand[i];
        }
    }

    /* renamed from: com.monetization.ads.exo.metadata.scte35.SpliceScheduleCommand$b */
    /* loaded from: classes7.dex */
    public static final class C25557b {

        /* renamed from: a */
        public final int f66333a;

        /* renamed from: b */
        public final long f66334b;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C25557b m44366a(Parcel parcel) {
            return new C25557b(parcel.readInt(), parcel.readLong());
        }

        private C25557b(int i, long j) {
            this.f66333a = i;
            this.f66334b = j;
        }
    }

    /* renamed from: com.monetization.ads.exo.metadata.scte35.SpliceScheduleCommand$c */
    /* loaded from: classes7.dex */
    public static final class C25558c {

        /* renamed from: a */
        public final long f66335a;

        /* renamed from: b */
        public final boolean f66336b;

        /* renamed from: c */
        public final boolean f66337c;

        /* renamed from: d */
        public final boolean f66338d;

        /* renamed from: e */
        public final long f66339e;

        /* renamed from: f */
        public final List<C25557b> f66340f;

        /* renamed from: g */
        public final boolean f66341g;

        /* renamed from: h */
        public final long f66342h;

        /* renamed from: i */
        public final int f66343i;

        /* renamed from: j */
        public final int f66344j;

        /* renamed from: k */
        public final int f66345k;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static C25558c m44364a(Parcel parcel) {
            return new C25558c(parcel);
        }

        private C25558c(long j, boolean z, boolean z2, boolean z3, ArrayList arrayList, long j2, boolean z4, long j3, int i, int i2, int i3) {
            this.f66335a = j;
            this.f66336b = z;
            this.f66337c = z2;
            this.f66338d = z3;
            this.f66340f = Collections.unmodifiableList(arrayList);
            this.f66339e = j2;
            this.f66341g = z4;
            this.f66342h = j3;
            this.f66343i = i;
            this.f66344j = i2;
            this.f66345k = i3;
        }

        private C25558c(Parcel parcel) {
            this.f66335a = parcel.readLong();
            this.f66336b = parcel.readByte() == 1;
            this.f66337c = parcel.readByte() == 1;
            this.f66338d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(C25557b.m44366a(parcel));
            }
            this.f66340f = Collections.unmodifiableList(arrayList);
            this.f66339e = parcel.readLong();
            this.f66341g = parcel.readByte() == 1;
            this.f66342h = parcel.readLong();
            this.f66343i = parcel.readInt();
            this.f66344j = parcel.readInt();
            this.f66345k = parcel.readInt();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static SpliceScheduleCommand m44367a(cc1 cc1Var) {
        boolean z;
        int i;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long j2;
        int i2;
        int i3;
        int i4;
        boolean z5;
        boolean z6;
        boolean z7;
        long j3;
        boolean z8;
        boolean z9;
        long j4;
        int m35270t = cc1Var.m35270t();
        ArrayList arrayList2 = new ArrayList(m35270t);
        int i5 = 0;
        while (i5 < m35270t) {
            long m35268v = cc1Var.m35268v();
            if ((cc1Var.m35270t() & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList3 = new ArrayList();
            if (!z) {
                int m35270t2 = cc1Var.m35270t();
                if ((m35270t2 & 128) != 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((m35270t2 & 64) != 0) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if ((m35270t2 & 32) != 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (z6) {
                    j3 = cc1Var.m35268v();
                } else {
                    j3 = -9223372036854775807L;
                }
                if (!z6) {
                    int m35270t3 = cc1Var.m35270t();
                    ArrayList arrayList4 = new ArrayList(m35270t3);
                    int i6 = 0;
                    while (i6 < m35270t3) {
                        arrayList4.add(new C25557b(cc1Var.m35270t(), cc1Var.m35268v()));
                        i6++;
                        z5 = z5;
                        z6 = z6;
                        m35270t = m35270t;
                        m35270t3 = m35270t3;
                    }
                    i = m35270t;
                    z3 = z5;
                    z8 = z6;
                    arrayList3 = arrayList4;
                } else {
                    i = m35270t;
                    z3 = z5;
                    z8 = z6;
                }
                if (z7) {
                    long m35270t4 = cc1Var.m35270t();
                    if ((m35270t4 & 128) != 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    j4 = ((((m35270t4 & 1) << 32) | cc1Var.m35268v()) * 1000) / 90;
                } else {
                    z9 = false;
                    j4 = -9223372036854775807L;
                }
                i2 = cc1Var.m35264z();
                arrayList = arrayList3;
                z4 = z9;
                j = j3;
                j2 = j4;
                i3 = cc1Var.m35270t();
                i4 = cc1Var.m35270t();
                z2 = z8;
            } else {
                i = m35270t;
                arrayList = arrayList3;
                z2 = false;
                z3 = false;
                j = -9223372036854775807L;
                z4 = false;
                j2 = -9223372036854775807L;
                i2 = 0;
                i3 = 0;
                i4 = 0;
            }
            arrayList2.add(new C25558c(m35268v, z, z3, z2, arrayList, j, z4, j2, i2, i3, i4));
            i5++;
            m35270t = i;
        }
        return new SpliceScheduleCommand(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f66332b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C25558c c25558c = this.f66332b.get(i2);
            parcel.writeLong(c25558c.f66335a);
            parcel.writeByte(c25558c.f66336b ? (byte) 1 : (byte) 0);
            parcel.writeByte(c25558c.f66337c ? (byte) 1 : (byte) 0);
            parcel.writeByte(c25558c.f66338d ? (byte) 1 : (byte) 0);
            int size2 = c25558c.f66340f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                C25557b c25557b = c25558c.f66340f.get(i3);
                parcel.writeInt(c25557b.f66333a);
                parcel.writeLong(c25557b.f66334b);
            }
            parcel.writeLong(c25558c.f66339e);
            parcel.writeByte(c25558c.f66341g ? (byte) 1 : (byte) 0);
            parcel.writeLong(c25558c.f66342h);
            parcel.writeInt(c25558c.f66343i);
            parcel.writeInt(c25558c.f66344j);
            parcel.writeInt(c25558c.f66345k);
        }
    }

    private SpliceScheduleCommand(ArrayList arrayList) {
        this.f66332b = Collections.unmodifiableList(arrayList);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C25558c.m44364a(parcel));
        }
        this.f66332b = Collections.unmodifiableList(arrayList);
    }
}
