package com.amazon.aps.ads.util.adview;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ApsAdViewBase.kt */
@Metadata
/* loaded from: classes2.dex */
public /* synthetic */ class ApsAdViewBase$verifyIsVisible$1 extends FunctionReferenceImpl implements Function2<Boolean, Boolean, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ApsAdViewBase$verifyIsVisible$1(Object obj) {
        super(2, obj, ApsAdViewBase.class, "notifyViewabilityAndSetIsVisible", "notifyViewabilityAndSetIsVisible(ZZ)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Boolean bool, Boolean bool2) {
        invoke(bool.booleanValue(), bool2.booleanValue());
        return Unit.f99208a;
    }

    public final void invoke(boolean z, boolean z2) {
        ((ApsAdViewBase) this.receiver).notifyViewabilityAndSetIsVisible(z, z2);
    }
}
