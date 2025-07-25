package io.bidmachine.media3.extractor.text;

import android.os.Bundle;
import android.os.Parcel;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BundleableUtil;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes9.dex */
public final class CueDecoder {
    static final String BUNDLED_CUES = "c";

    public ImmutableList<Cue> decode(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        Bundle readBundle = obtain.readBundle(Bundle.class.getClassLoader());
        obtain.recycle();
        return BundleableUtil.fromBundleList(Cue.CREATOR, (ArrayList) Assertions.checkNotNull(readBundle.getParcelableArrayList("c")));
    }
}
