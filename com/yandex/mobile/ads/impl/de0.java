package com.yandex.mobile.ads.impl;

import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class de0 extends WebChromeClient {
    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(@NotNull ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        um0.m28723f(consoleMessage.message(), consoleMessage.sourceId(), Integer.valueOf(consoleMessage.lineNumber()));
        return true;
    }
}
