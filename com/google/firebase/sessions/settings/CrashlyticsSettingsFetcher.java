package com.google.firebase.sessions.settings;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata
/* loaded from: classes4.dex */
public interface CrashlyticsSettingsFetcher {
    @Nullable
    Object doConfigFetch(@NotNull Map<String, String> map, @NotNull Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function22, @NotNull Continuation<? super Unit> continuation);
}
