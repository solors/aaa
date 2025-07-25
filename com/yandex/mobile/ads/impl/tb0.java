package com.yandex.mobile.ads.impl;

import com.monetization.ads.exo.metadata.Metadata;
import com.monetization.ads.exo.metadata.id3.CommentFrame;
import com.monetization.ads.exo.metadata.id3.InternalFrame;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public final class tb0 {

    /* renamed from: c */
    private static final Pattern f85572c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f85573a = -1;

    /* renamed from: b */
    public int f85574b = -1;

    /* renamed from: a */
    public final void m29240a(Metadata metadata) {
        for (int i = 0; i < metadata.m44380c(); i++) {
            Metadata.Entry m44383a = metadata.m44383a(i);
            if (m44383a instanceof CommentFrame) {
                CommentFrame commentFrame = (CommentFrame) m44383a;
                if ("iTunSMPB".equals(commentFrame.f66277d) && m29239a(commentFrame.f66278e)) {
                    return;
                }
            } else if (m44383a instanceof InternalFrame) {
                InternalFrame internalFrame = (InternalFrame) m44383a;
                if ("com.apple.iTunes".equals(internalFrame.f66284c) && "iTunSMPB".equals(internalFrame.f66285d) && m29239a(internalFrame.f66286e)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }

    /* renamed from: a */
    private boolean m29239a(String str) {
        Matcher matcher = f85572c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i = y32.f88010a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f85573a = parseInt;
                    this.f85574b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }
}
