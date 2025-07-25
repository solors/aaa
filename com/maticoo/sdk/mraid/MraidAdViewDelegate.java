package com.maticoo.sdk.mraid;

import com.maticoo.sdk.mraid.MraidAdView;

/* loaded from: classes6.dex */
public interface MraidAdViewDelegate {

    /* loaded from: classes6.dex */
    public interface ActivityListener {
        void countDownFinish(MraidAdView mraidAdView);

        void onCloseButtonClick(MraidAdView mraidAdView);
    }

    /* loaded from: classes6.dex */
    public interface FeatureSupportHandler {
        boolean shouldAddCalendarEntry(MraidAdView mraidAdView, String str);

        boolean shouldStorePicture(MraidAdView mraidAdView, String str);

        Boolean shouldSupportCalendar(MraidAdView mraidAdView);

        Boolean shouldSupportPhone(MraidAdView mraidAdView);

        Boolean shouldSupportSMS(MraidAdView mraidAdView);

        Boolean shouldSupportStorePicture(MraidAdView mraidAdView);

        Boolean shouldSupportVPAID(MraidAdView mraidAdView);
    }

    /* loaded from: classes6.dex */
    public interface InternalBrowserListener {
        void onInternalBrowserDismissed(MraidAdView mraidAdView);

        void onInternalBrowserPresented(MraidAdView mraidAdView);
    }

    /* loaded from: classes6.dex */
    public interface LogListener {
        boolean onLogEvent(MraidAdView mraidAdView, String str, MraidAdView.LogLevel logLevel);
    }
}
