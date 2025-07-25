package com.monetization.ads.exo.metadata.scte35;

import com.monetization.ads.exo.metadata.Metadata;

/* loaded from: classes7.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
