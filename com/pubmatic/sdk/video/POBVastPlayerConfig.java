package com.pubmatic.sdk.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.device.ads.DTBAdLoader;
import com.pubmatic.sdk.common.log.POBLog;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBVastPlayerConfig {

    /* renamed from: a */
    private int f70808a;

    /* renamed from: b */
    private int f70809b;

    /* renamed from: c */
    private int f70810c;

    /* renamed from: d */
    private int f70811d;

    /* renamed from: e */
    private int f70812e;

    /* renamed from: f */
    private int f70813f;

    /* renamed from: g */
    private int f70814g;

    /* renamed from: h */
    private boolean f70815h;

    /* renamed from: i */
    private final int f70816i;

    /* renamed from: j */
    private final boolean f70817j;

    /* renamed from: k */
    private final boolean f70818k;

    /* loaded from: classes7.dex */
    public static class ConfigBuilder {
        public static final int DEFAULT_ENDCARD_SKIP_AFTER = 5;
        public static final int DEFAULT_MEDIA_URI_TIMEOUT = 20000;
        public static final boolean DEFAULT_PLAY_ON_MUTE = true;
        public static final int DEFAULT_SKIP = 1;
        public static final int DEFAULT_VIDEO_SKIP_AFTER = 7;
        public static final int DEFAULT_WRAPPER_URI_TIMEOUT = 5000;

        /* renamed from: a */
        private int f70819a;

        /* renamed from: b */
        private int f70820b;

        /* renamed from: d */
        private int f70822d;

        /* renamed from: h */
        private boolean f70826h = true;

        /* renamed from: i */
        private int f70827i = 5;

        /* renamed from: j */
        private boolean f70828j = false;

        /* renamed from: k */
        private boolean f70829k = false;

        /* renamed from: c */
        private int f70821c = 1;

        /* renamed from: e */
        private int f70823e = 7;

        /* renamed from: f */
        private int f70824f = 5000;

        /* renamed from: g */
        private int f70825g = 20000;

        public ConfigBuilder(int i, int i2) {
            this.f70819a = i;
            this.f70820b = i2;
        }

        /* renamed from: a */
        private static int m40139a(boolean z) {
            return z ? 0 : 7;
        }

        @NonNull
        public static POBVastPlayerConfig createVastConfig(@Nullable JSONObject jSONObject, boolean z, boolean z2, boolean z3, @NonNull String str) {
            POBVastPlayerConfig build = new ConfigBuilder(0, 0).build(z);
            if (jSONObject != null) {
                JSONObject optJSONObject = jSONObject.optJSONObject("ext");
                if (optJSONObject != null && optJSONObject.length() > 0) {
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("video");
                    if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                        POBLog.info("ConfigBuilder", "Video config: " + optJSONObject2, new Object[0]);
                        ConfigBuilder configBuilder = new ConfigBuilder(optJSONObject2.optInt("minduration"), optJSONObject2.optInt("maxduration"));
                        configBuilder.skip(optJSONObject2.optInt(EventConstants.SKIP, 1));
                        configBuilder.skipMin(optJSONObject2.optInt("skipmin"));
                        configBuilder.setSkipAfterCompletionEnabled(z2);
                        if (-9999 != optJSONObject2.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, -9999)) {
                            configBuilder.setSkipAfterCompletionEnabled(false);
                        }
                        configBuilder.skipAfter(optJSONObject2.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, m40139a(z2)));
                        configBuilder.setPlayOnMute(z3);
                        JSONArray optJSONArray = optJSONObject2.optJSONArray("playbackmethod");
                        if (optJSONArray != null && optJSONArray.length() > 0) {
                            try {
                                int intValue = ((Integer) optJSONArray.get(0)).intValue();
                                if ("interstitial".equals(str)) {
                                    if (intValue == 1) {
                                        configBuilder.setPlayOnMute(false);
                                    } else if (intValue == 2) {
                                        configBuilder.setPlayOnMute(true);
                                    }
                                } else if (intValue == 5) {
                                    configBuilder.setPlayOnMute(false);
                                } else if (intValue == 6) {
                                    configBuilder.setPlayOnMute(true);
                                }
                            } catch (JSONException e) {
                                POBLog.warn("ConfigBuilder", "Failed to parse playbackmethod, %s", e.toString());
                            }
                        }
                        JSONObject optJSONObject3 = optJSONObject2.optJSONObject("clientconfig");
                        if (optJSONObject3 != null && optJSONObject3.length() > 0) {
                            configBuilder.setBackButtonEnabled(optJSONObject3.optBoolean("enablehardwarebackbutton", false));
                            JSONObject optJSONObject4 = optJSONObject3.optJSONObject("timeouts");
                            if (optJSONObject4 != null) {
                                configBuilder.wrapperUriTimeout(optJSONObject4.optInt("wrapperTagURI"));
                                configBuilder.mediaUriTimeout(optJSONObject4.optInt("mediaFileURI"));
                            }
                            JSONObject optJSONObject5 = optJSONObject3.optJSONObject("companion");
                            if (optJSONObject5 != null) {
                                configBuilder.endCardSkipAfter(optJSONObject5.optInt(DTBAdLoader.APS_VIDEO_SKIP_AFTER, 5));
                            }
                        }
                        return configBuilder.build(z);
                    }
                    POBLog.warn("ConfigBuilder", "Null/empty video response parameter.", new Object[0]);
                    return build;
                }
                POBLog.warn("ConfigBuilder", "Null/empty extension response parameter.", new Object[0]);
                return build;
            }
            return build;
        }

        public POBVastPlayerConfig build(boolean z) {
            return new POBVastPlayerConfig(this, z);
        }

        public ConfigBuilder endCardSkipAfter(int i) {
            this.f70827i = i;
            return this;
        }

        public ConfigBuilder mediaUriTimeout(int i) {
            if (i > this.f70825g) {
                this.f70825g = i;
            }
            return this;
        }

        public ConfigBuilder setBackButtonEnabled(boolean z) {
            this.f70828j = z;
            return this;
        }

        public ConfigBuilder setPlayOnMute(boolean z) {
            this.f70826h = z;
            return this;
        }

        public ConfigBuilder setSkipAfterCompletionEnabled(boolean z) {
            this.f70829k = z;
            return this;
        }

        public ConfigBuilder skip(int i) {
            this.f70821c = i;
            return this;
        }

        public ConfigBuilder skipAfter(int i) {
            this.f70823e = i;
            return this;
        }

        public ConfigBuilder skipMin(int i) {
            this.f70822d = i;
            return this;
        }

        public ConfigBuilder wrapperUriTimeout(int i) {
            if (i > this.f70824f) {
                this.f70824f = i;
            }
            return this;
        }
    }

    public int getEndCardSkipAfter() {
        return this.f70816i;
    }

    public int getMaxDuration() {
        return this.f70809b;
    }

    public int getMediaUriTimeout() {
        return this.f70814g;
    }

    public int getMinDuration() {
        return this.f70808a;
    }

    public int getSkip() {
        return this.f70810c;
    }

    public int getSkipAfter() {
        return this.f70812e;
    }

    public int getSkipMin() {
        return this.f70811d;
    }

    public int getWrapperUriTimeout() {
        return this.f70813f;
    }

    public boolean isBackButtonEnabled() {
        return this.f70817j;
    }

    public boolean isPlayOnMute() {
        return this.f70815h;
    }

    public boolean isSkipAfterCompletionEnabled() {
        return this.f70818k;
    }

    private POBVastPlayerConfig(@NonNull ConfigBuilder configBuilder, boolean z) {
        this.f70808a = configBuilder.f70819a;
        this.f70809b = configBuilder.f70820b;
        if (z) {
            this.f70810c = configBuilder.f70821c;
        }
        this.f70811d = configBuilder.f70822d;
        this.f70812e = configBuilder.f70823e;
        this.f70813f = configBuilder.f70824f;
        this.f70814g = configBuilder.f70825g;
        this.f70815h = configBuilder.f70826h;
        this.f70816i = configBuilder.f70827i;
        this.f70817j = configBuilder.f70828j;
        this.f70818k = configBuilder.f70829k;
    }
}
