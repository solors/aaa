package androidx.media3.common.text;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class RubySpan implements LanguageFeatureSpan {
    public final int position;
    public final String rubyText;

    public RubySpan(String str, int i) {
        this.rubyText = str;
        this.position = i;
    }
}
