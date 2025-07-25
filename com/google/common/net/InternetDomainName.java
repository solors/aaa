package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import com.google.thirdparty.publicsuffix.PublicSuffixPatterns;
import com.google.thirdparty.publicsuffix.PublicSuffixType;
import java.util.List;

@Immutable
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class InternetDomainName {

    /* renamed from: e */
    private static final CharMatcher f41397e = CharMatcher.anyOf(".。．｡");

    /* renamed from: f */
    private static final Splitter f41398f = Splitter.m70013on('.');

    /* renamed from: g */
    private static final Joiner f41399g = Joiner.m70068on('.');

    /* renamed from: h */
    private static final CharMatcher f41400h;

    /* renamed from: i */
    private static final CharMatcher f41401i;

    /* renamed from: j */
    private static final CharMatcher f41402j;

    /* renamed from: k */
    private static final CharMatcher f41403k;

    /* renamed from: a */
    private final String f41404a;

    /* renamed from: b */
    private final ImmutableList<String> f41405b;

    /* renamed from: c */
    private final int f41406c;

    /* renamed from: d */
    private final int f41407d;

    static {
        CharMatcher anyOf = CharMatcher.anyOf("-_");
        f41400h = anyOf;
        CharMatcher inRange = CharMatcher.inRange('0', '9');
        f41401i = inRange;
        CharMatcher mo70088or = CharMatcher.inRange('a', 'z').mo70088or(CharMatcher.inRange('A', 'Z'));
        f41402j = mo70088or;
        f41403k = inRange.mo70088or(mo70088or).mo70088or(anyOf);
    }

    InternetDomainName(String str) {
        boolean z;
        String lowerCase = Ascii.toLowerCase(f41397e.replaceFrom((CharSequence) str, '.'));
        lowerCase = lowerCase.endsWith(".") ? lowerCase.substring(0, lowerCase.length() - 1) : lowerCase;
        if (lowerCase.length() <= 253) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Domain name too long: '%s':", lowerCase);
        this.f41404a = lowerCase;
        ImmutableList<String> copyOf = ImmutableList.copyOf(f41398f.split(lowerCase));
        this.f41405b = copyOf;
        Preconditions.checkArgument(copyOf.size() <= 127, "Domain has too many parts: '%s'", lowerCase);
        Preconditions.checkArgument(m68094f(copyOf), "Not a valid domain name: '%s'", lowerCase);
        this.f41406c = m68098b(Optional.absent());
        this.f41407d = m68098b(Optional.m70057of(PublicSuffixType.REGISTRY));
    }

    /* renamed from: a */
    private InternetDomainName m68099a(int i) {
        Joiner joiner = f41399g;
        ImmutableList<String> immutableList = this.f41405b;
        return from(joiner.join(immutableList.subList(i, immutableList.size())));
    }

    /* renamed from: b */
    private int m68098b(Optional<PublicSuffixType> optional) {
        int size = this.f41405b.size();
        for (int i = 0; i < size; i++) {
            String join = f41399g.join(this.f41405b.subList(i, size));
            if (m68097c(optional, Optional.fromNullable(PublicSuffixPatterns.EXACT.get(join)))) {
                return i;
            }
            if (PublicSuffixPatterns.EXCLUDED.containsKey(join)) {
                return i + 1;
            }
            if (m68096d(optional, join)) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    private static boolean m68097c(Optional<PublicSuffixType> optional, Optional<PublicSuffixType> optional2) {
        if (optional.isPresent()) {
            return optional.equals(optional2);
        }
        return optional2.isPresent();
    }

    /* renamed from: d */
    private static boolean m68096d(Optional<PublicSuffixType> optional, String str) {
        List<String> splitToList = f41398f.limit(2).splitToList(str);
        if (splitToList.size() == 2 && m68097c(optional, Optional.fromNullable(PublicSuffixPatterns.UNDER.get(splitToList.get(1))))) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m68095e(String str, boolean z) {
        if (str.length() >= 1 && str.length() <= 63) {
            if (!f41403k.matchesAllOf(CharMatcher.ascii().retainFrom(str))) {
                return false;
            }
            CharMatcher charMatcher = f41400h;
            if (!charMatcher.matches(str.charAt(0)) && !charMatcher.matches(str.charAt(str.length() - 1))) {
                if (z && f41401i.matches(str.charAt(0))) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m68094f(List<String> list) {
        int size = list.size() - 1;
        if (!m68095e(list.get(size), true)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!m68095e(list.get(i), false)) {
                return false;
            }
        }
        return true;
    }

    @CanIgnoreReturnValue
    public static InternetDomainName from(String str) {
        return new InternetDomainName((String) Preconditions.checkNotNull(str));
    }

    public static boolean isValid(String str) {
        try {
            from(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public InternetDomainName child(String str) {
        String str2 = (String) Preconditions.checkNotNull(str);
        String str3 = this.f41404a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
        sb2.append(str2);
        sb2.append(".");
        sb2.append(str3);
        return from(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.f41404a.equals(((InternetDomainName) obj).f41404a);
        }
        return false;
    }

    public boolean hasParent() {
        if (this.f41405b.size() > 1) {
            return true;
        }
        return false;
    }

    public boolean hasPublicSuffix() {
        if (this.f41406c != -1) {
            return true;
        }
        return false;
    }

    public boolean hasRegistrySuffix() {
        if (this.f41407d != -1) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f41404a.hashCode();
    }

    public boolean isPublicSuffix() {
        if (this.f41406c == 0) {
            return true;
        }
        return false;
    }

    public boolean isRegistrySuffix() {
        if (this.f41407d == 0) {
            return true;
        }
        return false;
    }

    public boolean isTopDomainUnderRegistrySuffix() {
        if (this.f41407d == 1) {
            return true;
        }
        return false;
    }

    public boolean isTopPrivateDomain() {
        if (this.f41406c == 1) {
            return true;
        }
        return false;
    }

    public boolean isUnderPublicSuffix() {
        if (this.f41406c > 0) {
            return true;
        }
        return false;
    }

    public boolean isUnderRegistrySuffix() {
        if (this.f41407d > 0) {
            return true;
        }
        return false;
    }

    public InternetDomainName parent() {
        Preconditions.checkState(hasParent(), "Domain '%s' has no parent", this.f41404a);
        return m68099a(1);
    }

    public ImmutableList<String> parts() {
        return this.f41405b;
    }

    public InternetDomainName publicSuffix() {
        if (hasPublicSuffix()) {
            return m68099a(this.f41406c);
        }
        return null;
    }

    public InternetDomainName registrySuffix() {
        if (hasRegistrySuffix()) {
            return m68099a(this.f41407d);
        }
        return null;
    }

    public String toString() {
        return this.f41404a;
    }

    public InternetDomainName topDomainUnderRegistrySuffix() {
        if (isTopDomainUnderRegistrySuffix()) {
            return this;
        }
        Preconditions.checkState(isUnderRegistrySuffix(), "Not under a registry suffix: %s", this.f41404a);
        return m68099a(this.f41407d - 1);
    }

    public InternetDomainName topPrivateDomain() {
        if (isTopPrivateDomain()) {
            return this;
        }
        Preconditions.checkState(isUnderPublicSuffix(), "Not under a public suffix: %s", this.f41404a);
        return m68099a(this.f41406c - 1);
    }
}
