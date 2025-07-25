package com.mbridge.msdk.dycreator.p425g;

import com.mbridge.msdk.dycreator.p420c.BaseObservable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.dycreator.g.a */
/* loaded from: classes6.dex */
public abstract class BaseAbstractSubject extends BaseObservable {

    /* renamed from: b */
    private List<Object> f55967b = new ArrayList();

    /* renamed from: a */
    protected ConcurrentHashMap<Integer, Object> f55966a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public final synchronized void m52936a(Object obj, int i) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f55966a;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f55966a.put(Integer.valueOf(i), obj);
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m52937a() {
        this.f55966a.clear();
    }
}
