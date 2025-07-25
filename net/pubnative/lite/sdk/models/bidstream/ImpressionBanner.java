package net.pubnative.lite.sdk.models.bidstream;

import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class ImpressionBanner extends Signal {
    @BidParam(name = "expdir")
    public final List<Integer> expdir;
    @BidParam(name = POBNativeConstants.NATIVE_MIMES)
    public final List<String> mimes;
    @BidParam(name = "pos")
    public final int pos;
    @BidParam(name = "topframe")
    public final int topframe;

    public ImpressionBanner() {
        this(0);
    }

    public ImpressionBanner(int i) {
        this(i, new ArrayList());
    }

    public ImpressionBanner(int i, List<Integer> list) {
        this.topframe = 1;
        this.pos = i;
        this.expdir = list;
        ArrayList arrayList = new ArrayList();
        this.mimes = arrayList;
        arrayList.add("text/html");
        arrayList.add("text/javascript");
    }
}
