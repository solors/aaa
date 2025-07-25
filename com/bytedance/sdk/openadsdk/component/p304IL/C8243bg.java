package com.bytedance.sdk.openadsdk.component.p304IL;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.InterfaceC8221ldr;
import com.bytedance.sdk.openadsdk.core.C8532Kg;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.InterfaceC8512Fy;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8943IL;
import com.bytedance.sdk.openadsdk.core.model.C8947LZ;
import com.bytedance.sdk.openadsdk.core.model.C8957bg;
import com.bytedance.sdk.openadsdk.core.p321Ta.p324bg.C8726IL;
import com.bytedance.sdk.openadsdk.core.p321Ta.p325zx.C8752bg;
import com.bytedance.sdk.openadsdk.oem.IPMiBroadcastReceiver;
import com.bytedance.sdk.openadsdk.p298bg.p299IL.C8141IL;
import com.bytedance.sdk.openadsdk.p298bg.p299IL.p300bg.C8154IL;
import com.bytedance.sdk.openadsdk.p298bg.p299IL.p300bg.C8155bX;
import com.bytedance.sdk.openadsdk.utils.daV;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.IL.bg */
/* loaded from: classes3.dex */
public class C8243bg {

    /* renamed from: bg */
    private static volatile C8243bg f18035bg;

    /* renamed from: IL */
    private final InterfaceC8512Fy f18036IL = C8838VzQ.m84741bX();

    private C8243bg() {
    }

    /* renamed from: bg */
    public static C8243bg m86722bg() {
        if (f18035bg == null) {
            synchronized (C8243bg.class) {
                if (f18035bg == null) {
                    f18035bg = new C8243bg();
                }
            }
        }
        return f18035bg;
    }

    /* renamed from: bg */
    public void m86721bg(final Context context, final AdSlot adSlot, final InterfaceC8221ldr interfaceC8221ldr) {
        final daV m82418bg = daV.m82418bg();
        this.f18036IL.mo85573bg(adSlot, new C8947LZ(), 5, new InterfaceC8512Fy.InterfaceC8514bg() { // from class: com.bytedance.sdk.openadsdk.component.IL.bg.1
            @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8512Fy.InterfaceC8514bg
            /* renamed from: bg */
            public void mo84425bg(int i, String str) {
                interfaceC8221ldr.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.InterfaceC8512Fy.InterfaceC8514bg
            /* renamed from: bg */
            public void mo84423bg(C8957bg c8957bg, C8943IL c8943il) {
                boolean z;
                if (c8957bg.m84248bX() != null && !c8957bg.m84248bX().isEmpty()) {
                    List<AbstractC8967tuV> m84248bX = c8957bg.m84248bX();
                    ArrayList arrayList = new ArrayList(m84248bX.size());
                    Iterator<AbstractC8967tuV> it = m84248bX.iterator();
                    while (true) {
                        z = true;
                        if (!it.hasNext()) {
                            break;
                        }
                        AbstractC8967tuV next = it.next();
                        if (AbstractC8967tuV.m83978zx(next) || (next != null && next.huT())) {
                            PAGNativeAd m86720bg = m86720bg(context, next, adSlot);
                            if (interfaceC8221ldr instanceof PAGNativeAdLoadListener) {
                                arrayList.add(m86720bg);
                            }
                        }
                        if (AbstractC8967tuV.m83978zx(next) && next.Dxa() != null && next.Dxa().m91743VB() != null) {
                            if (C8838VzQ.eqN().mo83744zx(String.valueOf(next.IGR())) && C8838VzQ.eqN().GvG()) {
                                if (next.Dxa() != null) {
                                    next.Dxa().ldr(1);
                                }
                                if (next.mo84131GR() != null) {
                                    next.mo84131GR().ldr(1);
                                }
                                C8726IL m84029bg = AbstractC8967tuV.m84029bg(CacheDirFactory.getICacheDir(next.mo83992uV()).mo91690bX(), next);
                                m84029bg.m91705bg("material_meta", next);
                                m84029bg.m91705bg("ad_slot", adSlot);
                                C8752bg.m84969bg(m84029bg, null);
                            }
                            IPMiBroadcastReceiver.m82960bg(context, next);
                        }
                    }
                    if (!(interfaceC8221ldr instanceof PAGNativeAdLoadListener) || arrayList.isEmpty()) {
                        z = false;
                    }
                    if (z) {
                        AdSlot adSlot2 = adSlot;
                        if (adSlot2 != null && !TextUtils.isEmpty(adSlot2.getBidAdm())) {
                            C9601bX.m82287bg(m84248bX.get(0), m82418bg.m82419bX());
                        }
                        InterfaceC8221ldr interfaceC8221ldr2 = interfaceC8221ldr;
                        if (interfaceC8221ldr2 instanceof PAGNativeAdLoadListener) {
                            ((PAGNativeAdLoadListener) interfaceC8221ldr2).onAdLoaded(arrayList.get(0));
                        }
                        if (c8943il.m84331zx() == null || c8943il.m84331zx().isEmpty()) {
                            return;
                        }
                        C8943IL.m84334bg(c8943il);
                        return;
                    }
                    interfaceC8221ldr.onError(-4, C8532Kg.m85838bg(-4));
                    c8943il.m84336bg(-4);
                    C8943IL.m84334bg(c8943il);
                    return;
                }
                interfaceC8221ldr.onError(-3, C8532Kg.m85838bg(-3));
                c8943il.m84336bg(-3);
                C8943IL.m84334bg(c8943il);
            }

            /* renamed from: bg */
            private PAGNativeAd m86720bg(Context context2, AbstractC8967tuV abstractC8967tuV, AdSlot adSlot2) {
                if (abstractC8967tuV.mo83995tC() != 2) {
                    return new C8141IL(context2, abstractC8967tuV, 5, adSlot2);
                }
                if (abstractC8967tuV.Dxa() != null) {
                    return new C8154IL(context2, abstractC8967tuV, adSlot2);
                }
                return new C8155bX(context2, abstractC8967tuV, adSlot2);
            }
        });
    }
}
