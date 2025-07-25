package com.bykv.p135vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.p179e.VersionedResLoader;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bykv.vk.openvk.preload.falconx.loader.a */
/* loaded from: classes3.dex */
public final class GeckoResLoader implements ILoader {

    /* renamed from: a */
    private VersionedResLoader f13927a;

    /* renamed from: b */
    private AtomicBoolean f13928b = new AtomicBoolean(false);

    public GeckoResLoader(Context context, String str, File file) {
        if (context != null) {
            if (!TextUtils.isEmpty(str)) {
                if (file != null) {
                    this.f13927a = new VersionedResLoader(context, str, file);
                    return;
                }
                throw new RuntimeException("resRootDir == null");
            }
            throw new RuntimeException("access key empty");
        }
        throw new RuntimeException("context == null");
    }

    /* renamed from: a */
    public final int m91430a(String str) throws Exception {
        if (!this.f13928b.get()) {
            return this.f13927a.m91278b(str);
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.falconx.loader.ILoader
    public final boolean exist(String str) throws Exception {
        if (!this.f13928b.get()) {
            return this.f13927a.m91276c(str);
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.falconx.loader.ILoader
    public final Map<String, Long> getChannelVersion() {
        return this.f13927a.m91279b();
    }

    @Override // com.bykv.p135vk.openvk.preload.falconx.loader.ILoader
    public final InputStream getInputStream(String str) throws Exception {
        if (!this.f13928b.get()) {
            GeckoLogger.m91263d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
            return this.f13927a.m91280a(str);
        }
        throw new RuntimeException("released!");
    }

    @Override // com.bykv.p135vk.openvk.preload.falconx.loader.ILoader
    public final String getResRootDir() {
        return this.f13927a.m91281a();
    }

    @Override // com.bykv.p135vk.openvk.preload.falconx.loader.ILoader
    public final void release() throws Exception {
        if (this.f13928b.getAndSet(true)) {
            return;
        }
        this.f13927a.m91277c();
    }
}
