package p1077ze;

import com.ironsource.C20517nb;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1001ud.progressionUtil;

@Metadata
/* renamed from: ze.x */
/* loaded from: classes10.dex */
public final class MediaType {
    @NotNull

    /* renamed from: e */
    public static final C45335a f119348e = new C45335a(null);

    /* renamed from: f */
    private static final Pattern f119349f = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: g */
    private static final Pattern f119350g = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    @NotNull

    /* renamed from: a */
    private final String f119351a;
    @NotNull

    /* renamed from: b */
    private final String f119352b;
    @NotNull

    /* renamed from: c */
    private final String f119353c;
    @NotNull

    /* renamed from: d */
    private final String[] f119354d;

    /* compiled from: MediaType.kt */
    @Metadata
    /* renamed from: ze.x$a */
    /* loaded from: classes10.dex */
    public static final class C45335a {
        private C45335a() {
        }

        public /* synthetic */ C45335a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final MediaType m96a(@NotNull String str) {
            boolean m16624M;
            boolean m16616x;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = MediaType.f119349f.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "typeSubtype.group(1)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase = group.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "typeSubtype.group(2)");
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = group2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = MediaType.f119350g.matcher(str);
                int end = matcher.end();
                while (end < str.length()) {
                    matcher2.region(end, str.length());
                    if (matcher2.lookingAt()) {
                        String group3 = matcher2.group(1);
                        if (group3 == null) {
                            end = matcher2.end();
                        } else {
                            String group4 = matcher2.group(2);
                            if (group4 != null) {
                                m16624M = StringsJVM.m16624M(group4, "'", false, 2, null);
                                if (m16624M) {
                                    m16616x = StringsJVM.m16616x(group4, "'", false, 2, null);
                                    if (m16616x && group4.length() > 2) {
                                        group4 = group4.substring(1, group4.length() - 1);
                                        Intrinsics.checkNotNullExpressionValue(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                                    }
                                }
                            } else {
                                group4 = matcher2.group(3);
                            }
                            arrayList.add(group3);
                            arrayList.add(group4);
                            end = matcher2.end();
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Parameter is not formatted correctly: \"");
                        String substring = str.substring(end);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                        sb2.append(substring);
                        sb2.append("\" for: \"");
                        sb2.append(str);
                        sb2.append('\"');
                        throw new IllegalArgumentException(sb2.toString().toString());
                    }
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return new MediaType(str, lowerCase, lowerCase2, (String[]) array, null);
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
        }

        @Nullable
        /* renamed from: b */
        public final MediaType m95b(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            try {
                return m96a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public /* synthetic */ MediaType(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    /* renamed from: d */
    public static /* synthetic */ Charset m99d(MediaType mediaType, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = null;
        }
        return mediaType.m100c(charset);
    }

    @Nullable
    /* renamed from: f */
    public static final MediaType m97f(@NotNull String str) {
        return f119348e.m95b(str);
    }

    @Nullable
    /* renamed from: c */
    public final Charset m100c(@Nullable Charset charset) {
        String m98e = m98e(C20517nb.f52166M);
        if (m98e == null) {
            return charset;
        }
        try {
            return Charset.forName(m98e);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    @Nullable
    /* renamed from: e */
    public final String m98e(@NotNull String name) {
        boolean m16615y;
        Intrinsics.checkNotNullParameter(name, "name");
        int i = 0;
        int m2862c = progressionUtil.m2862c(0, this.f119354d.length - 1, 2);
        if (m2862c < 0) {
            return null;
        }
        while (true) {
            int i2 = i + 2;
            m16615y = StringsJVM.m16615y(this.f119354d[i], name, true);
            if (m16615y) {
                return this.f119354d[i + 1];
            }
            if (i != m2862c) {
                i = i2;
            } else {
                return null;
            }
        }
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof MediaType) && Intrinsics.m17075f(((MediaType) obj).f119351a, this.f119351a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f119351a.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f119351a;
    }

    private MediaType(String str, String str2, String str3, String[] strArr) {
        this.f119351a = str;
        this.f119352b = str2;
        this.f119353c = str3;
        this.f119354d = strArr;
    }
}
