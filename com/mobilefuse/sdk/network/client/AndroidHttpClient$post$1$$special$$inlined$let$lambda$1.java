package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.network.client.HttpError;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: HttpClient.kt */
@Metadata
/* loaded from: classes7.dex */
final class AndroidHttpClient$post$1$$special$$inlined$let$lambda$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ AndroidHttpClient$post$1 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidHttpClient$post$1$$special$$inlined$let$lambda$1(AndroidHttpClient$post$1 androidHttpClient$post$1) {
        super(0);
        this.this$0 = androidHttpClient$post$1;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.$completeBlock.invoke(new ErrorResult(new HttpError.UnknownError("Error with request body: content was null")));
    }
}
