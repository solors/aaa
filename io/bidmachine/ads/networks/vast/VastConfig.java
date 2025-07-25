package io.bidmachine.ads.networks.vast;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* loaded from: classes9.dex */
public class VastConfig extends NetworkConfig {
    public VastConfig() {
        super("vast", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new VastAdapter();
    }
}
