package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Platform {

    /* renamed from: a */
    private static final Logger f39422a = Logger.getLogger(Platform.class.getName());

    /* renamed from: b */
    private static final PatternCompiler f39423b = m70048e();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class JdkPatternCompiler implements PatternCompiler {
        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public CommonPattern compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }

        @Override // com.google.common.base.PatternCompiler
        public boolean isPcreLike() {
            return true;
        }
    }

    private Platform() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static CommonPattern m70052a(String str) {
        Preconditions.checkNotNull(str);
        return f39423b.compile(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m70051b(String str) {
        if (m70044i(str)) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m70050c(double d) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static <T extends Enum<T>> Optional<T> m70049d(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = Enums.m70082a(cls).get(str);
        if (weakReference == null) {
            return Optional.absent();
        }
        return Optional.m70057of(cls.cast(weakReference.get()));
    }

    /* renamed from: e */
    private static PatternCompiler m70048e() {
        return new JdkPatternCompiler();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public static String m70047f(String str) {
        if (str == null) {
            return "";
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m70046g() {
        return f39423b.isPcreLike();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static CharMatcher m70045h(CharMatcher charMatcher) {
        return charMatcher.m70094e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static boolean m70044i(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public static long m70043j() {
        return System.nanoTime();
    }
}
