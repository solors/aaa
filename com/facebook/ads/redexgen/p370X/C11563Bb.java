package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.drm.DrmInitData;

/* renamed from: com.facebook.ads.redexgen.X.Bb */
/* loaded from: assets/audience_network.dex */
public class C11563Bb implements Parcelable.Creator<DrmInitData.SchemeData> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DrmInitData.SchemeData createFromParcel(Parcel parcel) {
        return new DrmInitData.SchemeData(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DrmInitData.SchemeData[] newArray(int i) {
        return new DrmInitData.SchemeData[i];
    }
}
