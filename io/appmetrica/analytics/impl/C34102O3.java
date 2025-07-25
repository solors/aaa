package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.O3 */
/* loaded from: classes9.dex */
public final class C34102O3 extends MessageNano {

    /* renamed from: b */
    public static volatile C34102O3[] f93292b;

    /* renamed from: a */
    public C34078N3[] f93293a;

    public C34102O3() {
        m22387a();
    }

    /* renamed from: b */
    public static C34102O3[] m22384b() {
        if (f93292b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93292b == null) {
                    f93292b = new C34102O3[0];
                }
            }
        }
        return f93292b;
    }

    /* renamed from: a */
    public final C34102O3 m22387a() {
        this.f93293a = C34078N3.m22405b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34078N3[] c34078n3Arr = this.f93293a;
        if (c34078n3Arr != null && c34078n3Arr.length > 0) {
            int i = 0;
            while (true) {
                C34078N3[] c34078n3Arr2 = this.f93293a;
                if (i >= c34078n3Arr2.length) {
                    break;
                }
                C34078N3 c34078n3 = c34078n3Arr2[i];
                if (c34078n3 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34078n3);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34078N3[] c34078n3Arr = this.f93293a;
        if (c34078n3Arr != null && c34078n3Arr.length > 0) {
            int i = 0;
            while (true) {
                C34078N3[] c34078n3Arr2 = this.f93293a;
                if (i >= c34078n3Arr2.length) {
                    break;
                }
                C34078N3 c34078n3 = c34078n3Arr2[i];
                if (c34078n3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34078n3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34102O3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C34078N3[] c34078n3Arr = this.f93293a;
                int length = c34078n3Arr == null ? 0 : c34078n3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34078N3[] c34078n3Arr2 = new C34078N3[i];
                if (length != 0) {
                    System.arraycopy(c34078n3Arr, 0, c34078n3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34078N3 c34078n3 = new C34078N3();
                    c34078n3Arr2[length] = c34078n3;
                    codedInputByteBufferNano.readMessage(c34078n3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34078N3 c34078n32 = new C34078N3();
                c34078n3Arr2[length] = c34078n32;
                codedInputByteBufferNano.readMessage(c34078n32);
                this.f93293a = c34078n3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C34102O3 m22383b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34102O3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34102O3 m22385a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34102O3) MessageNano.mergeFrom(new C34102O3(), bArr);
    }
}
