package net.pubnative.lite.sdk.viewability;

import android.view.View;
import com.iab.omid.library.pubnativenet.adsession.FriendlyObstructionPurpose;

/* loaded from: classes10.dex */
public class HyBidViewabilityFriendlyObstruction {
    private final FriendlyObstructionPurpose purpose;
    private final String reason;
    private final View view;

    public HyBidViewabilityFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.view = view;
        this.purpose = friendlyObstructionPurpose;
        this.reason = str;
    }

    public FriendlyObstructionPurpose getPurpose() {
        return this.purpose;
    }

    public String getReason() {
        return this.reason;
    }

    public View getView() {
        return this.view;
    }
}
