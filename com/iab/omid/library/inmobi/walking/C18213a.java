package com.iab.omid.library.inmobi.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.inmobi.adsession.C18169a;
import com.iab.omid.library.inmobi.internal.C18179c;
import com.iab.omid.library.inmobi.internal.C18182e;
import com.iab.omid.library.inmobi.utils.C18208h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.inmobi.walking.a */
/* loaded from: classes6.dex */
public class C18213a {

    /* renamed from: a */
    private final HashMap<View, String> f45765a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18214a> f45766b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45767c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45768d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45769e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45770f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45771g = new HashMap<>();

    /* renamed from: h */
    private final Map<View, Boolean> f45772h = new WeakHashMap();

    /* renamed from: i */
    private boolean f45773i;

    /* renamed from: com.iab.omid.library.inmobi.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18214a {

        /* renamed from: a */
        private final C18182e f45774a;

        /* renamed from: b */
        private final ArrayList<String> f45775b = new ArrayList<>();

        public C18214a(C18182e c18182e, String str) {
            this.f45774a = c18182e;
            m63552a(str);
        }

        /* renamed from: a */
        public C18182e m63553a() {
            return this.f45774a;
        }

        /* renamed from: b */
        public ArrayList<String> m63551b() {
            return this.f45775b;
        }

        /* renamed from: a */
        public void m63552a(String str) {
            this.f45775b.add(str);
        }
    }

    /* renamed from: b */
    private Boolean m63562b(View view) {
        if (view.hasWindowFocus()) {
            this.f45772h.remove(view);
            return Boolean.FALSE;
        } else if (this.f45772h.containsKey(view)) {
            return this.f45772h.get(view);
        } else {
            Map<View, Boolean> map = this.f45772h;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: a */
    public View m63564a(String str) {
        return this.f45767c.get(str);
    }

    /* renamed from: c */
    public C18214a m63559c(View view) {
        C18214a c18214a = this.f45766b.get(view);
        if (c18214a != null) {
            this.f45766b.remove(view);
        }
        return c18214a;
    }

    /* renamed from: d */
    public String m63557d(View view) {
        if (this.f45765a.size() == 0) {
            return null;
        }
        String str = this.f45765a.get(view);
        if (str != null) {
            this.f45765a.remove(view);
        }
        return str;
    }

    /* renamed from: e */
    public EnumC18224c m63555e(View view) {
        return this.f45768d.contains(view) ? EnumC18224c.PARENT_VIEW : this.f45773i ? EnumC18224c.OBSTRUCTION_VIEW : EnumC18224c.UNDERLYING_VIEW;
    }

    /* renamed from: f */
    public boolean m63554f(View view) {
        if (this.f45772h.containsKey(view)) {
            this.f45772h.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m63567a(View view) {
        if (view.isAttachedToWindow()) {
            if (m63562b(view).booleanValue()) {
                return "noWindowFocus";
            }
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m63595a = C18208h.m63595a(view);
                if (m63595a != null) {
                    return m63595a;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f45768d.addAll(hashSet);
            return null;
        }
        return "notAttached";
    }

    /* renamed from: b */
    public String m63561b(String str) {
        return this.f45771g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m63560c() {
        return this.f45769e;
    }

    /* renamed from: d */
    public void m63558d() {
        this.f45773i = true;
    }

    /* renamed from: e */
    public void m63556e() {
        C18179c m63728c = C18179c.m63728c();
        if (m63728c != null) {
            for (C18169a c18169a : m63728c.m63732a()) {
                View m63769c = c18169a.m63769c();
                if (c18169a.m63766f()) {
                    String adSessionId = c18169a.getAdSessionId();
                    if (m63769c != null) {
                        String m63567a = m63567a(m63769c);
                        if (m63567a == null) {
                            this.f45769e.add(adSessionId);
                            this.f45765a.put(m63769c, adSessionId);
                            m63566a(c18169a);
                        } else if (m63567a != "noWindowFocus") {
                            this.f45770f.add(adSessionId);
                            this.f45767c.put(adSessionId, m63769c);
                            this.f45771g.put(adSessionId, m63567a);
                        }
                    } else {
                        this.f45770f.add(adSessionId);
                        this.f45771g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m63568a() {
        this.f45765a.clear();
        this.f45766b.clear();
        this.f45767c.clear();
        this.f45768d.clear();
        this.f45769e.clear();
        this.f45770f.clear();
        this.f45771g.clear();
        this.f45773i = false;
    }

    /* renamed from: b */
    public HashSet<String> m63563b() {
        return this.f45770f;
    }

    /* renamed from: a */
    private void m63566a(C18169a c18169a) {
        for (C18182e c18182e : c18169a.m63768d()) {
            m63565a(c18182e, c18169a);
        }
    }

    /* renamed from: a */
    private void m63565a(C18182e c18182e, C18169a c18169a) {
        View view = c18182e.m63713c().get();
        if (view == null) {
            return;
        }
        C18214a c18214a = this.f45766b.get(view);
        if (c18214a != null) {
            c18214a.m63552a(c18169a.getAdSessionId());
        } else {
            this.f45766b.put(view, new C18214a(c18182e, c18169a.getAdSessionId()));
        }
    }
}
