package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.bench.Benchmark;

@Keep
/* renamed from: com.facebook.ads.Ad */
/* loaded from: classes3.dex */
public interface InterfaceC10846Ad {

    @Keep
    /* renamed from: com.facebook.ads.Ad$LoadAdConfig */
    /* loaded from: classes3.dex */
    public interface LoadAdConfig {
    }

    @Keep
    /* renamed from: com.facebook.ads.Ad$LoadConfigBuilder */
    /* loaded from: classes3.dex */
    public interface LoadConfigBuilder {
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        LoadConfigBuilder withBid(String str);
    }

    @Benchmark
    void destroy();

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    String getPlacementId();

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    boolean isAdInvalidated();

    @Benchmark
    void loadAd();

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    void setExtraHints(ExtraHints extraHints);
}
