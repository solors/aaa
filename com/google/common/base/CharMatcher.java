package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import java.util.BitSet;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class CharMatcher implements Predicate<Character> {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class And extends CharMatcher {

        /* renamed from: b */
        final CharMatcher f39326b;

        /* renamed from: c */
        final CharMatcher f39327c;

        And(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f39326b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f39327c = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f39326b.mo70024g(bitSet2);
            BitSet bitSet3 = new BitSet();
            this.f39327c.mo70024g(bitSet3);
            bitSet2.and(bitSet3);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (this.f39326b.matches(c) && this.f39327c.matches(c)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f39326b);
            String valueOf2 = String.valueOf(this.f39327c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 19 + valueOf2.length());
            sb2.append("CharMatcher.and(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class Any extends NamedFastMatcher {

        /* renamed from: c */
        static final Any f39328c = new Any();

        private Any() {
            super("CharMatcher.any()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            if (charSequence.length() == 0) {
                return "";
            }
            return String.valueOf(c);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            return charSequence.length() == 0 ? -1 : 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            return charSequence.length() - 1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo70088or(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            char[] cArr = new char[charSequence.length()];
            Arrays.fill(cArr, c);
            return new String(cArr);
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return "";
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            int length = charSequence.length();
            Preconditions.checkPositionIndex(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * charSequence2.length());
            for (int i = 0; i < charSequence.length(); i++) {
                sb2.append(charSequence2);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class AnyOf extends CharMatcher {

        /* renamed from: b */
        private final char[] f39329b;

        public AnyOf(CharSequence charSequence) {
            char[] charArray = charSequence.toString().toCharArray();
            this.f39329b = charArray;
            Arrays.sort(charArray);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            for (char c : this.f39329b) {
                bitSet.set(c);
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (Arrays.binarySearch(this.f39329b, c) >= 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.anyOf(\"");
            for (char c : this.f39329b) {
                sb2.append(CharMatcher.m70092h(c));
            }
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static final class Ascii extends NamedFastMatcher {

        /* renamed from: c */
        static final Ascii f39330c = new Ascii();

        Ascii() {
            super("CharMatcher.ascii()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c <= 127) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @GwtIncompatible
    /* loaded from: classes4.dex */
    public static final class BitSetMatcher extends NamedFastMatcher {

        /* renamed from: c */
        private final BitSet f39331c;

        @Override // com.google.common.base.CharMatcher
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            bitSet.or(this.f39331c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f39331c.get(c);
        }

        private BitSetMatcher(BitSet bitSet, String str) {
            super(str);
            this.f39331c = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
        }
    }

    /* loaded from: classes4.dex */
    private static final class BreakingWhitespace extends CharMatcher {

        /* renamed from: b */
        static final CharMatcher f39332b = new BreakingWhitespace();

        private BreakingWhitespace() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
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

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.breakingWhitespace()";
        }
    }

    /* loaded from: classes4.dex */
    private static final class Digit extends RangesMatcher {

        /* renamed from: f */
        static final Digit f39333f = new Digit();

        private Digit() {
            super("CharMatcher.digit()", m70089j(), m70090i());
        }

        /* renamed from: i */
        private static char[] m70090i() {
            char[] cArr = new char[37];
            for (int i = 0; i < 37; i++) {
                cArr[i] = (char) ("0٠۰߀०০੦૦୦௦౦೦൦\u0de6๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐\ua9f0꩐꯰０".charAt(i) + '\t');
            }
            return cArr;
        }

        /* renamed from: j */
        private static char[] m70089j() {
            return "0٠۰߀०০੦૦୦௦౦೦൦\u0de6๐໐༠၀႐០᠐᥆᧐᪀᪐᭐᮰᱀᱐꘠꣐꤀꧐\ua9f0꩐꯰０".toCharArray();
        }
    }

    /* loaded from: classes4.dex */
    private static final class ForPredicate extends CharMatcher {

        /* renamed from: b */
        private final Predicate<? super Character> f39334b;

        ForPredicate(Predicate<? super Character> predicate) {
            this.f39334b = (Predicate) Preconditions.checkNotNull(predicate);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return this.f39334b.apply(Character.valueOf(c));
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f39334b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 26);
            sb2.append("CharMatcher.forPredicate(");
            sb2.append(valueOf);
            sb2.append(")");
            return sb2.toString();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        public boolean apply(Character ch) {
            return this.f39334b.apply(Preconditions.checkNotNull(ch));
        }
    }

    /* loaded from: classes4.dex */
    private static final class InRange extends FastMatcher {

        /* renamed from: b */
        private final char f39335b;

        /* renamed from: c */
        private final char f39336c;

        InRange(char c, char c2) {
            boolean z;
            if (c2 >= c) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z);
            this.f39335b = c;
            this.f39336c = c2;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            bitSet.set(this.f39335b, this.f39336c + 1);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (this.f39335b <= c && c <= this.f39336c) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m70092h = CharMatcher.m70092h(this.f39335b);
            String m70092h2 = CharMatcher.m70092h(this.f39336c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m70092h).length() + 27 + String.valueOf(m70092h2).length());
            sb2.append("CharMatcher.inRange('");
            sb2.append(m70092h);
            sb2.append("', '");
            sb2.append(m70092h2);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static final class Invisible extends RangesMatcher {

        /* renamed from: f */
        static final Invisible f39337f = new Invisible();

        private Invisible() {
            super("CharMatcher.invisible()", "\u0000\u007f\u00ad\u0600\u061c\u06dd\u070f\u0890\u08e2\u1680\u180e\u2000\u2028\u205f\u2066\u3000\ud800\ufeff\ufff9".toCharArray(), "  \u00ad\u0605\u061c\u06dd\u070f\u0891\u08e2\u1680\u180e\u200f \u2064\u206f\u3000\uf8ff\ufeff\ufffb".toCharArray());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.base.CharMatcher$Is */
    /* loaded from: classes4.dex */
    public static final class C16643Is extends FastMatcher {

        /* renamed from: b */
        private final char f39338b;

        C16643Is(char c) {
            this.f39338b = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f39338b)) {
                return this;
            }
            return CharMatcher.none();
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            bitSet.set(this.f39338b);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c == this.f39338b) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.isNot(this.f39338b);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo70088or(CharMatcher charMatcher) {
            if (!charMatcher.matches(this.f39338b)) {
                return super.mo70088or(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString().replace(this.f39338b, c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m70092h = CharMatcher.m70092h(this.f39338b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m70092h).length() + 18);
            sb2.append("CharMatcher.is('");
            sb2.append(m70092h);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class IsEither extends FastMatcher {

        /* renamed from: b */
        private final char f39339b;

        /* renamed from: c */
        private final char f39340c;

        IsEither(char c, char c2) {
            this.f39339b = c;
            this.f39340c = c2;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            bitSet.set(this.f39339b);
            bitSet.set(this.f39340c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != this.f39339b && c != this.f39340c) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m70092h = CharMatcher.m70092h(this.f39339b);
            String m70092h2 = CharMatcher.m70092h(this.f39340c);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m70092h).length() + 21 + String.valueOf(m70092h2).length());
            sb2.append("CharMatcher.anyOf(\"");
            sb2.append(m70092h);
            sb2.append(m70092h2);
            sb2.append("\")");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class IsNot extends FastMatcher {

        /* renamed from: b */
        private final char f39341b;

        IsNot(char c) {
            this.f39341b = c;
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f39341b)) {
                return super.and(charMatcher);
            }
            return charMatcher;
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            bitSet.set(0, this.f39341b);
            bitSet.set(this.f39341b + 1, 65536);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c != this.f39341b) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.m70091is(this.f39341b);
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo70088or(CharMatcher charMatcher) {
            if (charMatcher.matches(this.f39341b)) {
                return CharMatcher.any();
            }
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String m70092h = CharMatcher.m70092h(this.f39341b);
            StringBuilder sb2 = new StringBuilder(String.valueOf(m70092h).length() + 21);
            sb2.append("CharMatcher.isNot('");
            sb2.append(m70092h);
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static final class JavaDigit extends CharMatcher {

        /* renamed from: b */
        static final JavaDigit f39342b = new JavaDigit();

        private JavaDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaDigit()";
        }
    }

    /* loaded from: classes4.dex */
    private static final class JavaIsoControl extends NamedFastMatcher {

        /* renamed from: c */
        static final JavaIsoControl f39343c = new JavaIsoControl();

        private JavaIsoControl() {
            super("CharMatcher.javaIsoControl()");
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (c > 31 && (c < 127 || c > 159)) {
                return false;
            }
            return true;
        }
    }

    /* loaded from: classes4.dex */
    private static final class JavaLetter extends CharMatcher {

        /* renamed from: b */
        static final JavaLetter f39344b = new JavaLetter();

        private JavaLetter() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetter(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetter()";
        }
    }

    /* loaded from: classes4.dex */
    private static final class JavaLetterOrDigit extends CharMatcher {

        /* renamed from: b */
        static final JavaLetterOrDigit f39345b = new JavaLetterOrDigit();

        private JavaLetterOrDigit() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLetterOrDigit(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLetterOrDigit()";
        }
    }

    /* loaded from: classes4.dex */
    private static final class JavaLowerCase extends CharMatcher {

        /* renamed from: b */
        static final JavaLowerCase f39346b = new JavaLowerCase();

        private JavaLowerCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isLowerCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaLowerCase()";
        }
    }

    /* loaded from: classes4.dex */
    private static final class JavaUpperCase extends CharMatcher {

        /* renamed from: b */
        static final JavaUpperCase f39347b = new JavaUpperCase();

        private JavaUpperCase() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return Character.isUpperCase(c);
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return "CharMatcher.javaUpperCase()";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static abstract class NamedFastMatcher extends FastMatcher {

        /* renamed from: b */
        private final String f39348b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public NamedFastMatcher(String str) {
            this.f39348b = (String) Preconditions.checkNotNull(str);
        }

        @Override // com.google.common.base.CharMatcher
        public final String toString() {
            return this.f39348b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class Negated extends CharMatcher {

        /* renamed from: b */
        final CharMatcher f39349b;

        Negated(CharMatcher charMatcher) {
            this.f39349b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            return charSequence.length() - this.f39349b.countIn(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            BitSet bitSet2 = new BitSet();
            this.f39349b.mo70024g(bitSet2);
            bitSet2.flip(0, 65536);
            bitSet.or(bitSet2);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return !this.f39349b.matches(c);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            return this.f39349b.matchesNoneOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            return this.f39349b.matchesAllOf(charSequence);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return this.f39349b;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f39349b);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 9);
            sb2.append(valueOf);
            sb2.append(".negate()");
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class None extends NamedFastMatcher {

        /* renamed from: c */
        static final None f39350c = new None();

        private None() {
            super("CharMatcher.none()");
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher and(CharMatcher charMatcher) {
            Preconditions.checkNotNull(charMatcher);
            return this;
        }

        @Override // com.google.common.base.CharMatcher
        public String collapseFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int countIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return 0;
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public int lastIndexIn(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesAllOf(CharSequence charSequence) {
            if (charSequence.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matchesNoneOf(CharSequence charSequence) {
            Preconditions.checkNotNull(charSequence);
            return true;
        }

        @Override // com.google.common.base.CharMatcher.FastMatcher, com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return CharMatcher.any();
        }

        @Override // com.google.common.base.CharMatcher
        /* renamed from: or */
        public CharMatcher mo70088or(CharMatcher charMatcher) {
            return (CharMatcher) Preconditions.checkNotNull(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public String removeFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, char c) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimLeadingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public String trimTrailingFrom(CharSequence charSequence) {
            return charSequence.toString();
        }

        @Override // com.google.common.base.CharMatcher
        public int indexIn(CharSequence charSequence, int i) {
            Preconditions.checkPositionIndex(i, charSequence.length());
            return -1;
        }

        @Override // com.google.common.base.CharMatcher
        public String replaceFrom(CharSequence charSequence, CharSequence charSequence2) {
            Preconditions.checkNotNull(charSequence2);
            return charSequence.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.google.common.base.CharMatcher$Or */
    /* loaded from: classes4.dex */
    public static final class C16644Or extends CharMatcher {

        /* renamed from: b */
        final CharMatcher f39351b;

        /* renamed from: c */
        final CharMatcher f39352c;

        C16644Or(CharMatcher charMatcher, CharMatcher charMatcher2) {
            this.f39351b = (CharMatcher) Preconditions.checkNotNull(charMatcher);
            this.f39352c = (CharMatcher) Preconditions.checkNotNull(charMatcher2);
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            this.f39351b.mo70024g(bitSet);
            this.f39352c.mo70024g(bitSet);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if (!this.f39351b.matches(c) && !this.f39352c.matches(c)) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            String valueOf = String.valueOf(this.f39351b);
            String valueOf2 = String.valueOf(this.f39352c);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 18 + valueOf2.length());
            sb2.append("CharMatcher.or(");
            sb2.append(valueOf);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* loaded from: classes4.dex */
    private static class RangesMatcher extends CharMatcher {

        /* renamed from: b */
        private final String f39353b;

        /* renamed from: c */
        private final char[] f39354c;

        /* renamed from: d */
        private final char[] f39355d;

        RangesMatcher(String str, char[] cArr, char[] cArr2) {
            boolean z;
            boolean z2;
            boolean z3;
            this.f39353b = str;
            this.f39354c = cArr;
            this.f39355d = cArr2;
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

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            int binarySearch = Arrays.binarySearch(this.f39354c, c);
            if (binarySearch >= 0) {
                return true;
            }
            int i = (~binarySearch) - 1;
            if (i >= 0 && c <= this.f39355d[i]) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.base.CharMatcher
        public String toString() {
            return this.f39353b;
        }
    }

    /* loaded from: classes4.dex */
    private static final class SingleWidth extends RangesMatcher {

        /* renamed from: f */
        static final SingleWidth f39356f = new SingleWidth();

        private SingleWidth() {
            super("CharMatcher.singleWidth()", "\u0000־א׳\u0600ݐ\u0e00Ḁ℀ﭐﹰ｡".toCharArray(), "ӹ־ת״ۿݿ\u0e7f₯℺\ufdff\ufeffￜ".toCharArray());
        }
    }

    @VisibleForTesting
    /* loaded from: classes4.dex */
    static final class Whitespace extends NamedFastMatcher {

        /* renamed from: c */
        static final int f39357c = Integer.numberOfLeadingZeros(31);

        /* renamed from: d */
        static final Whitespace f39358d = new Whitespace();

        Whitespace() {
            super("CharMatcher.whitespace()");
        }

        @Override // com.google.common.base.CharMatcher
        @GwtIncompatible
        /* renamed from: g */
        void mo70024g(BitSet bitSet) {
            for (int i = 0; i < 32; i++) {
                bitSet.set("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt(i));
            }
        }

        @Override // com.google.common.base.CharMatcher
        public boolean matches(char c) {
            if ("\u2002\u3000\r\u0085\u200a\u2005\u2000\u3000\u2029\u000b\u3000\u2008\u2003\u205f\u3000\u1680\t \u2006\u2001  \f\u2009\u3000\u2004\u3000\u3000\u2028\n \u3000".charAt((48906 * c) >>> f39357c) == c) {
                return true;
            }
            return false;
        }
    }

    protected CharMatcher() {
    }

    public static CharMatcher any() {
        return Any.f39328c;
    }

    public static CharMatcher anyOf(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            if (length != 1) {
                if (length != 2) {
                    return new AnyOf(charSequence);
                }
                return m70096c(charSequence.charAt(0), charSequence.charAt(1));
            }
            return m70091is(charSequence.charAt(0));
        }
        return none();
    }

    public static CharMatcher ascii() {
        return Ascii.f39330c;
    }

    /* renamed from: b */
    private String m70097b(CharSequence charSequence, int i, int i2, char c, StringBuilder sb2, boolean z) {
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

    public static CharMatcher breakingWhitespace() {
        return BreakingWhitespace.f39332b;
    }

    /* renamed from: c */
    private static IsEither m70096c(char c, char c2) {
        return new IsEither(c, c2);
    }

    @GwtIncompatible
    /* renamed from: d */
    private static boolean m70095d(int i, int i2) {
        if (i <= 1023 && i2 > i * 4 * 16) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static CharMatcher digit() {
        return Digit.f39333f;
    }

    @GwtIncompatible
    /* renamed from: f */
    private static CharMatcher m70093f(int i, BitSet bitSet, String str) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (m70095d(i, bitSet.length())) {
                        return SmallCharMatcher.m70021k(bitSet, str);
                    }
                    return new BitSetMatcher(bitSet, str);
                }
                char nextSetBit = (char) bitSet.nextSetBit(0);
                return m70096c(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
            }
            return m70091is((char) bitSet.nextSetBit(0));
        }
        return none();
    }

    public static CharMatcher forPredicate(Predicate<? super Character> predicate) {
        if (predicate instanceof CharMatcher) {
            return (CharMatcher) predicate;
        }
        return new ForPredicate(predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static String m70092h(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static CharMatcher inRange(char c, char c2) {
        return new InRange(c, c2);
    }

    @Deprecated
    public static CharMatcher invisible() {
        return Invisible.f39337f;
    }

    /* renamed from: is */
    public static CharMatcher m70091is(char c) {
        return new C16643Is(c);
    }

    public static CharMatcher isNot(char c) {
        return new IsNot(c);
    }

    @Deprecated
    public static CharMatcher javaDigit() {
        return JavaDigit.f39342b;
    }

    public static CharMatcher javaIsoControl() {
        return JavaIsoControl.f39343c;
    }

    @Deprecated
    public static CharMatcher javaLetter() {
        return JavaLetter.f39344b;
    }

    @Deprecated
    public static CharMatcher javaLetterOrDigit() {
        return JavaLetterOrDigit.f39345b;
    }

    @Deprecated
    public static CharMatcher javaLowerCase() {
        return JavaLowerCase.f39346b;
    }

    @Deprecated
    public static CharMatcher javaUpperCase() {
        return JavaUpperCase.f39347b;
    }

    public static CharMatcher none() {
        return None.f39350c;
    }

    public static CharMatcher noneOf(CharSequence charSequence) {
        return anyOf(charSequence).negate();
    }

    @Deprecated
    public static CharMatcher singleWidth() {
        return SingleWidth.f39356f;
    }

    public static CharMatcher whitespace() {
        return Whitespace.f39358d;
    }

    public CharMatcher and(CharMatcher charMatcher) {
        return new And(this, charMatcher);
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
                    return m70097b(charSequence, i + 1, length, c, sb2, true);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @GwtIncompatible
    /* renamed from: e */
    public CharMatcher m70094e() {
        String str;
        BitSet bitSet = new BitSet();
        mo70024g(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality * 2 <= 65536) {
            return m70093f(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        final String charMatcher = toString();
        if (charMatcher.endsWith(".negate()")) {
            str = charMatcher.substring(0, charMatcher.length() - 9);
        } else if (".negate()".length() != 0) {
            str = charMatcher.concat(".negate()");
        } else {
            str = new String(charMatcher);
        }
        return new NegatedFastMatcher(this, m70093f(i, bitSet, str)) { // from class: com.google.common.base.CharMatcher.1
            @Override // com.google.common.base.CharMatcher.Negated, com.google.common.base.CharMatcher
            public String toString() {
                return charMatcher;
            }
        };
    }

    @GwtIncompatible
    /* renamed from: g */
    void mo70024g(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (matches((char) i)) {
                bitSet.set(i);
            }
        }
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
        return new Negated(this);
    }

    /* renamed from: or */
    public CharMatcher mo70088or(CharMatcher charMatcher) {
        return new C16644Or(this, charMatcher);
    }

    public CharMatcher precomputed() {
        return Platform.m70045h(this);
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
        return m70097b(charSequence, i2, i4, c, new StringBuilder(i4 - i2), false);
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

    @Override // com.google.common.base.Predicate
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

    /* loaded from: classes4.dex */
    static abstract class FastMatcher extends CharMatcher {
        FastMatcher() {
        }

        @Override // com.google.common.base.CharMatcher, com.google.common.base.Predicate
        @Deprecated
        public /* bridge */ /* synthetic */ boolean apply(Character ch) {
            return super.apply(ch);
        }

        @Override // com.google.common.base.CharMatcher
        public CharMatcher negate() {
            return new NegatedFastMatcher(this);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }

    /* loaded from: classes4.dex */
    static class NegatedFastMatcher extends Negated {
        NegatedFastMatcher(CharMatcher charMatcher) {
            super(charMatcher);
        }

        @Override // com.google.common.base.CharMatcher
        public final CharMatcher precomputed() {
            return this;
        }
    }
}
