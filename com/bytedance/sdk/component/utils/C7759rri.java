package com.bytedance.sdk.component.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p233Kg.C7255ldr;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.sdk.component.utils.rri */
/* loaded from: classes3.dex */
public class C7759rri {

    /* renamed from: bg */
    private static final Object f16933bg = new Object();

    /* renamed from: IL */
    private static final Map<InterfaceC7762bg, Object> f16930IL = new ConcurrentHashMap();

    /* renamed from: bX */
    private static AtomicBoolean f16932bX = new AtomicBoolean(false);
    private static volatile int eqN = -1;

    /* renamed from: zx */
    private static volatile long f16935zx = 0;
    private static volatile int ldr = 60000;

    /* renamed from: iR */
    private static InterfaceC7765xxp f16934iR = null;

    /* renamed from: Kg */
    private static final AtomicBoolean f16931Kg = new AtomicBoolean(false);

    /* renamed from: com.bytedance.sdk.component.utils.rri$IL */
    /* loaded from: classes3.dex */
    private static class C7761IL extends BroadcastReceiver {
        private C7761IL() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z = false;
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (C7759rri.f16930IL != null && C7759rri.f16930IL.size() > 0) {
                z = true;
            }
            C7759rri.m87814IL(context, intent, z, booleanExtra);
        }
    }

    /* renamed from: com.bytedance.sdk.component.utils.rri$bg */
    /* loaded from: classes3.dex */
    public interface InterfaceC7762bg {
        /* renamed from: bg */
        void mo84888bg(Context context, Intent intent, boolean z, int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static void m87814IL(final Context context, final Intent intent, final boolean z, final boolean z2) {
        if (!z && z2) {
            eqN = 0;
        } else if (f16931Kg.compareAndSet(false, true)) {
            C7255ldr.m89462IL(new AbstractRunnableC7227Kg("getNetworkType") { // from class: com.bytedance.sdk.component.utils.rri.1
                @Override // java.lang.Runnable
                public void run() {
                    int m87816IL;
                    if (!z2) {
                        m87816IL = C7759rri.m87816IL(context);
                    } else {
                        m87816IL = 0;
                    }
                    int unused = C7759rri.eqN = m87816IL;
                    C7759rri.f16931Kg.set(false);
                    if (z) {
                        C7759rri.m87815IL(context, intent, C7759rri.eqN, z2);
                    }
                }
            });
        }
    }

    /* renamed from: bX */
    private static int m87812bX(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    return type != 1 ? 1 : 4;
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                    case 16:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                    case 17:
                        return 3;
                    case 13:
                    case 18:
                    case 19:
                        InterfaceC7765xxp interfaceC7765xxp = f16934iR;
                        return (interfaceC7765xxp == null || !interfaceC7765xxp.m87801bg(context, telephonyManager)) ? 5 : 6;
                    case 20:
                        return 6;
                    default:
                        String subtypeName = activeNetworkInfo.getSubtypeName();
                        return (TextUtils.isEmpty(subtypeName) || !(subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000"))) ? 1 : 3;
                }
            }
            return 0;
        } catch (Throwable unused) {
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static void m87815IL(Context context, Intent intent, int i, boolean z) {
        Map<InterfaceC7762bg, Object> map = f16930IL;
        if (map == null || map.size() <= 0) {
            return;
        }
        for (InterfaceC7762bg interfaceC7762bg : map.keySet()) {
            if (interfaceC7762bg != null) {
                interfaceC7762bg.mo84888bg(context, intent, !z, i);
            }
        }
    }

    /* renamed from: bg */
    public static int m87808bg(Context context, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f16935zx + j <= elapsedRealtime) {
            return m87816IL(context);
        }
        if (eqN == -1) {
            return m87816IL(context);
        }
        if (elapsedRealtime - f16935zx >= ldr) {
            m87814IL(context, (Intent) null, false, false);
        }
        return eqN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static int m87816IL(Context context) {
        eqN = m87812bX(context);
        f16935zx = SystemClock.elapsedRealtime();
        return eqN;
    }

    /* renamed from: bg */
    public static void m87804bg(InterfaceC7762bg interfaceC7762bg, Context context) {
        if (interfaceC7762bg == null) {
            return;
        }
        if (!f16932bX.get()) {
            try {
                context.registerReceiver(new C7761IL(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                f16932bX.set(true);
            } catch (Throwable unused) {
            }
        }
        f16930IL.put(interfaceC7762bg, f16933bg);
    }

    /* renamed from: bg */
    public static void m87805bg(InterfaceC7762bg interfaceC7762bg) {
        if (interfaceC7762bg == null) {
            return;
        }
        f16930IL.remove(interfaceC7762bg);
    }
}
