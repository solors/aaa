package com.pubmatic.sdk.openwrap.core.nativead;

/* loaded from: classes7.dex */
public enum POBNativeContextSubType {
    GENERAL(10),
    ARTICLE(11),
    VIDEO(12),
    AUDIO(13),
    IMAGE(14),
    USER_GENERATED(15),
    SOCIAL(20),
    EMAIL(21),
    CHAT_IM(22),
    SELLING_PRODUCTS(30),
    MARKETPLACE(31),
    PRODUCT_REVIEW_SITE(32),
    EXCHANGE(500);
    

    /* renamed from: b */
    private final int f70714b;

    POBNativeContextSubType(int i) {
        this.f70714b = i;
    }

    public int getValue() {
        return this.f70714b;
    }
}
