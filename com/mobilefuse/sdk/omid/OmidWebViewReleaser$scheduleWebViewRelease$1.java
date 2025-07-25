package com.mobilefuse.sdk.omid;

import android.webkit.WebView;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OmidWebViewReleaser.kt */
@Metadata
/* loaded from: classes7.dex */
public final class OmidWebViewReleaser$scheduleWebViewRelease$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ WebView $webView;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OmidWebViewReleaser$scheduleWebViewRelease$1(WebView webView) {
        super(0);
        this.$webView = webView;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        List list;
        OmidWebViewReleaser$createWebViewClient$1 createWebViewClient;
        if (this.$webView == null) {
            return;
        }
        OmidWebViewReleaser omidWebViewReleaser = OmidWebViewReleaser.INSTANCE;
        list = OmidWebViewReleaser.lockedWebViews;
        list.add(this.$webView);
        WebView webView = this.$webView;
        createWebViewClient = omidWebViewReleaser.createWebViewClient();
        webView.setWebViewClient(createWebViewClient);
        SchedulersKt.getGlobalHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.sdk.omid.OmidWebViewReleaser$scheduleWebViewRelease$1.1
            @Override // java.lang.Runnable
            public final void run() {
                OmidWebViewReleaser.INSTANCE.freeWebView(OmidWebViewReleaser$scheduleWebViewRelease$1.this.$webView);
            }
        }, 4000L);
    }
}
