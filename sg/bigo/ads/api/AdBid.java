package sg.bigo.ads.api;

import androidx.annotation.Nullable;

/* loaded from: classes10.dex */
public interface AdBid {
    public static final int LOSS_REASON_INTERNAL_ERROR = 1;
    public static final int LOSS_REASON_LOWER_THAN_FLOOR_PRICE = 100;
    public static final int LOSS_REASON_LOWER_THAN_HIGHEST_PRICE = 101;
    public static final int LOSS_REASON_TIMEOUT = 2;

    double getPrice();

    void notifyLoss(@Nullable Double d, @Nullable String str, int i);

    void notifyWin(@Nullable Double d, @Nullable String str);
}
