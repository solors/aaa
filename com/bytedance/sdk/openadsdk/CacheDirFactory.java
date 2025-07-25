package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p138IL.p145bg.p147bg.C6458bg;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.p152bg.InterfaceC6498IL;
import com.bytedance.sdk.component.utils.C7756ldr;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.multipro.C9307IL;
import java.io.File;

/* loaded from: classes3.dex */
public class CacheDirFactory {
    public static volatile InterfaceC6498IL MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;

    /* renamed from: bg */
    private static String f17172bg;

    /* renamed from: bg */
    private static InterfaceC6498IL m87509bg() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    C6458bg c6458bg = new C6458bg();
                    MEDIA_CACHE_DIR = c6458bg;
                    c6458bg.mo91687bg(getRootDir());
                    MEDIA_CACHE_DIR.eqN();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static int getCacheType() {
        return 1;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }

    public static InterfaceC6498IL getICacheDir(int i) {
        return m87509bg();
    }

    public static String getImageCacheDir() {
        if (f17172bg == null) {
            f17172bg = getDiskCacheDirPath("image");
        }
        return f17172bg;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File m87823bg = C7756ldr.m87823bg(C8838VzQ.m84740bg(), C9307IL.m83088bX(), "tt_ad");
        if (m87823bg.isFile()) {
            m87823bg.delete();
        }
        if (!m87823bg.exists()) {
            m87823bg.mkdirs();
        }
        String absolutePath = m87823bg.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }
}
