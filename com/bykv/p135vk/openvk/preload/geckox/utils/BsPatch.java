package com.bykv.p135vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileNotFoundException;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.BsPatch */
/* loaded from: classes3.dex */
public class BsPatch {
    static {
        System.loadLibrary("geckox_bspatch");
    }

    /* renamed from: a */
    public static void m91238a(File file, File file2, File file3, String str) throws Exception {
        if (file.exists()) {
            if (file2.exists()) {
                file3.mkdirs();
                File file4 = new File(file3, str);
                file4.delete();
                int patch = patch(file.getAbsolutePath(), file4.getAbsolutePath(), file2.getAbsolutePath());
                if (patch == 0) {
                    return;
                }
                throw new RuntimeException("patch merged failed, code：" + patch + " full:" + file.getAbsolutePath() + " patch:" + file2.getAbsolutePath() + " dest:" + file4.getAbsolutePath());
            }
            throw new FileNotFoundException("patch package not exist：" + file2.getAbsolutePath());
        }
        throw new FileNotFoundException("full package not exist：" + file.getAbsolutePath());
    }

    private static native int patch(String str, String str2, String str3) throws Exception;
}
