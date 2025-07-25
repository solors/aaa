package se;

import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: se.c1 */
/* loaded from: classes8.dex */
public final class JsonLexer extends AbstractJsonLexer {
    @NotNull

    /* renamed from: e */
    private final JsonStreams f111801e;
    @NotNull

    /* renamed from: f */
    private final char[] f111802f;

    /* renamed from: g */
    private int f111803g;
    @NotNull

    /* renamed from: h */
    private final C42703h f111804h;

    public /* synthetic */ JsonLexer(JsonStreams jsonStreams, char[] cArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(jsonStreams, (i & 2) != 0 ? C42720o.f111870c.m6715d() : cArr);
    }

    /* renamed from: T */
    private final void m6885T(int i) {
        char[] cArr;
        cArr = mo6780D().f111838b;
        if (i != 0) {
            int i2 = this.f111790a;
            _ArraysJvm.m17397h(cArr, cArr, 0, i2, i2 + i);
        }
        int length = mo6780D().length();
        while (true) {
            if (i == length) {
                break;
            }
            int mo6845a = this.f111801e.mo6845a(cArr, i, length - i);
            if (mo6845a == -1) {
                mo6780D().m6787f(i);
                this.f111803g = -1;
                break;
            }
            i += mo6845a;
        }
        this.f111790a = 0;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: H */
    public int mo6779H(int i) {
        boolean z;
        if (i < mo6780D().length()) {
            return i;
        }
        this.f111790a = i;
        mo6882v();
        if (this.f111790a == 0) {
            if (mo6780D().length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return 0;
            }
            return -1;
        }
        return -1;
    }

    @Override // se.AbstractJsonLexer
    @NotNull
    /* renamed from: K */
    public String mo6888K(int i, int i2) {
        return mo6780D().m6788e(i, i2);
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: M */
    public boolean mo6777M() {
        int mo6778J = mo6778J();
        if (mo6778J >= mo6780D().length() || mo6778J == -1 || mo6780D().charAt(mo6778J) != ',') {
            return false;
        }
        this.f111790a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // se.AbstractJsonLexer
    @NotNull
    /* renamed from: R */
    public C42703h mo6780D() {
        return this.f111804h;
    }

    /* renamed from: S */
    public int m6886S(char c, int i) {
        C42703h mo6780D = mo6780D();
        int length = mo6780D.length();
        while (i < length) {
            if (mo6780D.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: U */
    public final void m6884U() {
        C42720o.f111870c.m6716c(this.f111802f);
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: e */
    protected void mo6883e(int i, int i2) {
        char[] cArr;
        StringBuilder m6956C = m6956C();
        cArr = mo6780D().f111838b;
        m6956C.append(cArr, i, i2 - i);
        Intrinsics.checkNotNullExpressionValue(m6956C, "this.append(value, start…x, endIndex - startIndex)");
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: f */
    public boolean mo6775f() {
        mo6882v();
        int i = this.f111790a;
        while (true) {
            int mo6779H = mo6779H(i);
            if (mo6779H != -1) {
                char charAt = mo6780D().charAt(mo6779H);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f111790a = mo6779H;
                    return m6955E(charAt);
                }
                i = mo6779H + 1;
            } else {
                this.f111790a = mo6779H;
                return false;
            }
        }
    }

    @Override // se.AbstractJsonLexer
    @NotNull
    /* renamed from: k */
    public String mo6774k() {
        mo6771o('\"');
        int i = this.f111790a;
        int m6886S = m6886S('\"', i);
        if (m6886S == -1) {
            int mo6779H = mo6779H(i);
            if (mo6779H != -1) {
                return m6935r(mo6780D(), this.f111790a, mo6779H);
            }
            m6928z((byte) 1);
            throw new ExceptionsH();
        }
        for (int i2 = i; i2 < m6886S; i2++) {
            if (mo6780D().charAt(i2) == '\\') {
                return m6935r(mo6780D(), this.f111790a, i2);
            }
        }
        this.f111790a = m6886S + 1;
        return mo6888K(i, m6886S);
    }

    @Override // se.AbstractJsonLexer
    @Nullable
    /* renamed from: l */
    public String mo6773l(@NotNull String keyToMatch, boolean z) {
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        return null;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: m */
    public byte mo6772m() {
        mo6882v();
        C42703h mo6780D = mo6780D();
        int i = this.f111790a;
        while (true) {
            int mo6779H = mo6779H(i);
            if (mo6779H != -1) {
                int i2 = mo6779H + 1;
                byte m6921a = C42689b.m6921a(mo6780D.charAt(mo6779H));
                if (m6921a != 3) {
                    this.f111790a = i2;
                    return m6921a;
                }
                i = i2;
            } else {
                this.f111790a = mo6779H;
                return (byte) 10;
            }
        }
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: v */
    public void mo6882v() {
        int length = mo6780D().length() - this.f111790a;
        if (length > this.f111803g) {
            return;
        }
        m6885T(length);
    }

    public JsonLexer(@NotNull JsonStreams reader, @NotNull char[] buffer) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.f111801e = reader;
        this.f111802f = buffer;
        this.f111803g = 128;
        this.f111804h = new C42703h(buffer);
        m6885T(0);
    }
}
