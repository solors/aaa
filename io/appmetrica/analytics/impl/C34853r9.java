package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r9 */
/* loaded from: classes9.dex */
public final class C34853r9 extends MessageNano {

    /* renamed from: e */
    public static volatile C34853r9[] f95271e;

    /* renamed from: a */
    public boolean f95272a;

    /* renamed from: b */
    public int f95273b;

    /* renamed from: c */
    public int f95274c;

    /* renamed from: d */
    public int[] f95275d;

    public C34853r9() {
        m21037a();
    }

    /* renamed from: b */
    public static C34853r9[] m21034b() {
        if (f95271e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f95271e == null) {
                    f95271e = new C34853r9[0];
                }
            }
        }
        return f95271e;
    }

    /* renamed from: a */
    public final C34853r9 m21037a() {
        this.f95272a = false;
        this.f95273b = 0;
        this.f95274c = 0;
        this.f95275d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f95274c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f95273b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f95272a) + super.computeSerializedSize();
        int[] iArr = this.f95275d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            int i2 = 0;
            while (true) {
                int[] iArr2 = this.f95275d;
                if (i < iArr2.length) {
                    i2 += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
                    i++;
                } else {
                    return computeUInt32Size + i2 + iArr2.length;
                }
            }
        } else {
            return computeUInt32Size;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f95272a);
        codedOutputByteBufferNano.writeUInt32(2, this.f95273b);
        codedOutputByteBufferNano.writeUInt32(3, this.f95274c);
        int[] iArr = this.f95275d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f95275d;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34853r9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f95272a = codedInputByteBufferNano.readBool();
            } else if (readTag == 16) {
                this.f95273b = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 24) {
                this.f95274c = codedInputByteBufferNano.readUInt32();
            } else if (readTag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f95275d;
                int length = iArr == null ? 0 : iArr.length;
                int i = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f95275d = iArr2;
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int pushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i2 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i2++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f95275d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f95275d = iArr4;
                codedInputByteBufferNano.popLimit(pushLimit);
            }
        }
    }

    /* renamed from: b */
    public static C34853r9 m21033b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34853r9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34853r9 m21035a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34853r9) MessageNano.mergeFrom(new C34853r9(), bArr);
    }
}
