package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v2 */
/* loaded from: classes9.dex */
public final class C34950v2 extends MessageNano {

    /* renamed from: c */
    public static final int f95493c = 1;

    /* renamed from: d */
    public static final int f95494d = 2;

    /* renamed from: e */
    public static final int f95495e = 3;

    /* renamed from: f */
    public static volatile C34950v2[] f95496f;

    /* renamed from: a */
    public C34924u2[] f95497a;

    /* renamed from: b */
    public boolean f95498b;

    public C34950v2() {
        m20894a();
    }

    /* renamed from: b */
    public static C34950v2[] m20891b() {
        if (f95496f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95496f == null) {
                    f95496f = new C34950v2[0];
                }
            }
        }
        return f95496f;
    }

    /* renamed from: a */
    public final C34950v2 m20894a() {
        this.f95497a = C34924u2.m20923b();
        this.f95498b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34924u2[] c34924u2Arr = this.f95497a;
        if (c34924u2Arr != null && c34924u2Arr.length > 0) {
            int i = 0;
            while (true) {
                C34924u2[] c34924u2Arr2 = this.f95497a;
                if (i >= c34924u2Arr2.length) {
                    break;
                }
                C34924u2 c34924u2 = c34924u2Arr2[i];
                if (c34924u2 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34924u2);
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f95498b) + computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34924u2[] c34924u2Arr = this.f95497a;
        if (c34924u2Arr != null && c34924u2Arr.length > 0) {
            int i = 0;
            while (true) {
                C34924u2[] c34924u2Arr2 = this.f95497a;
                if (i >= c34924u2Arr2.length) {
                    break;
                }
                C34924u2 c34924u2 = c34924u2Arr2[i];
                if (c34924u2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34924u2);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f95498b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34950v2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C34924u2[] c34924u2Arr = this.f95497a;
                int length = c34924u2Arr == null ? 0 : c34924u2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34924u2[] c34924u2Arr2 = new C34924u2[i];
                if (length != 0) {
                    System.arraycopy(c34924u2Arr, 0, c34924u2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34924u2 c34924u2 = new C34924u2();
                    c34924u2Arr2[length] = c34924u2;
                    codedInputByteBufferNano.readMessage(c34924u2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34924u2 c34924u22 = new C34924u2();
                c34924u2Arr2[length] = c34924u22;
                codedInputByteBufferNano.readMessage(c34924u22);
                this.f95497a = c34924u2Arr2;
            } else if (readTag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f95498b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C34950v2 m20890b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34950v2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34950v2 m20892a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34950v2) MessageNano.mergeFrom(new C34950v2(), bArr);
    }
}
