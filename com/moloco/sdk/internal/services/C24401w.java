package com.moloco.sdk.internal.services;

import android.content.Context;
import android.media.AudioManager;
import androidx.core.content.ContextCompat;
import com.moloco.sdk.internal.MolocoLogger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.w */
/* loaded from: classes7.dex */
public final class C24401w implements InterfaceC24400v {
    @Nullable

    /* renamed from: a */
    public final AudioManager f63137a;

    public C24401w(@NotNull Context context) {
        AudioManager audioManager;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            audioManager = (AudioManager) ContextCompat.getSystemService(context.getApplicationContext(), AudioManager.class);
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "AudioService", "couldn't get android.media.AudioManager service", e, false, 8, null);
            audioManager = null;
        }
        this.f63137a = audioManager;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24400v
    @NotNull
    /* renamed from: a */
    public EnumC24330e0 mo46495a() {
        Integer num;
        AudioManager audioManager = this.f63137a;
        if (audioManager != null) {
            num = Integer.valueOf(audioManager.getRingerMode());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            return EnumC24330e0.SILENT;
        }
        if (num != null && num.intValue() == 1) {
            return EnumC24330e0.VIBRATE;
        }
        if (num != null && num.intValue() == 2) {
            return EnumC24330e0.NORMAL;
        }
        return EnumC24330e0.NORMAL;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24400v
    /* renamed from: b */
    public int mo46494b() {
        AudioManager audioManager = this.f63137a;
        if (audioManager != null) {
            return audioManager.getStreamVolume(3);
        }
        return 0;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC24400v
    /* renamed from: c */
    public boolean mo46493c() {
        AudioManager audioManager = this.f63137a;
        if (audioManager == null) {
            return true;
        }
        return audioManager.isStreamMute(3);
    }
}
