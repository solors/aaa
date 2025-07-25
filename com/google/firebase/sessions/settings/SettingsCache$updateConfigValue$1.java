package com.google.firebase.sessions.settings;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37589d;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SettingsCache.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.settings.SettingsCache", m17094f = "SettingsCache.kt", m17093l = {119}, m17092m = "updateConfigValue")
@Metadata
/* loaded from: classes4.dex */
public final class SettingsCache$updateConfigValue$1<T> extends AbstractC37589d {

    /* renamed from: l */
    /* synthetic */ Object f43880l;

    /* renamed from: m */
    final /* synthetic */ SettingsCache f43881m;

    /* renamed from: n */
    int f43882n;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$1(SettingsCache settingsCache, Continuation<? super SettingsCache$updateConfigValue$1> continuation) {
        super(continuation);
        this.f43881m = settingsCache;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m66254a;
        this.f43880l = obj;
        this.f43882n |= Integer.MIN_VALUE;
        m66254a = this.f43881m.m66254a(null, null, this);
        return m66254a;
    }
}
