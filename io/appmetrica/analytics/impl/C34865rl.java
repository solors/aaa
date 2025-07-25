package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rl */
/* loaded from: classes9.dex */
public final class C34865rl extends MessageNano {

    /* renamed from: b */
    public static volatile C34865rl[] f95304b;

    /* renamed from: a */
    public C34839ql[] f95305a;

    public C34865rl() {
        m21003a();
    }

    /* renamed from: b */
    public static C34865rl[] m21000b() {
        if (f95304b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95304b == null) {
                    f95304b = new C34865rl[0];
                }
            }
        }
        return f95304b;
    }

    /* renamed from: a */
    public final C34865rl m21003a() {
        this.f95305a = C34839ql.m21068b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34839ql[] c34839qlArr = this.f95305a;
        if (c34839qlArr != null && c34839qlArr.length > 0) {
            int i = 0;
            while (true) {
                C34839ql[] c34839qlArr2 = this.f95305a;
                if (i >= c34839qlArr2.length) {
                    break;
                }
                C34839ql c34839ql = c34839qlArr2[i];
                if (c34839ql != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34839ql);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34839ql[] c34839qlArr = this.f95305a;
        if (c34839qlArr != null && c34839qlArr.length > 0) {
            int i = 0;
            while (true) {
                C34839ql[] c34839qlArr2 = this.f95305a;
                if (i >= c34839qlArr2.length) {
                    break;
                }
                C34839ql c34839ql = c34839qlArr2[i];
                if (c34839ql != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34839ql);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34865rl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C34839ql[] c34839qlArr = this.f95305a;
                int length = c34839qlArr == null ? 0 : c34839qlArr.length;
                int i = repeatedFieldArrayLength + length;
                C34839ql[] c34839qlArr2 = new C34839ql[i];
                if (length != 0) {
                    System.arraycopy(c34839qlArr, 0, c34839qlArr2, 0, length);
                }
                while (length < i - 1) {
                    C34839ql c34839ql = new C34839ql();
                    c34839qlArr2[length] = c34839ql;
                    codedInputByteBufferNano.readMessage(c34839ql);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34839ql c34839ql2 = new C34839ql();
                c34839qlArr2[length] = c34839ql2;
                codedInputByteBufferNano.readMessage(c34839ql2);
                this.f95305a = c34839qlArr2;
            }
        }
    }

    /* renamed from: b */
    public static C34865rl m20999b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34865rl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34865rl m21001a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34865rl) MessageNano.mergeFrom(new C34865rl(), bArr);
    }
}
