package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.p370X.C11705Dx;
import com.facebook.ads.redexgen.p370X.C11707Dz;
import com.facebook.ads.redexgen.p370X.C11939I4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new C11705Dx();
    public final List<C11707Dz> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(C11707Dz.A01(parcel));
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, C11705Dx c11705Dx) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C11707Dz> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C11939I4 c11939i4) {
        int A0E = c11939i4.A0E();
        ArrayList arrayList = new ArrayList(A0E);
        for (int i = 0; i < A0E; i++) {
            arrayList.add(C11707Dz.A03(c11939i4));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            C11707Dz.A05(this.A00.get(i2), parcel);
        }
    }
}
