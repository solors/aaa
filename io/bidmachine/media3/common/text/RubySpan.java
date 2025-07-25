package io.bidmachine.media3.common.text;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public final class RubySpan implements LanguageFeatureSpan {
    public final int position;
    public final String rubyText;

    public RubySpan(String str, int i) {
        this.rubyText = str;
        this.position = i;
    }
}
