package com.google.firebase.sessions.settings;

import android.util.Log;
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

/* compiled from: RemoteSettings.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", m17094f = "RemoteSettings.kt", m17093l = {}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes4.dex */
final class RemoteSettings$updateSettings$2$2 extends AbstractC37596l implements Function2<String, Continuation<? super Unit>, Object> {

    /* renamed from: l */
    int f43840l;

    /* renamed from: m */
    /* synthetic */ Object f43841m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RemoteSettings$updateSettings$2$2(Continuation<? super RemoteSettings$updateSettings$2$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(continuation);
        remoteSettings$updateSettings$2$2.f43841m = obj;
        return remoteSettings$updateSettings$2$2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        C42688d.m6959e();
        if (this.f43840l == 0) {
            C38508r.m14539b(obj);
            Log.e(RemoteSettings.TAG, "Error failing to fetch the remote configs: " + ((String) this.f43841m));
            return Unit.f99208a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull String str, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettings$updateSettings$2$2) create(str, continuation)).invokeSuspend(Unit.f99208a);
    }
}
