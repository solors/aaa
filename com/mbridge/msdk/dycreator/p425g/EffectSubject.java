package com.mbridge.msdk.dycreator.p425g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.dycreator.g.f */
/* loaded from: classes6.dex */
public final class EffectSubject extends BaseAbstractSubject {
    /* renamed from: a */
    public final void m52931a(Object obj) {
        EffectObserver effectObserver;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f55966a;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<Integer, Object> entry : this.f55966a.entrySet()) {
                if (entry != null) {
                    try {
                        if (entry.getValue() != null && (effectObserver = (EffectObserver) entry.getValue()) != null) {
                            effectObserver.mo52932a(obj);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
