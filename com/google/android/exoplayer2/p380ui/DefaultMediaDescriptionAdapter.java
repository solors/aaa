package com.google.android.exoplayer2.p380ui;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.p380ui.PlayerNotificationManager;

/* renamed from: com.google.android.exoplayer2.ui.DefaultMediaDescriptionAdapter */
/* loaded from: classes4.dex */
public final class DefaultMediaDescriptionAdapter implements PlayerNotificationManager.MediaDescriptionAdapter {
    @Nullable

    /* renamed from: a */
    private final PendingIntent f35249a;

    public DefaultMediaDescriptionAdapter(@Nullable PendingIntent pendingIntent) {
        this.f35249a = pendingIntent;
    }

    @Override // com.google.android.exoplayer2.p380ui.PlayerNotificationManager.MediaDescriptionAdapter
    @Nullable
    public PendingIntent createCurrentContentIntent(Player player) {
        return this.f35249a;
    }

    @Override // com.google.android.exoplayer2.p380ui.PlayerNotificationManager.MediaDescriptionAdapter
    @Nullable
    public CharSequence getCurrentContentText(Player player) {
        CharSequence charSequence = player.getMediaMetadata().artist;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        return player.getMediaMetadata().albumArtist;
    }

    @Override // com.google.android.exoplayer2.p380ui.PlayerNotificationManager.MediaDescriptionAdapter
    public CharSequence getCurrentContentTitle(Player player) {
        CharSequence charSequence = player.getMediaMetadata().displayTitle;
        if (!TextUtils.isEmpty(charSequence)) {
            return charSequence;
        }
        CharSequence charSequence2 = player.getMediaMetadata().title;
        if (charSequence2 == null) {
            return "";
        }
        return charSequence2;
    }

    @Override // com.google.android.exoplayer2.p380ui.PlayerNotificationManager.MediaDescriptionAdapter
    @Nullable
    public Bitmap getCurrentLargeIcon(Player player, PlayerNotificationManager.BitmapCallback bitmapCallback) {
        byte[] bArr = player.getMediaMetadata().artworkData;
        if (bArr == null) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
    }
}
