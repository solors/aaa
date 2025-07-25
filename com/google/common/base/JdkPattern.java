package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
final class JdkPattern extends CommonPattern implements Serializable {

    /* renamed from: b */
    private final Pattern f39399b;

    /* loaded from: classes4.dex */
    private static final class JdkMatcher extends CommonMatcher {

        /* renamed from: a */
        final Matcher f39400a;

        JdkMatcher(Matcher matcher) {
            this.f39400a = (Matcher) Preconditions.checkNotNull(matcher);
        }

        @Override // com.google.common.base.CommonMatcher
        public int end() {
            return this.f39400a.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find() {
            return this.f39400a.find();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean matches() {
            return this.f39400a.matches();
        }

        @Override // com.google.common.base.CommonMatcher
        public String replaceAll(String str) {
            return this.f39400a.replaceAll(str);
        }

        @Override // com.google.common.base.CommonMatcher
        public int start() {
            return this.f39400a.start();
        }

        @Override // com.google.common.base.CommonMatcher
        public boolean find(int i) {
            return this.f39400a.find(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JdkPattern(Pattern pattern) {
        this.f39399b = (Pattern) Preconditions.checkNotNull(pattern);
    }

    @Override // com.google.common.base.CommonPattern
    public int flags() {
        return this.f39399b.flags();
    }

    @Override // com.google.common.base.CommonPattern
    public CommonMatcher matcher(CharSequence charSequence) {
        return new JdkMatcher(this.f39399b.matcher(charSequence));
    }

    @Override // com.google.common.base.CommonPattern
    public String pattern() {
        return this.f39399b.pattern();
    }

    @Override // com.google.common.base.CommonPattern
    public String toString() {
        return this.f39399b.toString();
    }
}
