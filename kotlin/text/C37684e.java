package kotlin.text;

import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;

/* compiled from: Regex.kt */
@Metadata
/* renamed from: kotlin.text.e */
/* loaded from: classes7.dex */
public final class C37684e {
    /* renamed from: e */
    public static final MatchResult m16734e(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new C37680d(matcher, charSequence);
    }

    /* renamed from: f */
    public static final MatchResult m16733f(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new C37680d(matcher, charSequence);
    }

    /* renamed from: g */
    public static final PrimitiveRanges m16732g(java.util.regex.MatchResult matchResult) {
        PrimitiveRanges m16900v;
        m16900v = _Ranges.m16900v(matchResult.start(), matchResult.end());
        return m16900v;
    }

    /* renamed from: h */
    public static final PrimitiveRanges m16731h(java.util.regex.MatchResult matchResult, int i) {
        PrimitiveRanges m16900v;
        m16900v = _Ranges.m16900v(matchResult.start(i), matchResult.end(i));
        return m16900v;
    }
}
