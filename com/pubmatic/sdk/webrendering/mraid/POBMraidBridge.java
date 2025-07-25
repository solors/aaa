package com.pubmatic.sdk.webrendering.mraid;

import android.webkit.JavascriptInterface;
import androidx.annotation.AnyThread;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.ironsource.C19577ad;
import com.pubmatic.sdk.common.POBError;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBLocation;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.p566ui.POBAdViewContainer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
@MainThread
/* loaded from: classes7.dex */
public class POBMraidBridge {
    private static final String JS_CLASS = "mraidService";
    private static final String MRAID_MAPPING = "nativeBridge";
    private static final String TAG = "POBMraidBridge";
    @NonNull
    protected final POBAdViewContainer adViewContainer;
    @NonNull
    private final Map<String, InterfaceC26926f> commandHandlingMap;
    @Nullable
    private InterfaceC26933m mraidBridgeListener;
    @NonNull
    private EnumC26922b mraidState = EnumC26922b.LOADING;
    @NonNull
    private final Map<EnumC26898b, String> propertyMap;
    @NonNull
    protected final POBWebView webView;

    /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBMraidBridge$a */
    /* loaded from: classes7.dex */
    class RunnableC26897a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f71150a;

        RunnableC26897a(String str) {
            this.f71150a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            POBMraidBridge.this.acknowledgeMraidCommand();
            POBLog.debug(POBMraidBridge.TAG, "Received MRAID event : %s", this.f71150a);
            try {
                POBMraidBridge.this.invokeMraidCommands(new JSONObject(this.f71150a));
            } catch (JSONException e) {
                POBLog.error(POBMraidBridge.TAG, "Failed to parse MRAID event. Error : %s", e.getLocalizedMessage());
                POBMraidBridge.this.notifyError("Not supported", this.f71150a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.webrendering.mraid.POBMraidBridge$b */
    /* loaded from: classes7.dex */
    public enum EnumC26898b {
        CURRENT_POSITION,
        DEFAULT_POSITION,
        SCREEN_SIZE,
        MAX_SIZE,
        STATE,
        VIEWABLE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public POBMraidBridge(@NonNull POBAdViewContainer pOBAdViewContainer) {
        this.adViewContainer = pOBAdViewContainer;
        POBWebView adView = pOBAdViewContainer.getAdView();
        this.webView = adView;
        adView.addJavascriptInterface(this, MRAID_MAPPING);
        this.propertyMap = new HashMap(5);
        this.commandHandlingMap = new HashMap(4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void acknowledgeMraidCommand() {
        injectProperties("mraidService.nativeCallComplete();");
    }

    private void injectProperties(String str) {
        POBLog.debug(TAG, "Injecting JS property : %s", str);
        POBWebView pOBWebView = this.webView;
        pOBWebView.loadUrl("javascript:" + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    public void invokeMraidCommands(@NonNull JSONObject jSONObject) {
        POBError pOBError;
        String optString = jSONObject.optString("name");
        InterfaceC26926f interfaceC26926f = this.commandHandlingMap.get(optString);
        if (interfaceC26926f != null) {
            if (this.mraidBridgeListener != null && !interfaceC26926f.mo39851b()) {
                pOBError = interfaceC26926f.mo39852a(jSONObject, this.mraidBridgeListener, this.mraidBridgeListener.isUserInteracted(false));
            } else {
                InterfaceC26933m interfaceC26933m = this.mraidBridgeListener;
                if (interfaceC26933m != null && interfaceC26933m.isUserInteracted(true)) {
                    pOBError = interfaceC26926f.mo39852a(jSONObject, this.mraidBridgeListener, true);
                } else {
                    pOBError = new POBError(1009, "Illegal state of command execution without user interaction");
                }
            }
        } else {
            pOBError = new POBError(1009, "Not supported");
        }
        if (pOBError != null) {
            notifyError(pOBError.getErrorMessage(), optString);
        }
    }

    private boolean isPropertyUpdated(EnumC26898b enumC26898b, String str) {
        String str2 = this.propertyMap.get(enumC26898b);
        if (str2 != null && str2.equals(str)) {
            return false;
        }
        this.propertyMap.put(enumC26898b, str);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void addCommandHandler(@NonNull InterfaceC26926f interfaceC26926f) {
        this.commandHandlingMap.put(interfaceC26926f.mo39853a(), interfaceC26926f);
    }

    @JavascriptInterface
    public void error(String str) {
        POBLog.error(TAG, "Error message from JS :%s", str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NonNull
    public EnumC26922b getMraidState() {
        return this.mraidState;
    }

    @JavascriptInterface
    public void log(String str) {
        POBLog.debug(TAG, "Received MRAID log :%s", str);
    }

    @AnyThread
    @JavascriptInterface
    public void nativeCall(@Nullable String str) {
        POBUtils.runOnMainThread(new RunnableC26897a(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void notifyError(@Nullable String str, @Nullable String str2) {
        POBLog.debug(TAG, "JS called MRAID event without user interaction. Event : %s", str2);
        String format = String.format(Locale.getDefault(), ".fireErrorEvent('%s', '%s');", str, str2);
        injectProperties(JS_CLASS + format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void resetPropertyMap() {
        this.propertyMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAudioVolumePercentage(@Nullable Double d) {
        String format;
        if (d != null) {
            format = String.format(Locale.getDefault(), ".fireEvent('audioVolumeChange', %.2f);", d);
        } else {
            format = String.format(Locale.getDefault(), ".fireEvent('audioVolumeChange', %s);", "null");
        }
        injectProperties(JS_CLASS + format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setCurrentPosition(int i, int i2, int i3, int i4) {
        JSONObject rectJson = POBMRAIDUtil.getRectJson(i, i2, i3, i4);
        if (!isPropertyUpdated(EnumC26898b.CURRENT_POSITION, rectJson.toString())) {
            return false;
        }
        String format = String.format(Locale.getDefault(), ".setCurrentPosition(%s);", rectJson);
        injectProperties(JS_CLASS + format);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDefaultPosition(int i, int i2, int i3, int i4) {
        JSONObject rectJson = POBMRAIDUtil.getRectJson(i, i2, i3, i4);
        if (isPropertyUpdated(EnumC26898b.DEFAULT_POSITION, rectJson.toString())) {
            String format = String.format(Locale.getDefault(), ".setDefaultPosition(%s);", rectJson);
            injectProperties(JS_CLASS + format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLocation(POBLocation pOBLocation) {
        String str;
        if (pOBLocation != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C19577ad.f49134q, pOBLocation.getLatitude());
                jSONObject.put("lon", pOBLocation.getLongitude());
                POBLocation.Source source = pOBLocation.getSource();
                if (source != null) {
                    jSONObject.put("type", String.valueOf(source.getValue()));
                }
                str = String.format(Locale.getDefault(), ".setLocation(%s);", jSONObject);
            } catch (Exception unused) {
                POBLog.error(TAG, "Not able to inject setLocation property!", new Object[0]);
                str = null;
            }
        } else {
            str = String.format(Locale.getDefault(), ".setLocation(%s);", JsonUtils.EMPTY_JSON);
        }
        injectProperties(JS_CLASS + str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean setMaxSize(int i, int i2) {
        JSONObject heightWidthJson = POBMRAIDUtil.getHeightWidthJson(i, i2);
        if (!isPropertyUpdated(EnumC26898b.MAX_SIZE, heightWidthJson.toString())) {
            return false;
        }
        String format = String.format(Locale.getDefault(), ".setMaxSize(%s);", heightWidthJson);
        injectProperties(JS_CLASS + format);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMraidBridgeListener(@Nullable InterfaceC26933m interfaceC26933m) {
        this.mraidBridgeListener = interfaceC26933m;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMraidState(@NonNull EnumC26922b enumC26922b) {
        this.mraidState = enumC26922b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPlacementType(@NonNull String str) {
        String format = String.format(Locale.getDefault(), ".setPlacementType('%s');", str);
        injectProperties(JS_CLASS + format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setScreenSize(int i, int i2) {
        JSONObject heightWidthJson = POBMRAIDUtil.getHeightWidthJson(i, i2);
        if (isPropertyUpdated(EnumC26898b.SCREEN_SIZE, heightWidthJson.toString())) {
            String format = String.format(Locale.getDefault(), ".setScreenSize(%s);", heightWidthJson);
            injectProperties(JS_CLASS + format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSizeChange(int i, int i2) {
        String format = String.format(Locale.getDefault(), ".fireEvent('%s', %d, %d);", EnumC26921a.SIZE_CHANGE.m39867a(), Integer.valueOf(i), Integer.valueOf(i2));
        injectProperties(JS_CLASS + format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSupportedFeatures(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sms", z);
            jSONObject.put("tel", z2);
            jSONObject.put("calendar", z3);
            jSONObject.put("storePicture", z4);
            jSONObject.put("inlineVideo", z5);
            jSONObject.put("location", z6);
            jSONObject.put("vpaid", z7);
            String format = String.format(Locale.getDefault(), ".setSupports(%s);", jSONObject);
            injectProperties(JS_CLASS + format);
        } catch (JSONException unused) {
            POBLog.error(TAG, "Not able to inject setSupports property!", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateEvent(@NonNull EnumC26921a enumC26921a) {
        String format = String.format(Locale.getDefault(), ".fireEvent('%s');", enumC26921a.m39867a());
        injectProperties(JS_CLASS + format);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateExposureChangeData(Float f, JSONObject jSONObject) {
        if (f != null && jSONObject != null) {
            String format = String.format(Locale.getDefault(), ".fireEvent('exposureChange', %.1f, %s, null);", f, jSONObject);
            injectProperties(JS_CLASS + format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateMraidState(@NonNull EnumC26922b enumC26922b) {
        if (isPropertyUpdated(EnumC26898b.STATE, enumC26922b.m39866a())) {
            String format = String.format(Locale.getDefault(), ".setState('%s');", enumC26922b.m39866a());
            injectProperties(JS_CLASS + format);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateViewable(boolean z) {
        if (isPropertyUpdated(EnumC26898b.VIEWABLE, String.valueOf(z))) {
            String format = String.format(Locale.getDefault(), ".setViewable(%b);", Boolean.valueOf(z));
            injectProperties(JS_CLASS + format);
        }
    }
}
