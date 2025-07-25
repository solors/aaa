package com.bykv.p135vk.openvk.preload.p155a.p162d;

import com.bykv.p135vk.openvk.preload.p155a.p157b.JsonReaderInternalAccess;
import com.bykv.p135vk.openvk.preload.p155a.p157b.p158a.JsonTreeReader;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* renamed from: com.bykv.vk.openvk.preload.a.d.a */
/* loaded from: classes3.dex */
public class JsonReader implements Closeable {

    /* renamed from: b */
    private final Reader f13838b;

    /* renamed from: i */
    private long f13845i;

    /* renamed from: j */
    private int f13846j;

    /* renamed from: k */
    private String f13847k;

    /* renamed from: l */
    private int[] f13848l;

    /* renamed from: n */
    private String[] f13850n;

    /* renamed from: o */
    private int[] f13851o;

    /* renamed from: c */
    private boolean f13839c = false;

    /* renamed from: d */
    private final char[] f13840d = new char[1024];

    /* renamed from: e */
    private int f13841e = 0;

    /* renamed from: f */
    private int f13842f = 0;

    /* renamed from: g */
    private int f13843g = 0;

    /* renamed from: h */
    private int f13844h = 0;

    /* renamed from: a */
    int f13837a = 0;

    /* renamed from: m */
    private int f13849m = 0 + 1;

