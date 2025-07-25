package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.StringHelpers;
import androidx.compose.p015ui.text.TextRange;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: SelectionAdjustment.kt */
@Metadata
/* loaded from: classes.dex */
/* synthetic */ class SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1 extends FunctionReferenceImpl implements Function1<Integer, TextRange> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public SelectionAdjustment$Companion$Paragraph$1$adjust$boundaryFun$1(Object obj) {
        super(1, obj, StringHelpers.class, "getParagraphBoundary", "getParagraphBoundary(Ljava/lang/CharSequence;I)J", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ TextRange invoke(Integer num) {
        return TextRange.m109370boximpl(m106695invokejx7JFs(num.intValue()));
    }

    /* renamed from: invoke--jx7JFs  reason: not valid java name */
    public final long m106695invokejx7JFs(int i) {
        return StringHelpers.getParagraphBoundary((CharSequence) this.receiver, i);
    }
}
