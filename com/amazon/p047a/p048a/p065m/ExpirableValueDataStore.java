package com.amazon.p047a.p048a.p065m;

import com.amazon.p047a.p048a.p056e.ExpirationObserver;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p063k.ResourceManager;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.amazon.a.a.m.b */
/* loaded from: classes2.dex */
public class ExpirableValueDataStore implements ExpirationObserver<ExpirableValue> {

    /* renamed from: a */
    private static final KiwiLogger f2518a = new KiwiLogger("ExpirableValueDataStore");
    @Resource

    /* renamed from: b */
    private ResourceManager f2519b;

    /* renamed from: c */
    private final Map<String, ExpirableValue> f2520c = new HashMap();

    /* renamed from: b */
    public synchronized <T> T m103007b(String str) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2518a;
            kiwiLogger.m102829a("Fetching value: " + str);
        }
        ExpirableValue expirableValue = this.f2520c.get(str);
        if (expirableValue == null) {
            if (KiwiLogger.f2770a) {
                f2518a.m102829a("Value not present in store, returning null");
            }
            return null;
        }
        return (T) expirableValue.m103014h();
    }

    /* renamed from: c */
    public synchronized void m103006c(String str) {
        ExpirableValue expirableValue = this.f2520c.get(str);
        if (expirableValue == null) {
            return;
        }
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2518a;
            kiwiLogger.m102829a("Removing value associated with key: " + str + ", value: " + expirableValue);
        }
        this.f2520c.remove(str);
        expirableValue.m103133f();
    }

    public String toString() {
        return this.f2520c.toString();
    }

    /* renamed from: a */
    public synchronized boolean m103010a(String str) {
        return m103007b(str) != null;
    }

    /* renamed from: a */
    public synchronized void m103009a(String str, ExpirableValue expirableValue) {
        Assert.m102872a((Object) str, "key");
        Assert.m102872a((Object) expirableValue, "value");
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2518a;
            kiwiLogger.m102829a("Placing value into store with key: " + str + ", expiration: " + expirableValue.mo103015a());
        }
        this.f2519b.mo103032b(expirableValue);
        expirableValue.m103135a(this);
        this.f2520c.put(str, expirableValue);
    }

    /* renamed from: a */
    public synchronized <T> void m103008a(String str, T t) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2518a;
            kiwiLogger.m102829a("Placing non-expiring value into store with key: " + str);
        }
        this.f2520c.put(str, new ExpirableValue(t, new Date()) { // from class: com.amazon.a.a.m.b.1
            @Override // com.amazon.p047a.p048a.p056e.Expirable
            /* renamed from: d */
            protected void mo102795d() {
                if (KiwiLogger.f2771b) {
                    ExpirableValueDataStore.f2518a.m102826b("Woah, non-expirable value was expired!!!!");
                }
            }
        });
    }

    @Override // com.amazon.p047a.p048a.p056e.ExpirationObserver
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public synchronized void mo103012a(ExpirableValue expirableValue) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2518a;
            kiwiLogger.m102829a("Observed expiration: " + expirableValue + " removing from store!");
        }
        Iterator<Map.Entry<String, ExpirableValue>> it = this.f2520c.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue() == expirableValue) {
                if (KiwiLogger.f2770a) {
                    KiwiLogger kiwiLogger2 = f2518a;
                    kiwiLogger2.m102829a("Removing entry from store: " + expirableValue);
                }
                it.remove();
            }
        }
    }
}
