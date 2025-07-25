package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.P3 */
/* loaded from: classes9.dex */
public final class C34126P3 extends MessageNano {

    /* renamed from: c */
    public static final int f93318c = 0;

    /* renamed from: d */
    public static final int f93319d = 1;

    /* renamed from: e */
    public static final int f93320e = 2;

    /* renamed from: f */
    public static final int f93321f = 3;

    /* renamed from: g */
    public static volatile C34126P3[] f93322g;

    /* renamed from: a */
    public C34054M3 f93323a;

    /* renamed from: b */
    public C34054M3[] f93324b;

    public C34126P3() {
        m22369a();
    }

    /* renamed from: b */
    public static C34126P3[] m22366b() {
        if (f93322g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93322g == null) {
                    f93322g = new C34126P3[0];
                }
            }
        }
        return f93322g;
    }

    /* renamed from: a */
    public final C34126P3 m22369a() {
        this.f93323a = null;
        this.f93324b = C34054M3.m22455b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        C34054M3 c34054m3 = this.f93323a;
        if (c34054m3 != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c34054m3);
        }
        C34054M3[] c34054m3Arr = this.f93324b;
        if (c34054m3Arr != null && c34054m3Arr.length > 0) {
            int i = 0;
            while (true) {
                C34054M3[] c34054m3Arr2 = this.f93324b;
                if (i >= c34054m3Arr2.length) {
                    break;
                }
                C34054M3 c34054m32 = c34054m3Arr2[i];
                if (c34054m32 != null) {
                    computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34054m32);
                }
                i++;
            }
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C34054M3 c34054m3 = this.f93323a;
        if (c34054m3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c34054m3);
        }
        C34054M3[] c34054m3Arr = this.f93324b;
        if (c34054m3Arr != null && c34054m3Arr.length > 0) {
            int i = 0;
            while (true) {
                C34054M3[] c34054m3Arr2 = this.f93324b;
                if (i >= c34054m3Arr2.length) {
                    break;
                }
                C34054M3 c34054m32 = c34054m3Arr2[i];
                if (c34054m32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c34054m32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34126P3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.f93323a == null) {
                    this.f93323a = new C34054M3();
                }
                codedInputByteBufferNano.readMessage(this.f93323a);
            } else if (readTag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C34054M3[] c34054m3Arr = this.f93324b;
                int length = c34054m3Arr == null ? 0 : c34054m3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C34054M3[] c34054m3Arr2 = new C34054M3[i];
                if (length != 0) {
                    System.arraycopy(c34054m3Arr, 0, c34054m3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C34054M3 c34054m3 = new C34054M3();
                    c34054m3Arr2[length] = c34054m3;
                    codedInputByteBufferNano.readMessage(c34054m3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C34054M3 c34054m32 = new C34054M3();
                c34054m3Arr2[length] = c34054m32;
                codedInputByteBufferNano.readMessage(c34054m32);
                this.f93324b = c34054m3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C34126P3 m22365b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34126P3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34126P3 m22367a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34126P3) MessageNano.mergeFrom(new C34126P3(), bArr);
    }
}
