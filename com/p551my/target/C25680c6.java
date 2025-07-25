package com.p551my.target;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.my.target.c6 */
/* loaded from: classes7.dex */
public class C25680c6 implements CookieStore {

    /* renamed from: a */
    public final SharedPreferences f66697a;

    /* renamed from: b */
    public final Map f66698b = new HashMap();

    public C25680c6(Context context) {
        this.f66697a = context.getSharedPreferences("mytarget_httpcookie_prefs", 0);
        m44089a();
    }

    /* renamed from: a */
    public final boolean m44088a(String str, String str2) {
        if (!str2.equals(str)) {
            if (!str2.endsWith("." + str)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.net.CookieStore
    public synchronized void add(URI uri, HttpCookie httpCookie) {
        URI m44086a = m44086a(uri, httpCookie);
        Set set = (Set) this.f66698b.get(m44086a);
        if (set == null) {
            set = new HashSet();
            this.f66698b.put(m44086a, set);
        }
        set.remove(httpCookie);
        set.add(httpCookie);
        m44081c(m44086a, httpCookie);
    }

    /* renamed from: b */
    public final boolean m44083b(String str, String str2) {
        if (str2.equals(str)) {
            return true;
        }
        if (str2.startsWith(str) && str.charAt(str.length() - 1) == '/') {
            return true;
        }
        return str2.startsWith(str) && str2.substring(str.length()).charAt(0) == '/';
    }

    /* renamed from: c */
    public final void m44081c(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f66697a.edit();
        edit.putString(uri + SignedToken.f2767c + httpCookie.getName(), new C25705d6().m44024a(httpCookie));
        edit.apply();
    }

    @Override // java.net.CookieStore
    public synchronized List get(URI uri) {
        return m44087a(uri);
    }

    @Override // java.net.CookieStore
    public synchronized List getCookies() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (URI uri : this.f66698b.keySet()) {
            arrayList.addAll(m44087a(uri));
        }
        return arrayList;
    }

    @Override // java.net.CookieStore
    public synchronized List getURIs() {
        return new ArrayList(this.f66698b.keySet());
    }

    @Override // java.net.CookieStore
    public synchronized boolean remove(URI uri, HttpCookie httpCookie) {
        boolean z;
        Set set = (Set) this.f66698b.get(uri);
        if (set != null && set.remove(httpCookie)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m44082b(uri, httpCookie);
        }
        return z;
    }

    @Override // java.net.CookieStore
    public synchronized boolean removeAll() {
        this.f66698b.clear();
        m44084b();
        return true;
    }

    /* renamed from: a */
    public static URI m44086a(URI uri, HttpCookie httpCookie) {
        if (httpCookie.getDomain() != null) {
            String domain = httpCookie.getDomain();
            if (domain.charAt(0) == '.') {
                domain = domain.substring(1);
            }
            try {
                return new URI(uri.getScheme() == null ? "http" : uri.getScheme(), domain, httpCookie.getPath() == null ? RemoteSettings.FORWARD_SLASH_STRING : httpCookie.getPath(), null);
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("MyTargetCookieStore: Error - " + th.getMessage());
                return uri;
            }
        }
        return uri;
    }

    /* renamed from: b */
    public final void m44084b() {
        this.f66697a.edit().clear().apply();
    }

    /* renamed from: a */
    public final List m44087a(URI uri) {
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : this.f66698b.entrySet()) {
            URI uri2 = (URI) entry.getKey();
            if (m44088a(uri2.getHost(), uri.getHost()) && m44083b(uri2.getPath(), uri.getPath())) {
                hashSet.addAll((Collection) entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            HttpCookie httpCookie = (HttpCookie) it.next();
            if (httpCookie.hasExpired()) {
                arrayList.add(httpCookie);
                it.remove();
            }
        }
        if (!arrayList.isEmpty()) {
            m44085a(uri, arrayList);
        }
        return new ArrayList(hashSet);
    }

    /* renamed from: b */
    public final void m44082b(URI uri, HttpCookie httpCookie) {
        SharedPreferences.Editor edit = this.f66697a.edit();
        edit.remove(uri + SignedToken.f2767c + httpCookie.getName());
        edit.apply();
    }

    /* renamed from: a */
    public final void m44089a() {
        for (Map.Entry<String, ?> entry : this.f66697a.getAll().entrySet()) {
            try {
                URI uri = new URI(entry.getKey().split("\\|", 2)[0]);
                HttpCookie m44025a = new C25705d6().m44025a((String) entry.getValue());
                Set set = (Set) this.f66698b.get(uri);
                if (set == null) {
                    set = new HashSet();
                    this.f66698b.put(uri, set);
                }
                set.add(m44025a);
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("MyTargetCookieStore: Error - " + th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void m44085a(URI uri, List list) {
        SharedPreferences.Editor edit = this.f66697a.edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            edit.remove(uri + SignedToken.f2767c + ((HttpCookie) it.next()).getName());
        }
        edit.apply();
    }
}
