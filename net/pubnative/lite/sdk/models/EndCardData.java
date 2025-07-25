package net.pubnative.lite.sdk.models;

/* loaded from: classes10.dex */
public class EndCardData {
    private final String content;
    private final Boolean isCustom;
    private final Type type;

    /* loaded from: classes10.dex */
    public enum Type {
        STATIC_RESOURCE,
        IFRAME_RESOURCE,
        HTML_RESOURCE
    }

    public EndCardData(Type type, String str) {
        this.content = str;
        this.type = type;
        this.isCustom = Boolean.FALSE;
    }

    public String getContent() {
        return this.content;
    }

    public Type getType() {
        return this.type;
    }

    public Boolean isCustom() {
        return this.isCustom;
    }

    public EndCardData(Type type, String str, Boolean bool) {
        this.content = str;
        this.type = type;
        this.isCustom = bool;
    }
}
