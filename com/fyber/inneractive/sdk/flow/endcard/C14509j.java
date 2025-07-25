package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.model.vast.EnumC14616i;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.flow.endcard.j */
/* loaded from: classes4.dex */
public final class C14509j {

    /* renamed from: a */
    public final ArrayList f27473a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f27474b = new ArrayList();

    /* renamed from: c */
    public int f27475c = -1;

    /* renamed from: a */
    public final AbstractC14501b m77852a(EnumC14616i enumC14616i) {
        Iterator it = this.f27474b.iterator();
        while (it.hasNext()) {
            AbstractC14501b abstractC14501b = (AbstractC14501b) it.next();
            if (abstractC14501b.mo77845h() == enumC14616i) {
                return abstractC14501b;
            }
        }
        return null;
    }
}
