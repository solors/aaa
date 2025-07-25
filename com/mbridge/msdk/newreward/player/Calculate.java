package com.mbridge.msdk.newreward.player;

/* loaded from: classes6.dex */
public class Calculate {
    private int mValue;

    public int addOne() {
        int i = this.mValue + 1;
        this.mValue = i;
        return i;
    }

    public int reduceOne() {
        int i = this.mValue - 1;
        this.mValue = i;
        return i;
    }
}
