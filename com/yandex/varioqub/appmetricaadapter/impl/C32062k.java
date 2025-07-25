package com.yandex.varioqub.appmetricaadapter.impl;

import com.yandex.varioqub.protobuf.nano.CodedInputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.CodedOutputByteBufferNano;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import com.yandex.varioqub.protobuf.nano.WireFormatNano;

/* renamed from: com.yandex.varioqub.appmetricaadapter.impl.k */
/* loaded from: classes8.dex */
public final class C32062k extends MessageNano {

    /* renamed from: a */
    public String f89342a;

    /* renamed from: b */
    public long[] f89343b;

    public C32062k() {
        m25917a();
    }

    /* renamed from: a */
    public final void m25917a() {
        this.f89342a = "";
        this.f89343b = WireFormatNano.EMPTY_LONG_ARRAY;
        this.cachedSize = -1;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        if (!this.f89342a.equals("")) {
            computeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f89342a);
        }
        long[] jArr = this.f89343b;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.f89343b;
                if (i < jArr2.length) {
                    i2 += CodedOutputByteBufferNano.computeInt64SizeNoTag(jArr2[i]);
                    i++;
                } else {
                    return computeSerializedSize + i2 + jArr2.length;
                }
            }
        } else {
            return computeSerializedSize;
        }
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        int length;
        int length2;
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                break;
            } else if (readTag != 10) {
                if (readTag != 16) {
                    if (readTag != 18) {
                        if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                            break;
                        }
                    } else {
                        int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                        int position = codedInputByteBufferNano.getPosition();
                        int i = 0;
                        while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                            codedInputByteBufferNano.readInt64();
                            i++;
                        }
                        codedInputByteBufferNano.rewindToPosition(position);
                        long[] jArr = this.f89343b;
                        if (jArr == null) {
                            length = 0;
                        } else {
                            length = jArr.length;
                        }
                        int i2 = i + length;
                        long[] jArr2 = new long[i2];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i2) {
                            jArr2[length] = codedInputByteBufferNano.readInt64();
                            length++;
                        }
                        this.f89343b = jArr2;
                        codedInputByteBufferNano.popLimit(pushLimit);
                    }
                } else {
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 16);
                    long[] jArr3 = this.f89343b;
                    if (jArr3 == null) {
                        length2 = 0;
                    } else {
                        length2 = jArr3.length;
                    }
                    int i3 = repeatedFieldArrayLength + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        jArr4[length2] = codedInputByteBufferNano.readInt64();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    jArr4[length2] = codedInputByteBufferNano.readInt64();
                    this.f89343b = jArr4;
                }
            } else {
                this.f89342a = codedInputByteBufferNano.readString();
            }
        }
        return this;
    }

    @Override // com.yandex.varioqub.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        if (!this.f89342a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f89342a);
        }
        long[] jArr = this.f89343b;
        if (jArr != null && jArr.length > 0) {
            int i = 0;
            while (true) {
                long[] jArr2 = this.f89343b;
                if (i >= jArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt64(2, jArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
