package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14821b;
import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C15019A;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15091j;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15066C;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.g */
/* loaded from: classes4.dex */
public final class C14868g implements InterfaceC15066C {

    /* renamed from: a */
    public static final Pattern f28497a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: b */
    public static final Pattern f28498b = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: c */
    public static final Pattern f28499c = Pattern.compile("CODECS=\"(.+?)\"");

    /* renamed from: d */
    public static final Pattern f28500d = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: e */
    public static final Pattern f28501e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: f */
    public static final Pattern f28502f = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: g */
    public static final Pattern f28503g = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: h */
    public static final Pattern f28504h = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: i */
    public static final Pattern f28505i = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: j */
    public static final Pattern f28506j = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: k */
    public static final Pattern f28507k = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: l */
    public static final Pattern f28508l = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: m */
    public static final Pattern f28509m = Pattern.compile("METHOD=(NONE|AES-128)");

    /* renamed from: n */
    public static final Pattern f28510n = Pattern.compile("URI=\"(.+?)\"");

    /* renamed from: o */
    public static final Pattern f28511o = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: p */
    public static final Pattern f28512p = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: q */
    public static final Pattern f28513q = Pattern.compile("LANGUAGE=\"(.+?)\"");

    /* renamed from: r */
    public static final Pattern f28514r = Pattern.compile("NAME=\"(.+?)\"");

    /* renamed from: s */
    public static final Pattern f28515s = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: t */
    public static final Pattern f28516t = Pattern.compile("AUTOSELECT".concat("=(NO|YES)"));

    /* renamed from: u */
    public static final Pattern f28517u = Pattern.compile("DEFAULT".concat("=(NO|YES)"));

