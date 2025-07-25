package net.pubnative.lite.sdk.models;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import net.pubnative.lite.sdk.models.bidstream.Signal;
import net.pubnative.lite.sdk.utils.json.JsonModel;

/* loaded from: classes10.dex */
public class AdRequest extends JsonModel {
    public String appToken;
    public Boolean isInterstitial = Boolean.FALSE;
    private final List<Signal> signals = new CopyOnWriteArrayList();
    public List<Topic> topics;
    public String zoneId;

    public void addSignal(Signal signal) {
        this.signals.add(signal);
    }

    public List<Signal> getSignals() {
        return this.signals;
    }
}
