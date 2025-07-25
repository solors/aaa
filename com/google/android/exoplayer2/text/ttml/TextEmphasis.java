package com.google.android.exoplayer2.text.ttml;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.collect.ImmutableSet;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class TextEmphasis {
    public static final int MARK_SHAPE_AUTO = -1;
    public static final int POSITION_OUTSIDE = -2;

    /* renamed from: a */
    private static final Pattern f34925a = Pattern.compile("\\s+");

    /* renamed from: b */
    private static final ImmutableSet<String> f34926b = ImmutableSet.m69329of("auto", "none");

    /* renamed from: c */
    private static final ImmutableSet<String> f34927c = ImmutableSet.m69328of("dot", "sesame", "circle");

    /* renamed from: d */
    private static final ImmutableSet<String> f34928d = ImmutableSet.m69329of("filled", "open");

    /* renamed from: e */
    private static final ImmutableSet<String> f34929e = ImmutableSet.m69328of("after", "before", "outside");
    public final int markFill;
    public final int markShape;
    public final int position;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Position {
    }

    private TextEmphasis(int i, int i2, int i3) {
        this.markShape = i;
        this.markFill = i2;
        this.position = i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
        if (r9.equals("auto") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fe, code lost:
        if (r9.equals("dot") == false) goto L59;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.text.ttml.TextEmphasis m73434a(com.google.common.collect.ImmutableSet<java.lang.String> r9) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.text.ttml.TextEmphasis.m73434a(com.google.common.collect.ImmutableSet):com.google.android.exoplayer2.text.ttml.TextEmphasis");
    }

    @Nullable
    public static TextEmphasis parse(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = Ascii.toLowerCase(str.trim());
        if (lowerCase.isEmpty()) {
            return null;
        }
        return m73434a(ImmutableSet.copyOf(TextUtils.split(lowerCase, f34925a)));
    }
}
