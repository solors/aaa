package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.dx0;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q40 {
    @NotNull

    /* renamed from: a */
    private final b00 f84224a;
    @NotNull

    /* renamed from: b */
    private final xt1 f84225b;

    public /* synthetic */ q40() {
        this(new b00(), new xt1());
    }

    @NotNull
    /* renamed from: a */
    public final wt1 m30476a(@NotNull Context context) {
        long j;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f84224a.getClass();
        File cacheDir = b00.m35724a(context, "mobileads-video-cache");
        int i = as1.f76895l;
        yp1 m35796a = as1.C29962a.m35776a().m35796a(context);
        if (m35796a != null && m35796a.m26796A() != 0) {
            j = m35796a.m26796A();
        } else {
            j = 52428800;
        }
        qo0 cacheEvictor = new qo0(dx0.C30197a.m34837a(context, 41943040L, j));
        z30 databaseProvider = new z30(context);
        this.f84225b.getClass();
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        Intrinsics.checkNotNullParameter(cacheEvictor, "cacheEvictor");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        return new wt1(cacheDir, cacheEvictor, databaseProvider);
    }

    public q40(@NotNull b00 diskCacheProvider, @NotNull xt1 simpleCacheFactory) {
        Intrinsics.checkNotNullParameter(diskCacheProvider, "diskCacheProvider");
        Intrinsics.checkNotNullParameter(simpleCacheFactory, "simpleCacheFactory");
        this.f84224a = diskCacheProvider;
        this.f84225b = simpleCacheFactory;
    }
}
