package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.base.model.MediationNetwork;
import com.yandex.mobile.ads.impl.as1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public class kv0 implements s50 {
    @NotNull

    /* renamed from: a */
    private final C30359g3 f81582a;
    @NotNull

    /* renamed from: b */
    private final vs1 f81583b;

    public /* synthetic */ kv0(C30359g3 c30359g3) {
        this(c30359g3, new vs1());
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    /* renamed from: a */
    public Map<String, Object> mo29851a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C30705k7 m33981a = this.f81582a.m33981a();
        if (m33981a != null) {
            Map<String, String> m32655h = m33981a.m32655h();
            if (m32655h != null) {
                linkedHashMap.putAll(m32655h);
            }
            String m32661b = m33981a.m32661b();
            if (m32661b != null) {
                linkedHashMap.put("age", m32661b);
            }
            List<String> m32659d = m33981a.m32659d();
            if (m32659d != null) {
                linkedHashMap.put("context_tags", m32659d);
            }
            String m32658e = m33981a.m32658e();
            if (m32658e != null) {
                linkedHashMap.put("gender", m32658e);
            }
            int i = as1.f76895l;
            Boolean m35783f = as1.C29962a.m35776a().m35783f();
            if (m35783f != null) {
                linkedHashMap.put("age_restricted_user", m35783f);
            }
            yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
            Boolean m26753i0 = m35796a != null ? m35796a.m26753i0() : null;
            if (m26753i0 != null) {
                linkedHashMap.put("user_consent", m26753i0);
            }
        }
        C31967zb m27592a = this.f81582a.m33962e().m27592a();
        this.f81583b.getClass();
        boolean m28230b = vs1.m28230b(context);
        if (m27592a != null) {
            boolean m26289b = m27592a.m26289b();
            String m26290a = m27592a.m26290a();
            if (!m28230b && !m26289b && m26290a != null) {
                linkedHashMap.put("google_aid", m26290a);
            }
        }
        linkedHashMap.put("gms_available", Boolean.valueOf(this.f81582a.m33955k().m34375c()));
        return linkedHashMap;
    }

    public kv0(@NotNull C30359g3 adConfiguration, @NotNull vs1 sensitiveModeChecker) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        this.f81582a = adConfiguration;
        this.f81583b = sensitiveModeChecker;
    }

    @Override // com.yandex.mobile.ads.impl.s50
    @NotNull
    /* renamed from: a */
    public final Map<String, String> mo29850a(@NotNull MediationNetwork mediationNetwork) {
        Intrinsics.checkNotNullParameter(mediationNetwork, "mediationNetwork");
        return mediationNetwork.m44552i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a */
    public final C30359g3 m32420a() {
        return this.f81582a;
    }
}
