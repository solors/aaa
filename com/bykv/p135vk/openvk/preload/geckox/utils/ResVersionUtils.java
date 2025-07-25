package com.bykv.p135vk.openvk.preload.geckox.utils;

import java.io.File;
import java.io.FileFilter;

/* renamed from: com.bykv.vk.openvk.preload.geckox.utils.g */
/* loaded from: classes3.dex */
public final class ResVersionUtils {
    /* renamed from: a */
    public static Long m91213a(File file) {
        File[] listFiles = file.listFiles(new FileFilter() { // from class: com.bykv.vk.openvk.preload.geckox.utils.g.1
            @Override // java.io.FileFilter
            public final boolean accept(File file2) {
                return file2.isDirectory();
            }
        });
        Long l = null;
        if (listFiles != null && listFiles.length != 0) {
            for (File file2 : listFiles) {
                try {
                    long longValue = Long.valueOf(file2.getName()).longValue();
                    if (l == null) {
                        l = Long.valueOf(longValue);
                    } else if (longValue > l.longValue()) {
                        l = Long.valueOf(longValue);
                    }
                } catch (Exception unused) {
                }
            }
        }
        return l;
    }
}
