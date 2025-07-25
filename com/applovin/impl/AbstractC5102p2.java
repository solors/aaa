package com.applovin.impl;

import android.os.Bundle;
import android.util.SparseArray;
import com.applovin.impl.AbstractC4247db;
import com.applovin.impl.InterfaceC5044o2;
import java.util.List;

/* renamed from: com.applovin.impl.p2 */
/* loaded from: classes2.dex */
public abstract class AbstractC5102p2 {
    /* renamed from: a */
    public static void m96603a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) AbstractC5863xp.m93017a(AbstractC5102p2.class.getClassLoader()));
        }
    }

    /* renamed from: a */
    public static List m96599a(InterfaceC5044o2.InterfaceC5045a interfaceC5045a, List list, List list2) {
        return list == null ? list2 : m96600a(interfaceC5045a, list);
    }

    /* renamed from: a */
    public static SparseArray m96601a(InterfaceC5044o2.InterfaceC5045a interfaceC5045a, SparseArray sparseArray, SparseArray sparseArray2) {
        if (sparseArray == null) {
            return sparseArray2;
        }
        SparseArray sparseArray3 = new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray3.put(sparseArray.keyAt(i), interfaceC5045a.mo92505a((Bundle) sparseArray.valueAt(i)));
        }
        return sparseArray3;
    }

    /* renamed from: a */
    public static InterfaceC5044o2 m96602a(InterfaceC5044o2.InterfaceC5045a interfaceC5045a, Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return interfaceC5045a.mo92505a(bundle);
    }

    /* renamed from: a */
    public static AbstractC4247db m96600a(InterfaceC5044o2.InterfaceC5045a interfaceC5045a, List list) {
        AbstractC4247db.C4248a m99831f = AbstractC4247db.m99831f();
        for (int i = 0; i < list.size(); i++) {
            m99831f.m99827b(interfaceC5045a.mo92505a((Bundle) AbstractC4100b1.m100583a((Bundle) list.get(i))));
        }
        return m99831f.m99828a();
    }
}
