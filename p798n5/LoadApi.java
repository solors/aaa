package p798n5;

import android.view.ViewGroup;
import com.meevii.adsdk.common.IADListener;
import p1038x5.AdUnit;

/* renamed from: n5.a */
/* loaded from: classes6.dex */
public interface LoadApi {
    /* renamed from: a */
    void mo12948a(IADListener iADListener);

    void destroy();

    AdUnit isReady();

    AdUnit isValid();

    void load();

    AdUnit show();

    AdUnit show(ViewGroup viewGroup);
}
