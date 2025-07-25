package com.smaato.sdk.video.utils;

import androidx.annotation.NonNull;
import java.util.Random;

/* loaded from: classes7.dex */
public class RandomUtils {
    private final Random random = new Random();

    @NonNull
    public String random8DigitNumber() {
        return String.valueOf(randomNumberBetweenMinAndMax(10000000, 99999999));
    }

    public int randomNumberBetweenMinAndMax(int i, int i2) throws IllegalArgumentException {
        return this.random.nextInt((i2 - i) + 1) + i;
    }
}
