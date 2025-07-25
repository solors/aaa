package com.p551my.target;

import android.content.Context;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.URI;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.my.target.b6 */
/* loaded from: classes7.dex */
public final class C25657b6 {

    /* renamed from: b */
    public static volatile C25657b6 f66638b;

    /* renamed from: a */
    public final CookieHandler f66639a;

    public C25657b6(CookieManager cookieManager) {
        this.f66639a = cookieManager;
    }

    /* renamed from: a */
    public final void m44170a(URLConnection uRLConnection, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            for (String str2 : (List) entry.getValue()) {
                uRLConnection.addRequestProperty(str, str2);
            }
        }
    }

    /* renamed from: b */
    public void m44169b(URLConnection uRLConnection) {
        HashMap hashMap = new HashMap();
        try {
            m44170a(uRLConnection, this.f66639a.get(URI.create(uRLConnection.getURL().toString()), hashMap));
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("MyTargetCookieManager: Unable to set cookies to urlconnection - " + th.getMessage());
        }
    }

    /* renamed from: a */
    public static C25657b6 m44172a(Context context) {
        C25657b6 c25657b6 = f66638b;
        if (c25657b6 == null) {
            synchronized (C25657b6.class) {
                c25657b6 = f66638b;
                if (c25657b6 == null) {
                    c25657b6 = new C25657b6(new CookieManager(new C25680c6(context.getApplicationContext()), null));
                    f66638b = c25657b6;
                }
            }
        }
        return c25657b6;
    }

    /* renamed from: a */
    public void m44171a(URLConnection uRLConnection) {
        Map<String, List<String>> headerFields = uRLConnection.getHeaderFields();
        try {
            this.f66639a.put(URI.create(uRLConnection.getURL().toString()), headerFields);
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("MyTargetCookieManager: Unable to set cookies from urlconnection - " + th.getMessage());
        }
    }
}
