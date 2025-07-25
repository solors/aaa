package com.ironsource;

import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.hg */
/* loaded from: classes6.dex */
public interface InterfaceC20048hg {

    /* renamed from: com.ironsource.hg$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC20049a {
        /* renamed from: a */
        void mo55985a(String str);

        /* renamed from: b */
        void mo55984b(String str);
    }

    /* renamed from: a */
    void mo56003a(String str, String str2);

    /* renamed from: a */
    void mo56002a(String str, String str2, String str3);

    /* renamed from: a */
    void mo56001a(JSONObject jSONObject, String str, String str2);

    /* renamed from: b */
    void mo55995b(JSONObject jSONObject, String str, String str2);

    /* renamed from: c */
    void mo55991c(JSONObject jSONObject, String str, String str2) throws JSONException;

    WebView getPresentingView();
}
