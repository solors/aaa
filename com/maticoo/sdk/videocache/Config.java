package com.maticoo.sdk.videocache;

import com.maticoo.sdk.videocache.file.DiskUsage;
import com.maticoo.sdk.videocache.file.FileNameGenerator;
import com.maticoo.sdk.videocache.headers.HeaderInjector;
import com.maticoo.sdk.videocache.sourcestorage.SourceInfoStorage;
import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class Config {
    public final File cacheRoot;
    public final DiskUsage diskUsage;
    public final FileNameGenerator fileNameGenerator;
    public final HeaderInjector headerInjector;
    public final SourceInfoStorage sourceInfoStorage;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Config(File file, FileNameGenerator fileNameGenerator, DiskUsage diskUsage, SourceInfoStorage sourceInfoStorage, HeaderInjector headerInjector) {
        this.cacheRoot = file;
        this.fileNameGenerator = fileNameGenerator;
        this.diskUsage = diskUsage;
        this.sourceInfoStorage = sourceInfoStorage;
        this.headerInjector = headerInjector;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public File generateCacheFile(String str) {
        return new File(this.cacheRoot, this.fileNameGenerator.generate(str));
    }
}
