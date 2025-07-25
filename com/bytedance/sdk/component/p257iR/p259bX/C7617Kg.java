package com.bytedance.sdk.component.p257iR.p259bX;

import android.content.Context;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.component.iR.bX.Kg */
/* loaded from: classes3.dex */
public class C7617Kg {

    /* renamed from: IL */
    private static HashMap<Integer, C7625ldr> f16608IL;

    /* renamed from: bX */
    private static HashMap<Integer, C7619bg> f16609bX;

    /* renamed from: bg */
    private static volatile C7617Kg f16610bg;

    private C7617Kg() {
        f16608IL = new HashMap<>();
        f16609bX = new HashMap<>();
    }

    /* renamed from: bg */
    public static synchronized C7617Kg m88372bg() {
        C7617Kg c7617Kg;
        synchronized (C7617Kg.class) {
            if (f16610bg == null) {
                synchronized (C7617Kg.class) {
                    if (f16610bg == null) {
                        f16610bg = new C7617Kg();
                    }
                }
            }
            c7617Kg = f16610bg;
        }
        return c7617Kg;
    }

    /* renamed from: bg */
    public C7625ldr m88371bg(int i) {
        C7625ldr c7625ldr = f16608IL.get(Integer.valueOf(i));
        if (c7625ldr == null) {
            C7625ldr c7625ldr2 = new C7625ldr(i);
            f16608IL.put(Integer.valueOf(i), c7625ldr2);
            return c7625ldr2;
        }
        return c7625ldr;
    }

    /* renamed from: bg */
    public C7619bg m88370bg(int i, Context context) {
        C7619bg c7619bg = f16609bX.get(Integer.valueOf(i));
        if (c7619bg == null) {
            C7619bg c7619bg2 = new C7619bg(context, i);
            f16609bX.put(Integer.valueOf(i), c7619bg2);
            return c7619bg2;
        }
        return c7619bg;
    }
}
