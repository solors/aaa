package com.smaato.sdk.richmedia.mraid.dataprovider;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Iterables;
import com.smaato.sdk.core.util.notifier.ChangeNotifier;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.dataprovider.AudioVolumeObserver;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes7.dex */
public class AudioVolumeObserver {
    @NonNull
    private final AudioVolumeContentObserver audioVolumeContentObserver;
    @NonNull
    private final Set<Listener> listeners = Collections.newSetFromMap(new WeakHashMap());
    private final int maxVolume;

    /* loaded from: classes7.dex */
    public interface Listener {
        void onVolumeChange(int i, int i2);
    }

    public AudioVolumeObserver(@NonNull AudioVolumeContentObserver audioVolumeContentObserver, int i) {
        this.audioVolumeContentObserver = (AudioVolumeContentObserver) Objects.requireNonNull(audioVolumeContentObserver);
        audioVolumeContentObserver.getChangeSender().addListener(new ChangeNotifier.Listener() { // from class: com.smaato.sdk.richmedia.mraid.dataprovider.a
            @Override // com.smaato.sdk.core.util.notifier.ChangeNotifier.Listener
            public final void onNextValue(Object obj) {
                AudioVolumeObserver.m39088a(AudioVolumeObserver.this, ((Integer) obj).intValue());
            }
        });
        this.maxVolume = i;
    }

    /* renamed from: a */
    public static /* synthetic */ void m39088a(AudioVolumeObserver audioVolumeObserver, int i) {
        audioVolumeObserver.notifyListeners(i);
    }

    /* renamed from: b */
    public static /* synthetic */ void m39087b(AudioVolumeObserver audioVolumeObserver, int i, Listener listener) {
        audioVolumeObserver.lambda$notifyListeners$0(i, listener);
    }

    public /* synthetic */ void lambda$notifyListeners$0(int i, Listener listener) {
        listener.onVolumeChange(i, this.maxVolume);
    }

    public synchronized void notifyListeners(final int i) {
        Iterables.forEach(new HashSet(this.listeners), new Consumer() { // from class: com.smaato.sdk.richmedia.mraid.dataprovider.b
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                AudioVolumeObserver.m39087b(AudioVolumeObserver.this, i, (AudioVolumeObserver.Listener) obj);
            }
        });
    }

    public synchronized void register(@NonNull Listener listener) {
        Objects.requireNonNull(listener);
        this.listeners.add(listener);
        if (!this.listeners.isEmpty() && !this.audioVolumeContentObserver.isRegistered()) {
            this.audioVolumeContentObserver.register();
        }
    }

    public synchronized void unregister(@Nullable Listener listener) {
        this.listeners.remove(listener);
        if (this.listeners.isEmpty() && this.audioVolumeContentObserver.isRegistered()) {
            this.audioVolumeContentObserver.unregister();
        }
    }
}
