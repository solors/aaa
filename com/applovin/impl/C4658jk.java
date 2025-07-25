package com.applovin.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Objects;
import com.applovin.impl.C4061af;
import com.applovin.impl.C4658jk;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.applovin.impl.jk */
/* loaded from: classes2.dex */
public final class C4658jk implements C4061af.InterfaceC4063b {
    public static final Parcelable.Creator<C4658jk> CREATOR = new C4659a();

    /* renamed from: a */
    public final List f7225a;

    public C4658jk(List list) {
        this.f7225a = list;
        AbstractC4100b1.m100580a(!m98160a(list));
    }

    /* renamed from: a */
    private static boolean m98160a(List list) {
        if (list.isEmpty()) {
            return false;
        }
        long j = ((C4660b) list.get(0)).f7228b;
        for (int i = 1; i < list.size(); i++) {
            if (((C4660b) list.get(i)).f7227a < j) {
                return true;
            }
            j = ((C4660b) list.get(i)).f7228b;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4658jk.class == obj.getClass()) {
            return this.f7225a.equals(((C4658jk) obj).f7225a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7225a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f7225a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f7225a);
    }

    /* renamed from: com.applovin.impl.jk$a */
    /* loaded from: classes2.dex */
    class C4659a implements Parcelable.Creator {
        C4659a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4658jk createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C4660b.class.getClassLoader());
            return new C4658jk(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C4658jk[] newArray(int i) {
            return new C4658jk[i];
        }
    }

    /* renamed from: com.applovin.impl.jk$b */
    /* loaded from: classes2.dex */
    public static final class C4660b implements Parcelable {

        /* renamed from: a */
        public final long f7227a;

        /* renamed from: b */
        public final long f7228b;

        /* renamed from: c */
        public final int f7229c;

        /* renamed from: d */
        public static final Comparator f7226d = new Comparator() { // from class: com.applovin.impl.ry
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int m98157a;
                m98157a = C4658jk.C4660b.m98157a((C4658jk.C4660b) obj, (C4658jk.C4660b) obj2);
                return m98157a;
            }
        };
        public static final Parcelable.Creator<C4660b> CREATOR = new C4661a();

        public C4660b(long j, long j2, int i) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            AbstractC4100b1.m100580a(z);
            this.f7227a = j;
            this.f7228b = j2;
            this.f7229c = i;
        }

        /* renamed from: a */
        public static /* synthetic */ int m98157a(C4660b c4660b, C4660b c4660b2) {
            return AbstractC5892y3.m92827e().mo92824a(c4660b.f7227a, c4660b2.f7227a).mo92824a(c4660b.f7228b, c4660b2.f7228b).mo92825a(c4660b.f7229c, c4660b2.f7229c).mo92820d();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4660b.class != obj.getClass()) {
                return false;
            }
            C4660b c4660b = (C4660b) obj;
            if (this.f7227a == c4660b.f7227a && this.f7228b == c4660b.f7228b && this.f7229c == c4660b.f7229c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(Long.valueOf(this.f7227a), Long.valueOf(this.f7228b), Integer.valueOf(this.f7229c));
        }

        public String toString() {
            return AbstractC5863xp.m93012a("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f7227a), Long.valueOf(this.f7228b), Integer.valueOf(this.f7229c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f7227a);
            parcel.writeLong(this.f7228b);
            parcel.writeInt(this.f7229c);
        }

        /* renamed from: com.applovin.impl.jk$b$a */
        /* loaded from: classes2.dex */
        class C4661a implements Parcelable.Creator {
            C4661a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4660b createFromParcel(Parcel parcel) {
                return new C4660b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4660b[] newArray(int i) {
                return new C4660b[i];
            }
        }
    }
}
