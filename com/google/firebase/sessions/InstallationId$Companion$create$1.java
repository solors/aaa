package com.google.firebase.sessions;

import com.google.firebase.sessions.InstallationId;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: InstallationId.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.InstallationId$Companion", m17094f = "InstallationId.kt", m17093l = {32, 40}, m17092m = "create")
@Metadata
/* loaded from: classes4.dex */
public final class InstallationId$Companion$create$1 extends AbstractC37589d {

    /* renamed from: l */
    Object f43700l;

    /* renamed from: m */
    /* synthetic */ Object f43701m;

    /* renamed from: n */
    final /* synthetic */ InstallationId.Companion f43702n;

    /* renamed from: o */
    int f43703o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstallationId$Companion$create$1(InstallationId.Companion companion, Continuation<? super InstallationId$Companion$create$1> continuation) {
        super(continuation);
        this.f43702n = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f43701m = obj;
        this.f43703o |= Integer.MIN_VALUE;
        return this.f43702n.create(null, this);
    }
}
