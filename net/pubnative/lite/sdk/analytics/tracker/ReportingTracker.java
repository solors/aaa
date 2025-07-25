package net.pubnative.lite.sdk.analytics.tracker;

/* loaded from: classes10.dex */
public class ReportingTracker {

    /* renamed from: js */
    private String f101898js;
    private int responseCode;
    private final String type;
    private String url;

    public ReportingTracker(String str, String str2, int i) {
        this.f101898js = "";
        this.type = str;
        this.url = str2;
        this.responseCode = i;
    }

    public String getJs() {
        return this.f101898js;
    }

    public int getResponseCode() {
        return this.responseCode;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public ReportingTracker(String str, String str2) {
        this.url = "";
        this.responseCode = 0;
        this.type = str;
        this.f101898js = str2;
    }
}
