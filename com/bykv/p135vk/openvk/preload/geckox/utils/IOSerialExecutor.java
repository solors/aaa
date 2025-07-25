package com.bykv.p135vk.openvk.preload.geckox.utils;

import com.bykv.p135vk.openvk.preload.geckox.GeckoConfig;
import java.util.concurrent.Executor;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.c */
/* loaded from: classes3.dex */
public class IOSerialExecutor implements Executor {

    /* renamed from: a */
    private static volatile IOSerialExecutor f14127a;

    /* renamed from: a */
    public static IOSerialExecutor m91218a() {
        if (f14127a == null) {
            synchronized (IOSerialExecutor.class) {
                if (f14127a == null) {
                    f14127a = new IOSerialExecutor();
                }
            }
        }
        return f14127a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        GeckoConfig.m91380p().execute(runnable);
    }
}
