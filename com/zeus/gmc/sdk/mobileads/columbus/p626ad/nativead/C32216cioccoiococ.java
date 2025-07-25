package com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.NativeAdInfo;
import com.zeus.gmc.sdk.mobileads.columbus.remote.ConfigCache;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.nativead.cioccoiococ */
/* loaded from: classes8.dex */
class C32216cioccoiococ {
    private static final int cco22 = 30720;
    private static final String coo2iico = "SkuIdPool";
    private static final Queue<C32217coo2iico> coi222o222 = new ConcurrentLinkedQueue();
    private static final List<String> c2oc2i = Collections.synchronizedList(new ArrayList());
    private static final AtomicInteger cioccoiococ = new AtomicInteger(0);
    private static int c2oc2o = 100;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.nativead.cioccoiococ$coo2iico */
    /* loaded from: classes8.dex */
    static class C32217coo2iico {
        private final String coi222o222;
        private final String coo2iico;

        public C32217coo2iico(String str, String str2) {
            this.coo2iico = str;
            this.coi222o222 = str2;
        }

        public String coi222o222() {
            return this.coo2iico;
        }

        public String coo2iico() {
            return this.coi222o222;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32217coo2iico)) {
                return false;
            }
            C32217coo2iico c32217coo2iico = (C32217coo2iico) obj;
            if (Objects.equals(this.coo2iico, c32217coo2iico.coo2iico) && Objects.equals(this.coi222o222, c32217coo2iico.coi222o222)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.coo2iico, this.coi222o222);
        }
    }

    C32216cioccoiococ() {
    }

    public static void coi222o222() {
        boolean z;
        int size;
        C32217coo2iico poll;
        try {
            Queue<C32217coo2iico> queue = coi222o222;
            synchronized (queue) {
                c2oc2o = ConfigCache.getInstance().getSkuMaxNum();
                boolean z2 = false;
                int i = 0;
                for (C32217coo2iico c32217coo2iico : queue) {
                    i += c32217coo2iico.coi222o222().length();
                }
                AtomicInteger atomicInteger = cioccoiococ;
                if (atomicInteger.get() > c2oc2o) {
                    z = true;
                } else {
                    z = false;
                }
                if (i > cco22) {
                    z2 = true;
                }
                if (z || z2) {
                    if (z) {
                        int i2 = atomicInteger.get();
                        int i3 = c2oc2o;
                        size = (i2 - i3) + (i3 / 3);
                    } else {
                        size = coi222o222.size() / 2;
                    }
                    MLog.m25892d(coo2iico, "remove excess skuIds, excessCount: " + size);
                    while (size > 0) {
                        Queue<C32217coo2iico> queue2 = coi222o222;
                        if (queue2.isEmpty()) {
                            break;
                        }
                        if (queue2.poll() != null) {
                            size--;
                            cioccoiococ.decrementAndGet();
                            MLog.m25892d(coo2iico, "remove excess skuId: " + poll.coi222o222());
                        }
                    }
                }
            }
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "removeExcessSkuIds error", e);
        }
    }

    public static boolean coo2iico(String str) {
        return !TextUtils.isEmpty(str) && c2oc2i.contains(str);
    }

    public static void coo2iico(NativeAdInfo nativeAdInfo) {
        if (nativeAdInfo != null) {
            try {
                if (nativeAdInfo.co2c2o2() != null && !TextUtils.isEmpty(nativeAdInfo.co2c2o2().coiio2()) && !TextUtils.isEmpty(nativeAdInfo.c2cic2()) && !TextUtils.isEmpty(nativeAdInfo.coo2iico()) && ConfigCache.getInstance().getSkuMaxNum() > 0) {
                    String coiio2 = nativeAdInfo.co2c2o2().coiio2();
                    C32217coo2iico c32217coo2iico = new C32217coo2iico(coiio2, nativeAdInfo.c2cic2());
                    Queue<C32217coo2iico> queue = coi222o222;
                    synchronized (queue) {
                        if (!queue.contains(c32217coo2iico)) {
                            queue.add(c32217coo2iico);
                            MLog.m25883w(coo2iico, "add skuId: " + coiio2);
                            cioccoiococ.incrementAndGet();
                        }
                    }
                    List<String> list = c2oc2i;
                    synchronized (list) {
                        if (!list.contains(nativeAdInfo.coo2iico())) {
                            list.add(nativeAdInfo.coo2iico());
                        }
                    }
                }
            } catch (Exception e) {
                MLog.m25888e(coo2iico, "addSkuId error", e);
            }
        }
    }

    public static JSONObject coo2iico() {
        try {
            JSONObject jSONObject = new JSONObject();
            HashMap hashMap = new HashMap();
            Queue<C32217coo2iico> queue = coi222o222;
            synchronized (queue) {
                for (C32217coo2iico c32217coo2iico : queue) {
                    String coo2iico2 = c32217coo2iico.coo2iico();
                    StringBuilder sb2 = (StringBuilder) hashMap.get(coo2iico2);
                    if (sb2 == null) {
                        sb2 = new StringBuilder();
                        hashMap.put(coo2iico2, sb2);
                    }
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(c32217coo2iico.coi222o222());
                }
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                jSONObject.put((String) entry.getKey(), ((StringBuilder) entry.getValue()).toString());
            }
            return jSONObject;
        } catch (Exception e) {
            MLog.m25888e(coo2iico, "groupSkuIdByDspName error", e);
            return null;
        }
    }
}
