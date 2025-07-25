package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class zy0 {
    @NotNull

    /* renamed from: a */
    private final ac1 f89163a;

    public zy0(@NotNull ac1 parentHtmlWebView) {
        Intrinsics.checkNotNullParameter(parentHtmlWebView, "parentHtmlWebView");
        this.f89163a = parentHtmlWebView;
    }

    /* renamed from: a */
    private final void m25953a(String str) {
        ac1 ac1Var = this.f89163a;
        ac1Var.loadUrl("javascript: " + str);
        um0.m28724e(str);
    }

    /* renamed from: b */
    public final void m25951b(@NotNull String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        this.f89163a.m27887b(htmlResponse);
    }

    /* renamed from: a */
    public final void m25952a(@NotNull un0... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        if (!(events.length == 0)) {
            StringBuilder sb2 = new StringBuilder("fireChangeEvent({");
            int length = events.length;
            String str = "";
            int i = 0;
            while (i < length) {
                un0 un0Var = events[i];
                sb2.append(str);
                sb2.append(un0Var.mo26283a());
                i++;
                str = ", ";
            }
            sb2.append("})");
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            C37612s0 c37612s0 = C37612s0.f99333a;
            m25953a(C31714w0.m28089a(new Object[]{sb3}, 1, "window.mraidbridge.%s", "format(...)"));
        }
    }

    /* renamed from: a */
    public final void m25954a(@NotNull lz0 command, @NotNull String message) {
        Intrinsics.checkNotNullParameter(command, "command");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = "notifyErrorEvent(" + JSONObject.quote(command.m32187a()) + ", " + JSONObject.quote(message) + ")";
        C37612s0 c37612s0 = C37612s0.f99333a;
        m25953a(C31714w0.m28089a(new Object[]{str}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    /* renamed from: a */
    public final void m25955a(@NotNull lz0 command) {
        Intrinsics.checkNotNullParameter(command, "command");
        C37612s0 c37612s0 = C37612s0.f99333a;
        m25953a(C31714w0.m28089a(new Object[]{"nativeCallComplete(" + JSONObject.quote(command.m32187a()) + ")"}, 1, "window.mraidbridge.%s", "format(...)"));
    }

    /* renamed from: a */
    public final void m25956a() {
        C37612s0 c37612s0 = C37612s0.f99333a;
        m25953a(C31714w0.m28089a(new Object[]{"notifyReadyEvent();"}, 1, "window.mraidbridge.%s", "format(...)"));
    }
}
