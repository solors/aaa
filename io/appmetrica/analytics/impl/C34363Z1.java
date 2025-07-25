package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Z1 */
/* loaded from: classes9.dex */
public final class C34363Z1 extends MessageNano {

    /* renamed from: d */
    public static volatile C34363Z1[] f93855d;

    /* renamed from: a */
    public C34339Y1[] f93856a;

    /* renamed from: b */
    public C34315X1 f93857b;

    /* renamed from: c */
    public String[] f93858c;

    public C34363Z1() {
        m22060a();
    }

    /* renamed from: b */
    public static C34363Z1[] m22057b() {
        if (f93855d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93855d == null) {
                    f93855d = new C34363Z1[0];
                }
            }
        }
        return f93855d;
    }

    /* renamed from: a */
    public final C34363Z1 m22060a() {
        this.f93856a = C34339Y1.m22083b();
        this.f93857b = null;
        this.f93858c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34339Y1[] c34339y1Arr = this.f93856a;
        int i = 0;
        if (c34339y1Arr != null && c34339y1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C34339Y1[] c34339y1Arr2 = this.f93856a;
                if (i2 >= c34339y1Arr2.length) {
                    break;
                }
                C34339Y1 c34339y1 = c34339y1Arr2[i2];
                if (c34339y1 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34339y1);
                }
                i2++;
            }
        }
        C34315X1 c34315x1 = this.f93857b;
        if (c34315x1 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34315x1);
        }
        String[] strArr = this.f93858c;
        if (strArr != null && strArr.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                String[] strArr2 = this.f93858c;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (str != null) {
                        i4++;
                        i3 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i3;
                    }
                    i++;
                } else {
                    return computeSerializedSize + i3 + i4;
                }
            }
        } else {
            return computeSerializedSize;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34339Y1[] c34339y1Arr = this.f93856a;
        int i = 0;
        if (c34339y1Arr != null && c34339y1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C34339Y1[] c34339y1Arr2 = this.f93856a;
                if (i2 >= c34339y1Arr2.length) {
                    break;
                }
                C34339Y1 c34339y1 = c34339y1Arr2[i2];
                if (c34339y1 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c34339y1);
                }
                i2++;
            }
        }
        C34315X1 c34315x1 = this.f93857b;
        if (c34315x1 != null) {
            codedOutputByteBufferNano.writeMessage(2, c34315x1);
        }
        String[] strArr = this.f93858c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f93858c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34363Z1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C34339Y1[] c34339y1Arr = this.f93856a;
                int length = c34339y1Arr == null ? 0 : c34339y1Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34339Y1[] c34339y1Arr2 = new C34339Y1[i];
                if (length != 0) {
                    System.arraycopy(c34339y1Arr, 0, c34339y1Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34339Y1 c34339y1 = new C34339Y1();
                    c34339y1Arr2[length] = c34339y1;
                    codedInputByteBufferNano.readMessage(c34339y1);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34339Y1 c34339y12 = new C34339Y1();
                c34339y1Arr2[length] = c34339y12;
                codedInputByteBufferNano.readMessage(c34339y12);
                this.f93856a = c34339y1Arr2;
            } else if (readTag == 18) {
                if (this.f93857b == null) {
                    this.f93857b = new C34315X1();
                }
                codedInputByteBufferNano.readMessage(this.f93857b);
            } else if (readTag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f93858c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f93858c = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C34363Z1 m22056b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34363Z1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34363Z1 m22058a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34363Z1) MessageNano.mergeFrom(new C34363Z1(), bArr);
    }
}
