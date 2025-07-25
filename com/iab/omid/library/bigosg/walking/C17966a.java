package com.iab.omid.library.bigosg.walking;

import android.view.View;
import android.view.ViewParent;
import com.iab.omid.library.bigosg.adsession.C17933a;
import com.iab.omid.library.bigosg.p387b.C17935a;
import com.iab.omid.library.bigosg.p387b.C17939c;
import com.iab.omid.library.bigosg.p389d.C17956f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.iab.omid.library.bigosg.walking.a */
/* loaded from: classes6.dex */
public class C17966a {

    /* renamed from: a */
    private final HashMap<View, String> f45259a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C17967a> f45260b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f45261c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f45262d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f45263e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f45264f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f45265g = new HashMap<>();

    /* renamed from: h */
    private boolean f45266h;

    /* renamed from: com.iab.omid.library.bigosg.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C17967a {

        /* renamed from: a */
        private final C17939c f45267a;

        /* renamed from: b */
        private final ArrayList<String> f45268b = new ArrayList<>();

        public C17967a(C17939c c17939c, String str) {
            this.f45267a = c17939c;
            m64496a(str);
        }

        /* renamed from: a */
        public C17939c m64497a() {
            return this.f45267a;
        }

        /* renamed from: b */
        public ArrayList<String> m64495b() {
            return this.f45268b;
        }

        /* renamed from: a */
        public void m64496a(String str) {
            this.f45268b.add(str);
        }
    }

    /* renamed from: d */
    private String m64499d(View view) {
        if (view.hasWindowFocus()) {
            HashSet hashSet = new HashSet();
            while (view != null) {
                String m64556e = C17956f.m64556e(view);
                if (m64556e != null) {
                    return m64556e;
                }
                hashSet.add(view);
                ViewParent parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            this.f45262d.addAll(hashSet);
            return null;
        }
        return "noWindowFocus";
    }

    /* renamed from: a */
    public String m64509a(View view) {
        if (this.f45259a.size() == 0) {
            return null;
        }
        String str = this.f45259a.get(view);
        if (str != null) {
            this.f45259a.remove(view);
        }
        return str;
    }

    /* renamed from: b */
    public View m64503b(String str) {
        return this.f45261c.get(str);
    }

    /* renamed from: c */
    public EnumC17977c m64501c(View view) {
        return this.f45262d.contains(view) ? EnumC17977c.PARENT_VIEW : this.f45266h ? EnumC17977c.OBSTRUCTION_VIEW : EnumC17977c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m64498e() {
        this.f45266h = true;
    }

    /* renamed from: a */
    public String m64506a(String str) {
        return this.f45265g.get(str);
    }

    /* renamed from: b */
    public C17967a m64504b(View view) {
        C17967a c17967a = this.f45260b.get(view);
        if (c17967a != null) {
            this.f45260b.remove(view);
        }
        return c17967a;
    }

    /* renamed from: c */
    public void m64502c() {
        C17935a m64659a = C17935a.m64659a();
        if (m64659a != null) {
            for (C17933a c17933a : m64659a.m64655c()) {
                View m64676d = c17933a.m64676d();
                if (c17933a.m64674e()) {
                    String adSessionId = c17933a.getAdSessionId();
                    if (m64676d != null) {
                        String m64499d = m64499d(m64676d);
                        if (m64499d == null) {
                            this.f45263e.add(adSessionId);
                            this.f45259a.put(m64676d, adSessionId);
                            m64508a(c17933a);
                        } else {
                            this.f45264f.add(adSessionId);
                            this.f45261c.put(adSessionId, m64676d);
                            this.f45265g.put(adSessionId, m64499d);
                        }
                    } else {
                        this.f45264f.add(adSessionId);
                        this.f45265g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m64500d() {
        this.f45259a.clear();
        this.f45260b.clear();
        this.f45261c.clear();
        this.f45262d.clear();
        this.f45263e.clear();
        this.f45264f.clear();
        this.f45265g.clear();
        this.f45266h = false;
    }

    /* renamed from: a */
    public HashSet<String> m64510a() {
        return this.f45263e;
    }

    /* renamed from: b */
    public HashSet<String> m64505b() {
        return this.f45264f;
    }

    /* renamed from: a */
    private void m64508a(C17933a c17933a) {
        for (C17939c c17939c : c17933a.m64684a()) {
            m64507a(c17939c, c17933a);
        }
    }

    /* renamed from: a */
    private void m64507a(C17939c c17939c, C17933a c17933a) {
        View view = c17939c.m64641a().get();
        if (view == null) {
            return;
        }
        C17967a c17967a = this.f45260b.get(view);
        if (c17967a != null) {
            c17967a.m64496a(c17933a.getAdSessionId());
        } else {
            this.f45260b.put(view, new C17967a(c17939c, c17933a.getAdSessionId()));
        }
    }
}
