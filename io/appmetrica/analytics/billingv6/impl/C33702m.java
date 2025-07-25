package io.appmetrica.analytics.billingv6.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* renamed from: io.appmetrica.analytics.billingv6.impl.m */
/* loaded from: classes9.dex */
public final class C33702m extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ Map f92307a;

    /* renamed from: b */
    public final /* synthetic */ Map f92308b;

    /* renamed from: c */
    public final /* synthetic */ C33705p f92309c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33702m(LinkedHashMap linkedHashMap, Map map, C33705p c33705p) {
        super(0);
        this.f92307a = linkedHashMap;
        this.f92308b = map;
        this.f92309c = c33705p;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        Map map = this.f92307a;
        Map map2 = this.f92308b;
        C33705p c33705p = this.f92309c;
        C33709t.m22814a(map, map2, c33705p.f92318d, c33705p.f92317c.getBillingInfoManager());
        return Unit.f99208a;
    }
}
