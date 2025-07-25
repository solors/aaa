package com.fyber.inneractive.sdk.util;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.renderers.C15363d;
import com.fyber.inneractive.sdk.renderers.C15370k;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.fyber.inneractive.sdk.util.z */
/* loaded from: classes4.dex */
public final class C15483z {

    /* renamed from: a */
    public final CopyOnWriteArrayList f30631a = new CopyOnWriteArrayList();

    /* renamed from: b */
    public boolean f30632b;

    /* renamed from: c */
    public Context f30633c;

    /* renamed from: d */
    public C15479w f30634d;

    /* renamed from: a */
    public static void m76444a(C15483z c15483z, Context context, Intent intent) {
        boolean z;
        synchronized (c15483z) {
            try {
                z = ((KeyguardManager) context.getSystemService("keyguard")).isKeyguardLocked();
            } catch (Exception unused) {
                IAlog.m76529a("%sFailed to get lock screen status", IAlog.m76531a(c15483z));
                z = false;
            }
            if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                c15483z.f30632b = true;
            } else if (("android.intent.action.SCREEN_ON".equals(intent.getAction()) && !z) || "android.intent.action.USER_PRESENT".equals(intent.getAction())) {
                c15483z.f30632b = false;
            }
            IAlog.m76529a("%sNew screen state is locked: %s. number of listeners: %d", IAlog.m76531a(c15483z), Boolean.valueOf(c15483z.f30632b), Integer.valueOf(c15483z.f30631a.size()));
            Iterator it = c15483z.f30631a.iterator();
            while (it.hasNext()) {
                boolean z2 = c15483z.f30632b;
                C15370k c15370k = (C15370k) ((InterfaceC15482y) it.next());
                c15370k.getClass();
                IAlog.m76529a("%sgot onLockScreenStateChanged with: %s", IAlog.m76531a(c15370k), Boolean.valueOf(z2));
                if (z2) {
                    c15370k.m76647c(false);
                    C15363d c15363d = c15370k.f30383y;
                    if (c15363d != null && c15363d.f30361g) {
                        c15363d.f30361g = false;
                        AbstractC15465p.f30612b.removeCallbacks(c15363d.f30364j);
                    }
                } else {
                    c15370k.m76650K();
                    C15363d c15363d2 = c15370k.f30383y;
                    if (c15363d2 != null && !c15363d2.f30362h && !c15363d2.f30361g && c15363d2.f30360f != 0) {
                        c15363d2.f30360f = 0L;
                        c15363d2.f30361g = true;
                        c15363d2.m76655a();
                    }
                }
            }
        }
    }
}
