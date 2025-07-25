package com.bykv.p135vk.openvk.preload.geckox.p179e.p180a;

import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bykv.vk.openvk.preload.geckox.e.a.b */
/* loaded from: classes3.dex */
public final class MyArchiveFileLoader extends FileLoader {
    public MyArchiveFileLoader(File file) {
        super(file);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.FileLoader
    /* renamed from: a */
    protected final InputStream mo91283a(File file, String str) throws IOException {
        GeckoLogger.m91263d("gecko-debug-tag", "MyArchiveFileLoader, file:", new File(str).getCanonicalPath());
        return null;
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.FileLoader
    /* renamed from: b */
    protected final boolean mo91282b(File file, String str) throws IOException {
        new File(str).getCanonicalPath();
        return false;
    }
}
