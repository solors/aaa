package com.taurusx.tax.p597g.p599b.p600r;

import com.taurusx.tax.p597g.p598a.C28392b;
import com.taurusx.tax.p597g.p598a.C28393c;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Comparator;
import java.util.Date;

/* renamed from: com.taurusx.tax.g.b.r.c */
/* loaded from: classes7.dex */
public class C28418c {

    /* renamed from: a */
    public static final C28392b f73843a = C28393c.m38142a("Files");

    /* renamed from: com.taurusx.tax.g.b.r.c$a */
    /* loaded from: classes7.dex */
    public static final class C28419a implements Comparator<File> {
        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            int i = (file.lastModified() > file2.lastModified() ? 1 : (file.lastModified() == file2.lastModified() ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }
    }

    /* renamed from: a */
    public static void m38103a(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " is not directory!");
            }
        } else if (file.mkdirs()) {
        } else {
            throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
        }
    }

    /* renamed from: b */
    public static void m38102b(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                long length = file.length();
                if (length == 0) {
                    if (!file.delete() || !file.createNewFile()) {
                        throw new IOException("Error recreate zero-size file " + file);
                    }
                } else {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
                    long j = length - 1;
                    randomAccessFile.seek(j);
                    byte readByte = randomAccessFile.readByte();
                    randomAccessFile.seek(j);
                    randomAccessFile.write(readByte);
                    randomAccessFile.close();
                }
                if (file.lastModified() < currentTimeMillis) {
                    C28392b c28392b = f73843a;
                    Date date = new Date(file.lastModified());
                    String absolutePath = file.getAbsolutePath();
                    c28392b.getClass();
                    c28392b.m38147a(5, "Last modified date {} is not set for file {}", date, absolutePath);
                }
            }
        }
    }
}
