package p1035x2;

import android.webkit.JavascriptInterface;
import com.helpshift.log.HSLogger;

/* renamed from: x2.d */
/* loaded from: classes5.dex */
public class HelpcenterToNativeBridge {

    /* renamed from: a */
    private HSHelpcenterEventsHandler f117414a;

    public HelpcenterToNativeBridge(HSHelpcenterEventsHandler hSHelpcenterEventsHandler) {
        this.f117414a = hSHelpcenterEventsHandler;
    }

    @JavascriptInterface
    public void closeHelpcenter() {
        HSLogger.m65441d("HelpcnterToNatve", "Received event to close Helpcenter");
        this.f117414a.m2069d();
    }

    @JavascriptInterface
    public void getWebchatData() {
        HSLogger.m65441d("HelpcnterToNatve", "Received event to getWCLocalStorageData from HC WebView.");
        this.f117414a.m2067f();
    }

    @JavascriptInterface
    public void hcActionSync(String str) {
        HSLogger.m65441d("HelpcnterToNatve", "Received event to ActionSync from HC WebView.");
        this.f117414a.m2066g(str);
    }

    @JavascriptInterface
    public void helpcenterLoaded(String str) {
        HSLogger.m65441d("HelpcnterToNatve", "Received event helpcenter loaded");
        this.f117414a.m2064i(str);
    }

    @JavascriptInterface
    public void onHelpcenterError() {
        HSLogger.m65441d("HelpcnterToNatve", "Received event helpcenter error");
        this.f117414a.m2065h();
    }

    @JavascriptInterface
    public void openWebchat() {
        HSLogger.m65441d("HelpcnterToNatve", "Received event to open Webchat");
        this.f117414a.m2061l();
    }

    @JavascriptInterface
    public void removeAdditionalInfo(String str) {
        HSLogger.m65441d("HelpcnterToNatve", "Received event to remove additional Helpcenter data from HC WebView.");
        this.f117414a.m2063j(str);
    }

    @JavascriptInterface
    public void setAdditionalInfo(String str) {
        HSLogger.m65441d("HelpcnterToNatve", "Received event to set additional Helpcenter data from HC WebView.");
        this.f117414a.m2062k(str);
    }
}
