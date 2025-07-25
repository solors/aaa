package com.inmobi.media;

import android.util.Log;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.commons.core.configs.AdConfig;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p804nd.InterfaceC38501j;

/* renamed from: com.inmobi.media.L */
/* loaded from: classes6.dex */
public final class C18999L extends Lambda implements Functions {

    /* renamed from: a */
    public final /* synthetic */ C19026N f47420a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18999L(C19026N c19026n) {
        super(0);
        this.f47420a = c19026n;
    }

    @Override // kotlin.jvm.functions.Functions
    public final Object invoke() {
        C19026N c19026n = this.f47420a;
        c19026n.getClass();
        Intrinsics.checkNotNullParameter("AdQualityBeaconExecutor", "tag");
        Intrinsics.checkNotNullParameter("beacon handler execute", "message");
        Log.i("AdQualityBeaconExecutor", "beacon handler execute");
        c19026n.f47533b.set(true);
        ScheduledExecutorService scheduledExecutorService = C19052P.f47602a;
        InterfaceC38501j interfaceC38501j = AbstractC19541ya.f48937a;
        int m59595a = AbstractC19518x1.m59595a((AbstractC19518x1) ((C19090S) interfaceC38501j.getValue()));
        C19090S c19090s = (C19090S) interfaceC38501j.getValue();
        c19090s.getClass();
        Log.i("AdQualityDao", "peek");
        List<AdQualityResult> m59594a = AbstractC19518x1.m59594a(c19090s, null, null, null, null, null, Integer.valueOf(m59595a), 31);
        if (m59594a.isEmpty()) {
            m59594a = C37563v.m17166m();
        }
        for (AdQualityResult adQualityResult : m59594a) {
            if (adQualityResult != null) {
                AdConfig adConfig = c19026n.f47532a;
                C19452s5 c19452s5 = new C19452s5(adQualityResult, new C18969Ib(adConfig.getIncludeIdParams()), adConfig.getAdQuality());
                C19013M onBeaconHit = new C19013M(c19026n, adQualityResult);
                Intrinsics.checkNotNullParameter(onBeaconHit, "onBeaconHit");
                Intrinsics.checkNotNullParameter("JsonBeaconRequest", "tag");
                Intrinsics.checkNotNullParameter("hitBeacon", "message");
                Log.i("JsonBeaconRequest", "hitBeacon");
                c19452s5.mo59879f();
                C19275fa retryPolicy = new C19275fa(c19452s5.f48652z.getMaxRetries(), c19452s5.f48652z.getRetryInterval());
                Intrinsics.checkNotNullParameter(retryPolicy, "retryPolicy");
                c19452s5.f47289w = retryPolicy;
                c19452s5.m61109a(new C19438r5(onBeaconHit));
            }
        }
        c19026n.f47534c.set(true);
        return Unit.f99208a;
    }
}
