package io.bidmachine.ads.networks.nast;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* loaded from: classes9.dex */
public class NastConfig extends NetworkConfig {
    public NastConfig() {
        super(NastAdapter.KEY, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new NastAdapter();
    }
}
