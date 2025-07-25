package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.l8 */
/* loaded from: classes9.dex */
public final class C34691l8 extends MessageNano {

    /* renamed from: c */
    public static volatile C34691l8[] f94818c;

    /* renamed from: a */
    public C34421b8 f94819a;

    /* renamed from: b */
    public C34421b8[] f94820b;

    public C34691l8() {
        m21459a();
    }

    /* renamed from: b */
    public static C34691l8[] m21456b() {
        if (f94818c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94818c == null) {
                    f94818c = new C34691l8[0];
                }
            }
        }
        return f94818c;
    }

    /* renamed from: a */
    public final C34691l8 m21459a() {
        this.f94819a = null;
        this.f94820b = C34421b8.m21943b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34421b8 c34421b8 = this.f94819a;
        if (c34421b8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34421b8);
        }
        C34421b8[] c34421b8Arr = this.f94820b;
        if (c34421b8Arr != null && c34421b8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34421b8[] c34421b8Arr2 = this.f94820b;
                if (i >= c34421b8Arr2.length) {
                    break;
                }
                C34421b8 c34421b82 = c34421b8Arr2[i];
                if (c34421b82 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34421b82);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34421b8 c34421b8 = this.f94819a;
        if (c34421b8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34421b8);
        }
        C34421b8[] c34421b8Arr = this.f94820b;
        if (c34421b8Arr != null && c34421b8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34421b8[] c34421b8Arr2 = this.f94820b;
                if (i >= c34421b8Arr2.length) {
                    break;
                }
                C34421b8 c34421b82 = c34421b8Arr2[i];
                if (c34421b82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c34421b82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34691l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f94819a == null) {
                    this.f94819a = new C34421b8();
                }
                codedInputByteBufferNano.readMessage(this.f94819a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C34421b8[] c34421b8Arr = this.f94820b;
                int length = c34421b8Arr == null ? 0 : c34421b8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34421b8[] c34421b8Arr2 = new C34421b8[i];
                if (length != 0) {
                    System.arraycopy(c34421b8Arr, 0, c34421b8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34421b8 c34421b8 = new C34421b8();
                    c34421b8Arr2[length] = c34421b8;
                    codedInputByteBufferNano.readMessage(c34421b8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34421b8 c34421b82 = new C34421b8();
                c34421b8Arr2[length] = c34421b82;
                codedInputByteBufferNano.readMessage(c34421b82);
                this.f94820b = c34421b8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C34691l8 m21455b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34691l8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34691l8 m21457a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34691l8) MessageNano.mergeFrom(new C34691l8(), bArr);
    }
}
