package io.bidmachine.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.BundleableUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.ArrayList;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class CueEncoder {
    public byte[] encode(List<Cue> list) {
        ArrayList<Bundle> bundleArrayList = BundleableUtil.toBundleArrayList(list);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, bundleArrayList);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }
}
