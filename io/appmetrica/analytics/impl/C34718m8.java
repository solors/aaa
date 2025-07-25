package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m8 */
/* loaded from: classes9.dex */
public final class C34718m8 extends MessageNano {

    /* renamed from: h */
    public static volatile C34718m8[] f94910h;

    /* renamed from: a */
    public byte[] f94911a;

    /* renamed from: b */
    public byte[] f94912b;

    /* renamed from: c */
    public C34502e8 f94913c;

    /* renamed from: d */
    public C34664k8 f94914d;

    /* renamed from: e */
    public C34691l8 f94915e;

    /* renamed from: f */
    public C34691l8 f94916f;

    /* renamed from: g */
    public C34745n8[] f94917g;

    public C34718m8() {
        m21334a();
    }

    /* renamed from: b */
    public static C34718m8[] m21331b() {
        if (f94910h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94910h == null) {
                    f94910h = new C34718m8[0];
                }
            }
        }
        return f94910h;
    }

    /* renamed from: a */
    public final C34718m8 m21334a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f94911a = bArr;
        this.f94912b = bArr;
        this.f94913c = null;
        this.f94914d = null;
        this.f94915e = null;
        this.f94916f = null;
        this.f94917g = C34745n8.m21307b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f94911a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f94911a);
        }
        if (!Arrays.equals(this.f94912b, bArr2)) {
            computeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f94912b);
        }
        C34502e8 c34502e8 = this.f94913c;
        if (c34502e8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c34502e8);
        }
        C34664k8 c34664k8 = this.f94914d;
        if (c34664k8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c34664k8);
        }
        C34691l8 c34691l8 = this.f94915e;
        if (c34691l8 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c34691l8);
        }
        C34691l8 c34691l82 = this.f94916f;
        if (c34691l82 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c34691l82);
        }
        C34745n8[] c34745n8Arr = this.f94917g;
        if (c34745n8Arr != null && c34745n8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34745n8[] c34745n8Arr2 = this.f94917g;
                if (i >= c34745n8Arr2.length) {
                    break;
                }
                C34745n8 c34745n8 = c34745n8Arr2[i];
                if (c34745n8 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c34745n8);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f94911a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f94911a);
        }
        if (!Arrays.equals(this.f94912b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f94912b);
        }
        C34502e8 c34502e8 = this.f94913c;
        if (c34502e8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c34502e8);
        }
        C34664k8 c34664k8 = this.f94914d;
        if (c34664k8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c34664k8);
        }
        C34691l8 c34691l8 = this.f94915e;
        if (c34691l8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c34691l8);
        }
        C34691l8 c34691l82 = this.f94916f;
        if (c34691l82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c34691l82);
        }
        C34745n8[] c34745n8Arr = this.f94917g;
        if (c34745n8Arr != null && c34745n8Arr.length > 0) {
            int i = 0;
            while (true) {
                C34745n8[] c34745n8Arr2 = this.f94917g;
                if (i >= c34745n8Arr2.length) {
                    break;
                }
                C34745n8 c34745n8 = c34745n8Arr2[i];
                if (c34745n8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c34745n8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C34718m8 m21330b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34718m8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34718m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94911a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 18) {
                this.f94912b = codedInputByteBufferNano.readBytes();
            } else if (readTag == 26) {
                if (this.f94913c == null) {
                    this.f94913c = new C34502e8();
                }
                codedInputByteBufferNano.readMessage(this.f94913c);
            } else if (readTag == 34) {
                if (this.f94914d == null) {
                    this.f94914d = new C34664k8();
                }
                codedInputByteBufferNano.readMessage(this.f94914d);
            } else if (readTag == 42) {
                if (this.f94915e == null) {
                    this.f94915e = new C34691l8();
                }
                codedInputByteBufferNano.readMessage(this.f94915e);
            } else if (readTag == 50) {
                if (this.f94916f == null) {
                    this.f94916f = new C34691l8();
                }
                codedInputByteBufferNano.readMessage(this.f94916f);
            } else if (readTag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C34745n8[] c34745n8Arr = this.f94917g;
                int length = c34745n8Arr == null ? 0 : c34745n8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34745n8[] c34745n8Arr2 = new C34745n8[i];
                if (length != 0) {
                    System.arraycopy(c34745n8Arr, 0, c34745n8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34745n8 c34745n8 = new C34745n8();
                    c34745n8Arr2[length] = c34745n8;
                    codedInputByteBufferNano.readMessage(c34745n8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34745n8 c34745n82 = new C34745n8();
                c34745n8Arr2[length] = c34745n82;
                codedInputByteBufferNano.readMessage(c34745n82);
                this.f94917g = c34745n8Arr2;
            }
        }
    }

    /* renamed from: a */
    public static C34718m8 m21332a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34718m8) MessageNano.mergeFrom(new C34718m8(), bArr);
    }
}
