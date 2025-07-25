package io.bidmachine.rendering.utils;

import androidx.annotation.NonNull;
import com.explorestack.iab.utils.C10512g;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes9.dex */
public class VideoUtils {
    public static void saveVideo(@NonNull File file, @NonNull byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            C10512g.m79300q(fileOutputStream);
            C10512g.m79304m(fileOutputStream);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            C10512g.m79300q(fileOutputStream2);
            C10512g.m79304m(fileOutputStream2);
            throw th;
        }
    }
}
