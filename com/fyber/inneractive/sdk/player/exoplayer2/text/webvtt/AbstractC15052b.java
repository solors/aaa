package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt.b */
/* loaded from: classes4.dex */
public abstract class AbstractC15052b {

    /* renamed from: a */
    public static final Pattern f29593a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* renamed from: b */
    public static final Pattern f29594b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    /* renamed from: a */
    public static long m77275a(String str) {
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : split[0].split(":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(split[1]) + (j * 1000)) * 1000;
    }
}
