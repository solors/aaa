package com.unity3d.services.core.device;

import android.util.SparseArray;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VolumeChangeMonitor.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VolumeChangeMonitor {
    @NotNull
    private final IEventSender eventSender;
    @NotNull
    private final VolumeChange volumeChange;
    @NotNull
    private final SparseArray<VolumeChangeListener> volumeChangeListeners;

    public VolumeChangeMonitor(@NotNull IEventSender eventSender, @NotNull VolumeChange volumeChange) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        Intrinsics.checkNotNullParameter(volumeChange, "volumeChange");
        this.eventSender = eventSender;
        this.volumeChange = volumeChange;
        this.volumeChangeListeners = new SparseArray<>();
    }

    public final void registerVolumeChangeListener(final int i) {
        if (this.volumeChangeListeners.get(i) == null) {
            VolumeChangeListener volumeChangeListener = new VolumeChangeListener() { // from class: com.unity3d.services.core.device.VolumeChangeMonitor$registerVolumeChangeListener$listener$1
                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public int getStreamType() {
                    return i;
                }

                @Override // com.unity3d.services.core.device.VolumeChangeListener
                public void onVolumeChanged(int i2) {
                    IEventSender iEventSender;
                    iEventSender = VolumeChangeMonitor.this.eventSender;
                    iEventSender.sendEvent(WebViewEventCategory.DEVICEINFO, DeviceInfoEvent.VOLUME_CHANGED, Integer.valueOf(getStreamType()), Integer.valueOf(i2), Integer.valueOf(Device.getStreamMaxVolume(i)));
                }
            };
            this.volumeChangeListeners.append(i, volumeChangeListener);
            this.volumeChange.registerListener(volumeChangeListener);
        }
    }

    public final void unregisterVolumeChangeListener(int i) {
        if (this.volumeChangeListeners.get(i) != null) {
            VolumeChangeListener listener = this.volumeChangeListeners.get(i);
            VolumeChange volumeChange = this.volumeChange;
            Intrinsics.checkNotNullExpressionValue(listener, "listener");
            volumeChange.unregisterListener(listener);
            this.volumeChangeListeners.remove(i);
        }
    }
}
