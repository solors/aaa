package com.zeus.gmc.sdk.mobileads.columbus.internal.c2oicci2;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.work.PeriodicWorkRequest;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c22o22co22i.AbstractC32441coiio2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32584coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32727coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oicci2.coo2iico */
/* loaded from: classes8.dex */
public class C32501coo2iico {
    static final int c2oc2i = 900000;
    static final int coi222o222 = 50;
    private static final String coo2iico = "WebViewCacheService";
    private static final Map<Long, C32503coi222o222> cioccoiococ = Collections.synchronizedMap(new HashMap());
    @NonNull
    static final RunnableC32502c2oc2i c2oc2o = new RunnableC32502c2oc2i();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oicci2.coo2iico$c2oc2i */
    /* loaded from: classes8.dex */
    public static class RunnableC32502c2oc2i implements Runnable {
        private RunnableC32502c2oc2i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C32501coo2iico.coo2iico();
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.c2oicci2.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    public static class C32503coi222o222 {
        @NonNull
        private final WeakReference<AbstractC32441coiio2> coi222o222;
        @NonNull
        private final C32727coo2iico coo2iico;

        C32503coi222o222(@NonNull C32727coo2iico c32727coo2iico, @NonNull AbstractC32441coiio2 abstractC32441coiio2) {
            this.coo2iico = c32727coo2iico;
            this.coi222o222 = new WeakReference<>(abstractC32441coiio2);
        }

        @NonNull
        public C32727coo2iico coi222o222() {
            return this.coo2iico;
        }

        @NonNull
        public WeakReference<AbstractC32441coiio2> coo2iico() {
            return this.coi222o222;
        }
    }

    private C32501coo2iico() {
    }

    public static void coo2iico(@NonNull Long l, @NonNull AbstractC32441coiio2 abstractC32441coiio2, @NonNull C32727coo2iico c32727coo2iico) {
        C32584coiic.coo2iico(l);
        C32584coiic.coo2iico(abstractC32441coiio2);
        C32584coiic.coo2iico(c32727coo2iico);
        coo2iico();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Current web view cache size: ");
        Map<Long, C32503coi222o222> map = cioccoiococ;
        sb2.append(map.size());
        MLog.m25892d(coo2iico, sb2.toString());
        if (map.size() >= 50) {
            MLog.m25883w(coo2iico, "Please destroy some via InterstitialAd#destroy() and try again.");
        } else {
            map.put(l, new C32503coi222o222(c32727coo2iico, abstractC32441coiio2));
        }
    }

    public static C32503coi222o222 coo2iico(@NonNull Long l) {
        C32584coiic.coo2iico(l);
        return cioccoiococ.remove(l);
    }

    static synchronized void coo2iico() {
        Handler uIHandler;
        synchronized (C32501coo2iico.class) {
            Iterator<Map.Entry<Long, C32503coi222o222>> it = cioccoiococ.entrySet().iterator();
            while (it.hasNext()) {
                if (it.next().getValue().coo2iico().get() == null) {
                    it.remove();
                }
            }
            if (!cioccoiococ.isEmpty() && (uIHandler = GlobalHolder.getUIHandler()) != null) {
                RunnableC32502c2oc2i runnableC32502c2oc2i = c2oc2o;
                uIHandler.removeCallbacks(runnableC32502c2oc2i);
                uIHandler.postDelayed(runnableC32502c2oc2i, PeriodicWorkRequest.MIN_PERIODIC_INTERVAL_MILLIS);
            }
        }
    }
}
