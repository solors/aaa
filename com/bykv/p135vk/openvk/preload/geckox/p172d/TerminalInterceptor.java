package com.bykv.p135vk.openvk.preload.geckox.p172d;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.i */
/* loaded from: classes3.dex */
public class TerminalInterceptor extends Interceptor<Pair<String, Long>, Pair<String, Long>> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* synthetic */ Object mo91295a(Chain<Pair<String, Long>> chain, Pair<String, Long> pair) throws Throwable {
        Pair<String, Long> pair2 = pair;
        GeckoLogger.m91263d("gecko-debug-tag", "update success:", pair2);
        return chain.mo91449a((Chain<Pair<String, Long>>) pair2);
    }
}
