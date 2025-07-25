package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.p389d.C17955e;

/* loaded from: classes6.dex */
public final class VastProperties {

    /* renamed from: a */
    private final boolean f45184a;

    /* renamed from: b */
    private final Float f45185b;

    /* renamed from: c */
    private final boolean f45186c;

    /* renamed from: d */
    private final Position f45187d;

    /* renamed from: e */
    private com.iab.omid.library.bigosg.adsession.media.VastProperties f45188e;

    private VastProperties(boolean z, Float f, boolean z2, Position position, com.iab.omid.library.bigosg.adsession.media.VastProperties vastProperties) {
        this.f45184a = z;
        this.f45185b = f;
        this.f45186c = z2;
        this.f45187d = position;
        this.f45188e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z, Position position) {
        C17955e.m64570a(position, "Position is null");
        return new VastProperties(false, null, z, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f, boolean z, Position position) {
        C17955e.m64570a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f), z, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f, z, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final com.iab.omid.library.bigosg.adsession.media.VastProperties m64666a() {
        return this.f45188e;
    }

    public final Position getPosition() {
        return this.f45187d;
    }

    public final Float getSkipOffset() {
        return this.f45185b;
    }

    public final boolean isAutoPlay() {
        return this.f45186c;
    }

    public final boolean isSkippable() {
        return this.f45184a;
    }
}
