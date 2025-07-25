package com.bykv.p135vk.openvk.preload.geckox.p172d.p176b.p178b;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.buffer.stream.BufferInputStream;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.utils.MD5Utils;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.b.b.a */
/* loaded from: classes3.dex */
public class CheckMergedZipMD5Interceptor extends Interceptor<Pair<Buffer, UpdatePackage>, Pair<Buffer, UpdatePackage>> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo91295a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        return m91310a(chain, pair);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object m91310a(Chain<Pair<Buffer, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m91263d("gecko-debug-tag", "start check merged zip file, channel:", ((UpdatePackage) pair.second).getChannel());
        Buffer buffer = (Buffer) pair.first;
        buffer.mo91348b(0L);
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        try {
            MD5Utils.m91217a(new BufferInputStream(buffer), updatePackage.getFullPackage().getMd5());
            return chain.mo91449a((Chain<Pair<Buffer, UpdatePackage>>) pair);
        } catch (Throwable th) {
            buffer.mo91343e();
            throw new RuntimeException("check merged zip file failed, channel:" + updatePackage.getChannel() + ", pkg id：" + updatePackage.getPatch().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
