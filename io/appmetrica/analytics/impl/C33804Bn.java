package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.toggle.SimpleThreadSafeToggle;
import java.util.WeakHashMap;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Bn */
/* loaded from: classes9.dex */
public final class C33804Bn extends SimpleThreadSafeToggle {

    /* renamed from: a */
    public final WeakHashMap f92660a;

    public C33804Bn() {
        super(false, "[WakelocksToggle]");
        this.f92660a = new WeakHashMap();
    }

    /* renamed from: a */
    public final synchronized void m22747a(@NotNull Object obj) {
        this.f92660a.put(obj, null);
        if (this.f92660a.size() == 1) {
            updateState(true);
        }
    }

    /* renamed from: b */
    public final synchronized void m22746b(@NotNull Object obj) {
        this.f92660a.remove(obj);
        if (this.f92660a.isEmpty()) {
            updateState(false);
        }
    }
}
