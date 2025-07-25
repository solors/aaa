package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.text.AnnotatedString;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* compiled from: SemanticsProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsProperties$Text$1 */
/* loaded from: classes.dex */
final class SemanticsProperties$Text$1 extends Lambda implements Function2<List<? extends AnnotatedString>, List<? extends AnnotatedString>, List<? extends AnnotatedString>> {
    public static final SemanticsProperties$Text$1 INSTANCE = new SemanticsProperties$Text$1();

    SemanticsProperties$Text$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ List<? extends AnnotatedString> mo105910invoke(List<? extends AnnotatedString> list, List<? extends AnnotatedString> list2) {
        return invoke2((List<AnnotatedString>) list, (List<AnnotatedString>) list2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r2 = kotlin.collections._Collections.m17550c1(r2);
     */
    @org.jetbrains.annotations.Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<androidx.compose.p015ui.text.AnnotatedString> invoke2(@org.jetbrains.annotations.Nullable java.util.List<androidx.compose.p015ui.text.AnnotatedString> r2, @org.jetbrains.annotations.NotNull java.util.List<androidx.compose.p015ui.text.AnnotatedString> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "childValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 == 0) goto L15
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r2 = kotlin.collections.C37561t.m17221c1(r2)
            if (r2 == 0) goto L15
            java.util.Collection r3 = (java.util.Collection) r3
            r2.addAll(r3)
            r3 = r2
        L15:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.semantics.SemanticsProperties$Text$1.invoke2(java.util.List, java.util.List):java.util.List");
    }
}
