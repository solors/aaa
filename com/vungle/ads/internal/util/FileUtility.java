package com.vungle.ads.internal.util;

import android.os.Build;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.C29518o;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.C44980k;
import p1077ze.HttpUrl;

@Metadata
/* renamed from: com.vungle.ads.internal.util.i */
/* loaded from: classes7.dex */
public final class FileUtility {
    @NotNull
    private static final List<Class<?>> allowedClasses;
    @NotNull
    public static final FileUtility INSTANCE = new FileUtility();
    @NotNull
    private static InterfaceC29513a objectInputStreamProvider = new InterfaceC29513a() { // from class: com.vungle.ads.internal.util.h
        @Override // com.vungle.ads.internal.util.FileUtility.InterfaceC29513a
        public final ObjectInputStream provideObjectInputStream(InputStream inputStream) {
            ObjectInputStream m110397objectInputStreamProvider$lambda0;
            m110397objectInputStreamProvider$lambda0 = FileUtility.m110397objectInputStreamProvider$lambda0(inputStream);
            return m110397objectInputStreamProvider$lambda0;
        }
    };
    private static final String TAG = FileUtility.class.getSimpleName();

    /* compiled from: FileUtility.kt */
    @Metadata
    /* renamed from: com.vungle.ads.internal.util.i$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC29513a {
        @NotNull
        ObjectInputStream provideObjectInputStream(@Nullable InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    static {
        List<Class<?>> m17163p;
        m17163p = C37563v.m17163p(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);
        allowedClasses = m17163p;
    }

    private FileUtility() {
    }

    public static final void delete(@Nullable File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        C29518o.C29519a c29519a = C29518o.Companion;
                        String TAG2 = TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        c29519a.m37468d(TAG2, "Failed to delete file: " + file);
                    }
                }
            } catch (Exception e) {
                C29518o.C29519a c29519a2 = C29518o.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c29519a2.m37467e(TAG3, "Failed to delete file: " + e.getLocalizedMessage());
            }
        }
    }

    public static final void deleteAndLogIfFailed(@NotNull File file) {
        Path path;
        Intrinsics.checkNotNullParameter(file, "file");
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c29519a.m37467e(TAG2, "Cannot delete " + file.getName());
            }
        } catch (Exception e) {
            C29518o.C29519a c29519a2 = C29518o.Companion;
            String TAG3 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            c29519a2.m37466e(TAG3, "Cannot delete " + file.getName(), e);
        }
    }

    public static final void deleteContents(@NotNull File folder) {
        Intrinsics.checkNotNullParameter(folder, "folder");
        File[] listFiles = folder.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            delete(file);
        }
    }

    private final String getIndentString(int i) {
        StringBuilder sb2 = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb2.append("|  ");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }

    public static /* synthetic */ String guessFileName$default(FileUtility fileUtility, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return fileUtility.guessFileName(str, str2);
    }

    /* renamed from: objectInputStreamProvider$lambda-0 */
    public static final ObjectInputStream m110397objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(@Nullable File file) {
    }

