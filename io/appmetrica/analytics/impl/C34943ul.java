package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ul */
/* loaded from: classes9.dex */
public final class C34943ul extends MessageNano {

    /* renamed from: c */
    public static volatile C34943ul[] f95484c;

    /* renamed from: a */
    public String f95485a;

    /* renamed from: b */
    public String[] f95486b;

    public C34943ul() {
        m20906a();
    }

    /* renamed from: b */
    public static C34943ul[] m20903b() {
        if (f95484c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95484c == null) {
                    f95484c = new C34943ul[0];
                }
            }
        }
        return f95484c;
    }

    /* renamed from: a */
    public final C34943ul m20906a() {
        this.f95485a = "";
        this.f95486b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f95485a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f95485a);
        }
        String[] strArr = this.f95486b;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f95486b;
                if (i < strArr2.length) {
                    String str = strArr2[i];
                    if (str != null) {
                        i3++;
                        i2 = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + i2;
                    }
                    i++;
                } else {
                    return computeSerializedSize + i2 + i3;
                }
            }
        } else {
            return computeSerializedSize;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f95485a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f95485a);
        }
        String[] strArr = this.f95486b;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f95486b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34943ul mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f95485a = codedInputByteBufferNano.readString();
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f95486b;
                int length = strArr == null ? 0 : strArr.length;
                int i = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f95486b = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C34943ul m20902b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34943ul().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34943ul m20904a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34943ul) MessageNano.mergeFrom(new C34943ul(), bArr);
    }
}
