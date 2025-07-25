package com.facebook.ads.redexgen.p370X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.InternalFrame;

/* renamed from: com.facebook.ads.redexgen.X.Dp */
/* loaded from: assets/audience_network.dex */
public class C11697Dp implements Parcelable.Creator<InternalFrame> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00 */
    public final InternalFrame createFromParcel(Parcel parcel) {
        return new InternalFrame(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A01 */
    public final InternalFrame[] newArray(int i) {
        return new InternalFrame[i];
    }
}
