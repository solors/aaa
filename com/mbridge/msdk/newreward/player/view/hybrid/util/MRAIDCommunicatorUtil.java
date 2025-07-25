package com.mbridge.msdk.newreward.player.view.hybrid.util;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class MRAIDCommunicatorUtil {
    public static final String KEY_CURRENTORIENTATION = "currentAppOrientation";
    public static final String KEY_PLACEMENTTYPE = "placementType";
    public static final String KEY_STATE = "state";
    public static final String KEY_VIEWABLE = "viewable";
    public static final String PLACEMENT_INLINE = "inline";
    public static final String PLACEMENT_INTERSTITIAL = "Interstitial";
    public static final String STATES_DEFAULT = "default";
    public static final String STATES_EXPANDED = "expanded";
    public static final String STATES_HIDDEN = "hidden";
    public static final String STATES_LOADING = "loading";
    public static final String STATES_RESIZED = "resized";
    private static final String TAG = "MRAIDCommunicatorUtil";

    private static void call(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.evaluateJavascript(str, new ValueCallback<String>() { // from class: com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil.1
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(String str2) {
                    }
                });
            } catch (Throwable th) {
                SameLogTool.m51824b(TAG, th.getMessage());
            }
        }
    }

    public static void fireAudioVolumeChange(WebView webView, double d) {
        call(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.audioVolumeChange(%s);", Double.valueOf(d)));
    }

    public static void fireChangeEventForProperties(WebView webView, Map<String, Object> map) {
        if (map != null && map.size() != 0) {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), entry.getValue());
                } catch (Exception e) {
                    SameLogTool.m51824b(TAG, e.getMessage());
                }
            }
            call(webView, String.format("javascript:window.mraidbridge.fireChangeEvent(%s);", jSONObject.toString()));
        }
    }

    public static void fireErrorEvent(WebView webView, String str, String str2) {
        call(webView, String.format("javascript:window.mraidbridge.fireErrorEvent('%1s', '%2s');", str2, str));
    }

    public static void fireNativeMethodCompleteEvent(WebView webView, String str) {
        call(webView, String.format("javascript:window.mraidbridge.nativeCallComplete('%s');", str));
    }

    public static void fireReadyEvent(WebView webView) {
        call(webView, "javascript:window.mraidbridge.fireReadyEvent();");
    }

    public static void fireSetCurrentPosition(WebView webView, float f, float f2, float f3, float f4) {
        call(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setCurrentPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public static void fireSetDefaultPosition(WebView webView, float f, float f2, float f3, float f4) {
        call(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setDefaultPosition(%.1f, %.1f, %.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)));
    }

    public static void fireSetIsViewable(WebView webView, String str) {
        call(webView, String.format("javascript:window.mraidbridge.setIsViewable(%s);", str));
    }

    public static void fireSetMaxSize(WebView webView, float f, float f2) {
        call(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setMaxSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public static void fireSetPlacementType(WebView webView, String str) {
        call(webView, String.format("javascript:window.mraidbridge.setPlacementType(%s);", str));
    }

    public static void fireSetScreenSize(WebView webView, float f, float f2) {
        call(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.setScreenSize(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public static void fireSizeChangeEvent(WebView webView, float f, float f2) {
        call(webView, String.format(Locale.CHINA, "javascript:window.mraidbridge.notifySizeChangeEvent(%.1f, %.1f);", Float.valueOf(f), Float.valueOf(f2)));
    }

    public static void notifyMRAIDEnvironmentChange(WebView webView, String str) {
        if (webView == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("orientation", str);
            jSONObject.put("locked", "true");
            HashMap hashMap = new HashMap();
            hashMap.put(KEY_PLACEMENTTYPE, "Interstitial");
            hashMap.put("state", "default");
            hashMap.put(KEY_VIEWABLE, "true");
            hashMap.put(KEY_CURRENTORIENTATION, jSONObject);
            Context context = webView.getContext();
            if (context instanceof Activity) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                fireSetScreenSize(webView, SameDiTool.m51882j(context), SameDiTool.m51886h(context));
                fireSetMaxSize(webView, displayMetrics.widthPixels, displayMetrics.heightPixels);
            }
            fireSetDefaultPosition(webView, webView.getLeft(), webView.getTop(), webView.getWidth(), webView.getHeight());
            fireSetCurrentPosition(webView, webView.getLeft(), webView.getTop(), webView.getWidth(), webView.getHeight());
            fireChangeEventForProperties(webView, hashMap);
            fireAudioVolumeChange(webView, MBHybridUtil.getCurrentVolume(context));
            fireReadyEvent(webView);
        } catch (Throwable th) {
            SameLogTool.m51824b(TAG, th.getMessage());
        }
    }
}
