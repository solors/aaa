package com.pubmatic.sdk.common.browser;

import android.content.DialogInterface;
import android.webkit.SslErrorHandler;
import com.pubmatic.sdk.common.browser.POBInternalBrowserActivity;
import com.pubmatic.sdk.common.utility.POBAlertDialog;

/* renamed from: com.pubmatic.sdk.common.browser.a */
/* loaded from: classes7.dex */
class C26692a implements POBAlertDialog.POBDialogListener {

    /* renamed from: a */
    final /* synthetic */ SslErrorHandler f70069a;

    /* renamed from: b */
    final /* synthetic */ POBInternalBrowserActivity.C26691f f70070b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C26692a(POBInternalBrowserActivity.C26691f c26691f, SslErrorHandler sslErrorHandler) {
        this.f70070b = c26691f;
        this.f70069a = sslErrorHandler;
    }

    @Override // com.pubmatic.sdk.common.utility.POBAlertDialog.POBDialogListener
    public void onCancel(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f70069a.cancel();
        if (POBInternalBrowserActivity.this.f70058d != null && POBInternalBrowserActivity.this.f70058d.copyBackForwardList().getCurrentIndex() < 0) {
            POBInternalBrowserActivity.this.m40640l();
        }
    }

    @Override // com.pubmatic.sdk.common.utility.POBAlertDialog.POBDialogListener
    public void onSuccess(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f70069a.proceed();
    }
}
