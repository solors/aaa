package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.hn */
/* loaded from: classes9.dex */
public final class C34598hn extends MessageNano {

    /* renamed from: b */
    public static volatile C34598hn[] f94584b;

    /* renamed from: a */
    public C34517en[] f94585a;

    public C34598hn() {
        m21566a();
    }

    /* renamed from: b */
    public static C34598hn[] m21563b() {
        if (f94584b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94584b == null) {
                    f94584b = new C34598hn[0];
                }
            }
        }
        return f94584b;
    }

    /* renamed from: a */
    public final C34598hn m21566a() {
        this.f94585a = C34517en.m21768b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34517en[] c34517enArr = this.f94585a;
        if (c34517enArr != null && c34517enArr.length > 0) {
            int i = 0;
            while (true) {
                C34517en[] c34517enArr2 = this.f94585a;
                if (i >= c34517enArr2.length) {
                    break;
                }
                C34517en c34517en = c34517enArr2[i];
                if (c34517en != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34517en);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34517en[] c34517enArr = this.f94585a;
        if (c34517enArr != null && c34517enArr.length > 0) {
            int i = 0;
            while (true) {
                C34517en[] c34517enArr2 = this.f94585a;
                if (i >= c34517enArr2.length) {
                    break;
                }
                C34517en c34517en = c34517enArr2[i];
                if (c34517en != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34517en);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34598hn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C34517en[] c34517enArr = this.f94585a;
                int length = c34517enArr == null ? 0 : c34517enArr.length;
                int i = repeatedFieldArrayLength + length;
                C34517en[] c34517enArr2 = new C34517en[i];
                if (length != 0) {
                    System.arraycopy(c34517enArr, 0, c34517enArr2, 0, length);
                }
                while (length < i - 1) {
                    C34517en c34517en = new C34517en();
                    c34517enArr2[length] = c34517en;
                    codedInputByteBufferNano.readMessage(c34517en);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34517en c34517en2 = new C34517en();
                c34517enArr2[length] = c34517en2;
                codedInputByteBufferNano.readMessage(c34517en2);
                this.f94585a = c34517enArr2;
            }
        }
    }

    /* renamed from: b */
    public static C34598hn m21562b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34598hn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34598hn m21564a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34598hn) MessageNano.mergeFrom(new C34598hn(), bArr);
    }
}
