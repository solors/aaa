package com.bykv.p135vk.openvk.preload.geckox.p179e.p180a;

import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bykv.vk.openvk.preload.geckox.e.a.c */
/* loaded from: classes3.dex */
public final class NormalFileLoader extends FileLoader {
    public NormalFileLoader(File file) {
        super(file);
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.FileLoader
    /* renamed from: a */
    protected final InputStream mo91283a(File file, String str) throws IOException {
        File file2 = new File(file, "res" + File.separator + str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            GeckoLogger.m91263d("gecko-debug-tag", "NormalFileLoader, file:", file2.getAbsolutePath());
            return new FileInputStream(file2.getCanonicalFile());
        }
        throw new IOException("file not found");
    }

    @Override // com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.FileLoader
    /* renamed from: b */
    protected final boolean mo91282b(File file, String str) throws IOException {
        return new File(file, "res" + File.separator + str).exists();
    }
}
