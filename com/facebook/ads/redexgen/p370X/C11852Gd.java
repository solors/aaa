package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.trackselection.DefaultTrackSelector$Parameters;

/* renamed from: com.facebook.ads.redexgen.X.Gd */
/* loaded from: assets/audience_network.dex */
public class C11852Gd implements Parcelable.Creator<DefaultTrackSelector$Parameters> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final DefaultTrackSelector$Parameters createFromParcel(Parcel parcel) {
        return new DefaultTrackSelector$Parameters(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final DefaultTrackSelector$Parameters[] newArray(int i) {
        return new DefaultTrackSelector$Parameters[i];
    }
}
