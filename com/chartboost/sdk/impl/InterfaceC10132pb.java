package com.chartboost.sdk.impl;

/* renamed from: com.chartboost.sdk.impl.pb */
/* loaded from: classes3.dex */
public interface InterfaceC10132pb {

    /* renamed from: com.chartboost.sdk.impl.pb$a */
    /* loaded from: classes3.dex */
    public static final class C10133a {
        /* renamed from: a */
        public static /* synthetic */ void m80802a(InterfaceC10132pb interfaceC10132pb, long j, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    j = 500;
                }
                interfaceC10132pb.mo80721a(j);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startProgressUpdate");
        }
    }

    /* renamed from: com.chartboost.sdk.impl.pb$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC10134b {
        /* renamed from: d */
        long mo80801d();
    }

    /* renamed from: a */
    void mo80722a();

    /* renamed from: a */
    void mo80721a(long j);
}
