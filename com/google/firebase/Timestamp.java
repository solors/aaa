package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RequiresApi;
import java.time.Instant;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38513v;
import p850qd.C39385c;

/* compiled from: Timestamp.kt */
@Metadata
/* loaded from: classes4.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {

    /* renamed from: b */
    private final long f42024b;

    /* renamed from: c */
    private final int f42025c;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp createFromParcel(@NotNull Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Timestamp(source.readLong(), source.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public Timestamp[] newArray(int i) {
            return new Timestamp[i];
        }
    };

    /* compiled from: Timestamp.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final Tuples<Long, Integer> m67409a(Date date) {
            long j = 1000;
            long time = date.getTime() / j;
            int time2 = (int) ((date.getTime() % j) * 1000000);
            if (time2 < 0) {
                return C38513v.m14532a(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000));
            }
            return C38513v.m14532a(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final void m67408b(long j, int i) {
            boolean z;
            boolean z2 = true;
            if (i >= 0 && i < 1000000000) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (-62135596800L > j || j >= 253402300800L) {
                    z2 = false;
                }
                if (z2) {
                    return;
                }
                throw new IllegalArgumentException(("Timestamp seconds out of range: " + j).toString());
            }
            throw new IllegalArgumentException(("Timestamp nanoseconds out of range: " + i).toString());
        }

        @NotNull
        public final Timestamp now() {
            return new Timestamp(new Date());
        }
    }

    public Timestamp(long j, int i) {
        Companion.m67408b(j, i);
        this.f42024b = j;
        this.f42025c = i;
    }

    @NotNull
    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj != this && (!(obj instanceof Timestamp) || compareTo((Timestamp) obj) != 0)) {
            return false;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.f42025c;
    }

    public final long getSeconds() {
        return this.f42024b;
    }

    public int hashCode() {
        long j = this.f42024b;
        return (((((int) j) * 37 * 37) + ((int) (j >> 32))) * 37) + this.f42025c;
    }

    @NotNull
    public final Date toDate() {
        return new Date((this.f42024b * 1000) + (this.f42025c / 1000000));
    }

    @RequiresApi(26)
    @NotNull
    public final Instant toInstant() {
        Instant ofEpochSecond;
        ofEpochSecond = Instant.ofEpochSecond(this.f42024b, this.f42025c);
        Intrinsics.checkNotNullExpressionValue(ofEpochSecond, "ofEpochSecond(seconds, nanoseconds.toLong())");
        return ofEpochSecond;
    }

    @NotNull
    public String toString() {
        return "Timestamp(seconds=" + this.f42024b + ", nanoseconds=" + this.f42025c + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f42024b);
        dest.writeInt(this.f42025c);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull Timestamp other) {
        int m12777e;
        Intrinsics.checkNotNullParameter(other, "other");
        m12777e = C39385c.m12777e(this, other, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp$compareTo$1
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new PropertyReference1Impl() { // from class: com.google.firebase.Timestamp$compareTo$2
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        });
        return m12777e;
    }

    public Timestamp(@NotNull Date date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Companion companion = Companion;
        Tuples m67409a = companion.m67409a(date);
        long longValue = ((Number) m67409a.m17632a()).longValue();
        int intValue = ((Number) m67409a.m17631b()).intValue();
        companion.m67408b(longValue, intValue);
        this.f42024b = longValue;
        this.f42025c = intValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @androidx.annotation.RequiresApi(26)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Timestamp(@org.jetbrains.annotations.NotNull java.time.Instant r3) {
        /*
            r2 = this;
            java.lang.String r0 = "time"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = p855r1.C39435c.m12706a(r3)
            int r3 = com.google.firebase.C17383g.m66823a(r3)
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.Timestamp.<init>(java.time.Instant):void");
    }
}
