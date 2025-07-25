package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.ProtobufEncoder;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class ProtobufEncoder {

    /* renamed from: a */
    private final Map<Class<?>, ObjectEncoder<?>> f43018a;

    /* renamed from: b */
    private final Map<Class<?>, ValueEncoder<?>> f43019b;

    /* renamed from: c */
    private final ObjectEncoder<Object> f43020c;

    ProtobufEncoder(Map<Class<?>, ObjectEncoder<?>> map, Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder) {
        this.f43018a = map;
        this.f43019b = map2;
        this.f43020c = objectEncoder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void encode(@NonNull Object obj, @NonNull OutputStream outputStream) throws IOException {
        new ProtobufDataEncoderContext(outputStream, this.f43018a, this.f43019b, this.f43020c).m66833l(obj);
    }

    /* loaded from: classes4.dex */
    public static final class Builder implements EncoderConfig<Builder> {

        /* renamed from: d */
        private static final ObjectEncoder<Object> f43021d = new ObjectEncoder() { // from class: com.google.firebase.encoders.proto.b
            @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
            public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
                ProtobufEncoder.Builder.m66826b(obj, objectEncoderContext);
            }
        };

        /* renamed from: a */
        private final Map<Class<?>, ObjectEncoder<?>> f43022a = new HashMap();

        /* renamed from: b */
        private final Map<Class<?>, ValueEncoder<?>> f43023b = new HashMap();

        /* renamed from: c */
        private ObjectEncoder<Object> f43024c = f43021d;

        /* renamed from: b */
        public static /* synthetic */ void m66826b(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }

        public ProtobufEncoder build() {
            return new ProtobufEncoder(new HashMap(this.f43022a), new HashMap(this.f43023b), this.f43024c);
        }

        @NonNull
        public Builder configureWith(@NonNull Configurator configurator) {
            configurator.configure(this);
            return this;
        }

        @NonNull
        public Builder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
            this.f43024c = objectEncoder;
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ObjectEncoder<? super U> objectEncoder) {
            this.f43022a.put(cls, objectEncoder);
            this.f43023b.remove(cls);
            return this;
        }

        @Override // com.google.firebase.encoders.config.EncoderConfig
        @NonNull
        public <U> Builder registerEncoder(@NonNull Class<U> cls, @NonNull ValueEncoder<? super U> valueEncoder) {
            this.f43023b.put(cls, valueEncoder);
            this.f43022a.remove(cls);
            return this;
        }
    }

    @NonNull
    public byte[] encode(@NonNull Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            encode(obj, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
