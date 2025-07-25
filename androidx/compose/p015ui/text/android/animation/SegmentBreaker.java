package androidx.compose.p015ui.text.android.animation;

import android.text.Layout;
import androidx.compose.p015ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.p015ui.text.android.InternalPlatformTextApi;
import androidx.compose.p015ui.text.android.LayoutCompatKt;
import androidx.compose.p015ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C37563v;
import kotlin.collections.CollectionsJVM;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: SegmentBreaker.kt */
@InternalPlatformTextApi
@Metadata
/* renamed from: androidx.compose.ui.text.android.animation.SegmentBreaker */
/* loaded from: classes.dex */
public final class SegmentBreaker {
    @NotNull
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* compiled from: SegmentBreaker.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.animation.SegmentBreaker$WhenMappings */
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            iArr[SegmentType.Document.ordinal()] = 1;
            iArr[SegmentType.Paragraph.ordinal()] = 2;
            iArr[SegmentType.Line.ordinal()] = 3;
            iArr[SegmentType.Word.ordinal()] = 4;
            iArr[SegmentType.Character.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> m17553Z0;
        CharSequence text = layoutHelper.getLayout().getText();
        Intrinsics.checkNotNullExpressionValue(text, "text");
        BreakIterator lineInstance = BreakIterator.getLineInstance(Locale.getDefault());
        Intrinsics.checkNotNullExpressionValue(lineInstance, "getLineInstance(Locale.getDefault())");
        List<Integer> breakWithBreakIterator = breakWithBreakIterator(text, lineInstance);
        TreeSet treeSet = new TreeSet();
        int size = breakWithBreakIterator.size();
        for (int i = 0; i < size; i++) {
            treeSet.add(Integer.valueOf(breakWithBreakIterator.get(i).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i2 = 0; i2 < paragraphCount; i2++) {
            Bidi analyzeBidi = layoutHelper.analyzeBidi(i2);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i2);
                int runCount = analyzeBidi.getRunCount();
                for (int i3 = 0; i3 < runCount; i3++) {
                    treeSet.add(Integer.valueOf(analyzeBidi.getRunStart(i3) + paragraphStart));
                }
            }
        }
        m17553Z0 = _Collections.m17553Z0(treeSet);
        return m17553Z0;
    }

    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean z) {
        int m17164o;
        boolean z2;
        boolean z3;
        int i;
        ArrayList arrayList = new ArrayList();
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (breakOffsets.size() != 0) {
            boolean z4 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z5 = false;
                Integer num = breakOffsets.get(0);
                m17164o = C37563v.m17164o(breakOffsets);
                int i2 = 0;
                while (i2 < m17164o) {
                    i2++;
                    Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (z && intValue == intValue2 + 1 && layoutHelper.isLineEndSpace(layout.getText().charAt(intValue2))) {
                        i = m17164o;
                    } else {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z5);
                        if (layout.getParagraphDirection(lineForOffset) == -1) {
                            z2 = z4;
                        } else {
                            z2 = z5;
                        }
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z2) {
                            z4 = z5;
                        }
                        int ceil = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z4, z5));
                        if (isRtlCharAt == z2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        i = m17164o;
                        int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z3, true));
                        arrayList.add(new Segment(intValue2, intValue, Math.min(ceil, ceil2), layout.getLineTop(lineForOffset), Math.max(ceil, ceil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(Unit.f99208a);
                    num = num2;
                    m17164o = i;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        C37563v.m17166m();
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        List<Segment> m17175e;
        m17175e = CollectionsJVM.m17175e(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
        return m17175e;
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean z) {
        int i;
        int width;
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i2 = 0; i2 < lineCount; i2++) {
            int lineStart = layout.getLineStart(i2);
            int lineEnd = layout.getLineEnd(i2);
            if (z) {
                i = (int) Math.ceil(layout.getLineLeft(i2));
            } else {
                i = 0;
            }
            int lineTop = layout.getLineTop(i2);
            if (z) {
                width = (int) Math.ceil(layout.getLineRight(i2));
            } else {
                width = layout.getWidth();
            }
            arrayList.add(new Segment(lineStart, lineEnd, i, lineTop, width, layout.getLineBottom(i2)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i = 0; i < paragraphCount; i++) {
            int paragraphStart = layoutHelper.getParagraphStart(i);
            int paragraphEnd = layoutHelper.getParagraphEnd(i);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean z) {
        List<Segment> m17166m;
        int m17164o;
        boolean z2;
        boolean z3;
        int i;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z4 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z5 = false;
                Integer num = breakOffsets.get(0);
                m17164o = C37563v.m17164o(breakOffsets);
                int i2 = 0;
                while (i2 < m17164o) {
                    i2++;
                    Integer num2 = breakOffsets.get(i2);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z5);
                    if (layout.getParagraphDirection(lineForOffset) == -1) {
                        z2 = z4;
                    } else {
                        z2 = z5;
                    }
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z2) {
                        z4 = z5;
                    }
                    int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z4, z5));
                    if (isRtlCharAt == z2) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    int i3 = m17164o;
                    int ceil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z3, true));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (z && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i = lineForOffset;
                        if (layout.getLineEnd(i) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i = lineForOffset;
                    }
                    arrayList.add(new Segment(intValue2, intValue, min, layout.getLineTop(i), max, layout.getLineBottom(i)));
                    num = num2;
                    m17164o = i3;
                    z4 = true;
                    z5 = false;
                }
                return arrayList;
            }
        }
        m17166m = C37563v.m17166m();
        return m17166m;
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        List<Integer> m17160s;
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        m17160s = C37563v.m17160s(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            m17160s.add(Integer.valueOf(breakIterator.current()));
        }
        return m17160s;
    }

    @NotNull
    public final List<Integer> breakOffsets(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType) {
        List<Integer> m17163p;
        List<Integer> m17160s;
        List<Integer> m17160s2;
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        int i2 = 0;
        if (i == 1) {
            m17163p = C37563v.m17163p(0, Integer.valueOf(text.length()));
            return m17163p;
        } else if (i == 2) {
            m17160s = C37563v.m17160s(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i2 < paragraphCount) {
                m17160s.add(Integer.valueOf(layoutHelper.getParagraphEnd(i2)));
                i2++;
            }
            return m17160s;
        } else if (i == 3) {
            m17160s2 = C37563v.m17160s(0);
            int lineCount = layout.getLineCount();
            while (i2 < lineCount) {
                m17160s2.add(Integer.valueOf(layout.getLineEnd(i2)));
                i2++;
            }
            return m17160s2;
        } else if (i != 4) {
            if (i == 5) {
                Intrinsics.checkNotNullExpressionValue(text, "text");
                BreakIterator characterInstance = BreakIterator.getCharacterInstance(Locale.getDefault());
                Intrinsics.checkNotNullExpressionValue(characterInstance, "getCharacterInstance(Locale.getDefault())");
                return breakWithBreakIterator(text, characterInstance);
            }
            throw new NoWhenBranchMatchedException();
        } else {
            return breakInWords(layoutHelper);
        }
    }

    @NotNull
    public final List<Segment> breakSegments(@NotNull LayoutHelper layoutHelper, @NotNull SegmentType segmentType, boolean z) {
        Intrinsics.checkNotNullParameter(layoutHelper, "layoutHelper");
        Intrinsics.checkNotNullParameter(segmentType, "segmentType");
        int i = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return breakSegmentWithChar(layoutHelper, z);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return breakSegmentWithWord(layoutHelper, z);
                }
                return breakSegmentWithLine(layoutHelper, z);
            }
            return breakSegmentWithParagraph(layoutHelper);
        }
        return breakSegmentWithDocument(layoutHelper);
    }
}
