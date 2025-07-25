package com.mbridge.msdk.dycreator.p425g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.dycreator.g.c */
/* loaded from: classes6.dex */
public final class ClickSubject extends BaseAbstractSubject {
    /* renamed from: a */
    public final void m52934a(Object obj) {
        ClickObserver clickObserver;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f55966a;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<Integer, Object> entry : this.f55966a.entrySet()) {
                if (entry != null) {
                    try {
                        if (entry.getValue() != null && (clickObserver = (ClickObserver) entry.getValue()) != null) {
                            clickObserver.mo52935a(obj);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
