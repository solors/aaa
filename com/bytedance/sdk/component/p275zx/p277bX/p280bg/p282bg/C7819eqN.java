package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p282bg;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.eqN */
/* loaded from: classes3.dex */
final class C7819eqN {

    /* renamed from: bg */
    static final Charset f17070bg = Charset.forName("US-ASCII");

    /* renamed from: IL */
    static final Charset f17069IL = Charset.forName("UTF-8");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static void m87630bg(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m87630bg(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: ".concat(String.valueOf(file2)));
                }
            }
            return;
        }
        throw new IOException("not a readable directory: ".concat(String.valueOf(file)));
    }
}
