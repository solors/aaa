package io.bidmachine;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public abstract class NetworkConfig {
    static final String CONFIG_SKIP_INITIALIZATION = "skip_initialization";
    @Nullable
    private Map<String, String> baseMediationConfig;
    @Nullable
    private AdsType[] mergedAdsTypes;
    @NonNull
    private final String networkKey;
    @Nullable
    private AdsType[] supportedAdsTypes;
    @Nullable
    private EnumMap<AdsFormat, List<Map<String, String>>> typedMediationConfigs;
    @NonNull
    private final NetworkConfigParams networkConfigParams = new C35193a();
    @NonNull
    private final Map<String, String> networkParams = new HashMap();

    /* renamed from: io.bidmachine.NetworkConfig$a */
    /* loaded from: classes9.dex */
    class C35193a implements NetworkConfigParams {
        C35193a() {
        }

        @Override // io.bidmachine.NetworkConfigParams
        @Nullable
        public String getFromNetworkParams(@NonNull String str) {
            return (String) NetworkConfig.this.networkParams.get(str);
        }

        @Override // io.bidmachine.NetworkConfigParams
        @Nullable
        public EnumMap<AdsFormat, List<Map<String, String>>> obtainNetworkMediationConfigs(AdsFormat... adsFormatArr) {
            ArrayList arrayList;
            List list;
            Map<String, String> map;
            if (adsFormatArr == null || adsFormatArr.length <= 0) {
                return null;
            }
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = null;
            for (AdsFormat adsFormat : adsFormatArr) {
                if (NetworkConfig.this.typedMediationConfigs != null && (list = (List) NetworkConfig.this.typedMediationConfigs.get(adsFormat)) != null) {
                    arrayList = null;
                    for (int i = 0; i < list.size(); i++) {
                        Map map2 = (Map) list.get(i);
                        if (map2 != null) {
                            map = NetworkConfig.this.prepareTypedMediationConfig(map2);
                        } else {
                            map = null;
                        }
                        if (map != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(map);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    if (enumMap == null) {
                        enumMap = new EnumMap<>(AdsFormat.class);
                    }
                    enumMap.put((EnumMap<AdsFormat, List<Map<String, String>>>) adsFormat, (AdsFormat) arrayList);
                }
            }
            return enumMap;
        }

        @Override // io.bidmachine.NetworkConfigParams
        @NonNull
        public Map<String, String> obtainNetworkParams() {
            return new HashMap(NetworkConfig.this.networkParams);
        }

        @Override // io.bidmachine.NetworkConfigParams
        @Nullable
        public String removeFromNetworkParams(@NonNull String str) {
            return (String) NetworkConfig.this.networkParams.remove(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public NetworkConfig(@NonNull String str, @Nullable Map<String, String> map) {
        this.networkKey = str;
        withNetworkParams(map);
    }

    private boolean contains(@NonNull Object[] objArr, @NonNull Object obj) {
        for (Object obj2 : objArr) {
            if (obj2 == obj) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Map<String, String> prepareTypedMediationConfig(@NonNull Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (useNetworkParamsAsMediationBase()) {
            hashMap.putAll(this.networkParams);
        }
        Map<String, String> map2 = this.baseMediationConfig;
        if (map2 != null) {
            hashMap.putAll(map2);
        }
        hashMap.putAll(map);
        return hashMap;
    }

    @NonNull
    public <T extends UnifiedAdRequestParams> List<NetworkAdUnit> createNetworkAdUnitList(@NonNull AdsType adsType, @NonNull T t, @NonNull AdContentType adContentType, @NonNull NetworkAdapter networkAdapter) {
        List<Map<String, String>> value;
        ArrayList arrayList = new ArrayList();
        EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
        if (enumMap != null) {
            for (Map.Entry<AdsFormat, List<Map<String, String>>> entry : enumMap.entrySet()) {
                AdsFormat key = entry.getKey();
                if (key.isMatch(adsType, t, adContentType) && (value = entry.getValue()) != null) {
                    for (Map<String, String> map : value) {
                        arrayList.add(new NetworkAdUnit(networkAdapter, key, prepareTypedMediationConfig(map)));
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public abstract NetworkAdapter createNetworkAdapter();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return getNetworkKey().equals(((NetworkConfig) obj).getNetworkKey());
        }
        return false;
    }

    public NetworkConfig forAdTypes(@NonNull AdsType... adsTypeArr) {
        this.supportedAdsTypes = adsTypeArr;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public NetworkConfigParams getNetworkConfigParams() {
        return this.networkConfigParams;
    }

    @NonNull
    public String getNetworkKey() {
        return this.networkKey;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public AdsType[] getSupportedAdsTypes(@NonNull NetworkAdapter networkAdapter) {
        AdsType[] supportedTypes;
        if (this.mergedAdsTypes == null) {
            ArrayList arrayList = new ArrayList();
            for (AdsType adsType : networkAdapter.getSupportedTypes()) {
                AdsType[] adsTypeArr = this.supportedAdsTypes;
                if (adsTypeArr == null || contains(adsTypeArr, adsType)) {
                    arrayList.add(adsType);
                }
            }
            this.mergedAdsTypes = (AdsType[]) arrayList.toArray(new AdsType[0]);
        }
        return this.mergedAdsTypes;
    }

    public int hashCode() {
        return getNetworkKey().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected <T extends NetworkConfig> T internalSetSkipInitialization(boolean z) {
        setNetworkParam(CONFIG_SKIP_INITIALIZATION, String.valueOf(z));
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setBaseMediationParam(@NonNull String str, @NonNull String str2) {
        if (this.baseMediationConfig == null) {
            this.baseMediationConfig = new HashMap();
        }
        this.baseMediationConfig.put(str, str2);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T setNetworkParam(@NonNull String str, @NonNull String str2) {
        this.networkParams.put(str, str2);
        return this;
    }

    protected boolean useNetworkParamsAsMediationBase() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withBaseMediationConfig(@Nullable Map<String, String> map) {
        this.baseMediationConfig = map;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdsFormat adsFormat, @Nullable Map<String, String> map) {
        if (map == null) {
            EnumMap<AdsFormat, List<Map<String, String>>> enumMap = this.typedMediationConfigs;
            if (enumMap != null) {
                enumMap.remove(adsFormat);
            }
        } else {
            if (this.typedMediationConfigs == null) {
                this.typedMediationConfigs = new EnumMap<>(AdsFormat.class);
            }
            List<Map<String, String>> list = this.typedMediationConfigs.get(adsFormat);
            if (list == null) {
                list = new ArrayList<>();
                this.typedMediationConfigs.put((EnumMap<AdsFormat, List<Map<String, String>>>) adsFormat, (AdsFormat) list);
            }
            list.add(map);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends NetworkConfig> T withNetworkParams(@Nullable Map<String, String> map) {
        this.networkParams.clear();
        if (map != null) {
            this.networkParams.putAll(map);
        }
        return this;
    }

    @Deprecated
    public <T extends NetworkConfig> T withMediationConfig(@NonNull AdsFormat adsFormat, @Nullable Map<String, String> map, @Nullable Orientation orientation) {
        Logger.m20087w("The parameter 'orientation' is no longer supported and has no effect.");
        return (T) withMediationConfig(adsFormat, map);
    }
}