    static {
        JsonReaderInternalAccess.f13775a = new JsonReaderInternalAccess() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.p135vk.openvk.preload.p155a.p157b.JsonReaderInternalAccess
            /* renamed from: a */
            public final void mo91522a(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).m91638o();
                    return;
                }
                int i = jsonReader.f13837a;
                if (i == 0) {
                    i = jsonReader.m91530r();
                }
                if (i == 13) {
                    jsonReader.f13837a = 9;
                } else if (i == 12) {
                    jsonReader.f13837a = 8;
                } else if (i == 14) {
                    jsonReader.f13837a = 10;
                } else {
                    throw new IllegalStateException("Expected a name but was " + jsonReader.mo91542f() + jsonReader.m91529s());
                }
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.f13848l = iArr;
        iArr[0] = 6;
        this.f13850n = new String[32];
        this.f13851o = new int[32];
        if (reader != null) {
            this.f13838b = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: o */
    private int m91533o() throws IOException {
        String str;
        String str2;
        int i;
        char c = this.f13840d[this.f13841e];
        if (c != 't' && c != 'T') {
            if (c != 'f' && c != 'F') {
                if (c != 'n' && c != 'N') {
                    return 0;
                }
                str = "null";
                str2 = "NULL";
                i = 7;
            } else {
                str = "false";
                str2 = "FALSE";
                i = 6;
            }
        } else {
            str = "true";
            str2 = "TRUE";
            i = 5;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.f13841e + i2 >= this.f13842f && !m91549b(i2 + 1)) {
                return 0;
            }
            char c2 = this.f13840d[this.f13841e + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.f13841e + length < this.f13842f || m91549b(length + 1)) && m91556a(this.f13840d[this.f13841e + length])) {
            return 0;
        }
        this.f13841e += length;
        this.f13837a = i;
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0090, code lost:
        if (m91556a(r14) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0092, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0094, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0096, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009c, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009e, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a4, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a6, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a8, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ac, code lost:
        r18.f13845i = r11;
        r18.f13841e += r8;
        r18.f13837a = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00b8, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00bb, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00be, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00c1, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c3, code lost:
        r18.f13846j = r8;
        r18.f13837a = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
        return 16;
     */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int m91528t() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader.m91528t():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        m91526v();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0089  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m91527u() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r6.f13841e
            int r4 = r3 + r2
            int r5 = r6.f13842f
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f13840d
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5b
            r4 = 10
            if (r3 == r4) goto L5b
            r4 = 12
            if (r3 == r4) goto L5b
            r4 = 13
            if (r3 == r4) goto L5b
            r4 = 32
            if (r3 == r4) goto L5b
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5b
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5b
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5b
            r4 = 58
            if (r3 == r4) goto L5b
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5b;
                case 92: goto L4a;
                case 93: goto L5b;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.m91526v()
            goto L5b
        L4e:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5d
            int r3 = r2 + 1
            boolean r3 = r6.m91549b(r3)
            if (r3 == 0) goto L5b
            goto L3
        L5b:
            r1 = r2
            goto L7d
        L5d:
            if (r0 != 0) goto L6a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L6a:
            char[] r3 = r6.f13840d
            int r4 = r6.f13841e
            r0.append(r3, r4, r2)
            int r3 = r6.f13841e
            int r3 = r3 + r2
            r6.f13841e = r3
            r2 = 1
            boolean r2 = r6.m91549b(r2)
            if (r2 != 0) goto L2
        L7d:
            if (r0 != 0) goto L89
            java.lang.String r0 = new java.lang.String
            char[] r2 = r6.f13840d
            int r3 = r6.f13841e
            r0.<init>(r2, r3, r1)
            goto L94
        L89:
            char[] r2 = r6.f13840d
            int r3 = r6.f13841e
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L94:
            int r2 = r6.f13841e
            int r2 = r2 + r1
            r6.f13841e = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.p155a.p162d.JsonReader.m91527u():java.lang.String");
    }

    /* renamed from: v */
    private void m91526v() throws IOException {
        if (this.f13839c) {
            return;
        }
        throw m91548b("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    /* renamed from: w */
    private void m91525w() throws IOException {
        char c;
        do {
            if (this.f13841e < this.f13842f || m91549b(1)) {
                char[] cArr = this.f13840d;
                int i = this.f13841e;
                int i2 = i + 1;
                this.f13841e = i2;
                c = cArr[i];
                if (c == '\n') {
                    this.f13843g++;
                    this.f13844h = i2;
                    return;
                }
            } else {
                return;
            }
        } while (c != '\r');
    }

    /* renamed from: x */
    private char m91524x() throws IOException {
        int i;
        int i2;
        if (this.f13841e == this.f13842f && !m91549b(1)) {
            throw m91548b("Unterminated escape sequence");
        }
        char[] cArr = this.f13840d;
        int i3 = this.f13841e;
        int i4 = i3 + 1;
        this.f13841e = i4;
        char c = cArr[i3];
        if (c != '\n') {
            if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
                if (c != 'b') {
                    if (c != 'f') {
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c != 'r') {
                            if (c != 't') {
                                if (c == 'u') {
                                    if (i4 + 4 > this.f13842f && !m91549b(4)) {
                                        throw m91548b("Unterminated escape sequence");
                                    }
                                    int i5 = this.f13841e;
                                    int i6 = i5 + 4;
                                    char c2 = 0;
                                    while (i5 < i6) {
                                        char c3 = this.f13840d[i5];
                                        char c4 = (char) (c2 << 4);
                                        if (c3 >= '0' && c3 <= '9') {
                                            i2 = c3 - '0';
                                        } else {
                                            if (c3 >= 'a' && c3 <= 'f') {
                                                i = c3 - 'a';
                                            } else if (c3 >= 'A' && c3 <= 'F') {
                                                i = c3 - 'A';
                                            } else {
                                                throw new NumberFormatException("\\u" + new String(this.f13840d, this.f13841e, 4));
                                            }
                                            i2 = i + 10;
                                        }
                                        c2 = (char) (c4 + i2);
                                        i5++;
                                    }
                                    this.f13841e += 4;
                                    return c2;
                                }
                                throw m91548b("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
        } else {
            this.f13843g++;
            this.f13844h = i4;
        }
        return c;
    }

    /* renamed from: y */
    private void m91523y() throws IOException {
        m91547b(true);
        int i = this.f13841e - 1;
        this.f13841e = i;
        if (i + 5 > this.f13842f && !m91549b(5)) {
            return;
        }
        char[] cArr = this.f13840d;
        if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == '\n') {
            this.f13841e += 5;
        }
    }

    /* renamed from: a */
    public final void m91552a(boolean z) {
        this.f13839c = z;
    }

    /* renamed from: b */
    public void mo91551b() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 4) {
            int i2 = this.f13849m - 1;
            this.f13849m = i2;
            int[] iArr = this.f13851o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f13837a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + mo91542f() + m91529s());
    }

    /* renamed from: c */
    public void mo91546c() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 1) {
            m91555a(3);
            this.f13837a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + mo91542f() + m91529s());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f13837a = 0;
        this.f13848l[0] = 8;
        this.f13849m = 1;
        this.f13838b.close();
    }

    /* renamed from: d */
    public void mo91544d() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 2) {
            int i2 = this.f13849m - 1;
            this.f13849m = i2;
            this.f13850n[i2] = null;
            int[] iArr = this.f13851o;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.f13837a = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + mo91542f() + m91529s());
    }

