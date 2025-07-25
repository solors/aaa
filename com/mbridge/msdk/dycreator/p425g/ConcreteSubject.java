package com.mbridge.msdk.dycreator.p425g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.dycreator.g.d */
/* loaded from: classes6.dex */
public final class ConcreteSubject extends BaseAbstractSubject {
    /* renamed from: a */
    public final void m52933a(Object obj) {
        ViewObserver viewObserver;
        try {
            synchronized (this) {
                ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f55966a;
                if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                    for (Map.Entry<Integer, Object> entry : this.f55966a.entrySet()) {
                        if (entry != null && (entry.getValue() instanceof ViewObserver) && (viewObserver = (ViewObserver) entry.getValue()) != null) {
                            viewObserver.mo52928a(obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
