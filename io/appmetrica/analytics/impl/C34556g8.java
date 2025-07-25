package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.g8 */
/* loaded from: classes9.dex */
public final class C34556g8 extends MessageNano {

    /* renamed from: f */
    public static volatile C34556g8[] f94439f;

    /* renamed from: a */
    public byte[] f94440a;

    /* renamed from: b */
    public byte[] f94441b;

    /* renamed from: c */
    public C34664k8 f94442c;

    /* renamed from: d */
    public C34583h8[] f94443d;

    /* renamed from: e */
    public int f94444e;

    public C34556g8() {
        m21672a();
    }

    /* renamed from: b */
    public static C34556g8[] m21669b() {
        if (f94439f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94439f == null) {
                    f94439f = new C34556g8[0];
                }
            }
        }
        return f94439f;
    }

    /* renamed from: a */
    public final C34556g8 m21672a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94440a = bArr;
        this.f94441b = bArr;
        this.f94442c = null;
        this.f94443d = C34583h8.m21596b();
        this.f94444e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f94440a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94440a);
        }
        if (!Arrays.equals(this.f94441b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f94441b);
        }
        C34664k8 c34664k8 = this.f94442c;
        if (c34664k8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c34664k8);
        }
        C34583h8[] c34583h8Arr = this.f94443d;
        if (c34583h8Arr != null && c34583h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34583h8[] c34583h8Arr2 = this.f94443d;
                if (i >= c34583h8Arr2.length) {
                    break;
                }
                C34583h8 c34583h8 = c34583h8Arr2[i];
                if (c34583h8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c34583h8);
                }
                i++;
            }
        }
        int i2 = this.f94444e;
        if (i2 != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f94440a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94440a);
        }
        if (!Arrays.equals(this.f94441b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f94441b);
        }
        C34664k8 c34664k8 = this.f94442c;
        if (c34664k8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c34664k8);
        }
        C34583h8[] c34583h8Arr = this.f94443d;
        if (c34583h8Arr != null && c34583h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34583h8[] c34583h8Arr2 = this.f94443d;
                if (i >= c34583h8Arr2.length) {
                    break;
                }
                C34583h8 c34583h8 = c34583h8Arr2[i];
                if (c34583h8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c34583h8);
                }
                i++;
            }
        }
        int i2 = this.f94444e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34556g8 m21668b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34556g8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34556g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94440a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f94441b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f94442c == null) {
                    this.f94442c = new C34664k8();
                }
                codedInputByteBufferNano.readMessage(this.f94442c);
            } else if (readTag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C34583h8[] c34583h8Arr = this.f94443d;
                int length = c34583h8Arr == null ? 0 : c34583h8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34583h8[] c34583h8Arr2 = new C34583h8[i];
                if (length != 0) {
                    System.arraycopy(c34583h8Arr, 0, c34583h8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34583h8 c34583h8 = new C34583h8();
                    c34583h8Arr2[length] = c34583h8;
                    codedInputByteBufferNano.readMessage(c34583h8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34583h8 c34583h82 = new C34583h8();
                c34583h8Arr2[length] = c34583h82;
                codedInputByteBufferNano.readMessage(c34583h82);
                this.f94443d = c34583h8Arr2;
            } else if (readTag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94444e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: a */
    public static C34556g8 m21670a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34556g8) MessageNano.mergeFrom(new C34556g8(), bArr);
    }
}
