package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AndroidTextToolbar.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.AndroidTextToolbar$textActionModeCallback$1 */
/* loaded from: classes.dex */
public final class AndroidTextToolbar$textActionModeCallback$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ AndroidTextToolbar this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidTextToolbar$textActionModeCallback$1(AndroidTextToolbar androidTextToolbar) {
        super(0);
        this.this$0 = androidTextToolbar;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.actionMode = null;
    }
}
