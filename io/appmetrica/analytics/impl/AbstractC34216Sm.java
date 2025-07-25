package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C37566w;

/* renamed from: io.appmetrica.analytics.impl.Sm */
/* loaded from: classes9.dex */
public abstract class AbstractC34216Sm {
    /* renamed from: a */
    public static final C34145Pm m22243a(Throwable th, C34217T c34217t, List list, String str, Boolean bool) {
        C33903Fm c33903Fm;
        int m17154x;
        ArrayList arrayList = null;
        if (th != null) {
            c33903Fm = AbstractC33928Gm.m22577a(th, 1, 0);
        } else {
            c33903Fm = null;
        }
        if (list != null) {
            m17154x = C37566w.m17154x(list, 10);
            arrayList = new ArrayList(m17154x);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C33951Hk((StackTraceElement) it.next()));
            }
        }
        return new C34145Pm(c33903Fm, c34217t, arrayList, null, null, null, str, bool);
    }
}