    private final void printFile(File file, int i, StringBuilder sb2) {
        sb2.append(getIndentString(i));
        sb2.append("+--");
        sb2.append(file.getName());
        sb2.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x00b2: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:91:0x00b2 */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.vungle.ads.internal.util.i] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.vungle.ads.internal.util.i] */
    /* JADX WARN: Type inference failed for: r1v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r3v11, types: [com.vungle.ads.internal.util.i$a] */
    @Nullable
    public static final <T> T readSerializable(@NotNull File file) {
        Closeable closeable;
        ObjectInputStream objectInputStream;
        Closeable closeable2;
        Intrinsics.checkNotNullParameter(file, "file");
        ?? exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e3) {
                e = e3;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th) {
                th = th;
                exists = 0;
            }
            try {
                objectInputStream = objectInputStreamProvider.provideObjectInputStream(exists);
            } catch (IOException e4) {
                e = e4;
                objectInputStream = null;
            } catch (ClassNotFoundException e5) {
                e = e5;
                objectInputStream = null;
            } catch (Exception e6) {
                e = e6;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                ?? r0 = INSTANCE;
                r0.closeQuietly(closeable3);
                r0.closeQuietly(exists);
                throw th;
            }
            try {
                T t = (T) objectInputStream.readObject();
                ?? r02 = INSTANCE;
                r02.closeQuietly(objectInputStream);
                r02.closeQuietly(exists);
                return t;
            } catch (IOException e7) {
                e = e7;
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c29519a.m37467e(TAG2, "IOException: " + e.getMessage());
                closeable2 = exists;
                FileUtility fileUtility = INSTANCE;
                fileUtility.closeQuietly(objectInputStream);
                fileUtility.closeQuietly(closeable2);
                try {
                    delete(file);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                C29518o.C29519a c29519a2 = C29518o.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c29519a2.m37467e(TAG3, "ClassNotFoundException: " + e.getMessage());
                closeable2 = exists;
                FileUtility fileUtility2 = INSTANCE;
                fileUtility2.closeQuietly(objectInputStream);
                fileUtility2.closeQuietly(closeable2);
                delete(file);
                return null;
            } catch (Exception e9) {
                e = e9;
                C29518o.C29519a c29519a3 = C29518o.Companion;
                String TAG4 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
                c29519a3.m37467e(TAG4, "cannot read serializable " + e.getMessage());
                closeable2 = exists;
                FileUtility fileUtility22 = INSTANCE;
                fileUtility22.closeQuietly(objectInputStream);
                fileUtility22.closeQuietly(closeable2);
                delete(file);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.io.Closeable, java.io.ObjectOutputStream] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v15, types: [com.vungle.ads.internal.util.i] */
    /* JADX WARN: Type inference failed for: r5v9, types: [com.vungle.ads.internal.util.i] */
    public static final void writeSerializable(@NotNull File file, @Nullable Serializable serializable) {
        FileOutputStream fileOutputStream;
        ?? r4;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            try {
                r4 = new ObjectOutputStream(fileOutputStream);
                try {
                    r4.writeObject(serializable);
                    r4.reset();
                    ?? r5 = INSTANCE;
                    r5.closeQuietly(r4);
                    r5.closeQuietly(fileOutputStream);
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    r4 = r4;
                    try {
                        C29518o.C29519a c29519a = C29518o.Companion;
                        String TAG2 = TAG;
                        Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                        c29519a.m37467e(TAG2, String.valueOf(e.getMessage()));
                        ?? r52 = INSTANCE;
                        r52.closeQuietly(r4);
                        r52.closeQuietly(fileOutputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        fileOutputStream2 = r4;
                        FileUtility fileUtility = INSTANCE;
                        fileUtility.closeQuietly(fileOutputStream2);
                        fileUtility.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream2 = r4;
                    FileUtility fileUtility2 = INSTANCE;
                    fileUtility2.closeQuietly(fileOutputStream2);
                    fileUtility2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                r4 = 0;
            } catch (Throwable th3) {
                th = th3;
                FileUtility fileUtility22 = INSTANCE;
                fileUtility22.closeQuietly(fileOutputStream2);
                fileUtility22.closeQuietly(fileOutputStream);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            r4 = 0;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public final void closeQuietly(@Nullable Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    @NotNull
    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    @VisibleForTesting
    @NotNull
    public final InterfaceC29513a getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    @NotNull
    public final String guessFileName(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        String guessFileName = URLUtil.guessFileName(url, null, str);
        Intrinsics.checkNotNullExpressionValue(guessFileName, "guessFileName(url, null, ext)");
        return guessFileName;
    }

    public final boolean isValidUrl(@Nullable String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || HttpUrl.f119327k.m111f(str) == null) {
            return false;
        }
        return true;
    }

    @Nullable
    public final String readString(@NotNull File file) {
        String m1184i;
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.exists()) {
            try {
                m1184i = C44980k.m1184i(file, null, 1, null);
                return m1184i;
            } catch (IOException e) {
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c29519a.m37467e(TAG2, "IOException: " + e.getMessage());
                return null;
            } catch (Exception e2) {
                C29518o.C29519a c29519a2 = C29518o.Companion;
                String TAG3 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
                c29519a2.m37467e(TAG3, "cannot read string " + e2.getMessage());
                return null;
            }
        }
        return null;
    }

    @VisibleForTesting
    public final void setObjectInputStreamProvider(@NotNull InterfaceC29513a interfaceC29513a) {
        Intrinsics.checkNotNullParameter(interfaceC29513a, "<set-?>");
        objectInputStreamProvider = interfaceC29513a;
    }

    public final long size(@Nullable File file) {
        boolean z;
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (File file2 : listFiles) {
                        j += size(file2);
                    }
                }
            }
            return j;
        }
        return file.length();
    }

    public final void writeString(@NotNull File file, @Nullable String str) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (str != null) {
            try {
                C44980k.m1182k(file, str, Charsets.UTF_8);
            } catch (IOException e) {
                C29518o.C29519a c29519a = C29518o.Companion;
                String TAG2 = TAG;
                Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
                c29519a.m37467e(TAG2, String.valueOf(e.getMessage()));
            }
        }
    }

    private final void printDirectoryTree(File file, int i, StringBuilder sb2) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            sb2.append(getIndentString(i));
            sb2.append("+--");
            sb2.append(file.getName());
            sb2.append("/\n");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    printDirectoryTree(file2, i + 1, sb2);
                } else {
                    Intrinsics.checkNotNullExpressionValue(file2, "file");
                    printFile(file2, i + 1, sb2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("folder is not a Directory".toString());
    }

    @VisibleForTesting
    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }
}
