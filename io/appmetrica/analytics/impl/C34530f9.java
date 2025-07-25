package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9 */
/* loaded from: classes9.dex */
public final class C34530f9 extends MessageNano {

    /* renamed from: d */
    public static final int f94340d = 0;

    /* renamed from: e */
    public static final int f94341e = 1;

    /* renamed from: f */
    public static final int f94342f = 2;

    /* renamed from: g */
    public static final int f94343g = 3;

    /* renamed from: h */
    public static final int f94344h = 4;

    /* renamed from: i */
    public static final int f94345i = 5;

    /* renamed from: j */
    public static final int f94346j = 6;

    /* renamed from: k */
    public static final int f94347k = 7;

    /* renamed from: l */
    public static final int f94348l = 8;

    /* renamed from: m */
    public static final int f94349m = 9;

    /* renamed from: n */
    public static final int f94350n = 10;

    /* renamed from: o */
    public static final int f94351o = 11;

    /* renamed from: p */
    public static final int f94352p = 12;

    /* renamed from: q */
    public static volatile C34530f9[] f94353q;

    /* renamed from: a */
    public long f94354a;

    /* renamed from: b */
    public C34503e9 f94355b;

    /* renamed from: c */
    public C34476d9[] f94356c;

    public C34530f9() {
        m21732a();
    }

    /* renamed from: b */
    public static C34530f9[] m21729b() {
        if (f94353q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94353q == null) {
                    f94353q = new C34530f9[0];
                }
            }
        }
        return f94353q;
    }

    /* renamed from: a */
    public final C34530f9 m21732a() {
        this.f94354a = 0L;
        this.f94355b = null;
        this.f94356c = C34476d9.m21829b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f94354a) + super.computeSerializedSize();
        C34503e9 c34503e9 = this.f94355b;
        if (c34503e9 != null) {
            computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c34503e9);
        }
        C34476d9[] c34476d9Arr = this.f94356c;
        if (c34476d9Arr != null && c34476d9Arr.length > 0) {
            int i = 0;
            while (true) {
                C34476d9[] c34476d9Arr2 = this.f94356c;
                if (i >= c34476d9Arr2.length) {
                    break;
                }
                C34476d9 c34476d9 = c34476d9Arr2[i];
                if (c34476d9 != null) {
                    computeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(3, c34476d9);
                }
                i++;
            }
        }
        return computeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f94354a);
        C34503e9 c34503e9 = this.f94355b;
        if (c34503e9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34503e9);
        }
        C34476d9[] c34476d9Arr = this.f94356c;
        if (c34476d9Arr != null && c34476d9Arr.length > 0) {
            int i = 0;
            while (true) {
                C34476d9[] c34476d9Arr2 = this.f94356c;
                if (i >= c34476d9Arr2.length) {
                    break;
                }
                C34476d9 c34476d9 = c34476d9Arr2[i];
                if (c34476d9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c34476d9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34530f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f94354a = codedInputByteBufferNano.readUInt64();
            } else if (readTag == 18) {
                if (this.f94355b == null) {
                    this.f94355b = new C34503e9();
                }
                codedInputByteBufferNano.readMessage(this.f94355b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C34476d9[] c34476d9Arr = this.f94356c;
                int length = c34476d9Arr == null ? 0 : c34476d9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34476d9[] c34476d9Arr2 = new C34476d9[i];
                if (length != 0) {
                    System.arraycopy(c34476d9Arr, 0, c34476d9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34476d9 c34476d9 = new C34476d9();
                    c34476d9Arr2[length] = c34476d9;
                    codedInputByteBufferNano.readMessage(c34476d9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34476d9 c34476d92 = new C34476d9();
                c34476d9Arr2[length] = c34476d92;
                codedInputByteBufferNano.readMessage(c34476d92);
                this.f94356c = c34476d9Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C34530f9 m21728b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34530f9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34530f9 m21730a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34530f9) MessageNano.mergeFrom(new C34530f9(), bArr);
    }
}
