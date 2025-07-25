package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.ApplicationInfo;
import java.net.URL;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37734i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import sd.C42688d;

/* compiled from: RemoteSettingsFetcher.kt */
@Metadata
/* loaded from: classes4.dex */
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull

    /* renamed from: a */
    private final ApplicationInfo f43842a;
    @NotNull

    /* renamed from: b */
    private final CoroutineContext f43843b;
    @NotNull

    /* renamed from: c */
    private final String f43844c;

    /* compiled from: RemoteSettingsFetcher.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public RemoteSettingsFetcher(@NotNull ApplicationInfo appInfo, @NotNull CoroutineContext blockingDispatcher, @NotNull String baseUrl) {
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        this.f43842a = appInfo;
        this.f43843b = blockingDispatcher;
        this.f43844c = baseUrl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public final URL m66258a() {
        return new URL(new Uri.Builder().scheme("https").authority(this.f43844c).appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp").appendPath(this.f43842a.getAppId()).appendPath("settings").appendQueryParameter("build_version", this.f43842a.getAndroidAppInfo().getAppBuildVersion()).appendQueryParameter("display_version", this.f43842a.getAndroidAppInfo().getVersionName()).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    @Nullable
    public Object doConfigFetch(@NotNull Map<String, String> map, @NotNull Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function22, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m16317g = C37734i.m16317g(this.f43843b, new RemoteSettingsFetcher$doConfigFetch$2(this, map, function2, function22, null), continuation);
        m6959e = C42688d.m6959e();
        if (m16317g == m6959e) {
            return m16317g;
        }
        return Unit.f99208a;
    }

    public /* synthetic */ RemoteSettingsFetcher(ApplicationInfo applicationInfo, CoroutineContext coroutineContext, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(applicationInfo, coroutineContext, (i & 4) != 0 ? "firebase-settings.crashlytics.com" : str);
    }
}
