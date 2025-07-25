package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.my.target.z8 */
/* loaded from: classes7.dex */
public class C26274z8 {

    /* renamed from: a */
    public final ArrayList f68422a;

    /* renamed from: b */
    public final ArrayList f68423b;

    /* renamed from: c */
    public int f68424c = -1;

    public C26274z8(C25711da c25711da) {
        ArrayList arrayList = new ArrayList();
        Iterator it = c25711da.m43997b("playheadTimerValue").iterator();
        while (it.hasNext()) {
            C25689ca c25689ca = (C25689ca) it.next();
            if (c25689ca instanceof C25660b9) {
                arrayList.add((C25660b9) c25689ca);
            }
        }
        this.f68422a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f68423b = arrayList2;
        c25711da.m43996b(arrayList2);
    }

    /* renamed from: a */
    public static C26274z8 m42239a(C25711da c25711da) {
        return new C26274z8(c25711da);
    }

    /* renamed from: a */
    public final void m42240a(int i, C25660b9 c25660b9, Context context) {
        int m44149f = c25660b9.m44149f();
        int m44151d = c25660b9.m44151d();
        if (m44149f <= i) {
            if ((m44151d == 0 || m44151d >= i) && (i - m44149f) % c25660b9.m44150e() == 0) {
                String replace = c25660b9.m44064b().replace("[CONTENTPLAYHEAD]", String.valueOf(i));
                if (TextUtils.isEmpty(replace)) {
                    return;
                }
                C25735ea.m43953c(replace, context);
            }
        }
    }

    /* renamed from: a */
    public void m42241a(int i, int i2, Context context) {
        if (i2 < 0 || i < 0 || i == this.f68424c) {
            return;
        }
        this.f68424c = i;
        if (!this.f68422a.isEmpty() && i != 0) {
            Iterator it = this.f68422a.iterator();
            while (it.hasNext()) {
                m42240a(i, (C25660b9) it.next(), context);
            }
        }
        ArrayList arrayList = new ArrayList();
        while (!this.f68423b.isEmpty()) {
            ArrayList arrayList2 = this.f68423b;
            if (((C25659b8) arrayList2.get(arrayList2.size() - 1)).m44156e() > i) {
                break;
            }
            ArrayList arrayList3 = this.f68423b;
            arrayList.add((C25659b8) arrayList3.remove(arrayList3.size() - 1));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        C25735ea.m43958a(arrayList, context);
    }
}
