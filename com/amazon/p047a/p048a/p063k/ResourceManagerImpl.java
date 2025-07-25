package com.amazon.p047a.p048a.p063k;

import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p072a.Assert;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.amazon.a.a.k.c */
/* loaded from: classes2.dex */
public class ResourceManagerImpl implements ResourceManager {

    /* renamed from: a */
    public static final KiwiLogger f2495a = new KiwiLogger("ResourceManagerImpl");

    /* renamed from: b */
    private List<Object> f2496b = new ArrayList();

    /* renamed from: c */
    private boolean f2497c = false;

    public ResourceManagerImpl() {
        mo103035a(this);
    }

    /* renamed from: c */
    private boolean m103031c(Object obj) {
        Assert.m102872a(obj, "resource");
        if (m103036a(obj.getClass()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m103030d(Object obj) {
        return obj.getClass().getName().startsWith("com.amazon.");
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourceManager
    /* renamed from: a */
    public void mo103035a(Object obj) {
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2495a;
            kiwiLogger.m102829a("Registering resource: " + obj);
        }
        Assert.m102876a();
        if (!this.f2497c) {
            boolean m103031c = m103031c(obj);
            Assert.m102867b(m103031c, "Resource already registered: " + obj);
            this.f2496b.add(obj);
            return;
        }
        throw new IllegalStateException("Attempt made to register resource after population has begun!");
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourceManager
    /* renamed from: b */
    public void mo103032b(Object obj) {
        Field[] declaredFields;
        Assert.m102872a(obj, "target");
        if (KiwiLogger.f2770a) {
            f2495a.m102829a("Populating: " + obj);
        }
        if (!m103030d(obj)) {
            f2495a.m102829a("Ignoring: " + obj + ", not a kiwi class");
            return;
        }
        for (Class<?> cls = obj.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
            for (Field field : cls.getDeclaredFields()) {
                if (m103033a(field)) {
                    m103034a(obj, field);
                }
            }
        }
        if (obj instanceof ResourcePopulationAware) {
            ((ResourcePopulationAware) obj).mo102735e();
        }
    }

    /* renamed from: a */
    private Object m103036a(Class<?> cls) {
        for (Object obj : this.f2496b) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m103033a(Field field) {
        return field.getAnnotation(Resource.class) != null;
    }

    /* renamed from: a */
    private void m103034a(Object obj, Field field) {
        Class<?> type = field.getType();
        Object m103036a = m103036a(type);
        Assert.m102868b(m103036a, "no resource found for type: " + type);
        field.setAccessible(true);
        try {
            field.set(obj, m103036a);
        } catch (Exception e) {
            Assert.m102870a("Failed to populate field: " + field, (Throwable) e);
        }
    }

    @Override // com.amazon.p047a.p048a.p063k.ResourceManager
    /* renamed from: a */
    public void mo103037a() {
        for (Object obj : this.f2496b) {
            mo103032b(obj);
        }
    }
}
