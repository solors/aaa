package com.inmobi.media;

import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;

/* renamed from: com.inmobi.media.J3 */
/* loaded from: classes6.dex */
public abstract class AbstractC18975J3 {
    /* renamed from: a */
    public static final boolean m60997a(String str) {
        CharSequence m16571b1;
        boolean m16624M;
        boolean m16624M2;
        if (str != null) {
            m16571b1 = C37690r.m16571b1(str);
            if (m16571b1.toString().length() != 0) {
                m16624M = StringsJVM.m16624M(str, "http://", false, 2, null);
                if (m16624M) {
                    return false;
                }
                m16624M2 = StringsJVM.m16624M(str, DtbConstants.HTTPS, false, 2, null);
                if (m16624M2) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final void m60996a(Thread thread, String name) {
        Intrinsics.checkNotNullParameter(thread, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            thread.start();
        } catch (InternalError e) {
            e.toString();
        }
    }
}
