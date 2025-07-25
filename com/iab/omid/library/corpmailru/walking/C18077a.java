package com.iab.omid.library.corpmailru.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.corpmailru.adsession.C18045a;
import com.iab.omid.library.corpmailru.p393b.C18047a;
import com.iab.omid.library.corpmailru.p393b.C18050c;
import com.iab.omid.library.corpmailru.p395d.C18067f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.corpmailru.walking.a */
/* loaded from: classes6.dex */
public class C18077a {

    /* renamed from: a */
    private final HashMap<View, String> f45501a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18078a> f45502b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45503c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45504d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45505e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45506f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45507g = new HashMap<>();

    /* renamed from: h */
    private boolean f45508h;

    /* renamed from: com.iab.omid.library.corpmailru.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18078a {

        /* renamed from: a */
        private final C18050c f45509a;

        /* renamed from: b */
        private final ArrayList<String> f45510b = new ArrayList<>();

        public C18078a(C18050c c18050c, String str) {
            this.f45509a = c18050c;
            m64046a(str);
        }

        /* renamed from: a */
        public C18050c m64047a() {
            return this.f45509a;
        }

        /* renamed from: b */
        public ArrayList<String> m64045b() {
            return this.f45510b;
        }

        /* renamed from: a */
        public void m64046a(String str) {
            this.f45510b.add(str);
        }
    }

    /* renamed from: d */
    private String m64049d(View view) {
        if (view.hasWindowFocus()) {
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m64106e = C18067f.m64106e(view);
                if (m64106e != null) {
                    return m64106e;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f45504d.addAll(hashSet);
            return null;
        }
        return "noWindowFocus";
    }

    /* renamed from: a */
    public String m64059a(View view) {
        if (this.f45501a.size() == 0) {
            return null;
        }
        String str = this.f45501a.get(view);
        if (str != null) {
            this.f45501a.remove(view);
        }
        return str;
    }

    /* renamed from: b */
    public View m64053b(String str) {
        return this.f45503c.get(str);
    }

    /* renamed from: c */
    public EnumC18088c m64051c(View view) {
        return this.f45504d.contains(view) ? EnumC18088c.PARENT_VIEW : this.f45508h ? EnumC18088c.OBSTRUCTION_VIEW : EnumC18088c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m64048e() {
        this.f45508h = true;
    }

    /* renamed from: a */
    public String m64056a(String str) {
        return this.f45507g.get(str);
    }

    /* renamed from: b */
    public C18078a m64054b(View view) {
        C18078a c18078a = this.f45502b.get(view);
        if (c18078a != null) {
            this.f45502b.remove(view);
        }
        return c18078a;
    }

    /* renamed from: c */
    public void m64052c() {
        C18047a m64206a = C18047a.m64206a();
        if (m64206a != null) {
            for (C18045a c18045a : m64206a.m64202c()) {
                View m64221d = c18045a.m64221d();
                if (c18045a.m64219e()) {
                    String adSessionId = c18045a.getAdSessionId();
                    if (m64221d != null) {
                        String m64049d = m64049d(m64221d);
                        if (m64049d == null) {
                            this.f45505e.add(adSessionId);
                            this.f45501a.put(m64221d, adSessionId);
                            m64058a(c18045a);
                        } else {
                            this.f45506f.add(adSessionId);
                            this.f45503c.put(adSessionId, m64221d);
                            this.f45507g.put(adSessionId, m64049d);
                        }
                    } else {
                        this.f45506f.add(adSessionId);
                        this.f45507g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m64050d() {
        this.f45501a.clear();
        this.f45502b.clear();
        this.f45503c.clear();
        this.f45504d.clear();
        this.f45505e.clear();
        this.f45506f.clear();
        this.f45507g.clear();
        this.f45508h = false;
    }

    /* renamed from: a */
    public HashSet<String> m64060a() {
        return this.f45505e;
    }

    /* renamed from: b */
    public HashSet<String> m64055b() {
        return this.f45506f;
    }

    /* renamed from: a */
    private void m64058a(C18045a c18045a) {
        for (C18050c c18050c : c18045a.m64229a()) {
            m64057a(c18050c, c18045a);
        }
    }

    /* renamed from: a */
    private void m64057a(C18050c c18050c, C18045a c18045a) {
        View view = c18050c.m64191a().get();
        if (view == null) {
            return;
        }
        C18078a c18078a = this.f45502b.get(view);
        if (c18078a != null) {
            c18078a.m64046a(c18045a.getAdSessionId());
        } else {
            this.f45502b.put(view, new C18078a(c18050c, c18045a.getAdSessionId()));
        }
    }
}
