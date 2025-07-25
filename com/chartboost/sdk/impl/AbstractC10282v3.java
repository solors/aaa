package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.impl.C10277v2;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.DefaultDatabaseProvider;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.scheduler.Scheduler;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.upstream.cache.CacheEvictor;
import com.google.android.exoplayer2.upstream.cache.SimpleCache;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.v3 */
/* loaded from: classes3.dex */
public abstract class AbstractC10282v3 {
    /* renamed from: a */
    public static final Cache m80306a(InterfaceC10347x4 fileCaching, DatabaseProvider databaseProvider, C10054mb cachePolicy, C10277v2.InterfaceC10280b evictorCallback, CacheEvictor evictor) {
        Intrinsics.checkNotNullParameter(fileCaching, "fileCaching");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cachePolicy, "cachePolicy");
        Intrinsics.checkNotNullParameter(evictorCallback, "evictorCallback");
        Intrinsics.checkNotNullParameter(evictor, "evictor");
        return new SimpleCache(fileCaching.mo79905b(), evictor, databaseProvider);
    }

    /* renamed from: b */
    public static final File m80302b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheDir = new C9886h5(context.getCacheDir()).f22164h;
        Intrinsics.checkNotNullExpressionValue(precacheDir, "precacheDir");
        return precacheDir;
    }

    /* renamed from: c */
    public static final File m80301c(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        File precacheQueueDir = new C9886h5(context.getCacheDir()).f22165i;
        Intrinsics.checkNotNullExpressionValue(precacheQueueDir, "precacheQueueDir");
        return precacheQueueDir;
    }

    /* renamed from: a */
    public static /* synthetic */ Cache m80305a(InterfaceC10347x4 interfaceC10347x4, DatabaseProvider databaseProvider, C10054mb c10054mb, C10277v2.InterfaceC10280b interfaceC10280b, CacheEvictor cacheEvictor, int i, Object obj) {
        if ((i & 16) != 0) {
            cacheEvictor = new C10277v2(c10054mb.m81071b(), interfaceC10280b, null, 4, null);
        }
        return m80306a(interfaceC10347x4, databaseProvider, c10054mb, interfaceC10280b, cacheEvictor);
    }

    /* renamed from: a */
    public static final CacheDataSource.Factory m80303a(Cache cache, HttpDataSource.Factory httpDataSourceFactory) {
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        CacheDataSource.Factory cacheWriteDataSinkFactory = new CacheDataSource.Factory().setCache(cache).setUpstreamDataSourceFactory(httpDataSourceFactory).setCacheWriteDataSinkFactory(null);
        Intrinsics.checkNotNullExpressionValue(cacheWriteDataSinkFactory, "setCacheWriteDataSinkFactory(...)");
        return cacheWriteDataSinkFactory;
    }

    /* renamed from: a */
    public static final DatabaseProvider m80311a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new DefaultDatabaseProvider(new C9671a5(context, null, null, 0, 14, null));
    }

    /* renamed from: a */
    public static final DownloadManager m80308a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory httpDataSourceFactory, DownloadManager.Listener listener, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(databaseProvider, "databaseProvider");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(httpDataSourceFactory, "httpDataSourceFactory");
        Intrinsics.checkNotNullParameter(listener, "listener");
        DownloadManager downloadManager = new DownloadManager(context, databaseProvider, cache, httpDataSourceFactory, Executors.newFixedThreadPool(i));
        downloadManager.setMaxParallelDownloads(i2);
        downloadManager.addListener(listener);
        return downloadManager;
    }

    /* renamed from: a */
    public static /* synthetic */ DownloadManager m80307a(Context context, DatabaseProvider databaseProvider, Cache cache, HttpDataSource.Factory factory, DownloadManager.Listener listener, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i = 2;
        }
        int i4 = i;
        if ((i3 & 64) != 0) {
            i2 = 1;
        }
        return m80308a(context, databaseProvider, cache, factory, listener, i4, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ LoadControl m80312a(int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 500;
        }
        if ((i3 & 2) != 0) {
            i2 = 50000;
        }
        return m80313a(i, i2);
    }

    /* renamed from: a */
    public static final Scheduler m80310a(Context context, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Util.SDK_INT >= 21) {
            return new PlatformScheduler(context, i);
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ Scheduler m80309a(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return m80310a(context, i);
    }

    /* renamed from: a */
    public static final MediaSource.Factory m80304a(DataSource.Factory factory) {
        Intrinsics.checkNotNullParameter(factory, "<this>");
        return new DefaultMediaSourceFactory(factory);
    }

    /* renamed from: a */
    public static final void m80314a() {
        CookieManager cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
        CookieHandler.setDefault(cookieManager);
    }

    /* renamed from: a */
    public static final LoadControl m80313a(int i, int i2) {
        DefaultLoadControl build = new DefaultLoadControl.Builder().setBufferDurationsMs(i, i2, i, i).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
