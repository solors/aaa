package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public enum CaseFormat {
    LOWER_HYPHEN(CharMatcher.m70091is('-'), "-") { // from class: com.google.common.base.CaseFormat.1
        @Override // com.google.common.base.CaseFormat
        /* renamed from: d */
        String mo70102d(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return Ascii.toUpperCase(str.replace('-', '_'));
            }
            return super.mo70102d(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        /* renamed from: g */
        String mo70101g(String str) {
            return Ascii.toLowerCase(str);
        }
    },
    LOWER_UNDERSCORE(CharMatcher.m70091is('_'), "_") { // from class: com.google.common.base.CaseFormat.2
        @Override // com.google.common.base.CaseFormat
        /* renamed from: d */
        String mo70102d(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return str.replace('_', '-');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return Ascii.toUpperCase(str);
            }
            return super.mo70102d(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        /* renamed from: g */
        String mo70101g(String str) {
            return Ascii.toLowerCase(str);
        }
    },
    LOWER_CAMEL(CharMatcher.inRange('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.3
        @Override // com.google.common.base.CaseFormat
        /* renamed from: f */
        String mo70103f(String str) {
            return Ascii.toLowerCase(str);
        }

        @Override // com.google.common.base.CaseFormat
        /* renamed from: g */
        String mo70101g(String str) {
            return CaseFormat.m70105e(str);
        }
    },
    UPPER_CAMEL(CharMatcher.inRange('A', 'Z'), "") { // from class: com.google.common.base.CaseFormat.4
        @Override // com.google.common.base.CaseFormat
        /* renamed from: g */
        String mo70101g(String str) {
            return CaseFormat.m70105e(str);
        }
    },
    UPPER_UNDERSCORE(CharMatcher.m70091is('_'), "_") { // from class: com.google.common.base.CaseFormat.5
        @Override // com.google.common.base.CaseFormat
        /* renamed from: d */
        String mo70102d(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return Ascii.toLowerCase(str.replace('_', '-'));
            }
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return Ascii.toLowerCase(str);
            }
            return super.mo70102d(caseFormat, str);
        }

        @Override // com.google.common.base.CaseFormat
        /* renamed from: g */
        String mo70101g(String str) {
            return Ascii.toUpperCase(str);
        }
    };
    

    /* renamed from: b */
    private final CharMatcher f39321b;

    /* renamed from: c */
    private final String f39322c;

    /* loaded from: classes4.dex */
    private static final class StringConverter extends Converter<String, String> implements Serializable {

        /* renamed from: d */
        private final CaseFormat f39323d;

        /* renamed from: f */
        private final CaseFormat f39324f;

        StringConverter(CaseFormat caseFormat, CaseFormat caseFormat2) {
            this.f39323d = (CaseFormat) Preconditions.checkNotNull(caseFormat);
            this.f39324f = (CaseFormat) Preconditions.checkNotNull(caseFormat2);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) obj;
            if (!this.f39323d.equals(stringConverter.f39323d) || !this.f39324f.equals(stringConverter.f39324f)) {
                return false;
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: h */
        public String mo67968d(String str) {
            return this.f39324f.m70104to(this.f39323d, str);
        }

        public int hashCode() {
            return this.f39323d.hashCode() ^ this.f39324f.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.base.Converter
        /* renamed from: i */
        public String mo67967e(String str) {
            return this.f39323d.m70104to(this.f39324f, str);
        }

        public String toString() {
            String valueOf = String.valueOf(this.f39323d);
            String valueOf2 = String.valueOf(this.f39324f);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb2.append(valueOf);
            sb2.append(".converterTo(");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static String m70105e(String str) {
        if (!str.isEmpty()) {
            char upperCase = Ascii.toUpperCase(str.charAt(0));
            String lowerCase = Ascii.toLowerCase(str.substring(1));
            StringBuilder sb2 = new StringBuilder(String.valueOf(lowerCase).length() + 1);
            sb2.append(upperCase);
            sb2.append(lowerCase);
            return sb2.toString();
        }
        return str;
    }

    public Converter<String, String> converterTo(CaseFormat caseFormat) {
        return new StringConverter(this, caseFormat);
    }

    /* renamed from: d */
    String mo70102d(CaseFormat caseFormat, String str) {
        StringBuilder sb2 = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.f39321b.indexIn(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb2 = new StringBuilder(str.length() + (caseFormat.f39322c.length() * 4));
                sb2.append(caseFormat.mo70103f(str.substring(i, i2)));
            } else {
                java.util.Objects.requireNonNull(sb2);
                sb2.append(caseFormat.mo70101g(str.substring(i, i2)));
            }
            sb2.append(caseFormat.f39322c);
            i = this.f39322c.length() + i2;
        }
        if (i == 0) {
            return caseFormat.mo70103f(str);
        }
        java.util.Objects.requireNonNull(sb2);
        sb2.append(caseFormat.mo70101g(str.substring(i)));
        return sb2.toString();
    }

    /* renamed from: f */
    String mo70103f(String str) {
        return mo70101g(str);
    }

    /* renamed from: g */
    abstract String mo70101g(String str);

    /* renamed from: to */
    public final String m70104to(CaseFormat caseFormat, String str) {
        Preconditions.checkNotNull(caseFormat);
        Preconditions.checkNotNull(str);
        if (caseFormat != this) {
            return mo70102d(caseFormat, str);
        }
        return str;
    }

    CaseFormat(CharMatcher charMatcher, String str) {
        this.f39321b = charMatcher;
        this.f39322c = str;
    }
}
