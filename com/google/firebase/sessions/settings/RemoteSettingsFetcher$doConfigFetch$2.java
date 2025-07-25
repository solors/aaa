package com.google.firebase.sessions.settings;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.AbstractC37596l;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C37609n0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38508r;
import sd.C42688d;

/* compiled from: RemoteSettingsFetcher.kt */
@DebugMetadata(m17095c = "com.google.firebase.sessions.settings.RemoteSettingsFetcher$doConfigFetch$2", m17094f = "RemoteSettingsFetcher.kt", m17093l = {68, 70, 73}, m17092m = "invokeSuspend")
@Metadata
/* loaded from: classes4.dex */
final class RemoteSettingsFetcher$doConfigFetch$2 extends AbstractC37596l implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* renamed from: l */
    int f43845l;

    /* renamed from: m */
    final /* synthetic */ RemoteSettingsFetcher f43846m;

    /* renamed from: n */
    final /* synthetic */ Map<String, String> f43847n;

    /* renamed from: o */
    final /* synthetic */ Function2<JSONObject, Continuation<? super Unit>, Object> f43848o;

    /* renamed from: p */
    final /* synthetic */ Function2<String, Continuation<? super Unit>, Object> f43849p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RemoteSettingsFetcher$doConfigFetch$2(RemoteSettingsFetcher remoteSettingsFetcher, Map<String, String> map, Function2<? super JSONObject, ? super Continuation<? super Unit>, ? extends Object> function2, Function2<? super String, ? super Continuation<? super Unit>, ? extends Object> function22, Continuation<? super RemoteSettingsFetcher$doConfigFetch$2> continuation) {
        super(2, continuation);
        this.f43846m = remoteSettingsFetcher;
        this.f43847n = map;
        this.f43848o = function2;
        this.f43849p = function22;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new RemoteSettingsFetcher$doConfigFetch$2(this.f43846m, this.f43847n, this.f43848o, this.f43849p, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [T, java.lang.String] */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m6959e;
        URL m66258a;
        m6959e = C42688d.m6959e();
        int i = this.f43845l;
        try {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        C38508r.m14539b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C38508r.m14539b(obj);
                }
            } else {
                C38508r.m14539b(obj);
                m66258a = this.f43846m.m66258a();
                URLConnection openConnection = m66258a.openConnection();
                Intrinsics.m17073h(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
                httpsURLConnection.setRequestMethod("GET");
                httpsURLConnection.setRequestProperty("Accept", "application/json");
                for (Map.Entry<String, String> entry : this.f43847n.entrySet()) {
                    httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
                int responseCode = httpsURLConnection.getResponseCode();
                if (responseCode == 200) {
                    InputStream inputStream = httpsURLConnection.getInputStream();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                    StringBuilder sb2 = new StringBuilder();
                    C37609n0 c37609n0 = new C37609n0();
                    while (true) {
                        ?? readLine = bufferedReader.readLine();
                        c37609n0.f99327b = readLine;
                        if (readLine == 0) {
                            break;
                        }
                        sb2.append((String) readLine);
                    }
                    bufferedReader.close();
                    inputStream.close();
                    JSONObject jSONObject = new JSONObject(sb2.toString());
                    Function2<JSONObject, Continuation<? super Unit>, Object> function2 = this.f43848o;
                    this.f43845l = 1;
                    if (function2.mo105910invoke(jSONObject, this) == m6959e) {
                        return m6959e;
                    }
                } else {
                    Function2<String, Continuation<? super Unit>, Object> function22 = this.f43849p;
                    String str = "Bad response code: " + responseCode;
                    this.f43845l = 2;
                    if (function22.mo105910invoke(str, this) == m6959e) {
                        return m6959e;
                    }
                }
            }
        } catch (Exception e) {
            Function2<String, Continuation<? super Unit>, Object> function23 = this.f43849p;
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            this.f43845l = 3;
            if (function23.mo105910invoke(message, this) == m6959e) {
                return m6959e;
            }
        }
        return Unit.f99208a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo105910invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((RemoteSettingsFetcher$doConfigFetch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f99208a);
    }
}
