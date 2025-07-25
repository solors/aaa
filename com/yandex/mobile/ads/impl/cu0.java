package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class cu0 {

    /* renamed from: b */
    private static final Pattern f77768b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: c */
    private static final Pattern f77769c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: d */
    public static final /* synthetic */ int f77770d = 0;
    @NotNull

    /* renamed from: a */
    private final String f77771a;

    /* renamed from: com.yandex.mobile.ads.impl.cu0$a */
    /* loaded from: classes8.dex */
    public static final class C30121a {
        @NotNull
        /* renamed from: a */
        public static cu0 m35156a(@NotNull String str) {
            boolean m16624M;
            boolean m16616x;
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = cu0.f77768b.matcher(str);
            if (matcher.lookingAt()) {
                String group = matcher.group(1);
                Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                Intrinsics.checkNotNullExpressionValue(group.toLowerCase(US), "toLowerCase(...)");
                String group2 = matcher.group(2);
                Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
                Intrinsics.checkNotNullExpressionValue(US, "US");
                Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "toLowerCase(...)");
                ArrayList arrayList = new ArrayList();
                Matcher matcher2 = cu0.f77769c.matcher(str);
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
                                        Intrinsics.checkNotNullExpressionValue(group4, "substring(...)");
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
                        String substring = str.substring(end);
                        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                        throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + substring + "\" for: \"" + str + "\"").toString());
                    }
                }
                return new cu0(str, (String[]) arrayList.toArray(new String[0]));
            }
            throw new IllegalArgumentException(("No subtype found for: \"" + str + "\"").toString());
        }
    }

    private cu0(String str) {
        this.f77771a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if ((obj instanceof cu0) && Intrinsics.m17075f(((cu0) obj).f77771a, this.f77771a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f77771a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f77771a;
    }

    public /* synthetic */ cu0(String str, String[] strArr) {
        this(str);
    }
}
