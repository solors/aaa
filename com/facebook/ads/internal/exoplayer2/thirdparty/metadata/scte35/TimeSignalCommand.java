package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p370X.C11708E0;
import com.facebook.ads.redexgen.p370X.C11939I4;
import com.facebook.ads.redexgen.p370X.C11950IG;

/* loaded from: assets/audience_network.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C11708E0();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C11708E0 c11708e0) {
        this(j, j2);
    }

    public static long A00(C11939I4 c11939i4, long j) {
        long A0E = c11939i4.A0E();
        if ((128 & A0E) == 0) {
            return -9223372036854775807L;
        }
        long ptsTime = 1 & A0E;
        long firstByte = c11939i4.A0M();
        return (((ptsTime << 32) | firstByte) + j) & 8589934591L;
    }

    public static TimeSignalCommand A01(C11939I4 c11939i4, long j, C11950IG c11950ig) {
        long A00 = A00(c11939i4, j);
        return new TimeSignalCommand(A00, c11950ig.A07(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
