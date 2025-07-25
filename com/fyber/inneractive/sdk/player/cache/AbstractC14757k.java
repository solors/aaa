package com.fyber.inneractive.sdk.player.cache;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.player.cache.k */
/* loaded from: classes4.dex */
public abstract class AbstractC14757k {

    /* renamed from: a */
    public static final Charset f27973a = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    /* renamed from: a */
    public static void m77641a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m77641a(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}
