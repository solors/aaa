package com.bykv.p135vk.openvk.preload.geckox.p179e.p180a;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bykv.vk.openvk.preload.geckox.e.a.a */
/* loaded from: classes3.dex */
public abstract class FileLoader {

    /* renamed from: a */
    private File f14051a;

    public FileLoader() {
    }

    public FileLoader(File file) {
        this.f14051a = file;
    }

    /* renamed from: a */
    protected abstract InputStream mo91283a(File file, String str) throws IOException;

    /* renamed from: a */
    public final InputStream m91285a(String str) throws IOException {
        return mo91283a(this.f14051a, str);
    }

    /* renamed from: b */
    protected abstract boolean mo91282b(File file, String str) throws IOException;

    /* renamed from: b */
    public final boolean m91284b(String str) throws IOException {
        return mo91282b(this.f14051a, str);
    }
}
