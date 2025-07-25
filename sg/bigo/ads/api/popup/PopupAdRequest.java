package sg.bigo.ads.api.popup;

import androidx.annotation.Nullable;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.api.AbstractC43544c;

/* loaded from: classes10.dex */
public class PopupAdRequest extends AbstractC43532b<PopupAdRequest> {

    /* loaded from: classes10.dex */
    public static class Builder extends AbstractC43544c<Builder, PopupAdRequest> {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // sg.bigo.ads.api.AbstractC43544c
        public PopupAdRequest createAdRequest() {
            return new PopupAdRequest(this.mSlotId, this.mServerBidPayload);
        }
    }

    public PopupAdRequest(String str, @Nullable String str2) {
        super(str, str2);
    }

    @Override // sg.bigo.ads.api.AbstractC43532b
    /* renamed from: c */
    public final int mo5358c() {
        return 20;
    }
}
