package net.pubnative.lite.sdk.viewability;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.iab.omid.library.pubnativenet.Omid;
import com.iab.omid.library.pubnativenet.adsession.Partner;
import net.pubnative.lite.sdk.utils.Logger;

/* loaded from: classes10.dex */
public class ViewabilityManager {
    private static final String TAG = "ViewabilityManager";
    private static String VIEWABILITY_JS_SERVICE_CONTENT = null;
    public static final String VIEWABILITY_PARTNER_NAME = "Pubnativenet";
    private Partner mPubNativePartner = null;
    private boolean mShouldMeasureViewability = true;

    public ViewabilityManager(final Application application) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: net.pubnative.lite.sdk.viewability.a
            @Override // java.lang.Runnable
            public final void run() {
                ViewabilityManager.m14179a(ViewabilityManager.this, application);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m14179a(ViewabilityManager viewabilityManager, Application application) {
        viewabilityManager.lambda$new$0(application);
    }

    public /* synthetic */ void lambda$new$0(Application application) {
        try {
            if (!Omid.isActive()) {
                Omid.activate(application);
            }
        } catch (IllegalArgumentException unused) {
            Logger.m14227e(TAG, "Could not initialise Omid");
        }
        if (Omid.isActive() && this.mPubNativePartner == null) {
            try {
                this.mPubNativePartner = Partner.createPartner(VIEWABILITY_PARTNER_NAME, "3.3.0");
            } catch (IllegalArgumentException unused2) {
                Logger.m14227e(TAG, "Could not initialise Omid");
            }
        }
        if (TextUtils.isEmpty(VIEWABILITY_JS_SERVICE_CONTENT)) {
            VIEWABILITY_JS_SERVICE_CONTENT = new String(Base64.decode(Assets.omsdkjs, 0));
        }
    }

    public Partner getPartner() {
        return this.mPubNativePartner;
    }

    public String getServiceJs() {
        return VIEWABILITY_JS_SERVICE_CONTENT;
    }

    public boolean isViewabilityMeasurementActivated() {
        if (Omid.isActive() && this.mShouldMeasureViewability) {
            return true;
        }
        return false;
    }

    public boolean isViewabilityMeasurementEnabled() {
        return this.mShouldMeasureViewability;
    }

    public void setViewabilityMeasurementEnabled(boolean z) {
        this.mShouldMeasureViewability = z;
    }
}
