package com.unity3d.services.core.network.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.chromium.net.UrlRequest;
import org.jetbrains.annotations.Nullable;

/* compiled from: CronetClient.kt */
@Metadata
/* loaded from: classes7.dex */
final class CronetClient$execute$2$2 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ UrlRequest $req;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CronetClient$execute$2$2(UrlRequest urlRequest) {
        super(1);
        this.$req = urlRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        this.$req.cancel();
    }
}
