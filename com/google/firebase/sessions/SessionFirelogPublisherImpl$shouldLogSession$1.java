package com.google.firebase.sessions;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SessionFirelogPublisher.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.SessionFirelogPublisherImpl", m17094f = "SessionFirelogPublisher.kt", m17093l = {94}, m17092m = "shouldLogSession")
@Metadata
/* loaded from: classes4.dex */
public final class SessionFirelogPublisherImpl$shouldLogSession$1 extends AbstractC37589d {

    /* renamed from: l */
    Object f43765l;

    /* renamed from: m */
    /* synthetic */ Object f43766m;

    /* renamed from: n */
    final /* synthetic */ SessionFirelogPublisherImpl f43767n;

    /* renamed from: o */
    int f43768o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionFirelogPublisherImpl$shouldLogSession$1(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation<? super SessionFirelogPublisherImpl$shouldLogSession$1> continuation) {
        super(continuation);
        this.f43767n = sessionFirelogPublisherImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m66282c;
        this.f43766m = obj;
        this.f43768o |= Integer.MIN_VALUE;
        m66282c = this.f43767n.m66282c(this);
        return m66282c;
    }
}
