package se;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.MutableCollections;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: se.a */
/* loaded from: classes8.dex */
public abstract class AbstractJsonLexer {

    /* renamed from: a */
    protected int f111790a;
    @Nullable

    /* renamed from: c */
    private String f111792c;
    @NotNull

    /* renamed from: b */
    public final JsonPath f111791b = new JsonPath();
    @NotNull

    /* renamed from: d */
    private StringBuilder f111793d = new StringBuilder();

    /* renamed from: B */
    private final int m6957B(CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        char charAt = charSequence.charAt(i);
        boolean z3 = true;
        if ('0' <= charAt && charAt < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return charAt - '0';
        }
        char c = 'a';
        if ('a' <= charAt && charAt < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z3 = false;
            }
            if (!z3) {
                m6929y(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new ExceptionsH();
            }
        }
        return (charAt - c) + 10;
    }

    /* renamed from: L */
    private final String m6951L() {
        String str = this.f111792c;
        Intrinsics.m17074g(str);
        this.f111792c = null;
        return str;
    }

    /* renamed from: O */
    public static /* synthetic */ boolean m6949O(AbstractJsonLexer abstractJsonLexer, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = true;
            }
            return abstractJsonLexer.m6950N(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryConsumeNull");
    }

    /* renamed from: Q */
    private final boolean m6947Q() {
        if (mo6780D().charAt(this.f111790a - 1) != '\"') {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private final int m6945b(int i) {
        int mo6779H = mo6779H(i);
        if (mo6779H != -1) {
            int i2 = mo6779H + 1;
            char charAt = mo6780D().charAt(mo6779H);
            if (charAt == 'u') {
                return m6943d(mo6780D(), i2);
            }
            char m6920b = C42689b.m6920b(charAt);
            if (m6920b != 0) {
                this.f111793d.append(m6920b);
                return i2;
            }
            m6929y(this, "Invalid escaped char '" + charAt + '\'', 0, null, 6, null);
            throw new ExceptionsH();
        }
        m6929y(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new ExceptionsH();
    }

    /* renamed from: c */
    private final int m6944c(int i, int i2) {
        mo6883e(i, i2);
        return m6945b(i2 + 1);
    }

    /* renamed from: d */
    private final int m6943d(CharSequence charSequence, int i) {
        int i2 = i + 4;
        if (i2 >= charSequence.length()) {
            this.f111790a = i;
            mo6882v();
            if (this.f111790a + 4 < charSequence.length()) {
                return m6943d(charSequence, this.f111790a);
            }
            m6929y(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new ExceptionsH();
        }
        this.f111793d.append((char) ((m6957B(charSequence, i) << 12) + (m6957B(charSequence, i + 1) << 8) + (m6957B(charSequence, i + 2) << 4) + m6957B(charSequence, i + 3)));
        return i2;
    }

    /* renamed from: h */
    private final boolean m6941h(int i) {
        int mo6779H = mo6779H(i);
        if (mo6779H < mo6780D().length() && mo6779H != -1) {
            int i2 = mo6779H + 1;
            int charAt = mo6780D().charAt(mo6779H) | ' ';
            if (charAt != 102) {
                if (charAt == 116) {
                    m6939j("rue", i2);
                    return true;
                }
                m6929y(this, "Expected valid boolean literal prefix, but had '" + m6934s() + '\'', 0, null, 6, null);
                throw new ExceptionsH();
            }
            m6939j("alse", i2);
            return false;
        }
        m6929y(this, "EOF", 0, null, 6, null);
        throw new ExceptionsH();
    }

    /* renamed from: j */
    private final void m6939j(String str, int i) {
        if (mo6780D().length() - i >= str.length()) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if (str.charAt(i2) != (mo6780D().charAt(i + i2) | ' ')) {
                    m6929y(this, "Expected valid boolean literal prefix, but had '" + m6934s() + '\'', 0, null, 6, null);
                    throw new ExceptionsH();
                }
            }
            this.f111790a = i + str.length();
            return;
        }
        m6929y(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new ExceptionsH();
    }

    /* renamed from: u */
    private final String m6932u(int i, int i2) {
        mo6883e(i, i2);
        String sb2 = this.f111793d.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "escapedString.toString()");
        this.f111793d.setLength(0);
        return sb2;
    }

    /* renamed from: y */
    public static /* synthetic */ Void m6929y(AbstractJsonLexer abstractJsonLexer, String str, int i, String str2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                i = abstractJsonLexer.f111790a;
            }
            if ((i2 & 4) != 0) {
                str2 = "";
            }
            return abstractJsonLexer.m6930x(str, i, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    /* renamed from: A */
    public final void m6958A(@NotNull String key) {
        int m16558k0;
        Intrinsics.checkNotNullParameter(key, "key");
        m16558k0 = C37690r.m16558k0(mo6888K(0, this.f111790a), key, 0, false, 6, null);
        m6930x("Encountered an unknown key '" + key + '\'', m16558k0, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: C */
    public final StringBuilder m6956C() {
        return this.f111793d;
    }

    @NotNull
    /* renamed from: D */
    protected abstract CharSequence mo6780D();

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: E */
    public final boolean m6955E(char c) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (c == '}' || c == ']') {
            z = true;
        } else {
            z = false;
        }
        if (z || c == ':') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || c == ',') {
            z3 = true;
        }
        return !z3;
    }

    /* renamed from: F */
    public final byte m6954F() {
        CharSequence mo6780D = mo6780D();
        int i = this.f111790a;
        while (true) {
            int mo6779H = mo6779H(i);
            if (mo6779H != -1) {
                char charAt = mo6780D.charAt(mo6779H);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f111790a = mo6779H;
                    return C42689b.m6921a(charAt);
                }
                i = mo6779H + 1;
            } else {
                this.f111790a = mo6779H;
                return (byte) 10;
            }
        }
    }

    @Nullable
    /* renamed from: G */
    public final String m6953G(boolean z) {
        String m6936q;
        byte m6954F = m6954F();
        if (z) {
            if (m6954F != 1 && m6954F != 0) {
                return null;
            }
            m6936q = m6934s();
        } else if (m6954F != 1) {
            return null;
        } else {
            m6936q = m6936q();
        }
        this.f111792c = m6936q;
        return m6936q;
    }

    /* renamed from: H */
    public abstract int mo6779H(int i);

    /* renamed from: I */
    public final void m6952I(boolean z) {
        Object m17577B0;
        Object m17577B02;
        ArrayList arrayList = new ArrayList();
        byte m6954F = m6954F();
        if (m6954F != 8 && m6954F != 6) {
            m6934s();
            return;
        }
        while (true) {
            byte m6954F2 = m6954F();
            boolean z2 = true;
            if (m6954F2 == 1) {
                if (z) {
                    m6934s();
                } else {
                    mo6774k();
                }
            } else {
                if (m6954F2 != 8 && m6954F2 != 6) {
                    z2 = false;
                }
                if (z2) {
                    arrayList.add(Byte.valueOf(m6954F2));
                } else if (m6954F2 == 9) {
                    m17577B02 = _Collections.m17577B0(arrayList);
                    if (((Number) m17577B02).byteValue() == 8) {
                        MutableCollections.m17611Q(arrayList);
                    } else {
                        int i = this.f111790a;
                        throw C42710k0.m6753f(i, "found ] instead of } at path: " + this.f111791b, mo6780D());
                    }
                } else if (m6954F2 == 7) {
                    m17577B0 = _Collections.m17577B0(arrayList);
                    if (((Number) m17577B0).byteValue() == 6) {
                        MutableCollections.m17611Q(arrayList);
                    } else {
                        int i2 = this.f111790a;
                        throw C42710k0.m6753f(i2, "found } instead of ] at path: " + this.f111791b, mo6780D());
                    }
                } else if (m6954F2 == 10) {
                    m6929y(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new ExceptionsH();
                }
                mo6772m();
                if (arrayList.size() == 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: J */
    public int mo6778J() {
        int mo6779H;
        char charAt;
        int i = this.f111790a;
        while (true) {
            mo6779H = mo6779H(i);
            if (mo6779H == -1 || !((charAt = mo6780D().charAt(mo6779H)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
                break;
            }
            i = mo6779H + 1;
        }
        this.f111790a = mo6779H;
        return mo6779H;
    }

    @NotNull
    /* renamed from: K */
    public String mo6888K(int i, int i2) {
        return mo6780D().subSequence(i, i2).toString();
    }

    /* renamed from: M */
    public abstract boolean mo6777M();

    /* renamed from: N */
    public final boolean m6950N(boolean z) {
        int mo6779H = mo6779H(mo6778J());
        int length = mo6780D().length() - mo6779H;
        if (length < 4 || mo6779H == -1) {
            return false;
        }
        for (int i = 0; i < 4; i++) {
            if ("null".charAt(i) != mo6780D().charAt(mo6779H + i)) {
                return false;
            }
        }
        if (length > 4 && C42689b.m6921a(mo6780D().charAt(mo6779H + 4)) == 0) {
            return false;
        }
        if (z) {
            this.f111790a = mo6779H + 4;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: P */
    public final void m6948P(char c) {
        int i = this.f111790a - 1;
        this.f111790a = i;
        if (i >= 0 && c == '\"' && Intrinsics.m17075f(m6934s(), "null")) {
            m6930x("Expected string literal but 'null' literal was found", this.f111790a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new ExceptionsH();
        } else {
            m6928z(C42689b.m6921a(c));
            throw new ExceptionsH();
        }
    }

    /* renamed from: e */
    protected void mo6883e(int i, int i2) {
        this.f111793d.append(mo6780D(), i, i2);
    }

    /* renamed from: f */
    public abstract boolean mo6775f();

    /* renamed from: g */
    public final boolean m6942g() {
        return m6941h(mo6778J());
    }

    /* renamed from: i */
    public final boolean m6940i() {
        boolean z;
        int mo6778J = mo6778J();
        if (mo6778J != mo6780D().length()) {
            if (mo6780D().charAt(mo6778J) == '\"') {
                mo6778J++;
                z = true;
            } else {
                z = false;
            }
            boolean m6941h = m6941h(mo6778J);
            if (z) {
                if (this.f111790a != mo6780D().length()) {
                    if (mo6780D().charAt(this.f111790a) == '\"') {
                        this.f111790a++;
                    } else {
                        m6929y(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new ExceptionsH();
                    }
                } else {
                    m6929y(this, "EOF", 0, null, 6, null);
                    throw new ExceptionsH();
                }
            }
            return m6941h;
        }
        m6929y(this, "EOF", 0, null, 6, null);
        throw new ExceptionsH();
    }

    @NotNull
    /* renamed from: k */
    public abstract String mo6774k();

    @Nullable
    /* renamed from: l */
    public abstract String mo6773l(@NotNull String str, boolean z);

    /* renamed from: m */
    public abstract byte mo6772m();

    /* renamed from: n */
    public final byte m6938n(byte b) {
        byte mo6772m = mo6772m();
        if (mo6772m == b) {
            return mo6772m;
        }
        m6928z(b);
        throw new ExceptionsH();
    }

    /* renamed from: o */
    public void mo6771o(char c) {
        mo6882v();
        CharSequence mo6780D = mo6780D();
        int i = this.f111790a;
        while (true) {
            int mo6779H = mo6779H(i);
            if (mo6779H != -1) {
                int i2 = mo6779H + 1;
                char charAt = mo6780D.charAt(mo6779H);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f111790a = i2;
                    if (charAt == c) {
                        return;
                    }
                    m6948P(c);
                }
                i = i2;
            } else {
                this.f111790a = mo6779H;
                m6948P(c);
                return;
            }
        }
    }

    /* renamed from: p */
    public final long m6937p() {
        boolean z;
        boolean z2;
        int mo6779H = mo6779H(mo6778J());
        if (mo6779H < mo6780D().length() && mo6779H != -1) {
            if (mo6780D().charAt(mo6779H) == '\"') {
                mo6779H++;
                if (mo6779H != mo6780D().length()) {
                    z = true;
                } else {
                    m6929y(this, "EOF", 0, null, 6, null);
                    throw new ExceptionsH();
                }
            } else {
                z = false;
            }
            int i = mo6779H;
            long j = 0;
            boolean z3 = true;
            boolean z4 = false;
            while (z3) {
                char charAt = mo6780D().charAt(i);
                if (charAt == '-') {
                    if (i == mo6779H) {
                        i++;
                        z4 = true;
                    } else {
                        m6929y(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                        throw new ExceptionsH();
                    }
                } else if (C42689b.m6921a(charAt) != 0) {
                    break;
                } else {
                    i++;
                    if (i != mo6780D().length()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i2 = charAt - '0';
                    if (i2 >= 0 && i2 < 10) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        j = (j * 10) - i2;
                        if (j > 0) {
                            m6929y(this, "Numeric value overflow", 0, null, 6, null);
                            throw new ExceptionsH();
                        }
                    } else {
                        m6929y(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                        throw new ExceptionsH();
                    }
                }
            }
            if (mo6779H != i && (!z4 || mo6779H != i - 1)) {
                if (z) {
                    if (z3) {
                        if (mo6780D().charAt(i) == '\"') {
                            i++;
                        } else {
                            m6929y(this, "Expected closing quotation mark", 0, null, 6, null);
                            throw new ExceptionsH();
                        }
                    } else {
                        m6929y(this, "EOF", 0, null, 6, null);
                        throw new ExceptionsH();
                    }
                }
                this.f111790a = i;
                if (!z4) {
                    if (j != Long.MIN_VALUE) {
                        return -j;
                    }
                    m6929y(this, "Numeric value overflow", 0, null, 6, null);
                    throw new ExceptionsH();
                }
                return j;
            }
            m6929y(this, "Expected numeric literal", 0, null, 6, null);
            throw new ExceptionsH();
        }
        m6929y(this, "EOF", 0, null, 6, null);
        throw new ExceptionsH();
    }

    @NotNull
    /* renamed from: q */
    public final String m6936q() {
        if (this.f111792c != null) {
            return m6951L();
        }
        return mo6774k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: r */
    public final String m6935r(@NotNull CharSequence source, int i, int i2) {
        String m6932u;
        int mo6779H;
        Intrinsics.checkNotNullParameter(source, "source");
        char charAt = source.charAt(i2);
        boolean z = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                mo6779H = mo6779H(m6944c(i, i2));
                if (mo6779H == -1) {
                    m6929y(this, "EOF", mo6779H, null, 4, null);
                    throw new ExceptionsH();
                }
            } else {
                i2++;
                if (i2 >= source.length()) {
                    mo6883e(i, i2);
                    mo6779H = mo6779H(i2);
                    if (mo6779H == -1) {
                        m6929y(this, "EOF", mo6779H, null, 4, null);
                        throw new ExceptionsH();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i2);
                }
            }
            z = true;
            i = mo6779H;
            i2 = i;
            charAt = source.charAt(i2);
        }
        if (!z) {
            m6932u = mo6888K(i, i2);
        } else {
            m6932u = m6932u(i, i2);
        }
        this.f111790a = i2 + 1;
        return m6932u;
    }

    @NotNull
    /* renamed from: s */
    public final String m6934s() {
        String m6932u;
        if (this.f111792c != null) {
            return m6951L();
        }
        int mo6778J = mo6778J();
        if (mo6778J < mo6780D().length() && mo6778J != -1) {
            byte m6921a = C42689b.m6921a(mo6780D().charAt(mo6778J));
            if (m6921a == 1) {
                return m6936q();
            }
            if (m6921a == 0) {
                boolean z = false;
                while (C42689b.m6921a(mo6780D().charAt(mo6778J)) == 0) {
                    mo6778J++;
                    if (mo6778J >= mo6780D().length()) {
                        mo6883e(this.f111790a, mo6778J);
                        int mo6779H = mo6779H(mo6778J);
                        if (mo6779H == -1) {
                            this.f111790a = mo6778J;
                            return m6932u(0, 0);
                        }
                        mo6778J = mo6779H;
                        z = true;
                    }
                }
                if (!z) {
                    m6932u = mo6888K(this.f111790a, mo6778J);
                } else {
                    m6932u = m6932u(this.f111790a, mo6778J);
                }
                this.f111790a = mo6778J;
                return m6932u;
            }
            m6929y(this, "Expected beginning of the string, but got " + mo6780D().charAt(mo6778J), 0, null, 6, null);
            throw new ExceptionsH();
        }
        m6929y(this, "EOF", mo6778J, null, 4, null);
        throw new ExceptionsH();
    }

    @NotNull
    /* renamed from: t */
    public final String m6933t() {
        String m6934s = m6934s();
        if (Intrinsics.m17075f(m6934s, "null") && m6947Q()) {
            m6929y(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new ExceptionsH();
        }
        return m6934s;
    }

    @NotNull
    public String toString() {
        return "JsonReader(source='" + ((Object) mo6780D()) + "', currentPosition=" + this.f111790a + ')';
    }

    /* renamed from: w */
    public final void m6931w() {
        if (mo6772m() == 10) {
            return;
        }
        m6929y(this, "Expected EOF after parsing, but had " + mo6780D().charAt(this.f111790a - 1) + " instead", 0, null, 6, null);
        throw new ExceptionsH();
    }

    @NotNull
    /* renamed from: x */
    public final Void m6930x(@NotNull String message, int i, @NotNull String hint) {
        boolean z;
        String str;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(hint, "hint");
        if (hint.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw C42710k0.m6753f(i, message + " at path: " + this.f111791b.m6727a() + str, mo6780D());
    }

    @NotNull
    /* renamed from: z */
    public final Void m6928z(byte b) {
        String str;
        String str2;
        if (b == 1) {
            str = "quotation mark '\"'";
        } else if (b == 4) {
            str = "comma ','";
        } else if (b == 5) {
            str = "colon ':'";
        } else if (b == 6) {
            str = "start of the object '{'";
        } else if (b == 7) {
            str = "end of the object '}'";
        } else if (b == 8) {
            str = "start of the array '['";
        } else if (b == 9) {
            str = "end of the array ']'";
        } else {
            str = "valid token";
        }
        if (this.f111790a != mo6780D().length() && this.f111790a > 0) {
            str2 = String.valueOf(mo6780D().charAt(this.f111790a - 1));
        } else {
            str2 = "EOF";
        }
        m6929y(this, "Expected " + str + ", but had '" + str2 + "' instead", this.f111790a - 1, null, 4, null);
        throw new ExceptionsH();
    }

    /* renamed from: v */
    public void mo6882v() {
    }
}
