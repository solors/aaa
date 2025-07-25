package com.iab.omid.library.unity3d.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.unity3d.adsession.C18678a;
import com.iab.omid.library.unity3d.internal.C18688c;
import com.iab.omid.library.unity3d.internal.C18691e;
import com.iab.omid.library.unity3d.utils.C18716h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.unity3d.walking.a */
/* loaded from: classes6.dex */
public class C18720a {

    /* renamed from: a */
    private final HashMap<View, String> f46821a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18721a> f46822b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46823c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46824d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46825e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46826f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46827g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f46828h = new WeakHashMap();

    /* renamed from: i */
    private boolean f46829i;

    /* renamed from: com.iab.omid.library.unity3d.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18721a {

        /* renamed from: a */
        private final C18691e f46830a;

        /* renamed from: b */
        private final ArrayList<String> f46831b = new ArrayList<>();

        public C18721a(C18691e c18691e, String str) {
            this.f46830a = c18691e;
            m61583a(str);
        }

        /* renamed from: a */
        public C18691e m61584a() {
            return this.f46830a;
        }

        /* renamed from: b */
        public ArrayList<String> m61582b() {
            return this.f46831b;
        }

        /* renamed from: a */
        public void m61583a(String str) {
            this.f46831b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m61593b(View view) {
        if (view.hasWindowFocus()) {
            this.f46828h.remove(view);
            return Boolean.FALSE;
        } else if (this.f46828h.containsKey(view)) {
            return this.f46828h.get(view);
        } else {
            Map<View, Boolean> map = this.f46828h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m61595a(String str) {
        return this.f46823c.get(str);
    }

    /* renamed from: c */
    public C18721a m61590c(View view) {
        C18721a c18721a = this.f46822b.get(view);
        if (c18721a != null) {
            this.f46822b.remove(view);
        }
        return c18721a;
    }

    /* renamed from: d */
    public String m61588d(View view) {
        if (this.f46821a.size() == 0) {
            return null;
        }
        String str = this.f46821a.get(view);
        if (str != null) {
            this.f46821a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC18731c m61586e(View view) {
        return this.f46824d.contains(view) ? EnumC18731c.PARENT_VIEW : this.f46829i ? EnumC18731c.OBSTRUCTION_VIEW : EnumC18731c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m61585f(View view) {
        if (this.f46828h.containsKey(view)) {
            this.f46828h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m61598a(View view) {
        if (view.isAttachedToWindow()) {
            if (m61593b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m61624a = C18716h.m61624a(view);
                if (m61624a != null) {
                    return m61624a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f46824d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m61592b(String str) {
        return this.f46827g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m61591c() {
        return this.f46825e;
    }

    /* renamed from: d */
    public void m61589d() {
        this.f46829i = true;
    }

    /* renamed from: e */
    public void m61587e() {
        C18688c m61749c = C18688c.m61749c();
        if (m61749c != null) {
            for (C18678a c18678a : m61749c.m61753a()) {
                View m61792c = c18678a.m61792c();
                if (c18678a.m61787f()) {
                    String adSessionId = c18678a.getAdSessionId();
                    if (m61792c != null) {
                        String m61598a = m61598a(m61792c);
                        if (m61598a == null) {
                            this.f46825e.add(adSessionId);
                            this.f46821a.put(m61792c, adSessionId);
                            m61597a(c18678a);
                        } else if (m61598a != "noWindowFocus") {
                            this.f46826f.add(adSessionId);
                            this.f46823c.put(adSessionId, m61792c);
                            this.f46827g.put(adSessionId, m61598a);
                        }
                    } else {
                        this.f46826f.add(adSessionId);
                        this.f46827g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m61599a() {
        this.f46821a.clear();
        this.f46822b.clear();
        this.f46823c.clear();
        this.f46824d.clear();
        this.f46825e.clear();
        this.f46826f.clear();
        this.f46827g.clear();
        this.f46829i = false;
    }

    /* renamed from: b */
    public HashSet<String> m61594b() {
        return this.f46826f;
    }

    /* renamed from: a */
    private void m61597a(C18678a c18678a) {
        for (C18691e c18691e : c18678a.m61790d()) {
            m61596a(c18691e, c18678a);
        }
    }

    /* renamed from: a */
    private void m61596a(C18691e c18691e, C18678a c18678a) {
        View view = c18691e.m61734c().get();
        if (view == null) {
            return;
        }
        C18721a c18721a = this.f46822b.get(view);
        if (c18721a != null) {
            c18721a.m61583a(c18678a.getAdSessionId());
        } else {
            this.f46822b.put(view, new C18721a(c18691e, c18678a.getAdSessionId()));
        }
    }
}
