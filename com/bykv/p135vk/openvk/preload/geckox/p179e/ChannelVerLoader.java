package com.bykv.p135vk.openvk.preload.geckox.p179e;

import com.bykv.p135vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.p135vk.openvk.preload.geckox.p167a.ChannelCleanHelper;
import com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.FileLoader;
import com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.MyArchiveFileLoader;
import com.bykv.p135vk.openvk.preload.geckox.p179e.p180a.NormalFileLoader;
import com.bykv.p135vk.openvk.preload.geckox.p181f.SelectChannelVersionLock;
import com.bykv.p135vk.openvk.preload.geckox.p181f.UsingLock;
import com.bykv.p135vk.openvk.preload.geckox.utils.ResVersionUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bykv.vk.openvk.preload.geckox.e.a */
/* loaded from: classes3.dex */
public final class ChannelVerLoader {

    /* renamed from: a */
    private String f14045a;

    /* renamed from: b */
    private String f14046b;

    /* renamed from: c */
    private volatile File f14047c;

    /* renamed from: d */
    private volatile Long f14048d;

    /* renamed from: e */
    private volatile FileLoader f14049e;

    /* renamed from: f */
    private AtomicBoolean f14050f = new AtomicBoolean(false);

    public ChannelVerLoader(String str, String str2) {
        this.f14045a = str;
        this.f14046b = str2;
    }

    /* renamed from: d */
    private synchronized FileLoader m91287d(String str) throws Exception {
        if (this.f14049e != null) {
            return this.f14049e;
        }
        File m91286e = m91286e(str);
        if (m91286e != null) {
            File file = new File(m91286e, "res.macv");
            File file2 = new File(m91286e, "res");
            if (file2.exists() && file2.isDirectory()) {
                this.f14049e = new NormalFileLoader(m91286e);
            } else if (file.exists() && file.isFile()) {
                this.f14049e = new MyArchiveFileLoader(m91286e);
            } else {
                throw new RuntimeException("can not find res, dir:" + m91286e.getAbsolutePath());
            }
            return this.f14049e;
        }
        throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
    }

    /* renamed from: e */
    private synchronized File m91286e(String str) throws Exception {
        if (this.f14047c != null) {
            return this.f14047c;
        } else if (this.f14048d != null && this.f14048d.longValue() == -1) {
            return null;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f14045a);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(str);
            sb2.append(str2);
            sb2.append("select.lock");
            SelectChannelVersionLock m91271a = SelectChannelVersionLock.m91271a(sb2.toString());
            if (this.f14048d == null) {
                this.f14048d = ResVersionUtils.m91213a(new File(this.f14045a, str));
            }
            if (this.f14048d == null) {
                this.f14048d = -1L;
                m91271a.m91272a();
                return null;
            }
            String str3 = this.f14045a;
            File file = new File(str3, str2 + str + str2 + this.f14048d + str2 + "using.lock");
            this.f14047c = file.getParentFile();
            UsingLock.m91270a(file.getAbsolutePath());
            File file2 = this.f14047c;
            m91271a.m91272a();
            return file2;
        }
    }

    /* renamed from: a */
    public final InputStream m91293a(String str) throws Exception {
        return m91287d(this.f14046b).m91285a(m91292a(this.f14046b, str));
    }

    /* renamed from: b */
    public final boolean m91290b(String str) throws Exception {
        return m91287d(this.f14046b).m91284b(m91292a(this.f14046b, str));
    }

    /* renamed from: c */
    public final int m91288c(String str) {
        try {
            File file = new File(m91286e(str), "res");
            if (file.exists() && file.isDirectory()) {
                int length = file.listFiles().length;
                if (length > 0) {
                    return length - 1;
                }
                return 0;
            }
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: a */
    private static String m91292a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    /* renamed from: b */
    public final String m91291b() {
        return this.f14046b;
    }

    /* renamed from: a */
    public final Long m91294a() {
        return this.f14048d;
    }

    /* renamed from: c */
    public final void m91289c() throws Exception {
        if (this.f14050f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f14045a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f14046b);
        sb2.append(str);
        sb2.append("select.lock");
        SelectChannelVersionLock m91271a = SelectChannelVersionLock.m91271a(sb2.toString());
        GeckoLogger.m91263d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f14047c == null) {
                return;
            }
            UsingLock.m91269b(this.f14047c.getAbsolutePath() + str + "using.lock");
            m91271a.m91272a();
            ChannelCleanHelper.m91401a(this.f14045a + str + this.f14046b);
        } finally {
            m91271a.m91272a();
        }
    }
}
