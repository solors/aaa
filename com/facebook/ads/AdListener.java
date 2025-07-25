package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
/* loaded from: classes3.dex */
public interface AdListener {
    @Benchmark
    void onAdClicked(InterfaceC10846Ad interfaceC10846Ad);

    @Benchmark
    void onAdLoaded(InterfaceC10846Ad interfaceC10846Ad);

    @Benchmark
    void onError(InterfaceC10846Ad interfaceC10846Ad, AdError adError);

    @Benchmark
    void onLoggingImpression(InterfaceC10846Ad interfaceC10846Ad);
}
