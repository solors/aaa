package com.applovin.exoplayer2.common.base;

import java.util.Arrays;
import java.util.BitSet;

/* loaded from: classes2.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$a */
    /* loaded from: classes2.dex */
    public static final class C3872a extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f4154a;

        /* renamed from: b */
        final CharMatcher f4155b;

        C3872a(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f4154a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f4155b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (this.f4154a.matches(c) && this.f4155b.matches(c)) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f4154a.setBits(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f4155b.setBits(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.and(" + this.f4154a + ", " + this.f4155b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$a0 */
    /* loaded from: classes2.dex */
    static final class C3873a0 extends AbstractC3892t {

        /* renamed from: b */
        static final int f4156b = Integer.numberOfLeadingZeros(31);

        /* renamed from: c */
        static final C3873a0 f4157c = new C3873a0();

        C3873a0() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f4156b) == c) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$b */
    /* loaded from: classes2.dex */
    public static final class C3874b extends AbstractC3892t {

        /* renamed from: b */
        static final C3874b f4158b = new C3874b();

        private C3874b() {
            super("CharMatcher.any()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.AbstractC3879g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo101285or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$c */
    /* loaded from: classes2.dex */
    public static final class C3875c extends CharMatcher {

        /* renamed from: a */
        private final char[] f4159a;

        public C3875c(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f4159a = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (Arrays.binarySearch(this.f4159a, c) >= 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            for (char c : this.f4159a) {
                bitSet.set(c);
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f4159a) {
                sb2.append(CharMatcher.showCharacter(c));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$d */
    /* loaded from: classes2.dex */
    private static final class C3876d extends AbstractC3892t {

        /* renamed from: b */
        static final C3876d f4160b = new C3876d();

        C3876d() {
            super("CharMatcher.ascii()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c <= 127) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$e */
    /* loaded from: classes2.dex */
    private static final class C3877e extends CharMatcher {

        /* renamed from: a */
        static final CharMatcher f4161a = new C3877e();

        private C3877e() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != ' ' && c != 133 && c != 5760) {
                if (c == 8199) {
                    return false;
                }
                if (c != 8287 && c != 12288 && c != 8232 && c != 8233) {
                    switch (c) {
                        case '\t':
                        case '\n':
                        case 11:
                        case '\f':
                        case '\r':
                            break;
                        default:
                            if (c >= 8192 && c <= 8202) {
                                return true;
                            }
                            return false;
                    }
                }
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$f */
    /* loaded from: classes2.dex */
    private static final class C3878f extends C3897y {

        /* renamed from: d */
        static final C3878f f4162d = new C3878f();

        private C3878f() {
            super("CharMatcher.digit()", m101286b(), m101287a());
        }

        /* renamed from: a */
        private static char[] m101287a() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦\u0de6๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐\ua9f0꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }

        /* renamed from: b */
        private static char[] m101286b() {
            return "0٠۰߀०০੦૦୦௦౦೦൦\u0de6๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐\ua9f0꩐꯰０".toCharArray();
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$g */
    /* loaded from: classes2.dex */
    static abstract class AbstractC3879g extends CharMatcher {
        AbstractC3879g() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return new C3894v(this);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$h */
    /* loaded from: classes2.dex */
    private static final class C3880h extends CharMatcher {

        /* renamed from: a */
        private final Predicate f4163a;

        C3880h(Predicate predicate) {
            this.f4163a = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f4163a.apply(Character.valueOf(c));
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.forPredicate(" + this.f4163a + ")";
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(Character ch) {
            return this.f4163a.apply(Preconditions.checkNotNull(ch));
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$i */
    /* loaded from: classes2.dex */
    private static final class C3881i extends AbstractC3879g {

        /* renamed from: a */
        private final char f4164a;

        /* renamed from: b */
        private final char f4165b;

        C3881i(char c, char c2) {
            boolean z;
            if (c2 >= c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f4164a = c;
            this.f4165b = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (this.f4164a <= c && c <= this.f4165b) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.f4164a, this.f4165b + 1);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.inRange('" + CharMatcher.showCharacter(this.f4164a) + "', '" + CharMatcher.showCharacter(this.f4165b) + "')";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$j */
    /* loaded from: classes2.dex */
    private static final class C3882j extends C3897y {

        /* renamed from: d */
        static final C3882j f4166d = new C3882j();

        private C3882j() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$k */
    /* loaded from: classes2.dex */
    public static final class C3883k extends AbstractC3879g {

        /* renamed from: a */
        private final char f4167a;

        C3883k(char c) {
            this.f4167a = c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f4167a)) {
                return this;
            }
            return CharMatcher.none();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c == this.f4167a) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.AbstractC3879g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f4167a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo101285or(CharMatcher charMatcher) {
            if (!charMatcher.matches(this.f4167a)) {
                return super.mo101285or(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f4167a, c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.f4167a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.is('" + CharMatcher.showCharacter(this.f4167a) + "')";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$l */
    /* loaded from: classes2.dex */
    public static final class C3884l extends AbstractC3879g {

        /* renamed from: a */
        private final char f4168a;

        /* renamed from: b */
        private final char f4169b;

        C3884l(char c, char c2) {
            this.f4168a = c;
            this.f4169b = c2;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != this.f4168a && c != this.f4169b) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(this.f4168a);
            bitSet.set(this.f4169b);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.anyOf(\"" + CharMatcher.showCharacter(this.f4168a) + CharMatcher.showCharacter(this.f4169b) + "\")";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$m */
    /* loaded from: classes2.dex */
    public static final class C3885m extends AbstractC3879g {

        /* renamed from: a */
        private final char f4170a;

        C3885m(char c) {
            this.f4170a = c;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f4170a)) {
                return super.and(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != this.f4170a) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.AbstractC3879g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.m101288is(this.f4170a);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo101285or(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f4170a)) {
                return CharMatcher.any();
            }
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            bitSet.set(0, this.f4170a);
            bitSet.set(this.f4170a + 1, 65536);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.isNot('" + CharMatcher.showCharacter(this.f4170a) + "')";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$n */
    /* loaded from: classes2.dex */
    private static final class C3886n extends CharMatcher {

        /* renamed from: a */
        static final C3886n f4171a = new C3886n();

        private C3886n() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$o */
    /* loaded from: classes2.dex */
    private static final class C3887o extends AbstractC3892t {

        /* renamed from: b */
        static final C3887o f4172b = new C3887o();

        private C3887o() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (c > 31 && (c < 127 || c > 159)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$p */
    /* loaded from: classes2.dex */
    private static final class C3888p extends CharMatcher {

        /* renamed from: a */
        static final C3888p f4173a = new C3888p();

        private C3888p() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$q */
    /* loaded from: classes2.dex */
    private static final class C3889q extends CharMatcher {

        /* renamed from: a */
        static final C3889q f4174a = new C3889q();

        private C3889q() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$r */
    /* loaded from: classes2.dex */
    private static final class C3890r extends CharMatcher {

        /* renamed from: a */
        static final C3890r f4175a = new C3890r();

        private C3890r() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$s */
    /* loaded from: classes2.dex */
    private static final class C3891s extends CharMatcher {

        /* renamed from: a */
        static final C3891s f4176a = new C3891s();

        private C3891s() {
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$t */
    /* loaded from: classes2.dex */
    static abstract class AbstractC3892t extends AbstractC3879g {

        /* renamed from: a */
        private final String f4177a;

        AbstractC3892t(String str) {
            this.f4177a = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public final String toString() {
            return this.f4177a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$u */
    /* loaded from: classes2.dex */
    public static class C3893u extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f4178a;

        C3893u(CharMatcher charMatcher) {
            this.f4178a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f4178a.countIn(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.f4178a.matches(c);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f4178a.matchesNoneOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f4178a.matchesAllOf(charSequence);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f4178a;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f4178a.setBits(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f4178a + ".negate()";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$v */
    /* loaded from: classes2.dex */
    static class C3894v extends C3893u {
        C3894v(CharMatcher charMatcher) {
            super(charMatcher);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$w */
    /* loaded from: classes2.dex */
    public static final class C3895w extends AbstractC3892t {

        /* renamed from: b */
        static final C3895w f4179b = new C3895w();

        private C3895w() {
            super("CharMatcher.none()");
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher.AbstractC3879g, com.applovin.exoplayer2.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo101285or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$x */
    /* loaded from: classes2.dex */
    public static final class C3896x extends CharMatcher {

        /* renamed from: a */
        final CharMatcher f4180a;

        /* renamed from: b */
        final CharMatcher f4181b;

        C3896x(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f4180a = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f4181b = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            if (!this.f4180a.matches(c) && !this.f4181b.matches(c)) {
                return false;
            }
            return true;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        void setBits(BitSet bitSet) {
            this.f4180a.setBits(bitSet);
            this.f4181b.setBits(bitSet);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.or(" + this.f4180a + ", " + this.f4181b + ")";
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$y */
    /* loaded from: classes2.dex */
    private static class C3897y extends CharMatcher {

        /* renamed from: a */
        private final String f4182a;

        /* renamed from: b */
        private final char[] f4183b;

        /* renamed from: c */
        private final char[] f4184c;

        C3897y(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            this.f4182a = str;
            this.f4183b = cArr;
            this.f4184c = cArr2;
            if (cArr.length == cArr2.length) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            int i = 0;
            while (i < cArr.length) {
                if (cArr[i] <= cArr2[i]) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Preconditions.checkArgument(z2);
                int i2 = i + 1;
                if (i2 < cArr.length) {
                    if (cArr2[i] < cArr[i2]) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Preconditions.checkArgument(z3);
                }
                i = i2;
            }
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher, com.applovin.exoplayer2.common.base.Predicate
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public boolean matches(char c) {
            int binarySearch = Arrays.binarySearch(this.f4183b, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i >= 0 && c <= this.f4184c[i]) {
                return true;
            }
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.CharMatcher
        public String toString() {
            return this.f4182a;
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.CharMatcher$z */
    /* loaded from: classes2.dex */
    private static final class C3898z extends C3897y {

        /* renamed from: d */
        static final C3898z f4185d = new C3898z();

        private C3898z() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺\ufdff\ufeffￜ".toCharArray());
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return C3874b.f4158b;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new C3875c(charSequence);
                }
                return isEither(charSequence.charAt(0), charSequence.charAt(1));
            }
            return m101288is(charSequence.charAt(0));
        }
        return none();
    }

    public static CharMatcher ascii() {
        return C3876d.f4160b;
    }

    public static CharMatcher breakingWhitespace() {
        return C3877e.f4161a;
    }

    @Deprecated
    public static CharMatcher digit() {
        return C3878f.f4162d;
    }

    private String finishCollapseFrom(CharSequence charSequence, int i, int i2, char c, StringBuilder sb2, boolean z) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (!z) {
                    sb2.append(c);
                    z = true;
                }
            } else {
                sb2.append(charAt);
                z = false;
            }
            i++;
        }
        return sb2.toString();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        if (predicate instanceof CharMatcher) {
            return (CharMatcher) predicate;
        }
        return new C3880h(predicate);
    }

    public static CharMatcher inRange(char c, char c2) {
        return new C3881i(c, c2);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return C3882j.f4166d;
    }

    /* renamed from: is */
    public static CharMatcher m101288is(char c) {
        return new C3883k(c);
    }

    private static C3884l isEither(char c, char c2) {
        return new C3884l(c, c2);
    }

    public static CharMatcher isNot(char c) {
        return new C3885m(c);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return C3886n.f4171a;
    }

    public static CharMatcher javaIsoControl() {
        return C3887o.f4172b;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return C3888p.f4173a;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return C3889q.f4174a;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return C3890r.f4175a;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return C3891s.f4176a;
    }

    public static CharMatcher none() {
        return C3895w.f4179b;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String showCharacter(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return C3898z.f4185d;
    }

    public static CharMatcher whitespace() {
        return C3873a0.f4157c;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new C3872a(this, charMatcher);
    }

    public String collapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (matches(charAt)) {
                if (charAt == c && (i == length - 1 || !matches(charSequence.charAt(i + 1)))) {
                    i++;
                } else {
                    StringBuilder sb2 = new StringBuilder(length);
                    sb2.append(charSequence, 0, i);
                    sb2.append(c);
                    return finishCollapseFrom(charSequence, i + 1, length, c, sb2, true);
                }
            }
            i++;
        }
        return charSequence.toString();
    }

    public int countIn(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (matches(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public int indexIn(CharSequence charSequence) {
        return indexIn(charSequence, 0);
    }

    public int lastIndexIn(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (matches(charSequence.charAt(length))) {
                return length;
            }
        }
        return -1;
    }

    public abstract boolean matches(char c);

    public boolean matchesAllOf(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return false;
            }
        }
        return true;
    }

    public boolean matchesAnyOf(CharSequence charSequence) {
        return !matchesNoneOf(charSequence);
    }

    public boolean matchesNoneOf(CharSequence charSequence) {
        if (indexIn(charSequence) == -1) {
            return true;
        }
        return false;
    }

    public CharMatcher negate() {
        return new C3893u(this);
    }

    /* renamed from: or */
    public CharMatcher mo101285or(CharMatcher charMatcher) {
        return new C3896x(this, charMatcher);
    }

    public String removeFrom(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        int i = 1;
        while (true) {
            indexIn++;
            while (indexIn != charArray.length) {
                if (matches(charArray[indexIn])) {
                    break;
                }
                charArray[indexIn - i] = charArray[indexIn];
                indexIn++;
            }
            return new String(charArray, 0, indexIn - i);
            i++;
        }
    }

    public String replaceFrom(CharSequence charSequence, char c) {
        String charSequence2 = charSequence.toString();
        int indexIn = indexIn(charSequence2);
        if (indexIn == -1) {
            return charSequence2;
        }
        char[] charArray = charSequence2.toCharArray();
        charArray[indexIn] = c;
        while (true) {
            indexIn++;
            if (indexIn < charArray.length) {
                if (matches(charArray[indexIn])) {
                    charArray[indexIn] = c;
                }
            } else {
                return new String(charArray);
            }
        }
    }

    public String retainFrom(CharSequence charSequence) {
        return negate().removeFrom(charSequence);
    }

    void setBits(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public String toString() {
        return super.toString();
    }

    public String trimAndCollapseFrom(CharSequence charSequence, char c) {
        int length = charSequence.length();
        int i = length - 1;
        int i2 = 0;
        while (i2 < length && matches(charSequence.charAt(i2))) {
            i2++;
        }
        int i3 = i;
        while (i3 > i2 && matches(charSequence.charAt(i3))) {
            i3--;
        }
        if (i2 == 0 && i3 == i) {
            return collapseFrom(charSequence, c);
        }
        int i4 = i3 + 1;
        return finishCollapseFrom(charSequence, i2, i4, c, new StringBuilder(i4 - i2), false);
    }

    public String trimFrom(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && matches(charSequence.charAt(i))) {
            i++;
        }
        int i2 = length - 1;
        while (i2 > i && matches(charSequence.charAt(i2))) {
            i2--;
        }
        return charSequence.subSequence(i, i2 + 1).toString();
    }

    public String trimLeadingFrom(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            if (!matches(charSequence.charAt(i))) {
                return charSequence.subSequence(i, length).toString();
            }
        }
        return "";
    }

    public String trimTrailingFrom(CharSequence charSequence) {
        for (int length = charSequence.length() - 1; length >= 0; length--) {
            if (!matches(charSequence.charAt(length))) {
                return charSequence.subSequence(0, length + 1).toString();
            }
        }
        return "";
    }

    @Override // com.applovin.exoplayer2.common.base.Predicate
    @Deprecated
    public boolean apply(Character ch) {
        return matches(ch.charValue());
    }

    public int indexIn(CharSequence charSequence, int i) {
        int length = charSequence.length();
        Preconditions.checkPositionIndex(i, length);
        while (i < length) {
            if (matches(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
        int length = charSequence2.length();
        if (length == 0) {
            return removeFrom(charSequence);
        }
        int i = 0;
        if (length == 1) {
            return replaceFrom(charSequence, charSequence2.charAt(0));
        }
        String charSequence3 = charSequence.toString();
        int indexIn = indexIn(charSequence3);
        if (indexIn == -1) {
            return charSequence3;
        }
        int length2 = charSequence3.length();
        StringBuilder sb2 = new StringBuilder(((length2 * 3) / 2) + 16);
        do {
            sb2.append((CharSequence) charSequence3, i, indexIn);
            sb2.append(charSequence2);
            i = indexIn + 1;
            indexIn = indexIn(charSequence3, i);
        } while (indexIn != -1);
        sb2.append((CharSequence) charSequence3, i, length2);
        return sb2.toString();
    }
}
