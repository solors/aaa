package com.maticoo.sdk.mraid;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import com.maticoo.sdk.mraid.Consts;
import com.maticoo.sdk.utils.prefs.Preference;
import com.smaato.sdk.richmedia.mraid.dataprovider.MraidEnvironmentProperties;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class Bridge {
    private static final String TAG = "Bridge";
    public List<String> dlSuccTrackUrl;
    public final Handler handler;
    public final WebView webView;
    public String ltype = "";
    private Consts.PlacementType placementType = Consts.PlacementType.Inline;
    private Consts.State state = Consts.State.Loading;
    private ExpandProperties expandProperties = new ExpandProperties();
    private OrientationProperties orientationProperties = new OrientationProperties();
    private ResizeProperties resizeProperties = new ResizeProperties();

    /* renamed from: com.maticoo.sdk.mraid.Bridge$1 */
    /* loaded from: classes6.dex */
    static /* synthetic */ class C216711 {
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature;
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$Consts$State;

        static {
            int[] iArr = new int[Consts.Feature.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature = iArr;
            try {
                iArr[Consts.Feature.SMS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature[Consts.Feature.Tel.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature[Consts.Feature.Calendar.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature[Consts.Feature.StorePicture.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature[Consts.Feature.InlineVideo.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$Feature[Consts.Feature.VPAID.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[Consts.State.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$Consts$State = iArr2;
            try {
                iArr2[Consts.State.Loading.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Default.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Hidden.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Resized.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$Consts$State[Consts.State.Expanded.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface Handler {
        void mraidClose(Bridge bridge);

        void mraidCreateCalendarEvent(Bridge bridge, String str);

        void mraidExpand(Bridge bridge, String str);

        void mraidInit(Bridge bridge);

        void mraidOpen(Bridge bridge, String str);

        void mraidPlayVideo(Bridge bridge, String str);

        void mraidResize(Bridge bridge);

        void mraidSetCloseCounter(Bridge bridge, String str);

        void mraidStorePicture(Bridge bridge, String str);

        void mraidUnload(Bridge bridge);

        void mraidUpdateCurrentPosition(Bridge bridge);

        void mraidUpdatedExpandProperties(Bridge bridge);

        void mraidUpdatedOrientationProperties(Bridge bridge);

        void mraidUpdatedResizeProperties(Bridge bridge);
    }

    public Bridge(WebView webView, Handler handler) {
        if (webView != null) {
            if (handler != null) {
                Log.e(TAG, "Bridge()");
                this.webView = webView;
                this.handler = handler;
                return;
            }
            throw new IllegalArgumentException("handler null");
        }
        throw new IllegalArgumentException("webView null");
    }

    public ExpandProperties getExpandProperties() {
        Log.e(TAG, "getExpandProperties: " + this.expandProperties);
        return this.expandProperties;
    }

    public OrientationProperties getOrientationProperties() {
        Log.e(TAG, "getOrientationProperties: " + this.orientationProperties);
        return this.orientationProperties;
    }

    public Consts.PlacementType getPlacementType() {
        Log.e(TAG, "getPlacementType: " + this.placementType);
        return this.placementType;
    }

    public ResizeProperties getResizeProperties() {
        Log.e(TAG, "getResizeProperties: " + this.resizeProperties);
        return this.resizeProperties;
    }

    public Consts.State getState() {
        Log.e(TAG, "getState: " + this.state);
        return this.state;
    }

    @JavascriptInterface
    public void nativeInvoke(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("console")) {
            String str2 = str.split("\\?")[1];
            if (!TextUtils.isEmpty(str2)) {
                Log.e(TAG, "js log messages --->> " + str2);
                return;
            }
            return;
        }
        try {
            URI uri = new URI(str);
            Log.e(TAG, "nativeInvoke: " + str);
            if ("mraid".equals(uri.getScheme().toLowerCase(Locale.US))) {
                String host = uri.getHost();
                String rawQuery = uri.getRawQuery();
                HashMap hashMap = new HashMap(10);
                if (rawQuery != null) {
                    try {
                        for (String str3 : rawQuery.split("\\&")) {
                            String[] split = str3.split("\\=");
                            if (split.length == 2) {
                                hashMap.put(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if ("initialize".equals(host)) {
                    this.handler.mraidInit(this);
                } else if ("close".equals(host)) {
                    this.handler.mraidClose(this);
                } else if ("unload".equals(host)) {
                    this.handler.mraidUnload(this);
                } else if ("open".equals(host)) {
                    String str4 = (String) hashMap.get("url");
                    this.ltype = (String) hashMap.get(Consts.CommandLandingType);
                    String str5 = (String) hashMap.get(Consts.CommandTracks);
                    if (str5 != null) {
                        try {
                            JSONArray jSONArray = new JSONArray(str5);
                            this.dlSuccTrackUrl = new ArrayList(jSONArray.length());
                            for (int i = 0; i < jSONArray.length(); i++) {
                                this.dlSuccTrackUrl.add(jSONArray.getString(i));
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    this.handler.mraidOpen(this, str4);
                } else if (Consts.CommandUpdateCurrentPosition.equals(host)) {
                    this.handler.mraidUpdateCurrentPosition(this);
                } else if ("expand".equals(host)) {
                    this.ltype = (String) hashMap.get(Consts.CommandLandingType);
                    this.handler.mraidExpand(this, (String) hashMap.get("url"));
                } else if (Consts.CommandSetExpandProperties.equals(host)) {
                    this.expandProperties = ExpandProperties.propertiesFromArgs(hashMap);
                    this.handler.mraidUpdatedExpandProperties(this);
                } else if ("setOrientationProperties".equals(host)) {
                    this.orientationProperties = OrientationProperties.propertiesFromArgs(hashMap);
                    this.handler.mraidUpdatedOrientationProperties(this);
                } else if ("resize".equals(host)) {
                    this.handler.mraidResize(this);
                } else if (Consts.CommandSetResizeProperties.equals(host)) {
                    this.resizeProperties = ResizeProperties.propertiesFromArgs(hashMap);
                    this.handler.mraidUpdatedResizeProperties(this);
                } else if ("playVideo".equals(host)) {
                    this.handler.mraidPlayVideo(this, (String) hashMap.get("url"));
                } else if (Consts.CommandCreateCalendarEvent.equals(host)) {
                    this.handler.mraidCreateCalendarEvent(this, (String) hashMap.get("event"));
                } else if ("storePicture".equals(host)) {
                    this.handler.mraidStorePicture(this, (String) hashMap.get("url"));
                } else if (Consts.CommandSetCloseCounter.equals(host)) {
                    this.handler.mraidSetCloseCounter(this, (String) hashMap.get(Consts.CommandArgSeconds));
                }
            }
        } catch (URISyntaxException e) {
            Log.e(TAG, "nativeInvoke: " + e);
        }
    }

    public void sendErrorMessage(String str, String str2) {
        Log.e(TAG, "sendErrorMessage: message -> " + str + ", action -> " + str2);
        this.webView.injectJavascript("mraid.fireErrorEvent('" + str + "','" + str2 + "');");
    }

    public void sendPictureAdded(boolean z) {
        String str;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        this.webView.injectJavascript("mraid.firePictureAddedEvent('" + str + "');");
    }

    public void sendReady() {
        Log.e(TAG, "sendReady: ");
        this.webView.injectJavascript("mraid.fireEvent('ready');");
    }

    public void setAudioVolume(float f) {
        this.webView.injectJavascript("mraid.setAudioVolumeChange(" + f + ");");
    }

    public void setCurrentAppOrientation(String str, boolean z) {
        this.webView.injectJavascript("mraid.setCurrentAppOrientation({orientation:'" + str + "',locked:" + z + "});");
    }

    public void setCurrentExposure(int i, int i2, int i3, int i4, int i5) {
        String format = String.format(Locale.US, "{exposedPercentage: %d, viewport: {width: %d, height: %d}, visibleRectangle: {x: %d, y: %d, width: %d, height: %d, occlusionRectangle: {x: %d,y: %d,width: %d,height: %d}}}", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i2), Integer.valueOf(i3), 0, 0, 0, 0);
        Log.e(TAG, "setCurrentExposure: value " + format);
        this.webView.injectJavascript(String.format("mraid.setExposureChange(%s);", format));
    }

    public void setCurrentPosition(int i, int i2, int i3, int i4) {
        Log.e(TAG, "setCurrentPosition: width:" + i3 + ",height:" + i4);
        this.webView.injectJavascript("mraid.setCurrentPosition({x:" + i + ",y:" + i2 + ",width:" + i3 + ",height:" + i4 + "});");
    }

    public void setDefaultPosition(int i, int i2, int i3, int i4) {
        Log.e(TAG, "setDefaultPosition: width:" + i3 + ",height:" + i4);
        this.webView.injectJavascript("mraid.setDefaultPosition({x:" + i + ",y:" + i2 + ",width:" + i3 + ",height:" + i4 + "});");
    }

    public void setEnv(String str) {
        String value = Preference.GAID.getValue();
        boolean z = !TextUtils.isEmpty(value);
        Log.e(TAG, "advertisingId: " + value);
        Log.e(TAG, "limitAdTrackingEnabled: " + z);
        this.webView.injectJavascript(String.format("mraid.setEnv(%s)", String.format("{version:%s,sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,androidExpandFixBug:%d}", MraidEnvironmentProperties.VERSION, "zmaticoo", Defaults.SDK_VERSION, str, value, Boolean.valueOf(z), Boolean.FALSE, 1)));
    }

    public void setExpandProperties(ExpandProperties expandProperties) {
        this.expandProperties = expandProperties;
        String expandProperties2 = expandProperties.toString();
        Log.e(TAG, "setExpandProperties: " + expandProperties2);
        this.webView.injectJavascript("mraid.setExpandProperties(" + expandProperties2 + ");");
    }

    public void setLocation(double d, double d2, int i, String str, int i2, String str2) {
        String format = String.format(Locale.US, "{lat: %f, lon: %f, type: %d, accuracy: '%s', lastfix: %d, ipservice: '%s'}", Double.valueOf(d), Double.valueOf(d2), Integer.valueOf(i), str, Integer.valueOf(i2), str2);
        Log.e(TAG, "setLocation: value " + format);
        String format2 = String.format("mraid.setLocation(%s);", format);
        Log.e(TAG, "setLocation: " + format2);
        this.webView.injectJavascript(format2);
    }

    public void setMaxSize(int i, int i2) {
        Log.e(TAG, "setMaxSize: width:" + i + ",height:" + i2);
        this.webView.injectJavascript("mraid.setMaxSize({width:" + i + ",height:" + i2 + "});");
    }

    public void setOrientationProperties(OrientationProperties orientationProperties) {
        String orientationProperties2 = orientationProperties.toString();
        Log.e(TAG, "setOrientationProperties: " + orientationProperties2);
        this.webView.injectJavascript("mraid.setOrientationProperties(" + orientationProperties2 + ");");
    }

    public void setPlacementType(Consts.PlacementType placementType) {
        String str;
        Log.e(TAG, "setPlacementType: " + placementType);
        this.placementType = placementType;
        if (placementType == Consts.PlacementType.Interstitial) {
            str = "interstitial";
        } else {
            str = "inline";
        }
        this.webView.injectJavascript("mraid.setPlacementType('" + str + "');");
    }

    public void setResizeProperties(ResizeProperties resizeProperties) {
        String resizeProperties2 = resizeProperties.toString();
        Log.e(TAG, "setResizeProperties: " + resizeProperties2);
        this.webView.injectJavascript("mraid.setResizeProperties(" + resizeProperties2 + ");");
    }

    public void setScreenSize(int i, int i2) {
        Log.e(TAG, "setScreenSize: width:" + i + ",height:" + i2);
        this.webView.injectJavascript("mraid.setScreenSize({width:" + i + ",height:" + i2 + "});");
    }

    public void setState(Consts.State state) {
        Log.e(TAG, "setState: " + state);
        this.state = state;
        int i = C216711.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[state.ordinal()];
        String str = "loading";
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            str = "expanded";
                        }
                    } else {
                        str = "resized";
                    }
                } else {
                    str = "hidden";
                }
            } else {
                str = "default";
            }
        }
        this.webView.injectJavascript("mraid.setState('" + str + "');");
    }

    public void setStateAndCurrentPosition(Consts.State state, int i, int i2, int i3, int i4) {
        Log.e(TAG, "setStateAndCurrentPosition: state:" + state + ", width:" + i3 + ",height:" + i4);
        this.state = state;
        int i5 = C216711.$SwitchMap$com$maticoo$sdk$mraid$Consts$State[state.ordinal()];
        String str = "loading";
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        if (i5 == 5) {
                            str = "expanded";
                        }
                    } else {
                        str = "resized";
                    }
                } else {
                    str = "hidden";
                }
            } else {
                str = "default";
            }
        }
        this.webView.injectJavascript("mraid.setStateAndCurrentPosition('" + str + "',{x:" + i + ",y:" + i2 + ",width:" + i3 + ",height:" + i4 + "});");
    }

    public void setSupportedFeature(Consts.Feature feature, boolean z) {
        String str;
        String str2;
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        switch (C216711.$SwitchMap$com$maticoo$sdk$mraid$Consts$Feature[feature.ordinal()]) {
            case 1:
                str2 = "sms";
                break;
            case 2:
                str2 = "tel";
                break;
            case 3:
                str2 = "calendar";
                break;
            case 4:
                str2 = "storePicture";
                break;
            case 5:
                str2 = "inlineVideo";
                break;
            case 6:
                str2 = "vpaid";
                break;
            default:
                str2 = null;
                break;
        }
        Log.e(TAG, "setSupportedFeature: feature -> " + feature + ", supported -> " + z);
        this.webView.injectJavascript("mraid.setSupports('" + str2 + "', '" + str + "');");
    }

    public void setViewable(boolean z) {
        String str;
        Log.e(TAG, "setViewable: " + z);
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        this.webView.injectJavascript("mraid.setViewable('" + str + "');");
    }

    public void testResize() {
        this.resizeProperties.toString();
        Log.e(TAG, "resize");
        this.webView.injectJavascript("mraid.resize();");
    }

    public void vpaidInit() {
        Log.e(TAG, "AD subscribe events");
        this.webView.injectJavascript("mraid.subscribe(\"AdClickThru\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdError\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdImpression\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdPaused\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdPlaying\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdVideoStart\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdVideoFirstQuartile\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdVideoMidpoint\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdVideoThirdQuartile\")");
        this.webView.injectJavascript("mraid.subscribe(\"AdVideoComplete\")");
    }

    @JavascriptInterface
    public void vpaidInvoke(String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("console")) {
            return;
        }
        try {
            URI uri = new URI(str);
            Log.e(TAG, "vpaidInvoke: " + str);
            if ("vpaid".equals(uri.getScheme().toLowerCase(Locale.US))) {
                String host = uri.getHost();
                String rawQuery = uri.getRawQuery();
                HashMap hashMap = new HashMap(10);
                if (rawQuery != null) {
                    try {
                        for (String str2 : rawQuery.split("\\&")) {
                            String[] split = str2.split("\\=");
                            if (split.length == 2) {
                                hashMap.put(URLDecoder.decode(split[0], "UTF-8"), URLDecoder.decode(split[1], "UTF-8"));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Consts.CommandVpaidInit.equals(host)) {
                    vpaidInit();
                } else if (Consts.CommandVpaidAdClickThru.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: VPAIDAdClickThru -> " + ((String) hashMap.get("url")));
                } else if (Consts.CommandVpaidAdError.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdError -> " + ((String) hashMap.get("message")));
                } else if (Consts.CommandVpaidAdError.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdError -> " + ((String) hashMap.get("message")));
                } else if (Consts.CommandVpaidAdImp.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdImpression");
                } else if (Consts.CommandVpaidAdPaused.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdPaused");
                } else if (Consts.CommandVpaidAdPlaying.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdPlaying");
                } else if (Consts.CommandVpaidAdVideoStart.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdVideoStart");
                } else if (Consts.CommandVpaidAdVideoFirstQuartile.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdVideoFirstQuartile");
                } else if (Consts.CommandVpaidAdVideoMidpoint.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdVideoMidpoint");
                } else if (Consts.CommandVpaidAdVideoThirdQuartile.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdVideoThirdQuartile");
                } else if (Consts.CommandVpaidAdVideoComplete.equals(host)) {
                    Log.e(TAG, "vpaidInvoke: vpaidAdVideoComplete");
                }
            }
        } catch (URISyntaxException e) {
            Log.e(TAG, "vpaidInvoke: " + e);
        }
    }
}