    /* renamed from: v */
    public static final Pattern f28518v = Pattern.compile("FORCED".concat("=(NO|YES)"));

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static C14865d m77483b(C14867f c14867f, String str) {
        String str2;
        int i;
        String hexString;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        String str3 = null;
        long j = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        int i9 = 0;
        boolean z2 = false;
        int i10 = 1;
        C14864c c14864c = null;
        String str4 = null;
        String str5 = null;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = -9223372036854775807L;
        long j7 = -9223372036854775807L;
        while (true) {
            long j8 = -1;
            while (c14867f.m77487a()) {
                if (c14867f.m77487a()) {
                    str2 = c14867f.f28496c;
                    c14867f.f28496c = str3;
                } else {
                    str2 = str3;
                }
                if (str2.startsWith("#EXT-X-PLAYLIST-TYPE")) {
                    String m77482b = m77482b(str2, f28503g);
                    if ("VOD".equals(m77482b)) {
                        i4 = i3;
                    } else if ("EVENT".equals(m77482b)) {
                        i4 = 2;
                    }
                    str3 = null;
                } else {
                    if (str2.startsWith("#EXT-X-START")) {
                        j6 = (long) (Double.parseDouble(m77482b(str2, f28506j)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-MAP")) {
                        String m77482b2 = m77482b(str2, f28510n);
                        String m77484a = m77484a(str2, f28508l);
                        if (m77484a != null) {
                            String[] split = m77484a.split("@");
                            j8 = Long.parseLong(split[i2]);
                            if (split.length > i3) {
                                j3 = Long.parseLong(split[i3]);
                            }
                        }
                        c14864c = new C14864c(m77482b2, 0L, -1, -9223372036854775807L, false, null, null, j3, j8);
                        j3 = j;
                        str3 = null;
                    } else if (str2.startsWith("#EXT-X-TARGETDURATION")) {
                        j7 = Integer.parseInt(m77482b(str2, f28501e)) * 1000000;
                    } else if (str2.startsWith("#EXT-X-MEDIA-SEQUENCE")) {
                        i8 = Integer.parseInt(m77482b(str2, f28504h));
                        i7 = i8;
                    } else if (str2.startsWith("#EXT-X-VERSION")) {
                        i10 = Integer.parseInt(m77482b(str2, f28502f));
                    } else if (str2.startsWith("#EXTINF")) {
                        j5 = (long) (Double.parseDouble(m77482b(str2, f28505i)) * 1000000.0d);
                    } else if (str2.startsWith("#EXT-X-KEY")) {
                        z2 = "AES-128".equals(m77482b(str2, f28509m));
                        if (z2) {
                            str5 = m77482b(str2, f28510n);
                            str4 = m77484a(str2, f28511o);
                        } else {
                            str3 = null;
                            str4 = null;
                            str5 = null;
                        }
                    } else if (str2.startsWith("#EXT-X-BYTERANGE")) {
                        String[] split2 = m77482b(str2, f28507k).split("@");
                        j8 = Long.parseLong(split2[i2]);
                        if (split2.length > i3) {
                            j3 = Long.parseLong(split2[i3]);
                        }
                    } else if (str2.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE")) {
                        i6 = Integer.parseInt(str2.substring(str2.indexOf(58) + i3));
                        i5 = i3;
                    } else if (str2.equals("#EXT-X-DISCONTINUITY")) {
                        i9++;
                    } else if (str2.startsWith("#EXT-X-PROGRAM-DATE-TIME")) {
                        if (j2 == j) {
                            String substring = str2.substring(str2.indexOf(58) + i3);
                            Matcher matcher = AbstractC15133z.f29837f.matcher(substring);
                            if (matcher.matches()) {
                                if (matcher.group(9) == null || matcher.group(9).equalsIgnoreCase("Z")) {
                                    i = i2;
                                } else {
                                    i = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
                                    if (matcher.group(11).equals("-")) {
                                        i *= -1;
                                    }
                                }
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                                gregorianCalendar.clear();
                                gregorianCalendar.set(Integer.parseInt(matcher.group(i3)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
                                if (!TextUtils.isEmpty(matcher.group(8))) {
                                    gregorianCalendar.set(14, new BigDecimal("0." + matcher.group(8)).movePointRight(3).intValue());
                                }
                                long timeInMillis = gregorianCalendar.getTimeInMillis();
                                if (i != 0) {
                                    timeInMillis -= i * 60000;
                                }
                                int i11 = AbstractC14821b.f28247a;
                                j2 = (timeInMillis == -9223372036854775807L ? -9223372036854775807L : timeInMillis * 1000) - j4;
                            } else {
                                throw new C15017r("Invalid date/time format: " + substring);
                            }
                        }
                    } else if (str2.startsWith("#EXT-X-DATERANGE")) {
                        arrayList2.add(str2);
                    } else if (!str2.startsWith("#")) {
                        if (z2) {
                            hexString = str4 != null ? str4 : Integer.toHexString(i8);
                        } else {
                            hexString = null;
                        }
                        int i12 = i8 + 1;
                        int i13 = (j8 > (-1L) ? 1 : (j8 == (-1L) ? 0 : -1));
                        if (i13 == 0) {
                            j3 = 0;
                        }
                        arrayList.add(new C14864c(str2, j5, i9, j4, z2, str5, hexString, j3, j8));
                        j4 += j5;
                        if (i13 != 0) {
                            j3 += j8;
                        }
                        i8 = i12;
                        j8 = -1;
                        i2 = 0;
                        i3 = 1;
                        str3 = null;
                        j = 0;
                        j5 = 0;
                    } else if (str2.equals("#EXT-X-ENDLIST")) {
                        i2 = 0;
                        i3 = 1;
                        str3 = null;
                        j = 0;
                        z = true;
                    }
                    str3 = null;
                }
                i2 = 0;
                i3 = 1;
                str3 = null;
                j = 0;
            }
            return new C14865d(i4, str, j6, j2, i5, i6, i7, i10, j7, z, j2 != 0, c14864c, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public final AbstractC14866e m77486a(Uri uri, C15091j c15091j) {
        String trim;
        AbstractC14866e m77485a;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(c15091j));
        LinkedList linkedList = new LinkedList();
        try {
            int read = bufferedReader.read();
            if (read == 239) {
                if (bufferedReader.read() == 187 && bufferedReader.read() == 191) {
                    read = bufferedReader.read();
                }
                throw new C15019A("Input does not start with the #EXTM3U header.");
            }
            while (read != -1 && Character.isWhitespace(read)) {
                read = bufferedReader.read();
            }
            int i = 0;
            while (true) {
                if (i < 7) {
                    if (read != "#EXTM3U".charAt(i)) {
                        break;
                    }
                    read = bufferedReader.read();
                    i++;
                } else {
                    while (read != -1 && Character.isWhitespace(read)) {
                        int i2 = AbstractC15133z.f29832a;
                        if (read == 10 || read == 13) {
                            break;
                        }
                        read = bufferedReader.read();
                    }
                    int i3 = AbstractC15133z.f29832a;
                    if (read != 10) {
                        if (read == 13) {
                        }
                    }
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine != null) {
                            trim = readLine.trim();
                            if (!trim.isEmpty()) {
                                if (trim.startsWith("#EXT-X-STREAM-INF")) {
                                    linkedList.add(trim);
                                    m77485a = m77485a(new C14867f(linkedList, bufferedReader), uri.toString());
                                    break;
                                } else if (trim.startsWith("#EXT-X-TARGETDURATION") || trim.startsWith("#EXT-X-MEDIA-SEQUENCE") || trim.startsWith("#EXTINF") || trim.startsWith("#EXT-X-KEY") || trim.startsWith("#EXT-X-BYTERANGE") || trim.equals("#EXT-X-DISCONTINUITY") || trim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") || trim.equals("#EXT-X-ENDLIST")) {
                                    break;
                                } else {
                                    linkedList.add(trim);
                                }
                            }
                        } else {
                            AbstractC15133z.m77160a(bufferedReader);
                            throw new C15017r("Failed to parse the playlist, could not identify any tags.");
                        }
                    }
                    linkedList.add(trim);
                    m77485a = m77483b(new C14867f(linkedList, bufferedReader), uri.toString());
                    return m77485a;
                }
            }
        } finally {
            AbstractC15133z.m77160a(bufferedReader);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x022d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x001b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C14863b m77485a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C14867f r45, java.lang.String r46) {
        /*
            Method dump skipped, instructions count: 670
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.C14868g.m77485a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.f, java.lang.String):com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.b");
    }

    /* renamed from: b */
    public static String m77482b(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            return matcher.group(1);
        }
        throw new C15017r("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* renamed from: a */
    public static String m77484a(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
}
