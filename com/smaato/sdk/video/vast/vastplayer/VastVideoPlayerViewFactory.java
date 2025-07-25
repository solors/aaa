package com.smaato.sdk.video.vast.vastplayer;

import android.content.Context;
import androidx.annotation.NonNull;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.widget.VastVideoAdPlayerView;
import java.util.List;

/* loaded from: classes7.dex */
public class VastVideoPlayerViewFactory {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public VastVideoAdPlayerView getVastVideoPlayerView(@NonNull Context context, @NonNull List<Verification> list) {
        return new VastVideoAdPlayerView(context, list);
    }
}
