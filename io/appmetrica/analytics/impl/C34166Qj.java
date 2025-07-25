package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Qj */
/* loaded from: classes9.dex */
public final class C34166Qj extends MessageNano {

    /* renamed from: b */
    public static volatile C34166Qj[] f93414b;

    /* renamed from: a */
    public C34189Rj[] f93415a;

    public C34166Qj() {
        m22332a();
    }

    /* renamed from: b */
    public static C34166Qj[] m22329b() {
        if (f93414b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93414b == null) {
                    f93414b = new C34166Qj[0];
                }
            }
        }
        return f93414b;
    }

    /* renamed from: a */
    public final C34166Qj m22332a() {
        this.f93415a = C34189Rj.m22308b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34189Rj[] c34189RjArr = this.f93415a;
        if (c34189RjArr != null && c34189RjArr.length > 0) {
            int i = 0;
            while (true) {
                C34189Rj[] c34189RjArr2 = this.f93415a;
                if (i >= c34189RjArr2.length) {
                    break;
                }
                C34189Rj c34189Rj = c34189RjArr2[i];
                if (c34189Rj != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34189Rj);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34189Rj[] c34189RjArr = this.f93415a;
        if (c34189RjArr != null && c34189RjArr.length > 0) {
            int i = 0;
            while (true) {
                C34189Rj[] c34189RjArr2 = this.f93415a;
                if (i >= c34189RjArr2.length) {
                    break;
                }
                C34189Rj c34189Rj = c34189RjArr2[i];
                if (c34189Rj != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34189Rj);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34166Qj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C34189Rj[] c34189RjArr = this.f93415a;
                int length = c34189RjArr == null ? 0 : c34189RjArr.length;
                int i = repeatedFieldArrayLength + length;
                C34189Rj[] c34189RjArr2 = new C34189Rj[i];
                if (length != 0) {
                    System.arraycopy(c34189RjArr, 0, c34189RjArr2, 0, length);
                }
                while (length < i - 1) {
                    C34189Rj c34189Rj = new C34189Rj();
                    c34189RjArr2[length] = c34189Rj;
                    codedInputByteBufferNano.readMessage(c34189Rj);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34189Rj c34189Rj2 = new C34189Rj();
                c34189RjArr2[length] = c34189Rj2;
                codedInputByteBufferNano.readMessage(c34189Rj2);
                this.f93415a = c34189RjArr2;
            }
        }
    }

    /* renamed from: b */
    public static C34166Qj m22328b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34166Qj().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34166Qj m22330a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34166Qj) MessageNano.mergeFrom(new C34166Qj(), bArr);
    }
}
