package com.bykv.p135vk.openvk.preload.p155a.p162d;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* renamed from: com.bykv.vk.openvk.preload.a.d.c */
/* loaded from: classes3.dex */
public final class JsonWriter implements Closeable, Flushable {

    /* renamed from: a */
    private static final String[] f13863a = new String[128];

    /* renamed from: b */
    private static final String[] f13864b;

    /* renamed from: c */
    private final Writer f13865c;

    /* renamed from: d */
    private int[] f13866d = new int[32];

    /* renamed from: e */
    private int f13867e = 0;

    /* renamed from: f */
    private String f13868f;

    /* renamed from: g */
    private boolean f13869g;

    /* renamed from: h */
    private boolean f13870h;

    /* renamed from: i */
    private String f13871i;

    /* renamed from: j */
    private boolean f13872j;

    static {
        for (int i = 0; i <= 31; i++) {
            f13863a[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f13863a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f13864b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        m91519a(6);
        this.f13868f = ":";
        this.f13872j = true;
        if (writer != null) {
            this.f13865c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    /* renamed from: i */
    private int m91498i() {
        int i = this.f13867e;
        if (i != 0) {
            return this.f13866d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: j */
    private void m91497j() throws IOException {
        if (this.f13871i != null) {
            m91496k();
            m91506c(this.f13871i);
            this.f13871i = null;
        }
    }

    /* renamed from: k */
    private void m91496k() throws IOException {
        int m91498i = m91498i();
        if (m91498i == 5) {
            this.f13865c.write(44);
        } else if (m91498i != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m91510b(4);
    }

    /* renamed from: l */
    private void m91495l() throws IOException {
        int m91498i = m91498i();
        if (m91498i != 1) {
            if (m91498i != 2) {
                if (m91498i != 4) {
                    if (m91498i != 6) {
                        if (m91498i == 7) {
                            if (!this.f13869g) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    m91510b(7);
                    return;
                }
                this.f13865c.append((CharSequence) this.f13868f);
                m91510b(5);
                return;
            }
            this.f13865c.append(',');
            return;
        }
        m91510b(2);
    }

    /* renamed from: a */
    public final void m91512a(boolean z) {
        this.f13869g = z;
    }

    /* renamed from: b */
    public final void m91508b(boolean z) {
        this.f13870h = z;
    }

    /* renamed from: c */
    public final void m91505c(boolean z) {
        this.f13872j = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13865c.close();
        int i = this.f13867e;
        if (i <= 1 && (i != 1 || this.f13866d[i - 1] == 7)) {
            this.f13867e = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: d */
    public final JsonWriter m91504d() throws IOException {
        m91497j();
        return m91518a(1, '[');
    }

    /* renamed from: e */
    public final JsonWriter m91502e() throws IOException {
        return m91517a(1, 2, ']');
    }

    /* renamed from: f */
    public final JsonWriter m91501f() throws IOException {
        m91497j();
        return m91518a(3, '{');
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f13867e != 0) {
            this.f13865c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* renamed from: g */
    public final JsonWriter m91500g() throws IOException {
        return m91517a(3, 5, '}');
    }

    /* renamed from: h */
    public final JsonWriter m91499h() throws IOException {
        if (this.f13871i != null) {
            if (this.f13872j) {
                m91497j();
            } else {
                this.f13871i = null;
                return this;
            }
        }
        m91495l();
        this.f13865c.write("null");
        return this;
    }

    /* renamed from: a */
    public final boolean m91520a() {
        return this.f13869g;
    }

    /* renamed from: b */
    public final boolean m91511b() {
        return this.f13870h;
    }

    /* renamed from: c */
    public final boolean m91507c() {
        return this.f13872j;
    }

    /* renamed from: a */
    private JsonWriter m91518a(int i, char c) throws IOException {
        m91495l();
        m91519a(i);
        this.f13865c.write(c);
        return this;
    }

    /* renamed from: b */
    private void m91510b(int i) {
        this.f13866d[this.f13867e - 1] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m91506c(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f13870h
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter.f13864b
            goto L9
        L7:
            java.lang.String[] r0 = com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter.f13863a
        L9:
            java.io.Writer r1 = r8.f13865c
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.794E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f13865c
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f13865c
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f13865c
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f13865c
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.p155a.p162d.JsonWriter.m91506c(java.lang.String):void");
    }

    /* renamed from: d */
    public final JsonWriter m91503d(boolean z) throws IOException {
        m91497j();
        m91495l();
        this.f13865c.write(z ? "true" : "false");
        return this;
    }

    /* renamed from: b */
    public final JsonWriter m91509b(String str) throws IOException {
        if (str == null) {
            return m91499h();
        }
        m91497j();
        m91495l();
        m91506c(str);
        return this;
    }

    /* renamed from: a */
    private JsonWriter m91517a(int i, int i2, char c) throws IOException {
        int m91498i = m91498i();
        if (m91498i != i2 && m91498i != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f13871i == null) {
            this.f13867e--;
            this.f13865c.write(c);
            return this;
        }
        throw new IllegalStateException("Dangling name: " + this.f13871i);
    }

    /* renamed from: a */
    private void m91519a(int i) {
        int i2 = this.f13867e;
        int[] iArr = this.f13866d;
        if (i2 == iArr.length) {
            this.f13866d = Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.f13866d;
        int i3 = this.f13867e;
        this.f13867e = i3 + 1;
        iArr2[i3] = i;
    }

    /* renamed from: a */
    public final JsonWriter m91513a(String str) throws IOException {
        if (str != null) {
            if (this.f13871i == null) {
                if (this.f13867e != 0) {
                    this.f13871i = str;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    /* renamed from: a */
    public final JsonWriter m91515a(Boolean bool) throws IOException {
        if (bool == null) {
            return m91499h();
        }
        m91497j();
        m91495l();
        this.f13865c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    /* renamed from: a */
    public final JsonWriter m91516a(long j) throws IOException {
        m91497j();
        m91495l();
        this.f13865c.write(Long.toString(j));
        return this;
    }

    /* renamed from: a */
    public final JsonWriter m91514a(Number number) throws IOException {
        if (number == null) {
            return m91499h();
        }
        m91497j();
        String obj = number.toString();
        if (!this.f13869g && (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
        }
        m91495l();
        this.f13865c.append((CharSequence) obj);
        return this;
    }
}
