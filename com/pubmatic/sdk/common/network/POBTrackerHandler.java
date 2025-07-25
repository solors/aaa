package com.pubmatic.sdk.common.network;

import android.annotation.SuppressLint;
import android.net.Uri;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBHttpRequest;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBTrackerHandler {
    @NonNull

    /* renamed from: a */
    private final POBNetworkHandler f70246a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.common.network.POBTrackerHandler$a */
    /* loaded from: classes7.dex */
    public class C26718a implements POBNetworkHandler.POBNetworkListener<String> {

        /* renamed from: a */
        final /* synthetic */ String f70247a;

        C26718a(String str) {
            this.f70247a = str;
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        /* renamed from: a */
        public void onSuccess(@Nullable String str) {
            POBLog.debug("PMTrackerHandler", "Successfully executed tracker url : " + this.f70247a, new Object[0]);
        }

        @Override // com.pubmatic.sdk.common.network.POBNetworkHandler.POBNetworkListener
        public void onFailure(@NonNull POBError pOBError) {
            POBLog.error("PMTrackerHandler", "Failed to execute tracker url : " + this.f70247a, "\n Error : " + pOBError.getErrorMessage());
        }
    }

    public POBTrackerHandler(@NonNull POBNetworkHandler pOBNetworkHandler) {
        this.f70246a = pOBNetworkHandler;
    }

    @NonNull
    public static List<String> sanitizeURLScheme(@Nullable List<String> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                String sanitizeURLScheme = sanitizeURLScheme(str, z);
                if (sanitizeURLScheme != null) {
                    arrayList.add(sanitizeURLScheme);
                }
            }
        } else {
            POBLog.debug("PMTrackerHandler", "Unable to sanitize urls as list is null", new Object[0]);
        }
        return arrayList;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    @MainThread
    public void executeJsScripts(@NonNull POBWebView pOBWebView, @NonNull String str) {
        POBLog.debug("PMTrackerHandler", "Executing js tracker script: " + str, new Object[0]);
        pOBWebView.getSettings().setJavaScriptEnabled(true);
        pOBWebView.loadDataWithBaseURL(null, str, "text/html", StandardCharsets.UTF_8.name(), null);
    }

    public void handleTrackersForError(@Nullable List<String> list, @Nullable Map<Object, Object> map, @Nullable Map<String, String> map2) {
        if (list != null && list.size() > 0) {
            for (String str : list) {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                if (map2 != null && !map2.isEmpty() && host != null && host.contains("pubmatic.com")) {
                    str = POBUtils.buildUriWithQueryParams(parse, map2);
                }
                sendTracker(str, map);
            }
        }
    }

    public void sendTracker(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            POBLog.error("PMTrackerHandler", "Failed to execute tracker url: " + str, new Object[0]);
            return;
        }
        POBLog.debug("PMTrackerHandler", "Executing tracker for url: %s", str);
        POBHttpRequest pOBHttpRequest = new POBHttpRequest();
        pOBHttpRequest.setUrl(str);
        pOBHttpRequest.setRetryCount(3);
        pOBHttpRequest.setRequestMethod(POBHttpRequest.HTTP_METHOD.GET);
        pOBHttpRequest.setTimeout(10000);
        this.f70246a.sendRequest(pOBHttpRequest, new C26718a(str));
    }

    public void sendTrackers(@Nullable List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                sendTracker(str);
            }
            return;
        }
        POBLog.error("PMTrackerHandler", "Failed to execute tracker url: " + list, new Object[0]);
    }

    public void sendTrackers(@Nullable List<String> list, @Nullable Map<Object, Object> map) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (String str : list) {
            sendTracker(str, map);
        }
    }

    @Nullable
    public static String sanitizeURLScheme(@Nullable String str, boolean z) {
        try {
        } catch (Exception e) {
            POBLog.debug("PMTrackerHandler", "Error occurred while sanitizing url %s. Reason - %s", str, e.getMessage());
        }
        if (!POBUtils.isNullOrEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse == null || parse.getScheme() != null) {
                return str;
            }
            return parse.buildUpon().scheme(z ? "https" : "http").build().toString();
        }
        POBLog.debug("PMTrackerHandler", "Unable to sanitize url - %s", str);
        return null;
    }

    public void sendTracker(@Nullable String str, @Nullable Map<Object, Object> map) {
        if (!POBUtils.isNullOrEmpty(str)) {
            if (map != null && map.size() > 0) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    str = str.replace(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
                }
            }
            sendTracker(str);
            return;
        }
        POBLog.error("PMTrackerHandler", "Empty tracker url.", new Object[0]);
    }

    public void sendTracker(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (!POBUtils.isNullOrEmpty(str)) {
            if (str2 != null && str3 != null) {
                str = str.replace(str2, str3);
            }
            sendTracker(str);
            return;
        }
        POBLog.error("PMTrackerHandler", "Unable to send tracker for url - %s.", str);
    }
}
