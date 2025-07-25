package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.p726io.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;

/* renamed from: io.appmetrica.analytics.impl.W9 */
/* loaded from: classes9.dex */
public final class C34299W9 {

    /* renamed from: a */
    public final File f93641a;

    /* renamed from: b */
    public FileLock f93642b;

    /* renamed from: c */
    public RandomAccessFile f93643c;

    /* renamed from: d */
    public FileChannel f93644d;

    /* renamed from: e */
    public int f93645e;

    public C34299W9(Context context, String str) {
        this(m22132a(context, str));
    }

    /* renamed from: a */
    public final synchronized void m22133a() {
        RandomAccessFile randomAccessFile = new RandomAccessFile(this.f93641a, "rw");
        this.f93643c = randomAccessFile;
        FileChannel channel = randomAccessFile.getChannel();
        this.f93644d = channel;
        if (this.f93645e == 0) {
            this.f93642b = channel.lock();
        }
        this.f93645e++;
    }

    /* renamed from: b */
    public final synchronized void m22131b() {
        this.f93641a.getAbsolutePath();
        int i = this.f93645e - 1;
        this.f93645e = i;
        if (i == 0) {
            AbstractC33941Ha.m22567a(this.f93642b);
        }
        AbstractC34679kn.m21473a((Closeable) this.f93643c);
        AbstractC34679kn.m21473a((Closeable) this.f93644d);
        this.f93643c = null;
        this.f93642b = null;
        this.f93644d = null;
    }

    public C34299W9(String str) {
        this(FileUtils.getFileFromPath(str + ".lock"));
    }

    public C34299W9(File file) {
        this.f93645e = 0;
        this.f93641a = file;
    }

    /* renamed from: a */
    public static File m22132a(Context context, String str) {
        File fileFromSdkStorage = FileUtils.getFileFromSdkStorage(context, str + ".lock");
        if (fileFromSdkStorage != null) {
            return fileFromSdkStorage;
        }
        throw new IllegalStateException("Cannot create lock file");
    }
}
