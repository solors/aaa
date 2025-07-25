package com.smaato.sdk.video.vast.vastplayer;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.linkhandler.C27154c;
import com.smaato.sdk.core.linkhandler.LinkHandler;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.video.vast.model.VastBeacon;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.smaato.sdk.video.vast.vastplayer.c */
/* loaded from: classes7.dex */
public class ComponentClickHandler {
    @Nullable

    /* renamed from: a */
    private final VideoClicks f72896a;
    @NonNull

    /* renamed from: b */
    private final LinkHandler f72897b;
    @NonNull

    /* renamed from: c */
    private final Logger f72898c;
    @NonNull

    /* renamed from: d */
    private final AtomicReference<Boolean> f72899d = new AtomicReference<>(Boolean.FALSE);

    public ComponentClickHandler(@NonNull Logger logger, @NonNull LinkHandler linkHandler, @Nullable VideoClicks videoClicks) {
        this.f72897b = (LinkHandler) Objects.requireNonNull(linkHandler);
        this.f72898c = (Logger) Objects.requireNonNull(logger);
        this.f72896a = videoClicks;
    }

    /* renamed from: d */
    public /* synthetic */ void m38552d(Runnable runnable) {
        this.f72899d.set(Boolean.FALSE);
        runnable.run();
    }

    /* renamed from: e */
    public /* synthetic */ void m38551e(Runnable runnable, String str) {
        this.f72899d.set(Boolean.FALSE);
        Objects.onNotNull(runnable, new C27154c());
        Logger logger = this.f72898c;
        LogDomain logDomain = LogDomain.VAST;
        logger.error(logDomain, "Seems to be an invalid URL: " + str, new Object[0]);
    }

    /* renamed from: c */
    public void m38553c(@Nullable final String str, @NonNull final Runnable runnable, @Nullable final Runnable runnable2) {
        VastBeacon vastBeacon;
        if (TextUtils.isEmpty(str)) {
            VideoClicks videoClicks = this.f72896a;
            if (videoClicks == null) {
                vastBeacon = null;
            } else {
                vastBeacon = videoClicks.clickThrough;
            }
            if (vastBeacon == null) {
                str = null;
            } else {
                str = vastBeacon.uri;
            }
        }
        if (!this.f72899d.get().booleanValue()) {
            this.f72899d.set(Boolean.TRUE);
            this.f72897b.lambda$handleUrlOnBackGround$2(str, new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.a
                {
                    ComponentClickHandler.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ComponentClickHandler.this.m38552d(runnable);
                }
            }, new Runnable() { // from class: com.smaato.sdk.video.vast.vastplayer.b
                {
                    ComponentClickHandler.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    ComponentClickHandler.this.m38551e(runnable2, str);
                }
            });
            return;
        }
        Objects.onNotNull(runnable2, new C27154c());
    }
}
