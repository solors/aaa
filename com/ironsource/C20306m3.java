package com.ironsource;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

@Metadata
/* renamed from: com.ironsource.m3 */
/* loaded from: classes6.dex */
public final class C20306m3 {

    @Metadata
    /* renamed from: com.ironsource.m3$a */
    /* loaded from: classes6.dex */
    public static final class C20307a implements OutcomeReceiver<Object, Exception> {

        /* renamed from: a */
        final /* synthetic */ Continuation<Unit> f51091a;

        /* JADX WARN: Multi-variable type inference failed */
        C20307a(Continuation<? super Unit> continuation) {
            this.f51091a = continuation;
        }

        @Override // android.os.OutcomeReceiver
        /* renamed from: a */
        public void onError(@NotNull Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Continuation<Unit> continuation = this.f51091a;
            Result.C38506a c38506a = Result.f101870c;
            continuation.resumeWith(Result.m14549b(C38508r.m14540a(error)));
        }

        @Override // android.os.OutcomeReceiver
        public void onResult(@Nullable Object obj) {
            Continuation<Unit> continuation = this.f51091a;
            Result.C38506a c38506a = Result.f101870c;
            continuation.resumeWith(Result.m14549b(Unit.f99208a));
        }
    }

    @RequiresApi(31)
    @NotNull
    /* renamed from: a */
    public static final OutcomeReceiver<Object, Exception> m57331a(@NotNull Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new C20307a(continuation);
    }
}
