package com.p551my.target.common;

import androidx.annotation.NonNull;
import com.p551my.target.C25832j;
import com.p551my.target.C26084s5;
import com.p551my.target.mediation.AdNetworkConfig;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.my.target.common.BaseAd */
/* loaded from: classes7.dex */
public abstract class BaseAd {
    @NonNull
    protected final C25832j adConfig;
    @NonNull
    private final AtomicBoolean isLoaded = new AtomicBoolean();
    @NonNull
    protected final C26084s5.C26085a metricFactory;

    public BaseAd(int i, @NonNull String str) {
        this.adConfig = C25832j.newConfig(i, str);
        this.metricFactory = C26084s5.m42913a(i);
    }

    @NonNull
    public CustomParams getCustomParams() {
        return this.adConfig.getCustomParams();
    }

    public boolean isLoadCalled() {
        return !this.isLoaded.compareAndSet(false, true);
    }

    public void setAdNetworkConfig(@NonNull String str, @NonNull AdNetworkConfig adNetworkConfig) {
        this.adConfig.setAdNetworkConfig(str, adNetworkConfig);
    }
}
