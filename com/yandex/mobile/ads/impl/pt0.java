package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.xs1;
import java.io.IOException;

/* loaded from: classes8.dex */
public interface pt0 extends xs1 {

    /* renamed from: com.yandex.mobile.ads.impl.pt0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31153a extends xs1.InterfaceC31839a<pt0> {
        /* renamed from: a */
        void mo30586a(pt0 pt0Var);
    }

    /* renamed from: a */
    long mo26222a(long j, qs1 qs1Var);

    /* renamed from: a */
    long mo26213a(v40[] v40VarArr, boolean[] zArr, ap1[] ap1VarArr, boolean[] zArr2, long j);

    /* renamed from: a */
    void mo26217a(InterfaceC31153a interfaceC31153a, long j);

    void discardBuffer(long j, boolean z);

    w02 getTrackGroups();

    void maybeThrowPrepareError() throws IOException;

    long readDiscontinuity();

    long seekToUs(long j);
}
