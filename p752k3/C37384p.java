package p752k3;

import android.app.Activity;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.annotation.RequiresApi;
import com.helpshift.log.HSLogger;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewUtil.java */
/* renamed from: k3.p */
/* loaded from: classes5.dex */
public class C37384p {
    /* renamed from: a */
    public static void m18226a(WebView webView, String str, ValueCallback<String> valueCallback) {
        webView.evaluateJavascript(str, valueCallback);
    }

    /* renamed from: b */
    private static Uri[] m18225b(Intent intent) {
        ClipData clipData;
        if (intent != null) {
            clipData = intent.getClipData();
        } else {
            clipData = null;
        }
        if (clipData == null) {
            return new Uri[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < clipData.getItemCount(); i++) {
            Uri uri = clipData.getItemAt(i).getUri();
            if (uri != null) {
                arrayList.add(uri);
            }
        }
        return (Uri[]) arrayList.toArray(new Uri[0]);
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    public static Uri[] m18224c(Intent intent, int i) {
        if (intent == null) {
            return null;
        }
        if (intent.getClipData() == null) {
            return WebChromeClient.FileChooserParams.parseResult(i, intent);
        }
        return m18225b(intent);
    }

    /* renamed from: d */
    public static void m18223d(Activity activity, String str) {
        if (activity != null) {
            if (C37383m.m18233g(str) && C37382g.m18254d(str)) {
                try {
                    activity.getWindow().setStatusBarColor(Color.parseColor(new JSONObject(str).optString("primaryColor", "#453FB9")));
                    return;
                } catch (JSONException e) {
                    HSLogger.m65438e("ViewUtil", "Error setting status bar color", e);
                    return;
                }
            }
            activity.getWindow().setStatusBarColor(Color.parseColor("#453FB9"));
        }
    }

    /* renamed from: e */
    public static void m18222e(View view, boolean z) {
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }
}
