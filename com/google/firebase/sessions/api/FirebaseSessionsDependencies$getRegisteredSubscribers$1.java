package com.google.firebase.sessions.api;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FirebaseSessionsDependencies.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", m17094f = "FirebaseSessionsDependencies.kt", m17093l = {124}, m17092m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
@Metadata
/* loaded from: classes4.dex */
public final class FirebaseSessionsDependencies$getRegisteredSubscribers$1 extends AbstractC37589d {

    /* renamed from: l */
    Object f43807l;

    /* renamed from: m */
    Object f43808m;

    /* renamed from: n */
    Object f43809n;

    /* renamed from: o */
    Object f43810o;

    /* renamed from: p */
    Object f43811p;

    /* renamed from: q */
    Object f43812q;

    /* renamed from: r */
    /* synthetic */ Object f43813r;

    /* renamed from: s */
    final /* synthetic */ FirebaseSessionsDependencies f43814s;

    /* renamed from: t */
    int f43815t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseSessionsDependencies$getRegisteredSubscribers$1(FirebaseSessionsDependencies firebaseSessionsDependencies, Continuation<? super FirebaseSessionsDependencies$getRegisteredSubscribers$1> continuation) {
        super(continuation);
        this.f43814s = firebaseSessionsDependencies;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f43813r = obj;
        this.f43815t |= Integer.MIN_VALUE;
        return this.f43814s.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
    }
}
