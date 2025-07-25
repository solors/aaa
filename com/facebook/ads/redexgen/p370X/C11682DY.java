package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;

/* renamed from: com.facebook.ads.redexgen.X.DY */
/* loaded from: assets/audience_network.dex */
public class C11682DY implements Parcelable.Creator<Metadata> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final Metadata createFromParcel(Parcel parcel) {
        return new Metadata(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final Metadata[] newArray(int i) {
        return new Metadata[0];
    }
}
