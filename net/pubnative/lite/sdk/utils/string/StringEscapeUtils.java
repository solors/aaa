package net.pubnative.lite.sdk.utils.string;

import androidx.webkit.ProxyConfig;
import com.amazon.p047a.p048a.p071o.p073b.SignedToken;
import com.ironsource.C21114v8;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes10.dex */
public class StringEscapeUtils {
    public static final String EMPTY = "";
    public static final CharSequenceTranslator ESCAPE_JAVA;
    public static final CharSequenceTranslator ESCAPE_XSI;
    public static final CharSequenceTranslator UNESCAPE_JAVA;

    /* loaded from: classes10.dex */
    public static final class Builder {

        /* renamed from: sb */
        private final StringBuilder f102039sb;
        private final CharSequenceTranslator translator;

        public Builder append(String str) {
            this.f102039sb.append(str);
            return this;
        }

        public Builder escape(String str) {
            this.f102039sb.append(this.translator.translate(str));
            return this;
        }

        public String toString() {
            return this.f102039sb.toString();
        }

        private Builder(CharSequenceTranslator charSequenceTranslator) {
            this.f102039sb = new StringBuilder();
            this.translator = charSequenceTranslator;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("\"", "\\\"");
        hashMap.put("\\", "\\\\");
        ESCAPE_JAVA = new AggregateTranslator(new LookupTranslator(Collections.unmodifiableMap(hashMap)), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_ESCAPE), JavaUnicodeEscaper.outsideOf(32, 127));
        HashMap hashMap2 = new HashMap();
        hashMap2.put(SignedToken.f2767c, "\\|");
        hashMap2.put(C21114v8.C21123i.f54135c, "\\&");
        hashMap2.put(";", "\\;");
        hashMap2.put("<", "\\<");
        hashMap2.put(">", "\\>");
        hashMap2.put("(", "\\(");
        hashMap2.put(")", "\\)");
        hashMap2.put("$", "\\$");
        hashMap2.put("`", "\\`");
        hashMap2.put("\\", "\\\\");
        hashMap2.put("\"", "\\\"");
        hashMap2.put("'", "\\'");
        hashMap2.put(" ", "\\ ");
        hashMap2.put("\t", "\\\t");
        hashMap2.put("\r\n", "");
        hashMap2.put("\n", "");
        hashMap2.put(ProxyConfig.MATCH_ALL_SCHEMES, "\\*");
        hashMap2.put("?", "\\?");
        hashMap2.put(C21114v8.C21123i.f54137d, "\\[");
        hashMap2.put("#", "\\#");
        hashMap2.put("~", "\\~");
        hashMap2.put("=", "\\=");
        hashMap2.put("%", "\\%");
        ESCAPE_XSI = new LookupTranslator(Collections.unmodifiableMap(hashMap2));
        HashMap hashMap3 = new HashMap();
        hashMap3.put("\\\\", "\\");
        hashMap3.put("\\\"", "\"");
        hashMap3.put("\\'", "'");
        hashMap3.put("\\", "");
        UNESCAPE_JAVA = new AggregateTranslator(new OctalUnescaper(), new UnicodeUnescaper(), new LookupTranslator(EntityArrays.JAVA_CTRL_CHARS_UNESCAPE), new LookupTranslator(Collections.unmodifiableMap(hashMap3)));
    }

    public static Builder builder(CharSequenceTranslator charSequenceTranslator) {
        return new Builder(charSequenceTranslator);
    }

    public static final String escapeJava(String str) {
        return ESCAPE_JAVA.translate(str);
    }

    public static final String unescapeJava(String str) {
        return UNESCAPE_JAVA.translate(str);
    }
}
