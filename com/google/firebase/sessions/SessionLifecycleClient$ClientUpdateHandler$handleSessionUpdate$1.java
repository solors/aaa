package com.google.firebase.sessions;

import android.util.Log;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import sd.C42688d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionLifecycleClient.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1", m17094f = "SessionLifecycleClient.kt", m17093l = {74}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes4.dex */
public final class SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: l */
    int f43787l;

    /* renamed from: m */
    final /* synthetic */ String f43788m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(String str, Continuation<? super SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1> continuation) {
        super(2, continuation);
        this.f43788m = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1(this.f43788m, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.f43787l;
        if (i != 0) {
            if (i == 1) {
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
            this.f43787l = 1;
            obj = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
            if (obj == m6959e) {
                return m6959e;
            }
        }
        String str = this.f43788m;
        for (SessionSubscriber sessionSubscriber : ((Map) obj).values()) {
            sessionSubscriber.onSessionChanged(new SessionSubscriber.SessionDetails(str));
            Log.d(SessionLifecycleClient.TAG, "Notified " + sessionSubscriber.getSessionSubscriberName() + " of new session " + str);
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((SessionLifecycleClient$ClientUpdateHandler$handleSessionUpdate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
