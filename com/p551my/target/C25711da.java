package com.p551my.target;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: com.my.target.da */
/* loaded from: classes7.dex */
public final class C25711da {

    /* renamed from: a */
    public final Set f66743a = new HashSet();

    /* renamed from: b */
    public final Set f66744b = new HashSet();

    /* renamed from: c */
    public final Set f66745c = new HashSet();

    /* renamed from: d */
    public final Set f66746d = new HashSet();

    /* renamed from: e */
    public final List f66747e = new ArrayList();

    /* renamed from: f */
    public final List f66748f = new ArrayList();

    /* renamed from: g */
    public final Comparator f66749g = new Comparator() { // from class: com.my.target.rb
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return C25711da.m44004a((C26142u7) obj, (C26142u7) obj2);
        }
    };

    /* renamed from: c */
    public static C25711da m43995c() {
        return new C25711da();
    }

    /* renamed from: a */
    public void m44002a(ArrayList arrayList) {
        this.f66744b.addAll(arrayList);
    }

    /* renamed from: b */
    public void m43996b(List list) {
        list.addAll(this.f66744b);
        Collections.sort(list, new Comparator() { // from class: com.my.target.qb
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C25711da.m44007a((C25659b8) obj, (C25659b8) obj2);
            }
        });
    }

    /* renamed from: a */
    public void m44006a(C25689ca c25689ca) {
        if (c25689ca instanceof C26114t7) {
            String m42837d = ((C26114t7) c25689ca).m42837d();
            if ("landscape".equals(m42837d)) {
                this.f66746d.add(c25689ca);
            } else if ("portrait".equals(m42837d)) {
                this.f66745c.add(c25689ca);
            }
        } else if (c25689ca instanceof C25659b8) {
            this.f66744b.add((C25659b8) c25689ca);
        } else if (!(c25689ca instanceof C26142u7)) {
            if (c25689ca instanceof C25632a6) {
                this.f66748f.add((C25632a6) c25689ca);
            } else {
                this.f66743a.add(c25689ca);
            }
        } else {
            C26142u7 c26142u7 = (C26142u7) c25689ca;
            int binarySearch = Collections.binarySearch(this.f66747e, c26142u7, this.f66749g);
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            this.f66747e.add(binarySearch, c26142u7);
        }
    }

    /* renamed from: b */
    public ArrayList m43999b(int i) {
        ArrayList arrayList = new ArrayList();
        for (C26142u7 c26142u7 : this.f66747e) {
            if (c26142u7.m44204d() == i) {
                arrayList.add(c26142u7);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m44001a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m44006a((C25689ca) it.next());
        }
    }

    /* renamed from: b */
    public ArrayList m43997b(String str) {
        ArrayList arrayList = new ArrayList();
        for (C25689ca c25689ca : this.f66743a) {
            if (str.equals(c25689ca.m44067a())) {
                arrayList.add(c25689ca);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public ArrayList m44008a(int i) {
        ArrayList arrayList = new ArrayList();
        for (C25632a6 c25632a6 : this.f66748f) {
            if (c25632a6.m44204d() == i) {
                arrayList.add(c25632a6);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public boolean m44000b() {
        return (this.f66743a.isEmpty() && this.f66744b.isEmpty() && this.f66747e.isEmpty() && this.f66748f.isEmpty() && this.f66746d.isEmpty() && this.f66745c.isEmpty()) ? false : true;
    }

    /* renamed from: a */
    public List m44003a(String str) {
        return new ArrayList(str.equals("portrait") ? this.f66745c : this.f66746d);
    }

    /* renamed from: b */
    public void m43998b(C25711da c25711da, float f) {
        this.f66743a.addAll(c25711da.m43997b("playbackStarted"));
        this.f66743a.addAll(c25711da.m43997b("playbackResumed"));
        this.f66743a.addAll(c25711da.m43997b("playbackPaused"));
        this.f66743a.addAll(c25711da.m43997b("playbackStopped"));
        this.f66743a.addAll(c25711da.m43997b("playbackCompleted"));
        this.f66743a.addAll(c25711da.m43997b("playbackError"));
        this.f66743a.addAll(c25711da.m43997b("volumeOn"));
        this.f66743a.addAll(c25711da.m43997b("volumeOff"));
        this.f66743a.addAll(c25711da.m43997b("fullscreenOn"));
        this.f66743a.addAll(c25711da.m43997b("fullscreenOff"));
        this.f66743a.addAll(c25711da.m43997b("error"));
        this.f66743a.addAll(c25711da.m43997b("playbackTimeout"));
        this.f66748f.addAll(c25711da.m44008a(2));
        if (f <= 0.0f) {
            this.f66744b.addAll(c25711da.f66744b);
            this.f66747e.addAll(c25711da.m43999b(2));
            return;
        }
        for (C25659b8 c25659b8 : c25711da.f66744b) {
            float m44157d = c25659b8.m44157d();
            if (m44157d >= 0.0f) {
                c25659b8.m44158b((m44157d * f) / 100.0f);
                c25659b8.m44160a(-1.0f);
            }
            m44006a(c25659b8);
        }
        Iterator it = c25711da.m43999b(2).iterator();
        while (it.hasNext()) {
            C26142u7 c26142u7 = (C26142u7) it.next();
            float m42752e = c26142u7.m42752e();
            if (m42752e >= 0.0f) {
                c26142u7.m42754b((m42752e * f) / 100.0f);
                c26142u7.m42756a(-1.0f);
            }
            m44006a(c26142u7);
        }
    }

    /* renamed from: a */
    public Set m44009a() {
        return new HashSet(this.f66744b);
    }

    /* renamed from: a */
    public void m44005a(C25711da c25711da, float f) {
        this.f66743a.addAll(c25711da.f66743a);
        this.f66748f.addAll(c25711da.f66748f);
        this.f66745c.addAll(c25711da.f66745c);
        this.f66746d.addAll(c25711da.f66746d);
        if (f <= 0.0f) {
            this.f66744b.addAll(c25711da.f66744b);
            this.f66747e.addAll(c25711da.f66747e);
            return;
        }
        for (C25659b8 c25659b8 : c25711da.f66744b) {
            float m44157d = c25659b8.m44157d();
            if (m44157d >= 0.0f) {
                c25659b8.m44158b((m44157d * f) / 100.0f);
                c25659b8.m44160a(-1.0f);
            }
            m44006a(c25659b8);
        }
        for (C26142u7 c26142u7 : c25711da.f66747e) {
            float m42752e = c26142u7.m42752e();
            if (m42752e >= 0.0f) {
                c26142u7.m42754b((m42752e * f) / 100.0f);
                c26142u7.m42756a(-1.0f);
            }
            m44006a(c26142u7);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ int m44007a(C25659b8 c25659b8, C25659b8 c25659b82) {
        return (int) (c25659b82.m44156e() - c25659b8.m44156e());
    }

    /* renamed from: a */
    public static /* synthetic */ int m44004a(C26142u7 c26142u7, C26142u7 c26142u72) {
        return AbstractC26075s1.m42940a(c26142u72.m42751f(), c26142u7.m42751f());
    }
}
