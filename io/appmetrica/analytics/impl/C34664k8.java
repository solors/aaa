package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8 */
/* loaded from: classes9.dex */
public final class C34664k8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34664k8[] f94776c;

    /* renamed from: a */
    public C34637j8[] f94777a;

    /* renamed from: b */
    public int f94778b;

    public C34664k8() {
        m21491a();
    }

    /* renamed from: b */
    public static C34664k8[] m21488b() {
        if (f94776c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94776c == null) {
                    f94776c = new C34664k8[0];
                }
            }
        }
        return f94776c;
    }

    /* renamed from: a */
    public final C34664k8 m21491a() {
        this.f94777a = C34637j8.m21521b();
        this.f94778b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34637j8[] c34637j8Arr = this.f94777a;
        if (c34637j8Arr != null && c34637j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34637j8[] c34637j8Arr2 = this.f94777a;
                if (i >= c34637j8Arr2.length) {
                    break;
                }
                C34637j8 c34637j8 = c34637j8Arr2[i];
                if (c34637j8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34637j8);
                }
                i++;
            }
        }
        int i2 = this.f94778b;
        if (i2 != 0) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34637j8[] c34637j8Arr = this.f94777a;
        if (c34637j8Arr != null && c34637j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34637j8[] c34637j8Arr2 = this.f94777a;
                if (i >= c34637j8Arr2.length) {
                    break;
                }
                C34637j8 c34637j8 = c34637j8Arr2[i];
                if (c34637j8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34637j8);
                }
                i++;
            }
        }
        int i2 = this.f94778b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34664k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C34637j8[] c34637j8Arr = this.f94777a;
                int length = c34637j8Arr == null ? 0 : c34637j8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34637j8[] c34637j8Arr2 = new C34637j8[i];
                if (length != 0) {
                    System.arraycopy(c34637j8Arr, 0, c34637j8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34637j8 c34637j8 = new C34637j8();
                    c34637j8Arr2[length] = c34637j8;
                    codedInputByteBufferNano.readMessage(c34637j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34637j8 c34637j82 = new C34637j8();
                c34637j8Arr2[length] = c34637j82;
                codedInputByteBufferNano.readMessage(c34637j82);
                this.f94777a = c34637j8Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f94778b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: b */
    public static C34664k8 m21487b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34664k8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34664k8 m21489a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34664k8) MessageNano.mergeFrom(new C34664k8(), bArr);
    }
}
