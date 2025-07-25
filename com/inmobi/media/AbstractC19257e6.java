package com.inmobi.media;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* renamed from: com.inmobi.media.e6 */
/* loaded from: classes6.dex */
public abstract class AbstractC19257e6 {
    /* renamed from: a */
    public static final boolean m60373a(String tag, String data, String filePath) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        try {
            m60374a(filePath);
            File file = new File(filePath);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bytes = data.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            fileOutputStream.write(bytes);
            fileOutputStream.close();
            return true;
        } catch (IOException | RuntimeException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static final void m60374a(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        File file = new File(filePath);
        if (file.exists() && file.delete()) {
            file.getName();
        }
    }
}
