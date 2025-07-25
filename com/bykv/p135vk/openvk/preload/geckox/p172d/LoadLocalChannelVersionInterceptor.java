package com.bykv.p135vk.openvk.preload.geckox.p172d;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.utils.ResVersionUtils;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.d */
/* loaded from: classes3.dex */
public class LoadLocalChannelVersionInterceptor extends Interceptor<List<String>, List<Pair<String, Long>>> {

    /* renamed from: d */
    private File f14039d;

    /* renamed from: e */
    private String f14040e;

    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* synthetic */ Object mo91295a(Chain<List<Pair<String, Long>>> chain, List<String> list) throws Throwable {
        List<String> list2 = list;
        GeckoLogger.m91263d("gecko-debug-tag", "get local channel version:", list2);
        File file = new File(this.f14039d, this.f14040e);
        ArrayList arrayList = new ArrayList();
        for (String str : list2) {
            Long m91213a = ResVersionUtils.m91213a(new File(file, str));
            arrayList.add(new Pair<>(str, Long.valueOf(m91213a == null ? 0L : m91213a.longValue())));
        }
        return chain.mo91449a((Chain<List<Pair<String, Long>>>) arrayList);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        super.mo91298a(objArr);
        this.f14039d = (File) objArr[0];
        this.f14040e = (String) objArr[1];
    }
}
