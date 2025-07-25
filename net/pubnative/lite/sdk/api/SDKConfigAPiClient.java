package net.pubnative.lite.sdk.api;

import android.content.Context;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.models.AtomConfig;
import net.pubnative.lite.sdk.models.AtomConfigResponse;
import net.pubnative.lite.sdk.network.PNHttpClient;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class SDKConfigAPiClient {
    String mAppToken;
    Context mContext;
    String url = "";
    private final Boolean ATOM_DEFAULT_VALUE = Boolean.FALSE;

    /* loaded from: classes10.dex */
    public interface AtomConfigListener {
        void onAtomValueFetched(Boolean bool);
    }

    public SDKConfigAPiClient(Context context) {
        this.mContext = context;
    }

    private void fetchAtomConfigValue(AtomConfigResponse atomConfigResponse, AtomConfigListener atomConfigListener) {
        atomConfigListener.onAtomValueFetched(atomConfigResponse.configs.isAtomEnabled());
    }

    public void fetchConfig(final AtomConfigListener atomConfigListener) {
        String str = this.mAppToken;
        if (str != null && !str.isEmpty() && this.mContext != null) {
            String format = String.format(this.url, this.mAppToken);
            this.url = format;
            PNHttpClient.makeRequest(this.mContext, format, null, null, false, true, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.api.SDKConfigAPiClient.1
                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onFailure(Throwable th) {
                    atomConfigListener.onAtomValueFetched(SDKConfigAPiClient.this.ATOM_DEFAULT_VALUE);
                }

                @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                public void onSuccess(String str2, Map<String, List<String>> map) {
                    SDKConfigAPiClient.this.processStream(str2, atomConfigListener);
                }
            });
            return;
        }
        atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
    }

    public void processStream(String str, AtomConfigListener atomConfigListener) {
        try {
            processStream(new AtomConfigResponse(new JSONObject(str)), atomConfigListener);
        } catch (Error | Exception unused) {
            atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
        }
    }

    public void setAppToken(String str) {
        this.mAppToken = str;
    }

    public void processStream(AtomConfigResponse atomConfigResponse, AtomConfigListener atomConfigListener) {
        AtomConfig atomConfig;
        if (atomConfigResponse != null && (atomConfig = atomConfigResponse.configs) != null && atomConfig.app_level != null) {
            if ("ok".equals(atomConfigResponse.status)) {
                fetchAtomConfigValue(atomConfigResponse, atomConfigListener);
                return;
            } else {
                atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
                return;
            }
        }
        atomConfigListener.onAtomValueFetched(this.ATOM_DEFAULT_VALUE);
    }
}
