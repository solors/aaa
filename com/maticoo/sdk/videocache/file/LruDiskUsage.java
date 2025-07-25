package com.maticoo.sdk.videocache.file;

import com.maticoo.sdk.videocache.ILog;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public abstract class LruDiskUsage implements DiskUsage {
    private static final String TAG = "LruDiskUsage";
    private final ExecutorService workerThread = Executors.newSingleThreadExecutor();

    /* loaded from: classes6.dex */
    private class TouchCallable implements Callable<Void> {
        private final File file;

        public TouchCallable(File file) {
            this.file = file;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            LruDiskUsage.this.touchInBackground(this.file);
            return null;
        }
    }

    private long countTotalSize(List<File> list) {
        long j = 0;
        for (File file : list) {
            j += file.length();
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void touchInBackground(File file) throws IOException {
        Files.setLastModifiedNow(file);
        List<File> lruListFiles = Files.getLruListFiles(file.getParentFile());
        ILog.m53548e(TAG, "touchInBackground: files " + lruListFiles.size());
        trim(lruListFiles);
    }

    private void trim(List<File> list) {
        long countTotalSize = countTotalSize(list);
        int size = list.size();
        for (File file : list) {
            if (!accept(file, countTotalSize, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    countTotalSize -= length;
                    ILog.m53547i("Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    ILog.m53550e("Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }

    protected abstract boolean accept(File file, long j, int i);

    @Override // com.maticoo.sdk.videocache.file.DiskUsage
    public void touch(File file) throws IOException {
        this.workerThread.submit(new TouchCallable(file));
    }
}
