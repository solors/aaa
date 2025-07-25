package com.google.firebase.encoders.json;

import android.util.Base64;
import android.util.JsonWriter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class JsonValueObjectEncoderContext implements ObjectEncoderContext, ValueEncoderContext {

    /* renamed from: a */
    private JsonValueObjectEncoderContext f42995a = null;

    /* renamed from: b */
    private boolean f42996b = true;

    /* renamed from: c */
    private final JsonWriter f42997c;

    /* renamed from: d */
    private final Map<Class<?>, ObjectEncoder<?>> f42998d;

    /* renamed from: e */
    private final Map<Class<?>, ValueEncoder<?>> f42999e;

    /* renamed from: f */
    private final ObjectEncoder<Object> f43000f;

    /* renamed from: g */
    private final boolean f43001g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public JsonValueObjectEncoderContext(@NonNull Writer writer, @NonNull Map<Class<?>, ObjectEncoder<?>> map, @NonNull Map<Class<?>, ValueEncoder<?>> map2, ObjectEncoder<Object> objectEncoder, boolean z) {
        this.f42997c = new JsonWriter(writer);
        this.f42998d = map;
        this.f42999e = map2;
        this.f43000f = objectEncoder;
        this.f43001g = z;
    }

    /* renamed from: b */
    private boolean m66851b(Object obj) {
        if (obj != null && !obj.getClass().isArray() && !(obj instanceof Collection) && !(obj instanceof Date) && !(obj instanceof Enum) && !(obj instanceof Number)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private JsonValueObjectEncoderContext m66848e(@NonNull String str, @Nullable Object obj) throws IOException, EncodingException {
        m66846g();
        this.f42997c.name(str);
        if (obj == null) {
            this.f42997c.nullValue();
            return this;
        }
        return m66852a(obj, false);
    }

    /* renamed from: f */
    private JsonValueObjectEncoderContext m66847f(@NonNull String str, @Nullable Object obj) throws IOException, EncodingException {
        if (obj == null) {
            return this;
        }
        m66846g();
        this.f42997c.name(str);
        return m66852a(obj, false);
    }

    /* renamed from: g */
    private void m66846g() throws IOException {
        if (this.f42996b) {
            JsonValueObjectEncoderContext jsonValueObjectEncoderContext = this.f42995a;
            if (jsonValueObjectEncoderContext != null) {
                jsonValueObjectEncoderContext.m66846g();
                this.f42995a.f42996b = false;
                this.f42995a = null;
                this.f42997c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public JsonValueObjectEncoderContext m66852a(@Nullable Object obj, boolean z) throws IOException {
        int[] iArr;
        Class<?> cls;
        int i = 0;
        if (z && m66851b(obj)) {
            Object[] objArr = new Object[1];
            if (obj == null) {
                cls = null;
            } else {
                cls = obj.getClass();
            }
            objArr[0] = cls;
            throw new EncodingException(String.format("%s cannot be encoded inline", objArr));
        } else if (obj == null) {
            this.f42997c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f42997c.value((Number) obj);
            return this;
        } else if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                return add((byte[]) obj);
            }
            this.f42997c.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    this.f42997c.value(iArr[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    add(jArr[i]);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    this.f42997c.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    this.f42997c.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                for (Number number : (Number[]) obj) {
                    m66852a(number, false);
                }
            } else {
                for (Object obj2 : (Object[]) obj) {
                    m66852a(obj2, false);
                }
            }
            this.f42997c.endArray();
            return this;
        } else if (obj instanceof Collection) {
            this.f42997c.beginArray();
            for (Object obj3 : (Collection) obj) {
                m66852a(obj3, false);
            }
            this.f42997c.endArray();
            return this;
        } else if (obj instanceof Map) {
            this.f42997c.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    add((String) key, entry.getValue());
                } catch (ClassCastException e) {
                    throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            this.f42997c.endObject();
            return this;
        } else {
            ObjectEncoder<?> objectEncoder = this.f42998d.get(obj.getClass());
            if (objectEncoder != null) {
                return m66849d(objectEncoder, obj, z);
            }
            ValueEncoder<?> valueEncoder = this.f42999e.get(obj.getClass());
            if (valueEncoder != null) {
                valueEncoder.encode(obj, this);
                return this;
            } else if (obj instanceof Enum) {
                if (obj instanceof NumberedEnum) {
                    add(((NumberedEnum) obj).getNumber());
                } else {
                    add(((Enum) obj).name());
                }
                return this;
            } else {
                return m66849d(this.f43000f, obj, z);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m66850c() throws IOException {
        m66846g();
        this.f42997c.flush();
    }

    /* renamed from: d */
    JsonValueObjectEncoderContext m66849d(ObjectEncoder<Object> objectEncoder, Object obj, boolean z) throws IOException {
        if (!z) {
            this.f42997c.beginObject();
        }
        objectEncoder.encode(obj, this);
        if (!z) {
            this.f42997c.endObject();
        }
        return this;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext inline(@Nullable Object obj) throws IOException {
        return m66852a(obj, true);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull String str) throws IOException {
        m66846g();
        this.f42995a = new JsonValueObjectEncoderContext(this);
        this.f42997c.name(str);
        this.f42997c.beginObject();
        return this.f42995a;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext nested(@NonNull FieldDescriptor fieldDescriptor) throws IOException {
        return nested(fieldDescriptor.getName());
    }

    private JsonValueObjectEncoderContext(JsonValueObjectEncoderContext jsonValueObjectEncoderContext) {
        this.f42997c = jsonValueObjectEncoderContext.f42997c;
        this.f42998d = jsonValueObjectEncoderContext.f42998d;
        this.f42999e = jsonValueObjectEncoderContext.f42999e;
        this.f43000f = jsonValueObjectEncoderContext.f43000f;
        this.f43001g = jsonValueObjectEncoderContext.f43001g;
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, @Nullable Object obj) throws IOException {
        if (this.f43001g) {
            return m66847f(str, obj);
        }
        return m66848e(str, obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, double d) throws IOException {
        m66846g();
        this.f42997c.name(str);
        return add(d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, int i) throws IOException {
        m66846g();
        this.f42997c.name(str);
        return add(i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, long j) throws IOException {
        m66846g();
        this.f42997c.name(str);
        return add(j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@NonNull String str, boolean z) throws IOException {
        m66846g();
        this.f42997c.name(str);
        return add(z);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, @Nullable Object obj) throws IOException {
        return add(fieldDescriptor.getName(), obj);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, float f) throws IOException {
        return add(fieldDescriptor.getName(), f);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, double d) throws IOException {
        return add(fieldDescriptor.getName(), d);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, int i) throws IOException {
        return add(fieldDescriptor.getName(), i);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, long j) throws IOException {
        return add(fieldDescriptor.getName(), j);
    }

    @Override // com.google.firebase.encoders.ObjectEncoderContext
    @NonNull
    public ObjectEncoderContext add(@NonNull FieldDescriptor fieldDescriptor, boolean z) throws IOException {
        return add(fieldDescriptor.getName(), z);
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable String str) throws IOException {
        m66846g();
        this.f42997c.value(str);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(float f) throws IOException {
        m66846g();
        this.f42997c.value(f);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(double d) throws IOException {
        m66846g();
        this.f42997c.value(d);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(int i) throws IOException {
        m66846g();
        this.f42997c.value(i);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(long j) throws IOException {
        m66846g();
        this.f42997c.value(j);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(boolean z) throws IOException {
        m66846g();
        this.f42997c.value(z);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    @NonNull
    public JsonValueObjectEncoderContext add(@Nullable byte[] bArr) throws IOException {
        m66846g();
        if (bArr == null) {
            this.f42997c.nullValue();
        } else {
            this.f42997c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }
}
