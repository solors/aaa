package com.mobilefuse.sdk.p542ad.rendering.splashad;

import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MobileFuseSplashAdActivity.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addCloseButton$$inlined$gracefullyHandleException$lambda$1 */
/* loaded from: classes7.dex */
public final class C23421x634d1c2d extends Lambda implements Functions<Unit> {
    final /* synthetic */ RelativeLayout $container$inlined;
    final /* synthetic */ boolean $isTransparent$inlined;
    final /* synthetic */ MobileFuseSplashAdActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23421x634d1c2d(MobileFuseSplashAdActivity mobileFuseSplashAdActivity, boolean z, RelativeLayout relativeLayout) {
        super(0);
        this.this$0 = mobileFuseSplashAdActivity;
        this.$isTransparent$inlined = z;
        this.$container$inlined = relativeLayout;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.requestToClose();
    }
}
