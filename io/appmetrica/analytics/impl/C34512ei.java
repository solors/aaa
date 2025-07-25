package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ei */
/* loaded from: classes9.dex */
public final class C34512ei extends MessageNano {

    /* renamed from: l */
    public static final int f94263l = 0;

    /* renamed from: m */
    public static final int f94264m = 1;

    /* renamed from: n */
    public static final int f94265n = 2;

    /* renamed from: o */
    public static final int f94266o = 1;

    /* renamed from: p */
    public static final int f94267p = 2;

    /* renamed from: q */
    public static volatile C34512ei[] f94268q;

    /* renamed from: a */
    public int f94269a;

    /* renamed from: b */
    public byte[] f94270b;

    /* renamed from: c */
    public byte[] f94271c;

    /* renamed from: d */
    public byte[] f94272d;

    /* renamed from: e */
    public C34379Zh f94273e;

    /* renamed from: f */
    public long f94274f;

    /* renamed from: g */
    public boolean f94275g;

    /* renamed from: h */
    public int f94276h;

    /* renamed from: i */
    public int f94277i;

    /* renamed from: j */
    public C34485di f94278j;

    /* renamed from: k */
    public C34458ci f94279k;

    public C34512ei() {
        m21780a();
    }

    /* renamed from: b */
    public static C34512ei[] m21777b() {
        if (f94268q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94268q == null) {
                    f94268q = new C34512ei[0];
                }
            }
        }
        return f94268q;
    }

    /* renamed from: a */
    public final C34512ei m21780a() {
        this.f94269a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94270b = bArr;
        this.f94271c = bArr;
        this.f94272d = bArr;
        this.f94273e = null;
        this.f94274f = 0L;
        this.f94275g = false;
        this.f94276h = 0;
        this.f94277i = 1;
        this.f94278j = null;
        this.f94279k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        int i = this.f94269a;
        if (i != 1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int computeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f94270b) + computeSerializedSize;
        byte[] bArr = this.f94271c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f94271c);
        }
        if (!Arrays.equals(this.f94272d, bArr2)) {
            computeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f94272d);
        }
        C34379Zh c34379Zh = this.f94273e;
        if (c34379Zh != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, c34379Zh);
        }
        long j = this.f94274f;
        if (j != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z = this.f94275g;
        if (z) {
            computeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i2 = this.f94276h;
        if (i2 != 0) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f94277i;
        if (i3 != 1) {
            computeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        C34485di c34485di = this.f94278j;
        if (c34485di != null) {
            computeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, c34485di);
        }
        C34458ci c34458ci = this.f94279k;
        if (c34458ci != null) {
            return computeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, c34458ci);
        }
        return computeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f94269a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f94270b);
        byte[] bArr = this.f94271c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f94271c);
        }
        if (!Arrays.equals(this.f94272d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f94272d);
        }
        C34379Zh c34379Zh = this.f94273e;
        if (c34379Zh != null) {
            codedOutputByteBufferNano.writeMessage(6, c34379Zh);
        }
        long j = this.f94274f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z = this.f94275g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i2 = this.f94276h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f94277i;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        C34485di c34485di = this.f94278j;
        if (c34485di != null) {
            codedOutputByteBufferNano.writeMessage(11, c34485di);
        }
        C34458ci c34458ci = this.f94279k;
        if (c34458ci != null) {
            codedOutputByteBufferNano.writeMessage(12, c34458ci);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34512ei m21776b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34512ei().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34512ei mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 8:
                    this.f94269a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f94270b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f94271c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f94272d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f94273e == null) {
                        this.f94273e = new C34379Zh();
                    }
                    codedInputByteBufferNano.readMessage(this.f94273e);
                    break;
                case 56:
                    this.f94274f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f94275g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != 0 && readInt32 != 1 && readInt32 != 2) {
                        break;
                    } else {
                        this.f94276h = readInt32;
                        break;
                    }
                case 80:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 1 && readInt322 != 2) {
                        break;
                    } else {
                        this.f94277i = readInt322;
                        break;
                    }
                case 90:
                    if (this.f94278j == null) {
                        this.f94278j = new C34485di();
                    }
                    codedInputByteBufferNano.readMessage(this.f94278j);
                    break;
                case 98:
                    if (this.f94279k == null) {
                        this.f94279k = new C34458ci();
                    }
                    codedInputByteBufferNano.readMessage(this.f94279k);
                    break;
                default:
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public static C34512ei m21778a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34512ei) MessageNano.mergeFrom(new C34512ei(), bArr);
    }
}
