package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.proto.Protobuf;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ProtobufDataEncoderContext implements ObjectEncoderContext {

    /* renamed from: f */
    private static final Charset f43008f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final FieldDescriptor f43009g = FieldDescriptor.builder("key").withProperty(AtProtobuf.builder().tag(1).build()).build();

    /* renamed from: h */
    private static final FieldDescriptor f43010h = FieldDescriptor.builder("value").withProperty(AtProtobuf.builder().tag(2).build()).build();

    /* renamed from: i */
    private static final ObjectEncoder<Map.Entry<Object, Object>> f43011i = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.a
        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            ProtobufDataEncoderContext.m66844a((Map.Entry) obj, objectEncoderContext);
        }
    };

    /* renamed from: a */
    private OutputStream f43012a;

    /* renamed from: b */
    private final Map<Class<?>, ObjectEncoder<?>> f43013b;

    /* renamed from: c */
    private final Map<Class<?>, ValueEncoder<?>> f43014c;

    /* renamed from: d */
    private final ObjectEncoder<Object> f43015d;

    /* renamed from: e */
    private final ProtobufValueEncoderContext f43016e = new ProtobufValueEncoderContext(this);

    /* renamed from: com.google.firebase.encoders.proto.ProtobufDataEncoderContext$1 */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C173781 {

        /* renamed from: a */
        static final /* synthetic */ int[] f43017a;

        static {
            int[] iArr = new int[Protobuf.IntEncoding.values().length];
            f43017a = iArr;
            try {
                iArr[Protobuf.IntEncoding.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43017a[Protobuf.IntEncoding.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43017a[Protobuf.IntEncoding.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ProtobufDataEncoderContext(OutputStream outputStream, Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f43012a = outputStream;
        this.f43013b = map;
        this.f43014c = map2;
        this.f43015d = objectEncoder;
    }

    /* renamed from: a */
    public static /* synthetic */ void m66844a(Map.Entry entry, ObjectEncoderContext objectEncoderContext) {
        m66830o(entry, objectEncoderContext);
    }

    /* renamed from: h */
    private static ByteBuffer m66837h(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: i */
    private <T> long m66836i(ObjectEncoder<T> objectEncoder, T t) throws IOException {
        LengthCountingOutputStream lengthCountingOutputStream = new LengthCountingOutputStream();
        try {
            OutputStream outputStream = this.f43012a;
            this.f43012a = lengthCountingOutputStream;
            objectEncoder.encode(t, this);
            this.f43012a = outputStream;
            long m66845a = lengthCountingOutputStream.m66845a();
            lengthCountingOutputStream.close();
            return m66845a;
        } catch (Throwable th) {
            try {
                lengthCountingOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: j */
    private <T> ProtobufDataEncoderContext m66835j(ObjectEncoder<T> objectEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        long m66836i = m66836i(objectEncoder, t);
        if (z && m66836i == 0) {
            return this;
        }
        m66829p((m66831n(fieldDescriptor) << 3) | 2);
        m66828q(m66836i);
        objectEncoder.encode(t, this);
        return this;
    }

    /* renamed from: k */
    private <T> ProtobufDataEncoderContext m66834k(ValueEncoder<T> valueEncoder, FieldDescriptor fieldDescriptor, T t, boolean z) throws IOException {
        this.f43016e.m66824b(fieldDescriptor, z);
        valueEncoder.encode(t, this.f43016e);
        return this;
    }

    /* renamed from: m */
    private static Protobuf m66832m(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: n */
    private static int m66831n(FieldDescriptor fieldDescriptor) {
        Protobuf protobuf = (Protobuf) fieldDescriptor.getProperty(Protobuf.class);
        if (protobuf != null) {
            return protobuf.tag();
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    /* renamed from: o */
    public static /* synthetic */ void m66830o(Map.Entry entry, ObjectEncoderContext objectEncoderContext) throws IOException {
        objectEncoderContext.add(f43009g, entry.getKey());
        objectEncoderContext.add(f43010h, entry.getValue());
    }

    /* renamed from: p */
    private void m66829p(int i) throws IOException {
        while ((i & (-128)) != 0) {
            this.f43012a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f43012a.write(i & 127);
    }

    /* renamed from: q */
    private void m66828q(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f43012a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f43012a.write(((int) j) & 127);
    }

    /* renamed from: b */
    public ObjectEncoderContext m66843b(@NonNull FieldDescriptor fieldDescriptor, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m66829p((m66831n(fieldDescriptor) << 3) | 1);
        this.f43012a.write(m66837h(8).putDouble(d).array());
        return this;
    }

    /* renamed from: c */
    public ObjectEncoderContext m66842c(@NonNull FieldDescriptor fieldDescriptor, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m66829p((m66831n(fieldDescriptor) << 3) | 5);
        this.f43012a.write(m66837h(4).putFloat(f).array());
        return this;
    }

    /* renamed from: d */
    public ObjectEncoderContext m66841d(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m66829p((m66831n(fieldDescriptor) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f43008f);
            m66829p(bytes.length);
            this.f43012a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object obj2 : (Collection) obj) {
                m66841d(fieldDescriptor, obj2, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                m66835j(f43011i, fieldDescriptor, entry, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return m66843b(fieldDescriptor, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return m66842c(fieldDescriptor, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return m66839f(fieldDescriptor, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return m66838g(fieldDescriptor, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m66829p((m66831n(fieldDescriptor) << 3) | 2);
                m66829p(bArr.length);
                this.f43012a.write(bArr);
                return this;
            }
            ObjectEncoder<?> objectEncoder = this.f43013b.get(obj.getClass());
            if (objectEncoder != null) {
                return m66835j(objectEncoder, fieldDescriptor, obj, z);
            }
            ValueEncoder<?> valueEncoder = this.f43014c.get(obj.getClass());
            if (valueEncoder != null) {
                return m66834k(valueEncoder, fieldDescriptor, obj, z);
            }
            if (obj instanceof ProtoEnum) {
                return add(fieldDescriptor, ((ProtoEnum) obj).getNumber());
            }
            if (obj instanceof Enum) {
                return add(fieldDescriptor, ((Enum) obj).ordinal());
            }
            return m66835j(this.f43015d, fieldDescriptor, obj, z);
        }
    }

    /* renamed from: e */
    public ProtobufDataEncoderContext m66840e(@NonNull FieldDescriptor fieldDescriptor, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        Protobuf m66832m = m66832m(fieldDescriptor);
        int i2 = C173781.f43017a[m66832m.intEncoding().ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    m66829p((m66832m.tag() << 3) | 5);
                    this.f43012a.write(m66837h(4).putInt(i).array());
                }
            } else {
                m66829p(m66832m.tag() << 3);
                m66829p((i << 1) ^ (i >> 31));
            }
        } else {
            m66829p(m66832m.tag() << 3);
            m66829p(i);
        }
        return this;
    }

    /* renamed from: f */
    public ProtobufDataEncoderContext m66839f(@NonNull FieldDescriptor fieldDescriptor, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        Protobuf m66832m = m66832m(fieldDescriptor);
        int i = C173781.f43017a[m66832m.intEncoding().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    m66829p((m66832m.tag() << 3) | 1);
                    this.f43012a.write(m66837h(8).putLong(j).array());
                }
            } else {
                m66829p(m66832m.tag() << 3);
                m66828q((j >> 63) ^ (j << 1));
            }
        } else {
            m66829p(m66832m.tag() << 3);
            m66828q(j);
        }
        return this;
    }

    /* renamed from: g */
    public ProtobufDataEncoderContext m66838g(@NonNull FieldDescriptor fieldDescriptor, boolean z, boolean z2) throws IOException {
        return m66840e(fieldDescriptor, z ? 1 : 0, z2);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return m66833l(obj);
    }

    /* renamed from: l */
    public ProtobufDataEncoderContext m66833l(@Nullable Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        ObjectEncoder<?> objectEncoder = this.f43013b.get(obj.getClass());
        if (objectEncoder != null) {
            objectEncoder.encode(obj, this);
            return this;
        }
        throw new EncodingException("No encoder for " + obj.getClass());
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        return nested(FieldDescriptor.m66863of(str));
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        throw new EncodingException("nested() is not implemented for protobuf encoding.");
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        return add(FieldDescriptor.m66863of(str), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        return add(FieldDescriptor.m66863of(str), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        return add(FieldDescriptor.m66863of(str), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        return add(FieldDescriptor.m66863of(str), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        return add(FieldDescriptor.m66863of(str), z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return m66841d(fieldDescriptor, obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        return m66843b(fieldDescriptor, d, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        return m66842c(fieldDescriptor, f, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        return m66840e(fieldDescriptor, i, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        return m66839f(fieldDescriptor, j, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ProtobufDataEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return m66838g(fieldDescriptor, z, true);
    }
}
