package io.bidmachine.ads.networks.mraid;

import androidx.annotation.NonNull;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* loaded from: classes9.dex */
public class MraidConfig extends NetworkConfig {
    public MraidConfig() {
        super("mraid", null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.bidmachine.NetworkConfig
    @NonNull
    public NetworkAdapter createNetworkAdapter() {
        return new MraidAdapter();
    }
}
