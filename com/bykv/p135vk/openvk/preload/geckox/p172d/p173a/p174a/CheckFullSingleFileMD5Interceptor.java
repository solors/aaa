package com.bykv.p135vk.openvk.preload.geckox.p172d.p173a.p174a;

import android.util.Pair;
import com.bykv.p135vk.openvk.preload.geckox.buffer.Buffer;
import com.bykv.p135vk.openvk.preload.geckox.buffer.stream.BufferInputStream;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.model.UpdatePackage;
import com.bykv.p135vk.openvk.preload.geckox.p169b.MD5Exception;
import com.bykv.p135vk.openvk.preload.geckox.utils.MD5Utils;
import com.bykv.p135vk.openvk.preload.p163b.Chain;
import com.bykv.p135vk.openvk.preload.p163b.Interceptor;
import java.io.File;

/* renamed from: com.bykv.vk.openvk.preload.geckox.d.a.a.a */
/* loaded from: classes3.dex */
public class CheckFullSingleFileMD5Interceptor extends Interceptor<Pair<Buffer, UpdatePackage>, Pair<File, UpdatePackage>> {
    @Override // com.bykv.p135vk.openvk.preload.p163b.Interceptor
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo91295a(Chain<Pair<File, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        return m91322a(chain, pair);
    }

    /* renamed from: a  reason: avoid collision after fix types in other method */
    private static Object m91322a(Chain<Pair<File, UpdatePackage>> chain, Pair<Buffer, UpdatePackage> pair) throws Throwable {
        GeckoLogger.m91263d("gecko-debug-tag", "start check full single file channel:", ((UpdatePackage) pair.second).getChannel());
        Buffer buffer = (Buffer) pair.first;
        UpdatePackage updatePackage = (UpdatePackage) pair.second;
        buffer.mo91348b(0L);
        try {
            MD5Utils.m91217a(new BufferInputStream(buffer), updatePackage.getFullPackage().getMd5());
            buffer.mo91354a();
            return chain.mo91449a((Chain<Pair<File, UpdatePackage>>) new Pair<>(buffer.mo91342f(), updatePackage));
        } catch (Throwable th) {
            throw new MD5Exception("check full single file failed, channel:" + updatePackage.getChannel() + ", pkg id:" + updatePackage.getFullPackage().getId() + ", caused by:" + th.getMessage(), th);
        }
    }
}
