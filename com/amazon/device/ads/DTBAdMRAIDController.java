package com.amazon.device.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.browser.customtabs.CustomTabsIntent;
import com.amazon.aps.ads.C3582R;
import com.amazon.aps.ads.util.adview.ApsAdWebViewSupportClient;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.SDKUtilities;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.ktx.BuildConfig;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;
import com.ironsource.C21114v8;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class DTBAdMRAIDController implements DTBActivityListener {
    static final String LOG_TAG = "DTBAdMRAIDController";
    public static final String MRAID_CLOSE = "window.mraid.close();";
    private static final String MRAID_READY = "window.mraidBridge.event.ready();";
    DTBAdView adView;
    LinearLayout closeIndicatorRegion;
    DTBMRAIDCloseButtonListener customButtonListener;
    private DtbOmSdkSessionManager dtbOmSdkSessionManager;
    private Rect lastRect;
    private MraidExposure lastReportedExposure;
    private Boolean lastViewabilityState;
    private boolean loadReportSubmitted;
    boolean pageLoaded = false;
    protected boolean useCustomClose = false;
    private int lastReportedSizeChangeWidth = -1;
    private int lastReportedSizeChangeHeight = -1;
    protected MraidStateType state = MraidStateType.LOADING;
    private boolean jsReady = false;
    private boolean isTwoPartExpand = false;

    /* renamed from: com.amazon.device.ads.DTBAdMRAIDController$2 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C36442 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MraidStateType;

        static {
            int[] iArr = new int[MraidStateType.values().length];
            $SwitchMap$com$amazon$device$ads$MraidStateType = iArr;
            try {
                iArr[MraidStateType.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.RESIZED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.EXPANDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MraidStateType[MraidStateType.HIDDEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public class MraidExposure {
        int percent;
        Rect rect;

        MraidExposure(int i, Rect rect) {
            DTBAdMRAIDController.this = r1;
            this.percent = i;
            this.rect = new Rect(rect);
        }
    }

    static {
        MraidCommand.registerCommand(MraidOpenCommand.getMraidName(), MraidOpenCommand.class);
        MraidCommand.registerCommand(MraidCloseCommand.getMraidName(), MraidCloseCommand.class);
        MraidCommand.registerCommand(MraidUnloadCommand.getMraidName(), MraidUnloadCommand.class);
        MraidCommand.registerCommand(MraidResizeCommand.getMraidName(), MraidResizeCommand.class);
        MraidCommand.registerCommand(MraidExpandCommand.getMraidName(), MraidExpandCommand.class);
        MraidCommand.registerCommand(MraidUseCustomCloseCommand.getMraidName(), MraidUseCustomCloseCommand.class);
        MraidCommand.registerCommand(MraidJSReadyCommand.getMraidName(), MraidJSReadyCommand.class);
        MraidCommand.registerCommand(MraidFirePixelCommand.getMraidName(), MraidFirePixelCommand.class);
    }

    public DTBAdMRAIDController(DTBAdView dTBAdView) {
        this.adView = dTBAdView;
        this.dtbOmSdkSessionManager = dTBAdView.getOmSdkManager();
    }

    private void evaluateJavascriptMethod(String str, JSONObject jSONObject) {
        evaluateJavascript(String.format(str + "(%s);", jSONObject.toString()));
    }

    private void fireEnforcedExposureChange(int i, Rect rect) {
        evaluateJavascript(String.format("window.mraidBridge.event.exposureChange(%d, { x:%d, y:%d, width:%d, height: %d}, null);", Integer.valueOf(i), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.top)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.right - rect.left)), Integer.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(rect.bottom - rect.top))));
    }

    private void fireMaxSizeEvent() {
        SDKUtilities.SimpleSize maxSize = DTBAdUtil.getMaxSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setMaxSize({'width':%d, 'height':%d});", Integer.valueOf(maxSize.getWidth()), Integer.valueOf(maxSize.getHeight())));
    }

    private JSONObject formProperties(MraidProperty[] mraidPropertyArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (MraidProperty mraidProperty : mraidPropertyArr) {
            mraidProperty.formJSON(jSONObject);
        }
        return jSONObject;
    }

    private MraidProperty getCurrentStateProperty() {
        int i = C36442.$SwitchMap$com$amazon$device$ads$MraidStateType[this.state.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return MraidProperty.STATE_DEFAULT_PROPERTY;
                        }
                        return MraidProperty.STATE_HIDDEN_PROPERTY;
                    }
                    return MraidProperty.STATE_EXPANDED_PROPERTY;
                }
                return MraidProperty.STATE_RESIZED_PROPERTY;
            }
            return MraidProperty.STATE_DEFAULT_PROPERTY;
        }
        return MraidProperty.STATE_LOADING_PROPERTY;
    }

    public /* synthetic */ void lambda$evaluateJavascript$0(final String str) {
        if (getAdView() != null) {
            getAdView().evaluateJavascript(str, new ValueCallback<String>() { // from class: com.amazon.device.ads.DTBAdMRAIDController.1
                {
                    DTBAdMRAIDController.this = this;
                }

                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str2) {
                    if (str2 == null || "null".equals(str2)) {
                        return;
                    }
                    String str3 = DTBAdMRAIDController.LOG_TAG;
                    DtbLog.debug(str3, "Value received:" + str2 + " for script " + str);
                }
            });
        }
    }

    public /* synthetic */ void lambda$onMRAIDUnload$2() {
        getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
    }

    public /* synthetic */ boolean lambda$setCloseIndicatorContent$3(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            evaluateJavascript(MRAID_CLOSE);
            ((ViewGroup) view.getParent()).removeView(view);
            this.closeIndicatorRegion = null;
            return true;
        }
        return true;
    }

    public /* synthetic */ void lambda$setState$1() {
        DTBAdView adView = getAdView();
        if (adView != null) {
            adView.setVisibility(8);
        }
    }

    public void addCloseIndicator(int i, int i2) {
        removeCloseIndicator();
        addCloseIndicator(i, i2, false);
    }

    public void cleanup() {
        this.closeIndicatorRegion = null;
        this.adView = null;
        this.customButtonListener = null;
    }

    public void commandCompleted(String str) {
        evaluateJavascript(String.format("window.mraidBridge.service.acknowledgement('%s');", str));
    }

    public void createContentIndicator() {
        int i;
        LinearLayout linearLayout = new LinearLayout(getAdView().getContext());
        this.closeIndicatorRegion = linearLayout;
        if (this.useCustomClose) {
            i = 4;
        } else {
            i = 0;
        }
        linearLayout.setVisibility(i);
        this.closeIndicatorRegion.setOrientation(1);
    }

    public void createLoadReport() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null && !this.loadReportSubmitted) {
            DTBMetricsProcessor.getInstance().submitLatencyReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_LATENCY, (int) (new Date().getTime() - this.adView.getStartTime()));
            this.loadReportSubmitted = true;
        }
    }

    protected void evaluateJavascript(final String str) {
        String str2 = LOG_TAG;
        DtbLog.debug(str2, "MRAID Evaluate JSScript:" + str);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.w
            {
                DTBAdMRAIDController.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDController.this.lambda$evaluateJavascript$0(str);
            }
        });
    }

    public abstract void expand(Map<String, Object> map);

    void fireEnforcedSizeChange(int i, int i2) {
        evaluateJavascript(String.format("window.mraidBridge.event.sizeChange(%d, %d);", Integer.valueOf(i), Integer.valueOf(i2)));
    }

    void fireEnforcedViewableChange(boolean z) {
        String str;
        Object[] objArr = new Object[1];
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        objArr[0] = str;
        evaluateJavascript(String.format("window.mraidBridge.event.viewableChange(%s);", objArr));
    }

    public void fireErrorEvent(String str, String str2) {
        evaluateJavascript(String.format("window.mraidBridge.event.error('%s','%s');", str2, str));
    }

    public void fireExposureChange(int i, Rect rect) {
        int i2 = rect.right;
        if (this.jsReady) {
            fireEnforcedExposureChange(i, rect);
        } else {
            this.lastReportedExposure = new MraidExposure(i, rect);
        }
    }

    void fireMRAIDReadyEvent() {
        evaluateJavascript(MRAID_READY);
    }

    protected void fireMRAIDSupports() {
        evaluateJavascriptMethod("window.mraidBridge.property.setSupports", MraidProperty.SUPPORTS_PROPERTY.getData());
    }

    protected void firePlacementType() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", getPlacementType());
        evaluateJavascriptMethod("window.mraidBridge.property.setPlacementType", jSONObject);
    }

    void fireScreenSizeEvent() {
        SDKUtilities.SimpleSize screenSize = DTBAdUtil.getScreenSize(getAdView());
        evaluateJavascript(String.format("window.mraidBridge.property.setScreenSize({'width':%d, 'height':%d});", Integer.valueOf(screenSize.getWidth()), Integer.valueOf(screenSize.getHeight())));
    }

    public void fireSizeChange(int i, int i2) {
        if (this.lastReportedSizeChangeWidth == i && this.lastReportedSizeChangeHeight == i2) {
            return;
        }
        this.lastReportedSizeChangeWidth = i;
        this.lastReportedSizeChangeHeight = i2;
        if (this.jsReady) {
            fireEnforcedSizeChange(i, i2);
        }
    }

    void fireStateChangeEvent() {
        try {
            JSONObject formProperties = formProperties(new MraidProperty[]{getCurrentStateProperty()});
            String str = LOG_TAG;
            DtbLog.debug(str, "State was changed to " + formProperties.toString() + " for controller " + this);
            evaluateJavascript(String.format("window.mraidBridge.event.stateChange(%s);", formProperties.toString()));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void fireViewableChange(boolean z) {
        Boolean bool = this.lastViewabilityState;
        if (bool == null || bool.booleanValue() != z) {
            if (this.jsReady) {
                fireEnforcedViewableChange(z);
            }
            this.lastViewabilityState = Boolean.valueOf(z);
        }
    }

    public DTBAdView getAdView() {
        return this.adView;
    }

    Context getContext() {
        return getAdView().getContext();
    }

    public DtbOmSdkSessionManager getDtbOmSdkSessionManager() {
        return this.dtbOmSdkSessionManager;
    }

    protected MraidStateType getInitialStateType() {
        return MraidStateType.DEFAULT;
    }

    protected String getPlacementType() {
        return "";
    }

    public void impressionFired() {
        if (!getAdView().isVideo() && getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().impressionOccured();
        }
        commandCompleted(MraidFirePixelCommand.getMraidName());
    }

    public boolean isTwoPartExpand() {
        return this.isTwoPartExpand;
    }

    public boolean isUseCustomClose() {
        return this.useCustomClose;
    }

    public void jsReady() {
        int i;
        commandCompleted("jsready");
        this.jsReady = true;
        Boolean bool = this.lastViewabilityState;
        if (bool != null) {
            fireEnforcedViewableChange(bool.booleanValue());
        }
        MraidExposure mraidExposure = this.lastReportedExposure;
        if (mraidExposure != null) {
            fireEnforcedExposureChange(mraidExposure.percent, mraidExposure.rect);
        }
        int i2 = this.lastReportedSizeChangeWidth;
        if (i2 > 0 && (i = this.lastReportedSizeChangeHeight) > 0) {
            fireEnforcedSizeChange(i2, i);
        }
    }

    public abstract void onAdLeftApplication();

    void onLoadError(String str, int i) {
        onLoadError();
    }

    public abstract void onMRAIDClose();

    public void onMRAIDUnload() {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.x
            {
                DTBAdMRAIDController.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                DTBAdMRAIDController.this.lambda$onMRAIDUnload$2();
            }
        });
    }

    public abstract void onPageLoad();

    public void onPositionChanged(Rect rect) {
        Rect rect2 = this.lastRect;
        if (rect2 != null && rect2.equals(rect)) {
            return;
        }
        int i = rect.right - rect.left;
        int i2 = rect.bottom - rect.top;
        Rect rect3 = this.lastRect;
        boolean z = true;
        if (rect3 != null) {
            int i3 = rect3.right - rect3.left;
            int i4 = rect3.bottom - rect3.top;
            if (Math.abs(i3 - i) <= 1 && Math.abs(i4 - i2) <= 1) {
                z = false;
            }
        }
        setCurrentPositionProperty();
        if (z) {
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i), DTBAdUtil.pixelsToDeviceIndependenPixels(i2));
        }
        this.lastRect = rect;
    }

    public abstract void onResize(Map<String, Object> map);

    public void onViewabilityChanged(boolean z) {
        DtbLog.debug("SET MRAID Visible " + z);
        fireViewableChange(z);
    }

    public void openUrl(String str) {
        openUrl(str, false);
    }

    public void prepareMraid() throws JSONException {
        createLoadReport();
        this.pageLoaded = true;
        fireMaxSizeEvent();
        fireScreenSizeEvent();
        if (getAdView().isAdViewVisible()) {
            setCurrentPositionProperty();
        }
        fireMRAIDSupports();
        firePlacementType();
        setCurrentAppOrientation();
        setState(getInitialStateType());
        fireMRAIDReadyEvent();
        if (AdRegistration.isTestMode()) {
            evaluateJavascript("window.mraidBridge.service.debug('enable');");
        }
    }

    public void removeCloseIndicator() {
        ViewGroup viewGroup;
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null && (viewGroup = (ViewGroup) linearLayout.getParent()) != null) {
            viewGroup.removeView(this.closeIndicatorRegion);
        }
    }

    public void setCloseIndicatorContent(View.OnTouchListener onTouchListener) {
        this.closeIndicatorRegion.setBackgroundColor(0);
        LinearLayout linearLayout = this.closeIndicatorRegion;
        int i = C3582R.C3585id.mraid_close_indicator;
        linearLayout.setId(i);
        ImageView imageView = new ImageView(getAdView().getContext());
        imageView.setId(i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(DTBAdUtil.sizeToDevicePixels(24), DTBAdUtil.sizeToDevicePixels(24));
        layoutParams.setMargins(DTBAdUtil.sizeToDevicePixels(14), DTBAdUtil.sizeToDevicePixels(14), 0, 0);
        this.closeIndicatorRegion.addView(imageView, layoutParams);
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().addFriendlyObstruction(this.closeIndicatorRegion.findViewById(i), FriendlyObstructionPurpose.CLOSE_AD);
        }
        imageView.setImageDrawable(AppCompatResources.getDrawable(getAdView().getContext(), C3582R.C3584drawable.mraid_close));
        if (onTouchListener != null) {
            this.closeIndicatorRegion.setOnTouchListener(onTouchListener);
        } else {
            this.closeIndicatorRegion.setOnTouchListener(new View.OnTouchListener() { // from class: com.amazon.device.ads.u
                {
                    DTBAdMRAIDController.this = this;
                }

                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$setCloseIndicatorContent$3;
                    lambda$setCloseIndicatorContent$3 = DTBAdMRAIDController.this.lambda$setCloseIndicatorContent$3(view, motionEvent);
                    return lambda$setCloseIndicatorContent$3;
                }
            });
        }
    }

    protected void setCurrentAppOrientation() throws JSONException {
        String str;
        int determineSimpleOrientation = DisplayUtils.determineSimpleOrientation();
        if (determineSimpleOrientation != 1) {
            if (determineSimpleOrientation != 2) {
                str = BuildConfig.VERSION_NAME;
            } else {
                str = "landscape";
            }
        } else {
            str = "portrait";
        }
        boolean isRotationLocked = DisplayUtils.isRotationLocked();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("orientation", str);
        jSONObject.put("locked", isRotationLocked);
        evaluateJavascriptMethod("window.mraidBridge.property.setCurrentAppOrientation", jSONObject);
    }

    public void setCurrentPositionProperty() {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], getAdView().getWidth(), getAdView().getHeight());
        }
    }

    public void setCustomButtonListener(DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener) {
        this.customButtonListener = dTBMRAIDCloseButtonListener;
    }

    public void setState(MraidStateType mraidStateType) {
        this.state = mraidStateType;
        if (mraidStateType == MraidStateType.HIDDEN) {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.v
                {
                    DTBAdMRAIDController.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    DTBAdMRAIDController.this.lambda$setState$1();
                }
            });
        }
        fireStateChangeEvent();
    }

    public void setTwoPartExpand(boolean z) {
        this.isTwoPartExpand = z;
    }

    public void setUseCustomClose(boolean z) {
        DtbLog.debug("Set useCustomClose to " + z);
        this.useCustomClose = z;
        commandCompleted("useCustomClose");
        DTBMRAIDCloseButtonListener dTBMRAIDCloseButtonListener = this.customButtonListener;
        if (dTBMRAIDCloseButtonListener != null) {
            dTBMRAIDCloseButtonListener.useCustomButtonUpdated();
        }
    }

    public void onLoadError() {
        String bidId = this.adView.getBidId();
        String hostname = this.adView.getHostname();
        if (bidId != null) {
            DTBMetricsProcessor.getInstance().submitSimpleReportBidId(DTBMetricReport.addBid(bidId, hostname), DTBMetricsProcessor.REPORT_LOAD_FAILURE);
        }
        passLoadError();
    }

    public void openUrl(String str, boolean z) {
        int indexOf;
        PackageManager packageManager = this.adView.getContext().getPackageManager();
        try {
            Uri parse = Uri.parse(str);
            if ("amazonmobile".equals(parse.getScheme()) && parse.getHost().equals(SDKConstants.PARAM_INTENT)) {
                String[] split = str.split("intent=");
                if (split.length > 1) {
                    String str2 = null;
                    for (int i = 1; i < split.length; i++) {
                        try {
                            String str3 = split[i];
                            if (str3.lastIndexOf(C21114v8.C21123i.f54135c) == str3.length() - 1) {
                                str3 = str3.substring(0, str3.length() - 1);
                            }
                            str2 = URLDecoder.decode(str3, "UTF-8");
                            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
                            onAdLeftApplication();
                            break;
                        } catch (ActivityNotFoundException unused) {
                            DtbLog.debug("Intent:" + str2 + " not found.");
                            fireErrorEvent("open", "requested activity not found");
                        } catch (UnsupportedEncodingException unused2) {
                            DtbLog.debug("Unsupported encoding");
                        }
                    }
                }
            } else if (ApsAdWebViewSupportClient.MOBILE_SHOPPING_SCHEME.equals(parse.getScheme())) {
                try {
                    if (packageManager.getLaunchIntentForPackage("com.amazon.mShop.android.shopping") != null) {
                        Intent intent = new Intent("android.intent.action.VIEW");
                        intent.setData(parse);
                        AdRegistration.getCurrentActivity().startActivity(intent);
                    } else {
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(parse);
                        if (str.indexOf("products/") > 0) {
                            intent2.setData(Uri.parse("https://www.amazon.com/dp/" + str.substring(indexOf + 9)));
                            AdRegistration.getCurrentActivity().startActivity(intent2);
                        }
                    }
                    onAdLeftApplication();
                } catch (ActivityNotFoundException unused3) {
                    DtbLog.debug(LOG_TAG, "Activity not found com.amazon.mobile.shopping");
                    fireErrorEvent("open", "mshop activity not found");
                } catch (NullPointerException unused4) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                }
            } else if (!ApsAdWebViewSupportClient.MARKET_SCHEME.equals(parse.getScheme()) && !ApsAdWebViewSupportClient.AMAZON_SCHEME.equals(parse.getScheme())) {
                if (parse.getScheme() == null) {
                    parse = Uri.parse("https:" + str);
                }
                if (z) {
                    try {
                        new CustomTabsIntent.Builder().build().launchUrl(getContext(), parse);
                        onAdLeftApplication();
                    } catch (Exception e) {
                        String str4 = "Failed to execute open command: invalid url " + str;
                        fireErrorEvent("open", str4);
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str4, e);
                    }
                } else {
                    try {
                        Intent intent3 = new Intent("android.intent.action.VIEW", parse);
                        intent3.addFlags(268435456);
                        getContext().startActivity(intent3);
                        onAdLeftApplication();
                    } catch (Exception e2) {
                        String str5 = "Failed to execute open command: invalid url " + str;
                        fireErrorEvent("open", str5);
                        APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, str5, e2);
                    }
                }
            } else {
                try {
                    try {
                        Intent intent4 = new Intent("android.intent.action.VIEW");
                        intent4.setData(parse);
                        AdRegistration.getCurrentActivity().startActivity(intent4);
                        onAdLeftApplication();
                    } catch (ActivityNotFoundException unused5) {
                        DtbLog.debug(LOG_TAG, "App stores and browsers not found");
                        fireErrorEvent("open", "app stores and browsers not found");
                    } catch (NullPointerException unused6) {
                        DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                        fireErrorEvent("open", "current activity from AdRegistration not found");
                    }
                } catch (ActivityNotFoundException unused7) {
                    DTBAdUtil.directAppStoreLinkToBrowser(this, parse);
                } catch (NullPointerException unused8) {
                    DtbLog.debug(LOG_TAG, "Current activity from AdRegistration not found");
                    fireErrorEvent("open", "current activity from AdRegistration not found");
                }
            }
            commandCompleted("open");
        } catch (Exception unused9) {
            fireErrorEvent("open", "invalid url " + str);
            commandCompleted("open");
        }
    }

    public void addCloseIndicator(int i, int i2, boolean z) {
        removeCloseIndicator();
        addCloseIndicator(i, i2, null, z);
    }

    public void setCurrentPositionProperty(float f, float f2) {
        if (this.pageLoaded) {
            int[] iArr = new int[2];
            getAdView().getLocationOnScreen(iArr);
            setCurrentPositionProperty(iArr[0], iArr[1], f, f2);
        }
    }

    @SuppressLint({"ResourceType"})
    protected void addCloseIndicator(int i, int i2, View.OnTouchListener onTouchListener, boolean z) {
        createContentIndicator();
        DTBAdUtil.getRootView(getAdView()).addView(this.closeIndicatorRegion, DTBAdUtil.sizeToDevicePixels(50), DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setX(i - DTBAdUtil.sizeToDevicePixels(50));
        this.closeIndicatorRegion.setY(i2);
        setCloseIndicatorContent(onTouchListener);
    }

    void setCurrentPositionProperty(int i, int i2, float f, float f2) {
        if (this.pageLoaded) {
            evaluateJavascript(String.format("window.mraidBridge.property.setCurrentPosition({'xPos':%.1f, 'yPos':%.1f, 'width': %.1f, 'height': %.1f});", Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels(i2)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f)), Float.valueOf(DTBAdUtil.pixelsToDeviceIndependenPixels((int) f2))));
        }
    }

    public void closeExpandedPartTwo() {
    }

    public void onAdClicked() {
    }

    public void onAdFailedToLoad() {
    }

    public void onAdLoaded() {
    }

    public void onAdOpened() {
    }

    public void onAdRemoved() {
    }

    public void onVideoCompleted() {
    }

    void passLoadError() {
    }

    public void startEndCardDisplayOMSDKSession() {
    }

    public void startOMSDKSession() {
    }

    public void stopOMSDKSession() {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityPaused(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
    }

    @Override // com.amazon.device.ads.DTBActivityListener
    public void onActivityStopped(Activity activity) {
    }
}
