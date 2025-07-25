package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;

/* renamed from: io.appmetrica.analytics.impl.ca */
/* loaded from: classes9.dex */
public final class C34450ca {

    /* renamed from: d */
    public static final C34450ca f94086d = new C34450ca();

    /* renamed from: a */
    public final C34326Xc f94087a = new C34326Xc();

    /* renamed from: b */
    public final ServiceComponentsInitializer f94088b = AbstractC34810pj.m21141a();

    /* renamed from: c */
    public boolean f94089c = false;

    /* renamed from: a */
    public final void m21886a(Context context) {
        C34693la.m21451a(context);
        this.f94088b.onCreate(context);
        this.f94087a.getClass();
        for (String str : C34693la.f94825C.f94846s.m22718a()) {
            Object loadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (loadAndInstantiateClassWithDefaultConstructor != null) {
                C34693la.f94825C.m21439m().m22701a((ModuleServiceEntryPoint) loadAndInstantiateClassWithDefaultConstructor);
            }
        }
        new C35071zj(C34693la.m21444h().m21454A().m20702b()).m20870a(context);
        C34693la.f94825C.m21438n().m22041a();
    }

    /* renamed from: b */
    public final void m21885b(Context context) {
        if (!this.f94089c) {
            synchronized (this) {
                if (!this.f94089c) {
                    m21886a(context);
                    this.f94089c = true;
                }
            }
        }
    }
}
