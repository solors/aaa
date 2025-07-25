package io.bidmachine.displays;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.protobuf.adcom.C10729Ad;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedMediationParams;

/* renamed from: io.bidmachine.displays.h */
/* loaded from: classes9.dex */
class IabAdObjectParams extends AdObjectParams {
    /* JADX INFO: Access modifiers changed from: package-private */
    public IabAdObjectParams(@NonNull C10729Ad c10729Ad) {
        super(c10729Ad);
        getData().put(UnifiedMediationParams.KEY_CREATIVE_ID, c10729Ad.getId());
    }

    @Override // io.bidmachine.models.AdObjectParams
    public boolean isValid() {
        Object obj = getData().get(UnifiedMediationParams.KEY_CREATIVE_ADM);
        if ((obj instanceof CharSequence) && !TextUtils.isEmpty((CharSequence) obj)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCreativeAdm(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        getData().put(UnifiedMediationParams.KEY_CREATIVE_ADM, str);
    }
}
