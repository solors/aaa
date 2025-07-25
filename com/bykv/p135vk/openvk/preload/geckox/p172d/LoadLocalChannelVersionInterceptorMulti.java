package com.bykv.p135vk.openvk.preload.geckox.p172d;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.utils.ResVersionUtils;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.e */
/* loaded from: classes3.dex */
public class LoadLocalChannelVersionInterceptorMulti extends Interceptor<String, Map<String, List<Pair<String, Long>>>> {

    /* renamed from: d */
    private File f14041d;

    /* renamed from: e */
    private List<String> f14042e;

    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* synthetic */ Object mo91295a(Chain<Map<String, List<Pair<String, Long>>>> chain, String str) throws Throwable {
        Long m91213a;
        GeckoLogger.m91263d("gecko-debug-tag", "get local channel version:", str);
        HashMap hashMap = new HashMap();
        for (String str2 : this.f14042e) {
            File file = new File(this.f14041d, str2);
            String[] list = file.list();
            ArrayList arrayList = new ArrayList();
            if (list != null && list.length > 0) {
                for (String str3 : list) {
                    File file2 = new File(file, str3);
                    if (file2.isDirectory() && (m91213a = ResVersionUtils.m91213a(file2)) != null) {
                        arrayList.add(new Pair<>(str3, m91213a));
                    }
                }
            }
            hashMap.put(str2, arrayList);
        }
        return chain.mo91449a((Chain<Map<String, List<Pair<String, Long>>>>) hashMap);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        super.mo91298a(objArr);
        this.f14041d = (File) objArr[0];
        this.f14042e = (List) objArr[1];
    }
}
