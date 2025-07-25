package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ai */
/* loaded from: classes9.dex */
public final class C34404ai extends MessageNano {

    /* renamed from: e */
    public static volatile C34404ai[] f93970e;

    /* renamed from: a */
    public long f93971a;

    /* renamed from: b */
    public C34431bi f93972b;

    /* renamed from: c */
    public int f93973c;

    /* renamed from: d */
    public byte[] f93974d;

    public C34404ai() {
        m21993a();
    }

    /* renamed from: b */
    public static C34404ai[] m21990b() {
        if (f93970e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f93970e == null) {
                    f93970e = new C34404ai[0];
                }
            }
        }
        return f93970e;
    }

    /* renamed from: a */
    public final C34404ai m21993a() {
        this.f93971a = 0L;
        this.f93972b = null;
        this.f93973c = 0;
        this.f93974d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        long j = this.f93971a;
        if (j != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        C34431bi c34431bi = this.f93972b;
        if (c34431bi != null) {
            computeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c34431bi);
        }
        int i = this.f93973c;
        if (i != 0) {
            computeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        if (!Arrays.equals(this.f93974d, WireFormatNano.EMPTY_BYTES)) {
            return computeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f93974d);
        }
        return computeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f93971a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        C34431bi c34431bi = this.f93972b;
        if (c34431bi != null) {
            codedOutputByteBufferNano.writeMessage(2, c34431bi);
        }
        int i = this.f93973c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.f93974d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f93974d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34404ai mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 8) {
                this.f93971a = codedInputByteBufferNano.readInt64();
            } else if (readTag == 18) {
                if (this.f93972b == null) {
                    this.f93972b = new C34431bi();
                }
                codedInputByteBufferNano.readMessage(this.f93972b);
            } else if (readTag == 24) {
                this.f93973c = codedInputByteBufferNano.readUInt32();
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                this.f93974d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C34404ai m21989b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34404ai().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34404ai m21991a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34404ai) MessageNano.mergeFrom(new C34404ai(), bArr);
    }
}
