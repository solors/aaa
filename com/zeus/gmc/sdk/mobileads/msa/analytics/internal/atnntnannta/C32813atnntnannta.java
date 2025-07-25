package com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnntnannta;

import android.content.Context;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.analytics.internal.atnntnannta.atnntnannta */
/* loaded from: classes8.dex */
public class C32813atnntnannta {
    private static final String atnntnannta = "pubsub_config";
    private static volatile C32813atnntnannta atntaanaa = null;
    private static final String atntntntanaan = "pubsub_interval";
    private C32814atntntntanaan atnaaata;

    private C32813atnntnannta(Context context) {
        this.atnaaata = new C32814atntntntanaan(atnntnannta, context);
    }

    public static C32813atnntnannta atnntnannta(Context context) {
        if (context == null) {
            return null;
        }
        if (atntaanaa == null) {
            synchronized (C32813atnntnannta.class) {
                if (atntaanaa == null) {
                    atntaanaa = new C32813atnntnannta(context.getApplicationContext());
                }
            }
        }
        return atntaanaa;
    }

    public int atnntnannta() {
        return this.atnaaata.atnntnannta(atntntntanaan, 30);
    }

    public void atnntnannta(int i) {
        this.atnaaata.atntntntanaan(atntntntanaan, i);
    }
}
