package com.apm.insight.p130l;

import com.ironsource.C21114v8;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.h */
/* loaded from: classes2.dex */
public final class JSONWriter {

    /* renamed from: a */
    private Writer f3926a;

    /* renamed from: b */
    private final List<EnumC3823a> f3927b = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: JSONWriter.java */
    /* renamed from: com.apm.insight.l.h$a */
    /* loaded from: classes2.dex */
    public static final class EnumC3823a {

        /* renamed from: a */
        public static final EnumC3823a f3928a = new EnumC3823a("EMPTY_ARRAY", 0);

        /* renamed from: b */
        public static final EnumC3823a f3929b = new EnumC3823a("NONEMPTY_ARRAY", 1);

        /* renamed from: c */
        public static final EnumC3823a f3930c = new EnumC3823a("EMPTY_OBJECT", 2);

        /* renamed from: d */
        public static final EnumC3823a f3931d = new EnumC3823a("DANGLING_KEY", 3);

        /* renamed from: e */
        public static final EnumC3823a f3932e = new EnumC3823a("NONEMPTY_OBJECT", 4);

        /* renamed from: f */
        public static final EnumC3823a f3933f = new EnumC3823a("NULL", 5);

        private EnumC3823a(String str, int i) {
        }
    }

    private JSONWriter(Writer writer) {
        this.f3926a = writer;
    }

    /* renamed from: a */
    private JSONWriter m101698a() throws JSONException, IOException {
        return m101696a(EnumC3823a.f3928a, C21114v8.C21123i.f54137d);
    }

    /* renamed from: b */
    private JSONWriter m101689b() throws JSONException, IOException {
        EnumC3823a enumC3823a = EnumC3823a.f3928a;
        return m101694a(C21114v8.C21123i.f54139e);
    }

    /* renamed from: c */
    private JSONWriter m101687c() throws JSONException, IOException {
        return m101696a(EnumC3823a.f3930c, "{");
    }

    /* renamed from: d */
    private JSONWriter m101685d() throws JSONException, IOException {
        EnumC3823a enumC3823a = EnumC3823a.f3928a;
        return m101694a("}");
    }

    /* renamed from: e */
    private EnumC3823a m101684e() throws JSONException {
        List<EnumC3823a> list = this.f3927b;
        return list.get(list.size() - 1);
    }

    /* renamed from: f */
    private void m101683f() throws JSONException, IOException {
        if (this.f3927b.isEmpty()) {
            return;
        }
        EnumC3823a m101684e = m101684e();
        if (m101684e == EnumC3823a.f3928a) {
            m101697a(EnumC3823a.f3929b);
        } else if (m101684e == EnumC3823a.f3929b) {
            this.f3926a.write(44);
        } else if (m101684e == EnumC3823a.f3931d) {
            this.f3926a.write(":");
            m101697a(EnumC3823a.f3932e);
        } else if (m101684e == EnumC3823a.f3933f) {
        } else {
            throw new JSONException("Nesting problem");
        }
    }

    public final String toString() {
        return "";
    }

    /* renamed from: a */
    private JSONWriter m101696a(EnumC3823a enumC3823a, String str) throws JSONException, IOException {
        m101683f();
        this.f3927b.add(enumC3823a);
        this.f3926a.write(str);
        return this;
    }

    /* renamed from: b */
    private void m101688b(String str) throws IOException {
        this.f3926a.write("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == '\f') {
                this.f3926a.write("\\f");
            } else if (charAt != '\r') {
                if (charAt != '\"' && charAt != '/' && charAt != '\\') {
                    switch (charAt) {
                        case '\b':
                            this.f3926a.write("\\b");
                            break;
                        case '\t':
                            this.f3926a.write("\\t");
                            break;
                        case '\n':
                            this.f3926a.write("\\n");
                            break;
                        default:
                            if (charAt <= 31) {
                                this.f3926a.write(String.format("\\u%04x", Integer.valueOf(charAt)));
                                break;
                            }
                            break;
                    }
                } else {
                    this.f3926a.write(92);
                }
                this.f3926a.write(charAt);
            } else {
                this.f3926a.write("\\r");
            }
        }
        this.f3926a.write("\"");
    }

    /* renamed from: c */
    private JSONWriter m101686c(String str) throws JSONException, IOException {
        EnumC3823a m101684e = m101684e();
        if (m101684e == EnumC3823a.f3932e) {
            this.f3926a.write(44);
        } else if (m101684e != EnumC3823a.f3930c) {
            throw new JSONException("Nesting problem");
        }
        m101697a(EnumC3823a.f3931d);
        m101688b(str);
        return this;
    }

    /* renamed from: a */
    private JSONWriter m101694a(String str) throws JSONException, IOException {
        m101684e();
        List<EnumC3823a> list = this.f3927b;
        list.remove(list.size() - 1);
        this.f3926a.write(str);
        return this;
    }

    /* renamed from: a */
    private void m101697a(EnumC3823a enumC3823a) {
        List<EnumC3823a> list = this.f3927b;
        list.set(list.size() - 1, enumC3823a);
    }

    /* renamed from: a */
    private JSONWriter m101695a(Object obj) throws JSONException, IOException {
        if (obj instanceof JSONArray) {
            m101693a((JSONArray) obj);
            return this;
        } else if (obj instanceof JSONObject) {
            m101691a((JSONObject) obj);
            return this;
        } else {
            m101683f();
            if (obj != null && obj != JSONObject.NULL) {
                if (obj instanceof Boolean) {
                    this.f3926a.write(String.valueOf(obj));
                } else if (obj instanceof Number) {
                    this.f3926a.write(JSONObject.numberToString((Number) obj));
                } else {
                    m101688b(obj.toString());
                }
            } else {
                this.f3926a.write("null");
            }
            return this;
        }
    }

    /* renamed from: a */
    public static void m101690a(JSONObject jSONObject, Writer writer) throws Throwable {
        new JSONWriter(writer).m101691a(jSONObject);
        writer.flush();
    }

    /* renamed from: a */
    public static void m101692a(JSONArray jSONArray, Writer writer) throws Throwable {
        new JSONWriter(writer).m101693a(jSONArray);
        writer.flush();
    }

    /* renamed from: a */
    private void m101691a(JSONObject jSONObject) throws JSONException, IOException {
        m101687c();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            m101686c(next).m101695a(jSONObject.get(next));
        }
        m101685d();
    }

    /* renamed from: a */
    private void m101693a(JSONArray jSONArray) throws JSONException, IOException {
        m101698a();
        for (int i = 0; i < jSONArray.length(); i++) {
            m101695a(jSONArray.get(i));
        }
        m101689b();
    }
}
