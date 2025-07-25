package com.taurusx.tax.p606j;

import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p578b.p581e.C28219a;
import java.util.ArrayList;
import java.util.Iterator;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.m */
/* loaded from: classes7.dex */
public class C28529m {

    /* renamed from: a */
    public static final String f73974a;

    /* renamed from: b */
    public static final String f73975b;

    /* renamed from: c */
    public static final String f73976c;

    /* renamed from: d */
    public static final String f73977d;

    /* renamed from: e */
    public static final String f73978e;

    /* renamed from: f */
    public static final String f73979f;

    /* renamed from: g */
    public static final String f73980g;

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f73974a = stringFogImpl.m23824a(new byte[]{-110, 30, -119, 14, -102, 15, -110, 25, -110, 30}, new byte[]{-51, 65});
        f73975b = stringFogImpl.m23824a(new byte[]{-7, 78, -30, 94, -15, 95, -7, 72, -7, 78}, new byte[]{-90, 17});
        f73976c = stringFogImpl.m23824a(new byte[]{-84, -4, -90, -13, -84, -5, -84, -4}, new byte[]{-13, -93});
        f73977d = stringFogImpl.m23824a(new byte[]{SignedBytes.MAX_POWER_OF_TWO, 49, 74, 62, SignedBytes.MAX_POWER_OF_TWO, 55, SignedBytes.MAX_POWER_OF_TWO, 49}, new byte[]{31, 110});
        f73978e = stringFogImpl.m23824a(new byte[]{-31, 78, -3, 93, -11, 78, -22, 88, -13, 84, -31, 78}, new byte[]{-66, 17});
        f73979f = stringFogImpl.m23824a(new byte[]{15, -22, 7, -4, 20, -31, 24, -22, 15}, new byte[]{80, -75});
        f73980g = stringFogImpl.m23824a(new byte[]{6, -15, 17, -21, 16, -23, 17, -6, 6, -15}, new byte[]{89, -82});
    }

    /* renamed from: a */
    public static ArrayList m37998a(ArrayList<String> arrayList, C28219a c28219a) {
        if (arrayList != null && c28219a != null && arrayList.size() != 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().replace(f73974a, c28219a.f73285a).replace(f73975b, c28219a.f73286b).replace(f73976c, c28219a.f73287c).replace(f73977d, c28219a.f73288d).replace(f73978e, c28219a.f73291g).replace(f73979f, c28219a.f73289e).replace(f73980g, c28219a.f73290f));
            }
            return arrayList2;
        }
        return null;
    }
}
