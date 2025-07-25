package com.bykv.p135vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.bykv.vk.openvk.preload.geckox.buffer.stream.b */
/* loaded from: classes3.dex */
public abstract class RandomOutputStream extends OutputStream {
    public abstract void write(long j, int i) throws IOException;

    public abstract void write(long j, byte[] bArr) throws IOException;

    public abstract void write(long j, byte[] bArr, int i, int i2) throws IOException;
}
