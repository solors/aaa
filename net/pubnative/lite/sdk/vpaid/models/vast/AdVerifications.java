package net.pubnative.lite.sdk.vpaid.models.vast;

import java.util.List;
import net.pubnative.lite.sdk.vpaid.xml.Tag;

/* loaded from: classes10.dex */
public class AdVerifications {
    @Tag(com.smaato.sdk.video.vast.model.Verification.NAME)
    private List<Verification> verificationList;

    public List<Verification> getVerificationList() {
        return this.verificationList;
    }
}
