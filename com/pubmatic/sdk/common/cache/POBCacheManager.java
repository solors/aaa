package com.pubmatic.sdk.common.cache;

import android.content.Context;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBProfileInfo;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBCacheManager {
    @NonNull

    /* renamed from: c */
    private final Context f70078c;
    @NonNull

    /* renamed from: d */
    private final POBNetworkHandler f70079d;
    @Nullable

    /* renamed from: g */
    private String f70082g;
    @Nullable

    /* renamed from: h */
    private volatile String f70083h;
    @Nullable

    /* renamed from: j */
    private String f70085j;
    @Nullable

    /* renamed from: k */
    private String f70086k;

    /* renamed from: a */
    private final String f70076a = "POBCacheManager";

    /* renamed from: b */
    private final ExecutorService f70077b = Executors.newSingleThreadScheduledExecutor();
    @NonNull

    /* renamed from: l */
    private final Object f70087l = new Object();
    @NonNull

    /* renamed from: m */
    private final Object f70088m = new Object();
    @NonNull

    /* renamed from: n */
    private final Queue<JSONObject> f70089n = new ArrayDeque(3);
    @NonNull

    /* renamed from: o */
    private final Queue<JSONObject> f70090o = new ArrayDeque(3);
    @NonNull

    /* renamed from: e */
    private final Map<String, POBProfileInfo> f70080e = Collections.synchronizedMap(new HashMap());
    @NonNull

    /* renamed from: f */
    private final Set<String> f70081f = Collections.synchronizedSet(new HashSet());
    @NonNull

    /* renamed from: i */
    private final Object f70084i = new Object();

    /* loaded from: classes7.dex */
    public interface ProfileResultListener {
        void onProfileResult(boolean z);
    }

    /* loaded from: classes7.dex */
    public interface UserAgentListener {
        void onUserAgentReceived(@NonNull String str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.cache.POBCacheManager$a */
    /* loaded from: classes7.dex */
    public class RunnableC26694a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ POBMeasurementProvider.POBScriptListener f70091a;

        RunnableC26694a(POBMeasurementProvider.POBScriptListener pOBScriptListener) {
            this.f70091a = pOBScriptListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBUtils.runOnMainThread(new RunnableC26698a(this, POBUtils.readFromAssets(POBCacheManager.this.f70078c, "omsdk-v1.js")));
        }
    }

    /* renamed from: com.pubmatic.sdk.common.cache.POBCacheManager$b */
    /* loaded from: classes7.dex */
    class RunnableC26695b implements Runnable {
        RunnableC26695b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBCacheManager.this.f70083h == null) {
                synchronized (POBCacheManager.this.f70088m) {
                    POBCacheManager pOBCacheManager = POBCacheManager.this;
                    pOBCacheManager.f70083h = POBUtils.readFromAssets(pOBCacheManager.f70078c, "pob_mraid.js");
                }
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.cache.POBCacheManager$c */
    /* loaded from: classes7.dex */
    class RunnableC26696c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UserAgentListener f70094a;

        RunnableC26696c(UserAgentListener userAgentListener) {
            this.f70094a = userAgentListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (POBCacheManager.this.f70087l) {
                POBCacheManager pOBCacheManager = POBCacheManager.this;
                pOBCacheManager.f70086k = pOBCacheManager.fetchUserAgent();
                this.f70094a.onUserAgentReceived(POBCacheManager.this.f70086k);
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.common.cache.POBCacheManager$d */
    /* loaded from: classes7.dex */
    class C26697d implements POBNetworkHandler.POBNetworkListener<String> {

        /* renamed from: a */
        final /* synthetic */ String f70096a;

        /* renamed from: b */
        final /* synthetic */ ProfileResultListener f70097b;

        C26697d(String str, ProfileResultListener profileResultListener) {
            this.f70096a = str;
            this.f70097b = profileResultListener;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        /* renamed from: a */
        public void onSuccess(@Nullable String str) {
            String str2;
            POBLog.debug("POBCacheManager", "Received profile config for profile %s, response - %s", this.f70096a, str);
            if (POBUtils.isNullOrEmpty(str)) {
                POBCacheManager.this.m40639a(new POBError(1007, "Failed to fetch the config."), this.f70096a, this.f70097b);
                return;
            }
            try {
                POBCacheManager.this.f70080e.put(this.f70096a, POBProfileInfo.build(new JSONObject(str)));
                POBCacheManager.this.f70081f.remove(this.f70096a);
                ProfileResultListener profileResultListener = this.f70097b;
                if (profileResultListener != null) {
                    profileResultListener.onProfileResult(true);
                }
            } catch (JSONException e) {
                if (e.getMessage() != null) {
                    str2 = e.getMessage();
                } else {
                    str2 = "Error while parsing profile info.";
                }
                POBCacheManager.this.m40639a(new POBError(1007, str2), this.f70096a, this.f70097b);
            }
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(@NonNull POBError pOBError) {
            POBCacheManager.this.m40639a(pOBError, this.f70096a, this.f70097b);
        }
    }

    public POBCacheManager(@NonNull Context context, @NonNull POBNetworkHandler pOBNetworkHandler) {
        this.f70078c = context.getApplicationContext();
        this.f70079d = pOBNetworkHandler;
    }

    @NonNull
    @WorkerThread
    public String fetchUserAgent() {
        String str = this.f70086k;
        if (str != null) {
            return str;
        }
        try {
            return WebSettings.getDefaultUserAgent(this.f70078c);
        } catch (Exception e) {
            POBLog.error("POBCacheManager", "Failed to retrieve user agent from web view, %s", e.getLocalizedMessage());
            try {
                String property = System.getProperty("http.agent");
                if (property == null) {
                    return "";
                }
                return property;
            } catch (Exception e2) {
                POBLog.error("POBCacheManager", "Failed to retrieve user agent (using http.agent) from WebView, %s", e2.getLocalizedMessage());
                return "";
            }
        }
    }

    public void generateUserAgent(@NonNull UserAgentListener userAgentListener) {
        String str = this.f70086k;
        if (str != null) {
            userAgentListener.onUserAgentReceived(str);
        }
        POBUtils.runOnBackgroundThread(new RunnableC26696c(userAgentListener));
    }

    @NonNull
    public JSONArray getCachedBidResponses() {
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject : this.f70090o) {
            jSONArray.put(jSONObject);
        }
        for (JSONObject jSONObject2 : this.f70089n) {
            jSONArray.put(jSONObject2);
        }
        return jSONArray;
    }

    @Nullable
    public String getMraidJs() {
        if (this.f70083h == null) {
            this.f70083h = POBUtils.readFromAssets(this.f70078c, "pob_mraid.js");
        }
        return this.f70083h;
    }

    @Nullable
    public POBProfileInfo getProfileInfo(@NonNull String str) {
        return this.f70080e.get(str);
    }

    @Nullable
    public String getPublisherId() {
        return this.f70085j;
    }

    @NonNull
    public String getUserAgent() {
        String str = this.f70086k;
        if (str == null) {
            return "";
        }
        return str;
    }

    public void loadInternalServiceJS(@NonNull POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        synchronized (this.f70084i) {
            String str = this.f70082g;
            if (str != null) {
                pOBScriptListener.onMeasurementScriptReceived(str);
            }
        }
        if (this.f70082g == null) {
            loadLocalOmidScript(pOBScriptListener);
        }
    }

    public void loadLocalOmidScript(@Nullable POBMeasurementProvider.POBScriptListener pOBScriptListener) {
        this.f70077b.submit(new RunnableC26694a(pOBScriptListener));
    }

    public void loadMraidJs() {
        if (this.f70083h != null) {
            return;
        }
        this.f70077b.submit(new RunnableC26695b());
    }

    public void requestProfileConfiguration(@NonNull String str, int i, @Nullable Integer num, @Nullable ProfileResultListener profileResultListener) {
        this.f70085j = str;
        String mappingKey = POBUtils.getMappingKey(i, num);
        if (this.f70081f.contains(mappingKey)) {
            if (profileResultListener != null) {
                profileResultListener.onProfileResult(false);
                return;
            }
            return;
        }
        POBProfileInfo pOBProfileInfo = this.f70080e.get(mappingKey);
        if (pOBProfileInfo != null && !pOBProfileInfo.isProfileInfoExpired()) {
            POBLog.debug("POBCacheManager", "ProfileInfo already available for profileId: %s", mappingKey);
            if (profileResultListener != null) {
                profileResultListener.onProfileResult(false);
            }
        } else if (!POBNetworkMonitor.isNetworkAvailable(this.f70078c)) {
            m40639a(new POBError(1003, "No network available"), mappingKey, profileResultListener);
        } else {
            String m40635a = m40635a(str, i, num);
            POBHttpRequest pOBHttpRequest = new POBHttpRequest();
            pOBHttpRequest.setUrl(m40635a);
            POBLog.debug("POBCacheManager", "Requesting profile config with url - : %s", m40635a);
            pOBHttpRequest.setTimeout(1000);
            this.f70081f.add(mappingKey);
            this.f70079d.sendRequest(pOBHttpRequest, new C26697d(mappingKey, profileResultListener));
        }
    }

    public void saveReceivedBid(@NonNull JSONObject jSONObject) {
        if (this.f70089n.size() == 3) {
            this.f70089n.remove();
        }
        this.f70089n.add(jSONObject);
    }

    public void saveRenderedBid(@NonNull JSONObject jSONObject) {
        this.f70089n.remove(jSONObject);
        if (this.f70090o.size() == 3) {
            this.f70090o.remove();
        }
        this.f70090o.add(jSONObject);
    }

    public boolean verifyCrashAnalyticsStatus() {
        for (POBProfileInfo pOBProfileInfo : this.f70080e.values()) {
            if (!pOBProfileInfo.isCrashAnalyticsEnabled()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m40639a(@NonNull POBError pOBError, @NonNull String str, @Nullable ProfileResultListener profileResultListener) {
        POBLog.error("POBCacheManager", "Failed to fetch config for profile %s with error: %s", str, pOBError.getErrorMessage());
        if (pOBError.getErrorCode() != 1003) {
            this.f70080e.put(str, new POBProfileInfo());
            if (profileResultListener != null) {
                profileResultListener.onProfileResult(true);
            }
        } else if (profileResultListener != null) {
            profileResultListener.onProfileResult(false);
        }
        this.f70081f.remove(str);
    }

    /* renamed from: a */
    private String m40635a(String str, int i, @Nullable Integer num) {
        return num != null ? String.format(Locale.ENGLISH, "https://ads.pubmatic.com/AdServer/js/pwt/%s/%d/%d/config.json", str, Integer.valueOf(i), num) : String.format(Locale.ENGLISH, "https://ads.pubmatic.com/AdServer/js/pwt/%s/%d/config.json", str, Integer.valueOf(i));
    }
}
