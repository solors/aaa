package io.bidmachine.media3.exoplayer.dash.manifest;

import com.google.firebase.sessions.settings.RemoteSettings;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.metadata.emsg.EventMessage;

@UnstableApi
/* loaded from: classes9.dex */
public final class EventStream {
    public final EventMessage[] events;
    public final long[] presentationTimesUs;
    public final String schemeIdUri;
    public final long timescale;
    public final String value;

    public EventStream(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        this.schemeIdUri = str;
        this.value = str2;
        this.timescale = j;
        this.presentationTimesUs = jArr;
        this.events = eventMessageArr;
    }

    /* renamed from: id */
    public String m19764id() {
        return this.schemeIdUri + RemoteSettings.FORWARD_SLASH_STRING + this.value;
    }
}
