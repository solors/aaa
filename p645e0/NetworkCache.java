package p645e0;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p690h0.C33453f;

/* renamed from: e0.g */
/* loaded from: classes2.dex */
public class NetworkCache {
    @NonNull

    /* renamed from: a */
    private final LottieNetworkCacheProvider f89702a;

    public NetworkCache(@NonNull LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        this.f89702a = lottieNetworkCacheProvider;
    }

    /* renamed from: b */
    private static String m25540b(String str, FileExtension fileExtension, boolean z) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        if (z) {
            str2 = fileExtension.m25546b();
        } else {
            str2 = fileExtension.f89701b;
        }
        sb2.append(str2);
        return sb2.toString();
    }

    @Nullable
    /* renamed from: c */
    private File m25539c(String str) throws FileNotFoundException {
        File file = new File(m25538d(), m25540b(str, FileExtension.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(m25538d(), m25540b(str, FileExtension.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    /* renamed from: d */
    private File m25538d() {
        File mo25543a = this.f89702a.mo25543a();
        if (mo25543a.isFile()) {
            mo25543a.delete();
        }
        if (!mo25543a.exists()) {
            mo25543a.mkdirs();
        }
        return mo25543a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    @WorkerThread
    /* renamed from: a */
    public Pair<FileExtension, InputStream> m25541a(String str) {
        FileExtension fileExtension;
        try {
            File m25539c = m25539c(str);
            if (m25539c == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(m25539c);
            if (m25539c.getAbsolutePath().endsWith(".zip")) {
                fileExtension = FileExtension.ZIP;
            } else {
                fileExtension = FileExtension.JSON;
            }
            C33453f.m23903a("Cache hit for " + str + " at " + m25539c.getAbsolutePath());
            return new Pair<>(fileExtension, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m25537e(String str, FileExtension fileExtension) {
        File file = new File(m25538d(), m25540b(str, fileExtension, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        C33453f.m23903a("Copying temp file to real file (" + file2 + ")");
        if (!renameTo) {
            C33453f.m23901c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public File m25536f(String str, InputStream inputStream, FileExtension fileExtension) throws IOException {
        File file = new File(m25538d(), m25540b(str, fileExtension, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}
