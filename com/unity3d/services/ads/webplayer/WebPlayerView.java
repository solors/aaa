package com.unity3d.services.ads.webplayer;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ClientCertRequest;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.HttpAuthHandler;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p978t3.WebViewRenderException;

/* loaded from: classes7.dex */
public class WebPlayerView extends WebView {
    private Map<String, String> _erroredSettings;
    private Method _evaluateJavascript;
    private JSONObject _eventSettings;
    private Runnable _unsubscribeLayoutChange;
    private String viewId;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes7.dex */
    public class JavaScriptInvocation implements Runnable {
        private String _jsString;
        private WebView _webView;

        public JavaScriptInvocation(String str, WebView webView) {
            this._jsString = str;
            this._webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this._jsString != null) {
                try {
                    WebPlayerView.this._evaluateJavascript.invoke(this._webView, this._jsString, null);
                    return;
                } catch (Exception e) {
                    DeviceLog.exception("Error while processing JavaScriptString", e);
                    return;
                }
            }
            DeviceLog.error("Could not process JavaScript, the string is NULL");
        }
    }

    @TargetApi(21)
    /* loaded from: classes7.dex */
    private class WebPlayerChromeClient extends WebChromeClient {
        private WebPlayerChromeClient() {
        }

        @Override // android.webkit.WebChromeClient
        public void onCloseWindow(WebView webView) {
            if (WebPlayerView.this.shouldCallSuper("onCloseWindow")) {
                super.onCloseWindow(webView);
            }
            if (WebPlayerView.this.shouldSendEvent("onCloseWindow")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CLOSE_WINDOW, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            String str;
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("onConsoleMessage")) {
                bool = Boolean.valueOf(super.onConsoleMessage(consoleMessage));
            }
            if (WebPlayerView.this.shouldSendEvent("onConsoleMessage")) {
                if (consoleMessage != null) {
                    str = consoleMessage.message();
                } else {
                    str = "";
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CONSOLE_MESSAGE, str, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("onConsoleMessage")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("onConsoleMessage", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            Boolean bool;
            Boolean bool2 = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("onCreateWindow")) {
                bool = Boolean.valueOf(super.onCreateWindow(webView, z, z2, message));
            } else {
                bool = bool2;
            }
            if (WebPlayerView.this.shouldSendEvent("onCreateWindow")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CREATE_WINDOW, Boolean.valueOf(z), Boolean.valueOf(z2), message, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("onCreateWindow")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("onCreateWindow", Boolean.class, bool2);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            if (WebPlayerView.this.shouldCallSuper("onGeolocationPermissionsShowPrompt")) {
                super.onGeolocationPermissionsShowPrompt(str, callback);
            }
            if (WebPlayerView.this.shouldSendEvent("onGeolocationPermissionsShowPrompt")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.GEOLOCATION_PERMISSIONS_SHOW, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            if (WebPlayerView.this.shouldCallSuper("onHideCustomView")) {
                super.onHideCustomView();
            }
            if (WebPlayerView.this.shouldSendEvent("onHideCustomView")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HIDE_CUSTOM_VIEW, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("onJsAlert")) {
                bool = Boolean.valueOf(super.onJsAlert(webView, str, str2, jsResult));
            }
            if (WebPlayerView.this.shouldSendEvent("onJsAlert")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_ALERT, str, str2, jsResult, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("onJsAlert")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("onJsAlert", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("onJsConfirm")) {
                bool = Boolean.valueOf(super.onJsConfirm(webView, str, str2, jsResult));
            }
            if (WebPlayerView.this.shouldSendEvent("onJsConfirm")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_CONFIRM, str, str2, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("onJsConfirm")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("onJsConfirm", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("onJsPrompt")) {
                bool = Boolean.valueOf(super.onJsPrompt(webView, str, str2, str3, jsPromptResult));
            }
            if (WebPlayerView.this.shouldSendEvent("onJsPrompt")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.JS_PROMPT, str, str2, str3, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("onJsPrompt")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("onJsPrompt", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            String str;
            if (WebPlayerView.this.shouldCallSuper("onPermissionRequest")) {
                super.onPermissionRequest(permissionRequest);
            }
            if (WebPlayerView.this.shouldSendEvent("onPermissionRequest")) {
                if (permissionRequest != null && permissionRequest.getOrigin() != null) {
                    str = permissionRequest.getOrigin().toString();
                } else {
                    str = "";
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PERMISSION_REQUEST, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i) {
            if (WebPlayerView.this.shouldCallSuper("onProgressChanged")) {
                super.onProgressChanged(webView, i);
            }
            if (WebPlayerView.this.shouldSendEvent("onProgressChanged")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PROGRESS_CHANGED, Integer.valueOf(i), WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedIcon(WebView webView, Bitmap bitmap) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedIcon")) {
                super.onReceivedIcon(webView, bitmap);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedIcon")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_ICON, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView webView, String str) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedTitle")) {
                super.onReceivedTitle(webView, str);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedTitle")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_TITLE, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedTouchIconUrl")) {
                super.onReceivedTouchIconUrl(webView, str, z);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedTouchIconUrl")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.RECEIVED_TOUCH_ICON_URL, str, Boolean.valueOf(z), WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onRequestFocus(WebView webView) {
            if (WebPlayerView.this.shouldCallSuper("onRequestFocus")) {
                super.onRequestFocus(webView);
            }
            if (WebPlayerView.this.shouldSendEvent("onRequestFocus")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.REQUEST_FOCUS, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            if (WebPlayerView.this.shouldCallSuper("onShowCustomView")) {
                super.onShowCustomView(view, customViewCallback);
            }
            if (WebPlayerView.this.shouldSendEvent("onShowCustomView")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOW_CUSTOM_VIEW, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("onShowFileChooser")) {
                bool = Boolean.valueOf(super.onShowFileChooser(webView, valueCallback, fileChooserParams));
            }
            if (WebPlayerView.this.shouldSendEvent("onShowFileChooser")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOW_FILE_CHOOSER, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("onShowFileChooser")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("onShowFileChooser", Boolean.class, Boolean.TRUE);
                if (bool.booleanValue()) {
                    valueCallback.onReceiveValue(null);
                }
            }
            return bool.booleanValue();
        }
    }

    /* loaded from: classes7.dex */
    private class WebPlayerDownloadListener implements DownloadListener {
        private WebPlayerDownloadListener() {
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (WebPlayerView.this.shouldSendEvent("onDownloadStart")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.DOWNLOAD_START, str, str2, str3, str4, Long.valueOf(j), WebPlayerView.this.viewId);
            }
        }
    }

    public WebPlayerView(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        super(context);
        this._evaluateJavascript = null;
        this._unsubscribeLayoutChange = null;
        this.viewId = str;
        WebSettings settings = getSettings();
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        try {
            this._evaluateJavascript = WebView.class.getMethod("evaluateJavascript", String.class, ValueCallback.class);
        } catch (NoSuchMethodException e) {
            DeviceLog.exception("Method evaluateJavascript not found", e);
            this._evaluateJavascript = null;
        }
        settings.setCacheMode(2);
        settings.setDatabaseEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setGeolocationEnabled(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setPluginState(WebSettings.PluginState.OFF);
        settings.setRenderPriority(WebSettings.RenderPriority.NORMAL);
        settings.setSaveFormData(false);
        settings.setSavePassword(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setInitialScale(0);
        setBackgroundColor(0);
        ViewUtilities.setBackground(this, new ColorDrawable(0));
        setBackgroundResource(0);
        setSettings(jSONObject, jSONObject2);
        setWebViewClient(new WebPlayerClient());
        setWebChromeClient(new WebPlayerChromeClient());
        setDownloadListener(new WebPlayerDownloadListener());
        addJavascriptInterface(new WebPlayerBridgeInterface(str), "webplayerbridge");
        WebPlayerViewCache.getInstance().addWebPlayer(str, this);
        subscribeOnLayoutChange();
    }

    private void addErroredSetting(String str, String str2) {
        if (this._erroredSettings == null) {
            this._erroredSettings = new HashMap();
        }
        this._erroredSettings.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> T getReturnValue(String str, Class<T> cls, T t) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("returnValue")) {
                return cls.cast(this._eventSettings.getJSONObject(str).get("returnValue"));
            }
        } catch (Exception e) {
            DeviceLog.exception("Error getting default return value", e);
        }
        return t;
    }

    private Class<?>[] getTypes(JSONArray jSONArray) throws JSONException, ClassNotFoundException {
        if (jSONArray == null) {
            return null;
        }
        Class<?>[] clsArr = new Class[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                clsArr[i] = Class.forName(((JSONObject) jSONArray.get(i)).getString("className"));
            } else {
                clsArr[i] = getPrimitiveClass(jSONArray.get(i).getClass());
            }
        }
        return clsArr;
    }

    private Object[] getValues(JSONArray jSONArray) throws JSONException, ClassNotFoundException, NoSuchMethodException {
        String str;
        if (jSONArray == null) {
            return null;
        }
        Object[] objArr = new Object[jSONArray.length()];
        Object[] objArr2 = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.get(i) instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                Object obj = jSONObject.get("value");
                String string = jSONObject.getString("type");
                if (jSONObject.has("className")) {
                    str = jSONObject.getString("className");
                } else {
                    str = null;
                }
                if (str != null && string.equals("Enum")) {
                    objArr2[i] = Enum.valueOf(Class.forName(str), (String) obj);
                }
            } else {
                objArr2[i] = jSONArray.get(i);
            }
        }
        System.arraycopy(objArr2, 0, objArr, 0, jSONArray.length());
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasReturnValue(String str) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str)) {
                if (this._eventSettings.getJSONObject(str).has("returnValue")) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error getting default return value", e);
            return false;
        }
    }

    private Object setTargetSettings(Object obj, JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray(next);
                    obj.getClass().getMethod(next, getTypes(jSONArray)).invoke(obj, getValues(jSONArray));
                } catch (Exception e) {
                    addErroredSetting(next, e.getMessage());
                    DeviceLog.exception("Setting errored", e);
                }
            }
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldCallSuper(String str) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("callSuper")) {
                return this._eventSettings.getJSONObject(str).getBoolean("callSuper");
            }
            return true;
        } catch (Exception e) {
            DeviceLog.exception("Error getting super call status", e);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldSendEvent(String str) {
        try {
            JSONObject jSONObject = this._eventSettings;
            if (jSONObject != null && jSONObject.has(str) && this._eventSettings.getJSONObject(str).has("sendEvent")) {
                return this._eventSettings.getJSONObject(str).getBoolean("sendEvent");
            }
            return false;
        } catch (Exception e) {
            DeviceLog.exception("Error getting send event status", e);
            return false;
        }
    }

    private void subscribeOnLayoutChange() {
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
        final View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.unity3d.services.ads.webplayer.WebPlayerView.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                WebPlayerView.this.onLayoutChange();
            }
        };
        addOnLayoutChangeListener(onLayoutChangeListener);
        this._unsubscribeLayoutChange = new Runnable() { // from class: com.unity3d.services.ads.webplayer.WebPlayerView.2
            @Override // java.lang.Runnable
            public void run() {
                WebPlayerView.this.removeOnLayoutChangeListener(onLayoutChangeListener);
            }
        };
    }

    @Override // android.webkit.WebView
    public void destroy() {
        super.destroy();
        WebPlayerViewCache.getInstance().removeWebPlayer(this.viewId);
        Runnable runnable = this._unsubscribeLayoutChange;
        if (runnable != null) {
            runnable.run();
        }
    }

    public Map<String, String> getErroredSettings() {
        return this._erroredSettings;
    }

    public Class<?> getPrimitiveClass(Class<?> cls) {
        String name = cls.getName();
        if (name.equals("java.lang.Byte")) {
            return Byte.TYPE;
        }
        if (name.equals("java.lang.Short")) {
            return Short.TYPE;
        }
        if (name.equals("java.lang.Integer")) {
            return Integer.TYPE;
        }
        if (name.equals("java.lang.Long")) {
            return Long.TYPE;
        }
        if (name.equals("java.lang.Character")) {
            return Character.TYPE;
        }
        if (name.equals("java.lang.Float")) {
            return Float.TYPE;
        }
        if (name.equals("java.lang.Double")) {
            return Double.TYPE;
        }
        if (name.equals("java.lang.Boolean")) {
            return Boolean.TYPE;
        }
        if (name.equals("java.lang.Void")) {
            return Void.TYPE;
        }
        return cls;
    }

    public void invokeJavascript(String str) {
        Utilities.runOnUiThread(new JavaScriptInvocation(str, this));
    }

    public void onLayoutChange() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        WebPlayerEventBridge.sendFrameUpdate(this.viewId, iArr[0], iArr[1], getWidth(), getHeight(), getAlpha());
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        onLayoutChange();
    }

    public void sendEvent(JSONArray jSONArray) {
        invokeJavascript("javascript:window.nativebridge.receiveEvent(" + jSONArray.toString() + ")");
    }

    public void setEventSettings(JSONObject jSONObject) {
        this._eventSettings = jSONObject;
    }

    public void setSettings(JSONObject jSONObject, JSONObject jSONObject2) {
        Map<String, String> map = this._erroredSettings;
        if (map != null) {
            map.clear();
        }
        setTargetSettings(getSettings(), jSONObject);
        setTargetSettings(this, jSONObject2);
    }

    /* loaded from: classes7.dex */
    private class WebPlayerClient extends WebViewClient {
        private WebPlayerClient() {
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(WebView webView, Message message, Message message2) {
            if (WebPlayerView.this.shouldCallSuper("onFormResubmission")) {
                super.onFormResubmission(webView, message, message2);
            }
            if (WebPlayerView.this.shouldSendEvent("onFormResubmission")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.FORM_RESUBMISSION, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            if (WebPlayerView.this.shouldCallSuper("onLoadResource")) {
                super.onLoadResource(webView, str);
            }
            if (WebPlayerView.this.shouldSendEvent("onLoadResource")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.LOAD_RESOUCE, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(WebView webView, String str) {
            if (WebPlayerView.this.shouldCallSuper("onPageCommitVisible")) {
                super.onPageCommitVisible(webView, str);
            }
            if (WebPlayerView.this.shouldSendEvent("onPageCommitVisible")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_COMMIT_VISIBLE, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (WebPlayerView.this.shouldCallSuper("onPageFinished")) {
                super.onPageFinished(webView, str);
            }
            if (WebPlayerView.this.shouldSendEvent("onPageFinished")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_FINISHED, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            if (WebPlayerView.this.shouldCallSuper("onPageStarted")) {
                super.onPageStarted(webView, str, bitmap);
            }
            if (WebPlayerView.this.shouldSendEvent("onPageStarted")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.PAGE_STARTED, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
            String str;
            int i;
            if (WebPlayerView.this.shouldCallSuper("onReceivedClientCertRequest")) {
                super.onReceivedClientCertRequest(webView, clientCertRequest);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedClientCertRequest")) {
                if (clientCertRequest != null) {
                    str = clientCertRequest.getHost();
                    i = clientCertRequest.getPort();
                } else {
                    str = "";
                    i = -1;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.CLIENT_CERT_REQUEST, str, Integer.valueOf(i), WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedError")) {
                super.onReceivedError(webView, i, str, str2);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedError")) {
                WebPlayerEventBridge.error(WebPlayerView.this.viewId, str2, str);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedHttpAuthRequest")) {
                super.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedHttpAuthRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HTTP_AUTH_REQUEST, str, str2, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String str;
            int i;
            if (WebPlayerView.this.shouldCallSuper("onReceivedHttpError")) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedHttpError")) {
                String str2 = "";
                if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
                    str = "";
                } else {
                    str = webResourceRequest.getUrl().toString();
                }
                if (webResourceResponse != null) {
                    int statusCode = webResourceResponse.getStatusCode();
                    String reasonPhrase = webResourceResponse.getReasonPhrase();
                    i = statusCode;
                    str2 = reasonPhrase;
                } else {
                    i = -1;
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.HTTP_ERROR, str, str2, Integer.valueOf(i), WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedLoginRequest")) {
                super.onReceivedLoginRequest(webView, str, str2, str3);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedLoginRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.LOGIN_REQUEST, str, str2, str3, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(14)
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            String str;
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            if (sslError != null) {
                DeviceLog.error("Received SSL error for '%s': %s", sslError.getUrl(), sslError.toString());
            } else {
                DeviceLog.error("Received unknown SSL error: SslError was null");
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedSslError")) {
                if (sslError != null) {
                    str = sslError.getUrl();
                } else {
                    str = "";
                }
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SSL_ERROR, str, WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(final WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            Utilities.runOnUiThread(new Runnable() { // from class: com.unity3d.services.ads.webplayer.WebPlayerView.WebPlayerClient.1
                @Override // java.lang.Runnable
                public void run() {
                    ViewUtilities.removeViewFromParent(webView);
                    webView.destroy();
                }
            });
            String str = WebPlayerView.this.viewId;
            String url = WebPlayerView.this.getUrl();
            WebPlayerEventBridge.error(str, url, "UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            DeviceLog.error("UnityAds Sdk WebPlayer onRenderProcessGone : " + renderProcessGoneDetail.toString());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(WebView webView, float f, float f2) {
            if (WebPlayerView.this.shouldCallSuper("onScaleChanged")) {
                super.onScaleChanged(webView, f, f2);
            }
            if (WebPlayerView.this.shouldSendEvent("onScaleChanged")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SCALE_CHANGED, Float.valueOf(f), Float.valueOf(f2), WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
            if (WebPlayerView.this.shouldCallSuper("onUnhandledKeyEvent")) {
                super.onUnhandledKeyEvent(webView, keyEvent);
            }
            if (WebPlayerView.this.shouldSendEvent("onUnhandledKeyEvent")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.UNHANDLED_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), WebPlayerView.this.viewId);
            }
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            WebResourceResponse webResourceResponse;
            if (WebPlayerView.this.shouldCallSuper("shouldInterceptRequest")) {
                webResourceResponse = super.shouldInterceptRequest(webView, webResourceRequest);
            } else {
                webResourceResponse = null;
            }
            if (WebPlayerView.this.shouldSendEvent("shouldInterceptRequest")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_INTERCEPT_REQUEST, webResourceRequest.getUrl().toString(), WebPlayerView.this.viewId);
            }
            return webResourceResponse;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("shouldOverrideKeyEvent")) {
                bool = Boolean.valueOf(super.shouldOverrideKeyEvent(webView, keyEvent));
            }
            if (WebPlayerView.this.shouldSendEvent("shouldOverrideKeyEvent")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_KEY_EVENT, Integer.valueOf(keyEvent.getKeyCode()), Integer.valueOf(keyEvent.getAction()), WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("shouldOverrideKeyEvent")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("shouldOverrideKeyEvent", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(21)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("shouldOverrideUrlLoading")) {
                bool = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, webResourceRequest));
            }
            if (WebPlayerView.this.shouldSendEvent("shouldOverrideUrlLoading")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, webResourceRequest.getUrl().toString(), webResourceRequest.getMethod(), WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("shouldOverrideUrlLoading")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(25)
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            if (WebPlayerView.this.shouldCallSuper("onReceivedError")) {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }
            if (WebPlayerView.this.shouldSendEvent("onReceivedError")) {
                String str = "";
                String charSequence = (webResourceError == null || webResourceError.getDescription() == null) ? "" : webResourceError.getDescription().toString();
                if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                    str = webResourceRequest.getUrl().toString();
                }
                WebPlayerEventBridge.error(WebPlayerView.this.viewId, str, charSequence);
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Boolean bool = Boolean.FALSE;
            if (WebPlayerView.this.shouldCallSuper("shouldOverrideUrlLoading")) {
                bool = Boolean.valueOf(super.shouldOverrideUrlLoading(webView, str));
            }
            if (WebPlayerView.this.shouldSendEvent("shouldOverrideUrlLoading")) {
                WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.WEBPLAYER, WebPlayerEvent.SHOULD_OVERRIDE_URL_LOADING, str, WebPlayerView.this.viewId);
            }
            if (WebPlayerView.this.hasReturnValue("shouldOverrideUrlLoading")) {
                bool = (Boolean) WebPlayerView.this.getReturnValue("shouldOverrideUrlLoading", Boolean.class, Boolean.TRUE);
            }
            return bool.booleanValue();
        }
    }
}
