package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f6 */
/* loaded from: classes9.dex */
public final class C34527f6 extends MessageNano {

    /* renamed from: g */
    public static volatile C34527f6[] f94312g;

    /* renamed from: a */
    public String f94313a;

    /* renamed from: b */
    public int f94314b;

    /* renamed from: c */
    public long f94315c;

    /* renamed from: d */
    public String f94316d;

    /* renamed from: e */
    public int f94317e;

    /* renamed from: f */
    public C34500e6[] f94318f;

    public C34527f6() {
        m21758a();
    }

    /* renamed from: b */
    public static C34527f6[] m21755b() {
        if (f94312g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94312g == null) {
                    f94312g = new C34527f6[0];
                }
            }
        }
        return f94312g;
    }

    /* renamed from: a */
    public final C34527f6 m21758a() {
        this.f94313a = "";
        this.f94314b = 0;
        this.f94315c = 0L;
        this.f94316d = "";
        this.f94317e = 0;
        this.f94318f = C34500e6.m21804b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f94315c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f94314b) + CodedOutputByteBufferNano.computeStringSize(1, this.f94313a) + super.computeSerializedSize();
        if (!this.f94316d.equals("")) {
            computeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f94316d);
        }
        int i = this.f94317e;
        if (i != 0) {
            computeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C34500e6[] c34500e6Arr = this.f94318f;
        if (c34500e6Arr != null && c34500e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C34500e6[] c34500e6Arr2 = this.f94318f;
                if (i2 >= c34500e6Arr2.length) {
                    break;
                }
                C34500e6 c34500e6 = c34500e6Arr2[i2];
                if (c34500e6 != null) {
                    computeSInt64Size += CodedOutputByteBufferNano.computeMessageSize(6, c34500e6);
                }
                i2++;
            }
        }
        return computeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f94313a);
        codedOutputByteBufferNano.writeSInt32(2, this.f94314b);
        codedOutputByteBufferNano.writeSInt64(3, this.f94315c);
        if (!this.f94316d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f94316d);
        }
        int i = this.f94317e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C34500e6[] c34500e6Arr = this.f94318f;
        if (c34500e6Arr != null && c34500e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C34500e6[] c34500e6Arr2 = this.f94318f;
                if (i2 >= c34500e6Arr2.length) {
                    break;
                }
                C34500e6 c34500e6 = c34500e6Arr2[i2];
                if (c34500e6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c34500e6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34527f6 m21754b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34527f6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34527f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94313a = codedInputByteBufferNano.readString();
            } else if (readTag == 16) {
                this.f94314b = codedInputByteBufferNano.readSInt32();
            } else if (readTag == 24) {
                this.f94315c = codedInputByteBufferNano.readSInt64();
            } else if (readTag == 34) {
                this.f94316d = codedInputByteBufferNano.readString();
            } else if (readTag == 40) {
                this.f94317e = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C34500e6[] c34500e6Arr = this.f94318f;
                int length = c34500e6Arr == null ? 0 : c34500e6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34500e6[] c34500e6Arr2 = new C34500e6[i];
                if (length != 0) {
                    System.arraycopy(c34500e6Arr, 0, c34500e6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34500e6 c34500e6 = new C34500e6();
                    c34500e6Arr2[length] = c34500e6;
                    codedInputByteBufferNano.readMessage(c34500e6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34500e6 c34500e62 = new C34500e6();
                c34500e6Arr2[length] = c34500e62;
                codedInputByteBufferNano.readMessage(c34500e62);
                this.f94318f = c34500e6Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C34527f6 m21756a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34527f6) MessageNano.mergeFrom(new C34527f6(), bArr);
    }
}
