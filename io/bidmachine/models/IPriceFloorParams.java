package io.bidmachine.models;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public interface IPriceFloorParams<SelfType> {
    SelfType addPriceFloor(double d);

    SelfType addPriceFloor(@NonNull String str, double d);
}
