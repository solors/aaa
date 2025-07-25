package com.maticoo.sdk.p405ad.nativead;

import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.maticoo.sdk.C21523R;
import com.maticoo.sdk.p405ad.utils.AdSize;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.IdentifierGetter;
import java.util.List;
import java.util.Map;

/* renamed from: com.maticoo.sdk.ad.nativead.NativeAdOptions */
/* loaded from: classes6.dex */
public class NativeAdOptions {
    public static final int ADCHOICES_BOTTOM_LEFT = 3;
    public static final int ADCHOICES_BOTTOM_RIGHT = 2;
    public static final int ADCHOICES_TOP_RIGHT = 1;
    @AdChoicesPlacement
    private int adChoicesPlacement;
    private AdSize adSize;
    private AdTemplate adTemplate;
    private NativeAdListener loadListener;
    private Map<String, Object> localExtra;
    private String requestId;
    private List<AdElement> requiredElements;

    /* renamed from: com.maticoo.sdk.ad.nativead.NativeAdOptions$AdChoicesPlacement */
    /* loaded from: classes6.dex */
    public @interface AdChoicesPlacement {
    }

    /* renamed from: com.maticoo.sdk.ad.nativead.NativeAdOptions$AdElement */
    /* loaded from: classes6.dex */
    public enum AdElement {
        TITLE(1),
        ICON(2),
        DESCRIBE(3),
        CALL_TO_ACTION(4);
        
        int elementId;

        AdElement(int i) {
            this.elementId = i;
        }
    }

    /* renamed from: com.maticoo.sdk.ad.nativead.NativeAdOptions$AdTemplate */
    /* loaded from: classes6.dex */
    public enum AdTemplate {
        MEDIUM("native_medium", IdentifierGetter.getLayoutId(ApplicationUtil.getInstance().getApplicationContext(), "zmaticoo_layout_native_medium", C21523R.C21527layout.zmaticoo_layout_native_medium), new AdSize(DtbConstants.DEFAULT_PLAYER_HEIGHT, 270));
        
        AdSize adSize;
        String templateId;
        int templateLayoutId;

        AdTemplate(String str, int i, AdSize adSize) {
            this.templateId = str;
            this.templateLayoutId = i;
            this.adSize = adSize;
        }

        public static AdTemplate getAdTemplate(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            AdTemplate adTemplate = MEDIUM;
            if (!TextUtils.equals(str, adTemplate.templateId)) {
                return null;
            }
            return adTemplate;
        }

        public String getTemplateId() {
            return this.templateId;
        }

        public int getTemplateLayoutId() {
            return this.templateLayoutId;
        }
    }

    /* renamed from: com.maticoo.sdk.ad.nativead.NativeAdOptions$Builder */
    /* loaded from: classes6.dex */
    public static class Builder {
        @AdChoicesPlacement
        private int adChoicesPlacement = 3;
        private AdSize adSize;
        private AdTemplate adTemplate;
        private NativeAdListener loadListener;
        private Map<String, Object> localExtra;
        private String requestId;
        private List<AdElement> requiredElements;

        public NativeAdOptions build() {
            NativeAdOptions nativeAdOptions = new NativeAdOptions();
            nativeAdOptions.adTemplate = this.adTemplate;
            nativeAdOptions.adSize = this.adSize;
            AdTemplate adTemplate = this.adTemplate;
            if (adTemplate != null) {
                nativeAdOptions.adSize = adTemplate.adSize;
            }
            nativeAdOptions.requiredElements = this.requiredElements;
            nativeAdOptions.loadListener = this.loadListener;
            nativeAdOptions.adChoicesPlacement = this.adChoicesPlacement;
            nativeAdOptions.requestId = this.requestId;
            return nativeAdOptions;
        }

        public Builder setAdChoicesPlacement(@AdChoicesPlacement int i) {
            this.adChoicesPlacement = i;
            return this;
        }

        public Builder setAdSize(AdSize adSize) {
            this.adSize = adSize;
            return this;
        }

        public Builder setAdTemplate(AdTemplate adTemplate) {
            this.adTemplate = adTemplate;
            return this;
        }

        public Builder setLoadListener(NativeAdListener nativeAdListener) {
            this.loadListener = nativeAdListener;
            return this;
        }

        public Builder setLocalExtra(Map<String, Object> map) {
            this.localExtra = map;
            return this;
        }

        public Builder setRequestId(String str) {
            this.requestId = str;
            return this;
        }

        public Builder setRequiredElements(List<AdElement> list) {
            this.requiredElements = list;
            return this;
        }
    }

    public int getAdChoicesPlacement() {
        return this.adChoicesPlacement;
    }

    public AdSize getAdSize() {
        return this.adSize;
    }

    public AdTemplate getAdTemplate() {
        return this.adTemplate;
    }

    public NativeAdListener getLoadListener() {
        return this.loadListener;
    }

    public Map<String, Object> getLocalExtra() {
        return this.localExtra;
    }

    public String getRequestId() {
        return this.requestId;
    }

    public List<AdElement> getRequiredElements() {
        return this.requiredElements;
    }

    private NativeAdOptions() {
        this.adChoicesPlacement = 3;
    }
}
