package com.pgl.ssdk;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/* renamed from: com.pgl.ssdk.p */
/* loaded from: classes7.dex */
public abstract class AbstractC26653p {
    /* renamed from: a */
    public static InterfaceC26651o m40799a(RandomAccessFile randomAccessFile, long j, long j2) {
        return m40798a(randomAccessFile.getChannel(), j, j2);
    }

    /* renamed from: a */
    public static InterfaceC26651o m40798a(FileChannel fileChannel, long j, long j2) {
        fileChannel.getClass();
        return new C26644l(fileChannel, j, j2);
    }
}
