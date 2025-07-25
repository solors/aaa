package androidx.compose.p015ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AnnotatedString.kt */
@Immutable
@Metadata
/* renamed from: androidx.compose.ui.text.AnnotatedString */
/* loaded from: classes.dex */
public final class AnnotatedString implements CharSequence {
    @NotNull
    private final List<Range<? extends Object>> annotations;
    @NotNull
    private final List<Range<ParagraphStyle>> paragraphStyles;
    @NotNull
    private final List<Range<SpanStyle>> spanStyles;
    @NotNull
    private final String text;

    /* compiled from: AnnotatedString.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.AnnotatedString$Builder */
    /* loaded from: classes.dex */
    public static final class Builder {
        @NotNull
        private final List<MutableRange<? extends Object>> annotations;
        @NotNull
        private final List<MutableRange<ParagraphStyle>> paragraphStyles;
        @NotNull
        private final List<MutableRange<SpanStyle>> spanStyles;
        @NotNull
        private final List<MutableRange<? extends Object>> styleStack;
        @NotNull
        private final StringBuilder text;

        public Builder() {
            this(0, 1, null);
        }

        public final void addStringAnnotation(@NotNull String tag, @NotNull String annotation, int i, int i2) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.annotations.add(new MutableRange<>(annotation, i, i2, tag));
        }

        public final void addStyle(@NotNull SpanStyle style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.spanStyles.add(new MutableRange<>(style, i, i2, null, 8, null));
        }

