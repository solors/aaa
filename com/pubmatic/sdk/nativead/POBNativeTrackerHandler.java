package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.nativead.response.POBNativeAdResponseEventTracker;
import java.util.ArrayList;
import java.util.List;
import p978t3.WebViewRenderException;

/* loaded from: classes7.dex */
public class POBNativeTrackerHandler {
    @NonNull

    /* renamed from: a */
    private final POBTrackerHandler f70450a;

    /* renamed from: com.pubmatic.sdk.nativead.POBNativeTrackerHandler$a */
    /* loaded from: classes7.dex */
    class C26772a extends WebViewClient {

        /* renamed from: a */
        final /* synthetic */ POBWebView f70451a;

        C26772a(POBWebView pOBWebView) {
            this.f70451a = pOBWebView;
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            WebViewRenderException.m3275a(this);
            this.f70451a.destroy();
            return true;
        }
    }

    public POBNativeTrackerHandler(@NonNull POBTrackerHandler pOBTrackerHandler) {
        this.f70450a = pOBTrackerHandler;
    }

    @NonNull
    /* renamed from: a */
    private List<String> m40446a(@Nullable List<POBNativeAdResponseEventTracker> list) {
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isListNullOrEmpty(list)) {
            for (POBNativeAdResponseEventTracker pOBNativeAdResponseEventTracker : list) {
                arrayList.add(pOBNativeAdResponseEventTracker.getUrl());
            }
        }
        return arrayList;
    }

    public void executeClickTrackers(@Nullable List<String> list) {
        this.f70450a.sendTrackers(list);
    }

    @MainThread
    public void executeImpressionTracker(@NonNull Context context, @Nullable List<POBNativeAdResponseEventTracker> list, @Nullable List<POBNativeAdResponseEventTracker> list2, @Nullable List<String> list3, @Nullable String str) {
        this.f70450a.sendTrackers(m40444a(list2, list3));
        List<String> m40445a = m40445a(list, str);
        if (!m40445a.isEmpty()) {
            POBWebView createInstance = POBWebView.createInstance(context);
            if (createInstance != null) {
                createInstance.setWebViewClient(new C26772a(createInstance));
                this.f70450a.executeJsScripts(createInstance, POBUtils.parseJsTracker(m40445a));
                return;
            }
            return;
        }
        POBLog.error("POBNativeTrackerHandler", "Failed to execute tracker url: " + m40445a, new Object[0]);
    }

    @NonNull
    /* renamed from: a */
    private List<String> m40445a(@Nullable List<POBNativeAdResponseEventTracker> list, @Nullable String str) {
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isNullOrEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(m40446a(list));
        return arrayList;
    }

    @NonNull
    /* renamed from: a */
    private List<String> m40444a(@Nullable List<POBNativeAdResponseEventTracker> list, @Nullable List<String> list2) {
        ArrayList arrayList = new ArrayList();
        if (!POBUtils.isListNullOrEmpty(list2)) {
            arrayList.addAll(list2);
        }
        arrayList.addAll(m40446a(list));
        return arrayList;
    }
}
