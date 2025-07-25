package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.openadsdk.utils.Uw */
/* loaded from: classes3.dex */
public class C9516Uw {

    /* renamed from: IL */
    private static String f21238IL = null;

    /* renamed from: bX */
    private static String f21239bX = null;

    /* renamed from: bg */
    private static String f21240bg = null;
    private static volatile boolean eqN = true;

    /* renamed from: com.bytedance.sdk.openadsdk.utils.Uw$bg */
    /* loaded from: classes3.dex */
    public static class C9517bg extends AbstractRunnableC7227Kg {

        /* renamed from: bg */
        public static AtomicBoolean f21242bg = new AtomicBoolean(false);

        /* renamed from: IL */
        private static final AtomicLong f21241IL = new AtomicLong(0);

        public C9517bg(String str, int i) {
            super(str, i);
        }

        /* renamed from: bg */
        public static void m82593bg() {
            if (!f21242bg.get()) {
                long currentTimeMillis = System.currentTimeMillis();
                AtomicLong atomicLong = f21241IL;
                if (currentTimeMillis - atomicLong.get() < 600000) {
                    return;
                }
                atomicLong.set(currentTimeMillis);
                C9519VJ.m82591IL((AbstractRunnableC7227Kg) new C9517bg("UpdateSimStatusTask", 5));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            f21242bg.set(true);
            C9516Uw.m82594zx();
            f21242bg.set(false);
        }
    }

    /* renamed from: IL */
    public static String m82597IL() {
        String str;
        String str2;
        try {
            C9517bg.m82593bg();
            if (!eqN) {
                StringBuilder sb2 = new StringBuilder("getMCC");
                if (eqN) {
                    str2 = "Have SIM card";
                } else {
                    str2 = "No SIM card, MCC returns null";
                }
                sb2.append(str2);
                C7741PX.m87873bg("MCC", sb2.toString());
                return null;
            }
            Configuration configuration = C8838VzQ.m84740bg().getResources().getConfiguration();
            int i = configuration.mcc;
            if (i != 0) {
                str = String.valueOf(i);
            } else {
                str = f21238IL;
            }
            C7741PX.m87873bg("MCC", "config=" + configuration.mcc + ",sMCC=" + f21238IL);
            return str;
        } catch (Throwable th) {
            C7741PX.m87873bg("SimUtils", th.getMessage());
            return null;
        }
    }

    /* renamed from: bX */
    public static String m82596bX() {
        C9517bg.m82593bg();
        return f21239bX;
    }

    /* renamed from: bg */
    public static String m82595bg() {
        C9517bg.m82593bg();
        return f21240bg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zx */
    public static void m82594zx() {
        String str;
        String str2;
        String str3;
        String str4;
        if (C8838VzQ.m84740bg() == null) {
            return;
        }
        eqN = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C8838VzQ.m84740bg().getSystemService("phone");
            int simState = telephonyManager.getSimState();
            if (simState != 0) {
                if (simState == 1) {
                    eqN = false;
                }
            } else {
                eqN = false;
            }
            if (eqN) {
                str = "Have SIM card";
            } else {
                str = "No SIM card";
            }
            C7741PX.m87873bg("MCC", str);
            String str5 = null;
            try {
                str2 = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                str2 = null;
            }
            try {
                str3 = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                str3 = null;
            }
            if (str3 == null || str3.length() < 5) {
                try {
                    str3 = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (!TextUtils.isEmpty(str3) && str3.length() > 4) {
                String substring = str3.substring(0, 3);
                str4 = str3.substring(3);
                str5 = substring;
            } else {
                str4 = null;
            }
            if (!TextUtils.isEmpty(str2)) {
                f21240bg = str2;
            }
            if (!TextUtils.isEmpty(str5)) {
                f21238IL = str5;
            }
            if (!TextUtils.isEmpty(str4)) {
                f21239bX = str4;
            }
        } catch (Throwable unused4) {
        }
    }
}
