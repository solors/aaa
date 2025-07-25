package net.pubnative.lite.sdk.api;

import android.content.Context;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.C38595Ad;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public interface ApiClient {

    /* loaded from: classes10.dex */
    public interface AdRequestListener {
        void onFailure(Throwable th);

        void onSuccess(C38595Ad c38595Ad);
    }

    /* loaded from: classes10.dex */
    public interface TrackJSListener {
        void onFailure(Throwable th);

        void onSuccess(String str);
    }

    /* loaded from: classes10.dex */
    public interface TrackUrlListener {
        void onFailure(Throwable th);

        void onFinally(String str, String str2, int i);

        void onSuccess();
    }

    void getAd(String str, String str2, AdRequestListener adRequestListener);

    void getAd(AdRequest adRequest, String str, AdRequestListener adRequestListener);

    String getApiUrl();

    Context getContext();

    JSONObject getPlacementParams();

    void processStream(String str, AdRequestListener adRequestListener);

    void processStream(String str, AdRequest adRequest, Integer num, Integer num2, AdRequestListener adRequestListener);

    void processStream(AdResponse adResponse, Exception exc, AdRequestListener adRequestListener);

    void setApiUrl(String str);

    void setCustomUrl(String str);

    void trackJS(String str, TrackJSListener trackJSListener);

    void trackUrl(String str, String str2, String str3, TrackUrlListener trackUrlListener);
}
