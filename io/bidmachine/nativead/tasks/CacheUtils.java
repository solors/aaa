package io.bidmachine.nativead.tasks;

import android.media.ThumbnailUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;

/* renamed from: io.bidmachine.nativead.tasks.a */
/* loaded from: classes9.dex */
class CacheUtils {
    CacheUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static File cacheVideoFile(@NonNull String str, @NonNull File file, int i) {
        InputStream inputStream;
        File file2;
        InputStream inputStream2 = null;
        try {
            inputStream = ConnectionUtils.getInputStream(str, i);
        } catch (Exception e) {
            e = e;
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            Utils.close(inputStream2);
            throw th;
        }
        try {
            try {
                file2 = new File(file, Utils.generateFileName(str));
            } catch (Throwable th2) {
                th = th2;
                inputStream2 = inputStream;
                Utils.close(inputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Logger.m20086w(e);
            Utils.close(inputStream);
            return null;
        }
        if (file2.exists() && file2.length() > 0 && isVideoFileSupported(file2)) {
            Utils.close(inputStream);
            return file2;
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            fileOutputStream.write(bArr, 0, read);
        }
        Utils.close(fileOutputStream);
        if (isVideoFileSupported(file2)) {
            Utils.close(inputStream);
            return file2;
        }
        Utils.close(inputStream);
        return null;
    }

    private static boolean isVideoFileSupported(@NonNull File file) {
        if (ThumbnailUtils.createVideoThumbnail(file.getPath(), 1) != null) {
            return true;
        }
        return false;
    }
}
