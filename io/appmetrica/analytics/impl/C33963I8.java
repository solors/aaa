package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.I8 */
/* loaded from: classes9.dex */
public final class C33963I8 extends MessageNano {

    /* renamed from: b */
    public static volatile C33963I8[] f93018b;

    /* renamed from: a */
    public C33939H8[] f93019a;

    public C33963I8() {
        m22552a();
    }

    /* renamed from: b */
    public static C33963I8[] m22549b() {
        if (f93018b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93018b == null) {
                    f93018b = new C33963I8[0];
                }
            }
        }
        return f93018b;
    }

    /* renamed from: a */
    public final C33963I8 m22552a() {
        this.f93019a = C33939H8.m22571b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C33939H8[] c33939h8Arr = this.f93019a;
        if (c33939h8Arr != null && c33939h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C33939H8[] c33939h8Arr2 = this.f93019a;
                if (i >= c33939h8Arr2.length) {
                    break;
                }
                C33939H8 c33939h8 = c33939h8Arr2[i];
                if (c33939h8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c33939h8);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C33939H8[] c33939h8Arr = this.f93019a;
        if (c33939h8Arr != null && c33939h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C33939H8[] c33939h8Arr2 = this.f93019a;
                if (i >= c33939h8Arr2.length) {
                    break;
                }
                C33939H8 c33939h8 = c33939h8Arr2[i];
                if (c33939h8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c33939h8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33963I8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C33939H8[] c33939h8Arr = this.f93019a;
                int length = c33939h8Arr == null ? 0 : c33939h8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C33939H8[] c33939h8Arr2 = new C33939H8[i];
                if (length != 0) {
                    System.arraycopy(c33939h8Arr, 0, c33939h8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C33939H8 c33939h8 = new C33939H8();
                    c33939h8Arr2[length] = c33939h8;
                    codedInputByteBufferNano.readMessage(c33939h8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C33939H8 c33939h82 = new C33939H8();
                c33939h8Arr2[length] = c33939h82;
                codedInputByteBufferNano.readMessage(c33939h82);
                this.f93019a = c33939h8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C33963I8 m22548b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33963I8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C33963I8 m22550a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33963I8) MessageNano.mergeFrom(new C33963I8(), bArr);
    }
}
