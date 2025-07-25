package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$onImeActionPerformed$1 */
/* loaded from: classes.dex */
final class TextInputServiceAndroid$onImeActionPerformed$1 extends Lambda implements Function1<ImeAction, Unit> {
    public static final TextInputServiceAndroid$onImeActionPerformed$1 INSTANCE = new TextInputServiceAndroid$onImeActionPerformed$1();

    TextInputServiceAndroid$onImeActionPerformed$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
        m109560invokeKlQnJC8(imeAction.m109511unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m109560invokeKlQnJC8(int i) {
    }
}
