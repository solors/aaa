package com.applovin.impl;

import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.applovin.impl.lz */
/* loaded from: classes2.dex */
public final /* synthetic */ class C4801lz {
    /* renamed from: a */
    public static /* synthetic */ String m97621a(CharSequence charSequence, Iterable iterable) {
        if (charSequence != null) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = iterable.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append(charSequence);
                }
            }
            return sb2.toString();
        }
        throw new NullPointerException("delimiter");
    }
}
