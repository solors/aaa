package com.applovin.impl;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.ArrayList;

/* renamed from: com.applovin.impl.b5 */
/* loaded from: classes2.dex */
public final class C4106b5 {
    /* renamed from: a */
    public AbstractC4247db m100568a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return AbstractC5102p2.m96600a(C3989a5.f4487t, (ArrayList) AbstractC4100b1.m100583a(readBundle.getParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM)));
    }
}
