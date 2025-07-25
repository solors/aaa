package com.google.firebase.sessions;

import android.util.Log;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import ge.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: SessionDatastore.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", m17094f = "SessionDatastore.kt", m17093l = {76}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes4.dex */
final class SessionDatastoreImpl$firebaseSessionDataFlow$1 extends AbstractC37596l implements InterfaceC45268n<FlowCollector<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {

    /* renamed from: l */
    int f43732l;

    /* renamed from: m */
    private /* synthetic */ Object f43733m;

    /* renamed from: n */
    /* synthetic */ Object f43734n;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SessionDatastoreImpl$firebaseSessionDataFlow$1(Continuation<? super SessionDatastoreImpl$firebaseSessionDataFlow$1> continuation) {
        super(3, continuation);
    }

    @Override // p1076zd.InterfaceC45268n
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super Preferences> flowCollector, @NotNull Throwable th, @Nullable Continuation<? super Unit> continuation) {
        SessionDatastoreImpl$firebaseSessionDataFlow$1 sessionDatastoreImpl$firebaseSessionDataFlow$1 = new SessionDatastoreImpl$firebaseSessionDataFlow$1(continuation);
        sessionDatastoreImpl$firebaseSessionDataFlow$1.f43733m = flowCollector;
        sessionDatastoreImpl$firebaseSessionDataFlow$1.f43734n = th;
        return sessionDatastoreImpl$firebaseSessionDataFlow$1.invokeSuspend(Unit.f99208a);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        m6959e = C42688d.m6959e();
        int i = this.f43732l;
        if (i != 0) {
            if (i == 1) {
                C38508r.m14539b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C38508r.m14539b(obj);
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", (Throwable) this.f43734n);
            Preferences createEmpty = PreferencesFactory.createEmpty();
            this.f43733m = null;
            this.f43732l = 1;
            if (((FlowCollector) this.f43733m).emit(createEmpty, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }
}
