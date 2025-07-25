package com.iab.omid.library.appodeal.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.appodeal.adsession.C17867a;
import com.iab.omid.library.appodeal.internal.C17877c;
import com.iab.omid.library.appodeal.internal.C17880e;
import com.iab.omid.library.appodeal.utils.C17908h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.appodeal.walking.a */
/* loaded from: classes6.dex */
public class C17913a {

    /* renamed from: a */
    private final HashMap<View, String> f45136a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C17914a> f45137b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45138c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45139d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45140e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45141f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45142g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f45143h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f45144i = new WeakHashMap();

    /* renamed from: j */
    private boolean f45145j;

    /* renamed from: com.iab.omid.library.appodeal.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C17914a {

        /* renamed from: a */
        private final C17880e f45146a;

        /* renamed from: b */
        private final ArrayList<String> f45147b = new ArrayList<>();

        public C17914a(C17880e c17880e, String str) {
            this.f45146a = c17880e;
            m64710a(str);
        }

        /* renamed from: a */
        public C17880e m64711a() {
            return this.f45146a;
        }

        /* renamed from: b */
        public ArrayList<String> m64709b() {
            return this.f45147b;
        }

        /* renamed from: a */
        public void m64710a(String str) {
            this.f45147b.add(str);
        }
    }

    /* renamed from: a */
    public View m64722a(String str) {
        return this.f45138c.get(str);
    }

    /* renamed from: b */
    public C17914a m64720b(View view) {
        C17914a c17914a = this.f45137b.get(view);
        if (c17914a != null) {
            this.f45137b.remove(view);
        }
        return c17914a;
    }

    /* renamed from: c */
    public String m64717c(View view) {
        if (this.f45136a.size() == 0) {
            return null;
        }
        String str = this.f45136a.get(view);
        if (str != null) {
            this.f45136a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC17924c m64714d(View view) {
        return this.f45139d.contains(view) ? EnumC17924c.PARENT_VIEW : this.f45145j ? EnumC17924c.OBSTRUCTION_VIEW : EnumC17924c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m64713e() {
        C17877c m64898c = C17877c.m64898c();
        if (m64898c != null) {
            for (C17867a c17867a : m64898c.m64902a()) {
                View m64939c = c17867a.m64939c();
                if (c17867a.m64936f()) {
                    String adSessionId = c17867a.getAdSessionId();
                    if (m64939c != null) {
                        boolean m64752e = C17908h.m64752e(m64939c);
                        if (m64752e) {
                            this.f45143h.add(adSessionId);
                        }
                        String m64725a = m64725a(m64939c, m64752e);
                        if (m64725a == null) {
                            this.f45140e.add(adSessionId);
                            this.f45136a.put(m64939c, adSessionId);
                            m64724a(c17867a);
                        } else if (m64725a != "noWindowFocus") {
                            this.f45141f.add(adSessionId);
                            this.f45138c.put(adSessionId, m64939c);
                            this.f45142g.put(adSessionId, m64725a);
                        }
                    } else {
                        this.f45141f.add(adSessionId);
                        this.f45142g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m64726a(View view) {
        if (view.hasWindowFocus()) {
            this.f45144i.remove(view);
            return Boolean.FALSE;
        } else if (this.f45144i.containsKey(view)) {
            return this.f45144i.get(view);
        } else {
            Map<View, Boolean> map = this.f45144i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m64719b(String str) {
        return this.f45142g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m64718c() {
        return this.f45140e;
    }

    /* renamed from: d */
    public void m64715d() {
        this.f45145j = true;
    }

    /* renamed from: e */
    public boolean m64712e(View view) {
        if (this.f45144i.containsKey(view)) {
            this.f45144i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m64725a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m64726a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m64756a = C17908h.m64756a(view);
                    if (m64756a != null) {
                        return m64756a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f45139d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m64721b() {
        return this.f45141f;
    }

    /* renamed from: c */
    public boolean m64716c(String str) {
        return this.f45143h.contains(str);
    }

    /* renamed from: a */
    public void m64727a() {
        this.f45136a.clear();
        this.f45137b.clear();
        this.f45138c.clear();
        this.f45139d.clear();
        this.f45140e.clear();
        this.f45141f.clear();
        this.f45142g.clear();
        this.f45145j = false;
        this.f45143h.clear();
    }

    /* renamed from: a */
    private void m64724a(C17867a c17867a) {
        for (C17880e c17880e : c17867a.m64938d()) {
            m64723a(c17880e, c17867a);
        }
    }

    /* renamed from: a */
    private void m64723a(C17880e c17880e, C17867a c17867a) {
        View view = c17880e.m64883c().get();
        if (view == null) {
            return;
        }
        C17914a c17914a = this.f45137b.get(view);
        if (c17914a != null) {
            c17914a.m64710a(c17867a.getAdSessionId());
        } else {
            this.f45137b.put(view, new C17914a(c17880e, c17867a.getAdSessionId()));
        }
    }
}
