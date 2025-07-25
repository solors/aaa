package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.y */
/* loaded from: classes4.dex */
public final class ThreadFactoryC15132y implements ThreadFactory {

    /* renamed from: a */
    public final /* synthetic */ String f29831a;

    public ThreadFactoryC15132y(String str) {
        this.f29831a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f29831a);
    }
}
