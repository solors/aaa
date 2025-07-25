package com.monetization.ads.exo.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.mp4.SlowMotionData;
import com.yandex.mobile.ads.impl.AbstractC31305rp;
import com.yandex.mobile.ads.impl.C30937nf;
import com.yandex.mobile.ads.impl.y32;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes7.dex */
public final class SlowMotionData implements Metadata.Entry {
    public static final Parcelable.Creator<SlowMotionData> CREATOR = new C25546a();

    /* renamed from: b */
    public final List<Segment> f66307b;

    /* loaded from: classes7.dex */
    public static final class Segment implements Parcelable {
        public static final Parcelable.Creator<Segment> CREATOR;

        /* renamed from: b */
        public final long f66308b;

        /* renamed from: c */
        public final long f66309c;

        /* renamed from: d */
        public final int f66310d;

        /* renamed from: com.monetization.ads.exo.metadata.mp4.SlowMotionData$Segment$a */
        /* loaded from: classes7.dex */
        final class C25545a implements Parcelable.Creator<Segment> {
            C25545a() {
            }

            @Override // android.os.Parcelable.Creator
            public final Segment createFromParcel(Parcel parcel) {
                return new Segment(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Segment[] newArray(int i) {
                return new Segment[i];
            }
        }

        static {
            new Comparator() { // from class: com.monetization.ads.exo.metadata.mp4.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SlowMotionData.Segment.m44371c((SlowMotionData.Segment) obj, (SlowMotionData.Segment) obj2);
                }
            };
            CREATOR = new C25545a();
        }

        public Segment(int i, long j, long j2) {
            boolean z;
            if (j < j2) {
                z = true;
            } else {
                z = false;
            }
            C30937nf.m31567a(z);
            this.f66308b = j;
            this.f66309c = j2;
            this.f66310d = i;
        }

        /* renamed from: a */
        public static /* synthetic */ int m44372a(Segment segment, Segment segment2) {
            return AbstractC31305rp.m29969b().mo29963a(segment.f66308b, segment2.f66308b).mo29963a(segment.f66309c, segment2.f66309c).mo29964a(segment.f66310d, segment2.f66310d).mo29965a();
        }

        /* renamed from: c */
        public static /* synthetic */ int m44371c(Segment segment, Segment segment2) {
            return m44372a(segment, segment2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Segment.class != obj.getClass()) {
                return false;
            }
            Segment segment = (Segment) obj;
            if (this.f66308b == segment.f66308b && this.f66309c == segment.f66309c && this.f66310d == segment.f66310d) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f66308b), Long.valueOf(this.f66309c), Integer.valueOf(this.f66310d)});
        }

        public final String toString() {
            long j = this.f66308b;
            long j2 = this.f66309c;
            int i = this.f66310d;
            int i2 = y32.f88010a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + j + ", endTimeMs=" + j2 + ", speedDivisor=" + i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.f66308b);
            parcel.writeLong(this.f66309c);
            parcel.writeInt(this.f66310d);
        }
    }

    /* renamed from: com.monetization.ads.exo.metadata.mp4.SlowMotionData$a */
    /* loaded from: classes7.dex */
    final class C25546a implements Parcelable.Creator<SlowMotionData> {
        C25546a() {
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, Segment.class.getClassLoader());
            return new SlowMotionData(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SlowMotionData[] newArray(int i) {
            return new SlowMotionData[i];
        }
    }

    public SlowMotionData(ArrayList arrayList) {
        this.f66307b = arrayList;
        C30937nf.m31567a(!m44373a(arrayList));
    }

    /* renamed from: a */
    private static boolean m44373a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j = ((Segment) arrayList.get(0)).f66309c;
        for (int i = 1; i < arrayList.size(); i++) {
            if (((Segment) arrayList.get(i)).f66308b < j) {
                return true;
            }
            j = ((Segment) arrayList.get(i)).f66309c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && SlowMotionData.class == obj.getClass()) {
            return this.f66307b.equals(((SlowMotionData) obj).f66307b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f66307b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f66307b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f66307b);
    }
}
