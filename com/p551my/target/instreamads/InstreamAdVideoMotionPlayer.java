package com.p551my.target.instreamads;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.instreamads.InstreamAd;

/* renamed from: com.my.target.instreamads.InstreamAdVideoMotionPlayer */
/* loaded from: classes7.dex */
public interface InstreamAdVideoMotionPlayer {

    /* renamed from: com.my.target.instreamads.InstreamAdVideoMotionPlayer$VideoMotionPlayerListener */
    /* loaded from: classes7.dex */
    public interface VideoMotionPlayerListener {
        void onBannerComplete(@NonNull Context context);

        void onBannerShow(@NonNull Context context);

        void onCloseByUser(@NonNull Context context);

        void onError(@NonNull String str, @NonNull Context context);

        void onHeaderClick(@NonNull Context context);

        void onItemClick(@NonNull String str, @NonNull Context context);

        void onItemShow(@NonNull String str, @NonNull Context context);
    }

    void playVideoMotionBanner(@NonNull InstreamAd.InstreamAdVideoMotionBanner instreamAdVideoMotionBanner);

    void setVideoMotionPlayerListener(@Nullable VideoMotionPlayerListener videoMotionPlayerListener);
}
