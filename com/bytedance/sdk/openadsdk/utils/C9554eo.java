package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.C6492bX;
import java.io.Closeable;
import java.io.File;

/* renamed from: com.bytedance.sdk.openadsdk.utils.eo */
/* loaded from: classes3.dex */
public class C9554eo {

    /* renamed from: bg */
    private static String f21322bg;

    /* renamed from: bg */
    public static String m82415bg() {
        if (TextUtils.isEmpty(f21322bg)) {
            f21322bg = C6492bX.m91759bg().getCacheDir() + File.separator + "proxy_cache";
        }
        return f21322bg;
    }

    /* renamed from: bg */
    public static void m82414bg(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