        @ExperimentalTextApi
        public final void addTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation, int i, int i2) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            this.annotations.add(new MutableRange<>(ttsAnnotation, i, i2, null, 8, null));
        }

        public final void append(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text.append(text);
        }

        public final int getLength() {
            return this.text.length();
        }

        public final void pop() {
            if (!this.styleStack.isEmpty()) {
                List<MutableRange<? extends Object>> list = this.styleStack;
                list.remove(list.size() - 1).setEnd(this.text.length());
                return;
            }
            throw new IllegalStateException("Nothing to pop.".toString());
        }

        public final int pushStringAnnotation(@NotNull String tag, @NotNull String annotation) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            MutableRange<? extends Object> mutableRange = new MutableRange<>(annotation, this.text.length(), 0, tag, 4, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushStyle(@NotNull SpanStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            MutableRange<SpanStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.spanStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public final int pushTtsAnnotation(@NotNull TtsAnnotation ttsAnnotation) {
            Intrinsics.checkNotNullParameter(ttsAnnotation, "ttsAnnotation");
            MutableRange<? extends Object> mutableRange = new MutableRange<>(ttsAnnotation, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.annotations.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        @NotNull
        public final AnnotatedString toAnnotatedString() {
            String sb2 = this.text.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "text.toString()");
            List<MutableRange<SpanStyle>> list = this.spanStyles;
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(list.get(i).toRange(this.text.length()));
            }
            List<MutableRange<ParagraphStyle>> list2 = this.paragraphStyles;
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                arrayList2.add(list2.get(i2).toRange(this.text.length()));
            }
            List<MutableRange<? extends Object>> list3 = this.annotations;
            ArrayList arrayList3 = new ArrayList(list3.size());
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList3.add(list3.get(i3).toRange(this.text.length()));
            }
            return new AnnotatedString(sb2, arrayList, arrayList2, arrayList3);
        }

        public Builder(int i) {
            this.text = new StringBuilder(i);
            this.spanStyles = new ArrayList();
            this.paragraphStyles = new ArrayList();
            this.annotations = new ArrayList();
            this.styleStack = new ArrayList();
        }

        public final void addStyle(@NotNull ParagraphStyle style, int i, int i2) {
            Intrinsics.checkNotNullParameter(style, "style");
            this.paragraphStyles.add(new MutableRange<>(style, i, i2, null, 8, null));
        }

        public final void append(char c) {
            this.text.append(c);
        }

        public final void append(@NotNull AnnotatedString text) {
            Intrinsics.checkNotNullParameter(text, "text");
            int length = this.text.length();
            this.text.append(text.getText());
            List<Range<SpanStyle>> spanStyles = text.getSpanStyles();
            int size = spanStyles.size();
            for (int i = 0; i < size; i++) {
                Range<SpanStyle> range = spanStyles.get(i);
                addStyle(range.getItem(), range.getStart() + length, range.getEnd() + length);
            }
            List<Range<ParagraphStyle>> paragraphStyles = text.getParagraphStyles();
            int size2 = paragraphStyles.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Range<ParagraphStyle> range2 = paragraphStyles.get(i2);
                addStyle(range2.getItem(), range2.getStart() + length, range2.getEnd() + length);
            }
            List<Range<? extends Object>> annotations$ui_text_release = text.getAnnotations$ui_text_release();
            int size3 = annotations$ui_text_release.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Range<? extends Object> range3 = annotations$ui_text_release.get(i3);
                this.annotations.add(new MutableRange<>(range3.getItem(), range3.getStart() + length, range3.getEnd() + length, range3.getTag()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: AnnotatedString.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.text.AnnotatedString$Builder$MutableRange */
        /* loaded from: classes.dex */
        public static final class MutableRange<T> {
            private int end;
            private final T item;
            private final int start;
            @NotNull
            private final String tag;

            public MutableRange(T t, int i, int i2, @NotNull String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                this.item = t;
                this.start = i;
                this.end = i2;
                this.tag = tag;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ MutableRange copy$default(MutableRange mutableRange, Object obj, int i, int i2, String str, int i3, Object obj2) {
                if ((i3 & 1) != 0) {
                    obj = mutableRange.item;
                }
                if ((i3 & 2) != 0) {
                    i = mutableRange.start;
                }
                if ((i3 & 4) != 0) {
                    i2 = mutableRange.end;
                }
                if ((i3 & 8) != 0) {
                    str = mutableRange.tag;
                }
                return mutableRange.copy(obj, i, i2, str);
            }

            public static /* synthetic */ Range toRange$default(MutableRange mutableRange, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    i = Integer.MIN_VALUE;
                }
                return mutableRange.toRange(i);
            }

            public final T component1() {
                return this.item;
            }

            public final int component2() {
                return this.start;
            }

            public final int component3() {
                return this.end;
            }

            @NotNull
            public final String component4() {
                return this.tag;
            }

            @NotNull
            public final MutableRange<T> copy(T t, int i, int i2, @NotNull String tag) {
                Intrinsics.checkNotNullParameter(tag, "tag");
                return new MutableRange<>(t, i, i2, tag);
            }

            public boolean equals(@Nullable Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof MutableRange)) {
                    return false;
                }
                MutableRange mutableRange = (MutableRange) obj;
                if (Intrinsics.m17075f(this.item, mutableRange.item) && this.start == mutableRange.start && this.end == mutableRange.end && Intrinsics.m17075f(this.tag, mutableRange.tag)) {
                    return true;
                }
                return false;
            }

            public final int getEnd() {
                return this.end;
            }

            public final T getItem() {
                return this.item;
            }

            public final int getStart() {
                return this.start;
            }

            @NotNull
            public final String getTag() {
                return this.tag;
            }

            public int hashCode() {
                int hashCode;
                T t = this.item;
                if (t == null) {
                    hashCode = 0;
                } else {
                    hashCode = t.hashCode();
                }
                return (((((hashCode * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
            }

            public final void setEnd(int i) {
                this.end = i;
            }

            @NotNull
            public final Range<T> toRange(int i) {
                boolean z;
                int i2 = this.end;
                if (i2 != Integer.MIN_VALUE) {
                    i = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return new Range<>(this.item, this.start, i, this.tag);
                }
                throw new IllegalStateException("Item.end should be set first".toString());
            }

            @NotNull
            public String toString() {
                return "MutableRange(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
            }

            public /* synthetic */ MutableRange(Object obj, int i, int i2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
            }
        }

        public final void pop(int i) {
            if (i < this.styleStack.size()) {
                while (this.styleStack.size() - 1 >= i) {
                    pop();
                }
                return;
            }
            throw new IllegalStateException((i + " should be less than " + this.styleStack.size()).toString());
        }

        public final int pushStyle(@NotNull ParagraphStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            MutableRange<ParagraphStyle> mutableRange = new MutableRange<>(style, this.text.length(), 0, null, 12, null);
            this.styleStack.add(mutableRange);
            this.paragraphStyles.add(mutableRange);
            return this.styleStack.size() - 1;
        }

        public /* synthetic */ Builder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 16 : i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull String text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(@NotNull AnnotatedString text) {
            this(0, 1, null);
            Intrinsics.checkNotNullParameter(text, "text");
            append(text);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnnotatedString(@NotNull String text, @NotNull List<Range<SpanStyle>> spanStyles, @NotNull List<Range<ParagraphStyle>> paragraphStyles, @NotNull List<? extends Range<? extends Object>> annotations) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(spanStyles, "spanStyles");
        Intrinsics.checkNotNullParameter(paragraphStyles, "paragraphStyles");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        this.text = text;
        this.spanStyles = spanStyles;
        this.paragraphStyles = paragraphStyles;
        this.annotations = annotations;
        int size = paragraphStyles.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            Range<ParagraphStyle> range = paragraphStyles.get(i2);
            if (range.getStart() >= i) {
                if (range.getEnd() <= this.text.length()) {
                    i = range.getEnd();
                } else {
                    throw new IllegalArgumentException(("ParagraphStyle range [" + range.getStart() + ", " + range.getEnd() + ") is out of boundary").toString());
                }
            } else {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            }
        }
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return get(i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnnotatedString)) {
            return false;
        }
        AnnotatedString annotatedString = (AnnotatedString) obj;
        if (Intrinsics.m17075f(this.text, annotatedString.text) && Intrinsics.m17075f(this.spanStyles, annotatedString.spanStyles) && Intrinsics.m17075f(this.paragraphStyles, annotatedString.paragraphStyles) && Intrinsics.m17075f(this.annotations, annotatedString.annotations)) {
            return true;
        }
        return false;
    }

    public char get(int i) {
        return this.text.charAt(i);
    }

    @NotNull
    public final List<Range<? extends Object>> getAnnotations$ui_text_release() {
        return this.annotations;
    }

    public int getLength() {
        return this.text.length();
    }

    @NotNull
    public final List<Range<ParagraphStyle>> getParagraphStyles() {
        return this.paragraphStyles;
    }

    @NotNull
    public final List<Range<SpanStyle>> getSpanStyles() {
        return this.spanStyles;
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(@NotNull String tag, int i, int i2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Object> range = list.get(i3);
            Range<? extends Object> range2 = range;
            if ((range2.getItem() instanceof String) && Intrinsics.m17075f(tag, range2.getTag()) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final List<Range<TtsAnnotation>> getTtsAnnotations(int i, int i2) {
        boolean z;
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Object> range = list.get(i3);
            Range<? extends Object> range2 = range;
            if ((range2.getItem() instanceof TtsAnnotation) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.spanStyles.hashCode()) * 31) + this.paragraphStyles.hashCode()) * 31) + this.annotations.hashCode();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return getLength();
    }

    @Stable
    @NotNull
    public final AnnotatedString plus(@NotNull AnnotatedString other) {
        Intrinsics.checkNotNullParameter(other, "other");
        Builder builder = new Builder(this);
        builder.append(other);
        return builder.toAnnotatedString();
    }

    @NotNull
    /* renamed from: subSequence-5zc-tL8  reason: not valid java name */
    public final AnnotatedString m109295subSequence5zctL8(long j) {
        return subSequence(TextRange.m109380getMinimpl(j), TextRange.m109379getMaximpl(j));
    }

    @Override // java.lang.CharSequence
    @NotNull
    public String toString() {
        return this.text;
    }

    @Override // java.lang.CharSequence
    @NotNull
    public AnnotatedString subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0 && i2 == this.text.length()) {
                return this;
            }
            String substring = this.text.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return new AnnotatedString(substring, AnnotatedStringKt.access$filterRanges(this.spanStyles, i, i2), AnnotatedStringKt.access$filterRanges(this.paragraphStyles, i, i2), AnnotatedStringKt.access$filterRanges(this.annotations, i, i2));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    /* compiled from: AnnotatedString.kt */
    @Metadata
    @Immutable
    /* renamed from: androidx.compose.ui.text.AnnotatedString$Range */
    /* loaded from: classes.dex */
    public static final class Range<T> {
        private final int end;
        private final T item;
        private final int start;
        @NotNull
        private final String tag;

        public Range(T t, int i, int i2, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            this.item = t;
            this.start = i;
            this.end = i2;
            this.tag = tag;
            if (!(i <= i2)) {
                throw new IllegalArgumentException("Reversed range is not supported".toString());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Range copy$default(Range range, Object obj, int i, int i2, String str, int i3, Object obj2) {
            if ((i3 & 1) != 0) {
                obj = range.item;
            }
            if ((i3 & 2) != 0) {
                i = range.start;
            }
            if ((i3 & 4) != 0) {
                i2 = range.end;
            }
            if ((i3 & 8) != 0) {
                str = range.tag;
            }
            return range.copy(obj, i, i2, str);
        }

        public final T component1() {
            return this.item;
        }

        public final int component2() {
            return this.start;
        }

        public final int component3() {
            return this.end;
        }

        @NotNull
        public final String component4() {
            return this.tag;
        }

        @NotNull
        public final Range<T> copy(T t, int i, int i2, @NotNull String tag) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            return new Range<>(t, i, i2, tag);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Range)) {
                return false;
            }
            Range range = (Range) obj;
            if (Intrinsics.m17075f(this.item, range.item) && this.start == range.start && this.end == range.end && Intrinsics.m17075f(this.tag, range.tag)) {
                return true;
            }
            return false;
        }

        public final int getEnd() {
            return this.end;
        }

        public final T getItem() {
            return this.item;
        }

        public final int getStart() {
            return this.start;
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public int hashCode() {
            int hashCode;
            T t = this.item;
            if (t == null) {
                hashCode = 0;
            } else {
                hashCode = t.hashCode();
            }
            return (((((hashCode * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + this.tag.hashCode();
        }

        @NotNull
        public String toString() {
            return "Range(item=" + this.item + ", start=" + this.start + ", end=" + this.end + ", tag=" + this.tag + ')';
        }

        public Range(T t, int i, int i2) {
            this(t, i, i2, "");
        }
    }

    @NotNull
    public final List<Range<String>> getStringAnnotations(int i, int i2) {
        List<Range<? extends Object>> list = this.annotations;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            Range<? extends Object> range = list.get(i3);
            Range<? extends Object> range2 = range;
            if ((range2.getItem() instanceof String) && AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        return arrayList;
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C37563v.m17166m() : list, (i & 4) != 0 ? C37563v.m17166m() : list2, (i & 8) != 0 ? C37563v.m17166m() : list3);
    }

    public /* synthetic */ AnnotatedString(String str, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C37563v.m17166m() : list, (i & 4) != 0 ? C37563v.m17166m() : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AnnotatedString(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.p015ui.text.AnnotatedString.Range<androidx.compose.p015ui.text.SpanStyle>> r3, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.p015ui.text.AnnotatedString.Range<androidx.compose.p015ui.text.ParagraphStyle>> r4) {
        /*
            r1 = this;
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "spanStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "paragraphStyles"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.util.List r0 = kotlin.collections.C37561t.m17202m()
            r1.<init>(r2, r3, r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.text.AnnotatedString.<init>(java.lang.String, java.util.List, java.util.List):void");
    }
}
