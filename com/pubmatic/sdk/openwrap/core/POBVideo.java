package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.POBAdSize;
import com.pubmatic.sdk.common.POBInstanceProvider;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.openwrap.core.POBRequest;
import com.pubmatic.sdk.video.player.POBVideoPlayer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBVideo {
    protected static final int BOXING_ALLOWED = 1;
    protected static final int PLAYBACK_END = 1;
    @NonNull

    /* renamed from: a */
    private final Linearity f70663a;
    @NonNull

    /* renamed from: b */
    private POBRequest.AdPosition f70664b = POBRequest.AdPosition.UNKNOWN;
    @NonNull

    /* renamed from: c */
    private final Placement f70665c;
    @NonNull

    /* renamed from: d */
    private final Plcmt f70666d;
    @NonNull

    /* renamed from: e */
    private final POBAdSize f70667e;
    @Nullable

    /* renamed from: f */
    private JSONArray f70668f;
    protected static final int[] PROTOCOLS = {2, 3, 5, 6, 7, 8, 11, 12, 13, 14};
    protected static final String[] MIMES = POBVideoPlayer.SupportedMediaType.getStringValues();
    protected static final int[] DELIVERY = {2};
    protected static final int[] COMPANION_TYPE = {1, 2, 3};

    /* loaded from: classes7.dex */
    public enum Linearity {
        LINEAR(1),
        NON_LINEAR(2);
        

        /* renamed from: b */
        private final int f70670b;

        Linearity(int i) {
            this.f70670b = i;
        }

        public int getValue() {
            return this.f70670b;
        }
    }

    /* loaded from: classes7.dex */
    public enum Placement {
        IN_BANNER(2),
        INTERSTITIAL(5);
        

        /* renamed from: b */
        private final int f70672b;

        Placement(int i) {
            this.f70672b = i;
        }

        public int getValue() {
            return this.f70672b;
        }
    }

    /* loaded from: classes7.dex */
    public enum Plcmt {
        STANDALONE(4),
        INTERSTITIAL(3);
        

        /* renamed from: b */
        private final int f70674b;

        Plcmt(int i) {
            this.f70674b = i;
        }

        public int getValue() {
            return this.f70674b;
        }
    }

    public POBVideo(@NonNull Placement placement, @NonNull Plcmt plcmt, @NonNull Linearity linearity, @NonNull POBAdSize pOBAdSize) {
        this.f70667e = pOBAdSize;
        this.f70665c = placement;
        this.f70663a = linearity;
        this.f70666d = plcmt;
    }

    @NonNull
    public POBAdSize getAdSize() {
        return this.f70667e;
    }

    @Nullable
    public JSONArray getCompanionAds() {
        return this.f70668f;
    }

    @NonNull
    public Linearity getLinearity() {
        return this.f70663a;
    }

    @Nullable
    public POBRequest.AdPosition getPosition() {
        return this.f70664b;
    }

    @NonNull
    public JSONObject getRTBJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(POBNativeConstants.NATIVE_IMAGE_WIDTH, this.f70667e.getAdWidth());
        jSONObject.put("h", this.f70667e.getAdHeight());
        if (this.f70668f == null) {
            POBBanner pOBBanner = new POBBanner(this.f70667e);
            pOBBanner.setAdPosition(this.f70664b);
            this.f70668f = new JSONArray(new JSONObject[]{pOBBanner.getRTBJson(new HashSet(), true)});
        }
        jSONObject.put("companionad", this.f70668f);
        jSONObject.put("pos", this.f70664b.getValue());
        jSONObject.put("protocols", new JSONArray(PROTOCOLS));
        jSONObject.put(POBNativeConstants.NATIVE_MIMES, new JSONArray(MIMES));
        jSONObject.put("linearity", this.f70663a.getValue());
        jSONObject.put("boxingallowed", 1);
        jSONObject.put("delivery", new JSONArray(DELIVERY));
        jSONObject.put("companiontype", new JSONArray(COMPANION_TYPE));
        jSONObject.put("placement", this.f70665c.getValue());
        jSONObject.put("plcmt", this.f70666d.getValue());
        jSONObject.put("playbackend", 1);
        jSONObject.put("startdelay", 0);
        Set<Integer> supportedAPIs = getSupportedAPIs();
        if (!supportedAPIs.isEmpty()) {
            jSONObject.put("api", new JSONArray((Collection) supportedAPIs));
        }
        return jSONObject;
    }

    @NonNull
    public Set<Integer> getSupportedAPIs() {
        HashSet hashSet = new HashSet();
        if (POBInstanceProvider.getSdkConfig().getMeasurementProvider("com.pubmatic.sdk.omsdk.POBVideoMeasurement") != null) {
            hashSet.add(Integer.valueOf(POBRequest.API.OMSDK.getValue()));
        }
        return hashSet;
    }

    public void setCompanionAds(@NonNull JSONArray jSONArray) {
        this.f70668f = jSONArray;
    }

    public void setPosition(@NonNull POBRequest.AdPosition adPosition) {
        this.f70664b = adPosition;
    }
}
