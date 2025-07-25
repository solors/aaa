package com.mobilefuse.sdk.p542ad.rendering.splashad;

import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MobileFuseSplashAdActivity.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.ad.rendering.splashad.MobileFuseSplashAdActivity$addCloseButton$$inlined$gracefullyHandleException$lambda$2 */
/* loaded from: classes7.dex */
public final class C23422x634d1c2e extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ RelativeLayout $container$inlined;
    final /* synthetic */ boolean $isTransparent$inlined;
    final /* synthetic */ MobileFuseSplashAdActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23422x634d1c2e(MobileFuseSplashAdActivity mobileFuseSplashAdActivity, boolean z, RelativeLayout relativeLayout) {
        super(1);
        this.this$0 = mobileFuseSplashAdActivity;
        this.$isTransparent$inlined = z;
        this.$container$inlined = relativeLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f99208a;
    }

    public final void invoke(boolean z) {
        this.this$0.updateCloseBtnAsOmidFriendlyObstruction();
    }
}
