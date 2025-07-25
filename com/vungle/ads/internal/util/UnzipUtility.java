package com.vungle.ads.internal.util;

import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.C29518o;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.internal.util.v */
/* loaded from: classes7.dex */
public final class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    @NotNull
    public static final UnzipUtility INSTANCE = new UnzipUtility();
    private static final String TAG = UnzipUtility.class.getCanonicalName();

    /* compiled from: UnzipUtility.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.v$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC29523a {
        boolean matches(@Nullable String str);
    }

    /* compiled from: UnzipUtility.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.v$b */
    /* loaded from: classes7.dex */
    public static final class C29524b extends IOException {
        public C29524b(@Nullable String str) {
            super(str);
        }
    }

    private UnzipUtility() {
    }

    public static /* synthetic */ List unzip$default(UnzipUtility unzipUtility, String str, String str2, InterfaceC29523a interfaceC29523a, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            interfaceC29523a = null;
        }
        return unzipUtility.unzip(str, str2, interfaceC29523a);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        boolean m16624M;
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalID = new File(str2).getCanonicalPath();
        Intrinsics.checkNotNullExpressionValue(canonicalPath, "canonicalPath");
        Intrinsics.checkNotNullExpressionValue(canonicalID, "canonicalID");
        m16624M = StringsJVM.m16624M(canonicalPath, canonicalID, false, 2, null);
        if (m16624M) {
            return canonicalPath;
        }
        C29518o.C29519a c29519a = C29518o.Companion;
        String TAG2 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
        c29519a.m37467e(TAG2, "File is outside extraction target directory.");
        throw new C29524b("File is outside extraction target directory.");
    }

    @VisibleForTesting
    public final void extractFile(@NotNull InputStream zipIn, @Nullable String str) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        Intrinsics.checkNotNullParameter(zipIn, "zipIn");
        File file = new File(str);
        FileUtility.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            } catch (Throwable th2) {
                th = th2;
                bufferedOutputStream = null;
            }
        } catch (Throwable th3) {
            fileOutputStream = null;
            th = th3;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            while (true) {
                int read = zipIn.read(bArr);
                if (read != -1) {
                    bufferedOutputStream.write(bArr, 0, read);
                } else {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    fileUtility.closeQuietly(zipIn);
                    fileUtility.closeQuietly(bufferedOutputStream);
                    fileUtility.closeQuietly(fileOutputStream);
                    return;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            FileUtility fileUtility2 = FileUtility.INSTANCE;
            fileUtility2.closeQuietly(zipIn);
            fileUtility2.closeQuietly(bufferedOutputStream);
            fileUtility2.closeQuietly(fileOutputStream);
            throw th;
        }
    }

    @NotNull
    public final List<File> unzip(@Nullable String str, @NotNull String destDirectory) throws IOException {
        Intrinsics.checkNotNullParameter(destDirectory, "destDirectory");
        return unzip$default(this, str, destDirectory, null, 4, null);
    }

    @NotNull
    public final List<File> unzip(@Nullable String str, @NotNull String destDirectory, @Nullable InterfaceC29523a interfaceC29523a) throws IOException {
        ZipFile zipFile;
        Intrinsics.checkNotNullParameter(destDirectory, "destDirectory");
        if (!(str == null || str.length() == 0)) {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(destDirectory);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                ArrayList arrayList = new ArrayList();
                ZipFile zipFile2 = null;
                try {
                    zipFile = new ZipFile(file);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    Enumeration<? extends ZipEntry> entries = zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry nextElement = entries.nextElement();
                        String str2 = destDirectory + File.separator + nextElement.getName();
                        if (interfaceC29523a == null || interfaceC29523a.matches(str2)) {
                            validateFilename(str2, destDirectory);
                            if (nextElement.isDirectory()) {
                                File file3 = new File(str2);
                                if (!file3.exists()) {
                                    file3.mkdirs();
                                }
                            } else {
                                InputStream inputStream = zipFile.getInputStream(nextElement);
                                Intrinsics.checkNotNullExpressionValue(inputStream, "zipFile.getInputStream(entry)");
                                extractFile(inputStream, str2);
                                arrayList.add(new File(str2));
                            }
                        }
                    }
                    try {
                        zipFile.close();
                    } catch (IOException unused) {
                    }
                    return arrayList;
                } catch (Throwable th2) {
                    th = th2;
                    zipFile2 = zipFile;
                    if (zipFile2 != null) {
                        try {
                            zipFile2.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            }
            throw new IOException("File does not exist");
        }
        throw new IOException("Path is empty");
    }
}
