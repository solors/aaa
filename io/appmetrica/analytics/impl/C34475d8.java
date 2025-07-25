package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d8 */
/* loaded from: classes9.dex */
public final class C34475d8 extends MessageNano {

    /* renamed from: e */
    public static volatile C34475d8[] f94149e;

    /* renamed from: a */
    public C34718m8 f94150a;

    /* renamed from: b */
    public C34772o8 f94151b;

    /* renamed from: c */
    public C34529f8 f94152c;

    /* renamed from: d */
    public C34691l8 f94153d;

    public C34475d8() {
        m21837a();
    }

    /* renamed from: b */
    public static C34475d8[] m21834b() {
        if (f94149e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94149e == null) {
                    f94149e = new C34475d8[0];
                }
            }
        }
        return f94149e;
    }

    /* renamed from: a */
    public final C34475d8 m21837a() {
        this.f94150a = null;
        this.f94151b = null;
        this.f94152c = null;
        this.f94153d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34718m8 c34718m8 = this.f94150a;
        if (c34718m8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34718m8);
        }
        C34772o8 c34772o8 = this.f94151b;
        if (c34772o8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34772o8);
        }
        C34529f8 c34529f8 = this.f94152c;
        if (c34529f8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c34529f8);
        }
        C34691l8 c34691l8 = this.f94153d;
        if (c34691l8 != null) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c34691l8);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34718m8 c34718m8 = this.f94150a;
        if (c34718m8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34718m8);
        }
        C34772o8 c34772o8 = this.f94151b;
        if (c34772o8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34772o8);
        }
        C34529f8 c34529f8 = this.f94152c;
        if (c34529f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c34529f8);
        }
        C34691l8 c34691l8 = this.f94153d;
        if (c34691l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c34691l8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34475d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f94150a == null) {
                    this.f94150a = new C34718m8();
                }
                codedInputByteBufferNano.readMessage(this.f94150a);
            } else if (readTag == 18) {
                if (this.f94151b == null) {
                    this.f94151b = new C34772o8();
                }
                codedInputByteBufferNano.readMessage(this.f94151b);
            } else if (readTag == 26) {
                if (this.f94152c == null) {
                    this.f94152c = new C34529f8();
                }
                codedInputByteBufferNano.readMessage(this.f94152c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f94153d == null) {
                    this.f94153d = new C34691l8();
                }
                codedInputByteBufferNano.readMessage(this.f94153d);
            }
        }
    }

    /* renamed from: b */
    public static C34475d8 m21833b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34475d8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34475d8 m21835a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34475d8) MessageNano.mergeFrom(new C34475d8(), bArr);
    }
}
