package com.bykv.p135vk.openvk.preload.geckox.p172d;

import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.p163b.RetryBranchInterceptor;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.b */
/* loaded from: classes3.dex */
public class FullPatchRetryInterceptor extends RetryBranchInterceptor<UpdatePackage, UpdatePackage> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.RetryBranchInterceptor
    /* renamed from: a */
    protected final /* synthetic */ String mo91315a(UpdatePackage updatePackage) {
        UpdatePackage updatePackage2 = updatePackage;
        UpdatePackage.Package patch = updatePackage2.getPatch();
        if (patch == null) {
            GeckoLogger.m91263d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        List<String> urlList = patch.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            GeckoLogger.m91263d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        GeckoLogger.m91263d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
        return "patch";
    }

    @Override // com.bykv.p135vk.openvk.preload.p163b.RetryBranchInterceptor
    /* renamed from: a */
    protected final /* synthetic */ String mo91314a(UpdatePackage updatePackage, Throwable th, String str) {
        UpdatePackage updatePackage2 = updatePackage;
        if ("patch".equals(str)) {
            GeckoLogger.m91263d("gecko-debug-tag", "start full update, channel:", updatePackage2.getChannel());
            return "full";
        }
        throw new RuntimeException("full update failed, caused by:" + th.getMessage(), th);
    }
}
