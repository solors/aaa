package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.GeobFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dm */
/* loaded from: assets/audience_network.dex */
public class C11694Dm implements Parcelable.Creator<GeobFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final GeobFrame createFromParcel(Parcel parcel) {
        return new GeobFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final GeobFrame[] newArray(int i) {
        return new GeobFrame[i];
    }
}
