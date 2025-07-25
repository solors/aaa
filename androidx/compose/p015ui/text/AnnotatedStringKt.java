package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.AnnotatedString;
import androidx.compose.p015ui.text.intl.LocaleList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotatedString.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.AnnotatedStringKt */
/* loaded from: classes.dex */
public final class AnnotatedStringKt {
    @NotNull
    private static final AnnotatedString EmptyAnnotatedString = new AnnotatedString("", null, null, 6, null);

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull SpanStyle spanStyle, @Nullable ParagraphStyle paragraphStyle) {
        List m17175e;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyle, "spanStyle");
        m17175e = CollectionsJVM.m17175e(new AnnotatedString.Range(spanStyle, 0, text.length()));
        return new AnnotatedString(text, m17175e, paragraphStyle == null ? C37563v.m17166m() : CollectionsJVM.m17175e(new AnnotatedString.Range(paragraphStyle, 0, text.length())));
    }

    public static /* synthetic */ AnnotatedString AnnotatedString$default(String str, SpanStyle spanStyle, ParagraphStyle paragraphStyle, int i, Object obj) {
        if ((i & 4) != 0) {
            paragraphStyle = null;
        }
        return AnnotatedString(str, spanStyle, paragraphStyle);
    }

    @NotNull
    public static final AnnotatedString buildAnnotatedString(@NotNull Function1<? super AnnotatedString.Builder, Unit> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
        builder.invoke(builder2);
        return builder2.toAnnotatedString();
    }

    @NotNull
    public static final AnnotatedString capitalize(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$capitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString capitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return capitalize(annotatedString, localeList);
    }

    public static final boolean contains(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        if (i > i3 || i4 > i2) {
            return false;
        }
        if (i2 == i4) {
            if (i3 == i4) {
                z = true;
            } else {
                z = false;
            }
            if (i == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public static final AnnotatedString decapitalize(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$decapitalize$1(localeList));
    }

    public static /* synthetic */ AnnotatedString decapitalize$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return decapitalize(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString emptyAnnotatedString() {
        return EmptyAnnotatedString;
    }

    public static final <T> List<AnnotatedString.Range<T>> filterRanges(List<? extends AnnotatedString.Range<? extends T>> list, int i, int i2) {
        boolean z;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<? extends T> range = list.get(i3);
                AnnotatedString.Range<? extends T> range2 = range;
                if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), Math.max(i, range3.getStart()) - i, Math.min(i2, range3.getEnd()) - i, range3.getTag()));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less than or equal to end (" + i2 + ')').toString());
    }

    private static final List<AnnotatedString.Range<SpanStyle>> getLocalStyles(AnnotatedString annotatedString, int i, int i2) {
        int m16908n;
        int m16908n2;
        List<AnnotatedString.Range<SpanStyle>> m17166m;
        if (i == i2) {
            m17166m = C37563v.m17166m();
            return m17166m;
        } else if (i == 0 && i2 >= annotatedString.getText().length()) {
            return annotatedString.getSpanStyles();
        } else {
            List<AnnotatedString.Range<SpanStyle>> spanStyles = annotatedString.getSpanStyles();
            ArrayList arrayList = new ArrayList(spanStyles.size());
            int size = spanStyles.size();
            for (int i3 = 0; i3 < size; i3++) {
                AnnotatedString.Range<SpanStyle> range = spanStyles.get(i3);
                AnnotatedString.Range<SpanStyle> range2 = range;
                if (intersect(i, i2, range2.getStart(), range2.getEnd())) {
                    arrayList.add(range);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
                Object item = range3.getItem();
                m16908n = _Ranges.m16908n(range3.getStart(), i, i2);
                m16908n2 = _Ranges.m16908n(range3.getEnd(), i, i2);
                arrayList2.add(new AnnotatedString.Range(item, m16908n - i, m16908n2 - i));
            }
            return arrayList2;
        }
    }

    public static final boolean intersect(int i, int i2, int i3, int i4) {
        if (Math.max(i, i3) >= Math.min(i2, i4) && !contains(i, i2, i3, i4) && !contains(i3, i4, i, i2)) {
            return false;
        }
        return true;
    }

    @NotNull
    public static final <T> List<T> mapEachParagraphStyle(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle, @NotNull Function2<? super AnnotatedString, ? super AnnotatedString.Range<ParagraphStyle>, ? extends T> block) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        Intrinsics.checkNotNullParameter(block, "block");
        List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles = normalizedParagraphStyles(annotatedString, defaultParagraphStyle);
        ArrayList arrayList = new ArrayList(normalizedParagraphStyles.size());
        int size = normalizedParagraphStyles.size();
        for (int i = 0; i < size; i++) {
            AnnotatedString.Range<ParagraphStyle> range = normalizedParagraphStyles.get(i);
            arrayList.add(block.mo105910invoke(substringWithoutParagraphStyles(annotatedString, range.getStart(), range.getEnd()), range));
        }
        return arrayList;
    }

    @NotNull
    public static final List<AnnotatedString.Range<ParagraphStyle>> normalizedParagraphStyles(@NotNull AnnotatedString annotatedString, @NotNull ParagraphStyle defaultParagraphStyle) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.getText().length();
        List<AnnotatedString.Range<ParagraphStyle>> paragraphStyles = annotatedString.getParagraphStyles();
        ArrayList arrayList = new ArrayList();
        int size = paragraphStyles.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            AnnotatedString.Range<ParagraphStyle> range = paragraphStyles.get(i);
            ParagraphStyle component1 = range.component1();
            int component2 = range.component2();
            int component3 = range.component3();
            if (component2 != i2) {
                arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i2, component2));
            }
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle.merge(component1), component2, component3));
            i++;
            i2 = component3;
        }
        if (i2 != length) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, i2, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new AnnotatedString.Range(defaultParagraphStyle, 0, 0));
        }
        return arrayList;
    }

    public static final AnnotatedString substringWithoutParagraphStyles(AnnotatedString annotatedString, int i, int i2) {
        String str;
        if (i != i2) {
            str = annotatedString.getText().substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(str, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            str = "";
        }
        return new AnnotatedString(str, getLocalStyles(annotatedString, i, i2), null, 4, null);
    }

    @NotNull
    public static final AnnotatedString toLowerCase(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toLowerCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toLowerCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toLowerCase(annotatedString, localeList);
    }

    @NotNull
    public static final AnnotatedString toUpperCase(@NotNull AnnotatedString annotatedString, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(annotatedString, "<this>");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        return JvmAnnotatedString_jvmKt.transform(annotatedString, new AnnotatedStringKt$toUpperCase$1(localeList));
    }

    public static /* synthetic */ AnnotatedString toUpperCase$default(AnnotatedString annotatedString, LocaleList localeList, int i, Object obj) {
        if ((i & 1) != 0) {
            localeList = LocaleList.Companion.getCurrent();
        }
        return toUpperCase(annotatedString, localeList);
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull String tag, @NotNull String annotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushStringAnnotation = builder.pushStringAnnotation(tag, annotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.m17017b(1);
            builder.pop(pushStringAnnotation);
            InlineMarker.m17018a(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull SpanStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushStyle = builder.pushStyle(style);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.m17017b(1);
            builder.pop(pushStyle);
            InlineMarker.m17018a(1);
        }
    }

    @NotNull
    public static final AnnotatedString AnnotatedString(@NotNull String text, @NotNull ParagraphStyle paragraphStyle) {
        List m17166m;
        List m17175e;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paragraphStyle, "paragraphStyle");
        m17166m = C37563v.m17166m();
        m17175e = CollectionsJVM.m17175e(new AnnotatedString.Range(paragraphStyle, 0, text.length()));
        return new AnnotatedString(text, m17166m, m17175e);
    }

    @ExperimentalTextApi
    @NotNull
    public static final <R> R withAnnotation(@NotNull AnnotatedString.Builder builder, @NotNull TtsAnnotation ttsAnnotation, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushTtsAnnotation = builder.pushTtsAnnotation(ttsAnnotation);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.m17017b(1);
            builder.pop(pushTtsAnnotation);
            InlineMarker.m17018a(1);
        }
    }

    @NotNull
    public static final <R> R withStyle(@NotNull AnnotatedString.Builder builder, @NotNull ParagraphStyle style, @NotNull Function1<? super AnnotatedString.Builder, ? extends R> block) {
        Intrinsics.checkNotNullParameter(builder, "<this>");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(block, "block");
        int pushStyle = builder.pushStyle(style);
        try {
            return block.invoke(builder);
        } finally {
            InlineMarker.m17017b(1);
            builder.pop(pushStyle);
            InlineMarker.m17018a(1);
        }
    }
}
