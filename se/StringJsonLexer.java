package se;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;

@Metadata
/* renamed from: se.h1 */
/* loaded from: classes8.dex */
public final class StringJsonLexer extends AbstractJsonLexer {
    @NotNull

    /* renamed from: e */
    private final String f111842e;

    public StringJsonLexer(@NotNull String source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.f111842e = source;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: H */
    public int mo6779H(int i) {
        if (i >= mo6780D().length()) {
            return -1;
        }
        return i;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: J */
    public int mo6778J() {
        char charAt;
        int i = this.f111790a;
        if (i == -1) {
            return i;
        }
        while (i < mo6780D().length() && ((charAt = mo6780D().charAt(i)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i++;
        }
        this.f111790a = i;
        return i;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: M */
    public boolean mo6777M() {
        int mo6778J = mo6778J();
        if (mo6778J == mo6780D().length() || mo6778J == -1 || mo6780D().charAt(mo6778J) != ',') {
            return false;
        }
        this.f111790a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // se.AbstractJsonLexer
    @NotNull
    /* renamed from: R */
    public String mo6780D() {
        return this.f111842e;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: f */
    public boolean mo6775f() {
        int i = this.f111790a;
        if (i == -1) {
            return false;
        }
        while (i < mo6780D().length()) {
            char charAt = mo6780D().charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f111790a = i;
                return m6955E(charAt);
            }
            i++;
        }
        this.f111790a = i;
        return false;
    }

    @Override // se.AbstractJsonLexer
    @NotNull
    /* renamed from: k */
    public String mo6774k() {
        int m16568d0;
        mo6771o('\"');
        int i = this.f111790a;
        m16568d0 = C37690r.m16568d0(mo6780D(), '\"', i, false, 4, null);
        if (m16568d0 != -1) {
            for (int i2 = i; i2 < m16568d0; i2++) {
                if (mo6780D().charAt(i2) == '\\') {
                    return m6935r(mo6780D(), this.f111790a, i2);
                }
            }
            this.f111790a = m16568d0 + 1;
            String substring = mo6780D().substring(i, m16568d0);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        m6928z((byte) 1);
        throw new ExceptionsH();
    }

    @Override // se.AbstractJsonLexer
    @Nullable
    /* renamed from: l */
    public String mo6773l(@NotNull String keyToMatch, boolean z) {
        String m6933t;
        String m6933t2;
        Intrinsics.checkNotNullParameter(keyToMatch, "keyToMatch");
        int i = this.f111790a;
        try {
            if (mo6772m() != 6) {
                return null;
            }
            if (z) {
                m6933t = mo6774k();
            } else {
                m6933t = m6933t();
            }
            if (!Intrinsics.m17075f(m6933t, keyToMatch)) {
                return null;
            }
            if (mo6772m() != 5) {
                return null;
            }
            if (z) {
                m6933t2 = m6936q();
            } else {
                m6933t2 = m6933t();
            }
            return m6933t2;
        } finally {
            this.f111790a = i;
        }
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: m */
    public byte mo6772m() {
        byte m6921a;
        String mo6780D = mo6780D();
        do {
            int i = this.f111790a;
            if (i != -1 && i < mo6780D.length()) {
                int i2 = this.f111790a;
                this.f111790a = i2 + 1;
                m6921a = C42689b.m6921a(mo6780D.charAt(i2));
            } else {
                return (byte) 10;
            }
        } while (m6921a == 3);
        return m6921a;
    }

    @Override // se.AbstractJsonLexer
    /* renamed from: o */
    public void mo6771o(char c) {
        if (this.f111790a == -1) {
            m6948P(c);
        }
        String mo6780D = mo6780D();
        while (this.f111790a < mo6780D.length()) {
            int i = this.f111790a;
            this.f111790a = i + 1;
            char charAt = mo6780D.charAt(i);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c) {
                    return;
                }
                m6948P(c);
            }
        }
        m6948P(c);
    }
}
