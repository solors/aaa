package com.maticoo.sdk.videocache;

import java.io.ByteArrayInputStream;

/* loaded from: classes6.dex */
public class ByteArraySource implements Source {
    private ByteArrayInputStream arrayInputStream;
    private final byte[] data;

    public ByteArraySource(byte[] bArr) {
        this.data = bArr;
    }

    @Override // com.maticoo.sdk.videocache.Source
    public long length() throws ProxyCacheException {
        return this.data.length;
    }

    @Override // com.maticoo.sdk.videocache.Source
    public void open(long j) throws ProxyCacheException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.data);
        this.arrayInputStream = byteArrayInputStream;
        byteArrayInputStream.skip(j);
    }

    @Override // com.maticoo.sdk.videocache.Source
    public int read(byte[] bArr) throws ProxyCacheException {
        return this.arrayInputStream.read(bArr, 0, bArr.length);
    }

    @Override // com.maticoo.sdk.videocache.Source
    public void close() throws ProxyCacheException {
    }
}
