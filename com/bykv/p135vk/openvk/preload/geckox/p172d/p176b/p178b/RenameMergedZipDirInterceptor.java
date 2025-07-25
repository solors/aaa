package com.bykv.p135vk.openvk.preload.geckox.p172d.p176b.p178b;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.b.b.e */
/* loaded from: classes3.dex */
public class RenameMergedZipDirInterceptor extends Interceptor<Pair<File, UpdatePackage>, Pair<String, Long>> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* synthetic */ Object mo91295a(Chain<Pair<String, Long>> chain, Pair<File, UpdatePackage> pair) throws Throwable {
        Pair<File, UpdatePackage> pair2 = pair;
        GeckoLogger.m91263d("gecko-debug-tag", "start active merged zip file, channel:", ((UpdatePackage) pair2.second).getChannel());
        File parentFile = ((File) pair2.first).getParentFile();
        long version = ((UpdatePackage) pair2.second).getVersion();
        File file = new File(parentFile.getParentFile(), String.valueOf(version));
        C6661b.m91224a(file);
        if (parentFile.renameTo(file)) {
            return chain.mo91449a((Chain<Pair<String, Long>>) new Pair<>(((UpdatePackage) pair2.second).getChannel(), Long.valueOf(version)));
        }
        throw new RuntimeException("active merged zip file failed:" + parentFile.getAbsolutePath());
    }
}
