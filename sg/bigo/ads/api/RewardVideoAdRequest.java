package sg.bigo.ads.api;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes10.dex */
public class RewardVideoAdRequest extends AbstractC43532b {

    /* loaded from: classes10.dex */
    public static class Builder extends AbstractC43544c<Builder, RewardVideoAdRequest> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.AbstractC43544c
        public RewardVideoAdRequest createAdRequest() {
            return new RewardVideoAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public RewardVideoAdRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public final int mo5358c() {
        return 4;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    @Nullable
    /* renamed from: d */
    public final Map<String, Object> mo5460d() {
        return null;
    }
}
