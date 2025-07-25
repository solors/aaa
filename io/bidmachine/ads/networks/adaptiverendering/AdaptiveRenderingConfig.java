package io.bidmachine.ads.networks.adaptiverendering;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* loaded from: classes9.dex */
public class AdaptiveRenderingConfig extends NetworkConfig {
    @NonNull
    static final String NATIVE_FEATURES_KEY = "features";

    public AdaptiveRenderingConfig() {
        super(AdaptiveRenderingAdapter.KEY, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new AdaptiveRenderingAdapter();
    }
}
