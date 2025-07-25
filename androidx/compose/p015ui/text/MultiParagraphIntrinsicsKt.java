package androidx.compose.p015ui.text;

import androidx.compose.p015ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: MultiParagraphIntrinsics.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.MultiParagraphIntrinsicsKt */
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnnotatedString.Range<Placeholder> range = list.get(i3);
            AnnotatedString.Range<Placeholder> range2 = range;
            if (AnnotatedStringKt.intersect(i, i2, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i4);
            if (i <= range3.getStart() && range3.getEnd() <= i2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(new AnnotatedString.Range(range3.getItem(), range3.getStart() - i, range3.getEnd() - i));
            } else {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
            }
        }
        return arrayList2;
    }
}
