package com.maticoo.sdk.videocache.file;

import com.maticoo.sdk.videocache.ILog;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes6.dex */
class Files {

    /* loaded from: classes6.dex */
    private static final class LastModifiedComparator implements Comparator<File> {
        private LastModifiedComparator() {
        }

        private int compareLong(long j, long j2) {
            int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i == 0) {
                return 0;
            }
            return 1;
        }

        @Override // java.util.Comparator
        public int compare(File file, File file2) {
            return compareLong(file.lastModified(), file2.lastModified());
        }
    }

    Files() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<File> getLruListFiles(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            List<File> asList = Arrays.asList(listFiles);
            Collections.sort(asList, new LastModifiedComparator());
            return asList;
        }
        return linkedList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void makeDir(File file) throws IOException {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " is not directory!");
            }
        } else if (file.mkdirs()) {
        } else {
            throw new IOException(String.format("Directory %s can't be created", file.getAbsolutePath()));
        }
    }

    static void modify(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            recreateZeroSizeFile(file);
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
        long j = length - 1;
        randomAccessFile.seek(j);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(j);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    private static void recreateZeroSizeFile(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
            return;
        }
        throw new IOException("Error recreate zero-size file " + file);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setLastModifiedNow(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                modify(file);
                if (file.lastModified() < currentTimeMillis) {
                    ILog.m53544w("Last modified date " + new Date(file.lastModified()) + " is not set for file " + file.getAbsolutePath());
                }
            }
        }
    }
}
