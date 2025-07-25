package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C14479F;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class InneractiveAdSpotManager {

    /* renamed from: a */
    public final ConcurrentHashMap f27351a = new ConcurrentHashMap();

    public static void destroy() {
        ConcurrentHashMap concurrentHashMap = get().f27351a;
        for (String str : concurrentHashMap.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) concurrentHashMap.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        concurrentHashMap.clear();
    }

    public static InneractiveAdSpotManager get() {
        return AbstractC14462e.f27375a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f27351a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        C14479F c14479f = new C14479F();
        this.f27351a.put(c14479f.f27400a, c14479f);
        return c14479f;
    }

    public InneractiveAdSpot getSpot(String str) {
        return (InneractiveAdSpot) this.f27351a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        ConcurrentHashMap concurrentHashMap = this.f27351a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
