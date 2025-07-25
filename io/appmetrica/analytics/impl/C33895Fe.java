package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Fe */
/* loaded from: classes9.dex */
public final class C33895Fe extends MessageNano {

    /* renamed from: c */
    public static final int f92832c = 0;

    /* renamed from: d */
    public static final int f92833d = 1;

    /* renamed from: e */
    public static final int f92834e = 2;

    /* renamed from: f */
    public static final int f92835f = 3;

    /* renamed from: g */
    public static volatile C33895Fe[] f92836g;

    /* renamed from: a */
    public C33845De f92837a;

    /* renamed from: b */
    public C33870Ee[] f92838b;

    public C33895Fe() {
        m22659a();
    }

    /* renamed from: b */
    public static C33895Fe[] m22656b() {
        if (f92836g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f92836g == null) {
                    f92836g = new C33895Fe[0];
                }
            }
        }
        return f92836g;
    }

    /* renamed from: a */
    public final C33895Fe m22659a() {
        this.f92837a = null;
        this.f92838b = C33870Ee.m22671b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C33845De c33845De = this.f92837a;
        if (c33845De != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c33845De);
        }
        C33870Ee[] c33870EeArr = this.f92838b;
        if (c33870EeArr != null && c33870EeArr.length > 0) {
            int i = 0;
            while (true) {
                C33870Ee[] c33870EeArr2 = this.f92838b;
                if (i >= c33870EeArr2.length) {
                    break;
                }
                C33870Ee c33870Ee = c33870EeArr2[i];
                if (c33870Ee != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c33870Ee);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C33845De c33845De = this.f92837a;
        if (c33845De != null) {
            codedOutputByteBufferNano.writeMessage(1, c33845De);
        }
        C33870Ee[] c33870EeArr = this.f92838b;
        if (c33870EeArr != null && c33870EeArr.length > 0) {
            int i = 0;
            while (true) {
                C33870Ee[] c33870EeArr2 = this.f92838b;
                if (i >= c33870EeArr2.length) {
                    break;
                }
                C33870Ee c33870Ee = c33870EeArr2[i];
                if (c33870Ee != null) {
                    codedOutputByteBufferNano.writeMessage(2, c33870Ee);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C33895Fe mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f92837a == null) {
                    this.f92837a = new C33845De();
                }
                codedInputByteBufferNano.readMessage(this.f92837a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C33870Ee[] c33870EeArr = this.f92838b;
                int length = c33870EeArr == null ? 0 : c33870EeArr.length;
                int i = repeatedFieldArrayLength + length;
                C33870Ee[] c33870EeArr2 = new C33870Ee[i];
                if (length != 0) {
                    System.arraycopy(c33870EeArr, 0, c33870EeArr2, 0, length);
                }
                while (length < i - 1) {
                    C33870Ee c33870Ee = new C33870Ee();
                    c33870EeArr2[length] = c33870Ee;
                    codedInputByteBufferNano.readMessage(c33870Ee);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C33870Ee c33870Ee2 = new C33870Ee();
                c33870EeArr2[length] = c33870Ee2;
                codedInputByteBufferNano.readMessage(c33870Ee2);
                this.f92838b = c33870EeArr2;
            }
        }
    }

    /* renamed from: b */
    public static C33895Fe m22655b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C33895Fe().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C33895Fe m22657a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C33895Fe) MessageNano.mergeFrom(new C33895Fe(), bArr);
    }
}
