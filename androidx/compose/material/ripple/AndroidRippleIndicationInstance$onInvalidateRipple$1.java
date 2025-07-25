package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Ripple.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class AndroidRippleIndicationInstance$onInvalidateRipple$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ AndroidRippleIndicationInstance this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidRippleIndicationInstance$onInvalidateRipple$1(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        super(0);
        this.this$0 = androidRippleIndicationInstance;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean invalidateTick;
        AndroidRippleIndicationInstance androidRippleIndicationInstance = this.this$0;
        invalidateTick = androidRippleIndicationInstance.getInvalidateTick();
        androidRippleIndicationInstance.setInvalidateTick(!invalidateTick);
    }
}
