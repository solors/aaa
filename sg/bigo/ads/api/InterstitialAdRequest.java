package sg.bigo.ads.api;

import androidx.annotation.Nullable;
import java.util.Map;

/* loaded from: classes10.dex */
public class InterstitialAdRequest extends AbstractC43532b {

    /* renamed from: h */
    private int f114017h;

    /* loaded from: classes10.dex */
    public static class Builder extends AbstractC43544c<Builder, InterstitialAdRequest> {
        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // sg.bigo.ads.api.AbstractC43544c
        public InterstitialAdRequest createAdRequest() {
            return new InterstitialAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public InterstitialAdRequest(String str, String str2) {
        super(str, str2);
        this.f114017h = 3;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: a */
    public final boolean mo5467a(int i) {
        if (i == 3) {
            this.f114017h = 3;
            return false;
        } else if (i == 20) {
            this.f114017h = 20;
            return false;
        } else {
            return true;
        }
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public final int mo5358c() {
        return this.f114017h;
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    @Nullable
    /* renamed from: d */
    public final Map<String, Object> mo5460d() {
        return null;
    }
}
