package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.Struct;

/* loaded from: classes9.dex */
public abstract class NetworkParamsImpl implements NetworkParams {
    @NonNull
    private final String networkKey;
    @NonNull
    private final String networkName;

    public NetworkParamsImpl(@NonNull String str, @NonNull String str2) {
        this.networkKey = str;
        this.networkName = str2;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
    @Nullable
    public abstract /* synthetic */ Struct getExt(@NonNull Context context);

    @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
    @NonNull
    public String getNetworkKey() {
        return this.networkKey;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
    @NonNull
    public String getNetworkName() {
        return this.networkName;
    }
}
