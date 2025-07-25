package androidx.compose.p015ui.text.input;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: TextInputServiceAndroid.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.input.TextInputServiceAndroid$stopInput$2 */
/* loaded from: classes.dex */
final class TextInputServiceAndroid$stopInput$2 extends Lambda implements Function1<ImeAction, Unit> {
    public static final TextInputServiceAndroid$stopInput$2 INSTANCE = new TextInputServiceAndroid$stopInput$2();

    TextInputServiceAndroid$stopInput$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ImeAction imeAction) {
        m109561invokeKlQnJC8(imeAction.m109511unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-KlQnJC8  reason: not valid java name */
    public final void m109561invokeKlQnJC8(int i) {
    }
}
