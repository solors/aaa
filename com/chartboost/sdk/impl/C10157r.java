package com.chartboost.sdk.impl;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.chartboost.sdk.impl.r */
/* loaded from: classes3.dex */
public final class C10157r {

    /* renamed from: a */
    public final C9868g8 f23029a;

    /* renamed from: b */
    public final WebView f23030b;

    /* renamed from: c */
    public final List f23031c;

    /* renamed from: d */
    public final Map f23032d;

    /* renamed from: e */
    public final String f23033e;

    /* renamed from: f */
    public final String f23034f;

    /* renamed from: g */
    public final String f23035g;

    /* renamed from: h */
    public final EnumC10178s f23036h;

    public C10157r(C9868g8 c9868g8, WebView webView, String str, List list, String str2, String str3, EnumC10178s enumC10178s) {
        ArrayList arrayList = new ArrayList();
        this.f23031c = arrayList;
        this.f23032d = new HashMap();
        this.f23029a = c9868g8;
        this.f23030b = webView;
        this.f23033e = str;
        this.f23036h = enumC10178s;
        if (list != null) {
            arrayList.addAll(list);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String uuid = UUID.randomUUID().toString();
                this.f23032d.put(uuid, (C9933hb) it.next());
            }
        }
        this.f23035g = str2;
        this.f23034f = str3;
    }

    /* renamed from: a */
    public static C10157r m80706a(C9868g8 c9868g8, WebView webView, String str, String str2) {
        AbstractC10085nd.m80982a(c9868g8, "Partner is null");
        AbstractC10085nd.m80982a(webView, "WebView is null");
        if (str2 != null) {
            AbstractC10085nd.m80981a(str2, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C10157r(c9868g8, webView, null, null, str, str2, EnumC10178s.HTML);
    }

    /* renamed from: b */
    public String m80704b() {
        return this.f23035g;
    }

    /* renamed from: c */
    public String m80703c() {
        return this.f23034f;
    }

    /* renamed from: d */
    public Map m80702d() {
        return Collections.unmodifiableMap(this.f23032d);
    }

    /* renamed from: e */
    public String m80701e() {
        return this.f23033e;
    }

    /* renamed from: f */
    public C9868g8 m80700f() {
        return this.f23029a;
    }

    /* renamed from: g */
    public List m80699g() {
        return Collections.unmodifiableList(this.f23031c);
    }

    /* renamed from: h */
    public WebView m80698h() {
        return this.f23030b;
    }

    /* renamed from: a */
    public static C10157r m80705a(C9868g8 c9868g8, String str, List list, String str2, String str3) {
        AbstractC10085nd.m80982a(c9868g8, "Partner is null");
        AbstractC10085nd.m80982a((Object) str, "OM SDK JS script content is null");
        AbstractC10085nd.m80982a(list, "VerificationScriptResources is null");
        if (str3 != null) {
            AbstractC10085nd.m80981a(str3, 256, "CustomReferenceData is greater than 256 characters");
        }
        return new C10157r(c9868g8, null, str, list, str2, str3, EnumC10178s.NATIVE);
    }

    /* renamed from: a */
    public EnumC10178s m80707a() {
        return this.f23036h;
    }
}
