package com.maticoo.sdk.videocache.file;

import java.io.File;

/* loaded from: classes6.dex */
public class TotalSizeLruDiskUsage extends LruDiskUsage {
    private final long maxSize;

    public TotalSizeLruDiskUsage(long j) {
        if (j > 0) {
            this.maxSize = j;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    @Override // com.maticoo.sdk.videocache.file.LruDiskUsage
    protected boolean accept(File file, long j, int i) {
        if (j <= this.maxSize) {
            return true;
        }
        return false;
    }
}
