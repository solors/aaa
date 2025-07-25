package com.bykv.p135vk.openvk.preload.geckox.p172d.p176b.p177a;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.buffer.stream.BufferInputStream;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import com.bykv.p135vk.openvk.preload.geckox.utils.UnZipUtils;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.b.a.d */
/* loaded from: classes3.dex */
public class UnzipFullZipInterceptor extends Interceptor<Pair<Buffer, UpdatePackage>, Pair<File, UpdatePackage>> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo91295a(Chain<Pair<File, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        return m91311a(chain, pair);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object m91311a(Chain<Pair<File, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m91263d("gecko-debug-tag", "start unzip full zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        Buffer buffer = (Buffer) pair.first;
        buffer.mo91348b(0L);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        File parentFile = buffer.mo91342f().getParentFile();
        try {
            UnZipUtils.m91211a(new BufferInputStream(buffer), parentFile.getAbsolutePath(), updatePackage.getChannel());
            buffer.mo91354a();
            File file = new File(parentFile, "res");
            C6661b.m91224a(file);
            if (new File(parentFile, updatePackage.getChannel()).renameTo(file)) {
                return chain.mo91449a((Chain<Pair<File, UpdatePackage>>) new Pair<>(buffer.mo91342f(), updatePackage));
            }
            throw new RuntimeException("rename unziped full zip file failed:" + parentFile.getAbsolutePath() + ", dest:" + file.getAbsolutePath() + ", exist?" + file.exists());
        } catch (Exception e) {
            throw new RuntimeException("unzip full zip file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", dir:" + parentFile.getAbsolutePath() + ", caused by:" + e.getMessage(), e);
        }
    }
}
