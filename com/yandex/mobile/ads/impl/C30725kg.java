package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.hu0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.kg */
/* loaded from: classes8.dex */
public final class C30725kg {
    @NotNull

    /* renamed from: a */
    private final List<C31034of<?>> f81414a;
    @Nullable

    /* renamed from: b */
    private v31 f81415b;

    /* JADX WARN: Multi-variable type inference failed */
    public C30725kg(@NotNull List<? extends C31034of<?>> assets) {
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f81414a = assets;
    }

    @NotNull
    /* renamed from: a */
    public final HashMap m32565a() {
        Map m17294d;
        Map m17295c;
        InterfaceC31123pf<?> m28543a;
        hu0.EnumC30501a m35798f;
        String m33466a;
        HashMap hashMap = new HashMap();
        Iterator<C31034of<?>> it = this.f81414a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C31034of<?> next = it.next();
            String m31043b = next.m31043b();
            v31 v31Var = this.f81415b;
            if (v31Var != null && (m28543a = v31Var.m28543a(next)) != null && m28543a.mo28954b()) {
                HashMap hashMap2 = new HashMap();
                rb2 mo28952c = m28543a.mo28952c();
                if (mo28952c != null) {
                    hashMap2.put("width", Integer.valueOf(mo28952c.m30085b()));
                    hashMap2.put("height", Integer.valueOf(mo28952c.m30086a()));
                }
                as0 as0Var = m28543a instanceof as0 ? (as0) m28543a : null;
                if (as0Var != null && (m35798f = as0Var.m35798f()) != null && (m33466a = m35798f.m33466a()) != null) {
                    hashMap2.put("value_type", m33466a);
                }
                hashMap.put(m31043b, hashMap2);
            }
        }
        v31 v31Var2 = this.f81415b;
        View m28539e = v31Var2 != null ? v31Var2.m28539e() : null;
        m17294d = MapsJVM.m17294d();
        if (m28539e != null) {
            m17294d.put("width", Integer.valueOf(m28539e.getWidth()));
            m17294d.put("height", Integer.valueOf(m28539e.getHeight()));
        }
        m17295c = MapsJVM.m17295c(m17294d);
        if (!m17295c.isEmpty()) {
            hashMap.put("superview", m17295c);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void m32564a(@Nullable v31 v31Var) {
        this.f81415b = v31Var;
    }
}
