package net.pubnative.lite.sdk.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import net.pubnative.lite.sdk.vpaid.volume.VolumeObserver;

/* loaded from: classes10.dex */
public class VolumeChangedActionReceiver extends BroadcastReceiver {
    protected void notifyVolumeChange() {
        VolumeObserver.getInstance().notifyObservers();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
            notifyVolumeChange();
        }
    }
}
