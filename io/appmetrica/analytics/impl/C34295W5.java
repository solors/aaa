package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.W5 */
/* loaded from: classes9.dex */
public final class C34295W5 extends MessageNano {

    /* renamed from: d */
    public static volatile C34295W5[] f93634d;

    /* renamed from: a */
    public C34527f6 f93635a;

    /* renamed from: b */
    public C34527f6[] f93636b;

    /* renamed from: c */
    public String f93637c;

    public C34295W5() {
        m22142a();
    }

    /* renamed from: b */
    public static C34295W5[] m22139b() {
        if (f93634d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93634d == null) {
                    f93634d = new C34295W5[0];
                }
            }
        }
        return f93634d;
    }

    /* renamed from: a */
    public final C34295W5 m22142a() {
        this.f93635a = null;
        this.f93636b = C34527f6.m21755b();
        this.f93637c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34527f6 c34527f6 = this.f93635a;
        if (c34527f6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34527f6);
        }
        C34527f6[] c34527f6Arr = this.f93636b;
        if (c34527f6Arr != null && c34527f6Arr.length > 0) {
            int i = 0;
            while (true) {
                C34527f6[] c34527f6Arr2 = this.f93636b;
                if (i >= c34527f6Arr2.length) {
                    break;
                }
                C34527f6 c34527f62 = c34527f6Arr2[i];
                if (c34527f62 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34527f62);
                }
                i++;
            }
        }
        if (!this.f93637c.equals("")) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f93637c);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34527f6 c34527f6 = this.f93635a;
        if (c34527f6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34527f6);
        }
        C34527f6[] c34527f6Arr = this.f93636b;
        if (c34527f6Arr != null && c34527f6Arr.length > 0) {
            int i = 0;
            while (true) {
                C34527f6[] c34527f6Arr2 = this.f93636b;
                if (i >= c34527f6Arr2.length) {
                    break;
                }
                C34527f6 c34527f62 = c34527f6Arr2[i];
                if (c34527f62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c34527f62);
                }
                i++;
            }
        }
        if (!this.f93637c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f93637c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34295W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f93635a == null) {
                    this.f93635a = new C34527f6();
                }
                codedInputByteBufferNano.readMessage(this.f93635a);
            } else if (readTag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C34527f6[] c34527f6Arr = this.f93636b;
                int length = c34527f6Arr == null ? 0 : c34527f6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34527f6[] c34527f6Arr2 = new C34527f6[i];
                if (length != 0) {
                    System.arraycopy(c34527f6Arr, 0, c34527f6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34527f6 c34527f6 = new C34527f6();
                    c34527f6Arr2[length] = c34527f6;
                    codedInputByteBufferNano.readMessage(c34527f6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34527f6 c34527f62 = new C34527f6();
                c34527f6Arr2[length] = c34527f62;
                codedInputByteBufferNano.readMessage(c34527f62);
                this.f93636b = c34527f6Arr2;
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93637c = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C34295W5 m22138b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34295W5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34295W5 m22140a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34295W5) MessageNano.mergeFrom(new C34295W5(), bArr);
    }
}
