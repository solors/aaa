package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a6 */
/* loaded from: classes9.dex */
public final class C34392a6 extends MessageNano {

    /* renamed from: k */
    public static final int f93914k = 0;

    /* renamed from: l */
    public static final int f93915l = 1;

    /* renamed from: m */
    public static volatile C34392a6[] f93916m;

    /* renamed from: n */
    public static byte[] f93917n;

    /* renamed from: o */
    public static volatile boolean f93918o;

    /* renamed from: a */
    public C34554g6 f93919a;

    /* renamed from: b */
    public C34295W5 f93920b;

    /* renamed from: c */
    public String f93921c;

    /* renamed from: d */
    public int f93922d;

    /* renamed from: e */
    public C34500e6[] f93923e;

    /* renamed from: f */
    public int f93924f;

    /* renamed from: g */
    public C34367Z5 f93925g;

    /* renamed from: h */
    public byte[] f93926h;

    /* renamed from: i */
    public byte[] f93927i;

    /* renamed from: j */
    public C34343Y5[] f93928j;

    public C34392a6() {
        if (!f93918o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (!f93918o) {
                    f93917n = InternalNano.bytesDefaultValue("JVM");
                    f93918o = true;
                }
            }
        }
        m22019a();
    }

    /* renamed from: b */
    public static C34392a6[] m22016b() {
        if (f93916m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93916m == null) {
                    f93916m = new C34392a6[0];
                }
            }
        }
        return f93916m;
    }

    /* renamed from: a */
    public final C34392a6 m22019a() {
        this.f93919a = null;
        this.f93920b = null;
        this.f93921c = "";
        this.f93922d = -1;
        this.f93923e = C34500e6.m21804b();
        this.f93924f = 0;
        this.f93925g = null;
        this.f93926h = (byte[]) f93917n.clone();
        this.f93927i = WireFormatNano.EMPTY_BYTES;
        this.f93928j = C34343Y5.m22074b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34554g6 c34554g6 = this.f93919a;
        if (c34554g6 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34554g6);
        }
        C34295W5 c34295w5 = this.f93920b;
        if (c34295w5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34295w5);
        }
        if (!this.f93921c.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f93921c);
        }
        int i = this.f93922d;
        if (i != -1) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C34500e6[] c34500e6Arr = this.f93923e;
        int i2 = 0;
        if (c34500e6Arr != null && c34500e6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C34500e6[] c34500e6Arr2 = this.f93923e;
                if (i3 >= c34500e6Arr2.length) {
                    break;
                }
                C34500e6 c34500e6 = c34500e6Arr2[i3];
                if (c34500e6 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c34500e6);
                }
                i3++;
            }
        }
        int i4 = this.f93924f;
        if (i4 != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        C34367Z5 c34367z5 = this.f93925g;
        if (c34367z5 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c34367z5);
        }
        if (!Arrays.equals(this.f93926h, f93917n)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f93926h);
        }
        if (!Arrays.equals(this.f93927i, WireFormatNano.EMPTY_BYTES)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f93927i);
        }
        C34343Y5[] c34343y5Arr = this.f93928j;
        if (c34343y5Arr != null && c34343y5Arr.length > 0) {
            while (true) {
                C34343Y5[] c34343y5Arr2 = this.f93928j;
                if (i2 >= c34343y5Arr2.length) {
                    break;
                }
                C34343Y5 c34343y5 = c34343y5Arr2[i2];
                if (c34343y5 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(10, c34343y5);
                }
                i2++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34554g6 c34554g6 = this.f93919a;
        if (c34554g6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34554g6);
        }
        C34295W5 c34295w5 = this.f93920b;
        if (c34295w5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34295w5);
        }
        if (!this.f93921c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f93921c);
        }
        int i = this.f93922d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C34500e6[] c34500e6Arr = this.f93923e;
        int i2 = 0;
        if (c34500e6Arr != null && c34500e6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C34500e6[] c34500e6Arr2 = this.f93923e;
                if (i3 >= c34500e6Arr2.length) {
                    break;
                }
                C34500e6 c34500e6 = c34500e6Arr2[i3];
                if (c34500e6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c34500e6);
                }
                i3++;
            }
        }
        int i4 = this.f93924f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        C34367Z5 c34367z5 = this.f93925g;
        if (c34367z5 != null) {
            codedOutputByteBufferNano.writeMessage(7, c34367z5);
        }
        if (!Arrays.equals(this.f93926h, f93917n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f93926h);
        }
        if (!Arrays.equals(this.f93927i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f93927i);
        }
        C34343Y5[] c34343y5Arr = this.f93928j;
        if (c34343y5Arr != null && c34343y5Arr.length > 0) {
            while (true) {
                C34343Y5[] c34343y5Arr2 = this.f93928j;
                if (i2 >= c34343y5Arr2.length) {
                    break;
                }
                C34343Y5 c34343y5 = c34343y5Arr2[i2];
                if (c34343y5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c34343y5);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34392a6 m22015b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34392a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34392a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            switch (readTag) {
                case 0:
                    return this;
                case 10:
                    if (this.f93919a == null) {
                        this.f93919a = new C34554g6();
                    }
                    codedInputByteBufferNano.readMessage(this.f93919a);
                    break;
                case 18:
                    if (this.f93920b == null) {
                        this.f93920b = new C34295W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f93920b);
                    break;
                case 26:
                    this.f93921c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int readInt32 = codedInputByteBufferNano.readInt32();
                    if (readInt32 != -1 && readInt32 != 0 && readInt32 != 1) {
                        break;
                    } else {
                        this.f93922d = readInt32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C34500e6[] c34500e6Arr = this.f93923e;
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
                    this.f93923e = c34500e6Arr2;
                    break;
                case 48:
                    int readInt322 = codedInputByteBufferNano.readInt32();
                    if (readInt322 != 0 && readInt322 != 1) {
                        break;
                    } else {
                        this.f93924f = readInt322;
                        break;
                    }
                case 58:
                    if (this.f93925g == null) {
                        this.f93925g = new C34367Z5();
                    }
                    codedInputByteBufferNano.readMessage(this.f93925g);
                    break;
                case 66:
                    this.f93926h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f93927i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C34343Y5[] c34343y5Arr = this.f93928j;
                    int length2 = c34343y5Arr == null ? 0 : c34343y5Arr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C34343Y5[] c34343y5Arr2 = new C34343Y5[i2];
                    if (length2 != 0) {
                        System.arraycopy(c34343y5Arr, 0, c34343y5Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C34343Y5 c34343y5 = new C34343Y5();
                        c34343y5Arr2[length2] = c34343y5;
                        codedInputByteBufferNano.readMessage(c34343y5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C34343Y5 c34343y52 = new C34343Y5();
                    c34343y5Arr2[length2] = c34343y52;
                    codedInputByteBufferNano.readMessage(c34343y52);
                    this.f93928j = c34343y5Arr2;
                    break;
                default:
                    if (WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                        break;
                    } else {
                        return this;
                    }
            }
        }
    }

    /* renamed from: a */
    public static C34392a6 m22017a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34392a6) MessageNano.mergeFrom(new C34392a6(), bArr);
    }
}
