package com.bykv.p135vk.openvk.preload.geckox.p172d.p176b.p178b;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.GeckoConfig;
import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.buffer.p170a.BufferPolicy;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.utils.BsPatch;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.b.b.d */
/* loaded from: classes3.dex */
public class MergePatchZipInterceptor extends Interceptor<Pair<Buffer, UpdatePackage>, Pair<Buffer, UpdatePackage>> {

    /* renamed from: d */
    private GeckoConfig f14028d;

    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo91295a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        return m91307a(chain, pair);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        super.mo91298a(objArr);
        this.f14028d = (GeckoConfig) objArr[0];
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object m91307a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m91263d("gecko-debug-tag", "start merge patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        Buffer buffer = (Buffer) pair.first;
        File mo91342f = buffer.mo91342f();
        buffer.mo91354a();
        buffer.mo91343e();
        File parentFile = mo91342f.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File file = new File(parentFile, updatePackage.getLocalVersion() + File.separator + "res.zip");
        File file2 = new File(mo91342f.getParentFile(), "res.zip");
        C6661b.m91224a(file2);
        try {
            try {
                BsPatch.m91238a(file, mo91342f, file2.getParentFile(), file2.getName());
                C6661b.m91224a(mo91342f);
                Buffer m91356a = BufferPolicy.m91356a(file2, file2.length());
                try {
                    return chain.mo91449a((Chain<Pair<Buffer, UpdatePackage>>) new Pair<>(m91356a, updatePackage));
                } finally {
                    m91356a.mo91343e();
                }
            } catch (Exception e) {
                throw new RuntimeException("merged patch zip file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
            }
        } catch (Throwable th) {
            C6661b.m91224a(mo91342f);
            throw th;
        }
    }
}
