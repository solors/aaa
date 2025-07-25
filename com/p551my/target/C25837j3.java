package com.p551my.target;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.my.target.j3 */
/* loaded from: classes7.dex */
public class C25837j3 extends AbstractC26019q {

    /* renamed from: b */
    public final int f67031b;

    /* renamed from: c */
    public final String f67032c;

    /* renamed from: d */
    public final ArrayList f67033d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f67034e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f67035f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f67036g = new ArrayList();

    /* renamed from: h */
    public int f67037h = 10;

    /* renamed from: i */
    public int f67038i = -1;

    public C25837j3(String str) {
        char c = 65535;
        this.f67032c = str;
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
                this.f67031b = 1;
                return;
            case 1:
                this.f67031b = 3;
                return;
            case 2:
                this.f67031b = 4;
                return;
            case 3:
                this.f67031b = 2;
                return;
            default:
                this.f67031b = 0;
                return;
        }
    }

    /* renamed from: b */
    public static C25837j3 m43725b(String str) {
        return m43727a(str);
    }

    /* renamed from: a */
    public void m43728a(C26073s c26073s) {
        (c26073s.m43007H() ? this.f67035f : c26073s.m43009F() ? this.f67034e : this.f67036g).add(c26073s);
    }

    /* renamed from: c */
    public void m43724c() {
        this.f67036g.clear();
    }

    /* renamed from: d */
    public List m43723d() {
        return Collections.unmodifiableList(this.f67033d);
    }

    /* renamed from: e */
    public int m43722e() {
        return this.f67037h;
    }

    /* renamed from: f */
    public int m43721f() {
        return this.f67038i;
    }

    /* renamed from: g */
    public List m43720g() {
        return Collections.unmodifiableList(this.f67035f);
    }

    /* renamed from: h */
    public String m43719h() {
        return this.f67032c;
    }

    /* renamed from: i */
    public boolean m43718i() {
        if (this.f67035f.isEmpty() && this.f67034e.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public C26073s m43717j() {
        if (this.f67034e.size() > 0) {
            return (C26073s) this.f67034e.remove(0);
        }
        return null;
    }

    /* renamed from: a */
    public void m43731a(AbstractC25742f0 abstractC25742f0) {
        abstractC25742f0.setMediaSectionType(this.f67031b);
        this.f67033d.add(abstractC25742f0);
    }

    /* renamed from: b */
    public void m43726b(int i) {
        this.f67038i = i;
    }

    /* renamed from: a */
    public void m43730a(AbstractC25742f0 abstractC25742f0, int i) {
        int size = this.f67033d.size();
        if (i < 0 || i > size) {
            AbstractC25846ja.m43680a("InstreamVideoAdSection: can't add banner, wrong position");
            return;
        }
        abstractC25742f0.setMediaSectionType(this.f67031b);
        this.f67033d.add(i, abstractC25742f0);
        Iterator it = this.f67036g.iterator();
        while (it.hasNext()) {
            C26073s c26073s = (C26073s) it.next();
            int m43014A = c26073s.m43014A();
            if (m43014A >= i) {
                c26073s.m42978d(m43014A + 1);
            }
        }
    }

    /* renamed from: a */
    public void m43729a(C25837j3 c25837j3) {
        Iterator it = c25837j3.f67033d.iterator();
        while (it.hasNext()) {
            m43731a((AbstractC25742f0) it.next());
        }
        this.f67034e.addAll(c25837j3.f67034e);
        this.f67035f.addAll(c25837j3.f67035f);
    }

    @Override // com.p551my.target.AbstractC26019q
    /* renamed from: a */
    public int mo42296a() {
        return this.f67033d.size();
    }

    /* renamed from: a */
    public static C25837j3 m43727a(String str) {
        return new C25837j3(str);
    }

    /* renamed from: a */
    public ArrayList m43733a(float f) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f67035f.iterator();
        while (it.hasNext()) {
            C26073s c26073s = (C26073s) it.next();
            if (c26073s.m42944y() == f) {
                arrayList.add(c26073s);
            }
        }
        if (arrayList.size() > 0) {
            this.f67035f.removeAll(arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public void m43732a(int i) {
        this.f67037h = i;
    }
}
