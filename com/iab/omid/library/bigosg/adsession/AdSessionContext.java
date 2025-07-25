package com.iab.omid.library.bigosg.adsession;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.bigosg.p389d.C17955e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes6.dex */
public final class AdSessionContext {
    private final AdSessionContextType adSessionContextType;
    @Nullable
    private final String contentUrl;
    private final String customReferenceData;
    private final Map<String, VerificationScriptResource> injectedResourcesMap;
    private final String omidJsScriptContent;
    private final Partner partner;
    private final List<VerificationScriptResource> verificationScriptResources;
    private final WebView webView;

    private AdSessionContext(Partner partner, WebView webView, String str, List<VerificationScriptResource> list, @Nullable String str2, String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.verificationScriptResources = arrayList;
        this.injectedResourcesMap = new HashMap();
        this.partner = partner;
        this.webView = webView;
        this.omidJsScriptContent = str;
        this.adSessionContextType = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (VerificationScriptResource verificationScriptResource : list) {
                String uuid = UUID.randomUUID().toString();
                this.injectedResourcesMap.put(uuid, verificationScriptResource);
            }
        }
        this.contentUrl = str2;
        this.customReferenceData = str3;
    }

    public static AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, String str) {
        C17955e.m64570a(partner, "Partner is null");
        C17955e.m64570a(webView, "WebView is null");
        if (str != null) {
            C17955e.m64569a(str, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, null, null, null, str, AdSessionContextType.HTML);
    }

    public static AdSessionContext createJavascriptAdSessionContext(Partner partner, WebView webView, @Nullable String str, String str2) {
        C17955e.m64570a(partner, "Partner is null");
        C17955e.m64570a(webView, "WebView is null");
        if (str2 != null) {
            C17955e.m64569a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, null, null, str, str2, AdSessionContextType.JAVASCRIPT);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner, String str, List<VerificationScriptResource> list, String str2) {
        C17955e.m64570a(partner, "Partner is null");
        C17955e.m64570a((Object) str, "OM SDK JS script content is null");
        C17955e.m64570a(list, "VerificationScriptResources is null");
        if (str2 != null) {
            C17955e.m64569a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, null, str, list, null, str2, AdSessionContextType.NATIVE);
    }

    public final AdSessionContextType getAdSessionContextType() {
        return this.adSessionContextType;
    }

    @Nullable
    public final String getContentUrl() {
        return this.contentUrl;
    }

    public final String getCustomReferenceData() {
        return this.customReferenceData;
    }

    public final Map<String, VerificationScriptResource> getInjectedResourcesMap() {
        return Collections.unmodifiableMap(this.injectedResourcesMap);
    }

    public final String getOmidJsScriptContent() {
        return this.omidJsScriptContent;
    }

    public final Partner getPartner() {
        return this.partner;
    }

    public final List<VerificationScriptResource> getVerificationScriptResources() {
        return Collections.unmodifiableList(this.verificationScriptResources);
    }

    public final WebView getWebView() {
        return this.webView;
    }

    public static AdSessionContext createHtmlAdSessionContext(Partner partner, WebView webView, @Nullable String str, String str2) {
        C17955e.m64570a(partner, "Partner is null");
        C17955e.m64570a(webView, "WebView is null");
        if (str2 != null) {
            C17955e.m64569a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, webView, null, null, str, str2, AdSessionContextType.HTML);
    }

    public static AdSessionContext createNativeAdSessionContext(Partner partner, String str, List<VerificationScriptResource> list, @Nullable String str2, String str3) {
        C17955e.m64570a(partner, "Partner is null");
        C17955e.m64570a((Object) str, "OM SDK JS script content is null");
        C17955e.m64570a(list, "VerificationScriptResources is null");
        if (str3 != null) {
            C17955e.m64569a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new AdSessionContext(partner, null, str, list, str2, str3, AdSessionContextType.NATIVE);
    }
}
