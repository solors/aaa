package com.mbridge.msdk.dycreator.p425g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.dycreator.g.h */
/* loaded from: classes6.dex */
public final class ReportSubject extends BaseAbstractSubject {
    /* renamed from: a */
    public final void m52929a(Object obj) {
        ReportObserver reportObserver;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f55966a;
        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
            for (Map.Entry<Integer, Object> entry : this.f55966a.entrySet()) {
                if (entry != null) {
                    try {
                        if (entry.getValue() != null && (reportObserver = (ReportObserver) entry.getValue()) != null) {
                            reportObserver.mo52930a(obj);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
