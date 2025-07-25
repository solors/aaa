package com.monetization.ads.exo.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes7.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new C25555a();

    /* renamed from: com.monetization.ads.exo.metadata.scte35.SpliceNullCommand$a */
    /* loaded from: classes7.dex */
    final class C25555a implements Parcelable.Creator<SpliceNullCommand> {
        C25555a() {
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand createFromParcel(Parcel parcel) {
            return new SpliceNullCommand();
        }

        @Override // android.os.Parcelable.Creator
        public final SpliceNullCommand[] newArray(int i) {
            return new SpliceNullCommand[i];
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
