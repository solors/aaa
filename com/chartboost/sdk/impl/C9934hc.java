package com.chartboost.sdk.impl;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.chartboost.sdk.impl.hc */
/* loaded from: classes3.dex */
public class C9934hc {

    /* renamed from: a */
    public final HashMap f22244a = new HashMap();

    /* renamed from: b */
    public final HashMap f22245b = new HashMap();

    /* renamed from: c */
    public final HashMap f22246c = new HashMap();

    /* renamed from: d */
    public final HashSet f22247d = new HashSet();

    /* renamed from: e */
    public final HashSet f22248e = new HashSet();

    /* renamed from: f */
    public final HashSet f22249f = new HashSet();

    /* renamed from: g */
    public final HashMap f22250g = new HashMap();

    /* renamed from: h */
    public final HashSet f22251h = new HashSet();

    /* renamed from: i */
    public final Map f22252i = new WeakHashMap();

    /* renamed from: j */
    public boolean f22253j;

    /* renamed from: com.chartboost.sdk.impl.hc$a */
    /* loaded from: classes3.dex */
    public static class C9935a {

        /* renamed from: a */
        public final C9936hd f22254a;

        /* renamed from: b */
        public final ArrayList f22255b = new ArrayList();

        public C9935a(C9936hd c9936hd, String str) {
            this.f22254a = c9936hd;
            m81460a(str);
        }

        /* renamed from: a */
        public C9936hd m81461a() {
            return this.f22254a;
        }

        /* renamed from: b */
        public ArrayList m81459b() {
            return this.f22255b;
        }

        /* renamed from: a */
        public void m81460a(String str) {
            this.f22255b.add(str);
        }
    }

    /* renamed from: a */
    public View m81472a(String str) {
        return (View) this.f22246c.get(str);
    }

    /* renamed from: b */
    public C9935a m81470b(View view) {
        C9935a c9935a = (C9935a) this.f22245b.get(view);
        if (c9935a != null) {
            this.f22245b.remove(view);
        }
        return c9935a;
    }

    /* renamed from: c */
    public String m81467c(View view) {
        if (this.f22244a.size() == 0) {
            return null;
        }
        String str = (String) this.f22244a.get(view);
        if (str != null) {
            this.f22244a.remove(view);
        }
        return str;
    }

    /* renamed from: d */
    public EnumC10393yc m81464d(View view) {
        return this.f22247d.contains(view) ? EnumC10393yc.PARENT_VIEW : this.f22253j ? EnumC10393yc.OBSTRUCTION_VIEW : EnumC10393yc.UNDERLYING_VIEW;
    }

    /* renamed from: e */
    public void m81463e() {
        C10300vc m80229c = C10300vc.m80229c();
        if (m80229c != null) {
            for (C9746bc c9746bc : m80229c.m80233a()) {
                View m81980e = c9746bc.m81980e();
                if (c9746bc.m81977h()) {
                    String m81975j = c9746bc.m81975j();
                    if (m81980e != null) {
                        boolean m80710e = AbstractC10156qd.m80710e(m81980e);
                        if (m80710e) {
                            this.f22251h.add(m81975j);
                        }
                        String m81475a = m81475a(m81980e, m80710e);
                        if (m81475a == null) {
                            this.f22248e.add(m81975j);
                            this.f22244a.put(m81980e, m81975j);
                            m81474a(c9746bc);
                        } else if (m81475a != "noWindowFocus") {
                            this.f22249f.add(m81975j);
                            this.f22246c.put(m81975j, m81980e);
                            this.f22250g.put(m81975j, m81475a);
                        }
                    } else {
                        this.f22249f.add(m81975j);
                        this.f22250g.put(m81975j, "noAdView");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final Boolean m81476a(View view) {
        if (view.hasWindowFocus()) {
            this.f22252i.remove(view);
            return Boolean.FALSE;
        } else if (this.f22252i.containsKey(view)) {
            return (Boolean) this.f22252i.get(view);
        } else {
            Map map = this.f22252i;
            Boolean bool = Boolean.FALSE;
            map.put(view, bool);
            return bool;
        }
    }

    /* renamed from: b */
    public String m81469b(String str) {
        return (String) this.f22250g.get(str);
    }

    /* renamed from: c */
    public HashSet m81468c() {
        return this.f22248e;
    }

    /* renamed from: d */
    public void m81465d() {
        this.f22253j = true;
    }

    /* renamed from: e */
    public boolean m81462e(View view) {
        if (this.f22252i.containsKey(view)) {
            this.f22252i.put(view, Boolean.TRUE);
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final String m81475a(View view, boolean z) {
        if (view.isAttachedToWindow()) {
            if (!m81476a(view).booleanValue() || z) {
                HashSet hashSet = new HashSet();
                while (view != null) {
                    String m80714a = AbstractC10156qd.m80714a(view);
                    if (m80714a != null) {
                        return m80714a;
                    }
                    hashSet.add(view);
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                }
                this.f22247d.addAll(hashSet);
                return null;
            }
            return "noWindowFocus";
        }
        return "notAttached";
    }

    /* renamed from: b */
    public HashSet m81471b() {
        return this.f22249f;
    }

    /* renamed from: c */
    public boolean m81466c(String str) {
        return this.f22251h.contains(str);
    }

    /* renamed from: a */
    public void m81477a() {
        this.f22244a.clear();
        this.f22245b.clear();
        this.f22246c.clear();
        this.f22247d.clear();
        this.f22248e.clear();
        this.f22249f.clear();
        this.f22250g.clear();
        this.f22253j = false;
        this.f22251h.clear();
    }

    /* renamed from: a */
    public final void m81474a(C9746bc c9746bc) {
        for (C9936hd c9936hd : c9746bc.m81979f()) {
            m81473a(c9936hd, c9746bc);
        }
    }

    /* renamed from: a */
    public final void m81473a(C9936hd c9936hd, C9746bc c9746bc) {
        View view = (View) c9936hd.m81456c().get();
        if (view == null) {
            return;
        }
        C9935a c9935a = (C9935a) this.f22245b.get(view);
        if (c9935a != null) {
            c9935a.m81460a(c9746bc.m81975j());
        } else {
            this.f22245b.put(view, new C9935a(c9936hd, c9746bc.m81975j()));
        }
    }
}
