package com.bykv.p135vk.openvk.preload.geckox.p179e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bykv.vk.openvk.preload.geckox.e.b */
/* loaded from: classes3.dex */
public final class VersionedResLoader {

    /* renamed from: b */
    private String f14053b;

    /* renamed from: d */
    private String f14055d;

    /* renamed from: a */
    private final Map<String, ChannelVerLoader> f14052a = new HashMap();

    /* renamed from: c */
    private AtomicBoolean f14054c = new AtomicBoolean(false);

    public VersionedResLoader(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            this.f14053b = str;
            if (file == null) {
                File filesDir = context.getFilesDir();
                this.f14055d = new File(filesDir, "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
                return;
            }
            this.f14055d = new File(file, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key empty");
    }

    /* renamed from: d */
    private ChannelVerLoader m91275d(String str) {
        ChannelVerLoader channelVerLoader;
        int indexOf = str.indexOf(RemoteSettings.FORWARD_SLASH_STRING);
        if (indexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String substring = str.substring(0, indexOf);
        synchronized (this.f14052a) {
            channelVerLoader = this.f14052a.get(substring);
            if (channelVerLoader == null) {
                channelVerLoader = new ChannelVerLoader(this.f14055d, substring);
                this.f14052a.put(substring, channelVerLoader);
            }
        }
        return channelVerLoader;
    }

    /* renamed from: a */
    public final String m91281a() {
        return this.f14055d;
    }

    /* renamed from: b */
    public final int m91278b(String str) throws Exception {
        if (!this.f14054c.get()) {
            if (!TextUtils.isEmpty(str)) {
                return m91275d(str.trim()).m91288c(str);
            }
            throw new RuntimeException("relativePath empty");
        }
        throw new RuntimeException("released");
    }

    /* renamed from: c */
    public final boolean m91276c(String str) throws Exception {
        if (!this.f14054c.get()) {
            if (!TextUtils.isEmpty(str)) {
                return m91275d(str.trim()).m91290b(str);
            }
            throw new RuntimeException("relativePath empty");
        }
        throw new RuntimeException("released");
    }

    /* renamed from: a */
    public final InputStream m91280a(String str) throws Exception {
        if (!this.f14054c.get()) {
            if (!TextUtils.isEmpty(str)) {
                return m91275d(str.trim()).m91293a(str);
            }
            throw new RuntimeException("relativePath empty");
        }
        throw new RuntimeException("released");
    }

    /* renamed from: b */
    public final Map<String, Long> m91279b() {
        HashMap hashMap = new HashMap();
        synchronized (this.f14052a) {
            Collection<ChannelVerLoader> values = this.f14052a.values();
            if (values == null) {
                return hashMap;
            }
            for (ChannelVerLoader channelVerLoader : values) {
                hashMap.put(channelVerLoader.m91291b(), channelVerLoader.m91294a());
            }
            return hashMap;
        }
    }

    /* renamed from: c */
    public final void m91277c() throws Exception {
        if (this.f14054c.getAndSet(true)) {
            return;
        }
        GeckoLogger.m91263d("Loader", "release version res loader");
        synchronized (this.f14052a) {
            for (ChannelVerLoader channelVerLoader : this.f14052a.values()) {
                channelVerLoader.m91289c();
            }
            this.f14052a.clear();
        }
    }
}
