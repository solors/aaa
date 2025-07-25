package p872s2;

import android.webkit.JavascriptInterface;
import com.helpshift.log.HSLogger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p752k3.C37382g;
import p752k3.C37383m;

/* renamed from: s2.c */
/* loaded from: classes5.dex */
public class HSChatToNativeBridge {

    /* renamed from: a */
    private final HSEventProxy f104050a;

    /* renamed from: b */
    private boolean f104051b;

    /* renamed from: c */
    private final HSChatEventsHandler f104052c;

    public HSChatToNativeBridge(HSEventProxy hSEventProxy, HSChatEventsHandler hSChatEventsHandler) {
        this.f104050a = hSEventProxy;
        this.f104052c = hSChatEventsHandler;
    }

    @JavascriptInterface
    public void getHelpcenterData() {
        HSLogger.m65441d("ChatNativeBridge", "Received event to get Aditional info of HC  from WC from webview.");
        this.f104052c.m12210g();
    }

    @JavascriptInterface
    public void onRemoveAnonymousUser() {
        this.f104052c.m12208i();
    }

    @JavascriptInterface
    public void onUIConfigChange(String str) {
        this.f104052c.m12205l(str);
    }

    @JavascriptInterface
    public void onWebSdkConfigLoad() {
        HSLogger.m65441d("ChatNativeBridge", "Received event when web sdk config loaded");
        if (this.f104051b) {
            return;
        }
        this.f104051b = true;
        this.f104052c.m12201p();
    }

    @JavascriptInterface
    public void onWebchatError() {
        HSLogger.m65441d("ChatNativeBridge", "Received error from webview.");
        this.f104052c.m12202o();
    }

    @JavascriptInterface
    public void removeLocalStorage(String str) {
        HSLogger.m65441d("ChatNativeBridge", "Received event to remove data from local store from webview.");
        this.f104052c.m12207j(str);
    }

    @JavascriptInterface
    public void requestConversationMetadata(String str) {
        this.f104052c.m12200q(str);
    }

    @JavascriptInterface
    public void sdkxMigrationLogSynced(boolean z) {
        this.f104052c.m12198s(z);
    }

    @JavascriptInterface
    public void sendEvent(String str) {
        HSLogger.m65441d("ChatNativeBridge", "Received event from webview.");
        if (this.f104050a != null && !C37383m.m18236d(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f104050a.m12162c(next, C37382g.m18253e(jSONObject.optString(next, "")));
                }
            } catch (JSONException e) {
                HSLogger.m65438e("ChatNativeBridge", "Error in sending public event", e);
            }
        }
    }

    @JavascriptInterface
    public void sendPushTokenSyncRequestData(String str) {
        this.f104052c.m12209h(str);
    }

    @JavascriptInterface
    public void sendUserAuthFailureEvent(String str) {
        if (this.f104050a != null && !C37383m.m18236d(str)) {
            String str2 = "Authentication Failure";
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("message")) {
                    String string = jSONObject.getString("message");
                    if (!C37383m.m18236d(string.trim())) {
                        str2 = string;
                    }
                }
            } catch (Exception unused) {
                HSLogger.m65439e("ChatNativeBridge", "Error in reading auth failure event ");
            }
            this.f104052c.m12204m();
            this.f104050a.m12163b(str2);
        }
    }

    @JavascriptInterface
    public void setGenericSdkData(String str) {
        this.f104052c.m12197t(str);
    }

    @JavascriptInterface
    public void setIssueExistsFlag(String str) {
        HSLogger.m65441d("ChatNativeBridge", "Received event to set the issue exist as -" + str);
        this.f104052c.m12196u(str);
    }

    @JavascriptInterface
    public void setLocalStorage(String str) {
        HSLogger.m65441d("ChatNativeBridge", "Received event to set data in local store from webview.");
        this.f104052c.m12206k(str);
    }

    @JavascriptInterface
    public void setPollingStatus(String str) {
        this.f104052c.m12195v(str);
    }

    @JavascriptInterface
    public void webchatJsFileLoaded() {
        this.f104052c.m12193x();
    }

    @JavascriptInterface
    public void widgetToggle(String str) {
        HSLogger.m65441d("ChatNativeBridge", "webchat widget toggle: " + str);
        if (!C37383m.m18236d(str) && this.f104051b) {
            try {
                if (new JSONObject(str).optBoolean("visible", false)) {
                    this.f104052c.m12201p();
                } else {
                    this.f104052c.m12203n();
                }
            } catch (JSONException e) {
                HSLogger.m65438e("ChatNativeBridge", "Error in closing the webchat", e);
            }
        }
    }
}
