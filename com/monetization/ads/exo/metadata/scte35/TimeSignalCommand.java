package com.monetization.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.cc1;
import com.yandex.mobile.ads.impl.n02;

/* loaded from: classes7.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C25559a();

    /* renamed from: b */
    public final long f66346b;

    /* renamed from: c */
    public final long f66347c;

    /* renamed from: com.monetization.ads.exo.metadata.scte35.TimeSignalCommand$a */
    /* loaded from: classes7.dex */
    final class C25559a implements Parcelable.Creator<TimeSignalCommand> {
        C25559a() {
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand createFromParcel(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimeSignalCommand[] newArray(int i) {
            return new TimeSignalCommand[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static TimeSignalCommand m44361a(cc1 cc1Var, long j, n02 n02Var) {
        long m44362a = m44362a(j, cc1Var);
        return new TimeSignalCommand(m44362a, n02Var.m31718b(m44362a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f66346b);
        parcel.writeLong(this.f66347c);
    }

    private TimeSignalCommand(long j, long j2) {
        this.f66346b = j;
        this.f66347c = j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static long m44362a(long j, cc1 cc1Var) {
        long m35270t = cc1Var.m35270t();
        if ((128 & m35270t) != 0) {
            return 8589934591L & ((((m35270t & 1) << 32) | cc1Var.m35268v()) + j);
        }
        return -9223372036854775807L;
    }
}
