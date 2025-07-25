package com.pubmatic.sdk.omsdk;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.pubmatic.Omid;
import com.iab.omid.library.pubmatic.adsession.AdEvents;
import com.iab.omid.library.pubmatic.adsession.AdSession;
import com.iab.omid.library.pubmatic.adsession.AdSessionConfiguration;
import com.iab.omid.library.pubmatic.adsession.AdSessionContext;
import com.iab.omid.library.pubmatic.adsession.CreativeType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;
import com.iab.omid.library.pubmatic.adsession.Partner;
import com.iab.omid.library.pubmatic.adsession.VerificationScriptResource;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.viewability.POBMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import java.util.List;

@Keep
/* loaded from: classes7.dex */
public class POBNativeMeasurement extends POBMeasurement implements POBNativeMeasurementProvider {
    @NonNull
    private final Handler handler = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.omsdk.POBNativeMeasurement$a */
    /* loaded from: classes7.dex */
    public class C26778a implements POBMeasurementProvider.POBScriptListener {

        /* renamed from: a */
        final /* synthetic */ List f70519a;

        /* renamed from: b */
        final /* synthetic */ View f70520b;

        /* renamed from: c */
        final /* synthetic */ POBNativeMeasurementProvider.POBOmidSessionListener f70521c;

        C26778a(List list, View view, POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
            this.f70519a = list;
            this.f70520b = view;
            this.f70521c = pOBOmidSessionListener;
        }

        @Override // com.pubmatic.sdk.common.viewability.POBMeasurementProvider.POBScriptListener
        public void onMeasurementScriptReceived(@NonNull String str) {
            AdSessionContext createNativeAdSessionContext = AdSessionContext.createNativeAdSessionContext(Partner.createPartner("Pubmatic", "4.4.0"), str, this.f70519a, null, "");
            AdSessionConfiguration createAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
            POBNativeMeasurement.this.adSession = AdSession.createAdSession(createAdSessionConfiguration, createNativeAdSessionContext);
            POBNativeMeasurement.this.adSession.registerAdView(this.f70520b);
            POBNativeMeasurement pOBNativeMeasurement = POBNativeMeasurement.this;
            pOBNativeMeasurement.adEvents = AdEvents.createAdEvents(pOBNativeMeasurement.adSession);
            POBNativeMeasurement.this.handler.post(new RunnableC26782a(this));
        }
    }

    /* renamed from: com.pubmatic.sdk.omsdk.POBNativeMeasurement$b */
    /* loaded from: classes7.dex */
    static /* synthetic */ class C26779b {

        /* renamed from: a */
        static final /* synthetic */ int[] f70523a;

        static {
            int[] iArr = new int[POBNativeMeasurementProvider.POBNativeAdEventType.values().length];
            f70523a = iArr;
            try {
                iArr[POBNativeMeasurementProvider.POBNativeAdEventType.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70523a[POBNativeMeasurementProvider.POBNativeAdEventType.IMPRESSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider
    public void signalAdEvent(@NonNull POBNativeMeasurementProvider.POBNativeAdEventType pOBNativeAdEventType) {
        if (this.adEvents != null) {
            try {
                POBLog.info(POBOMSDKUtil.TAG, "Signaling event : %s", pOBNativeAdEventType.name());
                int i = C26779b.f70523a[pOBNativeAdEventType.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        POBLog.warn(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBNativeAdEventType.name());
                    } else {
                        this.adEvents.impressionOccurred();
                    }
                } else {
                    this.adEvents.loaded();
                }
                return;
            } catch (Exception unused) {
                POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBNativeAdEventType.name());
                return;
            }
        }
        POBLog.error(POBOMSDKUtil.TAG, "Unable to signal event : %s", pOBNativeAdEventType.name());
    }

    @Override // com.pubmatic.sdk.common.viewability.POBNativeMeasurementProvider
    public void startAdSession(@NonNull View view, @Nullable List<? extends POBVerificationScriptResource> list, @NonNull POBNativeMeasurementProvider.POBOmidSessionListener pOBOmidSessionListener) {
        try {
            List<VerificationScriptResource> verificationScriptResourceList = POBOMSDKUtil.getVerificationScriptResourceList(list);
            if (verificationScriptResourceList.isEmpty()) {
                POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", "Verification list is empty");
                pOBOmidSessionListener.onOmidSessionInitializationFailed();
                return;
            }
            Context applicationContext = view.getContext().getApplicationContext();
            if (!Omid.isActive()) {
                Omid.activate(applicationContext);
            }
            omidJsServiceScript(applicationContext, new C26778a(verificationScriptResourceList, view, pOBOmidSessionListener));
        } catch (Exception e) {
            POBLog.error(POBOMSDKUtil.TAG, "Unable to start session : %s", e.getMessage());
        }
    }
}
