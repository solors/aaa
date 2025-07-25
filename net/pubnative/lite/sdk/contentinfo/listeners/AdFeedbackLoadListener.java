package net.pubnative.lite.sdk.contentinfo.listeners;

/* loaded from: classes10.dex */
public interface AdFeedbackLoadListener {
    void onFormClosed();

    void onLoad(String str);

    void onLoadFailed(Throwable th);

    void onLoadFinished();
}
