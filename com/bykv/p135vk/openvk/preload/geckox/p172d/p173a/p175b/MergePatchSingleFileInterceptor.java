package com.bykv.p135vk.openvk.preload.geckox.p172d.p173a.p175b;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.GeckoConfig;
import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.buffer.p170a.BufferPolicy;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.p172d.p173a.p174a.DownloadFullSingleFileInterceptor;
import com.bykv.p135vk.openvk.preload.geckox.utils.BsPatch;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.a.b.d */
/* loaded from: classes3.dex */
public class MergePatchSingleFileInterceptor extends Interceptor<Pair<Buffer, UpdatePackage>, Pair<Buffer, UpdatePackage>> {

    /* renamed from: d */
    private GeckoConfig f14023d;

    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo91295a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        return m91316a(chain, pair);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        super.mo91298a(objArr);
        this.f14023d = (GeckoConfig) objArr[0];
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object m91316a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m91263d("gecko-debug-tag", "start merge patch single file, channel:", ((UpdatePackage) pair.second).getChannel());
        Buffer buffer = (Buffer) pair.first;
        File mo91342f = buffer.mo91342f();
        buffer.mo91354a();
        buffer.mo91343e();
        File parentFile = mo91342f.getParentFile().getParentFile();
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getLocalVersion());
        String str = File.separator;
        sb2.append(str);
        sb2.append("res");
        File file = new File(parentFile, sb2.toString());
        File[] listFiles = file.listFiles();
        if (listFiles != null && listFiles.length != 0) {
            File file2 = listFiles[0];
            File parentFile2 = mo91342f.getParentFile();
            File file3 = new File(parentFile2, "res" + str + DownloadFullSingleFileInterceptor.m91320a(updatePackage, updatePackage.getFullPackage().getUrlList().get(0)));
            C6661b.m91224a(file3);
            try {
                try {
                    BsPatch.m91238a(file2, mo91342f, file3.getParentFile(), file3.getName());
                    C6661b.m91224a(mo91342f);
                    Buffer m91356a = BufferPolicy.m91356a(file3, file3.length());
                    try {
                        return chain.mo91449a((Chain<Pair<Buffer, UpdatePackage>>) new Pair<>(m91356a, updatePackage));
                    } finally {
                        m91356a.mo91343e();
                    }
                } catch (Exception e) {
                    throw new RuntimeException("merge patch single file failed, channel：" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + e.getMessage(), e);
                }
            } catch (Throwable th) {
                C6661b.m91224a(mo91342f);
                throw th;
            }
        }
        throw new RuntimeException("can not found old full single file,:" + file.getAbsolutePath());
    }
}
