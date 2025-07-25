package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes9.dex */
public class NetworkAdUnit {
    @NonNull
    private final AdsFormat adsFormat;
    @NonNull

    /* renamed from: id */
    private final String f95966id = UUID.randomUUID().toString();
    @NonNull
    private final Map<String, String> mediationConfig;
    @NonNull
    private final NetworkAdapter networkAdapter;

    public NetworkAdUnit(@NonNull NetworkAdapter networkAdapter, @NonNull AdsFormat adsFormat, @NonNull Map<String, String> map) {
        this.networkAdapter = networkAdapter;
        this.adsFormat = adsFormat;
        this.mediationConfig = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearAuction() throws Throwable {
        getNetworkAdapter().clearAuction(this);
    }

    @NonNull
    public AdsFormat getAdsFormat() {
        return this.adsFormat;
    }

    @NonNull
    public String getId() {
        return this.f95966id;
    }

    @NonNull
    public Map<String, String> getMediationConfig() {
        return this.mediationConfig;
    }

    @Nullable
    public String getMediationParameter(@NonNull String str) {
        return this.mediationConfig.get(str);
    }

    @NonNull
    public NetworkAdapter getNetworkAdapter() {
        return this.networkAdapter;
    }

    public String getNetworkKey() {
        return this.networkAdapter.getKey();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onLossAuction() throws Throwable {
        getNetworkAdapter().onLossAuction(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onWinAuction() throws Throwable {
        getNetworkAdapter().onWinAuction(this);
    }
}
