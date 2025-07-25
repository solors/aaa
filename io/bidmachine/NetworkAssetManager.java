package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: io.bidmachine.e4 */
/* loaded from: classes9.dex */
class NetworkAssetManager {
    private static final String BID_MACHINE_ASSET_FILE_EXTENSION = "bmnetwork";
    private static final String BID_MACHINE_ASSET_PATH = "bm_networks";
    private static final String KEY_CLASSPATH = "classpath";
    private static final String KEY_NAME = "name";
    private static final String KEY_SDK_VERSION = "sdk_version";
    private static final String KEY_VERSION = "version";
    @VisibleForTesting
    static final Map<String, NetworkAssetParams> networkAssetParamsMap = new ConcurrentHashMap();

    NetworkAssetManager() {
    }

    @Nullable
    private static NetworkAssetParams createNetworkParams(@NonNull AssetManager assetManager, @NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String readAssetByNetworkName = readAssetByNetworkName(assetManager, str);
        if (TextUtils.isEmpty(readAssetByNetworkName)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(readAssetByNetworkName);
        String optString = jSONObject.optString("name");
        String optString2 = jSONObject.optString("version");
        String optString3 = jSONObject.optString(KEY_CLASSPATH);
        String optString4 = jSONObject.optString(KEY_SDK_VERSION);
        if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4)) {
            return new NetworkAssetParams(optString, optString2, optString3, optString4);
        }
        return null;
    }

    @Nullable
    private static NetworkAssetParams findNetwork(@NonNull AssetManager assetManager, @NonNull String str) {
        NetworkAssetParams createNetworkParams = createNetworkParams(assetManager, str);
        if (createNetworkParams != null) {
            networkAssetParamsMap.put(createNetworkParams.getName(), createNetworkParams);
        }
        return createNetworkParams;
    }

    static void findNetworks(@NonNull Context context) {
        if (networkAssetParamsMap.size() > 0) {
            return;
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return;
            }
            for (String str : assets.list(BID_MACHINE_ASSET_PATH)) {
                findNetwork(assets, str);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static NetworkAssetParams getNetworkAssetParams(@NonNull Context context, @NonNull String str) {
        Map<String, NetworkAssetParams> map = networkAssetParamsMap;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return null;
            }
            return findNetwork(assets, str + "." + BID_MACHINE_ASSET_FILE_EXTENSION);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public static Map<String, NetworkAssetParams> getNetworkAssetParamsMap(@NonNull Context context) {
        Map<String, NetworkAssetParams> map = networkAssetParamsMap;
        if (map.size() > 0) {
            return map;
        }
        findNetworks(context);
        return map;
    }

    @Nullable
    private static String readAssetByNetworkName(@NonNull AssetManager assetManager, @NonNull String str) {
        try {
            return Utils.streamToString(assetManager.open("bm_networks/" + str));
        } catch (Throwable th) {
            Logger.m20086w(th);
            return null;
        }
    }
}
