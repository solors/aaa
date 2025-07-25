package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public interface xs1 {

    /* renamed from: com.yandex.mobile.ads.impl.xs1$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC31839a<T extends xs1> {
        /* renamed from: a */
        void mo27255a(T t);
    }

    boolean continueLoading(long j);

    long getBufferedPositionUs();

    long getNextLoadPositionUs();

    boolean isLoading();

    void reevaluateBuffer(long j);
}
