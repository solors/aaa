package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.monetization.ads.exo.metadata.id3.ApicFrame;
import com.monetization.ads.exo.metadata.id3.CommentFrame;
import com.monetization.ads.exo.metadata.id3.Id3Frame;
import com.monetization.ads.exo.metadata.id3.TextInformationFrame;

/* loaded from: classes8.dex */
final class ix0 {
    @VisibleForTesting

    /* renamed from: a */
    static final String[] f80665a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    @Nullable
    /* renamed from: a */
    private static CommentFrame m33108a(int i, cc1 cc1Var) {
        int m35282h = cc1Var.m35282h();
        if (cc1Var.m35282h() == 1684108385) {
            cc1Var.m35284f(8);
            String m35292b = cc1Var.m35292b(m35282h - 16);
            return new CommentFrame("und", m35292b, m35292b);
        }
        gq0.m33792d("MetadataUtil", "Failed to parse comment attribute: " + AbstractC31125pg.m30677a(i));
        return null;
    }

    @Nullable
    /* renamed from: b */
    private static TextInformationFrame m33104b(int i, cc1 cc1Var, String str) {
        int m35282h = cc1Var.m35282h();
        if (cc1Var.m35282h() == 1684108385) {
            cc1Var.m35284f(8);
            return new TextInformationFrame(str, null, cc1Var.m35292b(m35282h - 16));
        }
        gq0.m33792d("MetadataUtil", "Failed to parse text attribute: " + AbstractC31125pg.m30677a(i));
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static ApicFrame m33105a(cc1 cc1Var) {
        int m35282h = cc1Var.m35282h();
        if (cc1Var.m35282h() == 1684108385) {
            int m35282h2 = cc1Var.m35282h() & ViewCompat.MEASURED_SIZE_MASK;
            String str = m35282h2 == 13 ? "image/jpeg" : m35282h2 == 14 ? "image/png" : null;
            if (str == null) {
                zo0.m26074a("Unrecognized cover art flags: ", m35282h2, "MetadataUtil");
                return null;
            }
            cc1Var.m35284f(4);
            int i = m35282h - 16;
            byte[] bArr = new byte[i];
            cc1Var.m35294a(bArr, 0, i);
            return new ApicFrame(str, null, 3, bArr);
        }
        gq0.m33792d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[Catch: all -> 0x01b2, TryCatch #0 {all -> 0x01b2, blocks: (B:9:0x002d, B:11:0x0036, B:14:0x0047, B:16:0x004d, B:19:0x0054, B:20:0x005b, B:12:0x0040, B:25:0x0069, B:30:0x0078, B:35:0x0088, B:40:0x0097, B:45:0x00a6, B:50:0x00b3, B:55:0x00c2, B:60:0x00d1, B:65:0x00e0, B:70:0x00ef, B:75:0x00fe, B:80:0x010d, B:85:0x011c, B:90:0x012b, B:95:0x013a, B:101:0x014d, B:103:0x0153, B:105:0x0167, B:108:0x0173, B:111:0x017e, B:116:0x018b, B:171:0x0234, B:121:0x01aa, B:138:0x01d2, B:143:0x01e1, B:148:0x01f0, B:153:0x01ff, B:158:0x020e, B:163:0x021d, B:168:0x022a, B:174:0x024b, B:177:0x0255), top: B:182:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: all -> 0x01b2, TRY_LEAVE, TryCatch #0 {all -> 0x01b2, blocks: (B:9:0x002d, B:11:0x0036, B:14:0x0047, B:16:0x004d, B:19:0x0054, B:20:0x005b, B:12:0x0040, B:25:0x0069, B:30:0x0078, B:35:0x0088, B:40:0x0097, B:45:0x00a6, B:50:0x00b3, B:55:0x00c2, B:60:0x00d1, B:65:0x00e0, B:70:0x00ef, B:75:0x00fe, B:80:0x010d, B:85:0x011c, B:90:0x012b, B:95:0x013a, B:101:0x014d, B:103:0x0153, B:105:0x0167, B:108:0x0173, B:111:0x017e, B:116:0x018b, B:171:0x0234, B:121:0x01aa, B:138:0x01d2, B:143:0x01e1, B:148:0x01f0, B:153:0x01ff, B:158:0x020e, B:163:0x021d, B:168:0x022a, B:174:0x024b, B:177:0x0255), top: B:182:0x001a }] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.monetization.ads.exo.metadata.id3.Id3Frame m33103b(com.yandex.mobile.ads.impl.cc1 r13) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ix0.m33103b(com.yandex.mobile.ads.impl.cc1):com.monetization.ads.exo.metadata.id3.Id3Frame");
    }

    @Nullable
    /* renamed from: a */
    private static TextInformationFrame m33107a(int i, cc1 cc1Var, String str) {
        int m35282h = cc1Var.m35282h();
        if (cc1Var.m35282h() == 1684108385 && m35282h >= 22) {
            cc1Var.m35284f(10);
            int m35264z = cc1Var.m35264z();
            if (m35264z > 0) {
                String m27978a = C31736wd.m27978a("", m35264z);
                int m35264z2 = cc1Var.m35264z();
                if (m35264z2 > 0) {
                    m27978a = m27978a + RemoteSettings.FORWARD_SLASH_STRING + m35264z2;
                }
                return new TextInformationFrame(str, null, m27978a);
            }
        }
        gq0.m33792d("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC31125pg.m30677a(i));
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static Id3Frame m33106a(int i, String str, cc1 cc1Var, boolean z, boolean z2) {
        int i2;
        cc1Var.m35284f(4);
        if (cc1Var.m35282h() == 1684108385) {
            cc1Var.m35284f(8);
            i2 = cc1Var.m35270t();
        } else {
            gq0.m33792d("MetadataUtil", "Failed to parse uint8 attribute value");
            i2 = -1;
        }
        if (z2) {
            i2 = Math.min(1, i2);
        }
        if (i2 >= 0) {
            if (z) {
                return new TextInformationFrame(str, null, Integer.toString(i2));
            }
            return new CommentFrame("und", str, Integer.toString(i2));
        }
        gq0.m33792d("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC31125pg.m30677a(i));
        return null;
    }
}
