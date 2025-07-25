package com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222;

import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.iab.omid.library.xiaomi.adsession.AdSessionContextType;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.C32610cii2c2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.cioccoiococ */
/* loaded from: classes8.dex */
public final class C32705cioccoiococ {
    private final List<C32704ciii2coi2> c2oc2i;
    private final String c2oc2o;
    @Nullable
    private final String cco22;
    @Nullable
    private final String cii2c2;
    private final AdSessionContextType ciii2coi2;
    private final Map<String, C32704ciii2coi2> cioccoiococ;
    private final WebView coi222o222;
    private final C32702cco22 coo2iico;

    private C32705cioccoiococ(C32702cco22 c32702cco22, WebView webView, String str, List<C32704ciii2coi2> list, @Nullable String str2, @Nullable String str3, AdSessionContextType adSessionContextType) {
        ArrayList arrayList = new ArrayList();
        this.c2oc2i = arrayList;
        this.cioccoiococ = new HashMap();
        this.coo2iico = c32702cco22;
        this.coi222o222 = webView;
        this.c2oc2o = str;
        this.ciii2coi2 = adSessionContextType;
        if (list != null) {
            arrayList.addAll(list);
            for (C32704ciii2coi2 c32704ciii2coi2 : list) {
                String uuid = UUID.randomUUID().toString();
                this.cioccoiococ.put(uuid, c32704ciii2coi2);
            }
        }
        this.cii2c2 = str2;
        this.cco22 = str3;
    }

    public static C32705cioccoiococ coi222o222(C32702cco22 c32702cco22, WebView webView, @Nullable String str, @Nullable String str2) {
        C32610cii2c2.coo2iico(c32702cco22, "Partner is null");
        C32610cii2c2.coo2iico(webView, "WebView is null");
        if (str2 != null) {
            C32610cii2c2.coo2iico(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C32705cioccoiococ(c32702cco22, webView, null, null, str, str2, AdSessionContextType.JAVASCRIPT);
    }

    @Nullable
    public String c2oc2i() {
        return this.cco22;
    }

    public String c2oc2o() {
        return this.c2oc2o;
    }

    public C32702cco22 cco22() {
        return this.coo2iico;
    }

    public List<C32704ciii2coi2> cii2c2() {
        return Collections.unmodifiableList(this.c2oc2i);
    }

    public WebView ciii2coi2() {
        return this.coi222o222;
    }

    public Map<String, C32704ciii2coi2> cioccoiococ() {
        return Collections.unmodifiableMap(this.cioccoiococ);
    }

    public AdSessionContextType coo2iico() {
        return this.ciii2coi2;
    }

    public static C32705cioccoiococ coo2iico(C32702cco22 c32702cco22, WebView webView, @Nullable String str, @Nullable String str2) {
        C32610cii2c2.coo2iico(c32702cco22, "Partner is null");
        C32610cii2c2.coo2iico(webView, "WebView is null");
        if (str2 != null) {
            C32610cii2c2.coo2iico(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C32705cioccoiococ(c32702cco22, webView, null, null, str, str2, AdSessionContextType.HTML);
    }

    @Nullable
    public String coi222o222() {
        return this.cii2c2;
    }

    public static C32705cioccoiococ coo2iico(C32702cco22 c32702cco22, String str, List<C32704ciii2coi2> list, @Nullable String str2, @Nullable String str3) {
        C32610cii2c2.coo2iico(c32702cco22, "Partner is null");
        C32610cii2c2.coo2iico((Object) str, "OM SDK JS script content is null");
        C32610cii2c2.coo2iico(list, "VerificationScriptResources is null");
        if (str3 != null) {
            C32610cii2c2.coo2iico(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C32705cioccoiococ(c32702cco22, null, str, list, str2, str3, AdSessionContextType.NATIVE);
    }
}
