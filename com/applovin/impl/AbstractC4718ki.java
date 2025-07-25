package com.applovin.impl;

import android.os.Bundle;
import com.applovin.impl.InterfaceC5044o2;

/* renamed from: com.applovin.impl.ki */
/* loaded from: classes2.dex */
public abstract class AbstractC4718ki implements InterfaceC5044o2 {

    /* renamed from: a */
    public static final InterfaceC5044o2.InterfaceC5045a f7551a = new InterfaceC5044o2.InterfaceC5045a() { // from class: com.applovin.impl.sy
        @Override // com.applovin.impl.InterfaceC5044o2.InterfaceC5045a
        /* renamed from: a */
        public final InterfaceC5044o2 mo92505a(Bundle bundle) {
            return AbstractC4718ki.m97914c(bundle);
        }
    };

    /* renamed from: a */
    public static AbstractC4718ki m97915a(Bundle bundle) {
        int i = bundle.getInt(m97916a(0), -1);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return (AbstractC4718ki) C4202co.f5368d.mo92505a(bundle);
                    }
                    throw new IllegalArgumentException("Encountered unknown rating type: " + i);
                }
                return (AbstractC4718ki) C4197cl.f5358d.mo92505a(bundle);
            }
            return (AbstractC4718ki) C4394fh.f6122c.mo92505a(bundle);
        }
        return (AbstractC4718ki) C4825ma.f7927d.mo92505a(bundle);
    }

    /* renamed from: c */
    public static /* synthetic */ AbstractC4718ki m97914c(Bundle bundle) {
        return m97915a(bundle);
    }

    /* renamed from: a */
    private static String m97916a(int i) {
        return Integer.toString(i, 36);
    }
}
