package com.unity3d.services.core.network.core;

import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.model.HttpRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: OkHttp3Client.kt */
@DebugMetadata(m17095c = "com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3", m17094f = "OkHttp3Client.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* renamed from: com.unity3d.services.core.network.core.OkHttp3Client$makeRequest$2$1$onResponse$downloadProgressLoggingJob$3 */
/* loaded from: classes7.dex */
final class C29044x945bbe94 extends AbstractC37596l implements Function2<Integer, Continuation<? super Unit>, Object> {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29044x945bbe94(HttpRequest httpRequest, Continuation<? super C29044x945bbe94> continuation) {
        super(2, continuation);
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        C29044x945bbe94 c29044x945bbe94 = new C29044x945bbe94(this.$request, continuation);
        c29044x945bbe94.I$0 = ((Number) obj).intValue();
        return c29044x945bbe94;
    }

    @Nullable
    public final Object invoke(int i, @Nullable Continuation<? super Unit> continuation) {
        return ((C29044x945bbe94) create(Integer.valueOf(i), continuation)).invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.label == 0) {
            C38508r.m14539b(obj);
            int i = this.I$0;
            DeviceLog.debug("Downloaded " + i + "% of " + this.$request.getBaseURL());
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(Integer num, Continuation<? super Unit> continuation) {
        return invoke(num.intValue(), continuation);
    }
}
