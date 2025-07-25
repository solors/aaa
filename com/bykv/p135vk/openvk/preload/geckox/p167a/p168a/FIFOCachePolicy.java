package com.bykv.p135vk.openvk.preload.geckox.p167a.p168a;

import com.bykv.p135vk.openvk.preload.geckox.p167a.ChannelCleanHelper;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import java.io.File;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.e */
/* loaded from: classes3.dex */
final class FIFOCachePolicy extends CachePolicy {
    @Override // com.bykv.p135vk.openvk.preload.geckox.p167a.p168a.CachePolicy
    /* renamed from: a */
    public final void mo91407a(CacheConfig cacheConfig, File file, List<String> list) {
        super.mo91407a(cacheConfig, file, list);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.p167a.p168a.CachePolicy
    /* renamed from: a */
    public final void mo91406a() {
        for (String str : this.f13961e) {
            List<File> m91221b = C6661b.m91221b(new File(this.f13960d, str));
            if (m91221b != null && m91221b.size() > this.f13959c.f13952a) {
                for (File file : m91221b.subList(0, m91221b.size() - this.f13959c.f13952a)) {
                    ChannelCleanHelper.m91399b(file.getAbsolutePath());
                }
            }
        }
    }
}
