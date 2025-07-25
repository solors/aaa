package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g6 */
/* loaded from: classes9.dex */
public final class C34554g6 extends MessageNano {

    /* renamed from: f */
    public static volatile C34554g6[] f94426f;

    /* renamed from: a */
    public String f94427a;

    /* renamed from: b */
    public String f94428b;

    /* renamed from: c */
    public C34500e6[] f94429c;

    /* renamed from: d */
    public C34554g6 f94430d;

    /* renamed from: e */
    public C34554g6[] f94431e;

    public C34554g6() {
        m21682a();
    }

    /* renamed from: b */
    public static C34554g6[] m21679b() {
        if (f94426f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94426f == null) {
                    f94426f = new C34554g6[0];
                }
            }
        }
        return f94426f;
    }

    /* renamed from: a */
    public final C34554g6 m21682a() {
        this.f94427a = "";
        this.f94428b = "";
        this.f94429c = C34500e6.m21804b();
        this.f94430d = null;
        this.f94431e = m21679b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f94427a) + super.computeSerializedSize();
        if (!this.f94428b.equals("")) {
            computeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f94428b);
        }
        C34500e6[] c34500e6Arr = this.f94429c;
        int i = 0;
        if (c34500e6Arr != null && c34500e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C34500e6[] c34500e6Arr2 = this.f94429c;
                if (i2 >= c34500e6Arr2.length) {
                    break;
                }
                C34500e6 c34500e6 = c34500e6Arr2[i2];
                if (c34500e6 != null) {
                    computeStringSize += CodedOutputByteBufferNano.computeMessageSize(3, c34500e6);
                }
                i2++;
            }
        }
        C34554g6 c34554g6 = this.f94430d;
        if (c34554g6 != null) {
            computeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c34554g6);
        }
        C34554g6[] c34554g6Arr = this.f94431e;
        if (c34554g6Arr != null && c34554g6Arr.length > 0) {
            while (true) {
                C34554g6[] c34554g6Arr2 = this.f94431e;
                if (i >= c34554g6Arr2.length) {
                    break;
                }
                C34554g6 c34554g62 = c34554g6Arr2[i];
                if (c34554g62 != null) {
                    computeStringSize += CodedOutputByteBufferNano.computeMessageSize(5, c34554g62);
                }
                i++;
            }
        }
        return computeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f94427a);
        if (!this.f94428b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f94428b);
        }
        C34500e6[] c34500e6Arr = this.f94429c;
        int i = 0;
        if (c34500e6Arr != null && c34500e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C34500e6[] c34500e6Arr2 = this.f94429c;
                if (i2 >= c34500e6Arr2.length) {
                    break;
                }
                C34500e6 c34500e6 = c34500e6Arr2[i2];
                if (c34500e6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c34500e6);
                }
                i2++;
            }
        }
        C34554g6 c34554g6 = this.f94430d;
        if (c34554g6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c34554g6);
        }
        C34554g6[] c34554g6Arr = this.f94431e;
        if (c34554g6Arr != null && c34554g6Arr.length > 0) {
            while (true) {
                C34554g6[] c34554g6Arr2 = this.f94431e;
                if (i >= c34554g6Arr2.length) {
                    break;
                }
                C34554g6 c34554g62 = c34554g6Arr2[i];
                if (c34554g62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c34554g62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34554g6 m21678b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34554g6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34554g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94427a = codedInputByteBufferNano.readString();
            } else if (readTag == 18) {
                this.f94428b = codedInputByteBufferNano.readString();
            } else if (readTag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C34500e6[] c34500e6Arr = this.f94429c;
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
                this.f94429c = c34500e6Arr2;
            } else if (readTag == 34) {
                if (this.f94430d == null) {
                    this.f94430d = new C34554g6();
                }
                codedInputByteBufferNano.readMessage(this.f94430d);
            } else if (readTag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C34554g6[] c34554g6Arr = this.f94431e;
                int length2 = c34554g6Arr == null ? 0 : c34554g6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C34554g6[] c34554g6Arr2 = new C34554g6[i2];
                if (length2 != 0) {
                    System.arraycopy(c34554g6Arr, 0, c34554g6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C34554g6 c34554g6 = new C34554g6();
                    c34554g6Arr2[length2] = c34554g6;
                    codedInputByteBufferNano.readMessage(c34554g6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C34554g6 c34554g62 = new C34554g6();
                c34554g6Arr2[length2] = c34554g62;
                codedInputByteBufferNano.readMessage(c34554g62);
                this.f94431e = c34554g6Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C34554g6 m21680a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34554g6) MessageNano.mergeFrom(new C34554g6(), bArr);
    }
}
