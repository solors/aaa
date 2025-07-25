package com.p551my.target;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.g5 */
/* loaded from: classes7.dex */
public class C25771g5 extends AbstractC26019q {

    /* renamed from: b */
    public final int f66870b;

    /* renamed from: c */
    public final String f66871c;

    /* renamed from: d */
    public final ArrayList f66872d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f66873e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f66874f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f66875g = new ArrayList();

    /* renamed from: h */
    public int f66876h = 10;

    /* renamed from: i */
    public int f66877i = -1;

    public C25771g5(String str) {
        char c = 65535;
        this.f66871c = str;
        str.hashCode();
        switch (str.hashCode()) {
            case -318297696:
                if (str.equals(InstreamAdBreakType.PREROLL)) {
                    c = 0;
                    break;
                }
                break;
            case 757909789:
                if (str.equals(InstreamAdBreakType.POSTROLL)) {
                    c = 1;
                    break;
                }
                break;
            case 830323571:
                if (str.equals(InstreamAdBreakType.PAUSEROLL)) {
                    c = 2;
                    break;
                }
                break;
            case 1055572677:
                if (str.equals(InstreamAdBreakType.MIDROLL)) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.f66870b = 1;
                return;
            case 1:
                this.f66870b = 3;
                return;
            case 2:
                this.f66870b = 4;
                return;
            case 3:
                this.f66870b = 2;
                return;
            default:
                this.f66870b = 0;
                return;
        }
    }

    /* renamed from: b */
    public static C25771g5 m43869b(String str) {
        return new C25771g5(str);
    }

    /* renamed from: a */
    public void m43872a(C26073s c26073s) {
        (c26073s.m43007H() ? this.f66874f : c26073s.m43009F() ? this.f66873e : this.f66875g).add(c26073s);
    }

    /* renamed from: c */
    public void m43868c() {
        this.f66875g.clear();
    }

    /* renamed from: d */
    public List m43867d() {
        return new ArrayList(this.f66872d);
    }

    /* renamed from: e */
    public int m43866e() {
        return this.f66876h;
    }

    /* renamed from: f */
    public int m43865f() {
        return this.f66877i;
    }

    /* renamed from: g */
    public ArrayList m43864g() {
        return new ArrayList(this.f66874f);
    }

    /* renamed from: h */
    public String m43863h() {
        return this.f66871c;
    }

    /* renamed from: i */
    public boolean m43862i() {
        if (this.f66874f.isEmpty() && this.f66873e.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public C26073s m43861j() {
        if (this.f66873e.size() > 0) {
            return (C26073s) this.f66873e.remove(0);
        }
        return null;
    }

    /* renamed from: a */
    public void m43875a(C25704d5 c25704d5) {
        c25704d5.setMediaSectionType(this.f66870b);
        this.f66872d.add(c25704d5);
    }

    /* renamed from: b */
    public void m43870b(int i) {
        this.f66877i = i;
    }

    /* renamed from: a */
    public void m43874a(C25704d5 c25704d5, int i) {
        int size = this.f66872d.size();
        if (i < 0 || i > size) {
            return;
        }
        c25704d5.setMediaSectionType(this.f66870b);
        this.f66872d.add(i, c25704d5);
        Iterator it = this.f66875g.iterator();
        while (it.hasNext()) {
            C26073s c26073s = (C26073s) it.next();
            int m43014A = c26073s.m43014A();
            if (m43014A >= i) {
                c26073s.m42978d(m43014A + 1);
            }
        }
    }

    /* renamed from: a */
    public void m43873a(C25771g5 c25771g5) {
        Iterator it = c25771g5.f66872d.iterator();
        while (it.hasNext()) {
            m43875a((C25704d5) it.next());
        }
        this.f66873e.addAll(c25771g5.f66873e);
        this.f66874f.addAll(c25771g5.f66874f);
    }

    @Override // com.p551my.target.AbstractC26019q
    /* renamed from: a */
    public int mo42296a() {
        return this.f66872d.size();
    }

    /* renamed from: a */
    public static C25771g5 m43871a(String str) {
        return m43869b(str);
    }

    /* renamed from: a */
    public ArrayList m43877a(float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f66874f.iterator();
        while (it.hasNext()) {
            C26073s c26073s = (C26073s) it.next();
            if (c26073s.m42944y() == f) {
                arrayList.add(c26073s);
            }
        }
        if (arrayList.size() > 0) {
            this.f66874f.removeAll(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m43876a(int i) {
        this.f66876h = i;
    }
}
