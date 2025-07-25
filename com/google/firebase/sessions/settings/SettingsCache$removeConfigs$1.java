package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsCache.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.settings.SettingsCache", m17094f = "SettingsCache.kt", m17093l = {103}, m17092m = "removeConfigs$com_google_firebase_firebase_sessions")
@Metadata
/* loaded from: classes4.dex */
public final class SettingsCache$removeConfigs$1 extends AbstractC37589d {

    /* renamed from: l */
    /* synthetic */ Object f43874l;

    /* renamed from: m */
    final /* synthetic */ SettingsCache f43875m;

    /* renamed from: n */
    int f43876n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$1(SettingsCache settingsCache, Continuation<? super SettingsCache$removeConfigs$1> continuation) {
        super(continuation);
        this.f43875m = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f43874l = obj;
        this.f43876n |= Integer.MIN_VALUE;
        return this.f43875m.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
