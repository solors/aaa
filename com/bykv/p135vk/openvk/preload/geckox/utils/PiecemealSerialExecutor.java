package com.bykv.p135vk.openvk.preload.geckox.utils;

import com.bykv.p135vk.openvk.preload.geckox.GeckoConfig;
import java.util.concurrent.Executor;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.f */
/* loaded from: classes3.dex */
public class PiecemealSerialExecutor implements Executor {

    /* renamed from: a */
    private static volatile PiecemealSerialExecutor f14129a;

    /* renamed from: a */
    public static PiecemealSerialExecutor m91214a() {
        if (f14129a == null) {
            synchronized (PiecemealSerialExecutor.class) {
                if (f14129a == null) {
                    f14129a = new PiecemealSerialExecutor();
                }
            }
        }
        return f14129a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        GeckoConfig.m91380p().execute(runnable);
    }
}
