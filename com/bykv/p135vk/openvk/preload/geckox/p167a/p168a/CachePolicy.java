package com.bykv.p135vk.openvk.preload.geckox.p167a.p168a;

import android.annotation.SuppressLint;
import java.io.File;
import java.util.List;

@SuppressLint({"CI_StaticFieldLeak"})
/* renamed from: com.bykv.vk.openvk.preload.geckox.a.a.b */
/* loaded from: classes3.dex */
public abstract class CachePolicy {

    /* renamed from: a */
    public static final CachePolicy f13957a = new EmptyCachePolicy();

    /* renamed from: b */
    public static final CachePolicy f13958b;

    /* renamed from: c */
    protected CacheConfig f13959c;

    /* renamed from: d */
    protected File f13960d;

    /* renamed from: e */
    protected List<String> f13961e;

    static {
        new LRUCachePolicy();
        f13958b = new FIFOCachePolicy();
    }

    /* renamed from: a */
    public abstract void mo91406a();

    /* renamed from: a */
    public void mo91407a(CacheConfig cacheConfig, File file, List<String> list) {
        this.f13959c = cacheConfig;
        this.f13960d = file;
        this.f13961e = list;
    }
}