    /* renamed from: e */
    public boolean mo91543e() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i != 2 && i != 4) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public JsonToken mo91542f() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: g */
    public String mo91541g() throws IOException {
        String m91550b;
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 14) {
            m91550b = m91527u();
        } else if (i == 12) {
            m91550b = m91550b('\'');
        } else if (i == 13) {
            m91550b = m91550b('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + mo91542f() + m91529s());
        }
        this.f13837a = 0;
        this.f13850n[this.f13849m - 1] = m91550b;
        return m91550b;
    }

    /* renamed from: h */
    public String mo91540h() throws IOException {
        String str;
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 10) {
            str = m91527u();
        } else if (i == 8) {
            str = m91550b('\'');
        } else if (i == 9) {
            str = m91550b('\"');
        } else if (i == 11) {
            str = this.f13847k;
            this.f13847k = null;
        } else if (i == 15) {
            str = Long.toString(this.f13845i);
        } else if (i == 16) {
            str = new String(this.f13840d, this.f13841e, this.f13846j);
            this.f13841e += this.f13846j;
        } else {
            throw new IllegalStateException("Expected a string but was " + mo91542f() + m91529s());
        }
        this.f13837a = 0;
        int[] iArr = this.f13851o;
        int i2 = this.f13849m - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* renamed from: i */
    public boolean mo91539i() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 5) {
            this.f13837a = 0;
            int[] iArr = this.f13851o;
            int i2 = this.f13849m - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.f13837a = 0;
            int[] iArr2 = this.f13851o;
            int i3 = this.f13849m - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + mo91542f() + m91529s());
        }
    }

    /* renamed from: j */
    public void mo91538j() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 7) {
            this.f13837a = 0;
            int[] iArr = this.f13851o;
            int i2 = this.f13849m - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + mo91542f() + m91529s());
    }

    /* renamed from: k */
    public double mo91537k() throws IOException {
        char c;
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 15) {
            this.f13837a = 0;
            int[] iArr = this.f13851o;
            int i2 = this.f13849m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f13845i;
        }
        if (i == 16) {
            this.f13847k = new String(this.f13840d, this.f13841e, this.f13846j);
            this.f13841e += this.f13846j;
        } else if (i != 8 && i != 9) {
            if (i == 10) {
                this.f13847k = m91527u();
            } else if (i != 11) {
                throw new IllegalStateException("Expected a double but was " + mo91542f() + m91529s());
            }
        } else {
            if (i == 8) {
                c = '\'';
            } else {
                c = '\"';
            }
            this.f13847k = m91550b(c);
        }
        this.f13837a = 11;
        double parseDouble = Double.parseDouble(this.f13847k);
        if (!this.f13839c && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + m91529s());
        }
        this.f13847k = null;
        this.f13837a = 0;
        int[] iArr2 = this.f13851o;
        int i3 = this.f13849m - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    /* renamed from: l */
    public long mo91536l() throws IOException {
        char c;
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 15) {
            this.f13837a = 0;
            int[] iArr = this.f13851o;
            int i2 = this.f13849m - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f13845i;
        }
        if (i == 16) {
            this.f13847k = new String(this.f13840d, this.f13841e, this.f13846j);
            this.f13841e += this.f13846j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected a long but was " + mo91542f() + m91529s());
        } else {
            if (i == 10) {
                this.f13847k = m91527u();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f13847k = m91550b(c);
            }
            try {
                long parseLong = Long.parseLong(this.f13847k);
                this.f13837a = 0;
                int[] iArr2 = this.f13851o;
                int i3 = this.f13849m - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f13837a = 11;
        double parseDouble = Double.parseDouble(this.f13847k);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.f13847k = null;
            this.f13837a = 0;
            int[] iArr3 = this.f13851o;
            int i4 = this.f13849m - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.f13847k + m91529s());
    }

    /* renamed from: m */
    public int mo91535m() throws IOException {
        char c;
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 15) {
            long j = this.f13845i;
            int i2 = (int) j;
            if (j == i2) {
                this.f13837a = 0;
                int[] iArr = this.f13851o;
                int i3 = this.f13849m - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.f13845i + m91529s());
        }
        if (i == 16) {
            this.f13847k = new String(this.f13840d, this.f13841e, this.f13846j);
            this.f13841e += this.f13846j;
        } else if (i != 8 && i != 9 && i != 10) {
            throw new IllegalStateException("Expected an int but was " + mo91542f() + m91529s());
        } else {
            if (i == 10) {
                this.f13847k = m91527u();
            } else {
                if (i == 8) {
                    c = '\'';
                } else {
                    c = '\"';
                }
                this.f13847k = m91550b(c);
            }
            try {
                int parseInt = Integer.parseInt(this.f13847k);
                this.f13837a = 0;
                int[] iArr2 = this.f13851o;
                int i4 = this.f13849m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f13837a = 11;
        double parseDouble = Double.parseDouble(this.f13847k);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.f13847k = null;
            this.f13837a = 0;
            int[] iArr3 = this.f13851o;
            int i6 = this.f13849m - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.f13847k + m91529s());
    }

    /* renamed from: n */
    public void mo91534n() throws IOException {
        int i = 0;
        do {
            int i2 = this.f13837a;
            if (i2 == 0) {
                i2 = m91530r();
            }
            if (i2 == 3) {
                m91555a(1);
            } else if (i2 == 1) {
                m91555a(3);
            } else {
                if (i2 == 4) {
                    this.f13849m--;
                } else if (i2 == 2) {
                    this.f13849m--;
                } else {
                    if (i2 != 14 && i2 != 10) {
                        if (i2 != 8 && i2 != 12) {
                            if (i2 != 9 && i2 != 13) {
                                if (i2 == 16) {
                                    this.f13841e += this.f13846j;
                                }
                            } else {
                                m91545c('\"');
                            }
                        } else {
                            m91545c('\'');
                        }
                    } else {
                        do {
                            int i3 = 0;
                            while (true) {
                                int i4 = this.f13841e;
                                if (i4 + i3 < this.f13842f) {
                                    char c = this.f13840d[i4 + i3];
                                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                        if (c != '#') {
                                            if (c != ',') {
                                                if (c != '/' && c != '=') {
                                                    if (c != '{' && c != '}' && c != ':') {
                                                        if (c != ';') {
                                                            switch (c) {
                                                                case '[':
                                                                case ']':
                                                                    break;
                                                                case '\\':
                                                                    break;
                                                                default:
                                                                    i3++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    this.f13841e = i4 + i3;
                                }
                            }
                            m91526v();
                            this.f13841e += i3;
                        } while (m91549b(1));
                    }
                    this.f13837a = 0;
                }
                i--;
                this.f13837a = 0;
            }
            i++;
            this.f13837a = 0;
        } while (i != 0);
        int[] iArr = this.f13851o;
        int i5 = this.f13849m;
        int i6 = i5 - 1;
        iArr[i6] = iArr[i6] + 1;
        this.f13850n[i5 - 1] = "null";
    }

    /* renamed from: p */
    public String mo91532p() {
        StringBuilder sb2 = new StringBuilder("$");
        int i = this.f13849m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.f13848l[i2];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3 || i3 == 4 || i3 == 5) {
                    sb2.append('.');
                    String str = this.f13850n[i2];
                    if (str != null) {
                        sb2.append(str);
                    }
                }
            } else {
                sb2.append('[');
                sb2.append(this.f13851o[i2]);
                sb2.append(']');
            }
        }
        return sb2.toString();
    }

    /* renamed from: q */
    public final boolean m91531q() {
        return this.f13839c;
    }

    /* renamed from: r */
    final int m91530r() throws IOException {
        int m91547b;
        int[] iArr = this.f13848l;
        int i = this.f13849m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int m91547b2 = m91547b(true);
            if (m91547b2 != 44) {
                if (m91547b2 != 59) {
                    if (m91547b2 == 93) {
                        this.f13837a = 4;
                        return 4;
                    }
                    throw m91548b("Unterminated array");
                }
                m91526v();
            }
        } else if (i2 != 3 && i2 != 5) {
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int m91547b3 = m91547b(true);
                if (m91547b3 != 58) {
                    if (m91547b3 == 61) {
                        m91526v();
                        if (this.f13841e < this.f13842f || m91549b(1)) {
                            char[] cArr = this.f13840d;
                            int i3 = this.f13841e;
                            if (cArr[i3] == '>') {
                                this.f13841e = i3 + 1;
                            }
                        }
                    } else {
                        throw m91548b("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.f13839c) {
                    m91523y();
                }
                this.f13848l[this.f13849m - 1] = 7;
            } else if (i2 == 7) {
                if (m91547b(false) == -1) {
                    this.f13837a = 17;
                    return 17;
                }
                m91526v();
                this.f13841e--;
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        } else {
            iArr[i - 1] = 4;
            if (i2 == 5 && (m91547b = m91547b(true)) != 44) {
                if (m91547b != 59) {
                    if (m91547b == 125) {
                        this.f13837a = 2;
                        return 2;
                    }
                    throw m91548b("Unterminated object");
                }
                m91526v();
            }
            int m91547b4 = m91547b(true);
            if (m91547b4 != 34) {
                if (m91547b4 != 39) {
                    if (m91547b4 != 125) {
                        m91526v();
                        this.f13841e--;
                        if (m91556a((char) m91547b4)) {
                            this.f13837a = 14;
                            return 14;
                        }
                        throw m91548b("Expected name");
                    } else if (i2 != 5) {
                        this.f13837a = 2;
                        return 2;
                    } else {
                        throw m91548b("Expected name");
                    }
                }
                m91526v();
                this.f13837a = 12;
                return 12;
            }
            this.f13837a = 13;
            return 13;
        }
        int m91547b5 = m91547b(true);
        if (m91547b5 != 34) {
            if (m91547b5 != 39) {
                if (m91547b5 != 44 && m91547b5 != 59) {
                    if (m91547b5 != 91) {
                        if (m91547b5 != 93) {
                            if (m91547b5 != 123) {
                                this.f13841e--;
                                int m91533o = m91533o();
                                if (m91533o != 0) {
                                    return m91533o;
                                }
                                int m91528t = m91528t();
                                if (m91528t != 0) {
                                    return m91528t;
                                }
                                if (m91556a(this.f13840d[this.f13841e])) {
                                    m91526v();
                                    this.f13837a = 10;
                                    return 10;
                                }
                                throw m91548b("Expected value");
                            }
                            this.f13837a = 1;
                            return 1;
                        } else if (i2 == 1) {
                            this.f13837a = 4;
                            return 4;
                        }
                    } else {
                        this.f13837a = 3;
                        return 3;
                    }
                }
                if (i2 != 1 && i2 != 2) {
                    throw m91548b("Unexpected value");
                }
                m91526v();
                this.f13841e--;
                this.f13837a = 7;
                return 7;
            }
            m91526v();
            this.f13837a = 8;
            return 8;
        }
        this.f13837a = 9;
        return 9;
    }

    /* renamed from: s */
    final String m91529s() {
        return " at line " + (this.f13843g + 1) + " column " + ((this.f13841e - this.f13844h) + 1) + " path " + mo91532p();
    }

    public String toString() {
        return getClass().getSimpleName() + m91529s();
    }

    /* renamed from: a */
    public void mo91557a() throws IOException {
        int i = this.f13837a;
        if (i == 0) {
            i = m91530r();
        }
        if (i == 3) {
            m91555a(1);
            this.f13851o[this.f13849m - 1] = 0;
            this.f13837a = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + mo91542f() + m91529s());
    }

    /* renamed from: c */
    private void m91545c(char c) throws IOException {
        char[] cArr = this.f13840d;
        while (true) {
            int i = this.f13841e;
            int i2 = this.f13842f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.f13841e = i3;
                        return;
                    } else if (c2 == '\\') {
                        this.f13841e = i3;
                        m91524x();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.f13843g++;
                            this.f13844h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.f13841e = i;
                    if (!m91549b(1)) {
                        throw m91548b("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private String m91550b(char c) throws IOException {
        char[] cArr = this.f13840d;
        StringBuilder sb2 = null;
        while (true) {
            int i = this.f13841e;
            int i2 = this.f13842f;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.f13841e = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb2 == null) {
                            return new String(cArr, i, i5);
                        }
                        sb2.append(cArr, i, i5);
                        return sb2.toString();
                    } else if (c2 == '\\') {
                        this.f13841e = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb2 == null) {
                            sb2 = new StringBuilder(Math.max((i6 + 1) << 1, 16));
                        }
                        sb2.append(cArr, i, i6);
                        sb2.append(m91524x());
                    } else {
                        if (c2 == '\n') {
                            this.f13843g++;
                            this.f13844h = i4;
                        }
                        i3 = i4;
                    }
                } else {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max((i3 - i) << 1, 16));
                    }
                    sb2.append(cArr, i, i3 - i);
                    this.f13841e = i3;
                    if (!m91549b(1)) {
                        throw m91548b("Unterminated string");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m91556a(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m91526v();
        return false;
    }

    /* renamed from: a */
    private void m91555a(int i) {
        int i2 = this.f13849m;
        int[] iArr = this.f13848l;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.f13848l = Arrays.copyOf(iArr, i3);
            this.f13851o = Arrays.copyOf(this.f13851o, i3);
            this.f13850n = (String[]) Arrays.copyOf(this.f13850n, i3);
        }
        int[] iArr2 = this.f13848l;
        int i4 = this.f13849m;
        this.f13849m = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: a */
    private boolean m91553a(String str) throws IOException {
        int i;
        int length = str.length();
        while (true) {
            if (this.f13841e + length > this.f13842f && !m91549b(length)) {
                return false;
            }
            char[] cArr = this.f13840d;
            int i2 = this.f13841e;
            if (cArr[i2] != '\n') {
                while (i < length) {
                    i = this.f13840d[this.f13841e + i] == str.charAt(i) ? i + 1 : 0;
                }
                return true;
            }
            this.f13843g++;
            this.f13844h = i2 + 1;
            this.f13841e++;
        }
    }

    /* renamed from: b */
    private boolean m91549b(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.f13840d;
        int i4 = this.f13844h;
        int i5 = this.f13841e;
        this.f13844h = i4 - i5;
        int i6 = this.f13842f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f13842f = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f13842f = 0;
        }
        this.f13841e = 0;
        do {
            Reader reader = this.f13838b;
            int i8 = this.f13842f;
            int read = reader.read(cArr, i8, 1024 - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f13842f + read;
            this.f13842f = i2;
            if (this.f13843g == 0 && (i3 = this.f13844h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f13841e++;
                this.f13844h = i3 + 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: b */
    private int m91547b(boolean z) throws IOException {
        char[] cArr = this.f13840d;
        int i = this.f13841e;
        int i2 = this.f13842f;
        while (true) {
            if (i == i2) {
                this.f13841e = i;
                if (!m91549b(1)) {
                    if (z) {
                        throw new EOFException("End of input" + m91529s());
                    }
                    return -1;
                }
                i = this.f13841e;
                i2 = this.f13842f;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.f13843g++;
                this.f13844h = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.f13841e = i3;
                    if (i3 == i2) {
                        this.f13841e = i3 - 1;
                        boolean m91549b = m91549b(2);
                        this.f13841e++;
                        if (!m91549b) {
                            return c;
                        }
                    }
                    m91526v();
                    int i4 = this.f13841e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.f13841e = i4 + 1;
                        if (m91553a("*/")) {
                            i = this.f13841e + 2;
                            i2 = this.f13842f;
                        } else {
                            throw m91548b("Unterminated comment");
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f13841e = i4 + 1;
                        m91525w();
                        i = this.f13841e;
                        i2 = this.f13842f;
                    }
                } else if (c == '#') {
                    this.f13841e = i3;
                    m91526v();
                    m91525w();
                    i = this.f13841e;
                    i2 = this.f13842f;
                } else {
                    this.f13841e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    /* renamed from: b */
    private IOException m91548b(String str) throws IOException {
        throw new MalformedJsonException(str + m91529s());
    }
}
