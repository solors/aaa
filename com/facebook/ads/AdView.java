package com.facebook.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.facebook.ads.InterfaceC10846Ad;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.infer.annotation.Nullsafe;

@Keep
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes3.dex */
public class AdView extends RelativeLayout implements InterfaceC10846Ad {
    private final AdViewApi mAdViewApi;
    private final AdViewParentApi mAdViewParentApi;

    @Keep
    /* loaded from: classes3.dex */
    public interface AdViewLoadConfig extends InterfaceC10846Ad.LoadAdConfig {
    }

    @Keep
    /* loaded from: classes3.dex */
    public interface AdViewLoadConfigBuilder extends InterfaceC10846Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.InterfaceC10846Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withAdListener(AdListener adListener);

        @Override // com.facebook.ads.InterfaceC10846Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        AdViewLoadConfigBuilder withBid(String str);
    }

    /* renamed from: com.facebook.ads.AdView$a */
    /* loaded from: classes3.dex */
    class C10847a implements AdViewParentApi {
        C10847a() {
        }

        @Override // com.facebook.ads.internal.api.AdViewParentApi
        @Benchmark
        public void onConfigurationChanged(Configuration configuration) {
            AdView.super.onConfigurationChanged(configuration);
        }
    }

    @Benchmark
    public AdView(Context context, String str, AdSize adSize) {
        super(context);
        C10847a c10847a = new C10847a();
        this.mAdViewParentApi = c10847a;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, adSize, c10847a, this);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public AdViewLoadConfigBuilder buildLoadAdConfig() {
        return this.mAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public void destroy() {
        this.mAdViewApi.destroy();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public String getPlacementId() {
        return this.mAdViewApi.getPlacementId();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    public boolean isAdInvalidated() {
        return this.mAdViewApi.isAdInvalidated();
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    @Benchmark
    public void loadAd() {
        this.mAdViewApi.loadAd();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        this.mAdViewApi.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.InterfaceC10846Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mAdViewApi.setExtraHints(extraHints);
    }

    @Benchmark
    public void loadAd(AdViewLoadConfig adViewLoadConfig) {
        this.mAdViewApi.loadAd(adViewLoadConfig);
    }

    @Benchmark
    public AdView(Context context, String str, String str2) throws Exception {
        super(context);
        C10847a c10847a = new C10847a();
        this.mAdViewParentApi = c10847a;
        this.mAdViewApi = DynamicLoaderFactory.makeLoader(context).createAdViewApi(context, str, str2, c10847a, this);
    }
}
