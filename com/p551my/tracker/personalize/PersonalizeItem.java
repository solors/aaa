package com.p551my.tracker.personalize;

/* renamed from: com.my.tracker.personalize.PersonalizeItem */
/* loaded from: classes7.dex */
public final class PersonalizeItem {
    public final double discountPrice;
    public final int discountValue;
    public final String payload;
    public final double price;
    public final String sku;
    public final int value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PersonalizeItem(String str, String str2, double d, double d2, int i, int i2) {
        this.sku = str;
        this.payload = str2;
        this.price = d;
        this.discountPrice = d2;
        this.value = i;
        this.discountValue = i2;
    }
}
