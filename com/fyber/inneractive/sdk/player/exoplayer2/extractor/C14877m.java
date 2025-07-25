package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C14991b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC15006o;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C15001j;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.m */
/* loaded from: classes4.dex */
public final class C14877m {

    /* renamed from: c */
    public static final Pattern f28543c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f28544a = -1;

    /* renamed from: b */
    public int f28545b = -1;

    /* renamed from: a */
    public final void m77476a(C14991b c14991b) {
        int i = 0;
        while (true) {
            AbstractC15006o[] abstractC15006oArr = c14991b.f29414a;
            if (i < abstractC15006oArr.length) {
                AbstractC15006o abstractC15006o = abstractC15006oArr[i];
                if (abstractC15006o instanceof C15001j) {
                    C15001j c15001j = (C15001j) abstractC15006o;
                    String str = c15001j.f29432c;
                    String str2 = c15001j.f29433d;
                    if ("iTunSMPB".equals(str)) {
                        Matcher matcher = f28543c.matcher(str2);
                        if (matcher.find()) {
                            try {
                                int parseInt = Integer.parseInt(matcher.group(1), 16);
                                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                                if (parseInt > 0 || parseInt2 > 0) {
                                    this.f28544a = parseInt;
                                    this.f28545b = parseInt2;
                                    return;
                                }
                            } catch (NumberFormatException unused) {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }
}
