package com.bykv.p135vk.openvk.preload.p155a.p157b.p158a;

import com.bykv.p135vk.openvk.preload.p155a.JsonArray;
import com.bykv.p135vk.openvk.preload.p155a.JsonNull;
import com.bykv.p135vk.openvk.preload.p155a.JsonObject;
import com.bykv.p135vk.openvk.preload.p155a.JsonPrimitive;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader;
import com.bykv.p135vk.openvk.preload.p155a.p162d.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.bykv.vk.openvk.preload.a.b.a.e */
/* loaded from: classes3.dex */
public final class JsonTreeReader extends JsonReader {

    /* renamed from: b */
    private static final Object f13618b;

    /* renamed from: c */
    private Object[] f13619c;

    /* renamed from: d */
    private int f13620d;

    /* renamed from: e */
    private String[] f13621e;

    /* renamed from: f */
    private int[] f13622f;

    static {
        new Reader() { // from class: com.bykv.vk.openvk.preload.a.b.a.e.1
            @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                throw new AssertionError();
            }

            @Override // java.io.Reader
            public final int read(char[] cArr, int i, int i2) throws IOException {
                throw new AssertionError();
            }
        };
        f13618b = new Object();
    }

    /* renamed from: t */
    private Object m91637t() {
        return this.f13619c[this.f13620d - 1];
    }

    /* renamed from: u */
    private Object m91636u() {
        Object[] objArr = this.f13619c;
        int i = this.f13620d - 1;
        this.f13620d = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: v */
    private String m91635v() {
        return " at path " + mo91532p();
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: a */
    public final void mo91557a() throws IOException {
        m91640a(JsonToken.BEGIN_ARRAY);
        m91639a(((JsonArray) m91637t()).iterator());
        this.f13622f[this.f13620d - 1] = 0;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: b */
    public final void mo91551b() throws IOException {
        m91640a(JsonToken.END_ARRAY);
        m91636u();
        m91636u();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: c */
    public final void mo91546c() throws IOException {
        m91640a(JsonToken.BEGIN_OBJECT);
        m91639a(((JsonObject) m91637t()).m91489g().iterator());
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13619c = new Object[]{f13618b};
        this.f13620d = 1;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: d */
    public final void mo91544d() throws IOException {
        m91640a(JsonToken.END_OBJECT);
        m91636u();
        m91636u();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: e */
    public final boolean mo91543e() throws IOException {
        JsonToken mo91542f = mo91542f();
        if (mo91542f != JsonToken.END_OBJECT && mo91542f != JsonToken.END_ARRAY) {
            return true;
        }
        return false;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: f */
    public final JsonToken mo91542f() throws IOException {
        while (this.f13620d != 0) {
            Object m91637t = m91637t();
            if (m91637t instanceof Iterator) {
                boolean z = this.f13619c[this.f13620d - 2] instanceof JsonObject;
                Iterator it = (Iterator) m91637t;
                if (it.hasNext()) {
                    if (z) {
                        return JsonToken.NAME;
                    }
                    m91639a(it.next());
                } else if (z) {
                    return JsonToken.END_OBJECT;
                } else {
                    return JsonToken.END_ARRAY;
                }
            } else if (m91637t instanceof JsonObject) {
                return JsonToken.BEGIN_OBJECT;
            } else {
                if (m91637t instanceof JsonArray) {
                    return JsonToken.BEGIN_ARRAY;
                }
                if (m91637t instanceof JsonPrimitive) {
                    JsonPrimitive jsonPrimitive = (JsonPrimitive) m91637t;
                    if (jsonPrimitive.m91479i()) {
                        return JsonToken.STRING;
                    }
                    if (jsonPrimitive.m91481g()) {
                        return JsonToken.BOOLEAN;
                    }
                    if (jsonPrimitive.m91480h()) {
                        return JsonToken.NUMBER;
                    }
                    throw new AssertionError();
                } else if (m91637t instanceof JsonNull) {
                    return JsonToken.NULL;
                } else {
                    if (m91637t == f13618b) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return JsonToken.END_DOCUMENT;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: g */
    public final String mo91541g() throws IOException {
        m91640a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m91637t()).next();
        String str = (String) entry.getKey();
        this.f13621e[this.f13620d - 1] = str;
        m91639a(entry.getValue());
        return str;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: h */
    public final String mo91540h() throws IOException {
        JsonToken mo91542f = mo91542f();
        JsonToken jsonToken = JsonToken.STRING;
        if (mo91542f != jsonToken && mo91542f != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo91542f + m91635v());
        }
        String mo91486b = ((JsonPrimitive) m91636u()).mo91486b();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo91486b;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: i */
    public final boolean mo91539i() throws IOException {
        m91640a(JsonToken.BOOLEAN);
        boolean mo91482f = ((JsonPrimitive) m91636u()).mo91482f();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo91482f;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: j */
    public final void mo91538j() throws IOException {
        m91640a(JsonToken.NULL);
        m91636u();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: k */
    public final double mo91537k() throws IOException {
        JsonToken mo91542f = mo91542f();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (mo91542f != jsonToken && mo91542f != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo91542f + m91635v());
        }
        double mo91485c = ((JsonPrimitive) m91637t()).mo91485c();
        if (!m91531q() && (Double.isNaN(mo91485c) || Double.isInfinite(mo91485c))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(mo91485c)));
        }
        m91636u();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo91485c;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: l */
    public final long mo91536l() throws IOException {
        JsonToken mo91542f = mo91542f();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (mo91542f != jsonToken && mo91542f != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo91542f + m91635v());
        }
        long mo91484d = ((JsonPrimitive) m91637t()).mo91484d();
        m91636u();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo91484d;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: m */
    public final int mo91535m() throws IOException {
        JsonToken mo91542f = mo91542f();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (mo91542f != jsonToken && mo91542f != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + mo91542f + m91635v());
        }
        int mo91483e = ((JsonPrimitive) m91637t()).mo91483e();
        m91636u();
        int i = this.f13620d;
        if (i > 0) {
            int[] iArr = this.f13622f;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo91483e;
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: n */
    public final void mo91534n() throws IOException {
        if (mo91542f() == JsonToken.NAME) {
            mo91541g();
            this.f13621e[this.f13620d - 2] = "null";
        } else {
            m91636u();
            int i = this.f13620d;
            if (i > 0) {
                this.f13621e[i - 1] = "null";
            }
        }
        int i2 = this.f13620d;
        if (i2 > 0) {
            int[] iArr = this.f13622f;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    /* renamed from: o */
    public final void m91638o() throws IOException {
        m91640a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m91637t()).next();
        m91639a(entry.getValue());
        m91639a(new JsonPrimitive((String) entry.getKey()));
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    /* renamed from: p */
    public final String mo91532p() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = 0;
        while (i < this.f13620d) {
            Object[] objArr = this.f13619c;
            Object obj = objArr[i];
            if (obj instanceof JsonArray) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('[');
                    sb2.append(this.f13622f[i]);
                    sb2.append(']');
                }
            } else if (obj instanceof JsonObject) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb2.append('.');
                    String str = this.f13621e[i];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            }
            i++;
        }
        return sb2.toString();
    }

    @Override // com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader
    public final String toString() {
        return JsonTreeReader.class.getSimpleName();
    }

    /* renamed from: a */
    private void m91640a(JsonToken jsonToken) throws IOException {
        if (mo91542f() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + mo91542f() + m91635v());
    }

    /* renamed from: a */
    private void m91639a(Object obj) {
        int i = this.f13620d;
        Object[] objArr = this.f13619c;
        if (i == objArr.length) {
            int i2 = i << 1;
            this.f13619c = Arrays.copyOf(objArr, i2);
            this.f13622f = Arrays.copyOf(this.f13622f, i2);
            this.f13621e = (String[]) Arrays.copyOf(this.f13621e, i2);
        }
        Object[] objArr2 = this.f13619c;
        int i3 = this.f13620d;
        this.f13620d = i3 + 1;
        objArr2[i3] = obj;
    }
}
