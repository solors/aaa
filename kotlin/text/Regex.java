package kotlin.text;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C37635g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Regex implements Serializable {
    @NotNull

    /* renamed from: c */
    public static final C37675a f99452c = new C37675a(null);
    @NotNull

    /* renamed from: b */
    private final Pattern f99453b;

    /* compiled from: Regex.kt */
    @Metadata
    /* renamed from: kotlin.text.Regex$a */
    /* loaded from: classes7.dex */
    public static final class C37675a {
        private C37675a() {
        }

        public /* synthetic */ C37675a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public final int m16761b(int i) {
            if ((i & 2) != 0) {
                return i | 64;
            }
            return i;
        }
    }

    /* compiled from: Regex.kt */
    @Metadata
    /* renamed from: kotlin.text.Regex$b */
    /* loaded from: classes7.dex */
    private static final class C37676b implements Serializable {
        @NotNull

        /* renamed from: d */
        public static final C37677a f99454d = new C37677a(null);
        @NotNull

        /* renamed from: b */
        private final String f99455b;

        /* renamed from: c */
        private final int f99456c;

        /* compiled from: Regex.kt */
        @Metadata
        /* renamed from: kotlin.text.Regex$b$a */
        /* loaded from: classes7.dex */
        public static final class C37677a {
            private C37677a() {
            }

            public /* synthetic */ C37677a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C37676b(@NotNull String pattern, int i) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            this.f99455b = pattern;
            this.f99456c = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.f99455b, this.f99456c);
            Intrinsics.checkNotNullExpressionValue(compile, "compile(...)");
            return new Regex(compile);
        }
    }

    public Regex(@NotNull Pattern nativePattern) {
        Intrinsics.checkNotNullParameter(nativePattern, "nativePattern");
        this.f99453b = nativePattern;
    }

    /* renamed from: c */
    public static /* synthetic */ MatchResult m16768c(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.m16769b(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.f99453b.pattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "pattern(...)");
        return new C37676b(pattern, this.f99453b.flags());
    }

    /* renamed from: a */
    public final boolean m16770a(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f99453b.matcher(input).find();
    }

    @Nullable
    /* renamed from: b */
    public final MatchResult m16769b(@NotNull CharSequence input, int i) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f99453b.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return C37684e.m16738a(matcher, i, input);
    }

    @Nullable
    /* renamed from: d */
    public final MatchResult m16767d(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        Matcher matcher = this.f99453b.matcher(input);
        Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
        return C37684e.m16737b(matcher, input);
    }

    /* renamed from: e */
    public final boolean m16766e(@NotNull CharSequence input) {
        Intrinsics.checkNotNullParameter(input, "input");
        return this.f99453b.matcher(input).matches();
    }

    @NotNull
    /* renamed from: f */
    public final String m16765f(@NotNull CharSequence input, @NotNull Function1<? super MatchResult, ? extends CharSequence> transform) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(transform, "transform");
        int i = 0;
        MatchResult m16768c = m16768c(this, input, 0, 2, null);
        if (m16768c == null) {
            return input.toString();
        }
        int length = input.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(input, i, m16768c.mo16747d().getStart().intValue());
            sb2.append(transform.invoke(m16768c));
            i = m16768c.mo16747d().getEndInclusive().intValue() + 1;
            m16768c = m16768c.next();
            if (i >= length) {
                break;
            }
        } while (m16768c != null);
        if (i < length) {
            sb2.append(input, i, length);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @NotNull
    /* renamed from: g */
    public final String m16764g(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceFirst = this.f99453b.matcher(input).replaceFirst(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceFirst, "replaceFirst(...)");
        return replaceFirst;
    }

    @NotNull
    /* renamed from: h */
    public final List<String> m16763h(@NotNull CharSequence input, int i) {
        List<String> m17175e;
        Intrinsics.checkNotNullParameter(input, "input");
        C37690r.m16545x0(i);
        Matcher matcher = this.f99453b.matcher(input);
        if (i == 1 || !matcher.find()) {
            m17175e = CollectionsJVM.m17175e(input.toString());
            return m17175e;
        }
        int i2 = 10;
        if (i > 0) {
            i2 = C37635g.m16934j(i, 10);
        }
        ArrayList arrayList = new ArrayList(i2);
        int i3 = i - 1;
        int i4 = 0;
        do {
            arrayList.add(input.subSequence(i4, matcher.start()).toString());
            i4 = matcher.end();
            if (i3 >= 0 && arrayList.size() == i3) {
                break;
            }
        } while (matcher.find());
        arrayList.add(input.subSequence(i4, input.length()).toString());
        return arrayList;
    }

    @NotNull
    public final String replace(@NotNull CharSequence input, @NotNull String replacement) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(replacement, "replacement");
        String replaceAll = this.f99453b.matcher(input).replaceAll(replacement);
        Intrinsics.checkNotNullExpressionValue(replaceAll, "replaceAll(...)");
        return replaceAll;
    }

    @NotNull
    public String toString() {
        String pattern = this.f99453b.toString();
        Intrinsics.checkNotNullExpressionValue(pattern, "toString(...)");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.EnumC37685f r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "option"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.text.Regex$a r0 = kotlin.text.Regex.f99452c
            int r3 = r3.m16729c()
            int r3 = kotlin.text.Regex.C37675a.m16762a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.f):void");
    }
}
