package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import androidx.core.view.ViewCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.AbstractC15006o;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C14993b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C15001j;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C15010s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.mediationsdk.IronSourceSegment;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.n */
/* loaded from: classes4.dex */
public abstract class AbstractC14903n {

    /* renamed from: a */
    public static final int f28856a = AbstractC15133z.m77158a("nam");

    /* renamed from: b */
    public static final int f28857b = AbstractC15133z.m77158a("trk");

    /* renamed from: c */
    public static final int f28858c = AbstractC15133z.m77158a("cmt");

    /* renamed from: d */
    public static final int f28859d = AbstractC15133z.m77158a("day");

    /* renamed from: e */
    public static final int f28860e = AbstractC15133z.m77158a("ART");

    /* renamed from: f */
    public static final int f28861f = AbstractC15133z.m77158a("too");

    /* renamed from: g */
    public static final int f28862g = AbstractC15133z.m77158a("alb");

    /* renamed from: h */
    public static final int f28863h = AbstractC15133z.m77158a("com");

    /* renamed from: i */
    public static final int f28864i = AbstractC15133z.m77158a("wrt");

    /* renamed from: j */
    public static final int f28865j = AbstractC15133z.m77158a("lyr");

    /* renamed from: k */
    public static final int f28866k = AbstractC15133z.m77158a(IronSourceSegment.GENDER);

    /* renamed from: l */
    public static final int f28867l = AbstractC15133z.m77158a("covr");

    /* renamed from: m */
    public static final int f28868m = AbstractC15133z.m77158a("gnre");

    /* renamed from: n */
    public static final int f28869n = AbstractC15133z.m77158a("grp");

    /* renamed from: o */
    public static final int f28870o = AbstractC15133z.m77158a("disk");

    /* renamed from: p */
    public static final int f28871p = AbstractC15133z.m77158a("trkn");

    /* renamed from: q */
    public static final int f28872q = AbstractC15133z.m77158a("tmpo");

    /* renamed from: r */
    public static final int f28873r = AbstractC15133z.m77158a("cpil");

    /* renamed from: s */
    public static final int f28874s = AbstractC15133z.m77158a("aART");

    /* renamed from: t */
    public static final int f28875t = AbstractC15133z.m77158a("sonm");

    /* renamed from: u */
    public static final int f28876u = AbstractC15133z.m77158a("soal");

    /* renamed from: v */
    public static final int f28877v = AbstractC15133z.m77158a("soar");

    /* renamed from: w */
    public static final int f28878w = AbstractC15133z.m77158a("soaa");

    /* renamed from: x */
    public static final int f28879x = AbstractC15133z.m77158a("soco");

    /* renamed from: y */
    public static final int f28880y = AbstractC15133z.m77158a("rtng");

    /* renamed from: z */
    public static final int f28881z = AbstractC15133z.m77158a("pgap");

    /* renamed from: A */
    public static final int f28852A = AbstractC15133z.m77158a("sosn");

    /* renamed from: B */
    public static final int f28853B = AbstractC15133z.m77158a("tvsh");

    /* renamed from: C */
    public static final int f28854C = AbstractC15133z.m77158a("----");

    /* renamed from: D */
    public static final String[] f28855D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    public static AbstractC15006o m77447a(int i, String str, C15121n c15121n, boolean z, boolean z2) {
        int i2;
        c15121n.m77197e(c15121n.f29805b + 4);
        if (c15121n.m77204b() == AbstractC14892c.f28700F0) {
            c15121n.m77197e(c15121n.f29805b + 8);
            i2 = c15121n.m77192j();
        } else {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            if (z) {
                return new C15010s(str, null, Integer.toString(i2));
            }
            return new C15001j("und", str, Integer.toString(i2));
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC14892c.m77462a(i));
        return null;
    }

    /* renamed from: b */
    public static C15001j m77445b(int i, C15121n c15121n) {
        String str = null;
        String str2 = null;
        int i2 = -1;
        int i3 = -1;
        while (true) {
            int i4 = c15121n.f29805b;
            if (i4 >= i) {
                break;
            }
            int m77204b = c15121n.m77204b();
            int m77204b2 = c15121n.m77204b();
            c15121n.m77197e(c15121n.f29805b + 4);
            if (m77204b2 == AbstractC14892c.f28696D0) {
                str = c15121n.m77206a(m77204b - 12);
            } else if (m77204b2 == AbstractC14892c.f28698E0) {
                str2 = c15121n.m77206a(m77204b - 12);
            } else {
                if (m77204b2 == AbstractC14892c.f28700F0) {
                    i2 = i4;
                    i3 = m77204b;
                }
                c15121n.m77197e(c15121n.f29805b + (m77204b - 12));
            }
        }
        if ("com.apple.iTunes".equals(str) && "iTunSMPB".equals(str2) && i2 != -1) {
            c15121n.m77197e(i2);
            c15121n.m77197e(c15121n.f29805b + 16);
            return new C15001j("und", str2, c15121n.m77206a(i3 - 16));
        }
        return null;
    }

    /* renamed from: a */
    public static C15001j m77449a(int i, C15121n c15121n) {
        int m77204b = c15121n.m77204b();
        if (c15121n.m77204b() == AbstractC14892c.f28700F0) {
            c15121n.m77197e(c15121n.f29805b + 8);
            String m77206a = c15121n.m77206a(m77204b - 16);
            return new C15001j("und", m77206a, m77206a);
        }
        Log.w("MetadataUtil", "Failed to parse comment attribute: " + AbstractC14892c.m77462a(i));
        return null;
    }

    /* renamed from: b */
    public static C15010s m77444b(int i, C15121n c15121n, String str) {
        int m77204b = c15121n.m77204b();
        if (c15121n.m77204b() == AbstractC14892c.f28700F0) {
            c15121n.m77197e(c15121n.f29805b + 8);
            return new C15010s(str, null, c15121n.m77206a(m77204b - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: " + AbstractC14892c.m77462a(i));
        return null;
    }

    /* renamed from: a */
    public static C15010s m77448a(int i, C15121n c15121n, String str) {
        int m77204b = c15121n.m77204b();
        if (c15121n.m77204b() == AbstractC14892c.f28700F0 && m77204b >= 22) {
            c15121n.m77197e(c15121n.f29805b + 10);
            int m77187o = c15121n.m77187o();
            if (m77187o > 0) {
                String m77354a = AbstractC14979m.m77354a("", m77187o);
                int m77187o2 = c15121n.m77187o();
                if (m77187o2 > 0) {
                    m77354a = m77354a + RemoteSettings.FORWARD_SLASH_STRING + m77187o2;
                }
                return new C15010s(str, null, m77354a);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC14892c.m77462a(i));
        return null;
    }

    /* renamed from: a */
    public static C14993b m77446a(C15121n c15121n) {
        int m77204b = c15121n.m77204b();
        if (c15121n.m77204b() == AbstractC14892c.f28700F0) {
            int m77204b2 = c15121n.m77204b() & ViewCompat.MEASURED_SIZE_MASK;
            String str = m77204b2 == 13 ? "image/jpeg" : m77204b2 == 14 ? "image/png" : null;
            if (str == null) {
                Log.w("MetadataUtil", "Unrecognized cover art flags: " + m77204b2);
                return null;
            }
            c15121n.m77197e(c15121n.f29805b + 4);
            int i = m77204b - 16;
            byte[] bArr = new byte[i];
            c15121n.m77205a(bArr, 0, i);
            return new C14993b(str, null, 3, bArr);
        }
        Log.w("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }
}
