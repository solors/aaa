package com.fyber.inneractive.sdk.web;

import android.media.MediaScannerConnection;
import android.net.Uri;

/* renamed from: com.fyber.inneractive.sdk.web.A */
/* loaded from: classes4.dex */
public final class C15488A implements MediaScannerConnection.MediaScannerConnectionClient {

    /* renamed from: a */
    public final String f30635a;

    /* renamed from: b */
    public MediaScannerConnection f30636b;

    public C15488A(String str) {
        this.f30635a = str;
    }

    @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
    public final void onMediaScannerConnected() {
        MediaScannerConnection mediaScannerConnection = this.f30636b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.scanFile(this.f30635a, null);
        }
    }

    @Override // android.media.MediaScannerConnection.OnScanCompletedListener
    public final void onScanCompleted(String str, Uri uri) {
        MediaScannerConnection mediaScannerConnection = this.f30636b;
        if (mediaScannerConnection != null) {
            mediaScannerConnection.disconnect();
        }
    }
}
