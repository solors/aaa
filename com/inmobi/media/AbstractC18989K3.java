package com.inmobi.media;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.K3 */
/* loaded from: classes6.dex */
public abstract class AbstractC18989K3 {

    /* renamed from: a */
    public final C18903E1 f47391a;

    public AbstractC18989K3(String b64feature) {
        Intrinsics.checkNotNullParameter(b64feature, "b64feature");
        C18903E1 c18903e1 = new C18903E1();
        this.f47391a = c18903e1;
        c18903e1.m61140a(b64feature);
    }

    /* renamed from: a */
    public final boolean m60981a(boolean z) {
        BitSet bitSet = this.f47391a.f47193a;
        if (bitSet != null) {
            return bitSet.get(0);
        }
        return z;
    }
}
