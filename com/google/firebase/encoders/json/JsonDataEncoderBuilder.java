package com.google.firebase.encoders.json;

import androidx.annotation.NonNull;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class JsonDataEncoderBuilder implements EncoderConfig<JsonDataEncoderBuilder> {

    /* renamed from: e */
    private static final ObjectEncoder<Object> f42985e = new ObjectEncoder() { // from class: com.google.firebase.encoders.json.a
        @Override // com.google.firebase.encoders.ObjectEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ObjectEncoderContext objectEncoderContext) {
            JsonDataEncoderBuilder.m66855h(obj, objectEncoderContext);
        }
    };

    /* renamed from: f */
    private static final ValueEncoder<String> f42986f = new ValueEncoder() { // from class: com.google.firebase.encoders.json.b
        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ValueEncoderContext valueEncoderContext) {
            valueEncoderContext.add((String) obj);
        }
    };

    /* renamed from: g */
    private static final ValueEncoder<Boolean> f42987g = new ValueEncoder() { // from class: com.google.firebase.encoders.json.c
        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.Encoder
        public final void encode(Object obj, ValueEncoderContext valueEncoderContext) {
            JsonDataEncoderBuilder.m66853j((Boolean) obj, valueEncoderContext);
        }
    };

    /* renamed from: h */
    private static final TimestampEncoder f42988h = new TimestampEncoder();

    /* renamed from: a */
    private final Map<Class<?>, ObjectEncoder<?>> f42989a = new HashMap();

    /* renamed from: b */
    private final Map<Class<?>, ValueEncoder<?>> f42990b = new HashMap();

    /* renamed from: c */
    private ObjectEncoder<Object> f42991c = f42985e;

    /* renamed from: d */
    private boolean f42992d = false;

    /* loaded from: classes4.dex */
    public static final class TimestampEncoder implements ValueEncoder<Date> {

        /* renamed from: a */
        private static final DateFormat f42994a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f42994a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        private TimestampEncoder() {
        }

        @Override // com.google.firebase.encoders.ValueEncoder, com.google.firebase.encoders.Encoder
        public void encode(@NonNull Date date, @NonNull ValueEncoderContext valueEncoderContext) throws IOException {
            valueEncoderContext.add(f42994a.format(date));
        }
    }

    public JsonDataEncoderBuilder() {
        registerEncoder(String.class, (ValueEncoder) f42986f);
        registerEncoder(Boolean.class, (ValueEncoder) f42987g);
        registerEncoder(Date.class, (ValueEncoder) f42988h);
    }

    /* renamed from: h */
    public static /* synthetic */ void m66855h(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
        throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
    }

    /* renamed from: j */
    public static /* synthetic */ void m66853j(Boolean bool, ValueEncoderContext valueEncoderContext) throws IOException {
        valueEncoderContext.add(bool.booleanValue());
    }

    @NonNull
    public DataEncoder build() {
        return new DataEncoder() { // from class: com.google.firebase.encoders.json.JsonDataEncoderBuilder.1
            {
                JsonDataEncoderBuilder.this = this;
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public void encode(@NonNull Object obj, @NonNull Writer writer) throws IOException {
                JsonValueObjectEncoderContext jsonValueObjectEncoderContext = new JsonValueObjectEncoderContext(writer, JsonDataEncoderBuilder.this.f42989a, JsonDataEncoderBuilder.this.f42990b, JsonDataEncoderBuilder.this.f42991c, JsonDataEncoderBuilder.this.f42992d);
                jsonValueObjectEncoderContext.m66852a(obj, false);
                jsonValueObjectEncoderContext.m66850c();
            }

            @Override // com.google.firebase.encoders.DataEncoder
            public String encode(@NonNull Object obj) {
                StringWriter stringWriter = new StringWriter();
                try {
                    encode(obj, stringWriter);
                } catch (IOException unused) {
                }
                return stringWriter.toString();
            }
        };
    }

    @NonNull
    public JsonDataEncoderBuilder configureWith(@NonNull Configurator configurator) {
        configurator.configure(this);
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder ignoreNullValues(boolean z) {
        this.f42992d = z;
        return this;
    }

    @NonNull
    public JsonDataEncoderBuilder registerFallbackEncoder(@NonNull ObjectEncoder<Object> objectEncoder) {
        this.f42991c = objectEncoder;
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ObjectEncoder<? super T> objectEncoder) {
        this.f42989a.put(cls, objectEncoder);
        this.f42990b.remove(cls);
        return this;
    }

    @Override // com.google.firebase.encoders.config.EncoderConfig
    @NonNull
    public <T> JsonDataEncoderBuilder registerEncoder(@NonNull Class<T> cls, @NonNull ValueEncoder<? super T> valueEncoder) {
        this.f42990b.put(cls, valueEncoder);
        this.f42989a.remove(cls);
        return this;
    }
}
