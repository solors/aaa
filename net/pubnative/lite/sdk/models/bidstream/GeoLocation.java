package net.pubnative.lite.sdk.models.bidstream;

/* loaded from: classes10.dex */
public class GeoLocation extends Signal {
    @BidParam(name = "accuracy")
    public Integer accuracy;
    @BidParam(name = "utcoffset")
    public Integer utcoffset;

    public GeoLocation() {
    }

    public GeoLocation(Integer num, Integer num2) {
        this.accuracy = num;
        this.utcoffset = num2;
    }
}
