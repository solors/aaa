package com.smaato.sdk.richmedia.mraid.dataprovider;

import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.provider.Settings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.notifier.ChangeSender;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class AudioVolumeContentObserver extends ContentObserver {
    @NonNull
    private final ChangeSender<Integer> changeSender;
    @NonNull
    private final Context context;
    @NonNull
    private final AtomicBoolean isRegistered;
    @NonNull
    private final MusicPlaybackVolume musicPlaybackVolume;

    public AudioVolumeContentObserver(@NonNull Context context, @NonNull MusicPlaybackVolume musicPlaybackVolume, @NonNull ChangeSender<Integer> changeSender) {
        super(Threads.newUiHandler());
        this.isRegistered = new AtomicBoolean();
        this.context = (Context) Objects.requireNonNull(context);
        this.musicPlaybackVolume = (MusicPlaybackVolume) Objects.requireNonNull(musicPlaybackVolume);
        this.changeSender = (ChangeSender) Objects.requireNonNull(changeSender);
    }

    @NonNull
    public ChangeSender<Integer> getChangeSender() {
        return this.changeSender;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isRegistered() {
        return this.isRegistered.get();
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, @Nullable Uri uri) {
        if (uri != null && uri.equals(this.musicPlaybackVolume.getUri())) {
            this.changeSender.newValue(Integer.valueOf(this.musicPlaybackVolume.getCurrentVolume()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void register() {
        if (this.isRegistered.compareAndSet(false, true)) {
            this.context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void unregister() {
        if (this.isRegistered.compareAndSet(true, false)) {
            this.context.getContentResolver().unregisterContentObserver(this);
        }
    }
}
