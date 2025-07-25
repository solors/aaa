package com.bykv.p135vk.openvk.preload.geckox.p172d.p176b.p178b;

import android.net.Uri;
import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.GeckoConfig;
import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.buffer.p170a.BufferPolicy;
import com.bykv.p135vk.openvk.preload.geckox.buffer.stream.BufferOutputStream;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.p169b.DownloadException;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.b.b.c */
/* loaded from: classes3.dex */
public class DownloadPatchZipInterceptor extends Interceptor<Pair<Uri, UpdatePackage>, Pair<Buffer, UpdatePackage>> {

    /* renamed from: d */
    private GeckoConfig f14026d;

    /* renamed from: e */
    private File f14027e;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final void mo91298a(Object... objArr) {
        super.mo91298a(objArr);
        this.f14026d = (GeckoConfig) objArr[0];
        this.f14027e = (File) objArr[1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a  reason: avoid collision after fix types in other method */
    public Object mo91295a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Uri, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m91263d("gecko-debug-tag", "start download patch zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        String uri = ((Uri) pair.first).toString();
        long length = updatePackage.getPatch().getLength();
        File file = this.f14027e;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(updatePackage.getAccessKey());
        String str = File.separator;
        sb2.append(str);
        sb2.append(updatePackage.getChannel());
        sb2.append(str);
        sb2.append(updatePackage.getVersion());
        sb2.append("--updating");
        File file2 = new File(file, sb2.toString());
        file2.mkdirs();
        Buffer m91356a = BufferPolicy.m91356a(new File(file2, "patch.tmp"), length);
        try {
            this.f14026d.m91387i().downloadFile(uri, length, new BufferOutputStream(m91356a));
            try {
                return chain.mo91449a((Chain<Pair<Buffer, UpdatePackage>>) new Pair<>(m91356a, updatePackage));
            } finally {
                m91356a.mo91343e();
            }
        } catch (Throwable th) {
            m91356a.mo91343e();
            throw new DownloadException("download patch zip failed, url:" + uri + ", channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
