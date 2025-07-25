package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* renamed from: com.fyber.inneractive.sdk.protobuf.n */
/* loaded from: classes4.dex */
public final class C15321n extends C15330q {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    public final int f30282e;

    /* renamed from: f */
    public final int f30283f;

    public C15321n(byte[] bArr, int i, int i2) {
        super(bArr);
        AbstractC15336s.m76833a(i, i + i2, bArr.length);
        this.f30282e = i;
        this.f30283f = i2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C15330q, com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: a */
    public final void mo76832a(int i, byte[] bArr) {
        System.arraycopy(this.f30292d, this.f30282e, bArr, 0, i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C15330q, com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: c */
    public final byte mo76828c(int i) {
        int i2 = this.f30283f;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(AbstractC14979m.m77354a("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.f30292d[this.f30282e + i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C15330q, com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: d */
    public final byte mo76826d(int i) {
        return this.f30292d[this.f30282e + i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C15330q
    /* renamed from: g */
    public final int mo76836g() {
        return this.f30282e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C15330q, com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    public final int size() {
        return this.f30283f;
    }

    public Object writeReplace() {
        byte[] bArr;
        int size = size();
        if (size == 0) {
            bArr = AbstractC15319m0.f30281b;
        } else {
            byte[] bArr2 = new byte[size];
            mo76832a(size, bArr2);
            bArr = bArr2;
        }
        return new C15330q(bArr);
    }
}
