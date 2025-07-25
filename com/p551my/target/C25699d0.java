package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.p551my.target.common.models.AudioData;
import com.p551my.target.common.models.ShareButtonData;
import com.smaato.sdk.video.vast.model.MediaFile;
import io.bidmachine.unified.UnifiedMediationParams;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.my.target.d0 */
/* loaded from: classes7.dex */
public class C25699d0 extends AbstractC25652b1 {
    public C25699d0(C26073s c26073s, C25832j c25832j, Context context) {
        super(c26073s, c25832j, 1, context);
    }

    /* renamed from: a */
    public final void m44045a(JSONObject jSONObject, C25704d5 c25704d5) {
        m44191a(jSONObject, (AbstractC25742f0) c25704d5);
        Boolean m42966h = this.f66624a.m42966h();
        c25704d5.setAllowSeek(m42966h != null ? m42966h.booleanValue() : jSONObject.optBoolean("allowSeek", c25704d5.isAllowSeek()));
        Boolean m42964i = this.f66624a.m42964i();
        c25704d5.setAllowSkip(m42964i != null ? m42964i.booleanValue() : jSONObject.optBoolean("allowSkip", c25704d5.isAllowSkip()));
        Boolean m42962j = this.f66624a.m42962j();
        c25704d5.setAllowTrackChange(m42962j != null ? m42962j.booleanValue() : jSONObject.optBoolean("allowTrackChange", c25704d5.isAllowTrackChange()));
    }

    /* renamed from: b */
    public boolean m44044b(JSONObject jSONObject, C25704d5 c25704d5) {
        if (m44187d(jSONObject, c25704d5)) {
            return true;
        }
        float optDouble = (float) jSONObject.optDouble("duration", 0.0d);
        if (optDouble <= 0.0f) {
            m44192a("Required field", "unable to set duration " + optDouble, c25704d5.getId());
            return false;
        }
        c25704d5.setAutoPlay(jSONObject.optBoolean("autoplay", c25704d5.isAutoPlay()));
        c25704d5.setHasCtaButton(jSONObject.optBoolean("hasCtaButton", c25704d5.isHasCtaButton()));
        c25704d5.setAdText(jSONObject.optString("adText", c25704d5.getAdText()));
        m44045a(jSONObject, c25704d5);
        m44188c(jSONObject, (AbstractC25742f0) c25704d5);
        JSONArray optJSONArray = jSONObject.optJSONArray("shareButtons");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    ShareButtonData newData = ShareButtonData.newData();
                    newData.setName(optJSONObject.optString("name"));
                    newData.setUrl(optJSONObject.optString("url"));
                    newData.setImageUrl(optJSONObject.optString(UnifiedMediationParams.KEY_IMAGE_URL));
                    c25704d5.addShareButtonData(newData);
                }
            }
        }
        return m44043c(jSONObject, c25704d5);
    }

    /* renamed from: c */
    public final boolean m44043c(JSONObject jSONObject, C25704d5 c25704d5) {
        JSONArray optJSONArray = jSONObject.optJSONArray("mediafiles");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("src");
                    if (!TextUtils.isEmpty(optString)) {
                        AudioData newAudioData = AudioData.newAudioData(optString);
                        newAudioData.setBitrate(optJSONObject.optInt(MediaFile.BITRATE));
                        c25704d5.setMediaData(newAudioData);
                        return true;
                    }
                    m44192a("Bad value", "bad mediafile object, src = " + optString, c25704d5.getId());
                }
            }
            return false;
        }
        AbstractC25846ja.m43680a("AudioBannerParser: Mediafiles array is empty");
        return false;
    }

    /* renamed from: a */
    public static C25699d0 m44046a(C26073s c26073s, C25832j c25832j, Context context) {
        return new C25699d0(c26073s, c25832j, context);
    }
}
