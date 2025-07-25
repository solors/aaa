package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.en */
/* loaded from: classes9.dex */
public final class C34517en extends MessageNano {

    /* renamed from: e */
    public static final int f94281e = 0;

    /* renamed from: f */
    public static final int f94282f = 1;

    /* renamed from: g */
    public static final int f94283g = 2;

    /* renamed from: h */
    public static final int f94284h = 3;

    /* renamed from: i */
    public static volatile C34517en[] f94285i;

    /* renamed from: a */
    public byte[] f94286a;

    /* renamed from: b */
    public int f94287b;

    /* renamed from: c */
    public C34544fn f94288c;

    /* renamed from: d */
    public C34571gn f94289d;

    public C34517en() {
        m21771a();
    }

    /* renamed from: b */
    public static C34517en[] m21768b() {
        if (f94285i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                if (f94285i == null) {
                    f94285i = new C34517en[0];
                }
            }
        }
        return f94285i;
    }

    /* renamed from: a */
    public final C34517en m21771a() {
        this.f94286a = WireFormatNano.EMPTY_BYTES;
        this.f94287b = 0;
        this.f94288c = null;
        this.f94289d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int computeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f94287b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f94286a) + super.computeSerializedSize();
        C34544fn c34544fn = this.f94288c;
        if (c34544fn != null) {
            computeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c34544fn);
        }
        C34571gn c34571gn = this.f94289d;
        if (c34571gn != null) {
            return computeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c34571gn);
        }
        return computeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f94286a);
        codedOutputByteBufferNano.writeInt32(2, this.f94287b);
        C34544fn c34544fn = this.f94288c;
        if (c34544fn != null) {
            codedOutputByteBufferNano.writeMessage(3, c34544fn);
        }
        C34571gn c34571gn = this.f94289d;
        if (c34571gn != null) {
            codedOutputByteBufferNano.writeMessage(4, c34571gn);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C34517en mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                this.f94286a = codedInputByteBufferNano.readBytes();
            } else if (readTag == 16) {
                int readInt32 = codedInputByteBufferNano.readInt32();
                if (readInt32 == 0 || readInt32 == 1 || readInt32 == 2 || readInt32 == 3) {
                    this.f94287b = readInt32;
                }
            } else if (readTag == 26) {
                if (this.f94288c == null) {
                    this.f94288c = new C34544fn();
                }
                codedInputByteBufferNano.readMessage(this.f94288c);
            } else if (readTag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, readTag)) {
                    return this;
                }
            } else {
                if (this.f94289d == null) {
                    this.f94289d = new C34571gn();
                }
                codedInputByteBufferNano.readMessage(this.f94289d);
            }
        }
    }

    /* renamed from: b */
    public static C34517en m21767b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C34517en().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C34517en m21769a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C34517en) MessageNano.mergeFrom(new C34517en(), bArr);
    }
}
