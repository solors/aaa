package com.iab.omid.library.smaato.walking;

import android.view.View;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import com.iab.omid.library.smaato.adsession.C18559a;
import com.iab.omid.library.smaato.internal.C18569c;
import com.iab.omid.library.smaato.internal.C18572e;
import com.iab.omid.library.smaato.utils.C18600h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.iab.omid.library.smaato.walking.a */
/* loaded from: classes6.dex */
public class C18605a {

    /* renamed from: a */
    private final HashMap<View, String> f46564a = new HashMap<>();

    /* renamed from: b */
    private final HashMap<View, C18606a> f46565b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, View> f46566c = new HashMap<>();

    /* renamed from: d */
    private final HashSet<View> f46567d = new HashSet<>();

    /* renamed from: e */
    private final HashSet<String> f46568e = new HashSet<>();

    /* renamed from: f */
    private final HashSet<String> f46569f = new HashSet<>();

    /* renamed from: g */
    private final HashMap<String, String> f46570g = new HashMap<>();

    /* renamed from: h */
    private final HashSet<String> f46571h = new HashSet<>();

    /* renamed from: i */
    private final Map<View, Boolean> f46572i = new WeakHashMap();

    /* renamed from: j */
    private boolean f46573j;

    /* renamed from: com.iab.omid.library.smaato.walking.a$a */
    /* loaded from: classes6.dex */
    public static class C18606a {

        /* renamed from: a */
        private final C18572e f46574a;

        /* renamed from: b */
        private final ArrayList<String> f46575b = new ArrayList<>();

        public C18606a(C18572e c18572e, String str) {
            this.f46574a = c18572e;
            m62052a(str);
        }

        /* renamed from: a */
        public C18572e m62053a() {
            return this.f46574a;
        }

        /* renamed from: b */
        public ArrayList<String> m62051b() {
            return this.f46575b;
        }

        /* renamed from: a */
        public void m62052a(String str) {
            this.f46575b.add(str);
        }
    }

    /* renamed from: a */
    public View m62064a(String str) {
        return this.f46566c.get(str);
    }

    /* renamed from: b */
    public C18606a m62062b(View view) {
        C18606a c18606a = this.f46565b.get(view);
        if (c18606a != null) {
            this.f46565b.remove(view);
        }
        return c18606a;
    }

    /* renamed from: c */
    public String m62059c(View view) {
        if (this.f46564a.size() == 0) {
            return null;
        }
        String str = this.f46564a.get(view);
        if (str != null) {
            this.f46564a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC18616c m62056d(View view) {
        return this.f46567d.contains(view) ? EnumC18616c.PARENT_VIEW : this.f46573j ? EnumC18616c.OBSTRUCTION_VIEW : EnumC18616c.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m62055e() {
        C18569c m62240c = C18569c.m62240c();
        if (m62240c != null) {
            for (C18559a c18559a : m62240c.m62244a()) {
                View m62281c = c18559a.m62281c();
                if (c18559a.m62278f()) {
                    String adSessionId = c18559a.getAdSessionId();
                    if (m62281c != null) {
                        boolean m62094e = C18600h.m62094e(m62281c);
                        if (m62094e) {
                            this.f46571h.add(adSessionId);
                        }
                        String m62067a = m62067a(m62281c, m62094e);
                        if (m62067a == null) {
                            this.f46568e.add(adSessionId);
                            this.f46564a.put(m62281c, adSessionId);
                            m62066a(c18559a);
                        } else if (m62067a != "noWindowFocus") {
                            this.f46569f.add(adSessionId);
                            this.f46566c.put(adSessionId, m62281c);
                            this.f46570g.put(adSessionId, m62067a);
                        }
                    } else {
                        this.f46569f.add(adSessionId);
                        this.f46570g.put(adSessionId, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private Boolean m62068a(View view) {
        if (view.hasWindowFocus()) {
            this.f46572i.remove(view);
            return Boolean.FALSE;
        } else if (this.f46572i.containsKey(view)) {
            return this.f46572i.get(view);
        } else {
            Map<View, Boolean> map = this.f46572i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m62061b(String str) {
        return this.f46570g.get(str);
    }

    /* renamed from: c */
    public HashSet<String> m62060c() {
        return this.f46568e;
    }

    /* renamed from: d */
    public void m62057d() {
        this.f46573j = true;
    }

    /* renamed from: e */
    public boolean m62054e(View view) {
        if (this.f46572i.containsKey(view)) {
            this.f46572i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private String m62067a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m62068a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m62098a = C18600h.m62098a(view);
                    if (m62098a != null) {
                        return m62098a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f46567d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet<String> m62063b() {
        return this.f46569f;
    }

    @VisibleForTesting
    /* renamed from: c */
    public boolean m62058c(String str) {
        return this.f46571h.contains(str);
    }

    /* renamed from: a */
    public void m62069a() {
        this.f46564a.clear();
        this.f46565b.clear();
        this.f46566c.clear();
        this.f46567d.clear();
        this.f46568e.clear();
        this.f46569f.clear();
        this.f46570g.clear();
        this.f46573j = false;
        this.f46571h.clear();
    }

    /* renamed from: a */
    private void m62066a(C18559a c18559a) {
        for (C18572e c18572e : c18559a.m62280d()) {
            m62065a(c18572e, c18559a);
        }
    }

    /* renamed from: a */
    private void m62065a(C18572e c18572e, C18559a c18559a) {
        View view = c18572e.m62225c().get();
        if (view == null) {
            return;
        }
        C18606a c18606a = this.f46565b.get(view);
        if (c18606a != null) {
            c18606a.m62052a(c18559a.getAdSessionId());
        } else {
            this.f46565b.put(view, new C18606a(c18572e, c18559a.getAdSessionId()));
        }
    }
}
